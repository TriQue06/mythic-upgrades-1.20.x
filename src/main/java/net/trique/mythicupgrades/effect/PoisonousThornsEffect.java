package net.trique.mythicupgrades.effect;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class PoisonousThornsEffect extends MobEffect {
    public PoisonousThornsEffect(MobEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        if (!livingEntity.level().isClientSide()) {
            Entity attacker = livingEntity.getLastHurtByMob();
            if (livingEntity.hurtTime == 9) {
                if (attacker instanceof LivingEntity entity && !attacker.equals(livingEntity) &&
                        !(entity instanceof Player player && (player.isCreative() || player.isSpectator()))) {
                    entity.hurt(livingEntity.level().damageSources().thorns(livingEntity), amplifier);
                    entity.playSound(SoundEvents.SPIDER_HURT, 1.0f, livingEntity.getVoicePitch());
                    entity.addEffect(new MobEffectInstance(MobEffects.POISON,
                            (int) (CONFIG.peridotConfig.poisonous_thorns_poison_duration() * 20), amplifier), livingEntity);
                    entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION,
                            (int) (CONFIG.peridotConfig.poisonous_thorns_nausea_duration() * 20), amplifier), livingEntity);
                }
            }
        }
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int i, int j) {
        return true;
    }
}