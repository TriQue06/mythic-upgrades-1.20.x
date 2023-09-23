package net.trique.mythicupgrades.mixin;


import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.trique.mythicupgrades.item.MythicEffectsSwordItem;
import net.trique.mythicupgrades.util.EffectMeta;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot slot);


    @Shadow
    public abstract float getAttackCooldownProgress(float baseTime);

    @Inject(method = "attack", at = @At(value = "HEAD"))
    public void applyEffectsOnSweeping(Entity target, CallbackInfo ci) {
        if (this.getEquippedStack(EquipmentSlot.MAINHAND).getItem() instanceof MythicEffectsSwordItem sword) {
            float gn_dmg = (float) this.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
            float gr_dmg;
            if (target instanceof LivingEntity) {
                gr_dmg = EnchantmentHelper.getAttackDamage(this.getMainHandStack(), ((LivingEntity) target).getGroup());
            } else {
                gr_dmg = EnchantmentHelper.getAttackDamage(this.getMainHandStack(), EntityGroup.DEFAULT);
            }
            float cldwn = this.getAttackCooldownProgress(0.5F);
            gn_dmg *= 0.2F + cldwn * cldwn * 0.8F;
            gr_dmg *= cldwn;
            if (gn_dmg > 0.0F || gr_dmg > 0.0F) {
                boolean cldwn_f = cldwn > 0.9F;
                boolean spr = this.isSprinting() && cldwn_f;
                boolean stl = cldwn_f && this.fallDistance > 0.0F && !this.isOnGround() && !this.isClimbing() && !this.isTouchingWater() && !this.hasStatusEffect(StatusEffects.BLINDNESS) && !this.hasVehicle() && target instanceof LivingEntity;
                stl = stl && !this.isSprinting();
                boolean swp = false;
                double d = this.horizontalSpeed - this.prevHorizontalSpeed;
                if (cldwn_f && !stl && !spr && this.isOnGround() && d < (double) this.getMovementSpeed()) {
                    ItemStack itemStack = this.getStackInHand(Hand.MAIN_HAND);
                    if (itemStack.getItem() instanceof SwordItem) {
                        swp = true;
                    }
                }
                if (swp) {
                    List<LivingEntity> list = this.getWorld().getNonSpectatingEntities(LivingEntity.class, target.getBoundingBox().expand(1.0, 0.25, 1.0));
                    for (LivingEntity entity : list) {
                        if (!entity.equals(this) && squaredDistanceTo(entity) < 9.0) {
                            for (StatusEffect effect : sword.getOnHitEffects().keySet()) {
                                EffectMeta meta = sword.getOnHitEffects().get(effect);
                                int duration = meta.getDuration();
                                int amplifier = meta.getAmplifier();
                                boolean ambient = meta.isAmbient();
                                boolean showIcon = meta.shouldShowIcon();
                                boolean showParticles = meta.shouldShowParticles();
                                float sweeping_amplifier = EnchantmentHelper.getSweepingMultiplier(this);
                                entity.addStatusEffect(new StatusEffectInstance(effect, duration, Math.max(0, (int) ((double) amplifier - 0.75 + sweeping_amplifier)), ambient, showParticles, showIcon));
                            }
                        }
                    }
                }
            }
        }
    }
}
