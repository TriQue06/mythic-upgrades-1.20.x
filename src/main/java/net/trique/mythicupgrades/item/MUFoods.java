package net.trique.mythicupgrades.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class MUFoods {
    public static final FoodComponent JADE_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 300, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent TOPAZ_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 300, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent AQUAMARINE_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 300, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent SAPPHIRE_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 300, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent RUBY_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 300, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent AMETRINE_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 300, 0), 1.0F).
        alwaysEdible().build();
}