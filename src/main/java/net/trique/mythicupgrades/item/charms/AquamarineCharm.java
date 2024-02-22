package net.trique.mythicupgrades.item.charms;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.trique.mythicupgrades.attributes.MUAttributes;

import java.util.UUID;

public class AquamarineCharm extends TrinketItem {
    public AquamarineCharm(Settings settings) {
        super(settings);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(MUAttributes.WATER_SPEED, new EntityAttributeModifier(uuid, "mythicupgrades:water_speed", 1.0, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(MUAttributes.WATER_VISIBILITY, new EntityAttributeModifier(uuid, "mythicupgrades:water_visibility", 100, EntityAttributeModifier.Operation.ADDITION));
        return modifiers;
    }
}