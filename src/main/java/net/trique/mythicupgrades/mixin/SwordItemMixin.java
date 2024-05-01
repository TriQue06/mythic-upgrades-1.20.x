package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import org.spongepowered.asm.mixin.Mixin;
import static net.trique.mythicupgrades.util.CommonFunctions.checkForItemMastery;
import org.spongepowered.asm.mixin.injection.At;
import java.util.function.Consumer;

@Mixin(SwordItem.class)
public abstract class SwordItemMixin extends Item {
    public SwordItemMixin(Settings settings) {
        super(settings);
    }

    @WrapWithCondition(method = "postMine", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;damage(ILnet/minecraft/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity> boolean applyChanceWithToolMasteryForPostMine(ItemStack instance, int amount, T miner, Consumer<T> breakCallback) {
        return checkForItemMastery(miner);
    }

    @WrapWithCondition(method = "postHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;damage(ILnet/minecraft/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity> boolean applyChanceWithToolMasteryForPostHit(ItemStack instance, int amount, T attacker, Consumer<T> breakCallback) {
        return checkForItemMastery(attacker);
    }
}
