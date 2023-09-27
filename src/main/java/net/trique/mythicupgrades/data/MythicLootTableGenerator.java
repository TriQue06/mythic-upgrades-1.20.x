package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.trique.mythicupgrades.block.MythicBlocks;
import net.trique.mythicupgrades.registry.RegisterMythicItems;

public class MythicLootTableGenerator extends FabricBlockLootTableProvider {
    public MythicLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(MythicBlocks.JADE_BLOCK);
        addDrop(MythicBlocks.TOPAZ_BLOCK);
        addDrop(MythicBlocks.AQUAMARINE_BLOCK);
        addDrop(MythicBlocks.SAPPHIRE_BLOCK);
        addDrop(MythicBlocks.RUBY_BLOCK);
        addDrop(MythicBlocks.AMETRINE_BLOCK);

        addDrop(MythicBlocks.JADE_CRYSTAL_BLOCK, oreDrops(MythicBlocks.JADE_CRYSTAL_BLOCK, RegisterMythicItems.JADE_SHARD));
        addDrop(MythicBlocks.JADE_ORE, oreDrops(MythicBlocks.JADE_ORE, RegisterMythicItems.JADE));
        addDrop(MythicBlocks.DEEPSLATE_JADE_ORE, oreDrops(MythicBlocks.DEEPSLATE_JADE_ORE, RegisterMythicItems.JADE));
        addDrop(MythicBlocks.JADE_RUINS, oreDrops(MythicBlocks.JADE_RUINS, RegisterMythicItems.JADE_FRAGMENT));
        addDrop(MythicBlocks.DEEPSLATE_JADE_RUINS, oreDrops(MythicBlocks.DEEPSLATE_JADE_RUINS, RegisterMythicItems.JADE_FRAGMENT));
        
        addDrop(MythicBlocks.TOPAZ_CRYSTAL_BLOCK, oreDrops(MythicBlocks.TOPAZ_CRYSTAL_BLOCK, RegisterMythicItems.TOPAZ_SHARD));
        addDrop(MythicBlocks.TOPAZ_ORE, oreDrops(MythicBlocks.TOPAZ_ORE, RegisterMythicItems.TOPAZ));
        addDrop(MythicBlocks.DEEPSLATE_TOPAZ_ORE, oreDrops(MythicBlocks.DEEPSLATE_TOPAZ_ORE, RegisterMythicItems.TOPAZ));
        addDrop(MythicBlocks.TOPAZ_RUINS, oreDrops(MythicBlocks.TOPAZ_RUINS, RegisterMythicItems.TOPAZ_FRAGMENT));
        addDrop(MythicBlocks.DEEPSLATE_TOPAZ_RUINS, oreDrops(MythicBlocks.DEEPSLATE_TOPAZ_RUINS, RegisterMythicItems.TOPAZ_FRAGMENT));
        
        addDrop(MythicBlocks.AQUAMARINE_CRYSTAL_BLOCK, oreDrops(MythicBlocks.AQUAMARINE_CRYSTAL_BLOCK, RegisterMythicItems.AQUAMARINE_SHARD));
        addDrop(MythicBlocks.AQUAMARINE_ORE, oreDrops(MythicBlocks.AQUAMARINE_ORE, RegisterMythicItems.AQUAMARINE));
        addDrop(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE, oreDrops(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE, RegisterMythicItems.AQUAMARINE));
        addDrop(MythicBlocks.AQUAMARINE_RUINS, oreDrops(MythicBlocks.AQUAMARINE_RUINS, RegisterMythicItems.AQUAMARINE_FRAGMENT));
        addDrop(MythicBlocks.DEEPSLATE_AQUAMARINE_RUINS, oreDrops(MythicBlocks.DEEPSLATE_AQUAMARINE_RUINS, RegisterMythicItems.AQUAMARINE_FRAGMENT));
        
        addDrop(MythicBlocks.SAPPHIRE_CRYSTAL_BLOCK, oreDrops(MythicBlocks.SAPPHIRE_CRYSTAL_BLOCK, RegisterMythicItems.SAPPHIRE_SHARD));
        addDrop(MythicBlocks.SAPPHIRE_ORE, oreDrops(MythicBlocks.SAPPHIRE_ORE, RegisterMythicItems.SAPPHIRE));
        addDrop(MythicBlocks.SAPPHIRE_RUINS, oreDrops(MythicBlocks.SAPPHIRE_RUINS, RegisterMythicItems.SAPPHIRE_FRAGMENT));
        
        addDrop(MythicBlocks.RUBY_CRYSTAL_BLOCK, oreDrops(MythicBlocks.RUBY_CRYSTAL_BLOCK, RegisterMythicItems.RUBY_SHARD));
        addDrop(MythicBlocks.RUBY_ORE, oreDrops(MythicBlocks.RUBY_ORE, RegisterMythicItems.RUBY));
        addDrop(MythicBlocks.RUBY_RUINS, oreDrops(MythicBlocks.RUBY_RUINS, RegisterMythicItems.RUBY_FRAGMENT));
        
        addDrop(MythicBlocks.AMETRINE_CRYSTAL_BLOCK, oreDrops(MythicBlocks.AMETRINE_CRYSTAL_BLOCK, RegisterMythicItems.AMETRINE_SHARD));
        addDrop(MythicBlocks.AMETRINE_ORE, oreDrops(MythicBlocks.AMETRINE_ORE, RegisterMythicItems.AMETRINE));
        addDrop(MythicBlocks.AMETRINE_RUINS, oreDrops(MythicBlocks.AMETRINE_RUINS, RegisterMythicItems.AMETRINE_FRAGMENT));
    }
}