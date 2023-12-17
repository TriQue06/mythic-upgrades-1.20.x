package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import java.util.function.Consumer;
import static net.trique.mythicupgrades.util.CommonFunctions.checkForItemMastery;

@Mixin(FlintAndSteelItem.class)
public abstract class FlintAndSteelMixin extends Item {
    public FlintAndSteelMixin(Settings settings) {
        super(settings);
    }

    @WrapWithCondition(method = "useOnBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;damage(ILnet/minecraft/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity> boolean applyChanceWithToolMasteryForUseOnBlock(ItemStack stack, int amount, T user, Consumer<T> callback) {
        return checkForItemMastery(user);
    }
}
