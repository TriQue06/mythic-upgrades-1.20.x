package net.trique.mythicupgrades.item.mythic_impl;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.trique.mythicupgrades.item.base.BaseMythicToolItem;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.MythicEffectVirtualItemHandler;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;

public class MythicEffectsPickaxeItem extends PickaxeItem implements BaseMythicToolItem {

    protected final MythicEffectVirtualItemHandler virtualItemHandler;
    protected final String tooltipKey;
    protected final ChatFormatting color;

    public MythicEffectsPickaxeItem(Tier material, Properties settings,
                                    ItemEffectsList effects, String tooltipKey, ChatFormatting color) {
        super(material, settings);
        this.virtualItemHandler = new MythicEffectVirtualItemHandler(effects);
        this.tooltipKey = tooltipKey;
        this.color = color;
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack stack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) {
        virtualItemHandler.handlePostHit(target, attacker);
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @NotNull TooltipContext tooltipContext, @NotNull List<Component> list, @NotNull TooltipFlag tooltipFlag) {
        list.add(Component.translatable(tooltipKey).withStyle(color));
    }

    @Override
    public HashMap<Holder<MobEffect>, EffectMeta> getMainHandEffects() {
        return virtualItemHandler.getMainHandEffects();
    }

    @Override
    public HashMap<Holder<MobEffect>, EffectMeta> getOnHitEffectsForEnemy() {
        return virtualItemHandler.getOnHitEffectsForEnemy();
    }

    @Override
    public HashMap<Holder<MobEffect>, EffectMeta> getOnHitEffectsForSelf() {
        return virtualItemHandler.getOnHitEffectsForSelf();
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