package net.trique.mythicupgrades.attributes;

import net.minecraft.entity.*;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.*;
import net.minecraft.util.*;
import net.trique.mythicupgrades.MythicUpgrades;

public class AdditionalEntityAttributesEntityTags {

    public static final TagKey<EntityType<?>> AFFECTED_BY_COLLECTION_RANGE = TagKey.of(RegistryKeys.ENTITY_TYPE, new Identifier(MythicUpgrades.MOD_ID,"affected_by_collection_range"));

}
