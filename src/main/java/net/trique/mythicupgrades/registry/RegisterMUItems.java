package net.trique.mythicupgrades.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;

import java.util.ArrayList;

import static net.trique.mythicupgrades.block.MUBlocks.*;
import static net.trique.mythicupgrades.item.MUItems.*;
import static net.trique.mythicupgrades.MythicUpgrades.*;

public class RegisterMUItems {
    private static final ArrayList<Item> ALL_ITEMS = new ArrayList<>();
    private static <T extends Item> void registerItem(String name, T item) {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), (Item) item);
    }

    private static void registerMUItems() {
        registerItem("aquamarine_axe", AQUAMARINE_AXE);
        registerItem("aquamarine_shovel", AQUAMARINE_SHOVEL);
        registerItem("aquamarine_pickaxe", AQUAMARINE_PICKAXE);
        registerItem("aquamarine_hoe", AQUAMARINE_HOE);
        registerItem("aquamarine_sword", AQUAMARINE_SWORD);
        registerItem("aquamarine_helmet", AQUAMARINE_HELMET);
        registerItem("aquamarine_chestplate", AQUAMARINE_CHESTPLATE);
        registerItem("aquamarine_leggings", AQUAMARINE_LEGGINGS);
        registerItem("aquamarine_boots", AQUAMARINE_BOOTS);
        registerItem("aquamarine", AQUAMARINE);
        registerItem("aquamarine_ingot", AQUAMARINE_INGOT);
        registerItem("aquamarine_crystal_shard", AQUAMARINE_CRYSTAL_SHARD);
        registerItem("aquamarine_potion", AQUAMARINE_POTION);
        registerItem("aquamarine_upgrade_smithing_template", AQUAMARINE_UPGRADE_SMITHING_TEMPLATE);

        registerItem("peridot_axe", PERIDOT_AXE);
        registerItem("peridot_shovel", PERIDOT_SHOVEL);
        registerItem("peridot_pickaxe", PERIDOT_PICKAXE);
        registerItem("peridot_hoe", PERIDOT_HOE);
        registerItem("peridot_sword", PERIDOT_SWORD);
        registerItem("peridot_helmet", PERIDOT_HELMET);
        registerItem("peridot_chestplate", PERIDOT_CHESTPLATE);
        registerItem("peridot_leggings", PERIDOT_LEGGINGS);
        registerItem("peridot_boots", PERIDOT_BOOTS);
        registerItem("peridot", PERIDOT);
        registerItem("peridot_ingot", PERIDOT_INGOT);
        registerItem("peridot_crystal_shard", PERIDOT_CRYSTAL_SHARD);
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
        registerItem("topaz_potion", TOPAZ_POTION);
        registerItem("topaz_upgrade_smithing_template", TOPAZ_UPGRADE_SMITHING_TEMPLATE);

        registerItem("ruby_shovel", RUBY_SHOVEL);
        registerItem("ruby_axe", RUBY_AXE);
        registerItem("ruby_pickaxe", RUBY_PICKAXE);
        registerItem("ruby_hoe", RUBY_HOE);
        registerItem("ruby_sword", RUBY_SWORD);
        registerItem("ruby_helmet", RUBY_HELMET);
        registerItem("ruby_chestplate", RUBY_CHESTPLATE);
        registerItem("ruby_leggings", RUBY_LEGGINGS);
        registerItem("ruby_boots", RUBY_BOOTS);
        registerItem("ruby", RUBY);
        registerItem("ruby_ingot", RUBY_INGOT);
        registerItem("ruby_crystal_shard", RUBY_CRYSTAL_SHARD);
        registerItem("ruby_potion", RUBY_POTION);
        registerItem("ruby_upgrade_smithing_template", RUBY_UPGRADE_SMITHING_TEMPLATE);

        registerItem("sapphire_axe", SAPPHIRE_AXE);
        registerItem("sapphire_shovel", SAPPHIRE_SHOVEL);
        registerItem("sapphire_pickaxe", SAPPHIRE_PICKAXE);
        registerItem("sapphire_hoe", SAPPHIRE_HOE);
        registerItem("sapphire_sword", SAPPHIRE_SWORD);
        registerItem("sapphire_helmet", SAPPHIRE_HELMET);
        registerItem("sapphire_chestplate", SAPPHIRE_CHESTPLATE);
        registerItem("sapphire_leggings", SAPPHIRE_LEGGINGS);
        registerItem("sapphire_boots", SAPPHIRE_BOOTS);
        registerItem("sapphire", SAPPHIRE);
        registerItem("sapphire_ingot", SAPPHIRE_INGOT);
        registerItem("sapphire_crystal_shard", SAPPHIRE_CRYSTAL_SHARD);
        registerItem("sapphire_potion", SAPPHIRE_POTION);
        registerItem("sapphire_upgrade_smithing_template", SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);

        registerItem("ametrine_shovel", AMETRINE_SHOVEL);
        registerItem("ametrine_pickaxe", AMETRINE_PICKAXE);
        registerItem("ametrine_axe", AMETRINE_AXE);
        registerItem("ametrine_hoe", AMETRINE_HOE);
        registerItem("ametrine_sword", AMETRINE_SWORD);
        registerItem("ametrine_helmet", AMETRINE_HELMET);
        registerItem("ametrine_chestplate", AMETRINE_CHESTPLATE);
        registerItem("ametrine_leggings", AMETRINE_LEGGINGS);
        registerItem("ametrine_boots", AMETRINE_BOOTS);
        registerItem("ametrine", AMETRINE);
        registerItem("ametrine_ingot", AMETRINE_INGOT);
        registerItem("ametrine_crystal_shard", AMETRINE_CRYSTAL_SHARD);
        registerItem("ametrine_potion", AMETRINE_POTION);
        registerItem("ametrine_upgrade_smithing_template", AMETRINE_UPGRADE_SMITHING_TEMPLATE);

        registerItem("jade_shovel", JADE_SHOVEL);
        registerItem("jade_pickaxe", JADE_PICKAXE);
        registerItem("jade_axe", JADE_AXE);
        registerItem("jade_hoe", JADE_HOE);
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
    }

    private static void registerMUItemGroup() {
        ItemGroup MYTHICTOOLSGROUP = FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades: Combat & Tools"))
                .icon(() -> new ItemStack(JADE_AXE)).entries((displayContext, entries) -> {
                    entries.add(RUBY_SHOVEL);
                    entries.add(RUBY_PICKAXE);
                    entries.add(RUBY_AXE);
                    entries.add(RUBY_HOE);
                    entries.add(RUBY_SWORD);
                    entries.add(RUBY_HELMET);
                    entries.add(RUBY_CHESTPLATE);
                    entries.add(RUBY_LEGGINGS);
                    entries.add(RUBY_BOOTS);

                    entries.add(TOPAZ_SHOVEL);
                    entries.add(TOPAZ_PICKAXE);
                    entries.add(TOPAZ_AXE);
                    entries.add(TOPAZ_HOE);
                    entries.add(TOPAZ_SWORD);
                    entries.add(TOPAZ_HELMET);
                    entries.add(TOPAZ_CHESTPLATE);
                    entries.add(TOPAZ_LEGGINGS);
                    entries.add(TOPAZ_BOOTS);

                    entries.add(PERIDOT_SHOVEL);
                    entries.add(PERIDOT_PICKAXE);
                    entries.add(PERIDOT_AXE);
                    entries.add(PERIDOT_HOE);
                    entries.add(PERIDOT_SWORD);
                    entries.add(PERIDOT_HELMET);
                    entries.add(PERIDOT_CHESTPLATE);
                    entries.add(PERIDOT_LEGGINGS);
                    entries.add(PERIDOT_BOOTS);

                    entries.add(JADE_SHOVEL);
                    entries.add(JADE_PICKAXE);
                    entries.add(JADE_AXE);
                    entries.add(JADE_HOE);
                    entries.add(JADE_SWORD);
                    entries.add(JADE_HELMET);
                    entries.add(JADE_CHESTPLATE);
                    entries.add(JADE_LEGGINGS);
                    entries.add(JADE_BOOTS);

                    entries.add(AQUAMARINE_SHOVEL);
                    entries.add(AQUAMARINE_PICKAXE);
                    entries.add(AQUAMARINE_AXE);
                    entries.add(AQUAMARINE_HOE);
                    entries.add(AQUAMARINE_SWORD);
                    entries.add(AQUAMARINE_HELMET);
                    entries.add(AQUAMARINE_CHESTPLATE);
                    entries.add(AQUAMARINE_LEGGINGS);
                    entries.add(AQUAMARINE_BOOTS);

                    entries.add(SAPPHIRE_SHOVEL);
                    entries.add(SAPPHIRE_PICKAXE);
                    entries.add(SAPPHIRE_AXE);
                    entries.add(SAPPHIRE_HOE);
                    entries.add(SAPPHIRE_SWORD);
                    entries.add(SAPPHIRE_HELMET);
                    entries.add(SAPPHIRE_CHESTPLATE);
                    entries.add(SAPPHIRE_LEGGINGS);
                    entries.add(SAPPHIRE_BOOTS);

                    entries.add(AMETRINE_SHOVEL);
                    entries.add(AMETRINE_PICKAXE);
                    entries.add(AMETRINE_AXE);
                    entries.add(AMETRINE_HOE);
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
                }).build();
        Registry.register(Registries.ITEM_GROUP, new Identifier(MythicUpgrades.MOD_ID, "mythicmiscgroup"), MYTHICMISCGROUP);

        ItemGroup MYTHICBLOCKGROUP = FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades: Blocks"))
                .icon(() -> new ItemStack(JADE_BLOCK)).entries((displayContext, entries) -> {
                    entries.add(RUBY_BLOCK);
                    entries.add(RUBY_ORE);
                    entries.add(RUBY_CRYSTAL_BLOCK);
                    entries.add(RUBY_CRYSTAL_CLUSTER);

                    entries.add(TOPAZ_BLOCK);
                    entries.add(TOPAZ_ORE);
                    entries.add(TOPAZ_CRYSTAL_BLOCK);
                    entries.add(TOPAZ_CRYSTAL_CLUSTER);

                    entries.add(PERIDOT_BLOCK);
                    entries.add(PERIDOT_ORE);
                    entries.add(DEEPSLATE_PERIDOT_ORE);
                    entries.add(PERIDOT_CRYSTAL_BLOCK);
                    entries.add(PERIDOT_CRYSTAL_CLUSTER);

                    entries.add(JADE_BLOCK);
                    entries.add(JADE_ORE);
                    entries.add(JADE_CRYSTAL_BLOCK);
                    entries.add(JADE_CRYSTAL_CLUSTER);

                    entries.add(AQUAMARINE_BLOCK);
                    entries.add(AQUAMARINE_ORE);
                    entries.add(DEEPSLATE_AQUAMARINE_ORE);
                    entries.add(AQUAMARINE_CRYSTAL_BLOCK);
                    entries.add(AQUAMARINE_CRYSTAL_CLUSTER);

                    entries.add(SAPPHIRE_BLOCK);
                    entries.add(SAPPHIRE_ORE);
                    entries.add(SAPPHIRE_CRYSTAL_BLOCK);
                    entries.add(SAPPHIRE_CRYSTAL_CLUSTER);

                    entries.add(AMETRINE_BLOCK);
                    entries.add(AMETRINE_ORE);
                    entries.add(AMETRINE_CRYSTAL_BLOCK);
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