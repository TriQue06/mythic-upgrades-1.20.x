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

import static net.trique.mythicupgrades.block.MUBlocks.*;
import static net.trique.mythicupgrades.item.MUItems.*;

import static net.trique.mythicupgrades.MythicUpgrades.*;

import java.util.ArrayList;

public class RegisterMUItems {
    private static final ArrayList<Item> ALL_ITEMS = new ArrayList<>();
    private static <T extends Item> void registerItem(String name, T item) {
        Item regItem = Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), (Item) item);
        ALL_ITEMS.add(regItem);
    }

    private static void registerMUItems() {
        registerItem("broken_jade_disc", BROKEN_JADE_DISC);
        registerItem("music_disc_nelumbo", MUSIC_DISC_NELUMBO);

        registerItem("broken_topaz_disc", BROKEN_TOPAZ_DISC);
        registerItem("music_disc_fierce", MUSIC_DISC_FIERCE);

        registerItem("broken_aquamarine_disc", BROKEN_AQUAMARINE_DISC);
        registerItem("music_disc_flow_of_the_abyss", MUSIC_DISC_FLOW_OF_THE_ABYSS);

        registerItem("broken_sapphire_disc", BROKEN_SAPPHIRE_DISC);
        registerItem("music_disc_soot", MUSIC_DISC_SOOT);

        registerItem("broken_ruby_disc", BROKEN_RUBY_DISC);
        registerItem("music_disc_tanker_on_the_levantines", MUSIC_DISC_TANKER_ON_THE_LEVANTINES);

        registerItem("broken_ametrine_disc", BROKEN_AMETRINE_DISC);
        registerItem("music_disc_appomattox", MUSIC_DISC_APPOMATTOX);

        registerItem("jade_axe", JADE_AXE);
        registerItem("jade_sword", JADE_SWORD);
        registerItem("jade_helmet", JADE_HELMET);
        registerItem("jade_chestplate", JADE_CHESTPLATE);
        registerItem("jade_leggings", JADE_LEGGINGS);
        registerItem("jade_boots", JADE_BOOTS);
        registerItem("jade", JADE);
        registerItem("jade_ingot", JADE_INGOT);
        registerItem("jade_upgrade_smithing_template", JADE_UPGRADE_SMITHING_TEMPLATE);

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
        registerItem("topaz_upgrade_smithing_template", TOPAZ_UPGRADE_SMITHING_TEMPLATE);

        registerItem("aquamarine_axe", AQUAMARINE_AXE);
        registerItem("aquamarine_sword", AQUAMARINE_SWORD);
        registerItem("aquamarine", AQUAMARINE);
        registerItem("aquamarine_ingot", AQUAMARINE_INGOT);
        registerItem("aquamarine_upgrade_smithing_template", AQUAMARINE_UPGRADE_SMITHING_TEMPLATE);

        registerItem("sapphire_axe", SAPPHIRE_AXE);
        registerItem("sapphire_sword", SAPPHIRE_SWORD);
        registerItem("sapphire_helmet", SAPPHIRE_HELMET);
        registerItem("sapphire_chestplate", SAPPHIRE_CHESTPLATE);
        registerItem("sapphire_leggings", SAPPHIRE_LEGGINGS);
        registerItem("sapphire_boots", SAPPHIRE_BOOTS);
        registerItem("sapphire", SAPPHIRE);
        registerItem("sapphire_ingot", SAPPHIRE_INGOT);
        registerItem("sapphire_upgrade_smithing_template", SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);

        registerItem("ruby_shovel", RUBY_SHOVEL);
        registerItem("ruby_axe", RUBY_AXE);
        registerItem("ruby_pickaxe", RUBY_PICKAXE);
        registerItem("ruby_hoe", RUBY_HOE);
        registerItem("ruby_sword", RUBY_SWORD);
        registerItem("ruby", RUBY);
        registerItem("ruby_ingot", RUBY_INGOT);
        registerItem("ruby_upgrade_smithing_template", RUBY_UPGRADE_SMITHING_TEMPLATE);

        registerItem("ametrine_axe", AMETRINE_AXE);
        registerItem("ametrine_sword", AMETRINE_SWORD);
        registerItem("ametrine_helmet", AMETRINE_HELMET);
        registerItem("ametrine_chestplate", AMETRINE_CHESTPLATE);
        registerItem("ametrine_leggings", AMETRINE_LEGGINGS);
        registerItem("ametrine_boots", AMETRINE_BOOTS);
        registerItem("ametrine", AMETRINE);
        registerItem("ametrine_ingot", AMETRINE_INGOT);
        registerItem("ametrine_upgrade_smithing_template", AMETRINE_UPGRADE_SMITHING_TEMPLATE);
    }

    private static void registerMUItemGroup() {
        ItemGroup MYTHICITEMGROUP = FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades"))
                .icon(() -> new ItemStack(MUItems.JADE_SWORD)).entries((displayContext, entries) -> {
                    entries.add(MUItems.BROKEN_JADE_DISC);
                    entries.add(MUItems.MUSIC_DISC_NELUMBO);

                    entries.add(MUItems.BROKEN_TOPAZ_DISC);
                    entries.add(MUItems.MUSIC_DISC_FIERCE);

                    entries.add(MUItems.BROKEN_AQUAMARINE_DISC);
                    entries.add(MUItems.MUSIC_DISC_FLOW_OF_THE_ABYSS);

                    entries.add(MUItems.BROKEN_SAPPHIRE_DISC);
                    entries.add(MUItems.MUSIC_DISC_SOOT);

                    entries.add(MUItems.BROKEN_RUBY_DISC);
                    entries.add(MUItems.MUSIC_DISC_TANKER_ON_THE_LEVANTINES);

                    entries.add(MUItems.BROKEN_AMETRINE_DISC);
                    entries.add(MUItems.MUSIC_DISC_APPOMATTOX);

                    entries.add(MUBlocks.JADE_BLOCK);
                    entries.add(MUBlocks.JADE_CRYSTAL_BLOCK);
                    entries.add(MUBlocks.JADE_ORE);
                    entries.add(MUBlocks.DEEPSLATE_JADE_ORE);
                    entries.add(MUItems.JADE_AXE);
                    entries.add(MUItems.JADE_SWORD);
                    entries.add(MUItems.JADE_HELMET);
                    entries.add(MUItems.JADE_CHESTPLATE);
                    entries.add(MUItems.JADE_LEGGINGS);
                    entries.add(MUItems.JADE_BOOTS);
                    entries.add(MUItems.JADE);
                    entries.add(MUItems.JADE_INGOT);
                    entries.add(MUItems.JADE_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(MUBlocks.TOPAZ_BLOCK);
                    entries.add(MUBlocks.TOPAZ_CRYSTAL_BLOCK);
                    entries.add(MUBlocks.TOPAZ_ORE);
                    entries.add(MUBlocks.DEEPSLATE_TOPAZ_ORE);
                    entries.add(MUItems.TOPAZ_SHOVEL);
                    entries.add(MUItems.TOPAZ_PICKAXE);
                    entries.add(MUItems.TOPAZ_AXE);
                    entries.add(MUItems.TOPAZ_HOE);
                    entries.add(MUItems.TOPAZ_SWORD);
                    entries.add(MUItems.TOPAZ_HELMET);
                    entries.add(MUItems.TOPAZ_CHESTPLATE);
                    entries.add(MUItems.TOPAZ_LEGGINGS);
                    entries.add(MUItems.TOPAZ_BOOTS);
                    entries.add(MUItems.TOPAZ);
                    entries.add(MUItems.TOPAZ_INGOT);
                    entries.add(MUItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(MUBlocks.AQUAMARINE_BLOCK);
                    entries.add(MUBlocks.AQUAMARINE_CRYSTAL_BLOCK);
                    entries.add(MUBlocks.AQUAMARINE_ORE);
                    entries.add(MUBlocks.DEEPSLATE_AQUAMARINE_ORE);
                    entries.add(MUItems.AQUAMARINE_AXE);
                    entries.add(MUItems.AQUAMARINE_SWORD);
                    entries.add(MUItems.AQUAMARINE);
                    entries.add(MUItems.AQUAMARINE_INGOT);
                    entries.add(MUItems.AQUAMARINE_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(MUBlocks.SAPPHIRE_BLOCK);
                    entries.add(MUBlocks.SAPPHIRE_CRYSTAL_BLOCK);
                    entries.add(MUBlocks.SAPPHIRE_ORE);
                    entries.add(MUItems.SAPPHIRE_AXE);
                    entries.add(MUItems.SAPPHIRE_SWORD);
                    entries.add(MUItems.SAPPHIRE_HELMET);
                    entries.add(MUItems.SAPPHIRE_CHESTPLATE);
                    entries.add(MUItems.SAPPHIRE_LEGGINGS);
                    entries.add(MUItems.SAPPHIRE_BOOTS);
                    entries.add(MUItems.SAPPHIRE);
                    entries.add(MUItems.SAPPHIRE_INGOT);
                    entries.add(MUItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(MUBlocks.RUBY_BLOCK);
                    entries.add(MUBlocks.RUBY_CRYSTAL_BLOCK);
                    entries.add(MUBlocks.RUBY_ORE);
                    entries.add(MUItems.RUBY_SHOVEL);
                    entries.add(MUItems.RUBY_PICKAXE);
                    entries.add(MUItems.RUBY_AXE);
                    entries.add(MUItems.RUBY_HOE);
                    entries.add(MUItems.RUBY_SWORD);
                    entries.add(MUItems.RUBY);
                    entries.add(MUItems.RUBY_INGOT);
                    entries.add(MUItems.RUBY_UPGRADE_SMITHING_TEMPLATE);

                    entries.add(MUBlocks.AMETRINE_BLOCK);
                    entries.add(MUBlocks.AMETRINE_CRYSTAL_BLOCK);
                    entries.add(MUBlocks.AMETRINE_ORE);
                    entries.add(MUItems.AMETRINE_AXE);
                    entries.add(MUItems.AMETRINE_SWORD);
                    entries.add(MUItems.AMETRINE_HELMET);
                    entries.add(MUItems.AMETRINE_CHESTPLATE);
                    entries.add(MUItems.AMETRINE_LEGGINGS);
                    entries.add(MUItems.AMETRINE_BOOTS);
                    entries.add(MUItems.AMETRINE);
                    entries.add(MUItems.AMETRINE_INGOT);
                    entries.add(MUItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE);
                }).build();
        Registry.register(Registries.ITEM_GROUP, new Identifier(MythicUpgrades.MOD_ID, "mythicitemgroup"), MYTHICITEMGROUP);
    }

    public static void registerMythicItems() {
        registerMUItems();
        registerMUItemGroup();
        LOGGER.info("Registering Mythic Items for " + MOD_ID);
    }
}