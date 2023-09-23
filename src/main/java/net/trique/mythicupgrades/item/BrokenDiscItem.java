package net.trique.mythicupgrades.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BrokenDiscItem extends Item {

    private final String translationKey;
    public BrokenDiscItem(String translationKey, Settings settings) {
        super(settings);
        this.translationKey = translationKey;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(translationKey));
        super.appendTooltip(stack, world, tooltip, context);
    }
}