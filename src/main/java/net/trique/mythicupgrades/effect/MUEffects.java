package net.trique.mythicupgrades.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class MUEffects {
    public static StatusEffect OCEAN_SHIELD = new OceanShieldEffect(StatusEffectCategory.BENEFICIAL, 6317);
    public static StatusEffect HINDERING = new HinderingEffect(StatusEffectCategory.BENEFICIAL, 16164608    );
    public static StatusEffect POISONOUS_THORNS = new PoisonousThornsEffect(StatusEffectCategory.BENEFICIAL, 11524864);
    public static StatusEffect ICE_SHIELD = new IceShieldEffect(StatusEffectCategory.BENEFICIAL, 52218);
    public static StatusEffect FREEZE = new FreezeEffect(StatusEffectCategory.HARMFUL, 52218);
    public static StatusEffect DAMAGE_DEFLECTION = new DamageDeflectionEffect(StatusEffectCategory.BENEFICIAL, 18170);
    public static StatusEffect ITEM_MASTERY = new ItemMasteryEffect(StatusEffectCategory.BENEFICIAL, 16747551);
    public static StatusEffect ARCANE_AURA = new ArcaneAuraEffect(StatusEffectCategory.BENEFICIAL, 12525567);
}