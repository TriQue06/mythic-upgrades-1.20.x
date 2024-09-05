package net.trique.mythicupgrades.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.trique.mythicupgrades.item.MUItems;

public class MULootTableModifiers {
    private static final ResourceKey<LootTable> DESERT_PYRAMID_LOOT = BuiltInLootTables.DESERT_PYRAMID;

    private static final ResourceKey<LootTable> JUNGLE_TEMPLE_LOOT = BuiltInLootTables.JUNGLE_TEMPLE;

    private static final ResourceKey<LootTable> IGLOO_CHEST_LOOT = BuiltInLootTables.IGLOO_CHEST;

    private static final ResourceKey<LootTable> BASTION_BRIDGE_LOOT = BuiltInLootTables.BASTION_BRIDGE;

    private static final ResourceKey<LootTable> BASTION_HOGLIN_STABLE_LOOT = BuiltInLootTables.BASTION_HOGLIN_STABLE;

    private static final ResourceKey<LootTable> BASTION_OTHER_LOOT = BuiltInLootTables.BASTION_OTHER;

    private static final ResourceKey<LootTable> BASTION_TREASURE_LOOT = BuiltInLootTables.BASTION_TREASURE;

    private static final ResourceKey<LootTable> NETHER_BRIDGE_LOOT = BuiltInLootTables.NETHER_BRIDGE;

    private static final ResourceKey<LootTable> END_CITY_TREASURE_LOOT = BuiltInLootTables.END_CITY_TREASURE;

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((key, tableBuilder, source, registries) -> {
            if (JUNGLE_TEMPLE_LOOT.equals(key)) {
                LootPool.Builder smithingUpgradePoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.PERIDOT_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                LootPool.Builder potionPoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.PERIDOT_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(smithingUpgradePoolBuilder.build());
                tableBuilder.pool(potionPoolBuilder.build());
            }


            if (DESERT_PYRAMID_LOOT.equals(key)) {
                LootPool.Builder smithingUpgradePoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                LootPool.Builder potionPoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.TOPAZ_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(smithingUpgradePoolBuilder.build());
                tableBuilder.pool(potionPoolBuilder.build());
            }

            if (IGLOO_CHEST_LOOT.equals(key)) {
                LootPool.Builder smithingUpgradePoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.AQUAMARINE_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                LootPool.Builder potionPoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.AQUAMARINE_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(smithingUpgradePoolBuilder.build());
                tableBuilder.pool(potionPoolBuilder.build());
            }

            if (BASTION_BRIDGE_LOOT.equals(key)) {
                LootPool.Builder smithingUpgradePoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                LootPool.Builder potionPoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(smithingUpgradePoolBuilder.build());
                tableBuilder.pool(potionPoolBuilder.build());
            }

            if (BASTION_HOGLIN_STABLE_LOOT.equals(key)) {
                LootPool.Builder smithingUpgradePoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                LootPool.Builder potionPoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(smithingUpgradePoolBuilder.build());
                tableBuilder.pool(potionPoolBuilder.build());
            }

            if (BASTION_OTHER_LOOT.equals(key)) {
                LootPool.Builder smithingUpgradePoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                LootPool.Builder potionPoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(smithingUpgradePoolBuilder.build());
                tableBuilder.pool(potionPoolBuilder.build());
            }

            if (BASTION_TREASURE_LOOT.equals(key)) {
                LootPool.Builder smithingUpgradePoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.5f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                LootPool.Builder potionPoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(1.0f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(smithingUpgradePoolBuilder.build());
                tableBuilder.pool(potionPoolBuilder.build());
            }

            if (NETHER_BRIDGE_LOOT.equals(key)) {
                LootPool.Builder smithingUpgradePoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                LootPool.Builder potionPoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.SAPPHIRE_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(smithingUpgradePoolBuilder.build());
                tableBuilder.pool(potionPoolBuilder.build());
            }

            if (END_CITY_TREASURE_LOOT.equals(key)) {
                LootPool.Builder ametrineSmithingUpgradePoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                LootPool.Builder ametrinePotionPoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.AMETRINE_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                LootPool.Builder jadeSmithingUpgradePoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.JADE_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                LootPool.Builder jadePotionPoolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.JADE_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(ametrineSmithingUpgradePoolBuilder.build());
                tableBuilder.pool(ametrinePotionPoolBuilder.build());
                tableBuilder.pool(jadeSmithingUpgradePoolBuilder.build());
                tableBuilder.pool(jadePotionPoolBuilder.build());
            }
        }));
    }
}