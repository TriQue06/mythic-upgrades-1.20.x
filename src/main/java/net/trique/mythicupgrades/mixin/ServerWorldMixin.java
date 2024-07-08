package net.trique.mythicupgrades.mixin;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.effect.MUEffects;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.ItemEffectsListBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;
import static net.trique.mythicupgrades.effect.MUEffects.*;
import static net.trique.mythicupgrades.item.MUItems.*;

@Mixin(ServerWorld.class)
public abstract class ServerWorldMixin {
    @Inject(method = "tick", at = @At(value = "HEAD"))

    private void updateByConfigs(CallbackInfo ci) {
        ItemEffectsList aquamarineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ICE_SHIELD, CONFIG.aquamarineConfig.ice_shield_amplifier()).build();
        List<Integer> aquamarineAmplifiers = List.of(CONFIG.aquamarineConfig.ice_shield_amplifier());

        ItemEffectsList peridotArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(MUEffects.POISONOUS_THORNS, CONFIG.peridotConfig.poisonous_thorns_amplifier()).build();
        List<Integer> peridotAmplifiers = List.of(CONFIG.peridotConfig.poisonous_thorns_amplifier());

        ItemEffectsList rubyArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(MINERS_SHIELD, CONFIG.rubyConfig.miners_shield_amplifier()).build();
        List<Integer> rubyAmplifiers = List.of(CONFIG.rubyConfig.miners_shield_amplifier());

        ItemEffectsList sapphireArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(MUEffects.DAMAGE_DEFLECTION, CONFIG.sapphireConfig.damage_deflection_amplifier()).build();
        List<Integer> sapphireAmplifiers = List.of(CONFIG.sapphireConfig.damage_deflection_amplifier());

        ItemEffectsList topazArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ITEM_MASTERY, CONFIG.topazConfig.item_mastery_amplifier()).addForEquipmentBuffs(StatusEffects.FIRE_RESISTANCE, 0).build();
        List<Integer> topazAmplifiers = List.of(CONFIG.topazConfig.item_mastery_amplifier());

        ItemEffectsList ametrineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ARCANE_AURA, CONFIG.ametrineConfig.arcane_aura_amplifier()).build();
        List<Integer> ametrineAmplifiers = List.of(CONFIG.ametrineConfig.arcane_aura_amplifier());

        ItemEffectsList jadeArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(StatusEffects.SPEED, CONFIG.jadeConfig.speed_amplifier()).addForEquipmentBuffs(StatusEffects.JUMP_BOOST, CONFIG.jadeConfig.jump_boost_amplifier()).build();
        List<Integer> jadeAmplifiers = List.of(CONFIG.jadeConfig.speed_amplifier(), CONFIG.jadeConfig.jump_boost_amplifier());

        ItemEffectsList poisonToolEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, (int)(CONFIG.peridotConfig.tools_poison_duration() * 20), CONFIG.peridotConfig.tools_poison_amplifier()).build();

        ItemEffectsList freezeToolEffects = new ItemEffectsListBuilder().addForHit(MUEffects.FREEZE, (int)(CONFIG.aquamarineConfig.tools_freeze_duration() * 20), 0).build();

        ItemEffectsList hasteToolEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.tools_haste_amplifier()).build();

        ItemEffectsList levitationToolEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, (int)(CONFIG.ametrineConfig.tools_levitation_duration() * 20), CONFIG.ametrineConfig.tools_levitation_amplifier()).build();

        ItemEffectsList bouncerToolEffect = new ItemEffectsListBuilder().addForMainHand(BOUNCER, StatusEffectInstance.INFINITE, 0).addForHit(StatusEffects.JUMP_BOOST, (int) (CONFIG.jadeConfig.tools_bouncer_duration() * 20), MythicUpgrades.CONFIG.jadeConfig.tools_bouncer_amplifier()).build();

        AQUAMARINE_AXE.setNewEffects(freezeToolEffects);
        AQUAMARINE_PICKAXE.setNewEffects(freezeToolEffects);
        AQUAMARINE_SHOVEL.setNewEffects(freezeToolEffects);
        AQUAMARINE_HOE.setNewEffects(freezeToolEffects);
        AQUAMARINE_SWORD.setNewEffects(freezeToolEffects);
        
        PERIDOT_AXE.setNewEffects(poisonToolEffects);
        PERIDOT_SHOVEL.setNewEffects(poisonToolEffects);
        PERIDOT_PICKAXE.setNewEffects(poisonToolEffects);
        PERIDOT_HOE.setNewEffects(poisonToolEffects);
        PERIDOT_SWORD.setNewEffects(poisonToolEffects);
        
        RUBY_AXE.setNewEffects(hasteToolEffects);
        RUBY_PICKAXE.setNewEffects(hasteToolEffects);
        RUBY_SHOVEL.setNewEffects(hasteToolEffects);
        RUBY_HOE.setNewEffects(hasteToolEffects);
        RUBY_SWORD.setNewEffects(hasteToolEffects);

        SAPPHIRE_AXE.setPercent(CONFIG.sapphireConfig.tools_percentage_damage_percent());
        SAPPHIRE_SHOVEL.setPercent(CONFIG.sapphireConfig.tools_percentage_damage_percent());
        SAPPHIRE_PICKAXE.setPercent(CONFIG.sapphireConfig.tools_percentage_damage_percent());
        SAPPHIRE_HOE.setPercent(CONFIG.sapphireConfig.tools_percentage_damage_percent());
        SAPPHIRE_SWORD.setPercent(CONFIG.sapphireConfig.tools_percentage_damage_percent());

        AMETRINE_AXE.setNewEffects(levitationToolEffects);
        AMETRINE_SHOVEL.setNewEffects(levitationToolEffects);
        AMETRINE_PICKAXE.setNewEffects(levitationToolEffects);
        AMETRINE_HOE.setNewEffects(levitationToolEffects);
        AMETRINE_SWORD.setNewEffects(levitationToolEffects);

        JADE_AXE.setNewEffects(bouncerToolEffect);
        JADE_SHOVEL.setNewEffects(bouncerToolEffect);
        JADE_PICKAXE.setNewEffects(bouncerToolEffect);
        JADE_HOE.setNewEffects(bouncerToolEffect);
        JADE_SWORD.setNewEffects(bouncerToolEffect);

        AQUAMARINE_HELMET.setNewEffects(aquamarineArmorEffects, aquamarineAmplifiers);
        AQUAMARINE_CHESTPLATE.setNewEffects(aquamarineArmorEffects, aquamarineAmplifiers);
        AQUAMARINE_LEGGINGS.setNewEffects(aquamarineArmorEffects, aquamarineAmplifiers);
        AQUAMARINE_BOOTS.setNewEffects(aquamarineArmorEffects, aquamarineAmplifiers);

        PERIDOT_HELMET.setNewEffects(peridotArmorEffects, peridotAmplifiers);
        PERIDOT_CHESTPLATE.setNewEffects(peridotArmorEffects, peridotAmplifiers);
        PERIDOT_LEGGINGS.setNewEffects(peridotArmorEffects, peridotAmplifiers);
        PERIDOT_BOOTS.setNewEffects(peridotArmorEffects, peridotAmplifiers);

        RUBY_HELMET.setNewEffects(rubyArmorEffects, rubyAmplifiers);
        RUBY_CHESTPLATE.setNewEffects(rubyArmorEffects, rubyAmplifiers);
        RUBY_LEGGINGS.setNewEffects(rubyArmorEffects, rubyAmplifiers);
        RUBY_BOOTS.setNewEffects(rubyArmorEffects, rubyAmplifiers);

        SAPPHIRE_HELMET.setNewEffects(sapphireArmorEffects, sapphireAmplifiers);
        SAPPHIRE_CHESTPLATE.setNewEffects(sapphireArmorEffects, sapphireAmplifiers);
        SAPPHIRE_LEGGINGS.setNewEffects(sapphireArmorEffects, sapphireAmplifiers);
        SAPPHIRE_BOOTS.setNewEffects(sapphireArmorEffects, sapphireAmplifiers);

        TOPAZ_HELMET.setNewEffects(topazArmorEffects, topazAmplifiers);
        TOPAZ_CHESTPLATE.setNewEffects(topazArmorEffects, topazAmplifiers);
        TOPAZ_LEGGINGS.setNewEffects(topazArmorEffects, topazAmplifiers);
        TOPAZ_BOOTS.setNewEffects(topazArmorEffects, topazAmplifiers);

        AMETRINE_HELMET.setNewEffects(ametrineArmorEffects, ametrineAmplifiers);
        AMETRINE_CHESTPLATE.setNewEffects(ametrineArmorEffects, ametrineAmplifiers);
        AMETRINE_LEGGINGS.setNewEffects(ametrineArmorEffects, ametrineAmplifiers);
        AMETRINE_BOOTS.setNewEffects(ametrineArmorEffects, ametrineAmplifiers);

        JADE_HELMET.setNewEffects(jadeArmorEffects, jadeAmplifiers);
        JADE_CHESTPLATE.setNewEffects(jadeArmorEffects, jadeAmplifiers);
        JADE_LEGGINGS.setNewEffects(jadeArmorEffects, jadeAmplifiers);
        JADE_BOOTS.setNewEffects(jadeArmorEffects, jadeAmplifiers);
    }
}