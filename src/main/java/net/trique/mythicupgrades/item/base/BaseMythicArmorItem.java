package net.trique.mythicupgrades.item.base;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.ItemEffectsList;

import java.util.HashMap;
import java.util.List;

public interface BaseMythicArmorItem extends BaseMythicItem {
    HashMap<Holder<MobEffect>, EffectMeta> getEquipmentEffectsForSelf();
    HashMap<Holder<MobEffect>, EffectMeta> getEquipmentEffectsForEnemies();
    void setNewEffects(ItemEffectsList effectsList, List<Integer> amplifierList);
}