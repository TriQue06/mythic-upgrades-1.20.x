package net.trique.mythicupgrades.item.base;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.trique.mythicupgrades.util.EffectMeta;

import java.util.HashMap;

public interface BaseMythicItem {
    HashMap<Holder<MobEffect>, EffectMeta> getMainHandEffects();
    HashMap<Holder<MobEffect>, EffectMeta> getOnHitEffectsForEnemy();
    HashMap<Holder<MobEffect>, EffectMeta> getOnHitEffectsForSelf();
}