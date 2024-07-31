package net.trique.mythicupgrades.util;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.effect.MUEffects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static net.trique.mythicupgrades.MythicUpgrades.RANDOM;

public class CommonFunctions {

    public static boolean checkStatusEffects(LivingEntity entity, HashMap<MobEffect, EffectMeta> effects) {
        for (MobEffect effect : effects.keySet()) {
            MobEffectInstance instance = entity.getEffect(effect);
            EffectMeta meta = effects.get(effect);
            if (instance != null) {
                if ((instance.isInfiniteDuration() && instance.getAmplifier() != meta.getAmplifier()) || instance.getAmplifier() < meta.getAmplifier()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
    public static void addStatusEffects(LivingEntity entity, HashMap<MobEffect, EffectMeta> effects, LivingEntity attacker) {
        for (MobEffect effect : effects.keySet()) {
            EffectMeta meta = effects.get(effect);
            if (effect != null && ((effect.equals(MobEffects.HEAL) && (entity.getMobType().equals(MobType.UNDEAD))) ||
                    (!(effect.equals(MobEffects.HARM) && (entity.getMobType().equals(MobType.UNDEAD)))) || !effect.isInstantenous())) {
                if (entity.hasEffect(effect)) {
                    entity.removeEffect(effect);
                }
                entity.addEffect(new MobEffectInstance(effect, meta.getDuration(), meta.getAmplifier(),
                        meta.isAmbient(), meta.shouldShowParticles(), meta.shouldShowIcon()), attacker);
            }
        }
    }

    public static void addStatusEffects(LivingEntity entity, HashMap<MobEffect, EffectMeta> effects) {
        addStatusEffects(entity, effects, null);
    }

    public static boolean hasCorrectArmorOn(LivingEntity entity, ArmorMaterial material) {
        ArrayList<EquipmentSlot> slots = new ArrayList<>(Arrays.asList(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET));
        for (EquipmentSlot slot : slots) {
            ItemStack stack = entity.getItemBySlot(slot);
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
    public static void removeMythicInfiniteEffects(LivingEntity entity, HashMap<MobEffect, EffectMeta> effects) {
        for (MobEffect effect : effects.keySet()) {
            EffectMeta meta = effects.get(effect);
            if (effect != null && entity.hasEffect(effect) && entity.getEffect(effect).isInfiniteDuration() &&
            entity.getEffect(effect).getAmplifier() == meta.getAmplifier()) {
                entity.removeEffect(effect);
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

    public static  <T extends LivingEntity> boolean applyItemMasteryChance(T user) {
        if (user != null && user.hasEffect(MUEffects.ITEM_MASTERY)) {
            return RANDOM.nextFloat() <= 0.1f * (user.getEffect(MUEffects.ITEM_MASTERY).getAmplifier() + 1);
        }
        return false;
    }
}