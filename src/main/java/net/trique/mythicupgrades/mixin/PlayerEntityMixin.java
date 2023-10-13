package net.trique.mythicupgrades.mixin;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.boss.dragon.EnderDragonPart;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.trique.mythicupgrades.MythicUpgradeDamageTypes;
import net.trique.mythicupgrades.effect.MythicEffects;
import net.trique.mythicupgrades.item.BaseMythicToolItem;
import net.trique.mythicupgrades.item.MythicEffectsSwordItem;
import net.trique.mythicupgrades.item.MythicToolMaterials;
import net.trique.mythicupgrades.util.EffectMeta;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.Objects;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    @Unique
    private boolean hasDamageBeenDeflected;
    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
        hasDamageBeenDeflected = false;
    }

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Shadow
    public abstract float getAttackCooldownProgress(float baseTime);

    @Shadow public abstract void remove(RemovalReason reason);

    @Shadow public abstract boolean isCreative();


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

    @Inject(method = "attack", at = @At(value = "TAIL"))
    public void applySapphirePercentageDamage(Entity entity, CallbackInfo ci) {
        if (entity.isAttackable()) {
            if (this.getEquippedStack(EquipmentSlot.MAINHAND).getItem() instanceof BaseMythicToolItem item &&
                    item.getMythicMaterial().equals(MythicToolMaterials.SAPPHIRE)) {
                DamageSource source = MythicUpgradeDamageTypes.create(entity.getWorld(),
                        MythicUpgradeDamageTypes.PERCENTAGE_DAMAGE_TYPE, this);
                if (entity instanceof EnderDragonPart part) {
                    EnderDragonEntity dragon = part.owner;
                    dragon.damagePart(part, source, 0.05f * dragon.getMaxHealth());
                } else if (entity instanceof LivingEntity target) {
                    target.damage(source, 0.05f * target.getMaxHealth());
                }
            }
        }
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        if (this.isCreative()) {
            return false;
        }
        StatusEffectInstance deflection = this.getActiveStatusEffects().get(MythicEffects.DAMAGE_DEFLECTION);
        if (deflection != null) {
            Entity attacker;
            if (Objects.equals(source.getSource(), source.getAttacker()) && ((attacker = source.getAttacker()) != null)) {
                float refl_dmg_coef = deflection.getAmplifier() / 10f;
                if (!((source.isOf(MythicUpgradeDamageTypes.DEFLECTING_DAMAGE_TYPE) || source.isOf(DamageTypes.THORNS)) && hasDamageBeenDeflected)) {
                    hasDamageBeenDeflected = true;
                    attacker.damage(MythicUpgradeDamageTypes.create(attacker.getWorld(),
                            MythicUpgradeDamageTypes.DEFLECTING_DAMAGE_TYPE, this), (refl_dmg_coef + 0.1f) * amount);
                } else {
                    hasDamageBeenDeflected = false;
                }
                return super.damage(source, (0.9f - refl_dmg_coef) * amount);
            }
        }
        return super.damage(source, amount);
    }
}