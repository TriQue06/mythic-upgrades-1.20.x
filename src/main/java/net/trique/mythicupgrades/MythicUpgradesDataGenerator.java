package net.trique.mythicupgrades;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.trique.mythicupgrades.data.MythicLootTableGenerator;
import net.trique.mythicupgrades.data.MythicModelProvider;
import net.trique.mythicupgrades.data.MythicRecipeGenerator;
import net.trique.mythicupgrades.data.MythicWorldGenerator;
import net.trique.mythicupgrades.world.MythicConfiguredFeatures;
import net.trique.mythicupgrades.world.MythicPlacedFeatures;

public class MythicUpgradesDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(MythicLootTableGenerator::new);
        pack.addProvider(MythicRecipeGenerator::new);
        pack.addProvider(MythicModelProvider::new);
        pack.addProvider(MythicWorldGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, MythicConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, MythicPlacedFeatures::bootstrap);
    }
}