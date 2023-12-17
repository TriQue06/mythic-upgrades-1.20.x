package net.trique.mythicupgrades.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.trique.mythicupgrades.MythicUpgrades;

public class MUBlocks {

    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.LIME).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block JADE_ORE = registerBlock("jade_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().strength(3.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 1200.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(2, 8)));

    public static final Block BUDDING_JADE_CRYSTAL = registerBlock("budding_jade_crystal",
            new BuddingJadeCrystalBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIME).ticksRandomly().strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block JADE_CRYSTAL_BLOCK = registerBlock("jade_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.LIME).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(3.0f, 1200.0f)));

    public static final Block JADE_CRYSTAL_CLUSTER = registerBlock("jade_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.LIME).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LARGE_JADE_CRYSTAL_BUD = registerBlock("large_jade_crystal_bud",
            new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(JADE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 4).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MEDIUM_JADE_CRYSTAL_BUD = registerBlock("medium_jade_crystal_bud",
            new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(JADE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 2).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SMALL_JADE_CRYSTAL_BUD = registerBlock("small_jade_crystal_bud",
            new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(JADE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 1).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().strength(3.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(TOPAZ_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 1200.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(2, 8)));

    public static final Block BUDDING_TOPAZ_CRYSTAL = registerBlock("budding_topaz_crystal",
            new BuddingTopazCrystalBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_ORANGE).ticksRandomly().strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TOPAZ_CRYSTAL_BLOCK = registerBlock("topaz_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).requiresTool().strength(3.0f, 1200.0f)));
    
    public static final Block TOPAZ_CRYSTAL_CLUSTER = registerBlock("topaz_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_ORANGE).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LARGE_TOPAZ_CRYSTAL_BUD = registerBlock("large_topaz_crystal_bud",
            new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(TOPAZ_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 4).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MEDIUM_TOPAZ_CRYSTAL_BUD = registerBlock("medium_topaz_crystal_bud",
            new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(TOPAZ_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 2).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SMALL_TOPAZ_CRYSTAL_BUD = registerBlock("small_topaz_crystal_bud",
            new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(TOPAZ_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 1).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.LIGHT_BLUE).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().strength(3.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block DEEPSLATE_AQUAMARINE_ORE = registerBlock("deepslate_aquamarine_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(AQUAMARINE_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 1200.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(2, 8)));

    public static final Block BUDDING_AQUAMARINE_CRYSTAL = registerBlock("budding_aquamarine_crystal",
            new BuddingAquamarineCrystalBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).ticksRandomly().strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block AQUAMARINE_CRYSTAL_BLOCK = registerBlock("aquamarine_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.LIGHT_BLUE).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().strength(3.0f, 1200.0f)));

    public static final Block AQUAMARINE_CRYSTAL_CLUSTER = registerBlock("aquamarine_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LARGE_AQUAMARINE_CRYSTAL_BUD = registerBlock("large_aquamarine_crystal_bud",
            new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(AQUAMARINE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 4).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MEDIUM_AQUAMARINE_CRYSTAL_BUD = registerBlock("medium_aquamarine_crystal_bud",
            new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(AQUAMARINE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 2).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SMALL_AQUAMARINE_CRYSTAL_BUD = registerBlock("small_aquamarine_crystal_bud",
            new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(AQUAMARINE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 1).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.LAPIS_BLUE).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().strength(3.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block BUDDING_SAPPHIRE_CRYSTAL = registerBlock("budding_sapphire_crystal",
            new BuddingSapphireCrystalBlock(AbstractBlock.Settings.create().mapColor(MapColor.LAPIS_BLUE).ticksRandomly().strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SAPPHIRE_CRYSTAL_BLOCK = registerBlock("sapphire_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.LAPIS_BLUE).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().strength(3.0f, 1200.0f)));

    public static final Block SAPPHIRE_CRYSTAL_CLUSTER = registerBlock("sapphire_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.LAPIS_BLUE).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LARGE_SAPPHIRE_CRYSTAL_BUD = registerBlock("large_sapphire_crystal_bud",
            new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(SAPPHIRE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 4).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MEDIUM_SAPPHIRE_CRYSTAL_BUD = registerBlock("medium_sapphire_crystal_bud",
            new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(SAPPHIRE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 2).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SMALL_SAPPHIRE_CRYSTAL_BUD = registerBlock("small_sapphire_crystal_bud",
            new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(SAPPHIRE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 1).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DARK_RED).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool().strength(3.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block BUDDING_RUBY_CRYSTAL = registerBlock("budding_ruby_crystal",
            new BuddingRubyCrystalBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).ticksRandomly().strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RUBY_CRYSTAL_BLOCK = registerBlock("ruby_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.DARK_RED).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().strength(3.0f, 1200.0f)));

    public static final Block RUBY_CRYSTAL_CLUSTER = registerBlock("ruby_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LARGE_RUBY_CRYSTAL_BUD = registerBlock("large_ruby_crystal_bud",
            new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(RUBY_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 4).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MEDIUM_RUBY_CRYSTAL_BUD = registerBlock("medium_ruby_crystal_bud",
            new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(RUBY_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 2).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SMALL_RUBY_CRYSTAL_BUD = registerBlock("small_ruby_crystal_bud",
            new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(RUBY_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 1).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block AMETRINE_BLOCK = registerBlock("ametrine_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.PURPLE).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block AMETRINE_ORE = registerBlock("ametrine_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.PALE_YELLOW).requiresTool().strength(6.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block BUDDING_AMETRINE_CRYSTAL = registerBlock("budding_ametrine_crystal",
            new BuddingAmetrineCrystalBlock(AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).ticksRandomly().strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block AMETRINE_CRYSTAL_BLOCK = registerBlock("ametrine_crystal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PURPLE).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().strength(3.0f, 1200.0f)));

    public static final Block AMETRINE_CRYSTAL_CLUSTER = registerBlock("ametrine_crystal_cluster",
            new AmethystClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LARGE_AMETRINE_CRYSTAL_BUD = registerBlock("large_ametrine_crystal_bud",
            new AmethystClusterBlock(5, 3, AbstractBlock.Settings.copy(AMETRINE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 4).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MEDIUM_AMETRINE_CRYSTAL_BUD = registerBlock("medium_ametrine_crystal_bud",
            new AmethystClusterBlock(4, 3, AbstractBlock.Settings.copy(AMETRINE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 2).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SMALL_AMETRINE_CRYSTAL_BUD = registerBlock("small_ametrine_crystal_bud",
            new AmethystClusterBlock(3, 4, AbstractBlock.Settings.copy(AMETRINE_CRYSTAL_CLUSTER).sounds(BlockSoundGroup.AMETHYST_CLUSTER).solid().luminance(state -> 1).pistonBehavior(PistonBehavior.DESTROY)));

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