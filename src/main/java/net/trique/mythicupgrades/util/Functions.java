package net.trique.mythicupgrades.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import java.util.HashMap;

public class Functions {
    public static ClientPlayerEntity getLocalPlayer() {
        return MinecraftClient.getInstance().player;
    }


    public static void addStatusEffects(LivingEntity entity, HashMap<StatusEffect, EffectMeta> effects, LivingEntity attacker) {
        for (StatusEffect effect : effects.keySet()) {
            EffectMeta meta = effects.get(effect);
            if (effect != null && ((effect.equals(StatusEffects.INSTANT_HEALTH) && (entity.getGroup().equals(EntityGroup.UNDEAD))) ||
                    (!(effect.equals(StatusEffects.INSTANT_DAMAGE) && (entity.getGroup().equals(EntityGroup.UNDEAD)))) || !effect.isInstant())) {
                entity.addStatusEffect(new StatusEffectInstance(effect, meta.getDuration(), meta.getAmplifier(),
                        meta.isAmbient(), meta.shouldShowParticles(), meta.shouldShowIcon()), attacker);
            }
        }
    }

    public static void addStatusEffects(LivingEntity entity, HashMap<StatusEffect, EffectMeta> effects) {
        addStatusEffects(entity, effects, null);
    }
}
