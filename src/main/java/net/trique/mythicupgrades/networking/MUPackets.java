package net.trique.mythicupgrades.networking;


import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.trique.mythicupgrades.networking.packet.PercentAnimationPacket;
import net.trique.mythicupgrades.registry.RegisterMUParticles;

public class MUPackets {

    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(PercentAnimationPacket.PACKET_ID, (client, handler, buf, responseSender) -> {
            client.execute(() -> {
                client.particleEngine.createTrackingEmitter(client.player.level().getEntity(buf.readVarInt()),
                        RegisterMUParticles.PERCENT_PARTICLE);
            });
        });
    }
}
