package net.trique.mythicupgrades.util;

import java.util.HashMap;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;

public class ItemEffectsListBuilder {
    private final HashMap<Target, HashMap<MobEffect, EffectMeta>> allEffects;

    public ItemEffectsListBuilder() {
        allEffects = new HashMap<>();
        allEffects.put(Target.IN_MAIN_HAND, new HashMap<>());
        allEffects.put(Target.ON_HIT, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_BUFF, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_DEBUFF, new HashMap<>());
    }

    public ItemEffectsListBuilder addForMainHand(MobEffect effect, int duration, int amplifier) {
        allEffects.get(Target.IN_MAIN_HAND).put(effect, EffectMeta.partiallyVisible(duration, amplifier));
        return this;
    }
    public ItemEffectsListBuilder addForHit(MobEffect effect, int duration, int amplifier) {
        allEffects.get(Target.ON_HIT).put(effect, EffectMeta.fullyVisible(duration, amplifier));
        return this;
    }

    public ItemEffectsListBuilder addForEquipmentBuffs(MobEffect effect, int amplifier) {
        allEffects.get(Target.ON_EQUIPMENT_BUFF).put(effect, EffectMeta.partiallyVisible(MobEffectInstance.INFINITE_DURATION, amplifier));
        return this;
    }
    public ItemEffectsListBuilder addForEquipmentDebuffs(MobEffect effect, int duration, int amplifier) {
        allEffects.get(Target.ON_EQUIPMENT_DEBUFF).put(effect, EffectMeta.fullyVisible(duration, amplifier));
        return this;
    }

    public ItemEffectsList build() {
        return new ItemEffectsList(allEffects);
    }
}