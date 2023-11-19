package net.trique.mythicupgrades.item;

import net.minecraft.item.ToolMaterial;
import net.trique.mythicupgrades.util.ItemEffectsList;

public interface BaseMythicToolItem extends BaseMythicItem {
    ToolMaterial getMythicMaterial();

    void setNewEffects(ItemEffectsList list);
}