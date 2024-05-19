package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Consumer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;

import static net.trique.mythicupgrades.util.CommonFunctions.checkForItemMastery;

@Mixin(CrossbowItem.class)
public abstract class CrossBowItemMixin extends ProjectileWeaponItem {

    public CrossBowItemMixin(Properties settings) {
        super(settings);
    }

    @WrapWithCondition(method = "shootProjectile", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private static <T extends LivingEntity> boolean applyChanceWithToolMasteryForShoot(ItemStack stack, int amount, T user, Consumer<T> callback) {
        return checkForItemMastery(user);
    }
}