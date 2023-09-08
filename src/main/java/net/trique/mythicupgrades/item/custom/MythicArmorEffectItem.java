package net.trique.mythicupgrades.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.*;

public class MythicArmorEffectItem extends ArmorItem {
    private static final int effectDuration = StatusEffectInstance.INFINITE;
    private final HashMap<StatusEffect, Integer> effects;
    private final boolean ambient;
    private final boolean showParticles;
    private final boolean showIcon;

    public MythicArmorEffectItem(ArmorMaterial material, Type type, Settings settings, HashMap<StatusEffect,
            Integer> effects, boolean ambient, boolean showParticles, boolean showIcon) {
        super(material, type, settings);
        this.effects = effects;
        this.ambient = ambient;
        this.showParticles = showParticles;
        this.showIcon = showIcon;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (entity instanceof PlayerEntity player) {
                if (hasFullSuitOfArmorOn(player) && doesArmorHaveMaterial(player) && hasCorrectArmorOn(this.getMaterial(), player)) {
                    addStatusEffects(player);
                } else {
                    for (StatusEffect effect: effects.keySet()) {
                        if (player.hasStatusEffect(effect) && player.getActiveStatusEffects().get(effect).isInfinite()) {
                            player.removeStatusEffect(effect);
                        }
                    }
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        boolean result = true;
        ArrayList<EquipmentSlot> slots = new ArrayList<>(Arrays.asList(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET));
        for (EquipmentSlot slot: slots) {
            result &= !player.getEquippedStack(slot).isEmpty();
        }
        return result;
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {

        boolean result = true;
        ArrayList<EquipmentSlot> slots = new ArrayList<>(Arrays.asList(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET));
        for (EquipmentSlot slot: slots) {
            Item item = player.getEquippedStack(slot).getItem();
            if (!(item instanceof ArmorItem)) {
                return false;
            }
            try {
                result &= (((ArmorItem) item).getMaterial().equals(material));
            } catch (Exception e) {
                return false;
            }
        }
        return result;
    }

    private boolean doesArmorHaveMaterial(PlayerEntity player) {
        for (int i=0; i<4; i++) {
            try{
                ((ArmorItem)player.getInventory().getArmorStack(i).getItem()).getMaterial();
            }catch(Exception e){
                return false;
            }
        }

        return true;
    }


    private void addStatusEffects(PlayerEntity player) {
        for (Map.Entry<StatusEffect, Integer> entry: this.effects.entrySet()) {
            StatusEffect effect = entry.getKey();
            int amplifier = entry.getValue();
            player.addStatusEffect(new StatusEffectInstance(effect, effectDuration, amplifier, ambient, showParticles, showIcon));
        }
    }
}