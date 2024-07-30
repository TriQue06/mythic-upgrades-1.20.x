package net.trique.mythicupgrades.mixin;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
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
        this.serverLevel().getChunkSource().broadcastAndSend(this, ServerPlayNetworking.createS2CPacket(
                new PercentAnimationPacket(entity.getId())
        ));
    }
}
