package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.boss.EnderDragonPart;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.trique.mythicupgrades.MythicUpgradesDamageTypes;
import net.trique.mythicupgrades.effect.MUEffects;
import net.trique.mythicupgrades.item.*;
import net.trique.mythicupgrades.util.EffectMeta;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.function.Consumer;

import static net.trique.mythicupgrades.MythicUpgrades.RANDOM;
import static net.trique.mythicupgrades.util.CommonFunctions.*;

@Mixin(Player.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    @Unique
    private float cooldownOnHit;

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, Level world) {
        super(entityType, world);

        cooldownOnHit = 0;
    }

    @Shadow
    public abstract ItemStack getItemBySlot(EquipmentSlot slot);


    @Shadow
    public abstract float getAttackStrengthScale(float baseTime);


    @Inject(method = "attack", at = @At(value = "HEAD"))
    private void setCooldownOnHit(CallbackInfo ci) {
        cooldownOnHit = getAttackStrengthScale(0.5f);
    }

    @Inject(method = "attack", at = @At(value = "HEAD"))
    private void applyEffectsOnSweeping(Entity target, CallbackInfo ci) {
        if (this.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof MythicEffectsSwordItem sword) {
            float gn_dmg = (float) this.getAttributeValue(Attributes.ATTACK_DAMAGE);
            float gr_dmg;
            if (target instanceof LivingEntity) {
                gr_dmg = EnchantmentHelper.getDamageBonus(this.getMainHandItem(), ((LivingEntity) target).getMobType());
            } else {
                gr_dmg = EnchantmentHelper.getDamageBonus(this.getMainHandItem(), MobType.UNDEFINED);
            }
            float cldwn = this.getAttackStrengthScale(0.5F);
            gn_dmg *= 0.2F + cldwn * cldwn * 0.8F;
            gr_dmg *= cldwn;
            if (gn_dmg > 0.0F || gr_dmg > 0.0F) {
                boolean cldwn_f = cldwn > 0.9F;
                boolean spr = this.isSprinting() && cldwn_f;
                boolean stl = cldwn_f && this.fallDistance > 0.0F && !this.onGround() && !this.onClimbable() && !this.isInWater() && !this.hasEffect(MobEffects.BLINDNESS) && !this.isPassenger() && target instanceof LivingEntity;
                stl = stl && !this.isSprinting();
                boolean swp = false;
                double d = this.walkDist - this.walkDistO;
                if (cldwn_f && !stl && !spr && this.onGround() && d < (double) this.getSpeed()) {
                    ItemStack itemStack = this.getItemInHand(InteractionHand.MAIN_HAND);
                    if (itemStack.getItem() instanceof SwordItem) {
                        swp = true;
                    }
                }
                if (swp) {
                    List<LivingEntity> list = this.level().getEntitiesOfClass(LivingEntity.class, target.getBoundingBox().inflate(1.0, 0.25, 1.0));
                    for (LivingEntity entity : list) {
                        if (!entity.equals(this) && distanceToSqr(entity) < 9.0) {
                            for (MobEffect effect : sword.getOnHitEffects().keySet()) {
                                EffectMeta meta = sword.getOnHitEffects().get(effect);
                                int duration = meta.getDuration();
                                int amplifier = meta.getAmplifier();
                                boolean ambient = meta.isAmbient();
                                boolean showIcon = meta.shouldShowIcon();
                                boolean showParticles = meta.shouldShowParticles();
                                float sweeping_amplifier = EnchantmentHelper.getSweepingDamageRatio(this);
                                entity.addEffect(new MobEffectInstance(effect, duration, Math.max(0, (int) ((double) amplifier - 0.75 + sweeping_amplifier)), ambient, showParticles, showIcon));
                            }
                        }
                    }
                }
            }
        }
    }

    @Inject(method = "attack", at = @At(value = "TAIL"))
    private void applySapphirePercentageDamage(Entity entity, CallbackInfo ci) {
        if (entity.isAttackable()) {
            Item weapon = getItemBySlot(EquipmentSlot.MAINHAND).getItem();
            boolean sapphire_weapon = (weapon instanceof SapphireAxeItem || weapon instanceof SapphireSwordItem);
            if (sapphire_weapon) {
                int percent;
                if (weapon instanceof SapphireSwordItem swordItem) {
                    percent = swordItem.getPercent();
                } else {
                    SapphireAxeItem axeItem = (SapphireAxeItem) weapon;
                    percent = axeItem.getPercent();
                }
                DamageSource source = MythicUpgradesDamageTypes.create(entity.level(),
                        MythicUpgradesDamageTypes.PERCENTAGE_DAMAGE_TYPE, this);
                float dmg = (percent / 100f) * cooldownOnHit;
                if (entity instanceof EnderDragonPart part) {
                    EnderDragon dragon = part.parentMob;
                    dragon.hurt(part, source, dmg * dragon.getMaxHealth());
                } else if (entity instanceof LivingEntity target) {
//                    System.out.println(dmg * target.getMaxHealth());
                    target.hurt(source, dmg * target.getMaxHealth());
                }
            }
        }
    }

    @WrapWithCondition(method = "hurtCurrentlyUsedShield", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity> boolean applyChanceWithToolMasteryForDamageShield(ItemStack stack, int amount, T user, Consumer<T> callback) {
        return checkForItemMastery(this);
    }
}