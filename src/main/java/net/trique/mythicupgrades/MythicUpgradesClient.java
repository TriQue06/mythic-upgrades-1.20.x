package net.trique.mythicupgrades;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.trique.mythicupgrades.block.MUBlocks;

public class MythicUpgradesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.AQUAMARINE_CRYSTAL_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.LARGE_AQUAMARINE_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.MEDIUM_AQUAMARINE_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.SMALL_AQUAMARINE_CRYSTAL_BUD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.CITRINE_CRYSTAL_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.LARGE_CITRINE_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.MEDIUM_CITRINE_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.SMALL_CITRINE_CRYSTAL_BUD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.PERIDOT_CRYSTAL_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.LARGE_PERIDOT_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.MEDIUM_PERIDOT_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.SMALL_PERIDOT_CRYSTAL_BUD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.ZIRCON_CRYSTAL_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.LARGE_ZIRCON_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.MEDIUM_ZIRCON_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.SMALL_ZIRCON_CRYSTAL_BUD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.RUBY_CRYSTAL_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.LARGE_RUBY_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.MEDIUM_RUBY_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.SMALL_RUBY_CRYSTAL_BUD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.SAPPHIRE_CRYSTAL_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.LARGE_SAPPHIRE_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.MEDIUM_SAPPHIRE_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.SMALL_SAPPHIRE_CRYSTAL_BUD, RenderLayer.getCutout());
        
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.TOPAZ_CRYSTAL_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.LARGE_TOPAZ_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.MEDIUM_TOPAZ_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.SMALL_TOPAZ_CRYSTAL_BUD, RenderLayer.getCutout());
        
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.AMETRINE_CRYSTAL_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.LARGE_AMETRINE_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.MEDIUM_AMETRINE_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.SMALL_AMETRINE_CRYSTAL_BUD, RenderLayer.getCutout());
        
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.JADE_CRYSTAL_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.LARGE_JADE_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.MEDIUM_JADE_CRYSTAL_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.SMALL_JADE_CRYSTAL_BUD, RenderLayer.getCutout());
    }
}