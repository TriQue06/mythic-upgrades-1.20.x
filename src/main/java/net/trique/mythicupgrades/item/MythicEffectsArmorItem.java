package net.trique.mythicupgrades.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.trique.mythicupgrades.util.ClientFunctions;
import net.trique.mythicupgrades.util.CommonFunctions;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.ItemEffectsList;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class MythicEffectsArmorItem extends ArmorItem implements BaseMythicArmorItem {
    protected ItemEffectsList effects;
    protected final String tooltipSB;
    protected final ChatFormatting color;
    protected List<Integer> effectAmplifiers;

    public MythicEffectsArmorItem(ArmorMaterial material, Type type, Properties settings, ItemEffectsList effects, String tooltipSB, List<Integer> effectAmplifiers, ChatFormatting color) {
        super(material, type, settings);
        this.effects = effects;
        this.tooltipSB = tooltipSB;
        this.color = color;
        this.effectAmplifiers = effectAmplifiers;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag context) {
        List<String> romanians = effectAmplifiers.stream().map(CommonFunctions::arabicToRom).toList();
        MutableComponent partTooltip = Component.translatable(tooltipSB, romanians.toArray());
        ClientFunctions.handleTooltipForArmor(stack, tooltip, partTooltip, color, this.getMaterial());
    }

    @Override
    public HashMap<MobEffect, EffectMeta> getMainHandEffects() {
        return effects.getForMainHand();
    }

    @Override
    public HashMap<MobEffect, EffectMeta> getOnHitEffects() {
        return effects.getForOthers();
    }

    @Override
    public HashMap<MobEffect, EffectMeta> getEquipmentBuffs() {
        return effects.getForEquipmentBuffs();
    }

    @Override
    public HashMap<MobEffect, EffectMeta> getEquipmentDebuffs() {
        return effects.getForEquipmentDebuffs();
    }

    @Override
    public void setNewEffects(ItemEffectsList effectsList, List<Integer> amplifierList) {
        effects = effectsList;
        effectAmplifiers = amplifierList;
    }
}