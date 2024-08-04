package net.trique.mythicupgrades.world;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.trique.mythicupgrades.MythicUpgrades;

import java.util.List;

public class MUPlacedFeatures {
    public static final ResourceKey<PlacedFeature> AQUAMARINE_ORE_PLACED_KEY = registerKey("aquamarine_ore_placed");
    public static final ResourceKey<PlacedFeature> PERIDOT_ORE_PLACED_KEY = registerKey("peridot_ore_placed");
    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY = registerKey("topaz_ore_placed");
    public static final ResourceKey<PlacedFeature> AMETRINE_ORE_PLACED_KEY = registerKey("ametrine_ore_placed");
    public static final ResourceKey<PlacedFeature> JADE_ORE_PLACED_KEY = registerKey("jade_ore_placed");
    public static final ResourceKey<PlacedFeature> NECOIUM_ORE_PLACED_KEY = registerKey("necoium_ore_placed");

    public static final ResourceKey<PlacedFeature> AQUAMARINE_CRYSTAL_GEODE_PLACED_KEY = registerKey("aquamarine_crystal_geode_placed");
    public static final ResourceKey<PlacedFeature> PERIDOT_CRYSTAL_GEODE_PLACED_KEY = registerKey("peridot_crystal_geode_placed");
    public static final ResourceKey<PlacedFeature> RUBY_CRYSTAL_GEODE_PLACED_KEY = registerKey("ruby_crystal_geode_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_CRYSTAL_GEODE_PLACED_KEY = registerKey("sapphire_crystal_geode_placed");
    public static final ResourceKey<PlacedFeature> TOPAZ_CRYSTAL_GEODE_PLACED_KEY = registerKey("topaz_crystal_geode_placed");
    public static final ResourceKey<PlacedFeature> AMETRINE_CRYSTAL_GEODE_PLACED_KEY = registerKey("ametrine_crystal_geode_placed");
    public static final ResourceKey<PlacedFeature> JADE_CRYSTAL_GEODE_PLACED_KEY = registerKey("jade_crystal_geode_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, AQUAMARINE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.AQUAMARINE_ORE_KEY),
                MUOrePlacement.modifiersWithCount(6,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, PERIDOT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.PERIDOT_ORE_KEY),
                MUOrePlacement.modifiersWithCount(6,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.RUBY_ORE_KEY),
                MUOrePlacement.modifiersWithCount(6,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64))));

        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.SAPPHIRE_ORE_KEY),
                MUOrePlacement.modifiersWithCount(6,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64))));

        register(context, TOPAZ_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.TOPAZ_ORE_KEY),
                MUOrePlacement.modifiersWithCount(6,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, AMETRINE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.AMETRINE_ORE_KEY),
                MUOrePlacement.modifiersWithCount(6,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64))));

        register(context, JADE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.JADE_ORE_KEY),
                MUOrePlacement.modifiersWithCount(6,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64))));

        register(context, NECOIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.NECOIUM_ORE_KEY),
                MUOrePlacement.modifiersWithCount(6,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64))));

        register(context, AQUAMARINE_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.AQUAMARINE_CRYSTAL_GEODE_KEY),
                RarityFilter.onAverageOnceEvery(48), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());

        register(context, PERIDOT_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.PERIDOT_CRYSTAL_GEODE_KEY),
                RarityFilter.onAverageOnceEvery(48), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());

        register(context, RUBY_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.RUBY_CRYSTAL_GEODE_KEY),
                RarityFilter.onAverageOnceEvery(36), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());

        register(context, SAPPHIRE_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.SAPPHIRE_CRYSTAL_GEODE_KEY),
                RarityFilter.onAverageOnceEvery(36), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());

        register(context, TOPAZ_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.TOPAZ_CRYSTAL_GEODE_KEY),
                RarityFilter.onAverageOnceEvery(48), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());

        register(context, AMETRINE_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.AMETRINE_CRYSTAL_GEODE_KEY),
                RarityFilter.onAverageOnceEvery(36), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());

        register(context, JADE_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.JADE_CRYSTAL_GEODE_KEY),
                RarityFilter.onAverageOnceEvery(36), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MythicUpgrades.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                                                                   Holder<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}