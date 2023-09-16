package net.trique.mythicupgrades.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.Functions;
import net.trique.mythicupgrades.util.ItemEffectsList;
import java.util.*;

public class MythicEffectsArmorItem extends ArmorItem implements BaseMythicItem {
    private final ItemEffectsList effects;

    public MythicEffectsArmorItem(ArmorMaterial material, Type type, Settings settings, ItemEffectsList effects) {
        super(material, type, settings);
        this.effects = effects;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()) {
            if (entity instanceof LivingEntity livingEntity) {
                if (hasCorrectArmorOn(livingEntity)) {
                    Functions.addStatusEffects(livingEntity, this.getEquipmentEffects());
                } else {
                    for (StatusEffect effect : getEquipmentEffects().keySet()) {
                        if (livingEntity.hasStatusEffect(effect) && livingEntity.getActiveStatusEffects().get(effect).isInfinite()) {
                            livingEntity.removeStatusEffect(effect);
                        }
                    }
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private boolean hasCorrectArmorOn(LivingEntity entity) {
        ArrayList<EquipmentSlot> slots = new ArrayList<>(Arrays.asList(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET));
        for (EquipmentSlot slot : slots) {
            ItemStack stack = entity.getEquippedStack(slot);
            if (stack.isEmpty()) {
                return false;
            }
            if (!(stack.getItem() instanceof ArmorItem)) {
                return false;
            }
            if (!((ArmorItem) stack.getItem()).getMaterial().equals(this.material)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getMainHandEffects() {
        return effects.getForMainHand();
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getEquipmentEffects() {
        return effects.getForEquipment();
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getOnHitEffects() {
        return effects.getForOthers();
    }
}