package net.trique.mythicupgrades.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.trique.mythicupgrades.effect.MUEffects;

public class MUFoods {
    public static final FoodComponent JADE_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(MUEffects.POISONOUS_THORNS, 4800, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent JADE_POTION = (new FoodComponent.Builder()).hunger(2).saturationModifier(1.0F).
        statusEffect(new StatusEffectInstance(MUEffects.POISONOUS_THORNS, 3600, 1), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3600, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent TOPAZ_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 4800, 0), 1.0F)
                .statusEffect(new StatusEffectInstance(MUEffects.ITEM_MASTERY, 4800, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent TOPAZ_POTION = (new FoodComponent.Builder()).hunger(2).saturationModifier(1.0F).
        statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3600, 0), 1.0F)
                .statusEffect(new StatusEffectInstance(MUEffects.ITEM_MASTERY, 3600, 1), 1.0F)
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3600, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent AQUAMARINE_FISH = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 4800, 0), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 4800, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent AQUAMARINE_POTION = (new FoodComponent.Builder()).hunger(2).saturationModifier(1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 3600, 0), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 3600, 0), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 3600, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent SAPPHIRE_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(MUEffects.DAMAGE_DEFLECTION, 4800, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent SAPPHIRE_POTION = (new FoodComponent.Builder()).hunger(2).saturationModifier(1.0F).
        statusEffect(new StatusEffectInstance(MUEffects.DAMAGE_DEFLECTION, 3600, 2), 1.0F).
        statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent RUBY_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 4800, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent RUBY_POTION = (new FoodComponent.Builder()).hunger(2).saturationModifier(1.0F).
        statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3600, 0), 1.0F).
        statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3600, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent KYANITE_POTION = (new FoodComponent.Builder()).hunger(2).saturationModifier(1.0F).
        statusEffect(new StatusEffectInstance(MUEffects.ICE_SHIELD, 3600, 2), 1.0F).
        statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent AMETRINE_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 4800, 0), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 4800, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent AMETRINE_POTION = (new FoodComponent.Builder()).hunger(2).saturationModifier(1.0F).
        statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600, 1), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600, 1), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600, 0), 1.0F).
        alwaysEdible().build();
}