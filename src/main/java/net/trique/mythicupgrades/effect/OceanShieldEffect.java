package net.trique.mythicupgrades.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundEvents;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;

public class OceanShieldEffect extends StatusEffect {
    public OceanShieldEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity livingEntity, int amplifier) {
        if (!livingEntity.getWorld().isClient()) {
            Entity attacker = livingEntity.getAttacker();
            if (livingEntity.hurtTime == 9) {
                if (attacker instanceof LivingEntity entity && !attacker.equals(livingEntity)) {
                    entity.damage(livingEntity.getWorld().getDamageSources().thorns(livingEntity), amplifier);
                    entity.playSound(SoundEvents.ENTITY_ELDER_GUARDIAN_HURT, 1.0f, livingEntity.getSoundPitch());
                    entity.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE,
                            (int)(CONFIG.aquamarineConfig.ocean_shield_duration() * 20), amplifier), livingEntity);
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