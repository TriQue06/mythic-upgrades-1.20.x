package net.trique.mythicupgrades.util;

import java.util.HashMap;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;

public class ItemEffectsList {
    private final HashMap<Target, HashMap<Holder<MobEffect>, EffectMeta>> allEffects;

    public ItemEffectsList(HashMap<Target, HashMap<Holder<MobEffect>, EffectMeta>> allEffects) {
        this.allEffects = allEffects;
    }

    public ItemEffectsList() {
        allEffects = new HashMap<>();
        allEffects.put(Target.IN_MAIN_HAND, new HashMap<>());
        allEffects.put(Target.ON_HIT_FOR_ENEMY, new HashMap<>());
        allEffects.put(Target.ON_HIT_FOR_SELF, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_FOR_SELF, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_FOR_ENEMY, new HashMap<>());
    }

    public HashMap<Holder<MobEffect>, EffectMeta> getForMainHand() {
        return allEffects.get(Target.IN_MAIN_HAND);
    }
    public HashMap<Holder<MobEffect>, EffectMeta> getForEquipmentForSelf() {return allEffects.get(Target.ON_EQUIPMENT_FOR_SELF);}
    public HashMap<Holder<MobEffect>, EffectMeta> getForEquipmentForEnemy() {return allEffects.get(Target.ON_EQUIPMENT_FOR_ENEMY);}
    public HashMap<Holder<MobEffect>, EffectMeta> getOnHitForEnemy() {
        return allEffects.get(Target.ON_HIT_FOR_ENEMY);
    }
    public HashMap<Holder<MobEffect>, EffectMeta> getOnHitForSelf() {
        return allEffects.get(Target.ON_HIT_FOR_SELF);
    }
}