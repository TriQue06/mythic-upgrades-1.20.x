package net.trique.mythicupgrades.item;

import net.minecraft.entity.effect.StatusEffect;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.ItemEffectsList;

import java.util.HashMap;
import java.util.List;

public interface BaseMythicArmorItem extends BaseMythicItem {
    HashMap<StatusEffect, EffectMeta> getEquipmentBuffs();
    HashMap<StatusEffect, EffectMeta> getEquipmentDebuffs();
    void setNewEffects(ItemEffectsList effectsList, List<Integer> amplifierList);
}