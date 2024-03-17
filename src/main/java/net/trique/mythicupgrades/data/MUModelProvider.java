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
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_AQUAMARINE_CRYSTAL);
        blockStateModelGenerator.registerAmethyst(SMALL_AQUAMARINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_AQUAMARINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_AQUAMARINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(AQUAMARINE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(CITRINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(CITRINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(DEEPSLATE_CITRINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(CITRINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_CITRINE_CRYSTAL);
        blockStateModelGenerator.registerAmethyst(SMALL_CITRINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_CITRINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_CITRINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(CITRINE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(PERIDOT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(PERIDOT_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(DEEPSLATE_PERIDOT_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(PERIDOT_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_PERIDOT_CRYSTAL);
        blockStateModelGenerator.registerAmethyst(SMALL_PERIDOT_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_PERIDOT_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_PERIDOT_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(PERIDOT_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ZIRCON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ZIRCON_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ZIRCON_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_ZIRCON_CRYSTAL);
        blockStateModelGenerator.registerAmethyst(SMALL_ZIRCON_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_ZIRCON_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_ZIRCON_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(ZIRCON_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(RUBY_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_RUBY_CRYSTAL);
        blockStateModelGenerator.registerAmethyst(SMALL_RUBY_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_RUBY_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_RUBY_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(RUBY_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(SAPPHIRE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(SAPPHIRE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_SAPPHIRE_CRYSTAL);
        blockStateModelGenerator.registerAmethyst(SMALL_SAPPHIRE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_SAPPHIRE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_SAPPHIRE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(SAPPHIRE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(TOPAZ_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(TOPAZ_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_TOPAZ_CRYSTAL);
        blockStateModelGenerator.registerAmethyst(SMALL_TOPAZ_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_TOPAZ_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_TOPAZ_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(TOPAZ_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(AMETRINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AMETRINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AMETRINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_AMETRINE_CRYSTAL);
        blockStateModelGenerator.registerAmethyst(SMALL_AMETRINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_AMETRINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_AMETRINE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(AMETRINE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(JADE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(JADE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(JADE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BUDDING_JADE_CRYSTAL);
        blockStateModelGenerator.registerAmethyst(SMALL_JADE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(MEDIUM_JADE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(LARGE_JADE_CRYSTAL_BUD);
        blockStateModelGenerator.registerAmethyst(JADE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(RAW_NECOIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NECOIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NECOIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(AQUAMARINE, Models.GENERATED);
        itemModelGenerator.register(AQUAMARINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(AQUAMARINE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(AQUAMARINE_POTION, Models.GENERATED);

        itemModelGenerator.register(CITRINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(CITRINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(CITRINE, Models.GENERATED);
        itemModelGenerator.register(CITRINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(CITRINE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(CITRINE_POTION, Models.GENERATED);

        itemModelGenerator.register(PERIDOT_AXE, Models.HANDHELD);
        itemModelGenerator.register(PERIDOT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(PERIDOT, Models.GENERATED);
        itemModelGenerator.register(PERIDOT_INGOT, Models.GENERATED);
        itemModelGenerator.register(PERIDOT_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(PERIDOT_POTION, Models.GENERATED);

        itemModelGenerator.register(ZIRCON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ZIRCON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ZIRCON, Models.GENERATED);
        itemModelGenerator.register(ZIRCON_INGOT, Models.GENERATED);
        itemModelGenerator.register(ZIRCON_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(ZIRCON_POTION, Models.GENERATED);

        itemModelGenerator.register(RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(RUBY, Models.GENERATED);
        itemModelGenerator.register(RUBY_INGOT, Models.GENERATED);
        itemModelGenerator.register(RUBY_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(RUBY_POTION, Models.GENERATED);

        itemModelGenerator.register(SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_INGOT, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(SAPPHIRE_POTION, Models.GENERATED);

        itemModelGenerator.register(TOPAZ_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_AXE, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_HOE, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TOPAZ, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_INGOT, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(TOPAZ_POTION, Models.GENERATED);

        itemModelGenerator.register(AMETRINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(AMETRINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(AMETRINE, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(AMETRINE_POTION, Models.GENERATED);

        itemModelGenerator.register(JADE_AXE, Models.HANDHELD);
        itemModelGenerator.register(JADE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(JADE, Models.GENERATED);
        itemModelGenerator.register(JADE_INGOT, Models.GENERATED);
        itemModelGenerator.register(JADE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(JADE_POTION, Models.GENERATED);
        
        itemModelGenerator.register(RAW_NECOIUM, Models.GENERATED);
        itemModelGenerator.register(NECOIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(NECOIUM_NUGGET, Models.GENERATED);

        itemModelGenerator.register(AQUAMARINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(CITRINE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(PERIDOT_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ZIRCON_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
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

        itemModelGenerator.registerArmor(((ArmorItem) CITRINE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) CITRINE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) CITRINE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) CITRINE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ZIRCON_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ZIRCON_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ZIRCON_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ZIRCON_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) SAPPHIRE_BOOTS));

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