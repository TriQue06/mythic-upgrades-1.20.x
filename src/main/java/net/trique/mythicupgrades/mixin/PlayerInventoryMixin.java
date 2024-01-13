package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import java.util.function.Consumer;
import static net.trique.mythicupgrades.util.CommonFunctions.checkForItemMastery;

@Mixin(PlayerInventory.class)
public abstract class PlayerInventoryMixin {
    @WrapWithCondition(method = "damageArmor", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;damage(ILnet/minecraft/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity> boolean applyChanceWithToolMasteryForDamageArmor(ItemStack instance, int amount, T holder, Consumer<T> breakCallback) {
        return checkForItemMastery(holder);
    }
}
