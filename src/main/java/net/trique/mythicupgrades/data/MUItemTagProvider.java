package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static net.trique.mythicupgrades.item.MUItems.*;

public class MUItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public MUItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(JADE_HELMET, JADE_CHESTPLATE, JADE_LEGGINGS, JADE_BOOTS,
                        TOPAZ_HELMET, TOPAZ_CHESTPLATE, TOPAZ_LEGGINGS, TOPAZ_BOOTS,
                        SAPPHIRE_HELMET, SAPPHIRE_CHESTPLATE, SAPPHIRE_LEGGINGS, SAPPHIRE_BOOTS,
                        AMETRINE_HELMET, AMETRINE_CHESTPLATE, AMETRINE_LEGGINGS, AMETRINE_BOOTS
                );
    }
}