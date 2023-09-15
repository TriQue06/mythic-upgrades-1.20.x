package net.trique.mythicupgrades.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.MythicEffectVirtualItemHandler;

import java.util.HashMap;

public class MythicEffectsShovelItem extends ShovelItem implements BaseMythicItem {
    private final MythicEffectVirtualItemHandler virtualItemHandler;

    public MythicEffectsShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings, ItemEffectsList effects) {
        super(material, (int) attackDamage, attackSpeed, settings);
        this.virtualItemHandler = new MythicEffectVirtualItemHandler(effects);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        virtualItemHandler.handlePostHit(target, attacker);
        return super.postHit(stack, target, attacker);
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getMainHandEffects() {
        return virtualItemHandler.getMainHandEffects();
    }
    @Override
    public HashMap<StatusEffect, EffectMeta> getEquipmentEffects() {
        return virtualItemHandler.getEquipmentEffects();
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getOnHitEffects() {
        return virtualItemHandler.getOnHitEffects();
    }
}
