package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Consumer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;

import static net.trique.mythicupgrades.util.CommonFunctions.checkForItemMastery;

@Mixin(BowItem.class)
public abstract class BowItemMixin extends ProjectileWeaponItem {
    public BowItemMixin(Properties settings) {
        super(settings);
    }

    @WrapWithCondition(method = "releaseUsing", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity> boolean applyChanceWithToolMasteryForOnStoppedUsing(ItemStack stack, int amount, T user, Consumer<T> callback) {
        return checkForItemMastery(user);
    }
}