package net.trique.mythicupgrades.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.trique.mythicupgrades.registry.RegisterMUParticles;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(LocalPlayer.class)
public abstract class LocalPlayerMixin extends PlayerEntityMixin {
    @Shadow @Final protected Minecraft minecraft;

    protected LocalPlayerMixin(EntityType<? extends LivingEntity> entityType, Level world) {
        super(entityType, world);
    }


    @Override
    protected void percentHit(Entity entity) {
        this.minecraft.particleEngine.createTrackingEmitter(entity, RegisterMUParticles.PERCENT_PARTICLE);
    }
}
