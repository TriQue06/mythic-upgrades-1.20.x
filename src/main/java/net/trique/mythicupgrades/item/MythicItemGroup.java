package net.trique.mythicupgrades.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.block.MythicBlocks;

public class MythicItemGroup {
    public static ItemGroup MYTHICITEMGROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(MythicUpgrades.MOD_ID, "mythicitemgroup"),
            FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades"))
                    .icon(() -> new ItemStack(MythicItems.AMETRINE_SWORD)).entries((displayContext, entries) -> {

                        entries.add(MythicItems.BROKEN_JADE_DISC);
                        entries.add(MythicItems.MUSIC_DISC_NELUMBO);

                        entries.add(MythicItems.BROKEN_TOPAZ_DISC);
                        entries.add(MythicItems.MUSIC_DISC_FIERCE);

                        entries.add(MythicItems.BROKEN_AQUAMARINE_DISC);
                        entries.add(MythicItems.MUSIC_DISC_FLOW_OF_THE_ABYSS);

                        entries.add(MythicItems.BROKEN_SAPPHIRE_DISC);
                        entries.add(MythicItems.MUSIC_DISC_SOOT);

                        entries.add(MythicItems.BROKEN_RUBY_DISC);
                        entries.add(MythicItems.MUSIC_DISC_TANKER_ON_THE_LEVANTINES);

                        entries.add(MythicItems.BROKEN_AMETRINE_DISC);
                        entries.add(MythicItems.MUSIC_DISC_APPOMATTOX);

                        entries.add(MythicItems.JADE_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(MythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(MythicItems.AQUAMARINE_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(MythicItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(MythicItems.RUBY_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(MythicItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(MythicBlocks.JADE_BLOCK);
                        entries.add(MythicBlocks.JADE_RUINS);
                        entries.add(MythicBlocks.JADE_ORE);
                        entries.add(MythicBlocks.DEEPSLATE_JADE_ORE);
                        entries.add(MythicItems.JADE_AXE);
                        entries.add(MythicItems.JADE_SWORD);
                        entries.add(MythicItems.JADE_HELMET);
                        entries.add(MythicItems.JADE_CHESTPLATE);
                        entries.add(MythicItems.JADE_LEGGINGS);
                        entries.add(MythicItems.JADE_BOOTS);
                        entries.add(MythicItems.JADE);
                        entries.add(MythicItems.JADE_INGOT);

                        entries.add(MythicBlocks.TOPAZ_BLOCK);
                        entries.add(MythicBlocks.TOPAZ_RUINS);
                        entries.add(MythicBlocks.TOPAZ_ORE);
                        entries.add(MythicBlocks.DEEPSLATE_TOPAZ_ORE);
                        entries.add(MythicItems.TOPAZ_SHOVEL);
                        entries.add(MythicItems.TOPAZ_PICKAXE);
                        entries.add(MythicItems.TOPAZ_AXE);
                        entries.add(MythicItems.TOPAZ_HOE);
                        entries.add(MythicItems.TOPAZ_SWORD);
                        entries.add(MythicItems.TOPAZ_HELMET);
                        entries.add(MythicItems.TOPAZ_CHESTPLATE);
                        entries.add(MythicItems.TOPAZ_LEGGINGS);
                        entries.add(MythicItems.TOPAZ_BOOTS);
                        entries.add(MythicItems.TOPAZ);
                        entries.add(MythicItems.TOPAZ_INGOT);

                        entries.add(MythicBlocks.AQUAMARINE_BLOCK);
                        entries.add(MythicBlocks.AQUAMARINE_RUINS);
                        entries.add(MythicBlocks.AQUAMARINE_ORE);
                        entries.add(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE);
                        entries.add(MythicItems.AQUAMARINE_AXE);
                        entries.add(MythicItems.AQUAMARINE_SWORD);
                        entries.add(MythicItems.AQUAMARINE);
                        entries.add(MythicItems.AQUAMARINE_INGOT);

                        entries.add(MythicBlocks.SAPPHIRE_BLOCK);
                        entries.add(MythicBlocks.SAPPHIRE_RUINS);
                        entries.add(MythicBlocks.SAPPHIRE_ORE);
                        entries.add(MythicItems.SAPPHIRE_AXE);
                        entries.add(MythicItems.SAPPHIRE_SWORD);
                        entries.add(MythicItems.SAPPHIRE_HELMET);
                        entries.add(MythicItems.SAPPHIRE_CHESTPLATE);
                        entries.add(MythicItems.SAPPHIRE_LEGGINGS);
                        entries.add(MythicItems.SAPPHIRE_BOOTS);
                        entries.add(MythicItems.SAPPHIRE);
                        entries.add(MythicItems.SAPPHIRE_INGOT);

                        entries.add(MythicBlocks.RUBY_BLOCK);
                        entries.add(MythicBlocks.RUBY_RUINS);
                        entries.add(MythicBlocks.RUBY_ORE);
                        entries.add(MythicItems.RUBY_SHOVEL);
                        entries.add(MythicItems.RUBY_PICKAXE);
                        entries.add(MythicItems.RUBY_AXE);
                        entries.add(MythicItems.RUBY_HOE);
                        entries.add(MythicItems.RUBY_SWORD);
                        entries.add(MythicItems.RUBY);
                        entries.add(MythicItems.RUBY_INGOT);

                        entries.add(MythicBlocks.AMETRINE_BLOCK);
                        entries.add(MythicBlocks.AMETRINE_RUINS);
                        entries.add(MythicBlocks.AMETRINE_ORE);
                        entries.add(MythicItems.AMETRINE_AXE);
                        entries.add(MythicItems.AMETRINE_SWORD);
                        entries.add(MythicItems.AMETRINE_HELMET);
                        entries.add(MythicItems.AMETRINE_CHESTPLATE);
                        entries.add(MythicItems.AMETRINE_LEGGINGS);
                        entries.add(MythicItems.AMETRINE_BOOTS);
                        entries.add(MythicItems.AMETRINE);
                        entries.add(MythicItems.AMETRINE_INGOT);

                    }).build());

    public static void registerMythicGroups() {}
}