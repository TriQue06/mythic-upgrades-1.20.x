package net.trique.mythicupgrades.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemStack;
import net.trique.mythicupgrades.item.BaseMythicItem;
import net.trique.mythicupgrades.util.Functions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MobEntity.class)
public abstract class MobEntityMixin {
    @Shadow public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Inject(method = "tryAttack", at = @At(value = "RETURN"))
    public void handleEffects(Entity target, CallbackInfoReturnable<Boolean> cir) {
        boolean wasAttacked = cir.getReturnValue();
        if (wasAttacked) {
            if (target instanceof LivingEntity entity && this.getEquippedStack(EquipmentSlot.MAINHAND).getItem() instanceof BaseMythicItem item) {
                Functions.addStatusEffects(entity, item.getOnHitEffects(), (LivingEntity) (Object) this);
            }
        }
    }
}
