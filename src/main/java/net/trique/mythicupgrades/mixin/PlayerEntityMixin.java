package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.boss.dragon.EnderDragonPart;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.trique.mythicupgrades.MythicUpgradesDamageTypes;
import net.trique.mythicupgrades.effect.MUEffects;
import net.trique.mythicupgrades.item.*;
import net.trique.mythicupgrades.util.EffectMeta;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.trique.mythicupgrades.MythicUpgrades.RANDOM;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    @Unique
    private float cooldownOnHit;

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);

        cooldownOnHit = 0;
    }

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Shadow
    public abstract float getAttackCooldownProgress(float baseTime);


    @Inject(method = "attack", at = @At(value = "HEAD"))
    private void setCooldownOnHit(CallbackInfo ci) {
        cooldownOnHit = getAttackCooldownProgress(0.5f);
    }

    @Inject(method = "attack", at = @At(value = "HEAD"))
    private void applyEffectsOnSweeping(Entity target, CallbackInfo ci) {
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

    @Inject(method = "attack", at = @At(value = "TAIL"))
    private void applySapphirePercentageDamage(Entity entity, CallbackInfo ci) {
        if (entity.isAttackable()) {
            Item weapon = getEquippedStack(EquipmentSlot.MAINHAND).getItem();
            boolean sapphire_weapon = (weapon instanceof SapphireAxeItem || weapon instanceof SapphireSwordItem);
            if (sapphire_weapon) {
                int percent;
                if (weapon instanceof SapphireSwordItem swordItem) {
                    percent = swordItem.getPercent();
                } else {
                    SapphireAxeItem axeItem = (SapphireAxeItem) weapon;
                    percent = axeItem.getPercent();
                }
                DamageSource source = MythicUpgradesDamageTypes.create(entity.getWorld(),
                        MythicUpgradesDamageTypes.PERCENTAGE_DAMAGE_TYPE, this);
                float dmg = (percent / 100f) * cooldownOnHit;
                if (entity instanceof EnderDragonPart part) {
                    EnderDragonEntity dragon = part.owner;
                    dragon.damagePart(part, source, dmg * dragon.getMaxHealth());
                } else if (entity instanceof LivingEntity target) {
//                    System.out.println(dmg * target.getMaxHealth());
                    target.damage(source, dmg * target.getMaxHealth());
                }
            }
        }
    }

    @WrapWithCondition(method = "damageShield", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;damage(ILnet/minecraft/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity> boolean applyChanceWithToolMasteryForDamageShield(ItemStack stack, int amount, T user, Consumer<T> callback) {
        return !hasStatusEffect(MUEffects.ITEM_MASTERY) || (hasStatusEffect(MUEffects.ITEM_MASTERY) && RANDOM.nextFloat() > 0.1f * getStatusEffect(MUEffects.ITEM_MASTERY).getAmplifier());
    }
}