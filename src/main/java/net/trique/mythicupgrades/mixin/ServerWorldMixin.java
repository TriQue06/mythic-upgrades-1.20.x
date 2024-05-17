package net.trique.mythicupgrades.mixin;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
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
        ItemEffectsList aquamarineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(OCEAN_SHIELD, CONFIG.aquamarineConfig.ocean_shield_amplifier()).addForEquipmentBuffs(StatusEffects.DOLPHINS_GRACE, 0).addForEquipmentBuffs(StatusEffects.WATER_BREATHING, 0).build();
        List<Integer> aquamarineAmplifiers = List.of(CONFIG.aquamarineConfig.ocean_shield_amplifier());

        ItemEffectsList citrineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(HINDERING, CONFIG.citrineConfig.hindering_amplifier()).build();
        List<Integer> citrineAmplifiers = List.of(CONFIG.citrineConfig.hindering_amplifier());

        ItemEffectsList peridotArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(MUEffects.POISONOUS_THORNS, CONFIG.peridotConfig.poisonous_thorns_amplifier()).build();
        List<Integer> peridotAmplifiers = List.of(CONFIG.peridotConfig.poisonous_thorns_amplifier());

        ItemEffectsList zirconArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ICE_SHIELD, CONFIG.zirconConfig.ice_shield_amplifier()).build();
        List<Integer> zirconAmplifiers = List.of(CONFIG.zirconConfig.ice_shield_amplifier());

        ItemEffectsList sapphireArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(MUEffects.DAMAGE_DEFLECTION, CONFIG.sapphireConfig.damage_deflection_amplifier()).build();
        List<Integer> sapphireAmplifiers = List.of(CONFIG.sapphireConfig.damage_deflection_amplifier());

        ItemEffectsList topazArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ITEM_MASTERY, CONFIG.topazConfig.item_mastery_amplifier()).addForEquipmentBuffs(StatusEffects.FIRE_RESISTANCE, 0).build();
        List<Integer> topazAmplifiers = List.of(CONFIG.topazConfig.item_mastery_amplifier());

        ItemEffectsList ametrineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ARCANE_AURA, CONFIG.ametrineConfig.arcane_aura_amplifier()).build();
        List<Integer> ametrineAmplifiers = List.of(CONFIG.ametrineConfig.arcane_aura_amplifier());

        ItemEffectsList jadeArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(StatusEffects.SPEED, CONFIG.jadeConfig.speed_amplifier()).addForEquipmentBuffs(StatusEffects.JUMP_BOOST, CONFIG.jadeConfig.jump_boost_amplifier()).build();
        List<Integer> jadeAmplifiers = List.of(CONFIG.jadeConfig.speed_amplifier(), CONFIG.jadeConfig.jump_boost_amplifier());

        ItemEffectsList hinderingAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.WEAKNESS, (int)(CONFIG.citrineConfig.weapons_weakness_duration() * 20), CONFIG.citrineConfig.weapons_weakness_amplifier()).addForHit(StatusEffects.SLOWNESS, (int)(CONFIG.citrineConfig.weapons_hunger_duration() * 20), CONFIG.citrineConfig.weapons_slowness_amplifier()).addForHit(StatusEffects.HUNGER, (int)(CONFIG.citrineConfig.weapons_hunger_duration() * 20), CONFIG.citrineConfig.weapons_hunger_amplifier()).build();
        ItemEffectsList hinderingSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.WEAKNESS, (int)(CONFIG.citrineConfig.weapons_weakness_duration() * 20), CONFIG.citrineConfig.weapons_weakness_amplifier()).addForHit(StatusEffects.SLOWNESS, (int)(CONFIG.citrineConfig.weapons_hunger_duration() * 20), CONFIG.citrineConfig.weapons_slowness_amplifier()).addForHit(StatusEffects.HUNGER, (int)(CONFIG.citrineConfig.weapons_hunger_duration() * 20), CONFIG.citrineConfig.weapons_hunger_amplifier()).build();

        ItemEffectsList poisonSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, (int)(CONFIG.peridotConfig.weapons_poison_duration() * 20), CONFIG.peridotConfig.weapons_poison_amplifier()).build();
        ItemEffectsList poisonAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, (int)(CONFIG.peridotConfig.weapons_poison_duration() * 20), CONFIG.peridotConfig.weapons_poison_amplifier()).build();

        ItemEffectsList freezeAxeItemEffects = new ItemEffectsListBuilder().addForHit(MUEffects.FREEZE, (int)(CONFIG.zirconConfig.weapons_freeze_duration() * 20), 0).build();
        ItemEffectsList freezeSwordItemEffects = new ItemEffectsListBuilder().addForHit(MUEffects.FREEZE, (int)(CONFIG.zirconConfig.weapons_freeze_duration() * 20), 0).build();

        ItemEffectsList hasteAxeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.tools_haste_amplifier()).build();
        ItemEffectsList hastePickaxeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.tools_haste_amplifier()).build();
        ItemEffectsList hasteHoeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.tools_haste_amplifier()).build();
        ItemEffectsList hasteShovelItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.tools_haste_amplifier()).build();

        ItemEffectsList levitationAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, (int)(CONFIG.ametrineConfig.weapons_levitation_duration() * 20), CONFIG.ametrineConfig.weapons_levitation_amplifier()).build();
        ItemEffectsList levitationSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, (int)(CONFIG.ametrineConfig.weapons_levitation_duration() * 20), CONFIG.ametrineConfig.weapons_levitation_amplifier()).build();

        CITRINE_AXE.setNewEffects(hinderingAxeItemEffects);
        CITRINE_SWORD.setNewEffects(hinderingSwordItemEffects);

        PERIDOT_AXE.setNewEffects(poisonAxeItemEffects);
        PERIDOT_SWORD.setNewEffects(poisonSwordItemEffects);

        ZIRCON_AXE.setNewEffects(freezeAxeItemEffects);
        ZIRCON_SWORD.setNewEffects(freezeSwordItemEffects);

        RUBY_AXE.setNewEffects(hasteAxeItemEffects);
        RUBY_PICKAXE.setNewEffects(hastePickaxeItemEffects);
        RUBY_SHOVEL.setNewEffects(hasteShovelItemEffects);
        RUBY_HOE.setNewEffects(hasteHoeItemEffects);

        SAPPHIRE_SWORD.setPercent(CONFIG.sapphireConfig.weapons_percentage_damage_percent());
        SAPPHIRE_AXE.setPercent(CONFIG.sapphireConfig.weapons_percentage_damage_percent());

        AMETRINE_AXE.setNewEffects(levitationAxeItemEffects);
        AMETRINE_SWORD.setNewEffects(levitationSwordItemEffects);

        AQUAMARINE_HELMET.setNewEffects(aquamarineArmorEffects, aquamarineAmplifiers);
        AQUAMARINE_CHESTPLATE.setNewEffects(aquamarineArmorEffects, aquamarineAmplifiers);
        AQUAMARINE_LEGGINGS.setNewEffects(aquamarineArmorEffects, aquamarineAmplifiers);
        AQUAMARINE_BOOTS.setNewEffects(aquamarineArmorEffects, aquamarineAmplifiers);

        CITRINE_HELMET.setNewEffects(citrineArmorEffects, citrineAmplifiers);
        CITRINE_CHESTPLATE.setNewEffects(citrineArmorEffects, citrineAmplifiers);
        CITRINE_LEGGINGS.setNewEffects(topazArmorEffects, citrineAmplifiers);
        CITRINE_BOOTS.setNewEffects(topazArmorEffects, citrineAmplifiers);

        PERIDOT_HELMET.setNewEffects(peridotArmorEffects, peridotAmplifiers);
        PERIDOT_CHESTPLATE.setNewEffects(peridotArmorEffects, peridotAmplifiers);
        PERIDOT_LEGGINGS.setNewEffects(peridotArmorEffects, peridotAmplifiers);
        PERIDOT_BOOTS.setNewEffects(peridotArmorEffects, peridotAmplifiers);

        ZIRCON_HELMET.setNewEffects(zirconArmorEffects, zirconAmplifiers);
        ZIRCON_CHESTPLATE.setNewEffects(zirconArmorEffects, zirconAmplifiers);
        ZIRCON_LEGGINGS.setNewEffects(zirconArmorEffects, zirconAmplifiers);
        ZIRCON_BOOTS.setNewEffects(zirconArmorEffects, zirconAmplifiers);

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