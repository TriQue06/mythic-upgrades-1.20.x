package net.trique.mythicupgrades.item;

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
import net.trique.mythicupgrades.util.ArmorEffectsList;
import net.trique.mythicupgrades.util.EffectMeta;

import java.util.*;

public class MythicEffectsArmorItem extends ArmorItem implements MythicItem {
    private final ArmorEffectsList effects;

    public MythicEffectsArmorItem(ArmorMaterial material, Type type, Settings settings, ArmorEffectsList effects) {
        super(material, type, settings);
        this.effects = effects;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()) {
            if (entity instanceof PlayerEntity player) {
                if (hasFullSuitOfArmorOn(player) && hasCorrectArmorOn(this.getMaterial(), player)) {
                    addStatusEffects(player);
                } else {
                    for (StatusEffect effect : effects.getEffectsSet()) {
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
        for (EquipmentSlot slot : slots) {
            result &= !player.getEquippedStack(slot).isEmpty();
        }
        return result;
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {
        boolean result = true;
        for (int i = 0; i < 4; ++i) {
            Item item = player.getInventory().getArmorStack(i).getItem();
            try {
                ArmorMaterial m = ((ArmorItem) item).getMaterial();
                result &= m.equals(material);
            } catch (Exception e) {
                return false;
            }
        }
        return result;
    }

//    private boolean doesArmorHaveMaterial(PlayerEntity player) {
//        for (int i = 0; i < 4; i++) {
//            try {
//                ((ArmorItem) player.getInventory().getArmorStack(i).getItem()).getMaterial();
//            } catch (Exception e) {
//                return false;
//            }
//        }
//
//        return true;
//    }


    private void addStatusEffects(PlayerEntity player) {
        for (StatusEffect effect : effects.getEffectsSet()) {
            EffectMeta meta = effects.getAmplifierByEffect(effect);
            if (effect != null) {
                player.addStatusEffect(new StatusEffectInstance(effect, meta.getDuration(), meta.getAmplifier(),
                        meta.isAmbient(), meta.shouldShowParticles(), meta.shouldShowIcon()));
            }
        }
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getForSelf() {
        return effects.getAllEffects();
    }
}