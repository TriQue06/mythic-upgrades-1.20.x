package net.trique.mythicupgrades.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Functions {
    public static ClientPlayerEntity getLocalPlayer() {
        return MinecraftClient.getInstance().player;
    }


    public static void addStatusEffects(LivingEntity entity, HashMap<StatusEffect, EffectMeta> effects, LivingEntity attacker) {
        for (StatusEffect effect : effects.keySet()) {
            EffectMeta meta = effects.get(effect);
            if (effect != null && ((effect.equals(StatusEffects.INSTANT_HEALTH) && (entity.getGroup().equals(EntityGroup.UNDEAD))) ||
                    (!(effect.equals(StatusEffects.INSTANT_DAMAGE) && (entity.getGroup().equals(EntityGroup.UNDEAD)))) || !effect.isInstant())) {
                entity.addStatusEffect(new StatusEffectInstance(effect, meta.getDuration(), meta.getAmplifier(),
                        meta.isAmbient(), meta.shouldShowParticles(), meta.shouldShowIcon()), attacker);
            }
        }
    }

    public static void addStatusEffects(LivingEntity entity, HashMap<StatusEffect, EffectMeta> effects) {
        addStatusEffects(entity, effects, null);
    }


    public static void handleTooltipForArmor(ItemStack stack, List<Text> tooltips, String tooltipSB, Formatting color, ArmorMaterial material) {
        ClientPlayerEntity player = getLocalPlayer();
        MutableText tooltip = Text.translatable(tooltipSB).formatted(color);
        MutableText defaultArmorTooltip = Text.translatable("defaultArmorTooltip.description").formatted(Formatting.GRAY).
                formatted(Formatting.ITALIC);
        ArrayList<ItemStack> toCheck = new ArrayList<>();
        player.getArmorItems().forEach(toCheck::add);
        if (hasCorrectArmorOn(player, material) && toCheck.contains(stack)) {
            tooltips.add(tooltip);
        } else {
            tooltips.add(defaultArmorTooltip);
        }
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
}
