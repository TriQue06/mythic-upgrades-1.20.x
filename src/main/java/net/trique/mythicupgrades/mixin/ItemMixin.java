package net.trique.mythicupgrades.mixin;


import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import static net.trique.mythicupgrades.util.CommonFunctions.applyItemMasteryChance;

@Mixin(Item.class)
public class ItemMixin {
    @WrapOperation(method = "mineBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V"))
    private void applyChanceWithToolMasteryForMineBlock(ItemStack instance, int i, LivingEntity livingEntity, EquipmentSlot equipmentSlot, Operation<Void> original) {
        if (!applyItemMasteryChance(livingEntity)) {
            original.call(instance, i, livingEntity, equipmentSlot);
        }
    }
}
