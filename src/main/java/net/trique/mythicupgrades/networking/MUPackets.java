package net.trique.mythicupgrades.networking;


import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import net.trique.mythicupgrades.networking.packet.PercentAnimationPacket;
import net.trique.mythicupgrades.registry.RegisterMUParticles;

public class MUPackets {


    public static void registerPacketCodecs() {
        PayloadTypeRegistry.playS2C().register(PercentAnimationPacket.PACKET_ID, PercentAnimationPacket.PACKET_CODEC);
    }


    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(PercentAnimationPacket.PACKET_ID, (payload, context) -> {
            LocalPlayer player = context.player();
            if (player != null && player.level().getEntity(payload.Id()) instanceof Entity entity) {
                context.client().particleEngine.createTrackingEmitter(entity, RegisterMUParticles.PERCENT_PARTICLE);
            }
        });
    }
}
