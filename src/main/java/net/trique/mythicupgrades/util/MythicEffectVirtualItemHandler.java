package net.trique.mythicupgrades.util;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;

import java.util.HashMap;

public class MythicEffectVirtualItemHandler {

    private final ItemEffectsList allEffects;

    public MythicEffectVirtualItemHandler(ItemEffectsList allEffects) {
        this.allEffects = allEffects;
    }

    public void handlePostHit(LivingEntity target, LivingEntity attacker) {
        Functions.addStatusEffects(target, allEffects.getForOthers(), attacker);
    }
    public HashMap<StatusEffect, EffectMeta> getMainHandEffects() {
        return allEffects.getForMainHand();
    }
    public HashMap<StatusEffect, EffectMeta> getEquipmentBuffs() {
        return allEffects.getForEquipmentBuffs();
    }
    public HashMap<StatusEffect, EffectMeta> getEquipmentDebuffs() {
        return allEffects.getForEquipmentDebuffs();
    }

    public HashMap<StatusEffect, EffectMeta> getOnHitEffects() {
        return allEffects.getForOthers();
    }
}