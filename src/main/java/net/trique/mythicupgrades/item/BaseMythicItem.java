package net.trique.mythicupgrades.item;

import net.minecraft.world.effect.MobEffect;
import net.trique.mythicupgrades.util.EffectMeta;

import java.util.HashMap;

public interface BaseMythicItem {
    HashMap<MobEffect, EffectMeta> getMainHandEffects();
    HashMap<MobEffect, EffectMeta> getOnHitEffects();
}