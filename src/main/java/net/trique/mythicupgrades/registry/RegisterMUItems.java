package net.trique.mythicupgrades.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.block.MUBlocks;
import net.trique.mythicupgrades.item.MUItems;
import net.trique.mythicupgrades.item.charms.JadeCharm;

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
        registerItem("jade_axe", JADE_AXE);
        registerItem("jade_sword", JADE_SWORD);
        registerItem("jade_helmet", JADE_HELMET);
        registerItem("jade_chestplate", JADE_CHESTPLATE);
        registerItem("jade_leggings", JADE_LEGGINGS);
        registerItem("jade_boots", JADE_BOOTS);
        registerItem("jade_charm", JADE_CHARM);
        registerItem("jade", JADE);
        registerItem("jade_ingot", JADE_INGOT);
        registerItem("jade_crystal_shard", JADE_CRYSTAL_SHARD);
        registerItem("jade_apple", JADE_APPLE);
        registerItem("jade_potion", JADE_POTION);
        registerItem("jade_upgrade_smithing_template", JADE_UPGRADE_SMITHING_TEMPLATE);
        registerItem("music_disc_nelumbo", MUSIC_DISC_NELUMBO);

        registerItem("topaz_shovel", TOPAZ_SHOVEL);
        registerItem("topaz_pickaxe", TOPAZ_PICKAXE);
        registerItem("topaz_axe", TOPAZ_AXE);
        registerItem("topaz_hoe", TOPAZ_HOE);
        registerItem("topaz_sword", TOPAZ_SWORD);
        registerItem("topaz_helmet", TOPAZ_HELMET);
        registerItem("topaz_chestplate", TOPAZ_CHESTPLATE);
        registerItem("topaz_leggings", TOPAZ_LEGGINGS);
        registerItem("topaz_boots", TOPAZ_BOOTS);
        registerItem("topaz_charm", TOPAZ_CHARM);
        registerItem("topaz", TOPAZ);
        registerItem("topaz_ingot", TOPAZ_INGOT);
        registerItem("topaz_crystal_shard", TOPAZ_CRYSTAL_SHARD);
        registerItem("topaz_apple", TOPAZ_APPLE);
        registerItem("topaz_potion", TOPAZ_POTION);
        registerItem("topaz_upgrade_smithing_template", TOPAZ_UPGRADE_SMITHING_TEMPLATE);
        registerItem("music_disc_fierce", MUSIC_DISC_FIERCE);

        registerItem("aquamarine_helmet", AQUAMARINE_HELMET);
        registerItem("aquamarine_chestplate", AQUAMARINE_CHESTPLATE);
        registerItem("aquamarine_leggings", AQUAMARINE_LEGGINGS);
        registerItem("aquamarine_boots", AQUAMARINE_BOOTS);
        registerItem("aquamarine_charm", AQUAMARINE_CHARM);
        registerItem("aquamarine", AQUAMARINE);
        registerItem("aquamarine_ingot", AQUAMARINE_INGOT);
        registerItem("aquamarine_crystal_shard", AQUAMARINE_CRYSTAL_SHARD);
        registerItem("aquamarine_fish", AQUAMARINE_FISH);
        registerItem("aquamarine_potion", AQUAMARINE_POTION);
        registerItem("aquamarine_upgrade_smithing_template", AQUAMARINE_UPGRADE_SMITHING_TEMPLATE);
        registerItem("music_disc_flow_of_the_abyss", MUSIC_DISC_FLOW_OF_THE_ABYSS);

        registerItem("sapphire_helmet", SAPPHIRE_HELMET);
        registerItem("sapphire_chestplate", SAPPHIRE_CHESTPLATE);
        registerItem("sapphire_leggings", SAPPHIRE_LEGGINGS);
        registerItem("sapphire_boots", SAPPHIRE_BOOTS);
        registerItem("sapphire_axe", SAPPHIRE_AXE);
        registerItem("sapphire_sword", SAPPHIRE_SWORD);
        registerItem("sapphire_charm", SAPPHIRE_CHARM);
        registerItem("sapphire", SAPPHIRE);
        registerItem("sapphire_ingot", SAPPHIRE_INGOT);
        registerItem("sapphire_crystal_shard", SAPPHIRE_CRYSTAL_SHARD);
        registerItem("sapphire_apple", SAPPHIRE_APPLE);
        registerItem("sapphire_potion", SAPPHIRE_POTION);
        registerItem("sapphire_upgrade_smithing_template", SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);
        registerItem("music_disc_soot", MUSIC_DISC_SOOT);

        registerItem("ruby_shovel", RUBY_SHOVEL);
        registerItem("ruby_axe", RUBY_AXE);
        registerItem("ruby_pickaxe", RUBY_PICKAXE);
        registerItem("ruby_hoe", RUBY_HOE);
        registerItem("ruby_sword", RUBY_SWORD);
        registerItem("ruby_charm", RUBY_CHARM);
        registerItem("ruby", RUBY);
        registerItem("ruby_ingot", RUBY_INGOT);
        registerItem("ruby_crystal_shard", RUBY_CRYSTAL_SHARD);
        registerItem("ruby_apple", RUBY_APPLE);
        registerItem("ruby_potion", RUBY_POTION);
        registerItem("ruby_upgrade_smithing_template", RUBY_UPGRADE_SMITHING_TEMPLATE);
        registerItem("music_disc_tanker_on_the_levantines", MUSIC_DISC_TANKER_ON_THE_LEVANTINES);

        registerItem("kyanite_helmet", KYANITE_HELMET);
        registerItem("kyanite_chestplate", KYANITE_CHESTPLATE);
        registerItem("kyanite_leggings", KYANITE_LEGGINGS);
        registerItem("kyanite_boots", KYANITE_BOOTS);
        registerItem("kyanite_axe", KYANITE_AXE);
        registerItem("kyanite_sword", KYANITE_SWORD);
        registerItem("kyanite_charm", KYANITE_CHARM);
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
        registerItem("ametrine_charm", AMETRINE_CHARM);
        registerItem("ametrine", AMETRINE);
        registerItem("ametrine_ingot", AMETRINE_INGOT);
        registerItem("ametrine_crystal_shard", AMETRINE_CRYSTAL_SHARD);
        registerItem("ametrine_apple", AMETRINE_APPLE);
        registerItem("ametrine_potion", AMETRINE_POTION);
        registerItem("ametrine_upgrade_smithing_template", AMETRINE_UPGRADE_SMITHING_TEMPLATE);
        registerItem("music_disc_appomattox", MUSIC_DISC_APPOMATTOX);

        registerItem("raw_necoium", RAW_NECOIUM);
        registerItem("necoium_ingot", NECOIUM_INGOT);
        registerItem("necoium_nugget", NECOIUM_NUGGET);
    }

    private static void registerMUItemGroup() {
        ItemGroup MYTHICTOOLSGROUP = FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades: Combat & Tools"))
                .icon(() -> new ItemStack(SAPPHIRE_AXE)).entries((displayContext, entries) -> {
                    entries.add(RUBY_SHOVEL);
                    entries.add(RUBY_PICKAXE);
                    entries.add(RUBY_AXE);
                    entries.add(RUBY_HOE);
                    entries.add(RUBY_SWORD);
                    entries.add(RUBY_CHARM);

                    entries.add(TOPAZ_SHOVEL);
                    entries.add(TOPAZ_PICKAXE);
                    entries.add(TOPAZ_AXE);
                    entries.add(TOPAZ_HOE);
                    entries.add(TOPAZ_SWORD);
                    entries.add(TOPAZ_HELMET);
                    entries.add(TOPAZ_CHESTPLATE);
                    entries.add(TOPAZ_LEGGINGS);
                    entries.add(TOPAZ_BOOTS);
                    entries.add(TOPAZ_CHARM);

                    entries.add(JADE_AXE);
                    entries.add(JADE_SWORD);
                    entries.add(JADE_HELMET);
                    entries.add(JADE_CHESTPLATE);
                    entries.add(JADE_LEGGINGS);
                    entries.add(JADE_BOOTS);
                    entries.add(JADE_CHARM);

                    entries.add(AQUAMARINE_HELMET);
                    entries.add(AQUAMARINE_CHESTPLATE);
                    entries.add(AQUAMARINE_LEGGINGS);
                    entries.add(AQUAMARINE_BOOTS);
                    entries.add(AQUAMARINE_CHARM);

                    entries.add(KYANITE_AXE);
                    entries.add(KYANITE_SWORD);
                    entries.add(KYANITE_HELMET);
                    entries.add(KYANITE_CHESTPLATE);
                    entries.add(KYANITE_LEGGINGS);
                    entries.add(KYANITE_BOOTS);
                    entries.add(KYANITE_CHARM);

                    entries.add(SAPPHIRE_AXE);
                    entries.add(SAPPHIRE_SWORD);
                    entries.add(SAPPHIRE_HELMET);
                    entries.add(SAPPHIRE_CHESTPLATE);
                    entries.add(SAPPHIRE_LEGGINGS);
                    entries.add(SAPPHIRE_BOOTS);
                    entries.add(SAPPHIRE_CHARM);

                    entries.add(AMETRINE_AXE);
                    entries.add(AMETRINE_SWORD);
                    entries.add(AMETRINE_HELMET);
                    entries.add(AMETRINE_CHESTPLATE);
                    entries.add(AMETRINE_LEGGINGS);
                    entries.add(AMETRINE_BOOTS);
                    entries.add(AMETRINE_CHARM);
                }).build();
        Registry.register(Registries.ITEM_GROUP, new Identifier(MythicUpgrades.MOD_ID, "mythictoolsgroup"), MYTHICTOOLSGROUP);

        ItemGroup MYTHICMISCGROUP = FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades: Misc"))
                .icon(() -> new ItemStack(SAPPHIRE)).entries((displayContext, entries) -> {
                    entries.add(RUBY);
                    entries.add(RUBY_INGOT);
                    entries.add(RUBY_CRYSTAL_SHARD);
                    entries.add(RUBY_APPLE);
                    entries.add(RUBY_POTION);
                    entries.add(RUBY_UPGRADE_SMITHING_TEMPLATE);
                    entries.add(MUSIC_DISC_TANKER_ON_THE_LEVANTINES);

                    entries.add(TOPAZ);
                    entries.add(TOPAZ_INGOT);
                    entries.add(TOPAZ_CRYSTAL_SHARD);
                    entries.add(TOPAZ_APPLE);
                    entries.add(TOPAZ_POTION);
                    entries.add(TOPAZ_UPGRADE_SMITHING_TEMPLATE);
                    entries.add(MUSIC_DISC_FIERCE);

                    entries.add(JADE);
                    entries.add(JADE_INGOT);
                    entries.add(JADE_CRYSTAL_SHARD);
                    entries.add(JADE_APPLE);
                    entries.add(JADE_POTION);
                    entries.add(JADE_UPGRADE_SMITHING_TEMPLATE);
                    entries.add(MUSIC_DISC_NELUMBO);

                    entries.add(AQUAMARINE);
                    entries.add(AQUAMARINE_INGOT);
                    entries.add(AQUAMARINE_CRYSTAL_SHARD);
                    entries.add(AQUAMARINE_FISH);
                    entries.add(AQUAMARINE_POTION);
                    entries.add(AQUAMARINE_UPGRADE_SMITHING_TEMPLATE);
                    entries.add(MUSIC_DISC_FLOW_OF_THE_ABYSS);

                    entries.add(KYANITE);
                    entries.add(KYANITE_INGOT);
                    entries.add(KYANITE_CRYSTAL_SHARD);
                    entries.add(KYANITE_POTION);
                    entries.add(KYANITE_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(SAPPHIRE);
                    entries.add(SAPPHIRE_INGOT);
                    entries.add(SAPPHIRE_CRYSTAL_SHARD);
                    entries.add(SAPPHIRE_APPLE);
                    entries.add(SAPPHIRE_POTION);
                    entries.add(SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);
                    entries.add(MUSIC_DISC_SOOT);

                    entries.add(AMETRINE);
                    entries.add(AMETRINE_INGOT);
                    entries.add(AMETRINE_CRYSTAL_SHARD);
                    entries.add(AMETRINE_APPLE);
                    entries.add(AMETRINE_POTION);
                    entries.add(AMETRINE_UPGRADE_SMITHING_TEMPLATE);
                    entries.add(MUSIC_DISC_APPOMATTOX);

                    entries.add(RAW_NECOIUM);
                    entries.add(NECOIUM_INGOT);
                    entries.add(NECOIUM_NUGGET);
                }).build();
        Registry.register(Registries.ITEM_GROUP, new Identifier(MythicUpgrades.MOD_ID, "mythicmiscgroup"), MYTHICMISCGROUP);

        ItemGroup MYTHICBLOCKGROUP = FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades: Blocks"))
                .icon(() -> new ItemStack(SAPPHIRE_BLOCK)).entries((displayContext, entries) -> {
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
                    entries.add(DEEPSLATE_TOPAZ_ORE);
                    entries.add(TOPAZ_CRYSTAL_BLOCK);
                    entries.add(BUDDING_TOPAZ_CRYSTAL);
                    entries.add(SMALL_TOPAZ_CRYSTAL_BUD);
                    entries.add(MEDIUM_TOPAZ_CRYSTAL_BUD);
                    entries.add(LARGE_TOPAZ_CRYSTAL_BUD);
                    entries.add(TOPAZ_CRYSTAL_CLUSTER);

                    entries.add(JADE_BLOCK);
                    entries.add(JADE_ORE);
                    entries.add(DEEPSLATE_JADE_ORE);
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