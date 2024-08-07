package net.trique.mythicupgrades.item.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PotionItem;

public class MythicPotionItem extends PotionItem {
    public MythicPotionItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
        return 20;
    }
}
