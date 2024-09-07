package net.trique.mythicupgrades.item.potion;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.trique.mythicupgrades.effect.MUEffects;

public class MUPotions {
    public static final FoodProperties AQUAMARINE_POTION = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.4F).
            effect(new MobEffectInstance(MUEffects.ICE_SHIELD, 3600, 0), 1.0F).
            alwaysEdible().build();


    public static final FoodProperties PERIDOT_POTION = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.4F).
            effect(new MobEffectInstance(MUEffects.POISONOUS_THORNS, 3600, 0), 1.0F).
            alwaysEdible().build();


    public static final FoodProperties RUBY_POTION = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.4F).
            effect(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0), 1.0F).
            effect(new MobEffectInstance(MUEffects.SPELUNKER, 3600, 2), 1.0F).
            alwaysEdible().build();

    public static final FoodProperties SAPPHIRE_POTION = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.4F).
            effect(new MobEffectInstance(MUEffects.DAMAGE_DEFLECTION, 3600, 2), 1.0F).
            effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 0), 1.0F).
            alwaysEdible().build();

    public static final FoodProperties TOPAZ_POTION = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.4F).
            effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), 1.0F).
            effect(new MobEffectInstance(MUEffects.ITEM_MASTERY, 3600, 2), 1.0F).
            alwaysEdible().build();

    public static final FoodProperties AMETRINE_POTION = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.4F).
            effect(new MobEffectInstance(MUEffects.ARCANE_AURA, 3600, 2), 1.0F).
            alwaysEdible().build();

    public static final FoodProperties JADE_POTION = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.4F).
            effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1), 1.0F).
            effect(new MobEffectInstance(MobEffects.JUMP, 3600, 1), 1.0F).
            alwaysEdible().build();
}