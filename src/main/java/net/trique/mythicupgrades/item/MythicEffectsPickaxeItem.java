package net.trique.mythicupgrades.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.MythicEffectVirtualItemHandler;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

public class MythicEffectsPickaxeItem extends PickaxeItem implements BaseMythicToolItem {

    private final MythicEffectVirtualItemHandler virtualItemHandler;
    private final String tooltipKey;
    private final Formatting color;

    public MythicEffectsPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings,
                                    ItemEffectsList effects, String tooltipKey, Formatting color) {
        super(material, attackDamage, attackSpeed, settings);
        this.virtualItemHandler = new MythicEffectVirtualItemHandler(effects);
        this.tooltipKey = tooltipKey;
        this.color = color;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        virtualItemHandler.handlePostHit(target, attacker);
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(tooltipKey).formatted(color));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getMainHandEffects() {
        return virtualItemHandler.getMainHandEffects();
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getOnHitEffects() {
        return virtualItemHandler.getOnHitEffects();
    }

    @Override
    public ToolMaterial getMythicMaterial() {
        return this.getMaterial();
    }
}