package net.trique.mythicupgrades;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.trique.mythicupgrades.data.*;
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
        pack.addProvider(MUItemTagProvider::new);
        pack.addProvider(MUBlockTagProvider::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, MUConfiguredFeatures::bootstrap);
        registryBuilder.add(Registries.PLACED_FEATURE, MUPlacedFeatures::bootstrap);
    }
}