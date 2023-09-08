package net.trique.mythicupgrades.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.trique.mythicupgrades.util.EffectMeta;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

public class MythicGemItem extends Item {

    private final HashMap<StatusEffect, EffectMeta> effects;
    private final String translationKey;

    public MythicGemItem(String translationKey, HashMap<StatusEffect, EffectMeta> effects, Settings settings) {
        super(settings);
        this.effects = effects;
        this.translationKey = translationKey;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        for (StatusEffect effect: effects.keySet()) {
            int duration = effects.get(effect).getDuration();
            int amplifier = effects.get(effect).getAmplifier();
            target.addStatusEffect(new StatusEffectInstance(effect, duration, amplifier), attacker);
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(translationKey));
        super.appendTooltip(stack, world, tooltip, context);
    }

}
