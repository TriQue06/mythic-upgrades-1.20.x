package net.trique.mythicupgrades.item;

import net.minecraft.world.effect.MobEffect;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.ItemEffectsList;

import java.util.HashMap;
import java.util.List;

public interface BaseMythicArmorItem extends BaseMythicItem {
    HashMap<MobEffect, EffectMeta> getEquipmentBuffs();
    HashMap<MobEffect, EffectMeta> getEquipmentDebuffs();
    void setNewEffects(ItemEffectsList effectsList, List<Integer> amplifierList);
}