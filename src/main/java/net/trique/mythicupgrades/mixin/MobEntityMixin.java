package net.trique.mythicupgrades.mixin;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.trique.mythicupgrades.MythicUpgradesDamageTypes;
import net.trique.mythicupgrades.effect.MUEffects;
import net.trique.mythicupgrades.item.*;
import net.trique.mythicupgrades.networking.packet.PercentAnimationPacket;
import net.trique.mythicupgrades.util.CommonFunctions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;

@Mixin(Mob.class)
public abstract class MobEntityMixin extends LivingEntity {
    protected MobEntityMixin(EntityType<? extends LivingEntity> entityType, Level world) {
        super(entityType, world);
    }


    @Inject(method = "doHurtTarget", at = @At(value = "RETURN"))
    private void handleEffects(Entity target, CallbackInfoReturnable<Boolean> cir) {
        boolean wasAttacked = cir.getReturnValue();
        if (wasAttacked) {
            if (target instanceof LivingEntity entity && this.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof BaseMythicItem item) {
                CommonFunctions.addStatusEffects(entity, item.getOnHitEffectsForEnemy(), this);
            }
        }
    }

    @Inject(method = "doHurtTarget", at = @At(value = "RETURN"))
    private void applySapphirePercentageDamage(Entity target, CallbackInfoReturnable<Boolean> cir) {
        boolean wasAttacked = cir.getReturnValue();
        if (wasAttacked) {
            if (target instanceof LivingEntity entity) {
                Item weapon = this.getItemBySlot(EquipmentSlot.MAINHAND).getItem();
                boolean sapphire_weapon = weapon instanceof VirtualSapphireTool;
                if (sapphire_weapon) {
                    int percent = ((VirtualSapphireTool) weapon).getPercent();
                    DamageSource source = MythicUpgradesDamageTypes.percentage_damage(this);
                    float dmg = (percent / 100f);
                    if (entity.invulnerableTime <= 10) {
                        entity.hurt(source, dmg * entity.getMaxHealth());
                        if (!entity.level().isClientSide()) {
                            ((ServerLevel) this.level()).getChunkSource().broadcastAndSend(this,
                                    ServerPlayNetworking.createS2CPacket(
                                            new PercentAnimationPacket(entity.getId())));
                        }
                        entity.invulnerableTime = 0;
                    }
                }
            }
        }
    }

    @Inject(method = "doHurtTarget", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private void applyBouncerEffect(Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (this.hasEffect(MUEffects.BOUNCER)) {
            int ampl = this.getEffect(MUEffects.BOUNCER).getAmplifier();
            this.addEffect(new MobEffectInstance(MobEffects.JUMP, (int) (CONFIG.jadeConfig.tools_bouncer_duration() * 20), ampl));
        }
    }
}