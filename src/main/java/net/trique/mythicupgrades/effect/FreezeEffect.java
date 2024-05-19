package net.trique.mythicupgrades.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class FreezeEffect extends MobEffect {
    public FreezeEffect(MobEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity livingEntity, int amplifier) {
        if (!livingEntity.level().isClientSide()) {
            double x = livingEntity.getX();
            double y = livingEntity.getY();
            double z = livingEntity.getZ();

            livingEntity.teleportToWithTicket(x, y, z);
            livingEntity.moveTo(x, y, z);
            livingEntity.setDeltaMovement(0, 0, 0);
            livingEntity.setSpeed(0f);
        }
        super.applyEffectTick(livingEntity, amplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}