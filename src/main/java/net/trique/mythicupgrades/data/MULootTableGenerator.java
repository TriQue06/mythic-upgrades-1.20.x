package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.trique.mythicupgrades.block.MUBlocks;
import static net.trique.mythicupgrades.item.MUItems.*;

public class MULootTableGenerator extends FabricBlockLootTableProvider {
    public MULootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(MUBlocks.JADE_BLOCK);
        addDrop(MUBlocks.JADE_CRYSTAL_BLOCK);
        addDrop(MUBlocks.TOPAZ_BLOCK);
        addDrop(MUBlocks.TOPAZ_CRYSTAL_BLOCK);
        addDrop(MUBlocks.AQUAMARINE_BLOCK);
        addDrop(MUBlocks.AQUAMARINE_CRYSTAL_BLOCK);
        addDrop(MUBlocks.SAPPHIRE_BLOCK);
        addDrop(MUBlocks.SAPPHIRE_CRYSTAL_BLOCK);
        addDrop(MUBlocks.RUBY_BLOCK);
        addDrop(MUBlocks.RUBY_CRYSTAL_BLOCK);
        addDrop(MUBlocks.AMETRINE_BLOCK);
        addDrop(MUBlocks.AMETRINE_CRYSTAL_BLOCK);

        addDrop(MUBlocks.SAPPHIRE_ORE, oreDrops(MUBlocks.SAPPHIRE_ORE, SAPPHIRE));
        addDrop(MUBlocks.RUBY_ORE, oreDrops(MUBlocks.RUBY_ORE, RUBY));
        addDrop(MUBlocks.JADE_ORE, oreDrops(MUBlocks.JADE_ORE, JADE));
        addDrop(MUBlocks.DEEPSLATE_JADE_ORE, oreDrops(MUBlocks.DEEPSLATE_JADE_ORE, JADE));
        addDrop(MUBlocks.TOPAZ_ORE, oreDrops(MUBlocks.TOPAZ_ORE, TOPAZ));
        addDrop(MUBlocks.DEEPSLATE_TOPAZ_ORE, oreDrops(MUBlocks.DEEPSLATE_TOPAZ_ORE, TOPAZ));
        addDrop(MUBlocks.AMETRINE_ORE, oreDrops(MUBlocks.AMETRINE_ORE, AMETRINE));
        addDrop(MUBlocks.AQUAMARINE_ORE, oreDrops(MUBlocks.AQUAMARINE_ORE, AQUAMARINE));
        addDrop(MUBlocks.DEEPSLATE_AQUAMARINE_ORE, oreDrops(MUBlocks.DEEPSLATE_AQUAMARINE_ORE, AQUAMARINE));
    }
}