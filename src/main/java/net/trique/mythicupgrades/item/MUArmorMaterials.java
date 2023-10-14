package net.trique.mythicupgrades.item;

import java.util.EnumMap;

import net.minecraft.item.*;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;
import net.trique.mythicupgrades.registry.RegisterMythicItems;

public enum MUArmorMaterials implements StringIdentifiable, ArmorMaterial {

    SAPPHIRE("sapphire", 40, Util.make(new EnumMap(Type.class), (map) -> {
        map.put(Type.BOOTS, 3);
        map.put(Type.LEGGINGS, 6);
        map.put(Type.CHESTPLATE, 8);
        map.put(Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, Ingredient.ofItems(RegisterMythicItems.SAPPHIRE_INGOT)),
    JADE("jade", 40, Util.make(new EnumMap(Type.class), (map) -> {
        map.put(Type.BOOTS, 3);
        map.put(Type.LEGGINGS, 6);
        map.put(Type.CHESTPLATE, 8);
        map.put(Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, Ingredient.ofItems(RegisterMythicItems.JADE_INGOT)),
    TOPAZ("topaz", 120, Util.make(new EnumMap(Type.class), (map) -> {
        map.put(Type.BOOTS, 4);
        map.put(Type.LEGGINGS, 7);
        map.put(Type.CHESTPLATE, 9);
        map.put(Type.HELMET, 5);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0F, 0.1F, Ingredient.ofItems(RegisterMythicItems.TOPAZ_INGOT)),
    AMETRINE("ametrine", 40, Util.make(new EnumMap(Type.class), (map) -> {
        map.put(Type.BOOTS, 3);
        map.put(Type.LEGGINGS, 6);
        map.put(Type.CHESTPLATE, 8);
        map.put(Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, Ingredient.ofItems(RegisterMythicItems.AMETRINE_INGOT));

    private static final EnumMap<Type, Integer> BASE_DURABILITY = (EnumMap)Util.make(new EnumMap(Type.class), (map) -> {
        map.put(Type.BOOTS, 13);
        map.put(Type.LEGGINGS, 15);
        map.put(Type.CHESTPLATE, 16);
        map.put(Type.HELMET, 11);
    });

    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Ingredient repairIngredientSupplier;

    MUArmorMaterials(String name, int durabilityMultiplier, EnumMap protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Ingredient repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = repairIngredientSupplier;
    }

    public int getDurability(Type type) {
        return BASE_DURABILITY.get(type) * this.durabilityMultiplier;
    }

    public int getProtection(Type type) {
        return (Integer)this.protectionAmounts.get(type);
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier;
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String asString() {
        return this.name;
    }
}