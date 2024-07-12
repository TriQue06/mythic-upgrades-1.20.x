package net.trique.mythicupgrades.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Formatting;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.item.hitandget.*;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.ItemEffectsListBuilder;

import java.util.List;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;
import static net.trique.mythicupgrades.effect.MUEffects.*;

public class MUItems {
    private static final ItemEffectsList aquamarineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ICE_SHIELD, CONFIG.aquamarineConfig.ice_shield_amplifier()).build();
    private static final List<Integer> aquamarineAmplifiers = List.of(CONFIG.aquamarineConfig.ice_shield_amplifier());

    private static final ItemEffectsList peridotArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(POISONOUS_THORNS, CONFIG.peridotConfig.poisonous_thorns_amplifier()).build();
    private static final List<Integer> peridotAmplifiers = List.of(CONFIG.peridotConfig.poisonous_thorns_amplifier());

    private static final ItemEffectsList rubyArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(MINERS_SHIELD, CONFIG.rubyConfig.miners_shield_amplifier()).build();
    private static final List<Integer> rubyAmplifiers = List.of(CONFIG.rubyConfig.miners_shield_amplifier());

    private static final ItemEffectsList sapphireArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(DAMAGE_DEFLECTION, CONFIG.sapphireConfig.damage_deflection_amplifier()).build();
    private static final List<Integer> sapphireAmplifiers = List.of(CONFIG.sapphireConfig.damage_deflection_amplifier());

    private static final ItemEffectsList topazArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ITEM_MASTERY, CONFIG.topazConfig.item_mastery_amplifier()).addForEquipmentBuffs(StatusEffects.FIRE_RESISTANCE, 0).build();
    private static final List<Integer> topazAmplifiers = List.of(CONFIG.topazConfig.item_mastery_amplifier());

    private static final ItemEffectsList ametrineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ARCANE_AURA, CONFIG.ametrineConfig.arcane_aura_amplifier()).build();
    private static final List<Integer> ametrineAmplifiers = List.of(CONFIG.ametrineConfig.arcane_aura_amplifier());

    private static final ItemEffectsList jadeArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(StatusEffects.SPEED, CONFIG.jadeConfig.speed_amplifier()).addForEquipmentBuffs(StatusEffects.JUMP_BOOST, CONFIG.jadeConfig.jump_boost_amplifier()).build();
    private static final List<Integer> jadeAmplifiers = List.of(CONFIG.jadeConfig.speed_amplifier(), CONFIG.jadeConfig.jump_boost_amplifier());

    private static final ItemEffectsList noToolEffects = new ItemEffectsListBuilder().build();

    private static final ItemEffectsList poisonToolEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, (int) (CONFIG.peridotConfig.tools_poison_duration() * 20), CONFIG.peridotConfig.tools_poison_amplifier()).build();

    private static final ItemEffectsList freezeToolEffects = new ItemEffectsListBuilder().addForHit(FREEZE, (int) (CONFIG.aquamarineConfig.tools_freeze_duration() * 20), 0).build();

    private static final ItemEffectsList hasteToolEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.tools_haste_amplifier()).build();

    private static final ItemEffectsList levitationToolEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, (int) (CONFIG.ametrineConfig.tools_levitation_duration() * 20), CONFIG.ametrineConfig.tools_levitation_amplifier()).build();

    private static final ItemEffectsList bouncerToolEffect = new ItemEffectsListBuilder().addForMainHand(BOUNCER, StatusEffectInstance.INFINITE, 0).addForHit(StatusEffects.JUMP_BOOST, (int) (CONFIG.jadeConfig.tools_bouncer_duration() * 20),MythicUpgrades.CONFIG.jadeConfig.tools_bouncer_amplifier()).build();

    public static final Item AQUAMARINE = new Item(new FabricItemSettings());
    public static final Item AQUAMARINE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item AQUAMARINE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item AQUAMARINE_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.AQUAMARINE_POTION).maxCount(16));

    public static final Item PERIDOT = new Item(new FabricItemSettings());
    public static final Item PERIDOT_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item PERIDOT_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item PERIDOT_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.PERIDOT_POTION).maxCount(16));

    public static final Item TOPAZ = new Item(new FabricItemSettings());
    public static final Item TOPAZ_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item TOPAZ_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item TOPAZ_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.TOPAZ_POTION).maxCount(16));

    public static final Item RUBY = new Item(new FabricItemSettings());
    public static final Item RUBY_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item RUBY_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item RUBY_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.RUBY_POTION).maxCount(16));

    public static final Item SAPPHIRE = new Item(new FabricItemSettings());
    public static final Item SAPPHIRE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item SAPPHIRE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item SAPPHIRE_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.SAPPHIRE_POTION).maxCount(16));

    public static final Item AMETRINE = new Item(new FabricItemSettings());
    public static final Item AMETRINE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item AMETRINE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item AMETRINE_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.AMETRINE_POTION).maxCount(16));

    public static final Item JADE = new Item(new FabricItemSettings());
    public static final Item JADE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item JADE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item JADE_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.JADE_POTION).maxCount(16));

    public static final Item RAW_NECOIUM = new Item(new FabricItemSettings().fireproof());
    public static final Item NECOIUM_INGOT = new Item(new FabricItemSettings().fireproof());

    public static final MythicEffectsShovelItem AQUAMARINE_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.AQUAMARINE, 2, -2.9f, (new FabricItemSettings().fireproof()), freezeToolEffects, "aquamarine_tool.description", Formatting.AQUA);
    public static final MythicEffectsPickaxeItem AQUAMARINE_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.AQUAMARINE, 1, -2.7f, (new FabricItemSettings().fireproof()), freezeToolEffects, "aquamarine_tool.description", Formatting.AQUA);
    public static final MythicEffectsAxeItem AQUAMARINE_AXE = new MythicEffectsAxeItem(MUToolMaterials.AQUAMARINE, 5, -2.9f, (new FabricItemSettings().fireproof()), freezeToolEffects, "aquamarine_tool.description", Formatting.AQUA);
    public static final MythicEffectsHoeItem AQUAMARINE_HOE = new MythicEffectsHoeItem(MUToolMaterials.AQUAMARINE, -4, 0.1f, (new FabricItemSettings().fireproof()), freezeToolEffects, "aquamarine_tool.description", Formatting.AQUA);
    public static final MythicEffectsSwordItem AQUAMARINE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.AQUAMARINE, 3, -2.3f, (new FabricItemSettings().fireproof()), freezeToolEffects, "aquamarine_tool.description", Formatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), aquamarineArmorEffects, "aquamarine_armor.description", aquamarineAmplifiers, Formatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), aquamarineArmorEffects, "aquamarine_armor.description", aquamarineAmplifiers, Formatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), aquamarineArmorEffects, "aquamarine_armor.description", aquamarineAmplifiers, Formatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), aquamarineArmorEffects, "aquamarine_armor.description", aquamarineAmplifiers, Formatting.AQUA);

    public static final MythicEffectsShovelItem PERIDOT_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.PERIDOT, 2, -2.9f, (new FabricItemSettings().fireproof()), poisonToolEffects, "peridot_tool.description", Formatting.GREEN);
    public static final MythicEffectsPickaxeItem PERIDOT_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.PERIDOT, 1, -2.7f, (new FabricItemSettings().fireproof()), poisonToolEffects, "peridot_tool.description", Formatting.GREEN);
    public static final MythicEffectsAxeItem PERIDOT_AXE = new MythicEffectsAxeItem(MUToolMaterials.PERIDOT, 5, -2.9f, (new FabricItemSettings().fireproof()), poisonToolEffects, "peridot_tool.description", Formatting.GREEN);
    public static final MythicEffectsHoeItem PERIDOT_HOE = new MythicEffectsHoeItem(MUToolMaterials.PERIDOT, -4, 0.1f, (new FabricItemSettings().fireproof()), poisonToolEffects, "peridot_tool.description", Formatting.GREEN);
    public static final MythicEffectsSwordItem PERIDOT_SWORD = new MythicEffectsSwordItem(MUToolMaterials.PERIDOT, 3, -2.3f, (new FabricItemSettings().fireproof()), poisonToolEffects, "peridot_tool.description", Formatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), peridotArmorEffects, "peridot_armor.description", peridotAmplifiers, Formatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), peridotArmorEffects, "peridot_armor.description", peridotAmplifiers, Formatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), peridotArmorEffects, "peridot_armor.description", peridotAmplifiers, Formatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), peridotArmorEffects, "peridot_armor.description", peridotAmplifiers, Formatting.GREEN);

    public static final MythicEffectsShovelItem TOPAZ_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.TOPAZ, 2, -2.9f, (new FabricItemSettings().fireproof()), noToolEffects, "topaz_tool.description", Formatting.GOLD);
    public static final MythicEffectsPickaxeItem TOPAZ_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.TOPAZ, 1, -2.7f, (new FabricItemSettings().fireproof()), noToolEffects, "topaz_tool.description", Formatting.GOLD);
    public static final MythicEffectsAxeItem TOPAZ_AXE = new MythicEffectsAxeItem(MUToolMaterials.TOPAZ, 5, -2.9f, (new FabricItemSettings().fireproof()), noToolEffects, "topaz_tool.description", Formatting.GOLD);
    public static final MythicEffectsHoeItem TOPAZ_HOE = new MythicEffectsHoeItem(MUToolMaterials.TOPAZ, -4, 0.1f, (new FabricItemSettings().fireproof()), noToolEffects, "topaz_tool.description", Formatting.GOLD);
    public static final MythicEffectsSwordItem TOPAZ_SWORD = new MythicEffectsSwordItem(MUToolMaterials.TOPAZ, 3, -2.3f, (new FabricItemSettings().fireproof()), noToolEffects, "topaz_tool.description", Formatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_armor.description", topazAmplifiers, Formatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_armor.description", topazAmplifiers, Formatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_armor.description", topazAmplifiers, Formatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_armor.description", topazAmplifiers, Formatting.GOLD);

    public static final MythicEffectsShovelItem RUBY_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.RUBY, 2, -2.1f, (new FabricItemSettings().fireproof()), hasteToolEffects, "ruby_tool.description", Formatting.RED);
    public static final MythicEffectsPickaxeItem RUBY_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.RUBY, 1, -1.9f, (new FabricItemSettings().fireproof()), hasteToolEffects, "ruby_tool.description", Formatting.RED);
    public static final MythicEffectsAxeItem RUBY_AXE = new MythicEffectsAxeItem(MUToolMaterials.RUBY, 5, -2.1f, (new FabricItemSettings().fireproof()), hasteToolEffects, "ruby_tool.description", Formatting.RED);
    public static final MythicEffectsHoeItem RUBY_HOE = new MythicEffectsHoeItem(MUToolMaterials.RUBY, -4, 0.9f, (new FabricItemSettings().fireproof()), hasteToolEffects, "ruby_tool.description", Formatting.RED);
    public static final MythicEffectsSwordItem RUBY_SWORD = new MythicEffectsSwordItem(MUToolMaterials.RUBY, 3, -1.5f, (new FabricItemSettings().fireproof()), hasteToolEffects, "ruby_tool.description", Formatting.RED);
    public static final MythicEffectsArmorItem RUBY_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), rubyArmorEffects, "ruby_armor.description", rubyAmplifiers, Formatting.RED);
    public static final MythicEffectsArmorItem RUBY_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), rubyArmorEffects, "ruby_armor.description", rubyAmplifiers, Formatting.RED);
    public static final MythicEffectsArmorItem RUBY_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), rubyArmorEffects, "ruby_armor.description", rubyAmplifiers, Formatting.RED);
    public static final MythicEffectsArmorItem RUBY_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), rubyArmorEffects, "ruby_armor.description", rubyAmplifiers, Formatting.RED);

    public static final SapphireShovelItem SAPPHIRE_SHOVEL = new SapphireShovelItem(2, CONFIG.sapphireConfig.tools_percentage_damage_percent(), -2.9f, (new FabricItemSettings().fireproof()), new ItemEffectsList(), "sapphire_tool.description", Formatting.DARK_BLUE);
    public static final SapphirePickaxeItem SAPPHIRE_PICKAXE = new SapphirePickaxeItem(1, CONFIG.sapphireConfig.tools_percentage_damage_percent(), -2.7f, (new FabricItemSettings().fireproof()), new ItemEffectsList(), "sapphire_tool.description", Formatting.DARK_BLUE);
    public static final SapphireAxeItem SAPPHIRE_AXE = new SapphireAxeItem(5, CONFIG.sapphireConfig.tools_percentage_damage_percent(), -2.9f, (new FabricItemSettings().fireproof()), new ItemEffectsList(), "sapphire_tool.description", Formatting.DARK_BLUE);
    public static final SapphireHoeItem SAPPHIRE_HOE = new SapphireHoeItem(-4, CONFIG.sapphireConfig.tools_percentage_damage_percent(), 0.1f, (new FabricItemSettings().fireproof()), new ItemEffectsList(), "sapphire_tool.description", Formatting.DARK_BLUE);
    public static final SapphireSwordItem SAPPHIRE_SWORD = new SapphireSwordItem(3, CONFIG.sapphireConfig.tools_percentage_damage_percent(), -2.3f, (new FabricItemSettings().fireproof()), new ItemEffectsList(), "sapphire_tool.description", Formatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_armor.description", sapphireAmplifiers, Formatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_armor.description", sapphireAmplifiers, Formatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_armor.description", sapphireAmplifiers, Formatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_armor.description", sapphireAmplifiers, Formatting.DARK_BLUE);

    public static final MythicEffectsShovelItem AMETRINE_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.AMETRINE, 2, -2.9f, (new FabricItemSettings().fireproof()), levitationToolEffects, "ametrine_tool.description", Formatting.DARK_PURPLE);
    public static final MythicEffectsPickaxeItem AMETRINE_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.AMETRINE, 1, -2.7f, (new FabricItemSettings().fireproof()), levitationToolEffects, "ametrine_tool.description", Formatting.DARK_PURPLE);
    public static final MythicEffectsAxeItem AMETRINE_AXE = new MythicEffectsAxeItem(MUToolMaterials.AMETRINE, 5, -2.9f, (new FabricItemSettings().fireproof()), levitationToolEffects, "ametrine_tool.description", Formatting.DARK_PURPLE);
    public static final MythicEffectsHoeItem AMETRINE_HOE = new MythicEffectsHoeItem(MUToolMaterials.AMETRINE, -4, 0.1f, (new FabricItemSettings().fireproof()), levitationToolEffects, "ametrine_tool.description", Formatting.DARK_PURPLE);
    public static final MythicEffectsSwordItem AMETRINE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.AMETRINE, 3, -2.3f, (new FabricItemSettings().fireproof()), levitationToolEffects, "ametrine_tool.description", Formatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), ametrineArmorEffects, "ametrine_armor.description", ametrineAmplifiers, Formatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), ametrineArmorEffects, "ametrine_armor.description", ametrineAmplifiers, Formatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), ametrineArmorEffects, "ametrine_armor.description", ametrineAmplifiers, Formatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), ametrineArmorEffects, "ametrine_armor.description", ametrineAmplifiers, Formatting.DARK_PURPLE);

    public static final HitAndGetShovelItem JADE_SHOVEL = new HitAndGetShovelItem(MUToolMaterials.JADE, 2, -2.9f, (new FabricItemSettings().fireproof()), bouncerToolEffect, "jade_tool.description", Formatting.DARK_GREEN);
    public static final HitAndGetPickaxeItem JADE_PICKAXE = new HitAndGetPickaxeItem(MUToolMaterials.JADE, 1, -2.7f, (new FabricItemSettings().fireproof()), bouncerToolEffect, "jade_tool.description", Formatting.DARK_GREEN);
    public static final HitAndGetAxeItem JADE_AXE = new HitAndGetAxeItem(MUToolMaterials.JADE, 5, -2.9f, (new FabricItemSettings().fireproof()), bouncerToolEffect, "jade_tool.description", Formatting.DARK_GREEN);
    public static final HitAndGetHoeItem JADE_HOE = new HitAndGetHoeItem(MUToolMaterials.JADE, -4, 0.1f, (new FabricItemSettings().fireproof()), bouncerToolEffect, "jade_tool.description", Formatting.DARK_GREEN);
    public static final HitAndGetSwordItem JADE_SWORD = new HitAndGetSwordItem(MUToolMaterials.JADE, 3, -2.3f, (new FabricItemSettings().fireproof()), bouncerToolEffect, "jade_tool.description", Formatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_armor.description", jadeAmplifiers, Formatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_armor.description", jadeAmplifiers, Formatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_armor.description", jadeAmplifiers, Formatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_armor.description", jadeAmplifiers, Formatting.DARK_GREEN);

    public static final Item AQUAMARINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createAquamarineUpgrade();
    public static final Item PERIDOT_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createPeridotUpgrade();
    public static final Item TOPAZ_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createTopazUpgrade();
    public static final Item RUBY_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createRubyUpgrade();
    public static final Item SAPPHIRE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createSapphireUpgrade();
    public static final Item AMETRINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createAmetrineUpgrade();
    public static final Item JADE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createJadeUpgrade();
}