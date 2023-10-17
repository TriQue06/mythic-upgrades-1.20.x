package net.trique.mythicupgrades.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.trique.mythicupgrades.item.BaseMythicItem;
import net.trique.mythicupgrades.item.MythicEffectsArmorItem;
import net.trique.mythicupgrades.util.CommonFunctions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Unique
    private BaseMythicItem lastUsed;

    @Unique
    private MythicEffectsArmorItem lastWorn;

    @Inject(method = "tick", at = @At(value = "HEAD"))
    public void checkItemInHand(CallbackInfo ci) {
        if (!this.getEquippedStack(EquipmentSlot.MAINHAND).isEmpty() &&
                (this.getEquippedStack(EquipmentSlot.MAINHAND).getItem() instanceof BaseMythicItem item)) {
            if (!Objects.equals(lastUsed, item) || CommonFunctions.checkStatusEffects((LivingEntity) (Object) this,
                    item.getMainHandEffects())) {
                CommonFunctions.addStatusEffects((LivingEntity) (Object) this, item.getMainHandEffects());
            }
            lastUsed = item;
        } else if (lastUsed != null) {
            CommonFunctions.removeMythicInfiniteEffects((LivingEntity) (Object) this, lastUsed.getMainHandEffects());
            lastUsed = null;
        }
    }

    @Inject(method = "tick", at = @At(value = "HEAD"))
    public void applyArmorBuffs(CallbackInfo ci) {
        ItemStack head = this.getEquippedStack(EquipmentSlot.HEAD);
        if (!head.isEmpty() && head.getItem() instanceof MythicEffectsArmorItem item &&
                CommonFunctions.hasCorrectArmorOn((LivingEntity) (Object) this, item.getMaterial())) {
            if (!Objects.equals(lastWorn, item) || CommonFunctions.checkStatusEffects((LivingEntity) (Object) this,
                    item.getEquipmentBuffs())) {
                CommonFunctions.addStatusEffects((LivingEntity) (Object) this, item.getEquipmentBuffs());
            }
            lastWorn = item;
        } else if (lastWorn != null) {
            CommonFunctions.removeMythicInfiniteEffects((LivingEntity) (Object) this, lastWorn.getEquipmentBuffs());
            lastWorn = null;
        }
    }

    @Inject(method = "damage", at = @At(value = "RETURN"))
    public void applyArmorDebuffs(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
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
}