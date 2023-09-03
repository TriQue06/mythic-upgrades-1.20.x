package net.trique.mythicupgrades.item;

import java.util.EnumMap;
import java.util.function.Supplier;

import net.minecraft.item.*;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;

public enum MythicArmorMaterials implements StringIdentifiable, ArmorMaterial {

    SAPPHIRE("sapphire", 40, (EnumMap)Util.make(new EnumMap(Type.class), (map) -> {
        map.put(Type.BOOTS, 3);
        map.put(Type.LEGGINGS, 6);
        map.put(Type.CHESTPLATE, 8);
        map.put(Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{MythicItems.SAPPHIRE_INGOT});
    }),
    JADE("jade", 40, (EnumMap)Util.make(new EnumMap(Type.class), (map) -> {
        map.put(Type.BOOTS, 4);
        map.put(Type.LEGGINGS, 7);
        map.put(Type.CHESTPLATE, 9);
        map.put(Type.HELMET, 4);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{MythicItems.JADE_INGOT});
    }),
    TOPAZ("topaz", 120, (EnumMap)Util.make(new EnumMap(Type.class), (map) -> {
        map.put(Type.BOOTS, 3);
        map.put(Type.LEGGINGS, 6);
        map.put(Type.CHESTPLATE, 8);
        map.put(Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{MythicItems.TOPAZ_INGOT});
    }),
    AMETRINE("ametrine", 40, (EnumMap)Util.make(new EnumMap(Type.class), (map) -> {
        map.put(Type.BOOTS, 3);
        map.put(Type.LEGGINGS, 6);
        map.put(Type.CHESTPLATE, 8);
        map.put(Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{MythicItems.AMETRINE_INGOT});
    });

    public static final Codec<ArmorMaterials> CODEC = StringIdentifiable.createCodec(ArmorMaterials::values);
    private static final EnumMap<Type, Integer> BASE_DURABILITY = (EnumMap)Util.make(new EnumMap(Type.class), (map) -> {
        map.put(Type.BOOTS, 13);
        map.put(Type.LEGGINGS, 15);
        map.put(Type.CHESTPLATE, 16);
        map.put(Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<Type, Integer> protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private MythicArmorMaterials(String name, int durabilityMultiplier, EnumMap protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(Type type) {
        return (Integer)BASE_DURABILITY.get(type) * this.durabilityMultiplier;
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
        return (Ingredient)this.repairIngredientSupplier.get();
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
