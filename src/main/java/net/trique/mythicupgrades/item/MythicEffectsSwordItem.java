package net.trique.mythicupgrades.item;


import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.MythicEffectVirtualItemHandler;

import java.util.HashMap;

public class MythicEffectsSwordItem extends SwordItem implements MythicItem {
    private final MythicEffectVirtualItemHandler virtualItemHandler;

    public MythicEffectsSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings, ItemEffectsList effects) {
        super(material, (int) attackDamage, attackSpeed, settings);
        this.virtualItemHandler = new MythicEffectVirtualItemHandler(effects);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        virtualItemHandler.handlePostHit(target, attacker);
        return super.postHit(stack, target, attacker);
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getForSelf() {
        return virtualItemHandler.getSelfEffects();
    }
}
