package net.trique.mythicupgrades.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.trique.mythicupgrades.item.*;
import net.trique.mythicupgrades.util.CommonFunctions;
import net.trique.mythicupgrades.MythicUpgradeDamageTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MobEntity.class)
public abstract class MobEntityMixin extends LivingEntity {
    protected MobEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Inject(method = "tryAttack", at = @At(value = "RETURN"))
    private void handleEffects(Entity target, CallbackInfoReturnable<Boolean> cir) {
        boolean wasAttacked = cir.getReturnValue();
        if (wasAttacked) {
            if (target instanceof LivingEntity entity && this.getEquippedStack(EquipmentSlot.MAINHAND).getItem() instanceof BaseMythicItem item) {
                CommonFunctions.addStatusEffects(entity, item.getOnHitEffects(), this);
            }
        }
    }

    @Inject(method = "tryAttack", at = @At(value = "RETURN"))
    private void applySapphirePercentageDamage(Entity target, CallbackInfoReturnable<Boolean> cir) {
        boolean wasAttacked = cir.getReturnValue();
        if (wasAttacked) {
            if (target instanceof LivingEntity entity) {
                Item weapon = this.getEquippedStack(EquipmentSlot.MAINHAND).getItem();
                boolean sapphire_weapon = (weapon instanceof SapphireAxeItem || weapon instanceof SapphireSwordItem);
                if (sapphire_weapon) {
                    int percent;
                    if (weapon instanceof SapphireSwordItem swordItem) {
                        percent = swordItem.getPercent();
                    } else {
                        SapphireAxeItem axeItem = (SapphireAxeItem) weapon;
                        percent = axeItem.getPercent();
                    }
                    DamageSource source = MythicUpgradeDamageTypes.create(entity.getWorld(), MythicUpgradeDamageTypes.PERCENTAGE_DAMAGE_TYPE,
                            this);
                    entity.damage(source, (percent / 100f) * entity.getMaxHealth());
                }
            }
        }
    }
}