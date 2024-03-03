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

public class KyaniteCharm extends TrinketItem {
    public KyaniteCharm(Settings settings) {
        super(settings);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(uuid, "mythicupgrades:armor_toughness", 8, EntityAttributeModifier.Operation.ADDITION));
        modifiers.put(AdditionalEntityAttributes.LAVA_SPEED, new EntityAttributeModifier(uuid, "mythicupgrades:lava_speed", 0.6, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(AdditionalEntityAttributes.LAVA_VISIBILITY, new EntityAttributeModifier(uuid, "mythicupgrades:lava_visibility", 60, EntityAttributeModifier.Operation.ADDITION));
        return modifiers;
    }
}