package net.trique.mythicupgrades.item.misc;

import com.google.common.base.Suppliers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

import static net.trique.mythicupgrades.item.MUItems.*;

public enum MUToolMaterials implements Tier {
    AQUAMARINE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2923, 10.0f, 5.0f, 18, () -> Ingredient.of(AQUAMARINE_INGOT)),
    PERIDOT(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2923, 10.0f, 5.0f, 18, () -> Ingredient.of(PERIDOT_INGOT)),
    RUBY(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2923, 13.0f, 5.0f, 18, () -> Ingredient.of(RUBY_INGOT)),
    SAPPHIRE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2923, 10.0f, 5.0f, 18, () -> Ingredient.of(SAPPHIRE_INGOT)),
    TOPAZ(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 8769, 11.0f, 6.0f, 18, () -> Ingredient.of(TOPAZ_INGOT)),
    AMETRINE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2923, 10.0f, 5.0f, 18, () -> Ingredient.of(AMETRINE_INGOT)),
    JADE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2923, 10.0f, 5.0f, 18, () -> Ingredient.of(JADE_INGOT));


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    MUToolMaterials(final TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }
    @Override
    public int getUses() {
        return itemDurability;
    }

    @Override
    public float getSpeed() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return inverseTag;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}