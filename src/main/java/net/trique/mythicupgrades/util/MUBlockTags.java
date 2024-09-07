package net.trique.mythicupgrades.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.trique.mythicupgrades.MythicUpgrades;

public class MUBlockTags {
    public static TagKey<Block> SPELUNKER_OUTLINED = create("spelunker_outlined");


    private static TagKey<Block> create(String string) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(MythicUpgrades.MOD_ID, string));
    }
}
