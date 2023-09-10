package net.trique.mythicupgrades.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ToolMaterial;
import net.trique.mythicupgrades.util.EffectMeta;

import java.util.HashMap;

public interface MythicItem {
    HashMap<StatusEffect, EffectMeta> getForSelf();

}
