package net.trique.mythicupgrades.mixin;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.trique.mythicupgrades.MythicUpgradesDamageTypes;
import net.trique.mythicupgrades.item.*;
import net.trique.mythicupgrades.util.CommonFunctions;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Mob.class)
public abstract class MobEntityMixin extends LivingEntity {
    protected MobEntityMixin(EntityType<? extends LivingEntity> entityType, Level world) {
        super(entityType, world);
    }

    @Shadow
    public abstract @NotNull ItemStack getItemBySlot(EquipmentSlot slot);

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
                        entity.invulnerableTime = 0;
                    }
                }
            }
        }
    }
}