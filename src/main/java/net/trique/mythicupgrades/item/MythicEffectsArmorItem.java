package net.trique.mythicupgrades.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.trique.mythicupgrades.util.ClientFunctions;
import net.trique.mythicupgrades.util.EffectMeta;
import net.trique.mythicupgrades.util.ItemEffectsList;
import org.jetbrains.annotations.Nullable;
import java.util.*;

public class MythicEffectsArmorItem extends ArmorItem implements BaseMythicArmorItem {
    private final ItemEffectsList effects;
    private final String tooltipSB;
    private final Formatting color;

    public MythicEffectsArmorItem(ArmorMaterial material, Type type, Settings settings, ItemEffectsList effects, String tooltipSB, Formatting color) {
        super(material, type, settings);
        this.effects = effects;
        this.tooltipSB = tooltipSB;
        this.color = color;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        ClientFunctions.handleTooltipForArmor(stack, tooltip, tooltipSB, color, this.getMaterial());
        super.appendTooltip(stack, world, tooltip, context);
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
}