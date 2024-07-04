package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

import static net.trique.mythicupgrades.block.MUBlocks.*;
import static net.trique.mythicupgrades.item.MUItems.*;

public class MUModelProvider extends FabricModelProvider {
    public MUModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(AQUAMARINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(DEEPSLATE_AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AQUAMARINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerAmethyst(AQUAMARINE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(PERIDOT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(PERIDOT_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(DEEPSLATE_PERIDOT_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(PERIDOT_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerAmethyst(PERIDOT_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(TOPAZ_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(DEEPSLATE_TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(TOPAZ_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerAmethyst(TOPAZ_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(RUBY_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerAmethyst(RUBY_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(SAPPHIRE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(SAPPHIRE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerAmethyst(SAPPHIRE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AMETRINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AMETRINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AMETRINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerAmethyst(AMETRINE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(JADE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(JADE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(JADE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerAmethyst(JADE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(RAW_NECOIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NECOIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NECOIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(AQUAMARINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(AQUAMARINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AQUAMARINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AQUAMARINE_HOE, Models.HANDHELD);
        itemModelGenerator.register(AQUAMARINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AQUAMARINE, Models.GENERATED);
        itemModelGenerator.register(AQUAMARINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(AQUAMARINE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(AQUAMARINE_POTION, Models.GENERATED);

        itemModelGenerator.register(PERIDOT_AXE, Models.HANDHELD);
        itemModelGenerator.register(PERIDOT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(PERIDOT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(PERIDOT_HOE, Models.HANDHELD);
        itemModelGenerator.register(PERIDOT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(PERIDOT, Models.GENERATED);
        itemModelGenerator.register(PERIDOT_INGOT, Models.GENERATED);
        itemModelGenerator.register(PERIDOT_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(PERIDOT_POTION, Models.GENERATED);

        itemModelGenerator.register(TOPAZ_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_AXE, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_HOE, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_INGOT, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_POTION, Models.GENERATED);

        itemModelGenerator.register(RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(RUBY, Models.GENERATED);
        itemModelGenerator.register(RUBY_INGOT, Models.GENERATED);
        itemModelGenerator.register(RUBY_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(RUBY_POTION, Models.GENERATED);

        itemModelGenerator.register(SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_INGOT, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_POTION, Models.GENERATED);

        itemModelGenerator.register(AMETRINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(AMETRINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(AMETRINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(AMETRINE_HOE, Models.HANDHELD);
        itemModelGenerator.register(AMETRINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AMETRINE, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_POTION, Models.GENERATED);

        itemModelGenerator.register(JADE_AXE, Models.HANDHELD);
        itemModelGenerator.register(JADE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(JADE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(JADE_HOE, Models.HANDHELD);
        itemModelGenerator.register(JADE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(JADE, Models.GENERATED);
        itemModelGenerator.register(JADE_INGOT, Models.GENERATED);
        itemModelGenerator.register(JADE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(JADE_POTION, Models.GENERATED);
        
        itemModelGenerator.register(RAW_NECOIUM, Models.GENERATED);
        itemModelGenerator.register(NECOIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(AQUAMARINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(PERIDOT_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(RUBY_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(JADE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) AQUAMARINE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) AQUAMARINE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) AQUAMARINE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) AQUAMARINE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) PERIDOT_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) PERIDOT_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) PERIDOT_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) PERIDOT_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) SAPPHIRE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) RUBY_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) TOPAZ_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) TOPAZ_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) TOPAZ_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) TOPAZ_BOOTS));
        
        itemModelGenerator.registerArmor(((ArmorItem) AMETRINE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) AMETRINE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) AMETRINE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) AMETRINE_BOOTS));
        
        itemModelGenerator.registerArmor(((ArmorItem) JADE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) JADE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) JADE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) JADE_BOOTS));
    }
}