package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Consumer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static net.trique.mythicupgrades.util.CommonFunctions.checkForItemMastery;

@Mixin(FishingRodItem.class)
public abstract class FishingRodItemMixin extends Item {

    public FishingRodItemMixin(Properties settings) {
        super(settings);
    }

    @WrapWithCondition(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity>boolean applyChanceWithToolMasteryForPostHit(ItemStack stack, int amount, T user, Consumer<T> callback) {
        return checkForItemMastery(user);
    }
}