package net.trique.mythicupgrades.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.block.MUBlocks;

import java.util.List;

public class MUConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> JADE_ORE_KEY = registerKey("jade_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY = registerKey("topaz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AQUAMARINE_ORE_KEY = registerKey("aquamarine_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KYANITE_ORE_KEY = registerKey("kyanite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMETRINE_ORE_KEY = registerKey("ametrine_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NECOIUM_ORE_KEY = registerKey("necoium_ore");

    public static final RegistryKey<ConfiguredFeature<?,?>> JADE_CRYSTAL_GEODE_KEY = registerKey("jade_crystal_geode");
    public static final RegistryKey<ConfiguredFeature<?,?>> TOPAZ_CRYSTAL_GEODE_KEY = registerKey("topaz_crystal_geode");
    public static final RegistryKey<ConfiguredFeature<?,?>> AQUAMARINE_CRYSTAL_GEODE_KEY = registerKey("aquamarine_crystal_geode");
    public static final RegistryKey<ConfiguredFeature<?,?>> SAPPHIRE_CRYSTAL_GEODE_KEY = registerKey("sapphire_crystal_geode");
    public static final RegistryKey<ConfiguredFeature<?,?>> RUBY_CRYSTAL_GEODE_KEY = registerKey("ruby_crystal_geode");
    public static final RegistryKey<ConfiguredFeature<?,?>> KYANITE_CRYSTAL_GEODE_KEY = registerKey("kyanite_crystal_geode");
    public static final RegistryKey<ConfiguredFeature<?,?>> AMETRINE_CRYSTAL_GEODE_KEY = registerKey("ametrine_crystal_geode");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest basaltReplaceables = new BlockMatchRuleTest(Blocks.BASALT);
        RuleTest endStoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldJadeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MUBlocks.JADE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MUBlocks.DEEPSLATE_JADE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTopazOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MUBlocks.TOPAZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MUBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAquamarineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MUBlocks.AQUAMARINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MUBlocks.DEEPSLATE_AQUAMARINE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherSapphireOres =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, MUBlocks.SAPPHIRE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherRubyOres =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, MUBlocks.RUBY_ORE.getDefaultState()));
        
        List<OreFeatureConfig.Target> netherKyaniteOres =
                List.of(OreFeatureConfig.createTarget(basaltReplaceables, MUBlocks.KYANITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endAmetrineOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, MUBlocks.AMETRINE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endNecoiumOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, MUBlocks.NECOIUM_ORE.getDefaultState()));

        register(context, JADE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldJadeOres, 5));
        register(context, TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 5));
        register(context, AQUAMARINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAquamarineOres, 5));
        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherSapphireOres, 5));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRubyOres, 5));
        register(context, KYANITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherKyaniteOres, 5));
        register(context, AMETRINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endAmetrineOres, 5));
        register(context, NECOIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endNecoiumOres, 3));

        register(context, JADE_CRYSTAL_GEODE_KEY, Feature.GEODE ,
                new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                        BlockStateProvider.of(MUBlocks.JADE_CRYSTAL_BLOCK),
                        BlockStateProvider.of(MUBlocks.BUDDING_JADE_CRYSTAL),
                        BlockStateProvider.of(Blocks.CALCITE),
                        BlockStateProvider.of(Blocks.SMOOTH_BASALT),
                        List.of(MUBlocks.SMALL_JADE_CRYSTAL_BUD.getDefaultState(), MUBlocks.MEDIUM_JADE_CRYSTAL_BUD.getDefaultState(), MUBlocks.LARGE_JADE_CRYSTAL_BUD.getDefaultState(), MUBlocks.JADE_CRYSTAL_CLUSTER.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                        new GeodeCrackConfig(0.95, 2.0, 2),
                        0.35, 0.083,
                        true, UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                        -16, 16, 0.05, 1));
        
        register(context, TOPAZ_CRYSTAL_GEODE_KEY, Feature.GEODE ,
                new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                        BlockStateProvider.of(MUBlocks.TOPAZ_CRYSTAL_BLOCK),
                        BlockStateProvider.of(MUBlocks.BUDDING_TOPAZ_CRYSTAL),
                        BlockStateProvider.of(Blocks.CALCITE),
                        BlockStateProvider.of(Blocks.SMOOTH_BASALT),
                        List.of(MUBlocks.SMALL_TOPAZ_CRYSTAL_BUD.getDefaultState(), MUBlocks.MEDIUM_TOPAZ_CRYSTAL_BUD.getDefaultState(), MUBlocks.LARGE_TOPAZ_CRYSTAL_BUD.getDefaultState(), MUBlocks.TOPAZ_CRYSTAL_CLUSTER.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                        new GeodeCrackConfig(0.95, 2.0, 2),
                        0.35, 0.083,
                        true, UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                        -16, 16, 0.05, 1));
        
        register(context, AQUAMARINE_CRYSTAL_GEODE_KEY, Feature.GEODE ,
                new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                        BlockStateProvider.of(MUBlocks.AQUAMARINE_CRYSTAL_BLOCK),
                        BlockStateProvider.of(MUBlocks.BUDDING_AQUAMARINE_CRYSTAL),
                        BlockStateProvider.of(Blocks.CALCITE),
                        BlockStateProvider.of(Blocks.SMOOTH_BASALT),
                        List.of(MUBlocks.SMALL_AQUAMARINE_CRYSTAL_BUD.getDefaultState(), MUBlocks.MEDIUM_AQUAMARINE_CRYSTAL_BUD.getDefaultState(), MUBlocks.LARGE_AQUAMARINE_CRYSTAL_BUD.getDefaultState(), MUBlocks.AQUAMARINE_CRYSTAL_CLUSTER.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                        new GeodeCrackConfig(0.95, 2.0, 2),
                        0.35, 0.083,
                        true, UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                        -16, 16, 0.05, 1));
        
        register(context, SAPPHIRE_CRYSTAL_GEODE_KEY, Feature.GEODE ,
                new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                        BlockStateProvider.of(MUBlocks.SAPPHIRE_CRYSTAL_BLOCK),
                        BlockStateProvider.of(MUBlocks.BUDDING_SAPPHIRE_CRYSTAL),
                        BlockStateProvider.of(Blocks.CALCITE),
                        BlockStateProvider.of(Blocks.SMOOTH_BASALT),
                        List.of(MUBlocks.SMALL_SAPPHIRE_CRYSTAL_BUD.getDefaultState(), MUBlocks.MEDIUM_SAPPHIRE_CRYSTAL_BUD.getDefaultState(), MUBlocks.LARGE_SAPPHIRE_CRYSTAL_BUD.getDefaultState(), MUBlocks.SAPPHIRE_CRYSTAL_CLUSTER.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                        new GeodeCrackConfig(0.95, 2.0, 2),
                        0.35, 0.083,
                        true, UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                        -16, 16, 0.05, 1));
        
        register(context, RUBY_CRYSTAL_GEODE_KEY, Feature.GEODE ,
                new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                        BlockStateProvider.of(MUBlocks.RUBY_CRYSTAL_BLOCK),
                        BlockStateProvider.of(MUBlocks.BUDDING_RUBY_CRYSTAL),
                        BlockStateProvider.of(Blocks.CALCITE),
                        BlockStateProvider.of(Blocks.SMOOTH_BASALT),
                        List.of(MUBlocks.SMALL_RUBY_CRYSTAL_BUD.getDefaultState(), MUBlocks.MEDIUM_RUBY_CRYSTAL_BUD.getDefaultState(), MUBlocks.LARGE_RUBY_CRYSTAL_BUD.getDefaultState(), MUBlocks.RUBY_CRYSTAL_CLUSTER.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                        new GeodeCrackConfig(0.95, 2.0, 2),
                        0.35, 0.083,
                        true, UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                        -16, 16, 0.05, 1));
        
        register(context, KYANITE_CRYSTAL_GEODE_KEY, Feature.GEODE ,
                new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                        BlockStateProvider.of(MUBlocks.KYANITE_CRYSTAL_BLOCK),
                        BlockStateProvider.of(MUBlocks.BUDDING_KYANITE_CRYSTAL),
                        BlockStateProvider.of(Blocks.CALCITE),
                        BlockStateProvider.of(Blocks.SMOOTH_BASALT),
                        List.of(MUBlocks.SMALL_KYANITE_CRYSTAL_BUD.getDefaultState(), MUBlocks.MEDIUM_KYANITE_CRYSTAL_BUD.getDefaultState(), MUBlocks.LARGE_KYANITE_CRYSTAL_BUD.getDefaultState(), MUBlocks.KYANITE_CRYSTAL_CLUSTER.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                        new GeodeCrackConfig(0.95, 2.0, 2),
                        0.35, 0.083,
                        true, UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                        -16, 16, 0.05, 1));
        
        register(context, AMETRINE_CRYSTAL_GEODE_KEY, Feature.GEODE ,
                new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                        BlockStateProvider.of(MUBlocks.AMETRINE_CRYSTAL_BLOCK),
                        BlockStateProvider.of(MUBlocks.BUDDING_AMETRINE_CRYSTAL),
                        BlockStateProvider.of(Blocks.CALCITE),
                        BlockStateProvider.of(Blocks.SMOOTH_BASALT),
                        List.of(MUBlocks.SMALL_AMETRINE_CRYSTAL_BUD.getDefaultState(), MUBlocks.MEDIUM_AMETRINE_CRYSTAL_BUD.getDefaultState(), MUBlocks.LARGE_AMETRINE_CRYSTAL_BUD.getDefaultState(), MUBlocks.AMETRINE_CRYSTAL_CLUSTER.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                        new GeodeCrackConfig(0.95, 2.0, 2),
                        0.35, 0.083,
                        true, UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                        -16, 16, 0.05, 1));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MythicUpgrades.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}