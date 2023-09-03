package net.trique.mythicupgrades.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.trique.mythicupgrades.effect.MythicEffects;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AquamarineItem extends Item {
    public AquamarineItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(MythicEffects.FREEZE, 5, 0), attacker);
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("aquamarine.description"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
