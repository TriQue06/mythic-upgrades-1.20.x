package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.trique.mythicupgrades.util.CommonFunctions.applyItemMasteryChance;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin {

    @WrapOperation(method = "hurtAndBreak", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurt(ILnet/minecraft/util/RandomSource;Lnet/minecraft/server/level/ServerPlayer;)Z"))
    private boolean applyItemMasteryChanceOnItems(ItemStack instance, int i, RandomSource randomSource, ServerPlayer serverPlayer, Operation<Boolean> original) {
        if (serverPlayer != null && !applyItemMasteryChance(serverPlayer)) {
            return original.call(instance, i, randomSource, serverPlayer);
        }
        return false;
    }
}
