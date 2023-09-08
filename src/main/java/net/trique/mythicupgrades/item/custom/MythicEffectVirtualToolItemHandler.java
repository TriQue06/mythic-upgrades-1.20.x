package net.trique.mythicupgrades.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.trique.mythicupgrades.util.EffectMeta;

import java.util.HashMap;

public class MythicEffectVirtualToolItemHandler<ParentTool>{

    private final HashMap<StatusEffect, EffectMeta> effects;
    private final ToolMaterial material;
    private final ParentTool tool;


    public MythicEffectVirtualToolItemHandler(ToolMaterial material, HashMap<StatusEffect, EffectMeta> effects, ParentTool tool) {
        this.effects = effects;
        this.material = material;
        this.tool = tool;
    }


    public void handlePostHit(LivingEntity target, LivingEntity attacker) {
        for (StatusEffect effect : effects.keySet()) {
            EffectMeta meta = effects.get(effect);
            int duration = meta.getDuration();
            int amplifier = meta.getAmplifier();
            boolean ambient = meta.isAmbient();
            boolean showIcon = meta.isShowIcon();
            boolean showParticles = meta.isShowParticles();
            if (effect != null && (effect.equals(StatusEffects.INSTANT_HEALTH) && (target.getGroup().equals(EntityGroup.UNDEAD))) ||
                    (!effect.isBeneficial() && !(effect.equals(StatusEffects.INSTANT_DAMAGE) && (target.getGroup().equals(EntityGroup.UNDEAD))))) {
                target.addStatusEffect(new StatusEffectInstance(effect, duration, amplifier, ambient, showParticles, showIcon), attacker);
            }

        }
    }

    public void handleInventoryTick(World world, Entity entity) {
        if (!world.isClient) {
            if (entity instanceof LivingEntity player) {
                if (player.getStackInHand(Hand.MAIN_HAND).getItem().equals(tool)) {
                    applyPositiveEffects(player);
                } else {
                    for (StatusEffect effect : effects.keySet()) {
                        System.out.println(effect);
                        if (effect != null && effect.isBeneficial() && !effect.isInstant() && player.hasStatusEffect(effect) && player.getActiveStatusEffects().get(effect).isInfinite()) {
                            player.removeStatusEffect(effect);
                        }
                    }
                }
            }
        }
    }


    private void applyPositiveEffects(LivingEntity livingEntity) {
        for (StatusEffect effect : effects.keySet()) {
            System.out.println(effect);
            if (effect != null && effect.isBeneficial() && !effect.isInstant()) {
                EffectMeta meta = effects.get(effect);
                int duration = meta.getDuration();
                int amplifier = meta.getAmplifier();
                boolean ambient = meta.isAmbient();
                boolean showIcon = meta.isShowIcon();
                boolean showParticles = meta.isShowParticles();
                livingEntity.addStatusEffect(new StatusEffectInstance(effect, duration, amplifier, ambient, showParticles, showIcon));
            }
        }
    }

    private boolean check_item(Item item) {
        boolean result;
        if (!(item instanceof MythicEffectPickaxeItem) || (item instanceof MythicEffectAxeItem) ||
                (item instanceof MythicEffectShovelItem) || (item instanceof MythicEffectHoeItem) ||
                (item instanceof MythicEffectSwordItem)) {
            return false;
        }
        try {
            result = ((MythicEffectPickaxeItem) item).getMaterial().equals(material);
        } catch (Exception e) {
            return false;
        }
        return result;
    }
}
