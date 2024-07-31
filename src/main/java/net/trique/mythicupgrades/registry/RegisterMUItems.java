package net.trique.mythicupgrades.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.trique.mythicupgrades.MythicUpgrades;

import java.util.ArrayList;

import static net.trique.mythicupgrades.block.MUBlocks.*;
import static net.trique.mythicupgrades.item.MUItems.*;
import static net.trique.mythicupgrades.MythicUpgrades.*;


public class RegisterMUItems {
    private static final ArrayList<Item> ALL_ITEMS = new ArrayList<>();
    private static <T extends Item> void registerItem(String name, T item) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), (Item) item);
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
        CreativeModeTab MYTHICTOOLSGROUP = FabricItemGroup.builder().title(Component.literal("Mythic Upgrades: Combat & Tools"))
                .icon(() -> new ItemStack(JADE_AXE)).displayItems((displayContext, entries) -> {
                    entries.accept(RUBY_SHOVEL);
                    entries.accept(RUBY_PICKAXE);
                    entries.accept(RUBY_AXE);
                    entries.accept(RUBY_HOE);
                    entries.accept(RUBY_SWORD);
                    entries.accept(RUBY_HELMET);
                    entries.accept(RUBY_CHESTPLATE);
                    entries.accept(RUBY_LEGGINGS);
                    entries.accept(RUBY_BOOTS);

                    entries.accept(TOPAZ_SHOVEL);
                    entries.accept(TOPAZ_PICKAXE);
                    entries.accept(TOPAZ_AXE);
                    entries.accept(TOPAZ_HOE);
                    entries.accept(TOPAZ_SWORD);
                    entries.accept(TOPAZ_HELMET);
                    entries.accept(TOPAZ_CHESTPLATE);
                    entries.accept(TOPAZ_LEGGINGS);
                    entries.accept(TOPAZ_BOOTS);

                    entries.accept(PERIDOT_SHOVEL);
                    entries.accept(PERIDOT_PICKAXE);
                    entries.accept(PERIDOT_AXE);
                    entries.accept(PERIDOT_HOE);
                    entries.accept(PERIDOT_SWORD);
                    entries.accept(PERIDOT_HELMET);
                    entries.accept(PERIDOT_CHESTPLATE);
                    entries.accept(PERIDOT_LEGGINGS);
                    entries.accept(PERIDOT_BOOTS);

                    entries.accept(JADE_SHOVEL);
                    entries.accept(JADE_PICKAXE);
                    entries.accept(JADE_AXE);
                    entries.accept(JADE_HOE);
                    entries.accept(JADE_SWORD);
                    entries.accept(JADE_HELMET);
                    entries.accept(JADE_CHESTPLATE);
                    entries.accept(JADE_LEGGINGS);
                    entries.accept(JADE_BOOTS);

                    entries.accept(AQUAMARINE_SHOVEL);
                    entries.accept(AQUAMARINE_PICKAXE);
                    entries.accept(AQUAMARINE_AXE);
                    entries.accept(AQUAMARINE_HOE);
                    entries.accept(AQUAMARINE_SWORD);
                    entries.accept(AQUAMARINE_HELMET);
                    entries.accept(AQUAMARINE_CHESTPLATE);
                    entries.accept(AQUAMARINE_LEGGINGS);
                    entries.accept(AQUAMARINE_BOOTS);

                    entries.accept(SAPPHIRE_SHOVEL);
                    entries.accept(SAPPHIRE_PICKAXE);
                    entries.accept(SAPPHIRE_AXE);
                    entries.accept(SAPPHIRE_HOE);
                    entries.accept(SAPPHIRE_SWORD);
                    entries.accept(SAPPHIRE_HELMET);
                    entries.accept(SAPPHIRE_CHESTPLATE);
                    entries.accept(SAPPHIRE_LEGGINGS);
                    entries.accept(SAPPHIRE_BOOTS);

                    entries.accept(AMETRINE_SHOVEL);
                    entries.accept(AMETRINE_PICKAXE);
                    entries.accept(AMETRINE_AXE);
                    entries.accept(AMETRINE_HOE);
                    entries.accept(AMETRINE_SWORD);
                    entries.accept(AMETRINE_HELMET);
                    entries.accept(AMETRINE_CHESTPLATE);
                    entries.accept(AMETRINE_LEGGINGS);
                    entries.accept(AMETRINE_BOOTS);
                }).build();
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MythicUpgrades.MOD_ID, "mythictoolsgroup"), MYTHICTOOLSGROUP);

        CreativeModeTab MYTHICMISCGROUP = FabricItemGroup.builder().title(Component.literal("Mythic Upgrades: Misc"))
                .icon(() -> new ItemStack(JADE)).displayItems((displayContext, entries) -> {
                    entries.accept(RUBY);
                    entries.accept(RUBY_INGOT);
                    entries.accept(RUBY_CRYSTAL_SHARD);
                    entries.accept(RUBY_POTION);
                    entries.accept(RUBY_UPGRADE_SMITHING_TEMPLATE);

                    entries.accept(TOPAZ);
                    entries.accept(TOPAZ_INGOT);
                    entries.accept(TOPAZ_CRYSTAL_SHARD);
                    entries.accept(TOPAZ_POTION);
                    entries.accept(TOPAZ_UPGRADE_SMITHING_TEMPLATE);

                    entries.accept(PERIDOT);
                    entries.accept(PERIDOT_INGOT);
                    entries.accept(PERIDOT_CRYSTAL_SHARD);
                    entries.accept(PERIDOT_POTION);
                    entries.accept(PERIDOT_UPGRADE_SMITHING_TEMPLATE);

                    entries.accept(JADE);
                    entries.accept(JADE_INGOT);
                    entries.accept(JADE_CRYSTAL_SHARD);
                    entries.accept(JADE_POTION);
                    entries.accept(JADE_UPGRADE_SMITHING_TEMPLATE);

                    entries.accept(AQUAMARINE);
                    entries.accept(AQUAMARINE_INGOT);
                    entries.accept(AQUAMARINE_CRYSTAL_SHARD);
                    entries.accept(AQUAMARINE_POTION);
                    entries.accept(AQUAMARINE_UPGRADE_SMITHING_TEMPLATE);

                    entries.accept(SAPPHIRE);
                    entries.accept(SAPPHIRE_INGOT);
                    entries.accept(SAPPHIRE_CRYSTAL_SHARD);
                    entries.accept(SAPPHIRE_POTION);
                    entries.accept(SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);

                    entries.accept(AMETRINE);
                    entries.accept(AMETRINE_INGOT);
                    entries.accept(AMETRINE_CRYSTAL_SHARD);
                    entries.accept(AMETRINE_POTION);
                    entries.accept(AMETRINE_UPGRADE_SMITHING_TEMPLATE);

                    entries.accept(RAW_NECOIUM);
                    entries.accept(NECOIUM_INGOT);
                }).build();
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MythicUpgrades.MOD_ID, "mythicmiscgroup"), MYTHICMISCGROUP);

        CreativeModeTab MYTHICBLOCKGROUP = FabricItemGroup.builder().title(Component.literal("Mythic Upgrades: Blocks"))
                .icon(() -> new ItemStack(JADE_BLOCK)).displayItems((displayContext, entries) -> {
                    entries.accept(RUBY_BLOCK);
                    entries.accept(RUBY_ORE);
                    entries.accept(RUBY_CRYSTAL_BLOCK);
                    entries.accept(RUBY_CRYSTAL_CLUSTER);

                    entries.accept(TOPAZ_BLOCK);
                    entries.accept(TOPAZ_ORE);
                    entries.accept(DEEPSLATE_TOPAZ_ORE);
                    entries.accept(TOPAZ_CRYSTAL_BLOCK);
                    entries.accept(TOPAZ_CRYSTAL_CLUSTER);

                    entries.accept(PERIDOT_BLOCK);
                    entries.accept(PERIDOT_ORE);
                    entries.accept(DEEPSLATE_PERIDOT_ORE);
                    entries.accept(PERIDOT_CRYSTAL_BLOCK);
                    entries.accept(PERIDOT_CRYSTAL_CLUSTER);

                    entries.accept(JADE_BLOCK);
                    entries.accept(JADE_ORE);
                    entries.accept(JADE_CRYSTAL_BLOCK);
                    entries.accept(JADE_CRYSTAL_CLUSTER);

                    entries.accept(AQUAMARINE_BLOCK);
                    entries.accept(AQUAMARINE_ORE);
                    entries.accept(DEEPSLATE_AQUAMARINE_ORE);
                    entries.accept(AQUAMARINE_CRYSTAL_BLOCK);
                    entries.accept(AQUAMARINE_CRYSTAL_CLUSTER);

                    entries.accept(SAPPHIRE_BLOCK);
                    entries.accept(SAPPHIRE_ORE);
                    entries.accept(SAPPHIRE_CRYSTAL_BLOCK);
                    entries.accept(SAPPHIRE_CRYSTAL_CLUSTER);

                    entries.accept(AMETRINE_BLOCK);
                    entries.accept(AMETRINE_ORE);
                    entries.accept(AMETRINE_CRYSTAL_BLOCK);
                    entries.accept(AMETRINE_CRYSTAL_CLUSTER);

                    entries.accept(RAW_NECOIUM_BLOCK);
                    entries.accept(NECOIUM_BLOCK);
                    entries.accept(NECOIUM_ORE);
                }).build();
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MythicUpgrades.MOD_ID, "mythicblockgroup"), MYTHICBLOCKGROUP);
    }

    public static void registerMythicItems() {
        registerMUItems();
        registerMUItemGroup();
        LOGGER.info("Registering Mythic Items for " + MOD_ID);
    }
}