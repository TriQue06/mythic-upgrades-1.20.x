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
        allEffects.put(Target.IN_MAIN_HAND, new HashMap<>());
        allEffects.put(Target.ON_HIT, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_BUFF, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_DEBUFF, new HashMap<>());
    }

    public HashMap<StatusEffect, EffectMeta> getForMainHand() {
        return allEffects.get(Target.IN_MAIN_HAND);
    }
    public HashMap<StatusEffect, EffectMeta> getForEquipmentBuffs() {return allEffects.get(Target.ON_EQUIPMENT_BUFF);}
    public HashMap<StatusEffect, EffectMeta> getForEquipmentDebuffs() {return allEffects.get(Target.ON_EQUIPMENT_DEBUFF);}
    public HashMap<StatusEffect, EffectMeta> getForOthers() {
        return allEffects.get(Target.ON_HIT);
    }
}
