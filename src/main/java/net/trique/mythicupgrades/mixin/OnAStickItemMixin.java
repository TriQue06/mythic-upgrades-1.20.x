package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.OnAStickItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import java.util.function.Consumer;
import static net.trique.mythicupgrades.util.CommonFunctions.checkForItemMastery;

@Mixin(OnAStickItem.class)
public abstract class OnAStickItemMixin extends Item {
    public OnAStickItemMixin(Settings settings) {
        super(settings);
    }

    @WrapWithCondition(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;damage(ILnet/minecraft/entity/LivingEntity;Ljava/util/function/Consumer;)V"))
    private <T extends LivingEntity> boolean applyChanceWithToolMasteryForPostHit(ItemStack instance, int amount, T user, Consumer<T> callback) {
        return checkForItemMastery(user);
    }
}
