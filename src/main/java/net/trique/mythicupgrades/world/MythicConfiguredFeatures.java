package net.trique.mythicupgrades.world;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.block.MythicBlocks;

import java.util.List;

public class MythicConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_RUINS_KEY = registerKey("sapphire_ruins");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_RUINS_KEY = registerKey("ruby_ruins");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JADE_ORE_KEY = registerKey("jade_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JADE_RUINS_KEY = registerKey("jade_ruins");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY = registerKey("topaz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_RUINS_KEY = registerKey("topaz_ruins");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMETRINE_ORE_KEY = registerKey("ametrine_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMETRINE_RUINS_KEY = registerKey("ametrine_ruins");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AQUAMARINE_ORE_KEY = registerKey("aquamarine_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AQUAMARINE_RUINS_KEY = registerKey("aquamarine_ruins");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endStoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);
        RuleTest terraReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_OVERWORLD);

        List<OreFeatureConfig.Target> netherSapphireOres =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, MythicBlocks.SAPPHIRE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherSapphireRuins =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, MythicBlocks.SAPPHIRE_RUINS.getDefaultState()));

        List<OreFeatureConfig.Target> netherRubyOres =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, MythicBlocks.RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherRubyRuins =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, MythicBlocks.RUBY_RUINS.getDefaultState()));

        List<OreFeatureConfig.Target> overworldJadeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MythicBlocks.JADE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MythicBlocks.DEEPSLATE_JADE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldJadeRuins =
                List.of(OreFeatureConfig.createTarget(terraReplacables, MythicBlocks.JADE_RUINS.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTopazOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MythicBlocks.TOPAZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MythicBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTopazRuins =
                List.of(OreFeatureConfig.createTarget(terraReplacables, MythicBlocks.TOPAZ_RUINS.getDefaultState()));

        List<OreFeatureConfig.Target> endAmetrineOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, MythicBlocks.AMETRINE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endAmetrineRuins =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, MythicBlocks.AMETRINE_RUINS.getDefaultState()));
        
        List<OreFeatureConfig.Target> overworldAquamarineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MythicBlocks.AQUAMARINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MythicBlocks.DEEPSLATE_AQUAMARINE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAquamarineRuins =
                List.of(OreFeatureConfig.createTarget(terraReplacables, MythicBlocks.AQUAMARINE_RUINS.getDefaultState()));

        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherSapphireOres, 4));
        register(context, SAPPHIRE_RUINS_KEY, Feature.ORE, new OreFeatureConfig(netherSapphireRuins, 12));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRubyOres, 4));
        register(context, RUBY_RUINS_KEY, Feature.ORE, new OreFeatureConfig(netherRubyRuins, 12));
        register(context, JADE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldJadeOres, 4));
        register(context, JADE_RUINS_KEY, Feature.ORE, new OreFeatureConfig(overworldJadeRuins, 12));
        register(context, TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 4));
        register(context, TOPAZ_RUINS_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazRuins, 12));
        register(context, AMETRINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endAmetrineOres, 4));
        register(context, AMETRINE_RUINS_KEY, Feature.ORE, new OreFeatureConfig(endAmetrineRuins, 12));
        register(context, AQUAMARINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAquamarineOres, 4));
        register(context, AQUAMARINE_RUINS_KEY, Feature.ORE, new OreFeatureConfig(overworldAquamarineRuins, 12));
}

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MythicUpgrades.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}