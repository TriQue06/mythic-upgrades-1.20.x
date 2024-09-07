package net.trique.mythicupgrades.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.trique.mythicupgrades.util.MUBlockTags;

import java.util.concurrent.CompletableFuture;

import static net.trique.mythicupgrades.block.MUBlocks.*;

public class MUBlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public MUBlockTagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(
                AQUAMARINE_BLOCK, AQUAMARINE_ORE, DEEPSLATE_AQUAMARINE_ORE, AQUAMARINE_CRYSTAL_BLOCK, AQUAMARINE_CRYSTAL_CLUSTER,
                TOPAZ_BLOCK, TOPAZ_ORE, DEEPSLATE_TOPAZ_ORE, TOPAZ_CRYSTAL_BLOCK, TOPAZ_CRYSTAL_CLUSTER,
                PERIDOT_BLOCK, PERIDOT_ORE, DEEPSLATE_PERIDOT_ORE, PERIDOT_CRYSTAL_BLOCK, PERIDOT_CRYSTAL_CLUSTER,
                RUBY_BLOCK, RUBY_ORE, RUBY_CRYSTAL_BLOCK, RUBY_CRYSTAL_CLUSTER,
                SAPPHIRE_BLOCK, SAPPHIRE_ORE, SAPPHIRE_CRYSTAL_BLOCK, SAPPHIRE_CRYSTAL_CLUSTER,
                JADE_BLOCK, JADE_ORE, JADE_CRYSTAL_BLOCK, JADE_CRYSTAL_CLUSTER,
                AMETRINE_BLOCK, AMETRINE_ORE, AMETRINE_CRYSTAL_BLOCK, AMETRINE_CRYSTAL_CLUSTER,
                NECOIUM_BLOCK, NECOIUM_ORE, RAW_NECOIUM_BLOCK
        );
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(
                AQUAMARINE_CRYSTAL_BLOCK, AQUAMARINE_CRYSTAL_CLUSTER,
                TOPAZ_CRYSTAL_BLOCK, TOPAZ_CRYSTAL_CLUSTER,
                PERIDOT_CRYSTAL_BLOCK, PERIDOT_CRYSTAL_CLUSTER,
                RUBY_CRYSTAL_BLOCK, RUBY_CRYSTAL_CLUSTER,
                SAPPHIRE_CRYSTAL_BLOCK, SAPPHIRE_CRYSTAL_CLUSTER,
                JADE_CRYSTAL_BLOCK, JADE_CRYSTAL_CLUSTER,
                AMETRINE_CRYSTAL_BLOCK, AMETRINE_CRYSTAL_CLUSTER
        );
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add(
                AQUAMARINE_BLOCK, AQUAMARINE_ORE, DEEPSLATE_AQUAMARINE_ORE,
                TOPAZ_BLOCK, TOPAZ_ORE, DEEPSLATE_TOPAZ_ORE,
                PERIDOT_BLOCK, PERIDOT_ORE, DEEPSLATE_PERIDOT_ORE,
                RUBY_BLOCK, RUBY_ORE,
                SAPPHIRE_BLOCK, SAPPHIRE_ORE,
                JADE_BLOCK, JADE_ORE,
                AMETRINE_BLOCK, AMETRINE_ORE,
                NECOIUM_BLOCK, NECOIUM_ORE, RAW_NECOIUM_BLOCK
        );
        getOrCreateTagBuilder(ConventionalBlockTags.ORES).add(
                AMETRINE_ORE, AQUAMARINE_ORE, DEEPSLATE_AQUAMARINE_ORE,
                JADE_ORE, PERIDOT_ORE, DEEPSLATE_PERIDOT_ORE, RUBY_ORE,
                SAPPHIRE_ORE, TOPAZ_ORE, DEEPSLATE_TOPAZ_ORE, NECOIUM_ORE,
                RAW_NECOIUM_BLOCK
        );

        getOrCreateTagBuilder(MUBlockTags.INCORRECT_FOR_AMETRINE_TOOL);
        getOrCreateTagBuilder(MUBlockTags.INCORRECT_FOR_AQUAMARINE_TOOL);
        getOrCreateTagBuilder(MUBlockTags.INCORRECT_FOR_JADE_TOOL);
        getOrCreateTagBuilder(MUBlockTags.INCORRECT_FOR_PERIDOT_TOOL);
        getOrCreateTagBuilder(MUBlockTags.INCORRECT_FOR_RUBY_TOOL);
        getOrCreateTagBuilder(MUBlockTags.INCORRECT_FOR_SAPPHIRE_TOOL);
        getOrCreateTagBuilder(MUBlockTags.INCORRECT_FOR_TOPAZ_TOOL);

        getOrCreateTagBuilder(MUBlockTags.SPELUNKER_OUTLINED).addTag(
                ConventionalBlockTags.ORES
        );
    }
}
