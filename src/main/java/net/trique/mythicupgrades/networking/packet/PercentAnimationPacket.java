package net.trique.mythicupgrades.networking.packet;


import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.trique.mythicupgrades.MythicUpgrades;

public record PercentAnimationPacket(int Id) implements CustomPacketPayload {
    public static final CustomPacketPayload.Type<PercentAnimationPacket> PACKET_ID = new CustomPacketPayload.Type<>(
            ResourceLocation.fromNamespaceAndPath(
                    MythicUpgrades.MOD_ID,
                    "play_percent_particle"
            )
    );

    public static final StreamCodec<FriendlyByteBuf, PercentAnimationPacket> PACKET_CODEC = StreamCodec.ofMember(
            PercentAnimationPacket::writeId, PercentAnimationPacket::new
    );

    public PercentAnimationPacket(FriendlyByteBuf buf) {
        this(buf.readVarInt());
    }

    public void writeId(FriendlyByteBuf buf) {
        buf.writeVarInt(Id);
    }


    @Override
    public Type<? extends CustomPacketPayload> type() {
        return PACKET_ID;
    }
}
