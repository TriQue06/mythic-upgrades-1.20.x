package net.trique.mythicupgrades.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.trique.mythicupgrades.MythicUpgrades;

public class MUBlocks {
    public static final Block AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.LIGHT_BLUE).strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).strength(3.0f, 1200.0f)));

    public static final Block DEEPSLATE_AQUAMARINE_ORE = registerBlock("deepslate_aquamarine_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(AQUAMARINE_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 1200.0f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block AQUAMARINE_CRYSTAL_BLOCK = registerBlock("aquamarine_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_BLUE).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(3.0f, 1200.0f)));

    public static final Block AQUAMARINE_CRYSTAL_CLUSTER = registerBlock("aquamarine_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.YELLOW).strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block CITRINE_ORE = registerBlock("citrine_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).strength(3.0f, 1200.0f)));

    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(CITRINE_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 1200.0f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block CITRINE_CRYSTAL_BLOCK = registerBlock("citrine_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.YELLOW).strength(3.0f, 1200.0f)));

    public static final Block CITRINE_CRYSTAL_CLUSTER = registerBlock("citrine_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block PERIDOT_BLOCK = registerBlock("peridot_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.LIME).strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block PERIDOT_ORE = registerBlock("peridot_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).strength(3.0f, 1200.0f)));

    public static final Block DEEPSLATE_PERIDOT_ORE = registerBlock("deepslate_peridot_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 1200.0f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block PERIDOT_CRYSTAL_BLOCK = registerBlock("peridot_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.LIME).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(3.0f, 1200.0f)));

    public static final Block PERIDOT_CRYSTAL_CLUSTER = registerBlock("peridot_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.LIME).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block ZIRCON_BLOCK = registerBlock("zircon_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.BLUE).strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block ZIRCON_ORE = registerBlock("zircon_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).strength(3.0f, 1200.0f)));

    public static final Block DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(ZIRCON_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 1200.0f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block ZIRCON_CRYSTAL_BLOCK = registerBlock("zircon_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.BLUE).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(3.0f, 1200.0f)));

    public static final Block ZIRCON_CRYSTAL_CLUSTER = registerBlock("zircon_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.BLUE).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.RED).strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.DULL_RED).strength(3.0f, 1200.0f)));

    public static final Block RUBY_CRYSTAL_BLOCK = registerBlock("ruby_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.DARK_RED).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(3.0f, 1200.0f)));

    public static final Block RUBY_CRYSTAL_CLUSTER = registerBlock("ruby_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.LAPIS_BLUE).strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.DULL_RED).strength(3.0f, 1200.0f)));

    public static final Block SAPPHIRE_CRYSTAL_BLOCK = registerBlock("sapphire_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.LAPIS_BLUE).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(3.0f, 1200.0f)));

    public static final Block SAPPHIRE_CRYSTAL_CLUSTER = registerBlock("sapphire_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.LAPIS_BLUE).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.ORANGE).strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.DULL_RED).strength(3.0f, 1200.0f)));

    public static final Block TOPAZ_CRYSTAL_BLOCK = registerBlock("topaz_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).strength(3.0f, 1200.0f)));
    
    public static final Block TOPAZ_CRYSTAL_CLUSTER = registerBlock("topaz_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_ORANGE).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block AMETRINE_BLOCK = registerBlock("ametrine_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.PURPLE).strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block AMETRINE_ORE = registerBlock("ametrine_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.PALE_YELLOW).strength(6.0f, 1200.0f)));

    public static final Block AMETRINE_CRYSTAL_BLOCK = registerBlock("ametrine_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(3.0f, 1200.0f)));

    public static final Block AMETRINE_CRYSTAL_CLUSTER = registerBlock("ametrine_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DARK_GREEN).strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block JADE_ORE = registerBlock("jade_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 32), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.DARK_GREEN).strength(6.0f, 1200.0f)));

    public static final Block JADE_CRYSTAL_BLOCK = registerBlock("jade_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.DARK_GREEN).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(3.0f, 1200.0f)));

    public static final Block JADE_CRYSTAL_CLUSTER = registerBlock("jade_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));

    
    public static final Block RAW_NECOIUM_BLOCK = registerBlock("raw_necoium_block",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK).mapColor(MapColor.PURPLE).strength(5.0f, 1200.0f).instrument(Instrument.FLUTE)));

    public static final Block NECOIUM_BLOCK = registerBlock("necoium_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.PURPLE).strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL).instrument(Instrument.FLUTE)));

    public static final Block NECOIUM_ORE = registerBlock("necoium_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.PALE_YELLOW).strength(6.0f, 1200.0f).instrument(Instrument.FLUTE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MythicUpgrades.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(MythicUpgrades.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerMythicBlocks() {
        MythicUpgrades.LOGGER.info("Registering Mythic Blocks for " + MythicUpgrades.MOD_ID);
    }
}