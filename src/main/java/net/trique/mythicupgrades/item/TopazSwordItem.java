package net.trique.mythicupgrades.item;

import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Item;
import net.trique.mythicupgrades.util.ItemEffectsList;


public class TopazSwordItem extends MythicEffectsSwordItem {
    public TopazSwordItem(Item.Properties settings, int attackDamage, float attackSpeed,  ItemEffectsList effects, String tooltipKey, ChatFormatting color) {
        super(MUToolMaterials.TOPAZ, attackDamage, attackSpeed, settings, effects, tooltipKey, color);
    }
}
