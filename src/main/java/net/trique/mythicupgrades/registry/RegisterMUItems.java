package net.trique.mythicupgrades.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

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
        registerItem("broken_sapphire_disc", BROKEN_SAPPHIRE_DISC);
        registerItem("broken_jade_disc", BROKEN_JADE_DISC);
        registerItem("broken_ametrine_disc", BROKEN_AMETRINE_DISC);
        registerItem("broken_ruby_disc", BROKEN_RUBY_DISC);
        registerItem("broken_topaz_disc", BROKEN_TOPAZ_DISC);
        registerItem("broken_aquamarine_disc", BROKEN_AQUAMARINE_DISC);

        registerItem("music_disc_soot", MUSIC_DISC_SOOT);
        registerItem("music_disc_appomattox", MUSIC_DISC_APPOMATTOX);
        registerItem("music_disc_fierce", MUSIC_DISC_FIERCE);
        registerItem("music_disc_nelumbo", MUSIC_DISC_NELUMBO);
        registerItem("music_disc_flow_of_the_abyss", MUSIC_DISC_FLOW_OF_THE_ABYSS);
        registerItem("music_disc_tanker_on_the_levantines", MUSIC_DISC_TANKER_ON_THE_LEVANTINES);

        registerItem("sapphire", SAPPHIRE);
        registerItem("sapphire_ingot", SAPPHIRE_INGOT);
        registerItem("ruby", RUBY);
        registerItem("ruby_ingot", RUBY_INGOT);
        registerItem("jade", JADE);
        registerItem("jade_ingot", JADE_INGOT);
        registerItem("topaz", TOPAZ);
        registerItem("topaz_ingot", TOPAZ_INGOT);
        registerItem("ametrine", AMETRINE);
        registerItem("ametrine_ingot", AMETRINE_INGOT);
        registerItem("aquamarine", AQUAMARINE);
        registerItem("aquamarine_ingot", AQUAMARINE_INGOT);

        registerItem("sapphire_axe", SAPPHIRE_AXE);
        registerItem("sapphire_sword", SAPPHIRE_SWORD);
        registerItem("sapphire_helmet", SAPPHIRE_HELMET);
        registerItem("sapphire_chestplate", SAPPHIRE_CHESTPLATE);
        registerItem("sapphire_leggings", SAPPHIRE_LEGGINGS);
        registerItem("sapphire_boots", SAPPHIRE_BOOTS);

        registerItem("aquamarine_axe", AQUAMARINE_AXE);
        registerItem("aquamarine_sword", AQUAMARINE_SWORD);

        registerItem("ruby_axe", RUBY_AXE);
        registerItem("ruby_sword", RUBY_SWORD);
        registerItem("ruby_shovel", RUBY_SHOVEL);
        registerItem("ruby_pickaxe", RUBY_PICKAXE);
        registerItem("ruby_hoe", RUBY_HOE);

        registerItem("ametrine_axe", AMETRINE_AXE);
        registerItem("ametrine_sword", AMETRINE_SWORD);
        registerItem("ametrine_helmet", AMETRINE_HELMET);
        registerItem("ametrine_chestplate", AMETRINE_CHESTPLATE);
        registerItem("ametrine_leggings", AMETRINE_LEGGINGS);
        registerItem("ametrine_boots", AMETRINE_BOOTS);

        registerItem("jade_axe", JADE_AXE);
        registerItem("jade_sword", JADE_SWORD);
        registerItem("jade_helmet", JADE_HELMET);
        registerItem("jade_chestplate", JADE_CHESTPLATE);
        registerItem("jade_leggings", JADE_LEGGINGS);
        registerItem("jade_boots", JADE_BOOTS);

        registerItem("topaz_axe", TOPAZ_AXE);
        registerItem("topaz_sword", TOPAZ_SWORD);
        registerItem("topaz_hoe", TOPAZ_HOE);
        registerItem("topaz_pickaxe", TOPAZ_PICKAXE);
        registerItem("topaz_shovel", TOPAZ_SHOVEL);
        registerItem("topaz_helmet", TOPAZ_HELMET);
        registerItem("topaz_chestplate", TOPAZ_CHESTPLATE);
        registerItem("topaz_leggings", TOPAZ_LEGGINGS);
        registerItem("topaz_boots", TOPAZ_BOOTS);

        registerItem("topaz_upgrade_smithing_template", TOPAZ_UPGRADE_SMITHING_TEMPLATE);
        registerItem("aquamarine_upgrade_smithing_template", AQUAMARINE_UPGRADE_SMITHING_TEMPLATE);
        registerItem("sapphire_upgrade_smithing_template", SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);
        registerItem("ruby_upgrade_smithing_template", RUBY_UPGRADE_SMITHING_TEMPLATE);
        registerItem("ametrine_upgrade_smithing_template", AMETRINE_UPGRADE_SMITHING_TEMPLATE);
        registerItem("jade_upgrade_smithing_template", JADE_UPGRADE_SMITHING_TEMPLATE);

    }

    private static void registerMUItemGroup() {
        ItemGroup MYTHICITEMGROUP = FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades"))
                .icon(() -> new ItemStack(JADE_SWORD)).entries((displayContext, entries) -> {
                    for (Item e : ALL_ITEMS) {
                        entries.add(e);
                    }
                    entries.add(AMETRINE_BLOCK);
                    entries.add(SAPPHIRE_BLOCK);
                    entries.add(AQUAMARINE_BLOCK);
                    entries.add(RUBY_BLOCK);
                    entries.add(JADE_BLOCK);
                    entries.add(TOPAZ_BLOCK);

                    entries.add(SAPPHIRE_ORE);
                    entries.add(RUBY_ORE);

                    entries.add(AMETRINE_ORE);

                    entries.add(JADE_ORE);
                    entries.add(DEEPSLATE_JADE_ORE);
                    entries.add(AQUAMARINE_ORE);
                    entries.add(DEEPSLATE_AQUAMARINE_ORE);
                    entries.add(TOPAZ_ORE);
                    entries.add(DEEPSLATE_TOPAZ_ORE);
                }).build();
        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "mythicitemgroup"), MYTHICITEMGROUP);
    }

    public static void registerMythicItems() {
        registerMUItems();
        registerMUItemGroup();
        LOGGER.info("Registering Mythic Items for " + MOD_ID);
    }
}