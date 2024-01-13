package net.trique.mythicupgrades.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.trique.mythicupgrades.effect.MUEffects;

public class MUFoods {
    public static final FoodComponent JADE_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(MUEffects.POISONOUS_THORNS, 3600, 1), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3600, 1), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent TOPAZ_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3600, 0), 1.0F)
                .statusEffect(new StatusEffectInstance(MUEffects.ITEM_MASTERY, 3600, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent AQUAMARINE_FISH = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 3600, 0), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 3600, 1), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent SAPPHIRE_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(MUEffects.DAMAGE_DEFLECTION, 3600, 1), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent RUBY_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3600, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent AMETRINE_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
        statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600, 1), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600, 1), 1.0F).
        alwaysEdible().build();
}