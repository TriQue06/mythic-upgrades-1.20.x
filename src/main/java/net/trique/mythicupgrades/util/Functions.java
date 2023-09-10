package net.trique.mythicupgrades.util;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.trique.mythicupgrades.item.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static boolean isMythicItem(Item item) {
        return item instanceof MythicItem;
    }


    public static boolean checkCorrectArmorOn(ArmorMaterial material, LivingEntity entity) {
        boolean result = true;
        ArrayList<EquipmentSlot> slots = new ArrayList<>(Arrays.asList(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET));
        for (EquipmentSlot slot : slots) {
            if (entity.getEquippedStack(slot).isEmpty()) {
                return false;
            } else {
                Item item = entity.getEquippedStack(slot).getItem();
                try {
                    ArmorMaterial m = ((ArmorItem) item).getMaterial();
                    result &= m.equals(material);
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return result;
    }

    public static boolean hasMythicArmorOn(LivingEntity entity) {
        boolean result = false;
        ArrayList<EquipmentSlot> slots = new ArrayList<>(Arrays.asList(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET));
        for (EquipmentSlot slot: slots) {
            if (!entity.getEquippedStack(slot).isEmpty()) {
                result |= (entity.getEquippedStack(slot).getItem() instanceof MythicEffectsArmorItem);
            }
        }
        return result;
    }
}
