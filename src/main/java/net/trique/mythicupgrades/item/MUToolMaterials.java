package net.trique.mythicupgrades.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import static net.trique.mythicupgrades.item.MUItems.*;

public enum MUToolMaterials implements Tier {
    CITRINE(4, 2923, 10.0f, 5.0f, 18, Ingredient.of(CITRINE_INGOT)),
    PERIDOT(4, 2923, 10.0f, 5.0f, 18, Ingredient.of(PERIDOT_INGOT)),
    ZIRCON(4, 2923, 10.0f, 5.0f, 18, Ingredient.of(ZIRCON_INGOT)),
    RUBY(4, 2923, 13.0f, 5.0f, 18, Ingredient.of(RUBY_INGOT)),
    SAPPHIRE(4, 2923, 10.0f, 5.0f, 18, Ingredient.of(SAPPHIRE_INGOT)),
    TOPAZ(4, 8769, 11.0f, 6.0f, 18, Ingredient.of(TOPAZ_INGOT)),
    AMETRINE(4, 2923, 10.0f, 5.0f, 18, Ingredient.of(AMETRINE_INGOT)),
    JADE(4, 2923, 10.0f, 5.0f, 18, Ingredient.of(JADE_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;

    MUToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Ingredient repairIngredient) {
        
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return this.itemDurability;
    }

    @Override
    public float getSpeed() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}