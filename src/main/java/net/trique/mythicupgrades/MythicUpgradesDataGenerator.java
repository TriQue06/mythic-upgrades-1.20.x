package net.trique.mythicupgrades;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.trique.mythicupgrades.data.MULootTableGenerator;
import net.trique.mythicupgrades.data.MUModelProvider;
import net.trique.mythicupgrades.data.MURecipeGenerator;
import net.trique.mythicupgrades.data.MUWorldGenerator;
import net.trique.mythicupgrades.world.MUConfiguredFeatures;
import net.trique.mythicupgrades.world.MUPlacedFeatures;

public class MythicUpgradesDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(MULootTableGenerator::new);
        pack.addProvider(MURecipeGenerator::new);
        pack.addProvider(MUModelProvider::new);
        pack.addProvider(MUWorldGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, MUConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, MUPlacedFeatures::bootstrap);
    }
}