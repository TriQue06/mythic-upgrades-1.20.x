package net.trique.mythicupgrades.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundEvents;

public class PoisonousThornsEffect extends StatusEffect {
    public PoisonousThornsEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity livingEntity, int amplifier) {
        if (!livingEntity.getWorld().isClient()) {
            Entity attacker = livingEntity.getAttacker();
            if (livingEntity.hurtTime == 9) {
                if (attacker instanceof LivingEntity entity && !attacker.equals(livingEntity)) {
                    entity.damage(livingEntity.getWorld().getDamageSources().thorns(livingEntity), 1 + amplifier);
                    entity.playSound(SoundEvents.ENCHANT_THORNS_HIT, 1.0f, livingEntity.getSoundPitch());
                    entity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 80, 1 + amplifier), livingEntity);
                }
            }
        }

        super.applyUpdateEffect(livingEntity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
