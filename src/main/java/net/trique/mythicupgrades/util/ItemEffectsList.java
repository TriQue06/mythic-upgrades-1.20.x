package net.trique.mythicupgrades.util;

import java.util.HashMap;
import net.minecraft.world.effect.MobEffect;

public class ItemEffectsList {
    private final HashMap<Target, HashMap<MobEffect, EffectMeta>> allEffects;

    public ItemEffectsList(HashMap<Target, HashMap<MobEffect, EffectMeta>> allEffects) {
        this.allEffects = allEffects;
    }

    public ItemEffectsList() {
        allEffects = new HashMap<>();
        allEffects.put(Target.IN_MAIN_HAND, new HashMap<>());
        allEffects.put(Target.ON_HIT, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_BUFF, new HashMap<>());
        allEffects.put(Target.ON_EQUIPMENT_DEBUFF, new HashMap<>());
    }

    public HashMap<MobEffect, EffectMeta> getForMainHand() {
        return allEffects.get(Target.IN_MAIN_HAND);
    }
    public HashMap<MobEffect, EffectMeta> getForEquipmentBuffs() {return allEffects.get(Target.ON_EQUIPMENT_BUFF);}
    public HashMap<MobEffect, EffectMeta> getForEquipmentDebuffs() {return allEffects.get(Target.ON_EQUIPMENT_DEBUFF);}
    public HashMap<MobEffect, EffectMeta> getForOthers() {
        return allEffects.get(Target.ON_HIT);
    }
}