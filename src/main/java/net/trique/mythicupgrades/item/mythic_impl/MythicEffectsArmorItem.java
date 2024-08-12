package net.trique.mythicupgrades.item.mythic_impl;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.trique.mythicupgrades.item.base.BaseMythicArmorItem;
import net.trique.mythicupgrades.util.*;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class MythicEffectsArmorItem extends ArmorItem implements BaseMythicArmorItem {
    protected MythicEffectVirtualItemHandler virtualItemHandler;
//    protected ItemEffectsList effects;
    protected final String tooltipSB;
    protected final ChatFormatting color;
    protected List<Integer> effectAmplifiers;

    public MythicEffectsArmorItem(Holder<ArmorMaterial> material, Type type, Properties settings, ItemEffectsList effects, String tooltipSB, List<Integer> effectAmplifiers, ChatFormatting color) {
        super(material, type, settings);
        this.virtualItemHandler = new MythicEffectVirtualItemHandler(effects);
        this.tooltipSB = tooltipSB;
        this.color = color;
        this.effectAmplifiers = effectAmplifiers;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @NotNull TooltipContext tooltipContext, @NotNull List<Component> list, @NotNull TooltipFlag tooltipFlag) {
        List<String> romanians = effectAmplifiers.stream().map(CommonFunctions::arabicToRom).toList();
        MutableComponent partTooltip = Component.translatable(tooltipSB, romanians.toArray());
        ClientFunctions.handleTooltipForArmor(itemStack, list, partTooltip, color, this.getMaterial().value());
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
        return virtualItemHandler.getEquipmentEffectsForSelf();
    }

    @Override
    public HashMap<Holder<MobEffect>, EffectMeta> getEquipmentEffectsForSelf() {
        return virtualItemHandler.getEquipmentEffectsForSelf();
    }

    @Override
    public HashMap<Holder<MobEffect>, EffectMeta> getEquipmentEffectsForEnemies() {
        return virtualItemHandler.getEquipmentEffectsForEnemy();
    }

    @Override
    public void setNewEffects(ItemEffectsList effectsList, List<Integer> amplifierList) {
        virtualItemHandler.setNewEffects(effectsList);
        effectAmplifiers = amplifierList;
    }
}