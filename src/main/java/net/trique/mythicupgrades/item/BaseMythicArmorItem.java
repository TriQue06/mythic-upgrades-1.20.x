package net.trique.mythicupgrades.item;

import net.minecraft.entity.effect.StatusEffect;
import net.trique.mythicupgrades.util.EffectMeta;

import java.util.HashMap;

public interface BaseMythicArmorItem extends BaseMythicItem {
    HashMap<StatusEffect, EffectMeta> getEquipmentBuffs();

    HashMap<StatusEffect, EffectMeta> getEquipmentDebuffs();

}
