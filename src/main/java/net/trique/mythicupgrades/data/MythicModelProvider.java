package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.trique.mythicupgrades.block.MythicBlocks;
import net.trique.mythicupgrades.registry.RegisterMythicItems;

public class MythicModelProvider extends FabricModelProvider {
    public MythicModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.JADE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.JADE_RUINS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.JADE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.DEEPSLATE_JADE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOPAZ_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOPAZ_RUINS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.DEEPSLATE_TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.AQUAMARINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.AQUAMARINE_RUINS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.SAPPHIRE_RUINS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.RUBY_RUINS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.AMETRINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.AMETRINE_RUINS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.AMETRINE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(RegisterMythicItems.MUSIC_DISC_SOOT, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.MUSIC_DISC_APPOMATTOX, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.MUSIC_DISC_FIERCE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.MUSIC_DISC_NELUMBO, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.MUSIC_DISC_FLOW_OF_THE_ABYSS, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.MUSIC_DISC_TANKER_ON_THE_LEVANTINES, Models.GENERATED);

        itemModelGenerator.register(RegisterMythicItems.JADE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.AQUAMARINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.RUBY_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(RegisterMythicItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.SAPPHIRE_HELMET, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.SAPPHIRE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.SAPPHIRE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.SAPPHIRE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.SAPPHIRE_INGOT, Models.GENERATED);

        itemModelGenerator.register(RegisterMythicItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.RUBY_INGOT, Models.GENERATED);

        itemModelGenerator.register(RegisterMythicItems.JADE_AXE, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.JADE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.JADE_HELMET, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.JADE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.JADE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.JADE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.JADE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.JADE_INGOT, Models.GENERATED);

        itemModelGenerator.register(RegisterMythicItems.TOPAZ_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.TOPAZ_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.TOPAZ_AXE, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.TOPAZ_HOE, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.TOPAZ_SWORD, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.TOPAZ_HELMET, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.TOPAZ_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.TOPAZ_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.TOPAZ_BOOTS, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.TOPAZ, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.TOPAZ_INGOT, Models.GENERATED);

        itemModelGenerator.register(RegisterMythicItems.AMETRINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.AMETRINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.AMETRINE_HELMET, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.AMETRINE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.AMETRINE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.AMETRINE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.AMETRINE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.AMETRINE_INGOT, Models.GENERATED);

        itemModelGenerator.register(RegisterMythicItems.AQUAMARINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.AQUAMARINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(RegisterMythicItems.AQUAMARINE, Models.GENERATED);
        itemModelGenerator.register(RegisterMythicItems.AQUAMARINE_INGOT, Models.GENERATED);
    }
}