package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.item.ArmorItem;

import static net.trique.mythicupgrades.block.MUBlocks.*;
import static net.trique.mythicupgrades.item.MUItems.*;

public class MUModelProvider extends FabricModelProvider {
    public MUModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.family(AQUAMARINE_BLOCK);
        blockStateModelGenerator.family(AQUAMARINE_ORE);
        blockStateModelGenerator.family(DEEPSLATE_AQUAMARINE_ORE);
        blockStateModelGenerator.family(AQUAMARINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.createAmethystCluster(AQUAMARINE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.family(CITRINE_BLOCK);
        blockStateModelGenerator.family(CITRINE_ORE);
        blockStateModelGenerator.family(DEEPSLATE_CITRINE_ORE);
        blockStateModelGenerator.family(CITRINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.createAmethystCluster(CITRINE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.family(PERIDOT_BLOCK);
        blockStateModelGenerator.family(PERIDOT_ORE);
        blockStateModelGenerator.family(DEEPSLATE_PERIDOT_ORE);
        blockStateModelGenerator.family(PERIDOT_CRYSTAL_BLOCK);
        blockStateModelGenerator.createAmethystCluster(PERIDOT_CRYSTAL_CLUSTER);

        blockStateModelGenerator.family(ZIRCON_BLOCK);
        blockStateModelGenerator.family(ZIRCON_ORE);
        blockStateModelGenerator.family(DEEPSLATE_ZIRCON_ORE);
        blockStateModelGenerator.family(ZIRCON_CRYSTAL_BLOCK);
        blockStateModelGenerator.createAmethystCluster(ZIRCON_CRYSTAL_CLUSTER);

        blockStateModelGenerator.family(RUBY_BLOCK);
        blockStateModelGenerator.family(RUBY_ORE);
        blockStateModelGenerator.family(RUBY_CRYSTAL_BLOCK);
        blockStateModelGenerator.createAmethystCluster(RUBY_CRYSTAL_CLUSTER);

        blockStateModelGenerator.family(SAPPHIRE_BLOCK);
        blockStateModelGenerator.family(SAPPHIRE_ORE);
        blockStateModelGenerator.family(SAPPHIRE_CRYSTAL_BLOCK);
        blockStateModelGenerator.createAmethystCluster(SAPPHIRE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.family(TOPAZ_BLOCK);
        blockStateModelGenerator.family(TOPAZ_ORE);
        blockStateModelGenerator.family(TOPAZ_CRYSTAL_BLOCK);
        blockStateModelGenerator.createAmethystCluster(TOPAZ_CRYSTAL_CLUSTER);

        blockStateModelGenerator.family(AMETRINE_BLOCK);
        blockStateModelGenerator.family(AMETRINE_ORE);
        blockStateModelGenerator.family(AMETRINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.createAmethystCluster(AMETRINE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.family(JADE_BLOCK);
        blockStateModelGenerator.family(JADE_ORE);
        blockStateModelGenerator.family(JADE_CRYSTAL_BLOCK);
        blockStateModelGenerator.createAmethystCluster(JADE_CRYSTAL_CLUSTER);

        blockStateModelGenerator.family(RAW_NECOIUM_BLOCK);
        blockStateModelGenerator.family(NECOIUM_BLOCK);
        blockStateModelGenerator.family(NECOIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(AQUAMARINE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AQUAMARINE_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AQUAMARINE_CRYSTAL_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AQUAMARINE_POTION, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(CITRINE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CITRINE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CITRINE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CITRINE_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CITRINE_CRYSTAL_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CITRINE_POTION, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(PERIDOT_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(PERIDOT_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(PERIDOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PERIDOT_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PERIDOT_CRYSTAL_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PERIDOT_POTION, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ZIRCON_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ZIRCON_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ZIRCON, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ZIRCON_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ZIRCON_CRYSTAL_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ZIRCON_POTION, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(RUBY_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(RUBY_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(RUBY_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(RUBY_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(RUBY_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(RUBY_CRYSTAL_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(RUBY_POTION, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(SAPPHIRE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(SAPPHIRE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(SAPPHIRE_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(SAPPHIRE_CRYSTAL_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(SAPPHIRE_POTION, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(TOPAZ_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TOPAZ_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TOPAZ_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TOPAZ_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TOPAZ_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TOPAZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TOPAZ_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TOPAZ_CRYSTAL_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TOPAZ_POTION, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(AMETRINE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(AMETRINE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(AMETRINE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AMETRINE_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AMETRINE_CRYSTAL_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AMETRINE_POTION, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(JADE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(JADE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(JADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(JADE_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(JADE_CRYSTAL_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(JADE_POTION, ModelTemplates.FLAT_ITEM);
        
        itemModelGenerator.generateFlatItem(RAW_NECOIUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(NECOIUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(NECOIUM_NUGGET, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(AQUAMARINE_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CITRINE_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(PERIDOT_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ZIRCON_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(RUBY_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(SAPPHIRE_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TOPAZ_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AMETRINE_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(JADE_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateArmorTrims(((ArmorItem) AQUAMARINE_HELMET));
        itemModelGenerator.generateArmorTrims(((ArmorItem) AQUAMARINE_CHESTPLATE));
        itemModelGenerator.generateArmorTrims(((ArmorItem) AQUAMARINE_LEGGINGS));
        itemModelGenerator.generateArmorTrims(((ArmorItem) AQUAMARINE_BOOTS));

        itemModelGenerator.generateArmorTrims(((ArmorItem) PERIDOT_HELMET));
        itemModelGenerator.generateArmorTrims(((ArmorItem) PERIDOT_CHESTPLATE));
        itemModelGenerator.generateArmorTrims(((ArmorItem) PERIDOT_LEGGINGS));
        itemModelGenerator.generateArmorTrims(((ArmorItem) PERIDOT_BOOTS));

        itemModelGenerator.generateArmorTrims(((ArmorItem) CITRINE_HELMET));
        itemModelGenerator.generateArmorTrims(((ArmorItem) CITRINE_CHESTPLATE));
        itemModelGenerator.generateArmorTrims(((ArmorItem) CITRINE_LEGGINGS));
        itemModelGenerator.generateArmorTrims(((ArmorItem) CITRINE_BOOTS));

        itemModelGenerator.generateArmorTrims(((ArmorItem) ZIRCON_HELMET));
        itemModelGenerator.generateArmorTrims(((ArmorItem) ZIRCON_CHESTPLATE));
        itemModelGenerator.generateArmorTrims(((ArmorItem) ZIRCON_LEGGINGS));
        itemModelGenerator.generateArmorTrims(((ArmorItem) ZIRCON_BOOTS));

        itemModelGenerator.generateArmorTrims(((ArmorItem) SAPPHIRE_HELMET));
        itemModelGenerator.generateArmorTrims(((ArmorItem) SAPPHIRE_CHESTPLATE));
        itemModelGenerator.generateArmorTrims(((ArmorItem) SAPPHIRE_LEGGINGS));
        itemModelGenerator.generateArmorTrims(((ArmorItem) SAPPHIRE_BOOTS));

        itemModelGenerator.generateArmorTrims(((ArmorItem) TOPAZ_HELMET));
        itemModelGenerator.generateArmorTrims(((ArmorItem) TOPAZ_CHESTPLATE));
        itemModelGenerator.generateArmorTrims(((ArmorItem) TOPAZ_LEGGINGS));
        itemModelGenerator.generateArmorTrims(((ArmorItem) TOPAZ_BOOTS));
        
        itemModelGenerator.generateArmorTrims(((ArmorItem) AMETRINE_HELMET));
        itemModelGenerator.generateArmorTrims(((ArmorItem) AMETRINE_CHESTPLATE));
        itemModelGenerator.generateArmorTrims(((ArmorItem) AMETRINE_LEGGINGS));
        itemModelGenerator.generateArmorTrims(((ArmorItem) AMETRINE_BOOTS));
        
        itemModelGenerator.generateArmorTrims(((ArmorItem) JADE_HELMET));
        itemModelGenerator.generateArmorTrims(((ArmorItem) JADE_CHESTPLATE));
        itemModelGenerator.generateArmorTrims(((ArmorItem) JADE_LEGGINGS));
        itemModelGenerator.generateArmorTrims(((ArmorItem) JADE_BOOTS));
    }
}