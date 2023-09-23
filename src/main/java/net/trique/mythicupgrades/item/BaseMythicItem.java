package net.trique.mythicupgrades.item;

import net.minecraft.entity.effect.StatusEffect;
import net.trique.mythicupgrades.util.EffectMeta;

import java.util.HashMap;

public interface BaseMythicItem {
    HashMap<StatusEffect, EffectMeta> getMainHandEffects();
    HashMap<StatusEffect, EffectMeta> getEquipmentEffects();

    HashMap<StatusEffect, EffectMeta> getOnHitEffects();

}
