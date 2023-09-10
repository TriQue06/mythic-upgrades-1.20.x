package net.trique.mythicupgrades.util;

import net.minecraft.entity.effect.StatusEffect;

import java.util.HashMap;

public class ItemEffectsList {
    private final HashMap<Target, HashMap<StatusEffect, EffectMeta>> allEffects;

    public ItemEffectsList(HashMap<Target, HashMap<StatusEffect, EffectMeta>> allEffects) {
        this.allEffects = allEffects;
    }

    public ItemEffectsList() {
        allEffects = new HashMap<>();
        allEffects.put(Target.SELF, new HashMap<>());
        allEffects.put(Target.OTHERS, new HashMap<>());
    }

    public HashMap<StatusEffect, EffectMeta> getForSelf() {
        return allEffects.get(Target.SELF);
    }
    public HashMap<StatusEffect, EffectMeta> getForOthers() {
        return allEffects.get(Target.OTHERS);
    }
}
