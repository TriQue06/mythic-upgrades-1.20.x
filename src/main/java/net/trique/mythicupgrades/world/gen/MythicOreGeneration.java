package net.trique.mythicupgrades.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.trique.mythicupgrades.world.MythicPlacedFeatures;

public class MythicOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.SAPPHIRE_RUINS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.RUBY_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.RUBY_RUINS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MANGROVE_SWAMP),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.JADE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MANGROVE_SWAMP),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.JADE_RUINS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.TOPAZ_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.TOPAZ_RUINS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.AMETRINE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.AMETRINE_RUINS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.AQUAMARINE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.UNDERGROUND_ORES, MythicPlacedFeatures.AQUAMARINE_RUINS_PLACED_KEY);

    }
}
