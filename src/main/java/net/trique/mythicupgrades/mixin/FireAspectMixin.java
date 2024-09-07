package net.trique.mythicupgrades.mixin;


import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.FireAspectEnchantment;
import net.trique.mythicupgrades.item.MUToolMaterials;
import net.trique.mythicupgrades.item.MythicEffectsSwordItem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(FireAspectEnchantment.class)
public abstract class FireAspectMixin extends Enchantment {

    protected FireAspectMixin(Rarity rarity, EnchantmentCategory enchantmentCategory, EquipmentSlot[] equipmentSlots) {
        super(rarity, enchantmentCategory, equipmentSlots);
    }

    @Override
    public boolean canEnchant(ItemStack itemStack) {
        if (itemStack.getItem() instanceof MythicEffectsSwordItem sword && sword.getMythicMaterial().equals(
                MUToolMaterials.TOPAZ
        )) {
            return false;
        }
        return super.canEnchant(itemStack);
    }
}
