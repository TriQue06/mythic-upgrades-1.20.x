package net.trique.mythicupgrades.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.trique.mythicupgrades.MythicUpgrades;

public class MUBlocks {
    public static final Block AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_LIGHT_BLUE).strength(5.0f, 1200.0f).sound(SoundType.METAL)));

    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).strength(3.0f, 1200.0f), UniformInt.of(32, 64)));

    public static final Block DEEPSLATE_AQUAMARINE_ORE = registerBlock("deepslate_aquamarine_ore",
            new DropExperienceBlock(BlockBehaviour.Properties.copy(AQUAMARINE_ORE).mapColor(MapColor.DEEPSLATE).strength(4.5f, 1200.0f).sound(SoundType.DEEPSLATE), UniformInt.of(32, 64)));

    public static final Block AQUAMARINE_CRYSTAL_BLOCK = registerBlock("aquamarine_crystal_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.COLOR_LIGHT_BLUE).sound(SoundType.AMETHYST).strength(3.0f, 1200.0f)));

    public static final Block AQUAMARINE_CRYSTAL_CLUSTER = registerBlock("aquamarine_crystal_cluster",
            new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel(state -> 5).pushReaction(PushReaction.DESTROY)));

    public static final Block PERIDOT_BLOCK = registerBlock("peridot_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_LIGHT_GREEN).strength(5.0f, 1200.0f).sound(SoundType.METAL)));

    public static final Block PERIDOT_ORE = registerBlock("peridot_ore",
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).strength(3.0f, 1200.0f), UniformInt.of(32, 64)));

    public static final Block DEEPSLATE_PERIDOT_ORE = registerBlock("deepslate_peridot_ore",
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.DEEPSLATE).strength(4.5f, 1200.0f).sound(SoundType.DEEPSLATE), UniformInt.of(32, 64)));

    public static final Block PERIDOT_CRYSTAL_BLOCK = registerBlock("peridot_crystal_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST).strength(3.0f, 1200.0f)));

    public static final Block PERIDOT_CRYSTAL_CLUSTER = registerBlock("peridot_crystal_cluster",
            new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel(state -> 5).pushReaction(PushReaction.DESTROY)));


    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_RED).strength(5.0f, 1200.0f).sound(SoundType.METAL)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.CRIMSON_NYLIUM).strength(3.0f, 1200.0f), UniformInt.of(32, 64)));

    public static final Block RUBY_CRYSTAL_BLOCK = registerBlock("ruby_crystal_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.NETHER).sound(SoundType.AMETHYST).strength(3.0f, 1200.0f)));

    public static final Block RUBY_CRYSTAL_CLUSTER = registerBlock("ruby_crystal_cluster",
            new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel(state -> 5).pushReaction(PushReaction.DESTROY)));


    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.LAPIS).strength(5.0f, 1200.0f).sound(SoundType.METAL)));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.CRIMSON_NYLIUM).strength(3.0f, 1200.0f), UniformInt.of(32, 64)));

    public static final Block SAPPHIRE_CRYSTAL_BLOCK = registerBlock("sapphire_crystal_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.LAPIS).sound(SoundType.AMETHYST).strength(3.0f, 1200.0f)));

    public static final Block SAPPHIRE_CRYSTAL_CLUSTER = registerBlock("sapphire_crystal_cluster",
            new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.LAPIS).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel(state -> 5).pushReaction(PushReaction.DESTROY)));


    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_ORANGE).strength(5.0f, 1200.0f).sound(SoundType.METAL)));

    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.CRIMSON_NYLIUM).strength(3.0f, 1200.0f), UniformInt.of(32, 64)));

    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.DEEPSLATE).strength(4.5f, 1200.0f).sound(SoundType.DEEPSLATE), UniformInt.of(32, 64)));

    public static final Block TOPAZ_CRYSTAL_BLOCK = registerBlock("topaz_crystal_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).strength(3.0f, 1200.0f)));
    
    public static final Block TOPAZ_CRYSTAL_CLUSTER = registerBlock("topaz_crystal_cluster",
            new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel(state -> 5).pushReaction(PushReaction.DESTROY)));


    public static final Block AMETRINE_BLOCK = registerBlock("ametrine_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_PURPLE).strength(5.0f, 1200.0f).sound(SoundType.METAL)));

    public static final Block AMETRINE_ORE = registerBlock("ametrine_ore",
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.SAND).strength(6.0f, 1200.0f), UniformInt.of(32, 64)));

    public static final Block AMETRINE_CRYSTAL_BLOCK = registerBlock("ametrine_crystal_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST).strength(3.0f, 1200.0f)));

    public static final Block AMETRINE_CRYSTAL_CLUSTER = registerBlock("ametrine_crystal_cluster",
            new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel(state -> 5).pushReaction(PushReaction.DESTROY)));


    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.PLANT).strength(5.0f, 1200.0f).sound(SoundType.METAL)));

    public static final Block JADE_ORE = registerBlock("jade_ore",
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.PLANT).strength(6.0f, 1200.0f), UniformInt.of(32, 64)));

    public static final Block JADE_CRYSTAL_BLOCK = registerBlock("jade_crystal_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PLANT).sound(SoundType.AMETHYST).strength(3.0f, 1200.0f)));

    public static final Block JADE_CRYSTAL_CLUSTER = registerBlock("jade_crystal_cluster",
            new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel(state -> 5).pushReaction(PushReaction.DESTROY)));

    
    public static final Block RAW_NECOIUM_BLOCK = registerBlock("raw_necoium_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).mapColor(MapColor.COLOR_PURPLE).strength(5.0f, 1200.0f).instrument(NoteBlockInstrument.FLUTE)));

    public static final Block NECOIUM_BLOCK = registerBlock("necoium_block",
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_PURPLE).strength(5.0f, 1200.0f).sound(SoundType.METAL).instrument(NoteBlockInstrument.FLUTE)));

    public static final Block NECOIUM_ORE = registerBlock("necoium_ore",
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.SAND).strength(6.0f, 1200.0f).instrument(NoteBlockInstrument.FLUTE), UniformInt.of(32, 64)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MythicUpgrades.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MythicUpgrades.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerMythicBlocks() {
        MythicUpgrades.LOGGER.info("Registering Mythic Blocks for " + MythicUpgrades.MOD_ID);
    }
}