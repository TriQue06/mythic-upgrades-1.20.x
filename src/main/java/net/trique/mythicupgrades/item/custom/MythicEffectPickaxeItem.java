package net.trique.mythicupgrades.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.*;
import net.minecraft.world.World;
import net.trique.mythicupgrades.util.EffectMeta;

import java.util.HashMap;

public class MythicEffectPickaxeItem extends PickaxeItem {

    private final MythicEffectVirtualToolItemHandler<MythicEffectPickaxeItem> virtualItem;

    public MythicEffectPickaxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings, HashMap<StatusEffect, EffectMeta> effects) {
        super(material, (int) attackDamage, attackSpeed, settings);
        this.virtualItem = new MythicEffectVirtualToolItemHandler<>(material, effects, this);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        virtualItem.handlePostHit(target, attacker);
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        virtualItem.handleInventoryTick(world, entity);
        super.inventoryTick(stack, world, entity, slot, selected);
    }

}
