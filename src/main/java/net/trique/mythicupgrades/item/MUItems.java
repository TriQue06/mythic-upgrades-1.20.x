package net.trique.mythicupgrades.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Formatting;
import net.trique.mythicupgrades.sound.MUSounds;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.ItemEffectsListBuilder;

import java.util.List;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;
import static net.trique.mythicupgrades.effect.MUEffects.*;

public class MUItems {
    private static final ItemEffectsList jadeArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(POISONOUS_THORNS, CONFIG.jadeConfig.poisonous_thorns_amplifier()).build();
    private static final List<Integer> jadeAmplifiers = List.of(CONFIG.jadeConfig.poisonous_thorns_amplifier());
    private static final ItemEffectsList topazItemEffects = new ItemEffectsList();

    private static final ItemEffectsList sapphireArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(DAMAGE_DEFLECTION, CONFIG.sapphireConfig.damage_deflection_amplifier()).build();
    private static final List<Integer> sapphireAmplifiers = List.of(CONFIG.sapphireConfig.damage_deflection_amplifier());

    private static final ItemEffectsList ametrineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(StatusEffects.SPEED, CONFIG.ametrineConfig.ametrine_armor_speed_amplifier()).addForEquipmentBuffs(StatusEffects.JUMP_BOOST, CONFIG.ametrineConfig.ametrine_armor_jump_boost_amplifier()).build();
    private static final List<Integer> ametrineAmplifiers = List.of(CONFIG.ametrineConfig.ametrine_armor_jump_boost_amplifier(), CONFIG.ametrineConfig.ametrine_armor_speed_amplifier());

    private static final ItemEffectsList topazArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(StatusEffects.FIRE_RESISTANCE, 0).addForEquipmentBuffs(ITEM_MASTERY, CONFIG.topazConfig.item_mastery_amplifier()).build();
    private static final List<Integer> topazAmplifiers = List.of(CONFIG.topazConfig.item_mastery_amplifier());


    private static final ItemEffectsList sapphireItemEffects = new ItemEffectsList();
    private static final ItemEffectsList rubyItemEffects = new ItemEffectsList();
    private static final ItemEffectsList jadeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, 40, 2).build();

    private static final ItemEffectsList ametrineItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, 10, 2).build();
    private static final ItemEffectsList aquamarineItemEffects = new ItemEffectsListBuilder().addForHit(FREEZE, 20, 0).build();
    private static final ItemEffectsList freezeAxeItemEffects = new ItemEffectsListBuilder().addForHit(FREEZE, (int) (CONFIG.aquamarineConfig.axe_freeze_duration() * 20), 0).build();
    private static final ItemEffectsList freezeSwordItemEffects = new ItemEffectsListBuilder().addForHit(FREEZE, (int) (CONFIG.aquamarineConfig.sword_freeze_duration() * 20), 0).build();
    private static final ItemEffectsList levitationAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, (int) (CONFIG.ametrineConfig.axe_levitation_duration() * 20), CONFIG.ametrineConfig.axe_levitation_amplifier()).build();
    private static final ItemEffectsList levitationSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, (int) (CONFIG.ametrineConfig.sword_levitation_duration() * 20), CONFIG.ametrineConfig.sword_levitation_amplifier()).build();
    private static final ItemEffectsList poisonSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, (int) (CONFIG.jadeConfig.sword_poison_duration() * 20), CONFIG.jadeConfig.sword_poison_amplifier()).build();
    private static final ItemEffectsList poisonAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, (int) (CONFIG.jadeConfig.axe_poison_duration() * 20), CONFIG.jadeConfig.axe_poison_amplifier()).build();
    private static final ItemEffectsList hasteAxeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_axe_amplifier()).build();
    private static final ItemEffectsList hastePickaxeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_pickaxe_amplifier()).build();
    private static final ItemEffectsList hasteHoeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_hoe_amplifier()).build();
    private static final ItemEffectsList hasteShovelItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_shovel_amplifier()).build();
    private static final ItemEffectsList hasteSwordItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_sword_amplifier()).build();

    public static final BrokenDiscItem BROKEN_JADE_DISC = new BrokenDiscItem("jadedisc.description", new FabricItemSettings().maxCount(16));
    public static final BrokenDiscItem BROKEN_TOPAZ_DISC = new BrokenDiscItem("topazdisc.description", new FabricItemSettings().maxCount(16));
    public static final BrokenDiscItem BROKEN_AQUAMARINE_DISC = new BrokenDiscItem("aquamarinedisc.description", new FabricItemSettings().maxCount(16));
    public static final BrokenDiscItem BROKEN_SAPPHIRE_DISC = new BrokenDiscItem("sapphiredisc.description", new FabricItemSettings().maxCount(16));
    public static final BrokenDiscItem BROKEN_RUBY_DISC = new BrokenDiscItem("rubydisc.description", new FabricItemSettings().maxCount(16));
    public static final BrokenDiscItem BROKEN_AMETRINE_DISC = new BrokenDiscItem("ametrinedisc.description", new FabricItemSettings().maxCount(16));

    public static final MusicDiscItem MUSIC_DISC_SOOT = new MusicDiscItem(15, MUSounds.SOOT, new FabricItemSettings().maxCount(1), 299);
    public static final MusicDiscItem MUSIC_DISC_APPOMATTOX = new MusicDiscItem(14, MUSounds.APPOMATTOX, new FabricItemSettings().maxCount(1), 724);
    public static final MusicDiscItem MUSIC_DISC_FIERCE = new MusicDiscItem(14, MUSounds.FIERCE, new FabricItemSettings().maxCount(1), 129);
    public static final MusicDiscItem MUSIC_DISC_NELUMBO = new MusicDiscItem(14, MUSounds.NELUMBO, new FabricItemSettings().maxCount(1), 118);
    public static final MusicDiscItem MUSIC_DISC_FLOW_OF_THE_ABYSS = new MusicDiscItem(14, MUSounds.FLOW_OF_THE_ABYSS, new FabricItemSettings().maxCount(1), 125);
    public static final MusicDiscItem MUSIC_DISC_TANKER_ON_THE_LEVANTINES = new MusicDiscItem(14, MUSounds.TANKER_ON_THE_LEVANTINES, new FabricItemSettings().maxCount(1), 201);

    public static final MUGemItem JADE = new MUGemItem("jade.description", Formatting.GREEN, jadeItemEffects, new FabricItemSettings());
    public static final Item JADE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item JADE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item JADE_APPLE = new Item(new FabricItemSettings().fireproof().food(MUFoods.JADE_APPLE));

    public static final MUGemItem TOPAZ = new MUGemItem("topaz.description", Formatting.GOLD, topazItemEffects, new FabricItemSettings());
    public static final Item TOPAZ_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item TOPAZ_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item TOPAZ_APPLE = new Item(new FabricItemSettings().fireproof().food(MUFoods.TOPAZ_APPLE));

    public static final MUGemItem AQUAMARINE = new MUGemItem("aquamarine.description", Formatting.AQUA, aquamarineItemEffects, new FabricItemSettings());
    public static final Item AQUAMARINE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item AQUAMARINE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item AQUAMARINE_FISH = new Item(new FabricItemSettings().fireproof().food(MUFoods.AQUAMARINE_FISH));

    public static final MUGemItem SAPPHIRE = new MUGemItem("sapphire.description", Formatting.BLUE, sapphireItemEffects, new FabricItemSettings());
    public static final Item SAPPHIRE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item SAPPHIRE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item SAPPHIRE_APPLE = new Item(new FabricItemSettings().fireproof().food(MUFoods.SAPPHIRE_APPLE));

    public static final MUGemItem RUBY = new MUGemItem("ruby.description", Formatting.RED, rubyItemEffects, new FabricItemSettings());
    public static final Item RUBY_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item RUBY_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item RUBY_APPLE = new Item(new FabricItemSettings().fireproof().food(MUFoods.RUBY_APPLE));

    public static final MUGemItem AMETRINE = new MUGemItem("ametrine.description", Formatting.LIGHT_PURPLE, ametrineItemEffects, new FabricItemSettings());
    public static final Item AMETRINE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item AMETRINE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item AMETRINE_APPLE = new Item(new FabricItemSettings().fireproof().food(MUFoods.AMETRINE_APPLE));

    public static final MythicEffectsAxeItem JADE_AXE = new MythicEffectsAxeItem(MUToolMaterials.JADE, 6, -3.0f, (new FabricItemSettings().fireproof()), poisonAxeItemEffects, "jade_axe.description", Formatting.GREEN);
    public static final MythicEffectsSwordItem JADE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.JADE, 4, -2.4f, (new FabricItemSettings().fireproof()), poisonSwordItemEffects, "jade_sword.description", Formatting.GREEN);
    public static final MythicEffectsArmorItem JADE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_helmet.description", jadeAmplifiers, Formatting.GREEN);
    public static final MythicEffectsArmorItem JADE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_chestplate.description", jadeAmplifiers, Formatting.GREEN);
    public static final MythicEffectsArmorItem JADE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_leggings.description", jadeAmplifiers, Formatting.GREEN);
    public static final MythicEffectsArmorItem JADE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_boots.description", jadeAmplifiers, Formatting.GREEN);

    public static final Item TOPAZ_SHOVEL = new ShovelItem(MUToolMaterials.TOPAZ, 2, -3.0f, (new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_PICKAXE = new PickaxeItem(MUToolMaterials.TOPAZ, 2, -2.8f, (new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_AXE = new AxeItem(MUToolMaterials.TOPAZ, 6, -3f, (new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_HOE = new HoeItem(MUToolMaterials.TOPAZ, 1, 0.0f, (new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_SWORD = new SwordItem(MUToolMaterials.TOPAZ, 4, -2.4f, (new FabricItemSettings().fireproof()));
    public static final MythicEffectsArmorItem TOPAZ_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_helmet.description", topazAmplifiers, Formatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_chestplate.description", topazAmplifiers, Formatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_leggings.description", topazAmplifiers, Formatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_boots.description", topazAmplifiers, Formatting.GOLD);

    public static final SapphireAxeItem SAPPHIRE_AXE = new SapphireAxeItem(6, CONFIG.sapphireConfig.axe_percentage_damage_percent(), -3.0f, (new FabricItemSettings().fireproof()), new ItemEffectsList(), "sapphire_axe.description", Formatting.BLUE);
    public static final SapphireSwordItem SAPPHIRE_SWORD = new SapphireSwordItem(4, CONFIG.sapphireConfig.sword_percentage_damage_percent(), -2.4f, (new FabricItemSettings().fireproof()), new ItemEffectsList(), "sapphire_sword.description", Formatting.BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_helmet.description", sapphireAmplifiers, Formatting.BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_chestplate.description", sapphireAmplifiers, Formatting.BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_leggings.description", sapphireAmplifiers, Formatting.BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_boots.description", sapphireAmplifiers, Formatting.BLUE);

    public static final MythicEffectsShovelItem RUBY_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.RUBY, 2, -2.2f, (new FabricItemSettings().fireproof()), hasteShovelItemEffects, "ruby_shovel.description", Formatting.RED);
    public static final MythicEffectsPickaxeItem RUBY_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.RUBY, 2, -2.2f, (new FabricItemSettings().fireproof()), hastePickaxeItemEffects, "ruby_pickaxe.description", Formatting.RED);
    public static final MythicEffectsAxeItem RUBY_AXE = new MythicEffectsAxeItem(MUToolMaterials.RUBY, 6, -2.5f, (new FabricItemSettings().fireproof()), hasteAxeItemEffects, "ruby_axe.description", Formatting.RED);
    public static final MythicEffectsHoeItem RUBY_HOE = new MythicEffectsHoeItem(MUToolMaterials.RUBY, 1, 0.6f, (new FabricItemSettings().fireproof()), hasteHoeItemEffects, "ruby_hoe.description", Formatting.RED);
    public static final MythicEffectsSwordItem RUBY_SWORD = new MythicEffectsSwordItem(MUToolMaterials.RUBY, 4, -1.6f, (new FabricItemSettings().fireproof()), hasteSwordItemEffects, "ruby_sword.description", Formatting.RED);

    public static final MythicEffectsAxeItem AQUAMARINE_AXE = new MythicEffectsAxeItem(MUToolMaterials.AQUAMARINE, 6, -3f, (new FabricItemSettings().fireproof()), freezeAxeItemEffects, "aquamarine_axe.description", Formatting.AQUA);
    public static final MythicEffectsSwordItem AQUAMARINE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.AQUAMARINE, 4, -2.4f, (new FabricItemSettings().fireproof()), freezeSwordItemEffects, "aquamarine_axe.description", Formatting.AQUA);

    public static final MythicEffectsAxeItem AMETRINE_AXE = new MythicEffectsAxeItem(MUToolMaterials.AMETRINE, 6, -3.0f, (new FabricItemSettings().fireproof()), levitationAxeItemEffects, "ametrine_axe.description", Formatting.LIGHT_PURPLE);
    public static final MythicEffectsSwordItem AMETRINE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.AMETRINE, 4, -2.4f, (new FabricItemSettings().fireproof()), levitationSwordItemEffects, "ametrine_sword.description", Formatting.LIGHT_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), ametrineArmorEffects, "ametrine_helmet.description", ametrineAmplifiers, Formatting.LIGHT_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), ametrineItemEffects, "ametrine_chestplate.description", ametrineAmplifiers, Formatting.LIGHT_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), ametrineArmorEffects, "ametrine_leggings.description", ametrineAmplifiers, Formatting.LIGHT_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), ametrineArmorEffects, "ametrine_boots.description", ametrineAmplifiers, Formatting.LIGHT_PURPLE);

    public static final Item JADE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createJadeUpgrade();
    public static final Item TOPAZ_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createTopazUpgrade();
    public static final Item AQUAMARINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createAquamarineUpgrade();
    public static final Item SAPPHIRE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createSapphireUpgrade();
    public static final Item RUBY_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createRubyUpgrade();
    public static final Item AMETRINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createAmetrineUpgrade();
}