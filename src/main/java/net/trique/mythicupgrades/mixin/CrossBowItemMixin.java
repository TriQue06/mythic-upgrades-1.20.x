package net.trique.mythicupgrades.mixin;


import com.llamalad7.mixinextras.injector.WrapWithCondition;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.RangedWeaponItem;
import org.spongepowered.asm.mixin.Mixin;
import static net.trique.mythicupgrades.util.CommonFunctions.checkForItemMastery;
import org.spongepowered.asm.mixin.injection.At;
import java.util.function.Consumer;

@Mixin(CrossbowItem.class)
public abstract class CrossBowItemMixin extends RangedWeaponItem {

    public CrossBowItemMixin(Settings settings) {
        super(settings);
    }

    @WrapWithCondition(method = "shoot", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;damage(ILnet/minecraft/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private static <T extends LivingEntity> boolean applyChanceWithToolMasteryForShoot(ItemStack stack, int amount, T user, Consumer<T> callback) {
        return checkForItemMastery(user);
    }
}
