package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.trique.mythicupgrades.block.MythicBlocks;
import net.trique.mythicupgrades.item.MythicItems;

public class MythicLootTableGenerator extends FabricBlockLootTableProvider {
    public MythicLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(MythicBlocks.SAPPHIRE_BLOCK);
        addDrop(MythicBlocks.RUBY_BLOCK);
        addDrop(MythicBlocks.JADE_BLOCK);
        addDrop(MythicBlocks.TOPAZ_BLOCK);
        addDrop(MythicBlocks.AMETRINE_BLOCK);
        addDrop(MythicBlocks.AQUAMARINE_BLOCK);

        addDrop(MythicBlocks.SAPPHIRE_ORE, oreDrops(MythicBlocks.SAPPHIRE_ORE, MythicItems.SAPPHIRE));
        addDrop(MythicBlocks.RUBY_ORE, oreDrops(MythicBlocks.RUBY_ORE, MythicItems.RUBY));
        addDrop(MythicBlocks.JADE_ORE, oreDrops(MythicBlocks.JADE_ORE, MythicItems.JADE));
        addDrop(MythicBlocks.DEEPSLATE_JADE_ORE, oreDrops(MythicBlocks.DEEPSLATE_JADE_ORE, MythicItems.JADE));
        addDrop(MythicBlocks.TOPAZ_ORE, oreDrops(MythicBlocks.TOPAZ_ORE, MythicItems.TOPAZ));
        addDrop(MythicBlocks.DEEPSLATE_TOPAZ_ORE, oreDrops(MythicBlocks.DEEPSLATE_TOPAZ_ORE, MythicItems.TOPAZ));
        addDrop(MythicBlocks.AMETRINE_ORE, oreDrops(MythicBlocks.AMETRINE_ORE, MythicItems.AMETRINE));
        addDrop(MythicBlocks.AQUAMARINE_ORE, oreDrops(MythicBlocks.AQUAMARINE_ORE, MythicItems.AQUAMARINE));
        addDrop(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE, oreDrops(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE, MythicItems.AQUAMARINE));
    }
}
