package net.trique.mythicupgrades.networking;


import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.player.LocalPlayer;
import net.trique.mythicupgrades.networking.packet.PercentAnimationPacket;
import net.trique.mythicupgrades.registry.RegisterMUParticles;

public class MUPackets {

    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(PercentAnimationPacket.PACKET_ID, (client, handler, buf, responseSender) -> client.execute(() -> {
            LocalPlayer localPlayer = client.player;
            if (localPlayer != null && localPlayer.level().getEntity(buf.readVarInt()) != null) {
                client.particleEngine.createTrackingEmitter(localPlayer.level().getEntity(buf.readVarInt()),
                        RegisterMUParticles.PERCENT_PARTICLE);
            }
        }));
    }
}
