package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static net.trique.mythicupgrades.item.MUItems.*;
import static net.trique.mythicupgrades.block.MUBlocks.*;

public class MULootTableGenerator extends FabricBlockLootTableProvider {

    protected MULootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(AQUAMARINE_BLOCK);
        dropSelf(AQUAMARINE_CRYSTAL_BLOCK);
        add(AQUAMARINE_ORE, createOreDrop(AQUAMARINE_ORE, AQUAMARINE));
        add(DEEPSLATE_AQUAMARINE_ORE, createOreDrop(DEEPSLATE_AQUAMARINE_ORE, AQUAMARINE));

        dropSelf(PERIDOT_BLOCK);
        dropSelf(PERIDOT_CRYSTAL_BLOCK);
        add(PERIDOT_ORE, createOreDrop(PERIDOT_ORE, PERIDOT));
        add(DEEPSLATE_PERIDOT_ORE, createOreDrop(DEEPSLATE_PERIDOT_ORE, PERIDOT));


        dropSelf(RUBY_BLOCK);
        dropSelf(RUBY_CRYSTAL_BLOCK);
        add(RUBY_ORE, createOreDrop(RUBY_ORE, RUBY));

        dropSelf(SAPPHIRE_BLOCK);
        dropSelf(SAPPHIRE_CRYSTAL_BLOCK);
        add(SAPPHIRE_ORE, createOreDrop(SAPPHIRE_ORE, SAPPHIRE));

        dropSelf(TOPAZ_BLOCK);
        dropSelf(TOPAZ_CRYSTAL_BLOCK);
        add(TOPAZ_ORE, createOreDrop(TOPAZ_ORE, TOPAZ));

        dropSelf(AMETRINE_BLOCK);
        dropSelf(AMETRINE_CRYSTAL_BLOCK);
        add(AMETRINE_ORE, createOreDrop(AMETRINE_ORE, AMETRINE));

        dropSelf(JADE_BLOCK);
        dropSelf(JADE_CRYSTAL_BLOCK);
        add(JADE_ORE, createOreDrop(JADE_ORE, JADE));

        dropSelf(NECOIUM_BLOCK);
        dropSelf(RAW_NECOIUM_BLOCK);
        add(NECOIUM_ORE, createOreDrop(NECOIUM_ORE, RAW_NECOIUM));
    }
}