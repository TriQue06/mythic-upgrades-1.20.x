package net.trique.mythicupgrades.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.trique.mythicupgrades.effect.MythicEffects;
import net.trique.mythicupgrades.item.BaseMythicItem;
import net.trique.mythicupgrades.item.BaseMythicToolItem;
import net.trique.mythicupgrades.item.MythicToolMaterials;
import net.trique.mythicupgrades.util.CommonFunctions;
import net.trique.mythicupgrades.MythicUpgradeDamageTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

@Mixin(MobEntity.class)
public abstract class MobEntityMixin extends LivingEntity {

    @Unique
    private boolean hasDamageBeenDeflected;
    public MobEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
        hasDamageBeenDeflected = false;
    }

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Inject(method = "tryAttack", at = @At(value = "RETURN"))
    public void handleEffects(Entity target, CallbackInfoReturnable<Boolean> cir) {
        boolean wasAttacked = cir.getReturnValue();
        if (wasAttacked) {
            if (target instanceof LivingEntity entity && this.getEquippedStack(EquipmentSlot.MAINHAND).getItem() instanceof BaseMythicItem item) {
                CommonFunctions.addStatusEffects(entity, item.getOnHitEffects(), this);
            }
        }
    }

    @Inject(method = "tryAttack", at = @At(value = "RETURN"))
    public void applySapphirePiercingDamage(Entity target, CallbackInfoReturnable<Boolean> cir) {
        boolean wasAttacked = cir.getReturnValue();
        if (wasAttacked) {
            if (target instanceof LivingEntity entity) {
                if (this.getEquippedStack(EquipmentSlot.MAINHAND).getItem() instanceof BaseMythicToolItem item &&
                        item.getMythicMaterial().equals(MythicToolMaterials.SAPPHIRE)) {
                    DamageSource source = MythicUpgradeDamageTypes.create(entity.getWorld(), MythicUpgradeDamageTypes.PIERCING_DAMAGE_TYPE,
                            this);
                    entity.damage(source, 0.05f * entity.getMaxHealth());
                }
            }
        }
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        StatusEffectInstance deflection = this.getActiveStatusEffects().get(MythicEffects.DAMAGE_DEFLECTION);
        if (deflection != null) {
            Entity attacker;
            if (Objects.equals(source.getSource(), source.getAttacker()) && ((attacker = source.getAttacker()) != null)) {
                float refl_dmg_coef = deflection.getAmplifier() / 10f;
                if (!((source.isOf(MythicUpgradeDamageTypes.DEFLECTING_DAMAGE_TYPE) || source.isOf(DamageTypes.THORNS)) && hasDamageBeenDeflected)) {
                    hasDamageBeenDeflected = true;
                    attacker.damage(MythicUpgradeDamageTypes.create(attacker.getWorld(),
                            MythicUpgradeDamageTypes.DEFLECTING_DAMAGE_TYPE, this), (1.1f + refl_dmg_coef) * amount);
                } else {
                    hasDamageBeenDeflected = false;
                }
                return super.damage(source, (0.9f - refl_dmg_coef) * amount);
            }
        }
        return super.damage(source, amount);
    }
}