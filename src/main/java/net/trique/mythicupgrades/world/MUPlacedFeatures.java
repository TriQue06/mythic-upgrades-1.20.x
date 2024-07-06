package net.trique.mythicupgrades.world;

import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.trique.mythicupgrades.MythicUpgrades;

import java.util.List;

public class MUPlacedFeatures {
    public static final RegistryKey<PlacedFeature> AQUAMARINE_ORE_PLACED_KEY = registerKey("aquamarine_ore_placed");
    public static final RegistryKey<PlacedFeature> PERIDOT_ORE_PLACED_KEY = registerKey("peridot_ore_placed");
    public static final RegistryKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY = registerKey("topaz_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> AMETRINE_ORE_PLACED_KEY = registerKey("ametrine_ore_placed");
    public static final RegistryKey<PlacedFeature> JADE_ORE_PLACED_KEY = registerKey("jade_ore_placed");
    public static final RegistryKey<PlacedFeature> NECOIUM_ORE_PLACED_KEY = registerKey("necoium_ore_placed");

    public static final RegistryKey<PlacedFeature> AQUAMARINE_CRYSTAL_GEODE_PLACED_KEY = registerKey("aquamarine_crystal_geode_placed");
    public static final RegistryKey<PlacedFeature> PERIDOT_CRYSTAL_GEODE_PLACED_KEY = registerKey("peridot_crystal_geode_placed");
    public static final RegistryKey<PlacedFeature> TOPAZ_CRYSTAL_GEODE_PLACED_KEY = registerKey("topaz_crystal_geode_placed");
    public static final RegistryKey<PlacedFeature> RUBY_CRYSTAL_GEODE_PLACED_KEY = registerKey("ruby_crystal_geode_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_CRYSTAL_GEODE_PLACED_KEY = registerKey("sapphire_crystal_geode_placed");
    public static final RegistryKey<PlacedFeature> AMETRINE_CRYSTAL_GEODE_PLACED_KEY = registerKey("ametrine_crystal_geode_placed");
    public static final RegistryKey<PlacedFeature> JADE_CRYSTAL_GEODE_PLACED_KEY = registerKey("jade_crystal_geode_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, AQUAMARINE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.AQUAMARINE_ORE_KEY),
                MUOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32))));

        register(context, PERIDOT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.PERIDOT_ORE_KEY),
                MUOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32))));

        register(context, TOPAZ_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.TOPAZ_ORE_KEY),
                MUOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32))));

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.RUBY_ORE_KEY),
                MUOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(64))));

        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.SAPPHIRE_ORE_KEY),
                MUOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(64))));

        register(context, AMETRINE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.AMETRINE_ORE_KEY),
                MUOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(64))));

        register(context, JADE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.JADE_ORE_KEY),
                MUOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(64))));

        register(context, NECOIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.NECOIUM_ORE_KEY),
                MUOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(64))));

        register(context, AQUAMARINE_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.AQUAMARINE_CRYSTAL_GEODE_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());

        register(context, PERIDOT_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.PERIDOT_CRYSTAL_GEODE_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());

        register(context, TOPAZ_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.TOPAZ_CRYSTAL_GEODE_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());

        register(context, RUBY_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.RUBY_CRYSTAL_GEODE_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());

        register(context, SAPPHIRE_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.SAPPHIRE_CRYSTAL_GEODE_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());

        register(context, AMETRINE_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.AMETRINE_CRYSTAL_GEODE_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());

        register(context, JADE_CRYSTAL_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MUConfiguredFeatures.JADE_CRYSTAL_GEODE_KEY),
                RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MythicUpgrades.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}