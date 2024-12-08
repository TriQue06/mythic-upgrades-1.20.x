package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.player.Player;
import net.trique.mythicupgrades.MythicUpgradesDamageTypes;
import net.trique.mythicupgrades.effect.MUEffects;
import net.trique.mythicupgrades.item.base.BaseMythicItem;
import net.trique.mythicupgrades.item.mythic_impl.common.MythicEffectsArmorItem;
import net.trique.mythicupgrades.util.CommonFunctions;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {

    public LivingEntityMixin(EntityType<?> type, Level world) {
        super(type, world);
        deflecting_damage = 0f;
        lastWorn = null;
        has_damage_been_deflected = false;
    }

    @Shadow
    public abstract ItemStack getItemBySlot(EquipmentSlot slot);

    @Shadow @Nullable public abstract MobEffectInstance getEffect(Holder<MobEffect> holder);

    @Unique private boolean has_damage_been_deflected;

    @Unique private float deflecting_damage;

    @Unique
    private BaseMythicItem lastUsed;

    @Unique
    private MythicEffectsArmorItem lastWorn;

    @Inject(method = "tick", at = @At(value = "HEAD"))
    private void checkItemInHand(CallbackInfo ci) {
        if (!this.getItemBySlot(EquipmentSlot.MAINHAND).isEmpty() &&
                (this.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof BaseMythicItem item)) {
            if (lastUsed != null && !item.equals(lastUsed)) {
                CommonFunctions.removeMythicInfiniteEffects((LivingEntity) (Object) this, lastUsed.getMainHandEffects());
            }
            if (CommonFunctions.checkStatusEffects((LivingEntity) (Object) this, item.getMainHandEffects())) {
                CommonFunctions.addStatusEffects((LivingEntity) (Object) this, item.getMainHandEffects());
            }
            lastUsed = item;
        } else if (lastUsed != null) {
            CommonFunctions.removeMythicInfiniteEffects((LivingEntity) (Object) this, lastUsed.getMainHandEffects());
            lastUsed = null;
        }
    }

    @Inject(method = "tick", at = @At(value = "HEAD"))
    private void applyArmorEffectsForSelf(CallbackInfo ci) {
        ItemStack head = this.getItemBySlot(EquipmentSlot.HEAD);
        if (!head.isEmpty() && head.getItem() instanceof MythicEffectsArmorItem item) {
            if (lastWorn != null && !CommonFunctions.hasCorrectArmorOn((LivingEntity) (Object) this, item.getMaterial().value())) {
                CommonFunctions.removeMythicInfiniteEffects((LivingEntity) (Object) this, lastWorn.getEquipmentEffectsForSelf());
            }
            if (CommonFunctions.hasCorrectArmorOn((LivingEntity) (Object) this, item.getMaterial().value()) &&
                    CommonFunctions.checkStatusEffects((LivingEntity) (Object) this, item.getEquipmentEffectsForSelf())) {
                CommonFunctions.addStatusEffects((LivingEntity) (Object) this, item.getEquipmentEffectsForSelf());
            }
            lastWorn = item;
        } else if (lastWorn != null) {
            CommonFunctions.removeMythicInfiniteEffects((LivingEntity) (Object) this, lastWorn.getEquipmentEffectsForSelf());
            lastWorn = null;
        }
    }

    @Inject(method = "hurt", at = @At(value = "RETURN"))
    private void applyArmorEffectsForEnemy(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        boolean was_damaged = cir.getReturnValue();
        if (was_damaged) {
            Entity attacker = source.getEntity();
            if (attacker instanceof LivingEntity entity) {
                ItemStack head = this.getItemBySlot(EquipmentSlot.HEAD);
                if (!head.isEmpty() && head.getItem() instanceof MythicEffectsArmorItem item &&
                        CommonFunctions.hasCorrectArmorOn((LivingEntity) (Object) this, item.getMaterial().value())) {
                    CommonFunctions.addStatusEffects(entity, item.getEquipmentEffectsForEnemies(), (LivingEntity) (Object) this);
                }
            }
        }
    }

    @WrapMethod(method = "hurt")
    private boolean reduceIncomingDamage(DamageSource source, float amount, Operation<Boolean> original) {
        if (!this.level().isClientSide()) {
            MobEffectInstance deflection = this.getEffect(MUEffects.DAMAGE_DEFLECTION);
            if (deflection != null) {
                Entity attacker = source.getEntity();
                float defl_dmg_coef = deflection.getAmplifier() / 10f;
                if (attacker != null) {
                    deflecting_damage = (0.1f + defl_dmg_coef) * amount;
                    amount *= (0.9f - defl_dmg_coef);
                }
            }
        }
        return original.call(source, amount);
    }

    @Inject(method = "hurt", at = @At(value = "TAIL"))
    private void deflectDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        if (!this.level().isClientSide() && cir.getReturnValue()) {
            MobEffectInstance deflection = this.getEffect(MUEffects.DAMAGE_DEFLECTION);
            if (deflection != null) {
                Entity attacker = source.getEntity();
                if (attacker instanceof LivingEntity enemy &&
                        !(enemy instanceof Player player && (player.isCreative() || player.isSpectator()))) {
                    if (enemy.distanceToSqr(this) <= 9.0f && !has_damage_been_deflected) {
                        DamageSource deflecting_source = MythicUpgradesDamageTypes.deflecting_damage(this);
                        has_damage_been_deflected = true;
                        enemy.hurt(deflecting_source, deflecting_damage);
                    }
                }

            }
        }
        has_damage_been_deflected = false;
    }
}