package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Consumer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;

import static net.trique.mythicupgrades.util.CommonFunctions.checkForItemMastery;

@Mixin(ShearsItem.class)
public abstract class ShearsItemMixin extends Item {
    public ShearsItemMixin(Properties settings) {
        super(settings);
    }

    @WrapWithCondition(method = "mineBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity> boolean applyChanceWithToolMasteryForPostMine(ItemStack instance, int amount, T miner, Consumer<T> breakCallback) {
        return checkForItemMastery(miner);
    }

    @WrapWithCondition(method = "useOn", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity> boolean applyChanceWithToolMasteryForUseOnBlock(ItemStack instance, int amount, T user, Consumer<T> breakCallback) {
        return checkForItemMastery(user);
    }
}