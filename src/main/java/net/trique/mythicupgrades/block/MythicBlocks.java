package net.trique.mythicupgrades.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.trique.mythicupgrades.MythicUpgrades;

public class MythicBlocks {

    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.LIME).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block JADE_RUINS = registerBlock("jade_ruins",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().luminance(value -> 10).strength(3.0f, 1200.0f), UniformIntProvider.create(8, 16)));

    public static final Block JADE_ORE = registerBlock("jade_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().strength(3.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 1200.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(2, 8)));

    public static final Block TOPAZ_RUINS = registerBlock("topaz_ruins",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().luminance(value -> 10).strength(3.0f, 1200.0f), UniformIntProvider.create(8, 16)));


    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().strength(3.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(TOPAZ_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 1200.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(2, 8)));

    public static final Block AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.LIGHT_BLUE).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block AQUAMARINE_RUINS = registerBlock("aquamarine_ruins",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().luminance(value -> 10).strength(3.0f, 1200.0f), UniformIntProvider.create(8, 16)));

    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().strength(3.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block DEEPSLATE_AQUAMARINE_ORE = registerBlock("deepslate_aquamarine_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(AQUAMARINE_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 1200.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(2, 8)));

    public static final Block AMETRINE_BLOCK = registerBlock("ametrine_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.PURPLE).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block AMETRINE_RUINS = registerBlock("ametrine_ruins",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().luminance(value -> 10).strength(3.0f, 1200.0f), UniformIntProvider.create(8, 16)));

    public static final Block AMETRINE_ORE = registerBlock("ametrine_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.PALE_YELLOW).requiresTool().strength(6.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.LAPIS_BLUE).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block SAPPHIRE_RUINS = registerBlock("sapphire_ruins",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().luminance(value -> 10).strength(3.0f, 1200.0f), UniformIntProvider.create(8, 16)));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().strength(3.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DARK_RED).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block RUBY_RUINS = registerBlock("ruby_ruins",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().luminance(value -> 10).strength(3.0f, 1200.0f), UniformIntProvider.create(8, 16)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().strength(3.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MythicUpgrades.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MythicUpgrades.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerMythicBlocks() {
        MythicUpgrades.LOGGER.info("Registering Mythic Blocks for " + MythicUpgrades.MOD_ID);
    }
}