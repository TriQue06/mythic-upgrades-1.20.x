package net.trique.mythicupgrades.item;

import net.minecraft.world.item.Tier;
import net.trique.mythicupgrades.util.ItemEffectsList;

public interface BaseMythicToolItem extends BaseMythicItem {
    Tier getMythicMaterial();
    void setNewEffects(ItemEffectsList list);
}