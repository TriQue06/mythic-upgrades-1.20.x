package net.trique.mythicupgrades.item.charms;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import de.dafuqs.additionalentityattributes.AdditionalEntityAttributes;

import java.util.UUID;

public class AmetrineCharm extends TrinketItem {
    public AmetrineCharm(Settings settings) {
        super(settings);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uuid, "mythicupgrades:movement_speed", 0.25, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(AdditionalEntityAttributes.DROPPED_EXPERIENCE, new EntityAttributeModifier(uuid, "mythicupgrades:increased_xp", 0.5, EntityAttributeModifier.Operation.ADDITION));
        return modifiers;
    }
}