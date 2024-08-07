package net.trique.mythicupgrades.item.potion;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.effect.MUEffects;

public class MUPotions {
    public static final Holder<Potion> BASE;

    public static final Holder<Potion> AQUAMARINE;

    public static final Holder<Potion> PERIDOT;


    public static final Holder<Potion> RUBY;

    public static final Holder<Potion> SAPPHIRE;

    public static final Holder<Potion> TOPAZ;

    public static final Holder<Potion> AMETRINE;

    public static final Holder<Potion> JADE;



    public static void bootstrap() {
        MythicUpgrades.LOGGER.info("Registering potions...");
    }


    protected static Holder<Potion> registerMythicPotion(String identifier, MobEffectInstance... mobEffectInstances) {
        return Registry.registerForHolder(BuiltInRegistries.POTION, ResourceLocation.fromNamespaceAndPath(MythicUpgrades.MOD_ID, identifier),
                new Potion(mobEffectInstances));
    }

    static {
        BASE = registerMythicPotion("base");
        AMETRINE = registerMythicPotion("ametrine", new MobEffectInstance(MUEffects.ARCANE_AURA, 3600, 2));
        AQUAMARINE = registerMythicPotion("aquamarine", new MobEffectInstance(MUEffects.ICE_SHIELD, 3600, 1));
        JADE = registerMythicPotion("jade", new MobEffectInstance(MobEffects.JUMP, 3600, 2),
                new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 2));
        PERIDOT = registerMythicPotion("peridot", new MobEffectInstance(MUEffects.POISONOUS_THORNS, 3600));
        RUBY = registerMythicPotion("ruby", new MobEffectInstance(MobEffects.DIG_SPEED, 3600));
        SAPPHIRE = registerMythicPotion("sapphire", new MobEffectInstance(MUEffects.DAMAGE_DEFLECTION, 3600, 2),
                new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600));
        TOPAZ = registerMythicPotion("topaz", new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600),
                new MobEffectInstance(MUEffects.ITEM_MASTERY, 3600, 4));
    }
}
