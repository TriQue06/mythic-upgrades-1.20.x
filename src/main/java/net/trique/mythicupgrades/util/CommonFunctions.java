package net.trique.mythicupgrades.util;

import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.effect.MUEffects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static net.trique.mythicupgrades.MythicUpgrades.RANDOM;

public class CommonFunctions {

    public static boolean checkStatusEffects(LivingEntity entity, HashMap<StatusEffect, EffectMeta> effects) {
        for (StatusEffect effect : effects.keySet()) {
            StatusEffectInstance instance = entity.getStatusEffect(effect);
            EffectMeta meta = effects.get(effect);
            if (instance != null) {
                if ((instance.isInfinite() && instance.getAmplifier() != meta.getAmplifier()) || instance.getAmplifier() < meta.getAmplifier()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
    public static void addStatusEffects(LivingEntity entity, HashMap<StatusEffect, EffectMeta> effects, LivingEntity attacker) {
        for (StatusEffect effect : effects.keySet()) {
            EffectMeta meta = effects.get(effect);
            if (effect != null && ((effect.equals(StatusEffects.INSTANT_HEALTH) && (entity.getGroup().equals(EntityGroup.UNDEAD))) ||
                    (!(effect.equals(StatusEffects.INSTANT_DAMAGE) && (entity.getGroup().equals(EntityGroup.UNDEAD)))) || !effect.isInstant())) {
                if (entity.hasStatusEffect(effect)) {
                    entity.removeStatusEffect(effect);
                }
                entity.addStatusEffect(new StatusEffectInstance(effect, meta.getDuration(), meta.getAmplifier(),
                        meta.isAmbient(), meta.shouldShowParticles(), meta.shouldShowIcon()), attacker);
            }
        }
    }

    public static void addStatusEffects(LivingEntity entity, HashMap<StatusEffect, EffectMeta> effects) {
        addStatusEffects(entity, effects, null);
    }

    public static boolean hasCorrectArmorOn(LivingEntity entity, ArmorMaterial material) {
        ArrayList<EquipmentSlot> slots = new ArrayList<>(Arrays.asList(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET));
        for (EquipmentSlot slot : slots) {
            ItemStack stack = entity.getEquippedStack(slot);
            if (stack.isEmpty()) {
                return false;
            }
            if (!(stack.getItem() instanceof ArmorItem)) {
                return false;
            }
            if (!((ArmorItem) stack.getItem()).getMaterial().equals(material)) {
                return false;
            }
        }
        return true;
    }
    public static void removeMythicInfiniteEffects(LivingEntity entity, HashMap<StatusEffect, EffectMeta> effects) {
        for (StatusEffect effect : effects.keySet()) {
            EffectMeta meta = effects.get(effect);
            if (effect != null && entity.hasStatusEffect(effect) && entity.getStatusEffect(effect).isInfinite() &&
            entity.getStatusEffect(effect).getAmplifier() == meta.getAmplifier()) {
                entity.removeStatusEffect(effect);
            }
        }
    }

    public static String getId(String name) {
        return MythicUpgrades.MOD_ID + ":" + name;
    }

    public static String arabicToRom(int num){
        num += 1;
        int [] a = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String [] r = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int i = 12;
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            while (a[i] > num){
                i--;
            }
            result.append(r[i]);
            num -= a[i];

        }
        return result.toString();
    }

    public static  <T extends LivingEntity>  boolean checkForItemMastery(T user) {
        return !user.hasStatusEffect(MUEffects.ITEM_MASTERY) || (user.hasStatusEffect(MUEffects.ITEM_MASTERY) && RANDOM.nextFloat() > 0.1f * (user.getStatusEffect(MUEffects.ITEM_MASTERY).getAmplifier() + 1));
    }
}