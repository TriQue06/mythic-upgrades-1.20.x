package net.trique.mythicupgrades.util;

import net.minecraft.entity.effect.StatusEffect;

import java.util.HashMap;

public class ItemEffectsListBuilder {
    private final HashMap<Target, HashMap<StatusEffect, EffectMeta>> allEffects;

    public ItemEffectsListBuilder() {
        allEffects = new HashMap<>();
        allEffects.put(Target.SELF, new HashMap<>());
        allEffects.put(Target.OTHERS, new HashMap<>());
    }

    public ItemEffectsListBuilder addForSelf(StatusEffect effect, int duration, int amplifier) {
        allEffects.get(Target.SELF).put(effect, EffectMeta.partiallyVisible(duration, amplifier));
        return this;
    }
    public ItemEffectsListBuilder addForOthers(StatusEffect effect, int duration, int amplifier) {
        allEffects.get(Target.OTHERS).put(effect, EffectMeta.fullyVisible(duration, amplifier));
        return this;
    }

    public ItemEffectsList build() {
        return new ItemEffectsList(allEffects);
    }
}
