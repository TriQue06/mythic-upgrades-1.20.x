package net.trique.mythicupgrades.mixin;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.trique.mythicupgrades.item.BaseMythicItem;
import net.trique.mythicupgrades.item.MythicEffectsArmorItem;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.CommonFunctions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.HashMap;
import java.util.Map;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow
    public abstract boolean hasStatusEffect(StatusEffect effect);

    @Shadow
    public abstract boolean removeStatusEffect(StatusEffect type);

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Shadow
    public abstract Map<StatusEffect, StatusEffectInstance> getActiveStatusEffects();
    @Unique
    private BaseMythicItem lastUsed;

    @Unique
    private MythicEffectsArmorItem lastWorn;

    @Inject(method = "tick", at = @At(value = "HEAD"))
    public void checkItemInHand(CallbackInfo ci) {
        if (!this.getEquippedStack(EquipmentSlot.MAINHAND).isEmpty() &&
                (this.getEquippedStack(EquipmentSlot.MAINHAND).getItem() instanceof BaseMythicItem item)) {
            if (lastUsed != null) {
                removeMythicInfiniteEffects(lastUsed.getMainHandEffects());
            }
            lastUsed = item;
            CommonFunctions.addStatusEffects((LivingEntity) (Object) this, item.getMainHandEffects());
        } else if (lastUsed != null) {
            removeMythicInfiniteEffects(lastUsed.getMainHandEffects());
        }
    }

    @Inject(method = "tick", at = @At(value = "HEAD"))
    public void applyArmorBuffs(CallbackInfo ci) {
        ItemStack head = this.getEquippedStack(EquipmentSlot.HEAD);
        if (!head.isEmpty() && head.getItem() instanceof MythicEffectsArmorItem item &&
                CommonFunctions.hasCorrectArmorOn((LivingEntity) (Object) this, item.getMaterial())) {
            if (lastWorn != null) {
                removeMythicInfiniteEffects(lastWorn.getEquipmentBuffs());
            }
            lastWorn = item;
            CommonFunctions.addStatusEffects((LivingEntity) (Object) this, item.getEquipmentBuffs());
        } else if (lastWorn != null) {
            removeMythicInfiniteEffects(lastWorn.getEquipmentBuffs());
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
                    CommonFunctions.addStatusEffects(entity, item.getEquipmentDebuffs(), entity);
                }
            }
        }
    }

    @Unique
    public void removeMythicInfiniteEffects(HashMap<StatusEffect, EffectMeta> effects) {
        for (StatusEffect effect : effects.keySet()) {
            if (effect != null && this.hasStatusEffect(effect) && this.getActiveStatusEffects().get(effect).isInfinite()) {
                this.removeStatusEffect(effect);
            }
        }
    }
}