package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BrushItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Consumer;

import static net.trique.mythicupgrades.util.CommonFunctions.checkForItemMastery;

@Mixin(BrushItem.class)
public abstract class BrushItemMixin extends Item {
    public BrushItemMixin(Properties settings) {
        super(settings);
    }

    @WrapWithCondition(method = "onUseTick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity> boolean applyChanceWithToolMasteryForUseOnBlock(ItemStack stack, int amount, T user, Consumer<T> callback) {
        return checkForItemMastery(user);
    }
}