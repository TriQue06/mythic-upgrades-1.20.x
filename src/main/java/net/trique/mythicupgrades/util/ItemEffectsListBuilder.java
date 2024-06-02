package net.trique.mythicupgrades.util;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

import java.util.HashMap;

public class ItemEffectsListBuilder {
    private final HashMap<Target, HashMap<StatusEffect, EffectMeta>> allEffects;

    public ItemEffectsListBuilder() {
        allEffects = new HashMap<>();
        allEffects.put(Target.IN_MAIN_HAND, new HashMap<>());
        allEffects.put(Target.ON_HIT, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_BUFF, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_DEBUFF, new HashMap<>());
    }

    public ItemEffectsListBuilder addForMainHand(StatusEffect effect, int duration, int amplifier) {
        allEffects.get(Target.IN_MAIN_HAND).put(effect, EffectMeta.partiallyVisible(duration, amplifier));
        return this;
    }
    public ItemEffectsListBuilder addForHit(StatusEffect effect, int duration, int amplifier) {
        allEffects.get(Target.ON_HIT).put(effect, EffectMeta.fullyVisible(duration, amplifier));
        return this;
    }

    public ItemEffectsListBuilder addForEquipmentBuffs(StatusEffect effect, int amplifier) {
        allEffects.get(Target.ON_EQUIPMENT_BUFF).put(effect, EffectMeta.partiallyVisible(StatusEffectInstance.INFINITE, amplifier));
        return this;
    }
    public ItemEffectsListBuilder addForEquipmentDebuffs(StatusEffect effect, int duration, int amplifier) {
        allEffects.get(Target.ON_EQUIPMENT_DEBUFF).put(effect, EffectMeta.fullyVisible(duration, amplifier));
        return this;
    }

    public ItemEffectsList build() {
        return new ItemEffectsList(allEffects);
    }
}