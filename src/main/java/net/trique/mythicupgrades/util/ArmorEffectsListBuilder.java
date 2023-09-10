package net.trique.mythicupgrades.util;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import java.util.HashMap;

public class ArmorEffectsListBuilder {
    private final HashMap<StatusEffect, EffectMeta> allEffects;

    public ArmorEffectsListBuilder() {
        allEffects = new HashMap<>();
    }

    public ArmorEffectsListBuilder addEffect(StatusEffect effect, int amplifier) {
        allEffects.put(effect, EffectMeta.partiallyVisible(StatusEffectInstance.INFINITE, amplifier));
        return this;
    }

    public ArmorEffectsList build() {
        return new ArmorEffectsList(allEffects);
    }
}
