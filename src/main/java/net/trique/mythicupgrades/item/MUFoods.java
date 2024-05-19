package net.trique.mythicupgrades.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.trique.mythicupgrades.effect.MUEffects;

public class MUFoods {
    public static final FoodProperties AQUAMARINE_POTION = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).
            effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0), 1.0F).
            effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 0), 1.0F).
            effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0), 0.5F).
            alwaysEat().build();

    public static final FoodProperties CITRINE_POTION = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).
            effect(new MobEffectInstance(MUEffects.HINDERING, 3600, 0), 1.0F).
            alwaysEat().build();

    public static final FoodProperties PERIDOT_POTION = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).
            effect(new MobEffectInstance(MUEffects.POISONOUS_THORNS, 3600, 0), 1.0F).
        alwaysEat().build();

    public static final FoodProperties ZIRCON_POTION = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).
            effect(new MobEffectInstance(MUEffects.ICE_SHIELD, 3600, 2), 1.0F).
            alwaysEat().build();

    public static final FoodProperties RUBY_POTION = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).
            effect(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0), 1.0F).
            alwaysEat().build();

    public static final FoodProperties SAPPHIRE_POTION = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).
            effect(new MobEffectInstance(MUEffects.DAMAGE_DEFLECTION, 3600, 2), 1.0F).
            effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 0), 0.5F).
            alwaysEat().build();

    public static final FoodProperties TOPAZ_POTION = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).
            effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), 1.0F).
            effect(new MobEffectInstance(MUEffects.ITEM_MASTERY, 3600, 4), 1.0F).
        alwaysEat().build();

    public static final FoodProperties AMETRINE_POTION = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).
            effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 2), 1.0F).
            effect(new MobEffectInstance(MobEffects.JUMP, 3600, 2), 1.0F).
            effect(new MobEffectInstance(MUEffects.ARCANE_AURA, 3600, 2), 1.0F).
        alwaysEat().build();

    public static final FoodProperties JADE_POTION = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).
            effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 2), 1.0F).
            effect(new MobEffectInstance(MobEffects.JUMP, 3600, 2), 1.0F).
        alwaysEat().build();
}