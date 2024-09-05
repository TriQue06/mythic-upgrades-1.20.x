package net.trique.mythicupgrades.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.trique.mythicupgrades.MythicUpgrades;

public class MUBlockTags {

    public static TagKey<Block> INCORRECT_FOR_AMETRINE_TOOL = create("incorrect_for_ametrine_tool");
    public static TagKey<Block> INCORRECT_FOR_AQUAMARINE_TOOL = create("incorrect_for_aquamarine_tool");
    public static TagKey<Block> INCORRECT_FOR_JADE_TOOL = create("incorrect_for_jade_tool");
    public static TagKey<Block> INCORRECT_FOR_PERIDOT_TOOL = create("incorrect_for_peridot_tool");
    public static TagKey<Block> INCORRECT_FOR_RUBY_TOOL = create("incorrect_for_ruby_tool");
    public static TagKey<Block> INCORRECT_FOR_SAPPHIRE_TOOL = create("incorrect_for_sapphire_tool");
    public static TagKey<Block> INCORRECT_FOR_TOPAZ_TOOL = create("incorrect_for_topaz_tool");

    public static TagKey<Block> SPELUNKER_HIGHLIGHTED = create("spelunker_highlighted");


    private static TagKey<Block> create(String string) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MythicUpgrades.MOD_ID, string));
    }
}
