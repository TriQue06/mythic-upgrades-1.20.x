package net.trique.mythicupgrades.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class MUEffects {
    public static MobEffect OCEAN_SHIELD = new OceanShieldEffect(MobEffectCategory.BENEFICIAL, 6317);
    public static MobEffect HINDERING = new HinderingEffect(MobEffectCategory.BENEFICIAL, 16164608    );
    public static MobEffect POISONOUS_THORNS = new PoisonousThornsEffect(MobEffectCategory.BENEFICIAL, 11524864);
    public static MobEffect ICE_SHIELD = new IceShieldEffect(MobEffectCategory.BENEFICIAL, 52218);
    public static MobEffect FREEZE = new FreezeEffect(MobEffectCategory.HARMFUL, 52218);
    public static MobEffect DAMAGE_DEFLECTION = new DamageDeflectionEffect(MobEffectCategory.BENEFICIAL, 18170);
    public static MobEffect ITEM_MASTERY = new ItemMasteryEffect(MobEffectCategory.BENEFICIAL, 16747551);
    public static MobEffect ARCANE_AURA = new ArcaneAuraEffect(MobEffectCategory.BENEFICIAL, 12525567);
}