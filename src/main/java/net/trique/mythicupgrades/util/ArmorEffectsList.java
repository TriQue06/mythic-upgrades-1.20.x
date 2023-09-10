package net.trique.mythicupgrades.util;

import net.minecraft.entity.effect.StatusEffect;

import java.util.HashMap;
import java.util.Set;

public class ArmorEffectsList {
    private final HashMap<StatusEffect, EffectMeta> allEffects;


    public ArmorEffectsList() {
        allEffects = new HashMap<>();
    }

    public ArmorEffectsList(HashMap<StatusEffect, EffectMeta> allEffects) {
        this.allEffects = allEffects;
    }

    public Set<StatusEffect> getEffectsSet() {
        return allEffects.keySet();
    }

    public EffectMeta getAmplifierByEffect(StatusEffect effect) {
        return allEffects.get(effect);
    }

    public HashMap<StatusEffect, EffectMeta> getAllEffects() {
        return allEffects;
    }
}
