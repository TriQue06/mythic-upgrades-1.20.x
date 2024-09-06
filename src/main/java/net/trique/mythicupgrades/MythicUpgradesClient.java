package net.trique.mythicupgrades;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.trique.mythicupgrades.networking.MUPackets;
import net.trique.mythicupgrades.particle.PercentParticle;
import net.trique.mythicupgrades.registry.RegisterMUParticles;
import net.trique.mythicupgrades.util.SpelunkerEffectRenderer;

import java.util.List;

import static net.trique.mythicupgrades.block.MUBlocks.*;

public class MythicUpgradesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        for (Block crystal: List.of(AMETRINE_CRYSTAL_CLUSTER, AQUAMARINE_CRYSTAL_CLUSTER,
                JADE_CRYSTAL_CLUSTER, PERIDOT_CRYSTAL_CLUSTER, RUBY_CRYSTAL_CLUSTER,
                SAPPHIRE_CRYSTAL_CLUSTER, TOPAZ_CRYSTAL_CLUSTER)) {
            BlockRenderLayerMap.INSTANCE.putBlock(crystal, RenderType.cutout());
        }
        ParticleFactoryRegistry.getInstance().register(RegisterMUParticles.PERCENT_PARTICLE, PercentParticle.Provider::new);
        MUPackets.registerS2CPackets();
        ClientTickEvents.START_CLIENT_TICK.register((client ->
                SpelunkerEffectRenderer.clientFillRenderPositions(client.player)));
        ClientTickEvents.START_CLIENT_TICK.register((client -> {

        }));
        WorldRenderEvents.AFTER_TRANSLUCENT.register((SpelunkerEffectRenderer::render));
    }
}