package net.trique.mythicupgrades.networking.packet;


import net.fabricmc.fabric.api.networking.v1.FabricPacket;
import net.fabricmc.fabric.api.networking.v1.PacketType;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.trique.mythicupgrades.MythicUpgrades;

public record PercentAnimationPacket(int Id) implements FabricPacket {
    public static final ResourceLocation PACKET_ID = new ResourceLocation(
                    MythicUpgrades.MOD_ID,
                    "play_percent_particle"
    );

    public static final PacketType<PercentAnimationPacket> TYPE = PacketType.create(PACKET_ID, PercentAnimationPacket::new);


    public PercentAnimationPacket(FriendlyByteBuf buf) {
        this(buf.readVarInt());
    }

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeVarInt(Id);
    }

    @Override
    public PacketType<?> getType() {
        return TYPE;
    }
}
