package net.trique.mythicupgrades.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;

public class MUTags {
    public static class Items {
        public static final TagKey<Item> FISH_THAT_READY_FOR_MYTHIC_EVOLUTION =
                createTag("fish_that_ready_for_mythic_evolution");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MythicUpgrades.MOD_ID, name));
        }
    }
}
