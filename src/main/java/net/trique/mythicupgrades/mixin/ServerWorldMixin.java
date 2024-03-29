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
import static net.trique.mythicupgrades.effect.MUEffects.ITEM_MASTERY;
import static net.trique.mythicupgrades.item.MUItems.*;

@Mixin(ServerWorld.class)
public abstract class ServerWorldMixin {
    @Inject(method = "tick", at = @At(value = "HEAD"))
    private void updateByConfigs(CallbackInfo ci) {
        ItemEffectsList sapphireArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(MUEffects.DAMAGE_DEFLECTION, CONFIG.sapphireConfig.damage_deflection_amplifier()).build();
        List<Integer> sapphireAmplifiers = List.of(CONFIG.sapphireConfig.damage_deflection_amplifier());

        ItemEffectsList ametrineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(StatusEffects.SPEED, CONFIG.ametrineConfig.ametrine_armor_speed_amplifier()).
                addForEquipmentBuffs(StatusEffects.JUMP_BOOST, CONFIG.ametrineConfig.ametrine_armor_jump_boost_amplifier()).build();
        List<Integer> ametrineAmplifiers = List.of(CONFIG.ametrineConfig.ametrine_armor_jump_boost_amplifier(), CONFIG.ametrineConfig.ametrine_armor_speed_amplifier());

        ItemEffectsList jadeArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(MUEffects.POISONOUS_THORNS, CONFIG.jadeConfig.poisonous_thorns_amplifier()).build();
        List<Integer> jadeAmplifiers = List.of(CONFIG.jadeConfig.poisonous_thorns_amplifier());

        ItemEffectsList topazArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(StatusEffects.FIRE_RESISTANCE, 0).addForEquipmentBuffs(ITEM_MASTERY, CONFIG.topazConfig.item_mastery_amplifier()).build();
        List<Integer> topazAmplifiers = List.of(CONFIG.topazConfig.item_mastery_amplifier());

        ItemEffectsList freezeAxeItemEffects = new ItemEffectsListBuilder().addForHit(MUEffects.FREEZE, (int)(CONFIG.aquamarineConfig.axe_freeze_duration() * 20), 0).build();
        ItemEffectsList freezeSwordItemEffects = new ItemEffectsListBuilder().addForHit(MUEffects.FREEZE, (int)(CONFIG.aquamarineConfig.sword_freeze_duration() * 20), 0).build();
        ItemEffectsList levitationAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, (int)(CONFIG.ametrineConfig.axe_levitation_duration() * 20), CONFIG.ametrineConfig.axe_levitation_amplifier()).build();
        ItemEffectsList levitationSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, (int)(CONFIG.ametrineConfig.sword_levitation_duration() * 20), CONFIG.ametrineConfig.sword_levitation_amplifier()).build();
        ItemEffectsList poisonSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, (int)(CONFIG.jadeConfig.sword_poison_duration() * 20), CONFIG.jadeConfig.sword_poison_amplifier()).build();
        ItemEffectsList poisonAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, (int)(CONFIG.jadeConfig.axe_poison_duration() * 20), CONFIG.jadeConfig.axe_poison_amplifier()).build();
        ItemEffectsList hasteAxeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_axe_amplifier()).build();
        ItemEffectsList hastePickaxeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_pickaxe_amplifier()).build();
        ItemEffectsList hasteHoeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_hoe_amplifier()).build();
        ItemEffectsList hasteShovelItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_shovel_amplifier()).build();
        ItemEffectsList hasteSwordItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_sword_amplifier()).build();

        AQUAMARINE_AXE.setNewEffects(freezeAxeItemEffects);
        AQUAMARINE_SWORD.setNewEffects(freezeSwordItemEffects);
        JADE_AXE.setNewEffects(poisonAxeItemEffects);
        JADE_SWORD.setNewEffects(poisonSwordItemEffects);
        AMETRINE_AXE.setNewEffects(levitationAxeItemEffects);
        AMETRINE_SWORD.setNewEffects(levitationSwordItemEffects);
        RUBY_AXE.setNewEffects(hasteAxeItemEffects);
        RUBY_PICKAXE.setNewEffects(hastePickaxeItemEffects);
        RUBY_SWORD.setNewEffects(hasteSwordItemEffects);
        RUBY_SHOVEL.setNewEffects(hasteShovelItemEffects);
        RUBY_HOE.setNewEffects(hasteHoeItemEffects);

        SAPPHIRE_HELMET.setNewEffects(sapphireArmorEffects, sapphireAmplifiers);
        SAPPHIRE_CHESTPLATE.setNewEffects(sapphireArmorEffects, sapphireAmplifiers);
        SAPPHIRE_LEGGINGS.setNewEffects(sapphireArmorEffects, sapphireAmplifiers);
        SAPPHIRE_BOOTS.setNewEffects(sapphireArmorEffects, sapphireAmplifiers);
        JADE_HELMET.setNewEffects(jadeArmorEffects, jadeAmplifiers);
        JADE_CHESTPLATE.setNewEffects(jadeArmorEffects, jadeAmplifiers);
        JADE_LEGGINGS.setNewEffects(jadeArmorEffects, jadeAmplifiers);
        JADE_BOOTS.setNewEffects(jadeArmorEffects, jadeAmplifiers);
        AMETRINE_HELMET.setNewEffects(ametrineArmorEffects, ametrineAmplifiers);
        AMETRINE_CHESTPLATE.setNewEffects(ametrineArmorEffects, ametrineAmplifiers);
        AMETRINE_LEGGINGS.setNewEffects(ametrineArmorEffects, ametrineAmplifiers);
        AMETRINE_BOOTS.setNewEffects(ametrineArmorEffects, ametrineAmplifiers);
        TOPAZ_HELMET.setNewEffects(topazArmorEffects, topazAmplifiers);
        TOPAZ_CHESTPLATE.setNewEffects(topazArmorEffects, topazAmplifiers);
        TOPAZ_LEGGINGS.setNewEffects(topazArmorEffects, topazAmplifiers);
        TOPAZ_BOOTS.setNewEffects(topazArmorEffects, topazAmplifiers);

        SAPPHIRE_SWORD.setPercent(CONFIG.sapphireConfig.sword_percentage_damage_percent());
        SAPPHIRE_AXE.setPercent(CONFIG.sapphireConfig.axe_percentage_damage_percent());
    }
}
