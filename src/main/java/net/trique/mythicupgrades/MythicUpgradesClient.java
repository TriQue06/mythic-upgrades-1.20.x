package net.trique.mythicupgrades;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.trique.mythicupgrades.block.MUBlocks;

public class MythicUpgradesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.AQUAMARINE_CRYSTAL_CLUSTER, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.CITRINE_CRYSTAL_CLUSTER, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.PERIDOT_CRYSTAL_CLUSTER, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.ZIRCON_CRYSTAL_CLUSTER, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.RUBY_CRYSTAL_CLUSTER, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.SAPPHIRE_CRYSTAL_CLUSTER, RenderType.cutout());
        
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.TOPAZ_CRYSTAL_CLUSTER, RenderType.cutout());
        
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.AMETRINE_CRYSTAL_CLUSTER, RenderType.cutout());
        
        BlockRenderLayerMap.INSTANCE.putBlock(MUBlocks.JADE_CRYSTAL_CLUSTER, RenderType.cutout());
    }
}