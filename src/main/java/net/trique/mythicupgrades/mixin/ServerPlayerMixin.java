package net.trique.mythicupgrades.mixin;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.trique.mythicupgrades.networking.packet.PercentAnimationPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ServerPlayer.class)
public abstract class ServerPlayerMixin extends PlayerEntityMixin {
    @Shadow public abstract ServerLevel serverLevel();

    protected ServerPlayerMixin(EntityType<? extends LivingEntity> entityType, Level world) {
        super(entityType, world);
    }

    @Override
    protected void percentHit(Entity entity) {
        FriendlyByteBuf toSend = new FriendlyByteBuf(Unpooled.buffer());
        toSend.writeInt(entity.getId());
        this.serverLevel().getChunkSource().broadcastAndSend(this, ServerPlayNetworking.createS2CPacket(
                PercentAnimationPacket.PACKET_ID, toSend)
        );
    }
}
