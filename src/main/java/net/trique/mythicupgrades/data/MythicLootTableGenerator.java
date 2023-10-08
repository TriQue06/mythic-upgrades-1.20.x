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
        addDrop(MythicBlocks.JADE_CRYSTAL_BLOCK);
        addDrop(MythicBlocks.TOPAZ_BLOCK);
        addDrop(MythicBlocks.TOPAZ_CRYSTAL_BLOCK);
        addDrop(MythicBlocks.AQUAMARINE_BLOCK);
        addDrop(MythicBlocks.AQUAMARINE_CRYSTAL_BLOCK);
        addDrop(MythicBlocks.SAPPHIRE_BLOCK);
        addDrop(MythicBlocks.SAPPHIRE_CRYSTAL_BLOCK);
        addDrop(MythicBlocks.RUBY_BLOCK);
        addDrop(MythicBlocks.RUBY_CRYSTAL_BLOCK);
        addDrop(MythicBlocks.AMETRINE_BLOCK);
        addDrop(MythicBlocks.AMETRINE_CRYSTAL_BLOCK);

        addDrop(MythicBlocks.SAPPHIRE_ORE, oreDrops(MythicBlocks.SAPPHIRE_ORE, RegisterMythicItems.SAPPHIRE));
        addDrop(MythicBlocks.RUBY_ORE, oreDrops(MythicBlocks.RUBY_ORE, RegisterMythicItems.RUBY));
        addDrop(MythicBlocks.JADE_ORE, oreDrops(MythicBlocks.JADE_ORE, RegisterMythicItems.JADE));
        addDrop(MythicBlocks.DEEPSLATE_JADE_ORE, oreDrops(MythicBlocks.DEEPSLATE_JADE_ORE, RegisterMythicItems.JADE));
        addDrop(MythicBlocks.TOPAZ_ORE, oreDrops(MythicBlocks.TOPAZ_ORE, RegisterMythicItems.TOPAZ));
        addDrop(MythicBlocks.DEEPSLATE_TOPAZ_ORE, oreDrops(MythicBlocks.DEEPSLATE_TOPAZ_ORE, RegisterMythicItems.TOPAZ));
        addDrop(MythicBlocks.AMETRINE_ORE, oreDrops(MythicBlocks.AMETRINE_ORE, RegisterMythicItems.AMETRINE));
        addDrop(MythicBlocks.AQUAMARINE_ORE, oreDrops(MythicBlocks.AQUAMARINE_ORE, RegisterMythicItems.AQUAMARINE));
        addDrop(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE, oreDrops(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE, RegisterMythicItems.AQUAMARINE));
    }
}