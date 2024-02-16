package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import static net.trique.mythicupgrades.item.MUItems.*;
import static net.trique.mythicupgrades.block.MUBlocks.*;
import static net.trique.mythicupgrades.util.DataGenHelper.*;

public class MULootTableGenerator extends FabricBlockLootTableProvider {
    public MULootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(JADE_BLOCK);
        addDrop(JADE_CRYSTAL_BLOCK);
        addDrop(TOPAZ_BLOCK);
        addDrop(TOPAZ_CRYSTAL_BLOCK);
        addDrop(AQUAMARINE_BLOCK);
        addDrop(AQUAMARINE_CRYSTAL_BLOCK);
        addDrop(SAPPHIRE_BLOCK);
        addDrop(SAPPHIRE_CRYSTAL_BLOCK);
        addDrop(RUBY_BLOCK);
        addDrop(RUBY_CRYSTAL_BLOCK);
        addDrop(AMETRINE_BLOCK);
        addDrop(AMETRINE_CRYSTAL_BLOCK);
        addDrop(NECOIUM_BLOCK);
        addDrop(RAW_NECOIUM_BLOCK);

        addDrop(JADE_ORE, oreDrops(JADE_ORE, JADE));
        addDrop(DEEPSLATE_JADE_ORE, oreDrops(DEEPSLATE_JADE_ORE, JADE));
        addDrop(TOPAZ_ORE, oreDrops(TOPAZ_ORE, TOPAZ));
        addDrop(DEEPSLATE_TOPAZ_ORE, oreDrops(DEEPSLATE_TOPAZ_ORE, TOPAZ));
        addDrop(AQUAMARINE_ORE, oreDrops(AQUAMARINE_ORE, AQUAMARINE));
        addDrop(DEEPSLATE_AQUAMARINE_ORE, oreDrops(DEEPSLATE_AQUAMARINE_ORE, AQUAMARINE));
        addDrop(SAPPHIRE_ORE, oreDrops(SAPPHIRE_ORE, SAPPHIRE));
        addDrop(RUBY_ORE, oreDrops(RUBY_ORE, RUBY));
        addDrop(AMETRINE_ORE, oreDrops(AMETRINE_ORE, AMETRINE));
        addDrop(NECOIUM_ORE, oreDrops(NECOIUM_ORE, RAW_NECOIUM));
    }
}