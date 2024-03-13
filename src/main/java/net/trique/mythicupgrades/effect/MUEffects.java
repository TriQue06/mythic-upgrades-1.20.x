package net.trique.mythicupgrades.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class MUEffects {
    public static StatusEffect POISONOUS_THORNS = new PoisonousThornsEffect(StatusEffectCategory.BENEFICIAL, 4699647);
    public static StatusEffect FREEZE = new FreezeEffect(StatusEffectCategory.HARMFUL, 0x45c1e0);
    public static StatusEffect DAMAGE_DEFLECTION = new DamageDeflectionEffect(StatusEffectCategory.BENEFICIAL, 4699647);
    public static StatusEffect ITEM_MASTERY = new ItemMasteryEffect(StatusEffectCategory.BENEFICIAL, 16749614);
    public static StatusEffect ICE_SHIELD = new IceShieldEffect(StatusEffectCategory.BENEFICIAL, 4561645);
    public static StatusEffect ARCANE_AURA = new ArcaneAuraEffect(StatusEffectCategory.BENEFICIAL, 11808511);
    public static StatusEffect HINDERING = new HinderingEffect(StatusEffectCategory.BENEFICIAL, 4699647);
}