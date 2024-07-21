package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.level.ItemLike;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.FoodOnAStickItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static net.trique.mythicupgrades.util.CommonFunctions.applyItemMasteryChance;

@Mixin(FoodOnAStickItem.class)
public abstract class OnAStickItemMixin extends Item {
    public OnAStickItemMixin(Properties settings) {
        super(settings);
    }

    @WrapOperation(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurtAndConvertOnBreak(ILnet/minecraft/world/level/ItemLike;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;"))
    private ItemStack applyChanceWithToolMasteryForPostHit(ItemStack instance, int i, ItemLike itemLike, LivingEntity livingEntity, EquipmentSlot equipmentSlot, Operation<ItemStack> original) {
        if (applyItemMasteryChance(livingEntity)) {
            return instance;
        }
        return original.call(instance, i, itemLike, livingEntity, equipmentSlot);
    }
}