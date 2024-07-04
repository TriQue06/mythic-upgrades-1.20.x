package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import static net.trique.mythicupgrades.item.MUItems.*;
import static net.trique.mythicupgrades.block.MUBlocks.*;

public class MULootTableGenerator extends FabricBlockLootTableProvider {
    public MULootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(AQUAMARINE_BLOCK);
        addDrop(AQUAMARINE_CRYSTAL_BLOCK);
        addDrop(AQUAMARINE_ORE, oreDrops(AQUAMARINE_ORE, AQUAMARINE));
        addDrop(DEEPSLATE_AQUAMARINE_ORE, oreDrops(DEEPSLATE_AQUAMARINE_ORE, AQUAMARINE));

        addDrop(PERIDOT_BLOCK);
        addDrop(PERIDOT_CRYSTAL_BLOCK);
        addDrop(PERIDOT_ORE, oreDrops(PERIDOT_ORE, PERIDOT));
        addDrop(DEEPSLATE_PERIDOT_ORE, oreDrops(DEEPSLATE_PERIDOT_ORE, PERIDOT));

        addDrop(TOPAZ_BLOCK);
        addDrop(TOPAZ_CRYSTAL_BLOCK);
        addDrop(TOPAZ_ORE, oreDrops(TOPAZ_ORE, TOPAZ));
        addDrop(DEEPSLATE_TOPAZ_ORE, oreDrops(DEEPSLATE_TOPAZ_ORE, TOPAZ));

        addDrop(RUBY_BLOCK);
        addDrop(RUBY_CRYSTAL_BLOCK);
        addDrop(RUBY_ORE, oreDrops(RUBY_ORE, RUBY));

        addDrop(SAPPHIRE_BLOCK);
        addDrop(SAPPHIRE_CRYSTAL_BLOCK);
        addDrop(SAPPHIRE_ORE, oreDrops(SAPPHIRE_ORE, SAPPHIRE));

        addDrop(AMETRINE_BLOCK);
        addDrop(AMETRINE_CRYSTAL_BLOCK);
        addDrop(AMETRINE_ORE, oreDrops(AMETRINE_ORE, AMETRINE));

        addDrop(JADE_BLOCK);
        addDrop(JADE_CRYSTAL_BLOCK);
        addDrop(JADE_ORE, oreDrops(JADE_ORE, JADE));

        addDrop(NECOIUM_BLOCK);
        addDrop(RAW_NECOIUM_BLOCK);
        addDrop(NECOIUM_ORE, oreDrops(NECOIUM_ORE, RAW_NECOIUM));
    }
}