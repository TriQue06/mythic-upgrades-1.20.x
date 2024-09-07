package net.trique.mythicupgrades.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.trique.mythicupgrades.util.ItemEffectsList;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;

public class SapphireShovelItem extends MythicEffectsShovelItem implements VirtualSapphireTool {
    private float percent;

    public SapphireShovelItem(int attackDamage, float percent, float attackSpeed, Properties settings, ItemEffectsList effects, String tooltipKey, ChatFormatting color) {
        super(MUToolMaterials.SAPPHIRE, attackDamage, attackSpeed, settings, effects, tooltipKey, color);
        this.percent = percent;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag context) {
        tooltip.add(Component.translatable(tooltipKey, List.of(CONFIG.sapphireConfig.tools_percentage_damage_percent()).toArray()).withStyle(color));
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public float getPercent() {
        return percent;
    }
}