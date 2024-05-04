package net.trique.mythicupgrades.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.trique.mythicupgrades.util.ClientFunctions;
import net.trique.mythicupgrades.util.CommonFunctions;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.ItemEffectsList;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class MythicEffectsArmorItem extends ArmorItem implements BaseMythicArmorItem {
    protected ItemEffectsList effects;
    protected final String tooltipSB;
    protected final Formatting color;
    protected List<Integer> effectAmplifiers;

    public MythicEffectsArmorItem(ArmorMaterial material, Type type, Settings settings, ItemEffectsList effects, String tooltipSB, List<Integer> effectAmplifiers, Formatting color) {
        super(material, type, settings);
        this.effects = effects;
        this.tooltipSB = tooltipSB;
        this.color = color;
        this.effectAmplifiers = effectAmplifiers;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        List<String> romanians = effectAmplifiers.stream().map(CommonFunctions::arabicToRom).toList();
        MutableText partTooltip = Text.translatable(tooltipSB, romanians.toArray());
        ClientFunctions.handleTooltipForArmor(stack, tooltip, partTooltip, color, this.getMaterial());
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getMainHandEffects() {
        return effects.getForMainHand();
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getOnHitEffects() {
        return effects.getForOthers();
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getEquipmentBuffs() {
        return effects.getForEquipmentBuffs();
    }

    @Override
    public HashMap<StatusEffect, EffectMeta> getEquipmentDebuffs() {
        return effects.getForEquipmentDebuffs();
    }

    @Override
    public void setNewEffects(ItemEffectsList effectsList, List<Integer> amplifierList) {
        effects = effectsList;
        effectAmplifiers = amplifierList;
    }
}