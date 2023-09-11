package net.trique.mythicupgrades.util;

import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

import java.util.HashMap;

public class MythicEffectVirtualItemHandler {

    private final ItemEffectsList allEffects;


    public MythicEffectVirtualItemHandler(ItemEffectsList allEffects) {
        this.allEffects = allEffects;
    }


    public void handlePostHit(LivingEntity target, LivingEntity attacker) {
        HashMap<StatusEffect, EffectMeta> effects = allEffects.getForOthers();
        for (StatusEffect effect : effects.keySet()) {
            EffectMeta meta = effects.get(effect);
            int duration = meta.getDuration();
            int amplifier = meta.getAmplifier();
            boolean ambient = meta.isAmbient();
            boolean showIcon = meta.shouldShowIcon();
            boolean showParticles = meta.shouldShowParticles();
            if (effect != null && ((effect.equals(StatusEffects.INSTANT_HEALTH) && (target.getGroup().equals(EntityGroup.UNDEAD))) ||
                    (!(effect.equals(StatusEffects.INSTANT_DAMAGE) && (target.getGroup().equals(EntityGroup.UNDEAD))))) || !effect.isInstant()) {
                target.addStatusEffect(new StatusEffectInstance(effect, duration, amplifier, ambient, showParticles, showIcon), attacker);
            }

        }
    }
    public HashMap<StatusEffect, EffectMeta> getMainHandEffects() {
        return allEffects.getForMainHand();
    }
    public HashMap<StatusEffect, EffectMeta> getEquipmentEffects() {
        return allEffects.getForEquipment();
    }
}
