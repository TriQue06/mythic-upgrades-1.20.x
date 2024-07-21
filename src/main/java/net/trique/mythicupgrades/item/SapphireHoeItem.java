package net.trique.mythicupgrades.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.trique.mythicupgrades.util.ItemEffectsList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;

public class SapphireHoeItem extends MythicEffectsHoeItem implements VirtualSapphireTool {
    private int percent;

    public SapphireHoeItem(int percent, Properties settings, ItemEffectsList effects, String tooltipKey, ChatFormatting color) {
        super(MUToolMaterials.SAPPHIRE, settings, effects, tooltipKey, color);
        this.percent = percent;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @NotNull TooltipContext tooltipContext, @NotNull List<Component> list, @NotNull TooltipFlag tooltipFlag) {
        list.add(Component.translatable(tooltipKey, List.of(CONFIG.sapphireConfig.tools_percentage_damage_percent()).toArray()).withStyle(color));
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}