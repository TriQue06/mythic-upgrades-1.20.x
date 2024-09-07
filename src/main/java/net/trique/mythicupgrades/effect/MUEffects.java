package net.trique.mythicupgrades.effect;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.trique.mythicupgrades.MythicUpgrades;

public class MUEffects {
    public static final Holder<MobEffect> POISONOUS_THORNS;
    public static final Holder<MobEffect> ICE_SHIELD;
    public static final Holder<MobEffect> FREEZE;
    public static final Holder<MobEffect> DAMAGE_DEFLECTION;
    public static final Holder<MobEffect> ITEM_MASTERY;
    public static final Holder<MobEffect> ARCANE_AURA;
    public static final Holder<MobEffect> BOUNCER;
    public static final Holder<MobEffect> SPELUNKER;

    private static Holder<MobEffect> registerEffect(String name, MobEffect effect) {
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, ResourceLocation.fromNamespaceAndPath(MythicUpgrades.MOD_ID, name), effect);
    }

    public static void registerEffects() {
        MythicUpgrades.LOGGER.info("Registering Effects...");
    }

    static {
        POISONOUS_THORNS = registerEffect("poisonous_thorns", new PoisonousThornsEffect(MobEffectCategory.BENEFICIAL, 11524864));
        ICE_SHIELD = registerEffect("ice_shield", new IceShieldEffect(MobEffectCategory.BENEFICIAL, 52218));
        FREEZE = registerEffect("freeze", new FreezeEffect(MobEffectCategory.HARMFUL, 52218));
        DAMAGE_DEFLECTION = registerEffect("damage_deflection", new DamageDeflectionEffect(MobEffectCategory.BENEFICIAL, 18170));
        ITEM_MASTERY = registerEffect("item_mastery", new ItemMasteryEffect(MobEffectCategory.BENEFICIAL, 16747551));
        ARCANE_AURA = registerEffect("arcane_aura", new ArcaneAuraEffect(MobEffectCategory.BENEFICIAL, 12525567));
        BOUNCER = registerEffect("bouncer", new BouncerEffect(MobEffectCategory.BENEFICIAL, 3652380));
        SPELUNKER = registerEffect("spelunker", new SpelunkerEffect(MobEffectCategory.BENEFICIAL, 6317));
    }
}