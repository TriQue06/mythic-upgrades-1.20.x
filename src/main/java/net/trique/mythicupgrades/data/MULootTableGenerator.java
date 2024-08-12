package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import static net.trique.mythicupgrades.item.MUItems.*;
import static net.trique.mythicupgrades.block.MUBlocks.*;

public class MULootTableGenerator extends FabricBlockLootTableProvider {

    public MULootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
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
        add(DEEPSLATE_TOPAZ_ORE, createOreDrop(DEEPSLATE_TOPAZ_ORE, TOPAZ));

        dropSelf(AMETRINE_BLOCK);
        dropSelf(AMETRINE_CRYSTAL_BLOCK);
        add(AMETRINE_ORE, createOreDrop(AMETRINE_ORE, AMETRINE));

        dropSelf(JADE_BLOCK);
        dropSelf(JADE_CRYSTAL_BLOCK);
        add(JADE_ORE, createOreDrop(JADE_ORE, JADE));

        dropSelf(NECOIUM_BLOCK);
        dropSelf(RAW_NECOIUM_BLOCK);
        add(NECOIUM_ORE, createOreDrop(NECOIUM_ORE, RAW_NECOIUM));


        add(AMETRINE_CRYSTAL_CLUSTER, createClusterDrops(AMETRINE_CRYSTAL_CLUSTER, AMETRINE_CRYSTAL_SHARD));
        add(AQUAMARINE_CRYSTAL_CLUSTER, createClusterDrops(AQUAMARINE_CRYSTAL_CLUSTER, AQUAMARINE_CRYSTAL_SHARD));
        add(JADE_CRYSTAL_CLUSTER, createClusterDrops(JADE_CRYSTAL_CLUSTER, JADE_CRYSTAL_SHARD));
        add(PERIDOT_CRYSTAL_CLUSTER, createClusterDrops(PERIDOT_CRYSTAL_CLUSTER, PERIDOT_CRYSTAL_SHARD));
        add(RUBY_CRYSTAL_CLUSTER, createClusterDrops(RUBY_CRYSTAL_CLUSTER, RUBY_CRYSTAL_SHARD));
        add(SAPPHIRE_CRYSTAL_CLUSTER, createClusterDrops(SAPPHIRE_CRYSTAL_CLUSTER, SAPPHIRE_CRYSTAL_SHARD));
        add(TOPAZ_CRYSTAL_CLUSTER, createClusterDrops(TOPAZ_CRYSTAL_CLUSTER, TOPAZ_CRYSTAL_SHARD));
    }


    public LootTable.Builder createClusterDrops(Block block, Item item) {
        return createSilkTouchDispatchTable(block, LootItem.lootTableItem(item)
                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0f)))
                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                .otherwise(applyExplosionDecay(block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f)))))
        );
    }
}