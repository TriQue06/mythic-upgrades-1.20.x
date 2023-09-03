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

public class ArmorEffectItem extends ArmorItem {
    private static final int effectDuration = 400;
    private static final int amplifier = 0;
    private final StatusEffect effect;

    public ArmorEffectItem(ArmorMaterial material, Type type, Settings settings, StatusEffect effect) {
        super(material, type, settings);
        this.effect = effect;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (entity instanceof PlayerEntity player) {
                if (hasFullSuitOfArmorOn(player)) {
                    evaluateArmorEffects(player);
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack helmet = player.getEquippedStack(EquipmentSlot.HEAD);
        ItemStack chestplate = player.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack leggings = player.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack boots = player.getEquippedStack(EquipmentSlot.FEET);

        return !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        if (hasCorrectArmorOn(this.getMaterial(), player)) {
            addStatusEffect(player);
        }
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {
        Item boots = player.getEquippedStack(EquipmentSlot.FEET).getItem();
        Item leggings = player.getEquippedStack(EquipmentSlot.LEGS).getItem();
        Item chestplate = player.getEquippedStack(EquipmentSlot.CHEST).getItem();
        Item helmet = player.getEquippedStack(EquipmentSlot.HEAD).getItem();

        // Handle any non-armor items in armor slots
        if (!(boots instanceof ArmorItem)
                || !(leggings instanceof ArmorItem)
                || !(chestplate instanceof ArmorItem)
                || !(helmet instanceof ArmorItem)) {
            return false;
        } else {
            return ((ArmorItem)helmet).getMaterial() == material
                    && ((ArmorItem)chestplate).getMaterial() == material
                    && ((ArmorItem)leggings).getMaterial() == material
                    && ((ArmorItem)boots).getMaterial() == material;
        }
    }

    private void addStatusEffect(PlayerEntity player) {
        if (!player.hasStatusEffect(this.effect)) {
            player.addStatusEffect(new StatusEffectInstance(this.effect, effectDuration, amplifier, false, false, false));
        }

        // effect repeat issue fix
        if (player.getActiveStatusEffects().containsKey(this.effect)) {
            if (player.getActiveStatusEffects().get(this.effect).getDuration() < 221) {
                player.addStatusEffect(new StatusEffectInstance(this.effect, effectDuration, amplifier, false, false, false));
            }
        }
    }

}