package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

import static net.trique.mythicupgrades.item.MUItems.*;

public class MUItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public MUItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(
                        AQUAMARINE_HELMET, AQUAMARINE_CHESTPLATE, AQUAMARINE_LEGGINGS, AQUAMARINE_BOOTS,
                        PERIDOT_HELMET, PERIDOT_CHESTPLATE, PERIDOT_LEGGINGS, PERIDOT_BOOTS,
                        SAPPHIRE_HELMET, SAPPHIRE_CHESTPLATE, SAPPHIRE_LEGGINGS, SAPPHIRE_BOOTS,
                        TOPAZ_HELMET, TOPAZ_CHESTPLATE, TOPAZ_LEGGINGS, TOPAZ_BOOTS,
                        AMETRINE_HELMET, AMETRINE_CHESTPLATE, AMETRINE_LEGGINGS, AMETRINE_BOOTS,
                        JADE_HELMET, JADE_CHESTPLATE, JADE_LEGGINGS, JADE_BOOTS,
                        RUBY_HELMET, RUBY_CHESTPLATE, RUBY_LEGGINGS, RUBY_BOOTS);
        getOrCreateTagBuilder(ItemTags.CLUSTER_MAX_HARVESTABLES).add(
                RUBY_PICKAXE, TOPAZ_PICKAXE, SAPPHIRE_PICKAXE, JADE_PICKAXE, AMETRINE_PICKAXE,
                AQUAMARINE_PICKAXE, PERIDOT_PICKAXE
        );
        getOrCreateTagBuilder(ItemTags.SWORDS).add(
                AMETRINE_SWORD, AQUAMARINE_SWORD, JADE_SWORD, PERIDOT_SWORD, RUBY_SWORD, SAPPHIRE_SWORD, TOPAZ_SWORD
        );
        getOrCreateTagBuilder(ItemTags.AXES).add(
                AMETRINE_AXE, AQUAMARINE_AXE, JADE_AXE, PERIDOT_AXE, RUBY_AXE, SAPPHIRE_AXE, TOPAZ_AXE

        );
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(
                AMETRINE_PICKAXE, AQUAMARINE_PICKAXE, JADE_PICKAXE, PERIDOT_PICKAXE, RUBY_PICKAXE, SAPPHIRE_PICKAXE, TOPAZ_PICKAXE
        );
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(
                AMETRINE_SHOVEL, AQUAMARINE_SHOVEL, JADE_SHOVEL, PERIDOT_SHOVEL, RUBY_SHOVEL, SAPPHIRE_SHOVEL, TOPAZ_SHOVEL
        );
        getOrCreateTagBuilder(ItemTags.HOES).add(
                AMETRINE_HOE, AQUAMARINE_HOE, JADE_HOE, PERIDOT_HOE, RUBY_HOE, SAPPHIRE_HOE, TOPAZ_HOE
        );
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR).add(
                AMETRINE_HELMET, AQUAMARINE_HELMET, JADE_HELMET, PERIDOT_HELMET, RUBY_HELMET, SAPPHIRE_HELMET, TOPAZ_HELMET
        );
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR).add(
                AMETRINE_CHESTPLATE, AQUAMARINE_CHESTPLATE, JADE_CHESTPLATE, PERIDOT_CHESTPLATE, RUBY_CHESTPLATE, SAPPHIRE_CHESTPLATE, TOPAZ_CHESTPLATE
        );
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR).add(
                AMETRINE_LEGGINGS, AQUAMARINE_LEGGINGS, JADE_LEGGINGS, PERIDOT_LEGGINGS, RUBY_LEGGINGS, SAPPHIRE_LEGGINGS, TOPAZ_LEGGINGS
        );
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR).add(
                AMETRINE_BOOTS, AQUAMARINE_BOOTS, JADE_BOOTS, PERIDOT_BOOTS, RUBY_BOOTS, SAPPHIRE_BOOTS, TOPAZ_BOOTS
        );
    }
}