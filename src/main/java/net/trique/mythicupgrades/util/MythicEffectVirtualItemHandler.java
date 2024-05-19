package net.trique.mythicupgrades.util;

import java.util.HashMap;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;

public class MythicEffectVirtualItemHandler {

    private ItemEffectsList allEffects;

    public MythicEffectVirtualItemHandler(ItemEffectsList allEffects) {
        this.allEffects = allEffects;
    }

    public void handlePostHit(LivingEntity target, LivingEntity attacker) {
        CommonFunctions.addStatusEffects(target, allEffects.getForOthers(), attacker);
    }
    public HashMap<MobEffect, EffectMeta> getMainHandEffects() {
        return allEffects.getForMainHand();
    }
    public HashMap<MobEffect, EffectMeta> getEquipmentBuffs() {
        return allEffects.getForEquipmentBuffs();
    }
    public HashMap<MobEffect, EffectMeta> getEquipmentDebuffs() {
        return allEffects.getForEquipmentDebuffs();
    }
    public HashMap<MobEffect, EffectMeta> getOnHitEffects() {
        return allEffects.getForOthers();
    }

    public void setNewEffects(ItemEffectsList list) {
        allEffects = list;
    }
}