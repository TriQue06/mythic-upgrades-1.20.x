package net.trique.mythicupgrades.mixin;


import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.trique.mythicupgrades.item.BaseMythicItem;
import net.trique.mythicupgrades.util.EffectMeta;
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


    @Shadow public abstract boolean addStatusEffect(StatusEffectInstance effect);

    @Shadow public abstract boolean removeStatusEffect(StatusEffect type);

    @Shadow public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Shadow public abstract Map<StatusEffect, StatusEffectInstance> getActiveStatusEffects();

    @Unique
    private BaseMythicItem lastUsed;

    @Inject(method = "tick", at = @At(value = "HEAD"))
    public void checkItemInHand(CallbackInfo ci) {
        if (!this.getEquippedStack(EquipmentSlot.MAINHAND).isEmpty() &&
                (this.getEquippedStack(EquipmentSlot.MAINHAND).getItem() instanceof BaseMythicItem item)) {
            if (lastUsed != null) {
                removeInfiniteEffects(lastUsed);
            }
            HashMap<StatusEffect, EffectMeta> effects = item.getForSelf();
            lastUsed = item;
            for (StatusEffect effect : effects.keySet()) {
                if (effect != null && !effect.isInstant()) {
                    EffectMeta meta = effects.get(effect);
                    int duration = meta.getDuration();
                    int amplifier = meta.getAmplifier();
                    boolean ambient = meta.isAmbient();
                    boolean showIcon = meta.shouldShowIcon();
                    boolean showParticles = meta.shouldShowParticles();
                    this.addStatusEffect(new StatusEffectInstance(effect, duration, amplifier, ambient, showParticles, showIcon));
                }
            }
        } else {
            removeInfiniteEffects(lastUsed);
        }
    }

    @Unique
    public void removeInfiniteEffects(BaseMythicItem item) {
        if (item != null) {
            HashMap<StatusEffect, EffectMeta> effects = item.getForSelf();
            for (StatusEffect effect : effects.keySet()) {
                if (effect != null && this.hasStatusEffect(effect) && this.getActiveStatusEffects().get(effect).isInfinite()) {
                    this.removeStatusEffect(effect);
                }
            }
        }
    }
}
