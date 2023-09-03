package net.trique.mythicupgrades.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BrokenAquamarineDiscItem extends Item {
    public BrokenAquamarineDiscItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("aquamarinedisc.description"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
