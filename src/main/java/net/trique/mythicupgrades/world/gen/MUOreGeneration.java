package net.trique.mythicupgrades.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.trique.mythicupgrades.world.MUPlacedFeatures;

public class MUOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.JADE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.JADE_CRYSTAL_GEODE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.TOPAZ_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.TOPAZ_CRYSTAL_GEODE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.ICY),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.AQUAMARINE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.ICY),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.AQUAMARINE_CRYSTAL_GEODE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.SAPPHIRE_CRYSTAL_GEODE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.RUBY_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.RUBY_CRYSTAL_GEODE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.AMETRINE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, MUPlacedFeatures.AMETRINE_CRYSTAL_GEODE_PLACED_KEY);

    }
}