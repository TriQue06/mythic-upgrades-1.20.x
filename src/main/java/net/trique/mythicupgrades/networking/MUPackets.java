package net.trique.mythicupgrades.networking;


import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.trique.mythicupgrades.networking.packet.PercentAnimationPacket;
import net.trique.mythicupgrades.registry.RegisterMUParticles;

public class MUPackets {


    public static void registerPacketCodecs() {
        PayloadTypeRegistry.playS2C().register(PercentAnimationPacket.PACKET_ID, PercentAnimationPacket.PACKET_CODEC);
    }


    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(PercentAnimationPacket.PACKET_ID, (payload, context) -> {
            context.client().particleEngine.createTrackingEmitter(context.player().level().getEntity(payload.Id()), RegisterMUParticles.PERCENT_PARTICLE);
        });
    }
}
