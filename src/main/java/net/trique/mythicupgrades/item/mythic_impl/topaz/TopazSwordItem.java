package net.trique.mythicupgrades.item.mythic_impl.topaz;

import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.trique.mythicupgrades.item.materials.MUToolMaterials;
import net.trique.mythicupgrades.item.mythic_impl.common.MythicEffectsSwordItem;
import net.trique.mythicupgrades.util.ItemEffectsList;


public class TopazSwordItem extends MythicEffectsSwordItem {
    public TopazSwordItem(Properties settings, ItemEffectsList effects, String tooltipKey, ChatFormatting color) {
        super(MUToolMaterials.TOPAZ, settings, effects, tooltipKey, color);
    }

    @Override
    public boolean canBeEnchantedWith(ItemStack stack, Holder<Enchantment> enchantment, EnchantingContext context) {
        if (enchantment.is(Enchantments.FIRE_ASPECT)) {
            return false;
        }
        return super.canBeEnchantedWith(stack, enchantment, context);
    }
}
