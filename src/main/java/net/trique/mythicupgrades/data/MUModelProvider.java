package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import static net.trique.mythicupgrades.block.MUBlocks.*;
import static net.trique.mythicupgrades.item.MUItems.*;

public class MUModelProvider extends FabricModelProvider {
    public MUModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(JADE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(JADE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(DEEPSLATE_JADE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(JADE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_JADE_CRYSTAL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(TOPAZ_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(DEEPSLATE_TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(TOPAZ_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_TOPAZ_CRYSTAL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AQUAMARINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(DEEPSLATE_AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AQUAMARINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_AQUAMARINE_CRYSTAL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(SAPPHIRE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(SAPPHIRE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_SAPPHIRE_CRYSTAL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(RUBY_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_RUBY_CRYSTAL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AMETRINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AMETRINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AMETRINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_AMETRINE_CRYSTAL);

        blockStateModelGenerator.registerAmethyst(SMALL_AMETRINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_AMETRINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_AMETRINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(AMETRINE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerAmethyst(SMALL_AQUAMARINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_AQUAMARINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_AQUAMARINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(AQUAMARINE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerAmethyst(SMALL_RUBY_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_RUBY_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_RUBY_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(RUBY_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerAmethyst(SMALL_JADE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_JADE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_JADE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(JADE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerAmethyst(SMALL_TOPAZ_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_TOPAZ_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_TOPAZ_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(TOPAZ_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerAmethyst(SMALL_SAPPHIRE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_SAPPHIRE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_SAPPHIRE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(SAPPHIRE_CRYSTAL_CLUSTER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MUSIC_DISC_SOOT, Models.GENERATED);
        itemModelGenerator.register(MUSIC_DISC_APPOMATTOX, Models.GENERATED);
        itemModelGenerator.register(MUSIC_DISC_FIERCE, Models.GENERATED);
        itemModelGenerator.register(MUSIC_DISC_NELUMBO, Models.GENERATED);
        itemModelGenerator.register(MUSIC_DISC_FLOW_OF_THE_ABYSS, Models.GENERATED);
        itemModelGenerator.register(MUSIC_DISC_TANKER_ON_THE_LEVANTINES, Models.GENERATED);

        itemModelGenerator.register(JADE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(AQUAMARINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(RUBY_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SAPPHIRE_HELMET, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_INGOT, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_APPLE, Models.GENERATED);

        itemModelGenerator.register(RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(RUBY, Models.GENERATED);
        itemModelGenerator.register(RUBY_INGOT, Models.GENERATED);
        itemModelGenerator.register(RUBY_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(RUBY_APPLE, Models.GENERATED);

        itemModelGenerator.register(JADE_AXE, Models.HANDHELD);
        itemModelGenerator.register(JADE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(JADE_HELMET, Models.GENERATED);
        itemModelGenerator.register(JADE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(JADE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(JADE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(JADE, Models.GENERATED);
        itemModelGenerator.register(JADE_INGOT, Models.GENERATED);
        itemModelGenerator.register(JADE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(JADE_APPLE, Models.GENERATED);

        itemModelGenerator.register(TOPAZ_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_AXE, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_HOE, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_HELMET, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_BOOTS, Models.GENERATED);
        itemModelGenerator.register(TOPAZ, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_INGOT, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_APPLE, Models.GENERATED);

        itemModelGenerator.register(AMETRINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(AMETRINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AMETRINE_HELMET, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(AMETRINE, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_APPLE, Models.GENERATED);

        itemModelGenerator.register(AQUAMARINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(AQUAMARINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AQUAMARINE, Models.GENERATED);
        itemModelGenerator.register(AQUAMARINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(AQUAMARINE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(AQUAMARINE_FISH, Models.GENERATED);
    }
}