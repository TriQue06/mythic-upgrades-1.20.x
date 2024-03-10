package net.trique.mythicupgrades.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;
import static net.trique.mythicupgrades.block.MUBlocks.*;
import static net.trique.mythicupgrades.item.MUItems.*;
import static net.trique.mythicupgrades.MythicUpgrades.*;

import java.util.ArrayList;

public class RegisterMUItems {
    private static final ArrayList<Item> ALL_ITEMS = new ArrayList<>();
    private static <T extends Item> void registerItem(String name, T item) {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), (Item) item);
    }

    private static void registerMUItems() {
        registerItem("peridot_axe", PERIDOT_AXE);
        registerItem("peridot_sword", PERIDOT_SWORD);
        registerItem("peridot_helmet", PERIDOT_HELMET);
        registerItem("peridot_chestplate", PERIDOT_CHESTPLATE);
        registerItem("peridot_leggings", PERIDOT_LEGGINGS);
        registerItem("peridot_boots", PERIDOT_BOOTS);
        registerItem("peridot", PERIDOT);
        registerItem("peridot_ingot", PERIDOT_INGOT);
        registerItem("peridot_crystal_shard", PERIDOT_CRYSTAL_SHARD);
        registerItem("jade_apple", JADE_APPLE);
        registerItem("peridot_potion", PERIDOT_POTION);
        registerItem("peridot_upgrade_smithing_template", PERIDOT_UPGRADE_SMITHING_TEMPLATE);

        registerItem("topaz_shovel", TOPAZ_SHOVEL);
        registerItem("topaz_pickaxe", TOPAZ_PICKAXE);
        registerItem("topaz_axe", TOPAZ_AXE);
        registerItem("topaz_hoe", TOPAZ_HOE);
        registerItem("topaz_sword", TOPAZ_SWORD);
        registerItem("topaz_helmet", TOPAZ_HELMET);
        registerItem("topaz_chestplate", TOPAZ_CHESTPLATE);
        registerItem("topaz_leggings", TOPAZ_LEGGINGS);
        registerItem("topaz_boots", TOPAZ_BOOTS);
        registerItem("topaz", TOPAZ);
        registerItem("topaz_ingot", TOPAZ_INGOT);
        registerItem("topaz_crystal_shard", TOPAZ_CRYSTAL_SHARD);
        registerItem("topaz_apple", TOPAZ_APPLE);
        registerItem("topaz_potion", TOPAZ_POTION);
        registerItem("topaz_upgrade_smithing_template", TOPAZ_UPGRADE_SMITHING_TEMPLATE);

        registerItem("citrine_axe", CITRINE_AXE);
        registerItem("citrine_sword", CITRINE_SWORD);
        registerItem("citrine_helmet", CITRINE_HELMET);
        registerItem("citrine_chestplate", CITRINE_CHESTPLATE);
        registerItem("citrine_leggings", CITRINE_LEGGINGS);
        registerItem("citrine_boots", CITRINE_BOOTS);
        registerItem("citrine", CITRINE);
        registerItem("citrine_ingot", CITRINE_INGOT);
        registerItem("citrine_crystal_shard", CITRINE_CRYSTAL_SHARD);
        registerItem("citrine_potion", CITRINE_POTION);
        registerItem("citrine_upgrade_smithing_template", CITRINE_UPGRADE_SMITHING_TEMPLATE);

        registerItem("aquamarine_sword", AQUAMARINE_SWORD);
        registerItem("aquamarine_axe", AQUAMARINE_AXE);
        registerItem("aquamarine_helmet", AQUAMARINE_HELMET);
        registerItem("aquamarine_chestplate", AQUAMARINE_CHESTPLATE);
        registerItem("aquamarine_leggings", AQUAMARINE_LEGGINGS);
        registerItem("aquamarine_boots", AQUAMARINE_BOOTS);
        registerItem("aquamarine", AQUAMARINE);
        registerItem("aquamarine_ingot", AQUAMARINE_INGOT);
        registerItem("aquamarine_crystal_shard", AQUAMARINE_CRYSTAL_SHARD);
        registerItem("aquamarine_fish", AQUAMARINE_FISH);
        registerItem("aquamarine_potion", AQUAMARINE_POTION);
        registerItem("aquamarine_upgrade_smithing_template", AQUAMARINE_UPGRADE_SMITHING_TEMPLATE);

        registerItem("sapphire_helmet", SAPPHIRE_HELMET);
        registerItem("sapphire_chestplate", SAPPHIRE_CHESTPLATE);
        registerItem("sapphire_leggings", SAPPHIRE_LEGGINGS);
        registerItem("sapphire_boots", SAPPHIRE_BOOTS);
        registerItem("sapphire_axe", SAPPHIRE_AXE);
        registerItem("sapphire_sword", SAPPHIRE_SWORD);
        registerItem("sapphire", SAPPHIRE);
        registerItem("sapphire_ingot", SAPPHIRE_INGOT);
        registerItem("sapphire_crystal_shard", SAPPHIRE_CRYSTAL_SHARD);
        registerItem("sapphire_apple", SAPPHIRE_APPLE);
        registerItem("sapphire_potion", SAPPHIRE_POTION);
        registerItem("sapphire_upgrade_smithing_template", SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);

        registerItem("ruby_shovel", RUBY_SHOVEL);
        registerItem("ruby_axe", RUBY_AXE);
        registerItem("ruby_pickaxe", RUBY_PICKAXE);
        registerItem("ruby_hoe", RUBY_HOE);
        registerItem("ruby_sword", RUBY_SWORD);
        registerItem("ruby", RUBY);
        registerItem("ruby_ingot", RUBY_INGOT);
        registerItem("ruby_crystal_shard", RUBY_CRYSTAL_SHARD);
        registerItem("ruby_apple", RUBY_APPLE);
        registerItem("ruby_potion", RUBY_POTION);
        registerItem("ruby_upgrade_smithing_template", RUBY_UPGRADE_SMITHING_TEMPLATE);

        registerItem("kyanite_helmet", KYANITE_HELMET);
        registerItem("kyanite_chestplate", KYANITE_CHESTPLATE);
        registerItem("kyanite_leggings", KYANITE_LEGGINGS);
        registerItem("kyanite_boots", KYANITE_BOOTS);
        registerItem("kyanite_axe", KYANITE_AXE);
        registerItem("kyanite_sword", KYANITE_SWORD);
        registerItem("kyanite", KYANITE);
        registerItem("kyanite_ingot", KYANITE_INGOT);
        registerItem("kyanite_crystal_shard", KYANITE_CRYSTAL_SHARD);
        registerItem("kyanite_potion", KYANITE_POTION);
        registerItem("kyanite_upgrade_smithing_template", KYANITE_UPGRADE_SMITHING_TEMPLATE);

        registerItem("ametrine_axe", AMETRINE_AXE);
        registerItem("ametrine_sword", AMETRINE_SWORD);
        registerItem("ametrine_helmet", AMETRINE_HELMET);
        registerItem("ametrine_chestplate", AMETRINE_CHESTPLATE);
        registerItem("ametrine_leggings", AMETRINE_LEGGINGS);
        registerItem("ametrine_boots", AMETRINE_BOOTS);
        registerItem("ametrine", AMETRINE);
        registerItem("ametrine_ingot", AMETRINE_INGOT);
        registerItem("ametrine_crystal_shard", AMETRINE_CRYSTAL_SHARD);
        registerItem("ametrine_apple", AMETRINE_APPLE);
        registerItem("ametrine_potion", AMETRINE_POTION);
        registerItem("ametrine_upgrade_smithing_template", AMETRINE_UPGRADE_SMITHING_TEMPLATE);

        registerItem("jade_axe", JADE_AXE);
        registerItem("jade_sword", JADE_SWORD);
        registerItem("jade_helmet", JADE_HELMET);
        registerItem("jade_chestplate", JADE_CHESTPLATE);
        registerItem("jade_leggings", JADE_LEGGINGS);
        registerItem("jade_boots", JADE_BOOTS);
        registerItem("jade", JADE);
        registerItem("jade_ingot", JADE_INGOT);
        registerItem("jade_crystal_shard", JADE_CRYSTAL_SHARD);
        registerItem("jade_potion", JADE_POTION);
        registerItem("jade_upgrade_smithing_template", JADE_UPGRADE_SMITHING_TEMPLATE);

        registerItem("raw_necoium", RAW_NECOIUM);
        registerItem("necoium_ingot", NECOIUM_INGOT);
        registerItem("necoium_nugget", NECOIUM_NUGGET);
    }

    private static void registerMUItemGroup() {
        ItemGroup MYTHICTOOLSGROUP = FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades: Combat & Tools"))
                .icon(() -> new ItemStack(JADE_AXE)).entries((displayContext, entries) -> {
                    entries.add(RUBY_SHOVEL);
                    entries.add(RUBY_PICKAXE);
                    entries.add(RUBY_AXE);
                    entries.add(RUBY_HOE);

                    entries.add(TOPAZ_SHOVEL);
                    entries.add(TOPAZ_PICKAXE);
                    entries.add(TOPAZ_AXE);
                    entries.add(TOPAZ_HOE);
                    entries.add(TOPAZ_SWORD);
                    entries.add(TOPAZ_HELMET);
                    entries.add(TOPAZ_CHESTPLATE);
                    entries.add(TOPAZ_LEGGINGS);
                    entries.add(TOPAZ_BOOTS);

                    entries.add(CITRINE_AXE);
                    entries.add(CITRINE_SWORD);
                    entries.add(CITRINE_HELMET);
                    entries.add(CITRINE_CHESTPLATE);
                    entries.add(CITRINE_LEGGINGS);
                    entries.add(CITRINE_BOOTS);

                    entries.add(PERIDOT_AXE);
                    entries.add(PERIDOT_SWORD);
                    entries.add(PERIDOT_HELMET);
                    entries.add(PERIDOT_CHESTPLATE);
                    entries.add(PERIDOT_LEGGINGS);
                    entries.add(PERIDOT_BOOTS);

                    entries.add(JADE_AXE);
                    entries.add(JADE_SWORD);
                    entries.add(JADE_HELMET);
                    entries.add(JADE_CHESTPLATE);
                    entries.add(JADE_LEGGINGS);
                    entries.add(JADE_BOOTS);

                    entries.add(AQUAMARINE_HELMET);
                    entries.add(AQUAMARINE_CHESTPLATE);
                    entries.add(AQUAMARINE_LEGGINGS);
                    entries.add(AQUAMARINE_BOOTS);

                    entries.add(KYANITE_AXE);
                    entries.add(KYANITE_SWORD);
                    entries.add(KYANITE_HELMET);
                    entries.add(KYANITE_CHESTPLATE);
                    entries.add(KYANITE_LEGGINGS);
                    entries.add(KYANITE_BOOTS);

                    entries.add(SAPPHIRE_AXE);
                    entries.add(SAPPHIRE_SWORD);
                    entries.add(SAPPHIRE_HELMET);
                    entries.add(SAPPHIRE_CHESTPLATE);
                    entries.add(SAPPHIRE_LEGGINGS);
                    entries.add(SAPPHIRE_BOOTS);

                    entries.add(AMETRINE_AXE);
                    entries.add(AMETRINE_SWORD);
                    entries.add(AMETRINE_HELMET);
                    entries.add(AMETRINE_CHESTPLATE);
                    entries.add(AMETRINE_LEGGINGS);
                    entries.add(AMETRINE_BOOTS);
                }).build();
        Registry.register(Registries.ITEM_GROUP, new Identifier(MythicUpgrades.MOD_ID, "mythictoolsgroup"), MYTHICTOOLSGROUP);

        ItemGroup MYTHICMISCGROUP = FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades: Misc"))
                .icon(() -> new ItemStack(JADE)).entries((displayContext, entries) -> {
                    entries.add(RUBY);
                    entries.add(RUBY_INGOT);
                    entries.add(RUBY_CRYSTAL_SHARD);
                    entries.add(RUBY_POTION);
                    entries.add(RUBY_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(TOPAZ);
                    entries.add(TOPAZ_INGOT);
                    entries.add(TOPAZ_CRYSTAL_SHARD);
                    entries.add(TOPAZ_POTION);
                    entries.add(TOPAZ_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(CITRINE);
                    entries.add(CITRINE_INGOT);
                    entries.add(CITRINE_CRYSTAL_SHARD);
                    entries.add(CITRINE_POTION);
                    entries.add(CITRINE_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(PERIDOT);
                    entries.add(PERIDOT_INGOT);
                    entries.add(PERIDOT_CRYSTAL_SHARD);
                    entries.add(PERIDOT_POTION);
                    entries.add(PERIDOT_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(JADE);
                    entries.add(JADE_INGOT);
                    entries.add(JADE_CRYSTAL_SHARD);
                    entries.add(JADE_POTION);
                    entries.add(JADE_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(AQUAMARINE);
                    entries.add(AQUAMARINE_INGOT);
                    entries.add(AQUAMARINE_CRYSTAL_SHARD);
                    entries.add(AQUAMARINE_POTION);
                    entries.add(AQUAMARINE_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(KYANITE);
                    entries.add(KYANITE_INGOT);
                    entries.add(KYANITE_CRYSTAL_SHARD);
                    entries.add(KYANITE_POTION);
                    entries.add(KYANITE_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(SAPPHIRE);
                    entries.add(SAPPHIRE_INGOT);
                    entries.add(SAPPHIRE_CRYSTAL_SHARD);
                    entries.add(SAPPHIRE_POTION);
                    entries.add(SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(AMETRINE);
                    entries.add(AMETRINE_INGOT);
                    entries.add(AMETRINE_CRYSTAL_SHARD);
                    entries.add(AMETRINE_POTION);
                    entries.add(AMETRINE_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(RAW_NECOIUM);
                    entries.add(NECOIUM_INGOT);
                    entries.add(NECOIUM_NUGGET);
                }).build();
        Registry.register(Registries.ITEM_GROUP, new Identifier(MythicUpgrades.MOD_ID, "mythicmiscgroup"), MYTHICMISCGROUP);

        ItemGroup MYTHICBLOCKGROUP = FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades: Blocks"))
                .icon(() -> new ItemStack(JADE_BLOCK)).entries((displayContext, entries) -> {
                    entries.add(RUBY_BLOCK);
                    entries.add(RUBY_ORE);
                    entries.add(RUBY_CRYSTAL_BLOCK);
                    entries.add(BUDDING_RUBY_CRYSTAL);
                    entries.add(SMALL_RUBY_CRYSTAL_BUD);
                    entries.add(MEDIUM_RUBY_CRYSTAL_BUD);
                    entries.add(LARGE_RUBY_CRYSTAL_BUD);
                    entries.add(RUBY_CRYSTAL_CLUSTER);

                    entries.add(TOPAZ_BLOCK);
                    entries.add(TOPAZ_ORE);
                    entries.add(TOPAZ_CRYSTAL_BLOCK);
                    entries.add(BUDDING_TOPAZ_CRYSTAL);
                    entries.add(SMALL_TOPAZ_CRYSTAL_BUD);
                    entries.add(MEDIUM_TOPAZ_CRYSTAL_BUD);
                    entries.add(LARGE_TOPAZ_CRYSTAL_BUD);
                    entries.add(TOPAZ_CRYSTAL_CLUSTER);

                    entries.add(CITRINE_BLOCK);
                    entries.add(CITRINE_ORE);
                    entries.add(DEEPSLATE_CITRINE_ORE);
                    entries.add(CITRINE_CRYSTAL_BLOCK);
                    entries.add(BUDDING_CITRINE_CRYSTAL);
                    entries.add(SMALL_CITRINE_CRYSTAL_BUD);
                    entries.add(MEDIUM_CITRINE_CRYSTAL_BUD);
                    entries.add(LARGE_CITRINE_CRYSTAL_BUD);
                    entries.add(CITRINE_CRYSTAL_CLUSTER);

                    entries.add(PERIDOT_BLOCK);
                    entries.add(PERIDOT_ORE);
                    entries.add(DEEPSLATE_PERIDOT_ORE);
                    entries.add(PERIDOT_CRYSTAL_BLOCK);
                    entries.add(BUDDING_PERIDOT_CRYSTAL);
                    entries.add(SMALL_PERIDOT_CRYSTAL_BUD);
                    entries.add(MEDIUM_PERIDOT_CRYSTAL_BUD);
                    entries.add(LARGE_PERIDOT_CRYSTAL_BUD);
                    entries.add(PERIDOT_CRYSTAL_CLUSTER);

                    entries.add(JADE_BLOCK);
                    entries.add(JADE_ORE);
                    entries.add(JADE_CRYSTAL_BLOCK);
                    entries.add(BUDDING_JADE_CRYSTAL);
                    entries.add(SMALL_JADE_CRYSTAL_BUD);
                    entries.add(MEDIUM_JADE_CRYSTAL_BUD);
                    entries.add(LARGE_JADE_CRYSTAL_BUD);
                    entries.add(JADE_CRYSTAL_CLUSTER);

                    entries.add(AQUAMARINE_BLOCK);
                    entries.add(AQUAMARINE_ORE);
                    entries.add(DEEPSLATE_AQUAMARINE_ORE);
                    entries.add(AQUAMARINE_CRYSTAL_BLOCK);
                    entries.add(BUDDING_AQUAMARINE_CRYSTAL);
                    entries.add(SMALL_AQUAMARINE_CRYSTAL_BUD);
                    entries.add(MEDIUM_AQUAMARINE_CRYSTAL_BUD);
                    entries.add(LARGE_AQUAMARINE_CRYSTAL_BUD);
                    entries.add(AQUAMARINE_CRYSTAL_CLUSTER);

                    entries.add(KYANITE_BLOCK);
                    entries.add(KYANITE_ORE);
                    entries.add(KYANITE_CRYSTAL_BLOCK);
                    entries.add(BUDDING_KYANITE_CRYSTAL);
                    entries.add(SMALL_KYANITE_CRYSTAL_BUD);
                    entries.add(MEDIUM_KYANITE_CRYSTAL_BUD);
                    entries.add(LARGE_KYANITE_CRYSTAL_BUD);
                    entries.add(KYANITE_CRYSTAL_CLUSTER);

                    entries.add(SAPPHIRE_BLOCK);
                    entries.add(SAPPHIRE_ORE);
                    entries.add(SAPPHIRE_CRYSTAL_BLOCK);
                    entries.add(BUDDING_SAPPHIRE_CRYSTAL);
                    entries.add(SMALL_SAPPHIRE_CRYSTAL_BUD);
                    entries.add(MEDIUM_SAPPHIRE_CRYSTAL_BUD);
                    entries.add(LARGE_SAPPHIRE_CRYSTAL_BUD);
                    entries.add(SAPPHIRE_CRYSTAL_CLUSTER);

                    entries.add(AMETRINE_BLOCK);
                    entries.add(AMETRINE_ORE);
                    entries.add(AMETRINE_CRYSTAL_BLOCK);
                    entries.add(BUDDING_AMETRINE_CRYSTAL);
                    entries.add(SMALL_AMETRINE_CRYSTAL_BUD);
                    entries.add(MEDIUM_AMETRINE_CRYSTAL_BUD);
                    entries.add(LARGE_AMETRINE_CRYSTAL_BUD);
                    entries.add(AMETRINE_CRYSTAL_CLUSTER);

                    entries.add(RAW_NECOIUM_BLOCK);
                    entries.add(NECOIUM_BLOCK);
                    entries.add(NECOIUM_ORE);
                }).build();
        Registry.register(Registries.ITEM_GROUP, new Identifier(MythicUpgrades.MOD_ID, "mythicblockgroup"), MYTHICBLOCKGROUP);
    }

    public static void registerMythicItems() {
        registerMUItems();
        registerMUItemGroup();
        LOGGER.info("Registering Mythic Items for " + MOD_ID);
    }
}