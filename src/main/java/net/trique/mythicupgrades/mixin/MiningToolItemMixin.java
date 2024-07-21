package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.EquipmentSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static net.trique.mythicupgrades.util.CommonFunctions.applyItemMasteryChance;

@Mixin(DiggerItem.class)
public abstract class MiningToolItemMixin extends Item {

    public MiningToolItemMixin(Properties settings) {
        super(settings);
    }

    @WrapOperation(method = "postHurtEnemy", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V"))
    private void applyChanceWithToolMasteryForPostHit(ItemStack instance, int i, LivingEntity livingEntity, EquipmentSlot equipmentSlot, Operation<Void> original) {
        if (!applyItemMasteryChance(livingEntity)) {
            original.call(instance, i, livingEntity, equipmentSlot);
        }
    }
}