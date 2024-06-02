package net.trique.mythicupgrades.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.trique.mythicupgrades.effect.MUEffects;

public class MUFoods {
    public static final FoodComponent AQUAMARINE_POTION = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).
            statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 3600, 0), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 3600, 0), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3600, 0), 0.5F).
            alwaysEdible().build();

    public static final FoodComponent CITRINE_POTION = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).
            statusEffect(new StatusEffectInstance(MUEffects.HINDERING, 3600, 0), 1.0F).
            alwaysEdible().build();

    public static final FoodComponent PERIDOT_POTION = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).
            statusEffect(new StatusEffectInstance(MUEffects.POISONOUS_THORNS, 3600, 0), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent ZIRCON_POTION = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).
            statusEffect(new StatusEffectInstance(MUEffects.ICE_SHIELD, 3600, 2), 1.0F).
            alwaysEdible().build();

    public static final FoodComponent RUBY_POTION = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).
            statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3600, 0), 1.0F).
            alwaysEdible().build();

    public static final FoodComponent SAPPHIRE_POTION = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).
            statusEffect(new StatusEffectInstance(MUEffects.DAMAGE_DEFLECTION, 3600, 2), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 0), 0.5F).
            alwaysEdible().build();

    public static final FoodComponent TOPAZ_POTION = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).
            statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3600, 0), 1.0F).
            statusEffect(new StatusEffectInstance(MUEffects.ITEM_MASTERY, 3600, 4), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent AMETRINE_POTION = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600, 2), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600, 2), 1.0F).
            statusEffect(new StatusEffectInstance(MUEffects.ARCANE_AURA, 3600, 2), 1.0F).
        alwaysEdible().build();

    public static final FoodComponent JADE_POTION = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.4F).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600, 2), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600, 2), 1.0F).
        alwaysEdible().build();
}