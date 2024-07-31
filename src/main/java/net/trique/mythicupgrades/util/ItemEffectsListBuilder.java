package net.trique.mythicupgrades.util;

import java.util.HashMap;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;

public class ItemEffectsListBuilder {
    private final HashMap<Target, HashMap<Holder<MobEffect>, EffectMeta>> allEffects;

    public ItemEffectsListBuilder() {
        allEffects = new HashMap<>();
        allEffects.put(Target.IN_MAIN_HAND, new HashMap<>());
        allEffects.put(Target.ON_HIT_FOR_ENEMY, new HashMap<>());
        allEffects.put(Target.ON_HIT_FOR_SELF, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_FOR_SELF, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_FOR_ENEMY, new HashMap<>());
    }

    public ItemEffectsListBuilder addForMainHand(Holder<MobEffect> effect, int duration, int amplifier) {
        allEffects.get(Target.IN_MAIN_HAND).put(effect, EffectMeta.partiallyVisible(duration, amplifier));
        return this;
    }

    public ItemEffectsListBuilder addForHitToEnemy(Holder<MobEffect> effect, int duration, int amplifier) {
        allEffects.get(Target.ON_HIT_FOR_ENEMY).put(effect, EffectMeta.fullyVisible(duration, amplifier));
        return this;
    }

    public ItemEffectsListBuilder addForHitToSelf(Holder<MobEffect> effect, int duration, int amplifier) {
        allEffects.get(Target.ON_HIT_FOR_SELF).put(effect, EffectMeta.fullyVisible(duration, amplifier));
        return this;
    }

    public ItemEffectsListBuilder addForEquipmentBuffs(Holder<MobEffect> effect, int amplifier) {
        allEffects.get(Target.ON_EQUIPMENT_FOR_SELF).put(effect, EffectMeta.partiallyVisible(MobEffectInstance.INFINITE_DURATION, amplifier));
        return this;
    }
    public ItemEffectsListBuilder addForEquipmentDebuffs(Holder<MobEffect> effect, int duration, int amplifier) {
        allEffects.get(Target.ON_EQUIPMENT_FOR_ENEMY).put(effect, EffectMeta.fullyVisible(duration, amplifier));
        return this;
    }

    public ItemEffectsList build() {
        return new ItemEffectsList(allEffects);
    }
}