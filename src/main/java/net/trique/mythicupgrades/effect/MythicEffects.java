package net.trique.mythicupgrades.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class MythicEffects {
    public static StatusEffect POISONOUS_THORNS = new PoisonousThornsEffect(StatusEffectCategory.BENEFICIAL, 4699647);
    public static StatusEffect FREEZE = new FreezeEffect(StatusEffectCategory.HARMFUL, 0x45c1e0);
    public static StatusEffect DAMAGE_DEFLECTION = new DamageDeflectionEffect(StatusEffectCategory.BENEFICIAL, 4699647);
}