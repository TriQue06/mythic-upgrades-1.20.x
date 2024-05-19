package net.trique.mythicupgrades.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.trique.mythicupgrades.item.MUItems;

public class MULootTableModifiers {
    private static final ResourceLocation UNDERWATER_RUIN_BIG_ID =
            new ResourceLocation("minecraft", "chests/underwater_ruin_big");

    private static final ResourceLocation UNDERWATER_RUIN_SMALL_ID =
            new ResourceLocation("minecraft", "chests/underwater_ruin_small");

    private static final ResourceLocation DESERT_PYRAMID_ID =
            new ResourceLocation("minecraft", "chests/desert_pyramid");

    private static final ResourceLocation JUNGLE_TEMPLE_ID =
            new ResourceLocation("minecraft", "chests/jungle_temple");

    private static final ResourceLocation IGLOO_CHEST_ID =
            new ResourceLocation("minecraft", "chests/igloo_chest");

    private static final ResourceLocation BASTION_BRIDGE_ID =
            new ResourceLocation("minecraft", "chests/bastion_bridge");

    private static final ResourceLocation BASTION_HOGLIN_STABLE_ID =
            new ResourceLocation("minecraft", "chests/bastion_hoglin_stable");

    private static final ResourceLocation BASTION_OTHER_ID =
            new ResourceLocation("minecraft", "chests/bastion_other");

    private static final ResourceLocation BASTION_TREASURE_ID =
            new ResourceLocation("minecraft", "chests/bastion_treasure");

    private static final ResourceLocation NETHER_BRIDGE_ID =
            new ResourceLocation("minecraft", "chests/nether_bridge");

    private static final ResourceLocation END_CITY_TREASURE_ID =
            new ResourceLocation("minecraft", "chests/end_city_treasure");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            if(UNDERWATER_RUIN_BIG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.AQUAMARINE_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(UNDERWATER_RUIN_SMALL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.AQUAMARINE_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(UNDERWATER_RUIN_BIG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.AQUAMARINE_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(UNDERWATER_RUIN_SMALL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.AQUAMARINE_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(DESERT_PYRAMID_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.CITRINE_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(DESERT_PYRAMID_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.CITRINE_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.PERIDOT_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.PERIDOT_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(IGLOO_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.ZIRCON_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(IGLOO_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.ZIRCON_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_HOGLIN_STABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_HOGLIN_STABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_OTHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_OTHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.5f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(1.0f))
                        .add(LootItem.lootTableItem(MUItems.RUBY_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.SAPPHIRE_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.TOPAZ_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(END_CITY_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(END_CITY_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.AMETRINE_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(END_CITY_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(MUItems.JADE_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(END_CITY_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(MUItems.JADE_POTION))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}