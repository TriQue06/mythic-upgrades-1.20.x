package net.trique.mythicupgrades.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.trique.mythicupgrades.MythicUpgrades;
import java.util.function.Supplier;

import static net.trique.mythicupgrades.item.MUItems.*;

public enum MUArmorMaterials implements ArmorMaterial {
    AQUAMARINE("aquamarine", 50, new int[] { 3, 8, 6, 3 }, 18,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(AQUAMARINE_INGOT)),
    CITRINE("citrine", 50, new int[] { 3, 8, 6, 3 }, 18,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(CITRINE_INGOT)),
    PERIDOT("peridot", 50, new int[] { 3, 8, 6, 3 }, 18,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(PERIDOT_INGOT)),
    ZIRCON("zircon", 50, new int[] { 3, 8, 6, 3 }, 18,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> Ingredient.of(ZIRCON_INGOT)),
    SAPPHIRE("sapphire", 50, new int[] { 3, 8, 6, 3 }, 18,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(SAPPHIRE_INGOT)),
    TOPAZ("topaz", 150, new int[] { 4, 9, 7, 4 }, 18,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(TOPAZ_INGOT)),
    AMETRINE("ametrine", 50, new int[] { 3, 8, 6, 3 }, 18,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(AMETRINE_INGOT)),
    JADE("jade", 50, new int[] { 3, 8, 6, 3 }, 18,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(JADE_INGOT));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    MUArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                     float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MythicUpgrades.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}