package net.trique.mythicupgrades.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.ChatFormatting;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.ItemEffectsListBuilder;

import java.util.List;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;
import static net.trique.mythicupgrades.effect.MUEffects.*;

public class MUItems {
    private static final ItemEffectsList aquamarineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(OCEAN_SHIELD, CONFIG.aquamarineConfig.ocean_shield_amplifier()).addForEquipmentBuffs(MobEffects.DOLPHINS_GRACE, 0).addForEquipmentBuffs(MobEffects.WATER_BREATHING, 0).build();
    private static final List<Integer> aquamarineAmplifiers = List.of(CONFIG.aquamarineConfig.ocean_shield_amplifier());

    private static final ItemEffectsList citrineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(HINDERING, CONFIG.citrineConfig.hindering_amplifier()).build();
    private static final List<Integer> citrineAmplifiers = List.of(CONFIG.citrineConfig.hindering_amplifier());

    private static final ItemEffectsList peridotArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(POISONOUS_THORNS, CONFIG.peridotConfig.poisonous_thorns_amplifier()).build();
    private static final List<Integer> peridotAmplifiers = List.of(CONFIG.peridotConfig.poisonous_thorns_amplifier());

    private static final ItemEffectsList zirconArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ICE_SHIELD, CONFIG.zirconConfig.ice_shield_amplifier()).build();
    private static final List<Integer> zirconAmplifiers = List.of(CONFIG.zirconConfig.ice_shield_amplifier());

    private static final ItemEffectsList sapphireArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(DAMAGE_DEFLECTION, CONFIG.sapphireConfig.damage_deflection_amplifier()).build();
    private static final List<Integer> sapphireAmplifiers = List.of(CONFIG.sapphireConfig.damage_deflection_amplifier());

    private static final ItemEffectsList topazArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ITEM_MASTERY, CONFIG.topazConfig.item_mastery_amplifier()).addForEquipmentBuffs(MobEffects.FIRE_RESISTANCE, 0).build();
    private static final List<Integer> topazAmplifiers = List.of(CONFIG.topazConfig.item_mastery_amplifier());

    private static final ItemEffectsList ametrineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ARCANE_AURA, CONFIG.ametrineConfig.arcane_aura_amplifier()).build();
    private static final List<Integer> ametrineAmplifiers = List.of(CONFIG.ametrineConfig.arcane_aura_amplifier());

    private static final ItemEffectsList jadeArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(MobEffects.MOVEMENT_SPEED, CONFIG.jadeConfig.speed_amplifier()).addForEquipmentBuffs(MobEffects.JUMP, CONFIG.jadeConfig.jump_boost_amplifier()).build();
    private static final List<Integer> jadeAmplifiers = List.of(CONFIG.jadeConfig.speed_amplifier(), CONFIG.jadeConfig.jump_boost_amplifier());

    private static final ItemEffectsList noItemEffects = new ItemEffectsListBuilder().build();

    private static final ItemEffectsList hinderingAxeItemEffects = new ItemEffectsListBuilder().addForHit(MobEffects.WEAKNESS, (int)(CONFIG.citrineConfig.weapons_weakness_duration() * 20), CONFIG.citrineConfig.weapons_weakness_amplifier()).addForHit(MobEffects.MOVEMENT_SLOWDOWN, (int)(CONFIG.citrineConfig.weapons_slowness_duration() * 20), CONFIG.citrineConfig.weapons_slowness_amplifier()).addForHit(MobEffects.HUNGER, (int)(CONFIG.citrineConfig.weapons_hunger_duration() * 20), CONFIG.citrineConfig.weapons_hunger_amplifier()).build();
    private static final ItemEffectsList hinderingSwordItemEffects = new ItemEffectsListBuilder().addForHit(MobEffects.WEAKNESS, (int)(CONFIG.citrineConfig.weapons_weakness_duration() * 20), CONFIG.citrineConfig.weapons_weakness_amplifier()).addForHit(MobEffects.MOVEMENT_SLOWDOWN, (int)(CONFIG.citrineConfig.weapons_slowness_duration() * 20), CONFIG.citrineConfig.weapons_slowness_amplifier()).addForHit(MobEffects.HUNGER, (int)(CONFIG.citrineConfig.weapons_hunger_duration() * 20), CONFIG.citrineConfig.weapons_hunger_amplifier()).build();

    private static final ItemEffectsList poisonSwordItemEffects = new ItemEffectsListBuilder().addForHit(MobEffects.POISON, (int) (CONFIG.peridotConfig.weapons_poison_duration() * 20), CONFIG.peridotConfig.weapons_poison_amplifier()).build();
    private static final ItemEffectsList poisonAxeItemEffects = new ItemEffectsListBuilder().addForHit(MobEffects.POISON, (int) (CONFIG.peridotConfig.weapons_poison_duration() * 20), CONFIG.peridotConfig.weapons_poison_amplifier()).build();

    private static final ItemEffectsList freezeAxeItemEffects = new ItemEffectsListBuilder().addForHit(FREEZE, (int) (CONFIG.zirconConfig.weapons_freeze_duration() * 20), 0).build();
    private static final ItemEffectsList freezeSwordItemEffects = new ItemEffectsListBuilder().addForHit(FREEZE, (int) (CONFIG.zirconConfig.weapons_freeze_duration() * 20), 0).build();

    private static final ItemEffectsList hasteAxeItemEffects = new ItemEffectsListBuilder().addForMainHand(MobEffects.DIG_SPEED, MobEffectInstance.INFINITE_DURATION, CONFIG.rubyConfig.tools_haste_amplifier()).build();
    private static final ItemEffectsList hastePickaxeItemEffects = new ItemEffectsListBuilder().addForMainHand(MobEffects.DIG_SPEED, MobEffectInstance.INFINITE_DURATION, CONFIG.rubyConfig.tools_haste_amplifier()).build();
    private static final ItemEffectsList hasteHoeItemEffects = new ItemEffectsListBuilder().addForMainHand(MobEffects.DIG_SPEED, MobEffectInstance.INFINITE_DURATION, CONFIG.rubyConfig.tools_haste_amplifier()).build();
    private static final ItemEffectsList hasteShovelItemEffects = new ItemEffectsListBuilder().addForMainHand(MobEffects.DIG_SPEED, MobEffectInstance.INFINITE_DURATION, CONFIG.rubyConfig.tools_haste_amplifier()).build();

    private static final ItemEffectsList levitationAxeItemEffects = new ItemEffectsListBuilder().addForHit(MobEffects.LEVITATION, (int) (CONFIG.ametrineConfig.weapons_levitation_duration() * 20), CONFIG.ametrineConfig.weapons_levitation_amplifier()).build();
    private static final ItemEffectsList levitationSwordItemEffects = new ItemEffectsListBuilder().addForHit(MobEffects.LEVITATION, (int) (CONFIG.ametrineConfig.weapons_levitation_duration() * 20), CONFIG.ametrineConfig.weapons_levitation_amplifier()).build();

    public static final Item AQUAMARINE = new Item(new FabricItemSettings());
    public static final Item AQUAMARINE_INGOT = new Item(new FabricItemSettings().fireResistant());
    public static final Item AQUAMARINE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireResistant());
    public static final Item AQUAMARINE_POTION = new MythicPotionItem(new FabricItemSettings().fireResistant().food(MUFoods.AQUAMARINE_POTION).stacksTo(16));

    public static final Item CITRINE = new Item(new FabricItemSettings());
    public static final Item CITRINE_INGOT = new Item(new FabricItemSettings().fireResistant());
    public static final Item CITRINE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireResistant());
    public static final Item CITRINE_POTION = new MythicPotionItem(new FabricItemSettings().fireResistant().food(MUFoods.CITRINE_POTION).stacksTo(16));

    public static final Item PERIDOT = new Item(new FabricItemSettings());
    public static final Item PERIDOT_INGOT = new Item(new FabricItemSettings().fireResistant());
    public static final Item PERIDOT_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireResistant());
    public static final Item PERIDOT_POTION = new MythicPotionItem(new FabricItemSettings().fireResistant().food(MUFoods.PERIDOT_POTION).stacksTo(16));

    public static final Item ZIRCON = new Item(new FabricItemSettings());
    public static final Item ZIRCON_INGOT = new Item(new FabricItemSettings().fireResistant());
    public static final Item ZIRCON_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireResistant());
    public static final Item ZIRCON_POTION = new MythicPotionItem(new FabricItemSettings().fireResistant().food(MUFoods.ZIRCON_POTION).stacksTo(16));

    public static final Item RUBY = new Item(new FabricItemSettings());
    public static final Item RUBY_INGOT = new Item(new FabricItemSettings().fireResistant());
    public static final Item RUBY_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireResistant());
    public static final Item RUBY_POTION = new MythicPotionItem(new FabricItemSettings().fireResistant().food(MUFoods.RUBY_POTION).stacksTo(16));

    public static final Item SAPPHIRE = new Item(new FabricItemSettings());
    public static final Item SAPPHIRE_INGOT = new Item(new FabricItemSettings().fireResistant());
    public static final Item SAPPHIRE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireResistant());
    public static final Item SAPPHIRE_POTION = new MythicPotionItem(new FabricItemSettings().fireResistant().food(MUFoods.SAPPHIRE_POTION).stacksTo(16));

    public static final Item TOPAZ = new Item(new FabricItemSettings());
    public static final Item TOPAZ_INGOT = new Item(new FabricItemSettings().fireResistant());
    public static final Item TOPAZ_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireResistant());
    public static final Item TOPAZ_POTION = new MythicPotionItem(new FabricItemSettings().fireResistant().food(MUFoods.TOPAZ_POTION).stacksTo(16));

    public static final Item AMETRINE = new Item(new FabricItemSettings());
    public static final Item AMETRINE_INGOT = new Item(new FabricItemSettings().fireResistant());
    public static final Item AMETRINE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireResistant());
    public static final Item AMETRINE_POTION = new MythicPotionItem(new FabricItemSettings().fireResistant().food(MUFoods.AMETRINE_POTION).stacksTo(16));
    
    public static final Item JADE = new Item(new FabricItemSettings());
    public static final Item JADE_INGOT = new Item(new FabricItemSettings().fireResistant());
    public static final Item JADE_CRYSTAL_SHARD = new Item(new FabricItemSettings().fireResistant());
    public static final Item JADE_POTION = new MythicPotionItem(new FabricItemSettings().fireResistant().food(MUFoods.JADE_POTION).stacksTo(16));

    public static final Item RAW_NECOIUM = new Item(new FabricItemSettings().fireResistant());
    public static final Item NECOIUM_INGOT = new Item(new FabricItemSettings().fireResistant());
    public static final Item NECOIUM_NUGGET = new Item(new FabricItemSettings().fireResistant());

    public static final MythicEffectsArmorItem AQUAMARINE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireResistant(), aquamarineArmorEffects, "aquamarine_helmet.description", aquamarineAmplifiers, ChatFormatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireResistant(), aquamarineArmorEffects, "aquamarine_chestplate.description", aquamarineAmplifiers, ChatFormatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireResistant(), aquamarineArmorEffects, "aquamarine_leggings.description", aquamarineAmplifiers, ChatFormatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireResistant(), aquamarineArmorEffects, "aquamarine_boots.description", aquamarineAmplifiers, ChatFormatting.AQUA);

    public static final MythicEffectsAxeItem CITRINE_AXE = new MythicEffectsAxeItem(MUToolMaterials.CITRINE, 5, -3.0f, (new FabricItemSettings().fireResistant()), hinderingAxeItemEffects, "citrine_axe.description", ChatFormatting.YELLOW);
    public static final MythicEffectsSwordItem CITRINE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.CITRINE, 3, -2.4f, (new FabricItemSettings().fireResistant()), hinderingSwordItemEffects, "citrine_sword.description", ChatFormatting.YELLOW);
    public static final MythicEffectsArmorItem CITRINE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.CITRINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireResistant(), citrineArmorEffects, "citrine_helmet.description", citrineAmplifiers, ChatFormatting.YELLOW);
    public static final MythicEffectsArmorItem CITRINE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.CITRINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireResistant(), citrineArmorEffects, "citrine_chestplate.description", citrineAmplifiers, ChatFormatting.YELLOW);
    public static final MythicEffectsArmorItem CITRINE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.CITRINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireResistant(), citrineArmorEffects, "citrine_leggings.description", citrineAmplifiers, ChatFormatting.YELLOW);
    public static final MythicEffectsArmorItem CITRINE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.CITRINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireResistant(), citrineArmorEffects, "citrine_boots.description", citrineAmplifiers, ChatFormatting.YELLOW);

    public static final MythicEffectsAxeItem PERIDOT_AXE = new MythicEffectsAxeItem(MUToolMaterials.PERIDOT, 5, -3f, (new FabricItemSettings().fireResistant()), poisonAxeItemEffects, "peridot_axe.description", ChatFormatting.GREEN);
    public static final MythicEffectsSwordItem PERIDOT_SWORD = new MythicEffectsSwordItem(MUToolMaterials.PERIDOT, 3, -2.4f, (new FabricItemSettings().fireResistant()), poisonSwordItemEffects, "peridot_sword.description", ChatFormatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.HELMET, new FabricItemSettings().fireResistant(), peridotArmorEffects, "peridot_helmet.description", peridotAmplifiers, ChatFormatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireResistant(), peridotArmorEffects, "peridot_chestplate.description", peridotAmplifiers, ChatFormatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireResistant(), peridotArmorEffects, "peridot_leggings.description", peridotAmplifiers, ChatFormatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.BOOTS, new FabricItemSettings().fireResistant(), peridotArmorEffects, "peridot_boots.description", peridotAmplifiers, ChatFormatting.GREEN);

    public static final MythicEffectsAxeItem ZIRCON_AXE = new MythicEffectsAxeItem(MUToolMaterials.ZIRCON, 5, -3f, (new FabricItemSettings().fireResistant()), freezeAxeItemEffects, "zircon_axe.description", ChatFormatting.BLUE);
    public static final MythicEffectsSwordItem ZIRCON_SWORD = new MythicEffectsSwordItem(MUToolMaterials.ZIRCON, 3, -2.4f, (new FabricItemSettings().fireResistant()), freezeSwordItemEffects, "zircon_axe.description", ChatFormatting.BLUE);
    public static final MythicEffectsArmorItem ZIRCON_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.ZIRCON, ArmorItem.Type.HELMET, new FabricItemSettings().fireResistant(), zirconArmorEffects, "zircon_helmet.description", zirconAmplifiers, ChatFormatting.BLUE);
    public static final MythicEffectsArmorItem ZIRCON_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.ZIRCON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireResistant(), zirconArmorEffects, "zircon_chestplate.description", zirconAmplifiers, ChatFormatting.BLUE);
    public static final MythicEffectsArmorItem ZIRCON_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.ZIRCON, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireResistant(), zirconArmorEffects, "zircon_leggings.description", zirconAmplifiers, ChatFormatting.BLUE);
    public static final MythicEffectsArmorItem ZIRCON_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.ZIRCON, ArmorItem.Type.BOOTS, new FabricItemSettings().fireResistant(), zirconArmorEffects, "zircon_boots.description", zirconAmplifiers, ChatFormatting.BLUE);

    public static final MythicEffectsShovelItem RUBY_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.RUBY, 2, -3.0f, (new FabricItemSettings().fireResistant()), hasteShovelItemEffects, "ruby_shovel.description", ChatFormatting.RED);
    public static final MythicEffectsPickaxeItem RUBY_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.RUBY, 1, -2.8f, (new FabricItemSettings().fireResistant()), hastePickaxeItemEffects, "ruby_pickaxe.description", ChatFormatting.RED);
    public static final MythicEffectsAxeItem RUBY_AXE = new MythicEffectsAxeItem(MUToolMaterials.RUBY, 5, -3f, (new FabricItemSettings().fireResistant()), hasteAxeItemEffects, "ruby_axe.description", ChatFormatting.RED);
    public static final MythicEffectsHoeItem RUBY_HOE = new MythicEffectsHoeItem(MUToolMaterials.RUBY, -4, 0.0f, (new FabricItemSettings().fireResistant()), hasteHoeItemEffects, "ruby_hoe.description", ChatFormatting.RED);

    public static final SapphireAxeItem SAPPHIRE_AXE = new SapphireAxeItem(5, CONFIG.sapphireConfig.weapons_percentage_damage_percent(), -3.0f, (new FabricItemSettings().fireResistant()), new ItemEffectsList(), "sapphire_axe.description", ChatFormatting.DARK_BLUE);
    public static final SapphireSwordItem SAPPHIRE_SWORD = new SapphireSwordItem(3, CONFIG.sapphireConfig.weapons_percentage_damage_percent(), -2.4f, (new FabricItemSettings().fireResistant()), new ItemEffectsList(), "sapphire_sword.description", ChatFormatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings().fireResistant(), sapphireArmorEffects, "sapphire_helmet.description", sapphireAmplifiers, ChatFormatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireResistant(), sapphireArmorEffects, "sapphire_chestplate.description", sapphireAmplifiers, ChatFormatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireResistant(), sapphireArmorEffects, "sapphire_leggings.description", sapphireAmplifiers, ChatFormatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireResistant(), sapphireArmorEffects, "sapphire_boots.description", sapphireAmplifiers, ChatFormatting.DARK_BLUE);

    public static final Item TOPAZ_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.TOPAZ, 2, -3.0f, (new FabricItemSettings().fireResistant()), noItemEffects, "topaz_shovel.description", ChatFormatting.GOLD);
    public static final Item TOPAZ_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.TOPAZ, 1, -2.8f, (new FabricItemSettings().fireResistant()), noItemEffects, "topaz_pickaxe.description", ChatFormatting.GOLD);
    public static final Item TOPAZ_AXE = new MythicEffectsAxeItem(MUToolMaterials.TOPAZ, 5, -3f, (new FabricItemSettings().fireResistant()), noItemEffects, "topaz_axe.description", ChatFormatting.GOLD);
    public static final Item TOPAZ_HOE = new MythicEffectsHoeItem(MUToolMaterials.TOPAZ, -4, 0.0f, (new FabricItemSettings().fireResistant()), noItemEffects, "topaz_hoe.description", ChatFormatting.GOLD);
    public static final Item TOPAZ_SWORD = new MythicEffectsSwordItem(MUToolMaterials.TOPAZ, 3, -2.4f, (new FabricItemSettings().fireResistant()), noItemEffects, "topaz_sword.description", ChatFormatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new FabricItemSettings().fireResistant(), topazArmorEffects, "topaz_helmet.description", topazAmplifiers, ChatFormatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireResistant(), topazArmorEffects, "topaz_chestplate.description", topazAmplifiers, ChatFormatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireResistant(), topazArmorEffects, "topaz_leggings.description", topazAmplifiers, ChatFormatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new FabricItemSettings().fireResistant(), topazArmorEffects, "topaz_boots.description", topazAmplifiers, ChatFormatting.GOLD);

    public static final MythicEffectsAxeItem AMETRINE_AXE = new MythicEffectsAxeItem(MUToolMaterials.AMETRINE, 5, -3.0f, (new FabricItemSettings().fireResistant()), levitationAxeItemEffects, "ametrine_axe.description", ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsSwordItem AMETRINE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.AMETRINE, 3, -2.4f, (new FabricItemSettings().fireResistant()), levitationSwordItemEffects, "ametrine_sword.description", ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireResistant(), ametrineArmorEffects, "ametrine_helmet.description", ametrineAmplifiers, ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireResistant(), ametrineArmorEffects, "ametrine_chestplate.description", ametrineAmplifiers, ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireResistant(), ametrineArmorEffects, "ametrine_leggings.description", ametrineAmplifiers, ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireResistant(), ametrineArmorEffects, "ametrine_boots.description", ametrineAmplifiers, ChatFormatting.DARK_PURPLE);

    public static final MythicEffectsAxeItem JADE_AXE = new MythicEffectsAxeItem(MUToolMaterials.JADE, 5, -2.4f, (new FabricItemSettings().fireResistant()), noItemEffects, "jade_axe.description", ChatFormatting.DARK_GREEN);
    public static final MythicEffectsSwordItem JADE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.JADE, 3, -1.8f, (new FabricItemSettings().fireResistant()), noItemEffects, "jade_sword.description", ChatFormatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.HELMET, new FabricItemSettings().fireResistant(), jadeArmorEffects, "jade_helmet.description", jadeAmplifiers, ChatFormatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireResistant(), jadeArmorEffects, "jade_chestplate.description", jadeAmplifiers, ChatFormatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireResistant(), jadeArmorEffects, "jade_leggings.description", jadeAmplifiers, ChatFormatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireResistant(), jadeArmorEffects, "jade_boots.description", jadeAmplifiers, ChatFormatting.DARK_GREEN);

    public static final Item AQUAMARINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createAquamarineUpgrade();
    public static final Item CITRINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createCitrineUpgrade();
    public static final Item PERIDOT_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createPeridotUpgrade();
    public static final Item ZIRCON_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createZirconUpgrade();
    public static final Item RUBY_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createRubyUpgrade();
    public static final Item SAPPHIRE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createSapphireUpgrade();
    public static final Item TOPAZ_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createTopazUpgrade();
    public static final Item AMETRINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createAmetrineUpgrade();
    public static final Item JADE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createJadeUpgrade();
}