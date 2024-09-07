package net.trique.mythicupgrades.item.mythic_impl.sapphire;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.trique.mythicupgrades.item.materials.MUToolMaterials;
import net.trique.mythicupgrades.item.base.VirtualSapphireTool;
import net.trique.mythicupgrades.item.mythic_impl.common.MythicEffectsAxeItem;
import net.trique.mythicupgrades.util.ItemEffectsList;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;

public class SapphireAxeItem extends MythicEffectsAxeItem implements VirtualSapphireTool {
    private float percent;

    public SapphireAxeItem(float percent, Properties settings, ItemEffectsList effects, String tooltipKey, ChatFormatting color) {
        super(MUToolMaterials.SAPPHIRE, settings, effects, tooltipKey, color);
        this.percent = percent;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @NotNull TooltipContext tooltipContext, @NotNull List<Component> list, @NotNull TooltipFlag tooltipFlag) {
        list.add(Component.translatable(tooltipKey, List.of(CONFIG.sapphireConfig.tools_percentage_damage_percent()).toArray()).withStyle(color));
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public float getPercent() {
        return percent;
    }
}