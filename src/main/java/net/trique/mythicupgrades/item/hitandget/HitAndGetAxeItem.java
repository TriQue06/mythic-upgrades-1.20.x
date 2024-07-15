package net.trique.mythicupgrades.item.hitandget;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.trique.mythicupgrades.item.BaseMythicToolItem;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.MythicEffectVirtualItemHandler;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

public class HitAndGetAxeItem extends AxeItem implements BaseMythicToolItem {
    protected final MythicEffectVirtualItemHandler virtualItemHandler;
    protected final String tooltipKey;
    protected final ChatFormatting color;

    public HitAndGetAxeItem(Tier material, int attackDamage, float attackSpeed, Properties settings,
                            ItemEffectsList effects, String tooltipKey, ChatFormatting color) {
        super(material, attackDamage, attackSpeed, settings);
        this.virtualItemHandler = new MythicEffectVirtualItemHandler(effects);
        this.tooltipKey = tooltipKey;
        this.color = color;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag context) {
        tooltip.add(Component.translatable(tooltipKey).withStyle(color));
    }


    @Override
    public HashMap<MobEffect, EffectMeta> getMainHandEffects() {
        return virtualItemHandler.getMainHandEffects();
    }

    @Override
    public HashMap<MobEffect, EffectMeta> getOnHitEffects() {
        return virtualItemHandler.getOnHitEffects();
    }

    @Override
    public Tier getMythicMaterial() {
        return this.getTier();
    }

    @Override
    public void setNewEffects(ItemEffectsList list) {
        virtualItemHandler.setNewEffects(list);
    }
}