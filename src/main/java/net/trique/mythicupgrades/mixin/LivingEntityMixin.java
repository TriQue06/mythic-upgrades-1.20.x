package net.trique.mythicupgrades.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.trique.mythicupgrades.MythicUpgradeDamageTypes;
import net.trique.mythicupgrades.effect.MUEffects;
import net.trique.mythicupgrades.item.BaseMythicItem;
import net.trique.mythicupgrades.item.MythicEffectsArmorItem;
import net.trique.mythicupgrades.util.CommonFunctions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;
import java.util.Objects;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Shadow
    public abstract Map<StatusEffect, StatusEffectInstance> getActiveStatusEffects();

    @Unique
    private boolean hasDamageBeenDeflected = false;

    @Unique
    private BaseMythicItem lastUsed;

    @Unique
    private MythicEffectsArmorItem lastWorn;

    @Inject(method = "tick", at = @At(value = "HEAD"))
    private void checkItemInHand(CallbackInfo ci) {
        if (!this.getEquippedStack(EquipmentSlot.MAINHAND).isEmpty() &&
                (this.getEquippedStack(EquipmentSlot.MAINHAND).getItem() instanceof BaseMythicItem item)) {
            if (lastUsed != null && !item.equals(lastUsed)) {
                CommonFunctions.removeMythicInfiniteEffects((LivingEntity) (Object)this, lastUsed.getMainHandEffects());
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
    private void applyArmorBuffs(CallbackInfo ci) {
        ItemStack head = this.getEquippedStack(EquipmentSlot.HEAD);
        if (!head.isEmpty() && head.getItem() instanceof MythicEffectsArmorItem item) {
            if (lastWorn != null && !CommonFunctions.hasCorrectArmorOn((LivingEntity) (Object) this, item.getMaterial())) {
                CommonFunctions.removeMythicInfiniteEffects((LivingEntity)(Object) this, lastWorn.getEquipmentBuffs());
            }
            if (CommonFunctions.hasCorrectArmorOn((LivingEntity)(Object) this, item.getMaterial()) &&
                    CommonFunctions.checkStatusEffects((LivingEntity) (Object) this, item.getEquipmentBuffs())) {
                CommonFunctions.addStatusEffects((LivingEntity) (Object) this, item.getEquipmentBuffs());
            }
            lastWorn = item;
        } else if (lastWorn != null) {
            CommonFunctions.removeMythicInfiniteEffects((LivingEntity) (Object) this, lastWorn.getEquipmentBuffs());
            lastWorn = null;
        }
    }

    @Inject(method = "damage", at = @At(value = "RETURN"))
    private void applyArmorDebuffs(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        boolean was_damaged = cir.getReturnValue();
        if (was_damaged) {
            Entity attacker = source.getAttacker();
            if (attacker instanceof LivingEntity entity) {
                ItemStack head = this.getEquippedStack(EquipmentSlot.HEAD);
                if (!head.isEmpty() && head.getItem() instanceof MythicEffectsArmorItem item &&
                        CommonFunctions.hasCorrectArmorOn((LivingEntity) (Object) this, item.getMaterial())) {
                    CommonFunctions.addStatusEffects(entity, item.getEquipmentDebuffs(), (LivingEntity) (Object) this);
                }
            }
        }
    }

    @ModifyVariable(method = "damage", at = @At(value = "HEAD"), argsOnly = true)
    private float applyDeflectingEffect(float amount, DamageSource source, float am1) {
        if (!((LivingEntity)(Object)this).getWorld().isClient()) {
            StatusEffectInstance deflection = this.getActiveStatusEffects().get(MUEffects.DAMAGE_DEFLECTION);
            if (deflection != null) {
                Entity attacker = source.getAttacker();
                float defl_dmg_coef = deflection.getAmplifier() / 10f;
                boolean melee = (Objects.equals(source.getSource(), attacker)) && (attacker != null);
                melee &= !source.isOf(DamageTypes.DRAGON_BREATH);
                melee &= !source.isOf(DamageTypes.SONIC_BOOM);
                if (melee) {
                    boolean check_damage_type = source.isOf(MythicUpgradeDamageTypes.DEFLECTING_DAMAGE_TYPE) || source.isOf(DamageTypes.THORNS);
                    if (!check_damage_type || !hasDamageBeenDeflected) {
                        attacker.damage(MythicUpgradeDamageTypes.create(attacker.getWorld(),
                                MythicUpgradeDamageTypes.DEFLECTING_DAMAGE_TYPE, (LivingEntity)(Object)this), (0.1f + defl_dmg_coef) * amount);
                        hasDamageBeenDeflected = check_damage_type;
                    } else  {
                        hasDamageBeenDeflected = false;
                    }
                }
                amount *= (0.9f - defl_dmg_coef);
            }
            return amount;
        }
        return 0f;
    }
}