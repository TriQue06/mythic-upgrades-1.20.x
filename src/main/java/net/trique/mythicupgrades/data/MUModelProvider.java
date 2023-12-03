package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.trique.mythicupgrades.block.MUBlocks;
import net.trique.mythicupgrades.item.MUItems;

public class MUModelProvider extends FabricModelProvider {
    public MUModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.JADE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.JADE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.JADE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.DEEPSLATE_JADE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.TOPAZ_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.TOPAZ_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.DEEPSLATE_TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.AQUAMARINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.AQUAMARINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.DEEPSLATE_AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.SAPPHIRE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.RUBY_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.AMETRINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.AMETRINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MUBlocks.AMETRINE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MUItems.MUSIC_DISC_SOOT, Models.GENERATED);
        itemModelGenerator.register(MUItems.MUSIC_DISC_APPOMATTOX, Models.GENERATED);
        itemModelGenerator.register(MUItems.MUSIC_DISC_FIERCE, Models.GENERATED);
        itemModelGenerator.register(MUItems.MUSIC_DISC_NELUMBO, Models.GENERATED);
        itemModelGenerator.register(MUItems.MUSIC_DISC_FLOW_OF_THE_ABYSS, Models.GENERATED);
        itemModelGenerator.register(MUItems.MUSIC_DISC_TANKER_ON_THE_LEVANTINES, Models.GENERATED);

        itemModelGenerator.register(MUItems.JADE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(MUItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(MUItems.AQUAMARINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(MUItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(MUItems.RUBY_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(MUItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(MUItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(MUItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MUItems.SAPPHIRE_HELMET, Models.GENERATED);
        itemModelGenerator.register(MUItems.SAPPHIRE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(MUItems.SAPPHIRE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(MUItems.SAPPHIRE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(MUItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(MUItems.SAPPHIRE_INGOT, Models.GENERATED);
        itemModelGenerator.register(MUItems.SAPPHIRE_SHARD, Models.GENERATED);
        itemModelGenerator.register(MUItems.SAPPHIRE_APPLE, Models.GENERATED);

        itemModelGenerator.register(MUItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(MUItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(MUItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(MUItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(MUItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MUItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(MUItems.RUBY_INGOT, Models.GENERATED);
        itemModelGenerator.register(MUItems.RUBY_SHARD, Models.GENERATED);
        itemModelGenerator.register(MUItems.RUBY_APPLE, Models.GENERATED);

        itemModelGenerator.register(MUItems.JADE_AXE, Models.HANDHELD);
        itemModelGenerator.register(MUItems.JADE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MUItems.JADE_HELMET, Models.GENERATED);
        itemModelGenerator.register(MUItems.JADE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(MUItems.JADE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(MUItems.JADE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(MUItems.JADE, Models.GENERATED);
        itemModelGenerator.register(MUItems.JADE_INGOT, Models.GENERATED);
        itemModelGenerator.register(MUItems.JADE_SHARD, Models.GENERATED);
        itemModelGenerator.register(MUItems.JADE_APPLE, Models.GENERATED);

        itemModelGenerator.register(MUItems.TOPAZ_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(MUItems.TOPAZ_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(MUItems.TOPAZ_AXE, Models.HANDHELD);
        itemModelGenerator.register(MUItems.TOPAZ_HOE, Models.HANDHELD);
        itemModelGenerator.register(MUItems.TOPAZ_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MUItems.TOPAZ_HELMET, Models.GENERATED);
        itemModelGenerator.register(MUItems.TOPAZ_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(MUItems.TOPAZ_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(MUItems.TOPAZ_BOOTS, Models.GENERATED);
        itemModelGenerator.register(MUItems.TOPAZ, Models.GENERATED);
        itemModelGenerator.register(MUItems.TOPAZ_INGOT, Models.GENERATED);
        itemModelGenerator.register(MUItems.TOPAZ_SHARD, Models.GENERATED);
        itemModelGenerator.register(MUItems.TOPAZ_APPLE, Models.GENERATED);

        itemModelGenerator.register(MUItems.AMETRINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(MUItems.AMETRINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MUItems.AMETRINE_HELMET, Models.GENERATED);
        itemModelGenerator.register(MUItems.AMETRINE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(MUItems.AMETRINE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(MUItems.AMETRINE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(MUItems.AMETRINE, Models.GENERATED);
        itemModelGenerator.register(MUItems.AMETRINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(MUItems.AMETRINE_SHARD, Models.GENERATED);
        itemModelGenerator.register(MUItems.AMETRINE_APPLE, Models.GENERATED);

        itemModelGenerator.register(MUItems.AQUAMARINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(MUItems.AQUAMARINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MUItems.AQUAMARINE, Models.GENERATED);
        itemModelGenerator.register(MUItems.AQUAMARINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(MUItems.AQUAMARINE_SHARD, Models.GENERATED);
        itemModelGenerator.register(MUItems.AQUAMARINE_APPLE, Models.GENERATED);
    }
}