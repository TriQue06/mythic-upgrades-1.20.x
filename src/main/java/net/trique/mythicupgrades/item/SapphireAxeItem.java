package net.trique.mythicupgrades.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.trique.mythicupgrades.util.ItemEffectsList;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;

public class SapphireAxeItem extends MythicEffectsAxeItem {
    private int percent;

    public SapphireAxeItem(int attackDamage, int percent,float attackSpeed, Settings settings, ItemEffectsList effects, String tooltipKey, Formatting color) {
        super(MUToolMaterials.SAPPHIRE, attackDamage, attackSpeed, settings, effects, tooltipKey, color);
        this.percent = percent;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(tooltipKey, List.of(CONFIG.sapphireConfig.weapons_percentage_damage_percent()).toArray()).formatted(color));
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}