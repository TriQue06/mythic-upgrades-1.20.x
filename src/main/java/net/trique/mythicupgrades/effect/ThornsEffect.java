package net.trique.mythicupgrades.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ThornsEffect extends StatusEffect {
    public ThornsEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.getWorld().isClient()) {
            Entity attacker = pLivingEntity.getAttacker();
            if (pLivingEntity.hurtTime == 9) {
                if (attacker != null){
                    attacker.damage(pLivingEntity.getWorld().getDamageSources().thorns(pLivingEntity), pAmplifier);
                }
            }
        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}
