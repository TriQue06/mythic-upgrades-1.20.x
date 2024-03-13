package net.trique.mythicupgrades.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Formatting;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.ItemEffectsListBuilder;

import java.util.List;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;
import static net.trique.mythicupgrades.effect.MUEffects.*;

public class MUItems {
    private static final ItemEffectsList peridotArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(POISONOUS_THORNS, CONFIG.peridotConfig.poisonous_thorns_amplifier()).build();
    private static final List<Integer> peridotAmplifiers = List.of(CONFIG.peridotConfig.poisonous_thorns_amplifier());

    private static final ItemEffectsList topazArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ITEM_MASTERY, CONFIG.topazConfig.topaz_item_mastery_amplifier()).addForEquipmentBuffs(StatusEffects.FIRE_RESISTANCE, 0).build();
    private static final List<Integer> topazAmplifiers = List.of(CONFIG.topazConfig.topaz_item_mastery_amplifier());

    private static final ItemEffectsList citrineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(HINDERING, CONFIG.citrineConfig.hindering_amplifier()).build();
    private static final List<Integer> citrineAmplifiers = List.of(CONFIG.citrineConfig.hindering_amplifier());

    private static final ItemEffectsList aquamarineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(StatusEffects.NIGHT_VISION, 0).addForEquipmentBuffs(StatusEffects.DOLPHINS_GRACE, 0).addForEquipmentBuffs(StatusEffects.WATER_BREATHING, 0).build();
    private static final List<Integer> aquamarineAmplifiers = List.of();

    private static final ItemEffectsList sapphireArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(DAMAGE_DEFLECTION, CONFIG.sapphireConfig.damage_deflection_amplifier()).build();
    private static final List<Integer> sapphireAmplifiers = List.of(CONFIG.sapphireConfig.damage_deflection_amplifier());

    private static final ItemEffectsList kyaniteArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ICE_SHIELD, CONFIG.kyaniteConfig.ice_shield_amplifier()).build();
    private static final List<Integer> kyaniteAmplifiers = List.of(CONFIG.kyaniteConfig.ice_shield_amplifier());

    private static final ItemEffectsList ametrineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ARCANE_AURA, CONFIG.ametrineConfig.arcane_aura_amplifier()).build();
    private static final List<Integer> ametrineAmplifiers = List.of(CONFIG.ametrineConfig.arcane_aura_amplifier());

    private static final ItemEffectsList jadeArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(StatusEffects.SPEED, CONFIG.jadeConfig.speed_amplifier()).addForEquipmentBuffs(StatusEffects.JUMP_BOOST, CONFIG.jadeConfig.jump_boost_amplifier()).build();
    private static final List<Integer> jadeAmplifiers = List.of(CONFIG.jadeConfig.speed_amplifier(), CONFIG.jadeConfig.jump_boost_amplifier());

    private static final ItemEffectsList noItemEffects = new ItemEffectsListBuilder().build();
    private static final ItemEffectsList poisonSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, (int) (CONFIG.peridotConfig.sword_poison_duration() * 20), CONFIG.peridotConfig.sword_poison_amplifier()).build();
    private static final ItemEffectsList poisonAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, (int) (CONFIG.peridotConfig.axe_poison_duration() * 20), CONFIG.peridotConfig.axe_poison_amplifier()).build();
    private static final ItemEffectsList hinderingAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.WEAKNESS, (int)(CONFIG.citrineConfig.axe_weakness_duration() * 20), CONFIG.citrineConfig.axe_weakness_amplifier()).addForHit(StatusEffects.SLOWNESS, (int)(CONFIG.citrineConfig.axe_slowness_duration() * 20), CONFIG.citrineConfig.axe_slowness_amplifier()).addForHit(StatusEffects.HUNGER, (int)(CONFIG.citrineConfig.axe_hunger_duration() * 20), CONFIG.citrineConfig.axe_hunger_amplifier()).build();
    private static final ItemEffectsList hinderingSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.WEAKNESS, (int)(CONFIG.citrineConfig.sword_weakness_duration() * 20), CONFIG.citrineConfig.sword_weakness_amplifier()).addForHit(StatusEffects.SLOWNESS, (int)(CONFIG.citrineConfig.sword_slowness_duration() * 20), CONFIG.citrineConfig.sword_slowness_amplifier()).addForHit(StatusEffects.HUNGER, (int)(CONFIG.citrineConfig.sword_hunger_duration() * 20), CONFIG.citrineConfig.sword_hunger_amplifier()).build();
    private static final ItemEffectsList hasteAxeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_axe_amplifier()).build();
    private static final ItemEffectsList hastePickaxeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_pickaxe_amplifier()).build();
    private static final ItemEffectsList hasteHoeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_hoe_amplifier()).build();
    private static final ItemEffectsList hasteShovelItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, CONFIG.rubyConfig.haste_shovel_amplifier()).build();
    private static final ItemEffectsList freezeAxeItemEffects = new ItemEffectsListBuilder().addForHit(FREEZE, (int) (CONFIG.kyaniteConfig.axe_freeze_duration() * 20), 0).build();
    private static final ItemEffectsList freezeSwordItemEffects = new ItemEffectsListBuilder().addForHit(FREEZE, (int) (CONFIG.kyaniteConfig.sword_freeze_duration() * 20), 0).build();
    private static final ItemEffectsList levitationAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, (int) (CONFIG.ametrineConfig.axe_levitation_duration() * 20), CONFIG.ametrineConfig.axe_levitation_amplifier()).build();
    private static final ItemEffectsList levitationSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, (int) (CONFIG.ametrineConfig.sword_levitation_duration() * 20), CONFIG.ametrineConfig.sword_levitation_amplifier()).build();

    public static final Item PERIDOT = new Item(new FabricItemSettings());
    public static final Item PERIDOT_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item PERIDOT_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item JADE_APPLE = new Item(new FabricItemSettings().fireproof());;
    public static final Item PERIDOT_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.PERIDOT_POTION).maxCount(16));

    public static final Item TOPAZ = new Item(new FabricItemSettings());
    public static final Item TOPAZ_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item TOPAZ_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item TOPAZ_APPLE = new Item(new FabricItemSettings().fireproof());
    public static final Item TOPAZ_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.TOPAZ_POTION).maxCount(16));

    public static final Item CITRINE = new Item(new FabricItemSettings());
    public static final Item CITRINE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item CITRINE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item CITRINE_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.CITRINE_POTION).maxCount(16));

    public static final Item AQUAMARINE = new Item(new FabricItemSettings());
    public static final Item AQUAMARINE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item AQUAMARINE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item AQUAMARINE_FISH = new Item(new FabricItemSettings().fireproof());
    public static final Item AQUAMARINE_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.AQUAMARINE_POTION).maxCount(16));
    public static final Item AQUAMARINE_AXE = new Item(new FabricItemSettings().fireproof().maxCount(1));
    public static final Item AQUAMARINE_SWORD = new Item(new FabricItemSettings().fireproof().maxCount(1));

    public static final Item SAPPHIRE = new Item(new FabricItemSettings());
    public static final Item SAPPHIRE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item SAPPHIRE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item SAPPHIRE_APPLE = new Item(new FabricItemSettings().fireproof());
    public static final Item SAPPHIRE_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.SAPPHIRE_POTION).maxCount(16));

    public static final Item RUBY = new Item(new FabricItemSettings());
    public static final Item RUBY_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item RUBY_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item RUBY_APPLE = new Item(new FabricItemSettings().fireproof());
    public static final Item RUBY_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.RUBY_POTION).maxCount(16));

    public static final Item KYANITE = new Item(new FabricItemSettings());
    public static final Item KYANITE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item KYANITE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item KYANITE_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.KYANITE_POTION).maxCount(16));

    public static final Item AMETRINE = new Item(new FabricItemSettings());
    public static final Item AMETRINE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item AMETRINE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item AMETRINE_APPLE = new Item(new FabricItemSettings().fireproof());
    public static final Item AMETRINE_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.AMETRINE_POTION).maxCount(16));
    
    public static final Item JADE = new Item(new FabricItemSettings());
    public static final Item JADE_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item JADE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireproof());
    public static final Item JADE_POTION = new MythicPotionItem(new FabricItemSettings().fireproof().food(MUFoods.JADE_POTION).maxCount(16));

    public static final Item RAW_NECOIUM = new Item(new FabricItemSettings().fireproof());
    public static final Item NECOIUM_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item NECOIUM_NUGGET = new Item(new FabricItemSettings().fireproof());

    public static final MythicEffectsAxeItem PERIDOT_AXE = new MythicEffectsAxeItem(MUToolMaterials.PERIDOT, 5, -3f, (new FabricItemSettings().fireproof()), poisonAxeItemEffects, "peridot_axe.description", Formatting.GREEN);
    public static final MythicEffectsSwordItem PERIDOT_SWORD = new MythicEffectsSwordItem(MUToolMaterials.PERIDOT, 3, -2.4f, (new FabricItemSettings().fireproof()), poisonSwordItemEffects, "peridot_sword.description", Formatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), peridotArmorEffects, "peridot_helmet.description", peridotAmplifiers, Formatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), peridotArmorEffects, "peridot_chestplate.description", peridotAmplifiers, Formatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), peridotArmorEffects, "peridot_leggings.description", peridotAmplifiers, Formatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), peridotArmorEffects, "peridot_boots.description", peridotAmplifiers, Formatting.GREEN);

    public static final MythicEffectsAxeItem CITRINE_AXE = new MythicEffectsAxeItem(MUToolMaterials.CITRINE, 5, -3.0f, (new FabricItemSettings().fireproof()), hinderingAxeItemEffects, "citrine_axe.description", Formatting.YELLOW);
    public static final MythicEffectsSwordItem CITRINE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.CITRINE, 3, -2.4f, (new FabricItemSettings().fireproof()), hinderingSwordItemEffects, "citrine_sword.description", Formatting.YELLOW);
    public static final MythicEffectsArmorItem CITRINE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.CITRINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), citrineArmorEffects, "citrine_helmet.description", citrineAmplifiers, Formatting.YELLOW);
    public static final MythicEffectsArmorItem CITRINE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.CITRINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), citrineArmorEffects, "citrine_chestplate.description", citrineAmplifiers, Formatting.YELLOW);
    public static final MythicEffectsArmorItem CITRINE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.CITRINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), citrineArmorEffects, "citrine_leggings.description", citrineAmplifiers, Formatting.YELLOW);
    public static final MythicEffectsArmorItem CITRINE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.CITRINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), citrineArmorEffects, "citrine_boots.description", citrineAmplifiers, Formatting.YELLOW);

    public static final Item TOPAZ_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.TOPAZ, 2, -3.0f, (new FabricItemSettings().fireproof()), noItemEffects, "topaz_shovel.description", Formatting.GOLD);
    public static final Item TOPAZ_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.TOPAZ, 1, -2.8f, (new FabricItemSettings().fireproof()), noItemEffects, "topaz_pickaxe.description", Formatting.GOLD);
    public static final Item TOPAZ_AXE = new MythicEffectsAxeItem(MUToolMaterials.TOPAZ, 5, -3f, (new FabricItemSettings().fireproof()), noItemEffects, "topaz_axe.description", Formatting.GOLD);
    public static final Item TOPAZ_HOE = new MythicEffectsHoeItem(MUToolMaterials.TOPAZ, -4, 0.0f, (new FabricItemSettings().fireproof()), noItemEffects, "topaz_hoe.description", Formatting.GOLD);
    public static final Item TOPAZ_SWORD = new MythicEffectsSwordItem(MUToolMaterials.TOPAZ, 3, -2.4f, (new FabricItemSettings().fireproof()), noItemEffects, "topaz_sword.description", Formatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_helmet.description", topazAmplifiers, Formatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_chestplate.description", topazAmplifiers, Formatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_leggings.description", topazAmplifiers, Formatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), topazArmorEffects, "topaz_boots.description", topazAmplifiers, Formatting.GOLD);

    public static final MythicEffectsArmorItem AQUAMARINE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), aquamarineArmorEffects, "aquamarine_helmet.description", aquamarineAmplifiers, Formatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), aquamarineArmorEffects, "aquamarine_chestplate.description", aquamarineAmplifiers, Formatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), aquamarineArmorEffects, "aquamarine_leggings.description", aquamarineAmplifiers, Formatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), aquamarineArmorEffects, "aquamarine_boots.description", aquamarineAmplifiers, Formatting.AQUA);

    public static final SapphireAxeItem SAPPHIRE_AXE = new SapphireAxeItem(5, CONFIG.sapphireConfig.axe_percentage_damage_percent(), -3.0f, (new FabricItemSettings().fireproof()), new ItemEffectsList(), "sapphire_axe.description", Formatting.DARK_BLUE);
    public static final SapphireSwordItem SAPPHIRE_SWORD = new SapphireSwordItem(3, CONFIG.sapphireConfig.sword_percentage_damage_percent(), -2.4f, (new FabricItemSettings().fireproof()), new ItemEffectsList(), "sapphire_sword.description", Formatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_helmet.description", sapphireAmplifiers, Formatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_chestplate.description", sapphireAmplifiers, Formatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_leggings.description", sapphireAmplifiers, Formatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), sapphireArmorEffects, "sapphire_boots.description", sapphireAmplifiers, Formatting.DARK_BLUE);

    public static final MythicEffectsShovelItem RUBY_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.RUBY, 2, -3.0f, (new FabricItemSettings().fireproof()), hasteShovelItemEffects, "ruby_shovel.description", Formatting.RED);
    public static final MythicEffectsPickaxeItem RUBY_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.RUBY, 1, -2.8f, (new FabricItemSettings().fireproof()), hastePickaxeItemEffects, "ruby_pickaxe.description", Formatting.RED);
    public static final MythicEffectsAxeItem RUBY_AXE = new MythicEffectsAxeItem(MUToolMaterials.RUBY, 5, -3f, (new FabricItemSettings().fireproof()), hasteAxeItemEffects, "ruby_axe.description", Formatting.RED);
    public static final MythicEffectsHoeItem RUBY_HOE = new MythicEffectsHoeItem(MUToolMaterials.RUBY, -4, 0.0f, (new FabricItemSettings().fireproof()), hasteHoeItemEffects, "ruby_hoe.description", Formatting.RED);
    public static final Item RUBY_SWORD = new Item(new FabricItemSettings().fireproof());

    public static final MythicEffectsAxeItem KYANITE_AXE = new MythicEffectsAxeItem(MUToolMaterials.KYANITE, 5, -3f, (new FabricItemSettings().fireproof()), freezeAxeItemEffects, "kyanite_axe.description", Formatting.BLUE);
    public static final MythicEffectsSwordItem KYANITE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.KYANITE, 3, -2.4f, (new FabricItemSettings().fireproof()), freezeSwordItemEffects, "kyanite_axe.description", Formatting.BLUE);
    public static final MythicEffectsArmorItem KYANITE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.KYANITE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), kyaniteArmorEffects, "kyanite_helmet.description", kyaniteAmplifiers, Formatting.BLUE);
    public static final MythicEffectsArmorItem KYANITE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.KYANITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), kyaniteArmorEffects, "kyanite_chestplate.description", kyaniteAmplifiers, Formatting.BLUE);
    public static final MythicEffectsArmorItem KYANITE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.KYANITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), kyaniteArmorEffects, "kyanite_leggings.description", kyaniteAmplifiers, Formatting.BLUE);
    public static final MythicEffectsArmorItem KYANITE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.KYANITE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), kyaniteArmorEffects, "kyanite_boots.description", kyaniteAmplifiers, Formatting.BLUE);

    public static final MythicEffectsAxeItem AMETRINE_AXE = new MythicEffectsAxeItem(MUToolMaterials.AMETRINE, 5, -3.0f, (new FabricItemSettings().fireproof()), levitationAxeItemEffects, "ametrine_axe.description", Formatting.DARK_PURPLE);
    public static final MythicEffectsSwordItem AMETRINE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.AMETRINE, 3, -2.4f, (new FabricItemSettings().fireproof()), levitationSwordItemEffects, "ametrine_sword.description", Formatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), ametrineArmorEffects, "ametrine_helmet.description", ametrineAmplifiers, Formatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), ametrineArmorEffects, "ametrine_chestplate.description", ametrineAmplifiers, Formatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), ametrineArmorEffects, "ametrine_leggings.description", ametrineAmplifiers, Formatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), ametrineArmorEffects, "ametrine_boots.description", ametrineAmplifiers, Formatting.DARK_PURPLE);

    public static final MythicEffectsAxeItem JADE_AXE = new MythicEffectsAxeItem(MUToolMaterials.JADE, 5, -2.4f, (new FabricItemSettings().fireproof()), noItemEffects, "jade_axe.description", Formatting.DARK_GREEN);
    public static final MythicEffectsSwordItem JADE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.JADE, 3, -1.8f, (new FabricItemSettings().fireproof()), noItemEffects, "jade_sword.description", Formatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_helmet.description", jadeAmplifiers, Formatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_chestplate.description", jadeAmplifiers, Formatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_leggings.description", jadeAmplifiers, Formatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(), jadeArmorEffects, "jade_boots.description", jadeAmplifiers, Formatting.DARK_GREEN);

    public static final Item PERIDOT_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createPeridotUpgrade();
    public static final Item TOPAZ_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createTopazUpgrade();
    public static final Item CITRINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createCitrineUpgrade();
    public static final Item AQUAMARINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createAquamarineUpgrade();
    public static final Item SAPPHIRE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createSapphireUpgrade();
    public static final Item RUBY_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createRubyUpgrade();
    public static final Item KYANITE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createKyaniteUpgrade();
    public static final Item AMETRINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createAmetrineUpgrade();
    public static final Item JADE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createJadeUpgrade();
}