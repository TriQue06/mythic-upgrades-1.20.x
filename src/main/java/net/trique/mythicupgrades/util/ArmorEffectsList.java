package net.trique.mythicupgrades.util;

import net.minecraft.entity.effect.StatusEffect;

import java.util.HashMap;
import java.util.Set;

public record ArmorEffectsList(HashMap<StatusEffect, EffectMeta> allEffects) {

    public Set<StatusEffect> getEffectsSet() {
        return allEffects.keySet();
    }

    public EffectMeta getAmplifierByEffect(StatusEffect effect) {
        return allEffects.get(effect);
    }
}
