package net.trique.mythicupgrades.mixin;


import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.trique.mythicupgrades.item.BaseMythicItem;
import net.trique.mythicupgrades.item.MythicEffectsArmorItem;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.Functions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

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
                removeMainHandInfiniteEffects(lastUsed);
            }
            lastUsed = item;
            Functions.addStatusEffects((LivingEntity) (Object) this, item.getMainHandEffects());
        } else {
            removeMainHandInfiniteEffects(lastUsed);
        }
    }

    @Inject(method = "tick", at = @At(value = "HEAD"))
    public void applyArmorEffects(CallbackInfo ci) {
        ItemStack head = this.getEquippedStack(EquipmentSlot.HEAD);
        if (!head.isEmpty() && head.getItem() instanceof MythicEffectsArmorItem item &&
                Functions.hasCorrectArmorOn((LivingEntity) (Object) this, item.getMaterial())) {
            if (lastWorn != null) {
                removeArmorInfiniteEffects(lastWorn);
            }
            lastWorn = item;
            Functions.addStatusEffects((LivingEntity) (Object) this, item.getEquipmentEffects());
        } else {
            removeArmorInfiniteEffects(lastWorn);
        }

    }

    @Unique
    public void removeMainHandInfiniteEffects(BaseMythicItem item) {
        if (item != null) {
            HashMap<StatusEffect, EffectMeta> effects = item.getMainHandEffects();
            for (StatusEffect effect : effects.keySet()) {
                if (effect != null && this.hasStatusEffect(effect) && this.getActiveStatusEffects().get(effect).isInfinite()) {
                    this.removeStatusEffect(effect);
                }
            }
        }
    }

    @Unique
    public void removeArmorInfiniteEffects(MythicEffectsArmorItem item) {
        if (item != null) {
            for (StatusEffect effect : item.getEquipmentEffects().keySet()) {
                if (effect != null && this.hasStatusEffect(effect) && this.getActiveStatusEffects().get(effect).isInfinite()) {
                    this.removeStatusEffect(effect);
                }
            }
        }
    }
}