package net.trique.mythicupgrades.item;

import net.minecraft.ChatFormatting;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.item.materials.MUArmorMaterials;
import net.trique.mythicupgrades.item.misc.MUTemplateItem;
import net.trique.mythicupgrades.item.materials.MUToolMaterials;
import net.trique.mythicupgrades.item.mythic_impl.common.*;
import net.trique.mythicupgrades.item.mythic_impl.sapphire.*;
import net.trique.mythicupgrades.item.mythic_impl.topaz.*;
import net.trique.mythicupgrades.item.potion.*;
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

    private static final ItemEffectsList rubyArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(SPELUNKER, CONFIG.rubyConfig.spelunker_amplifier()).build();
    private static final List<Integer> rubyAmplifiers = List.of(CONFIG.rubyConfig.spelunker_amplifier());

    private static final ItemEffectsList sapphireArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(DAMAGE_DEFLECTION, CONFIG.sapphireConfig.damage_deflection_amplifier()).build();
    private static final List<Integer> sapphireAmplifiers = List.of(CONFIG.sapphireConfig.damage_deflection_amplifier());

    private static final ItemEffectsList topazArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ITEM_MASTERY, CONFIG.topazConfig.item_mastery_amplifier()).addForEquipmentBuffs(MobEffects.FIRE_RESISTANCE, 0).build();
    private static final List<Integer> topazAmplifiers = List.of(CONFIG.topazConfig.item_mastery_amplifier());

    private static final ItemEffectsList ametrineArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(ARCANE_AURA, CONFIG.ametrineConfig.arcane_aura_amplifier()).build();
    private static final List<Integer> ametrineAmplifiers = List.of(CONFIG.ametrineConfig.arcane_aura_amplifier());

    private static final ItemEffectsList jadeArmorEffects = new ItemEffectsListBuilder().addForEquipmentBuffs(MobEffects.MOVEMENT_SPEED, CONFIG.jadeConfig.speed_amplifier()).addForEquipmentBuffs(MobEffects.JUMP, CONFIG.jadeConfig.jump_boost_amplifier()).build();
    private static final List<Integer> jadeAmplifiers = List.of(CONFIG.jadeConfig.speed_amplifier(), CONFIG.jadeConfig.jump_boost_amplifier());

    private static final ItemEffectsList noToolEffects = new ItemEffectsListBuilder().build();

    private static final ItemEffectsList poisonToolEffects = new ItemEffectsListBuilder().addForHitToEnemy(MobEffects.POISON, (int)(CONFIG.peridotConfig.tools_poison_duration() * 20), CONFIG.peridotConfig.tools_effects_amplifier()).
    addForHitToEnemy(MobEffects.CONFUSION, (int) (CONFIG.peridotConfig.tools_nausea_duration() * 20), CONFIG.peridotConfig.tools_effects_amplifier()).build();

    private static final ItemEffectsList freezeToolEffects = new ItemEffectsListBuilder().addForHitToEnemy(FREEZE, (int) (CONFIG.aquamarineConfig.tools_freeze_duration() * 20), 0).build();

    private static final ItemEffectsList hasteToolEffects = new ItemEffectsListBuilder().addForMainHand(MobEffects.DIG_SPEED, MobEffectInstance.INFINITE_DURATION, CONFIG.rubyConfig.tools_haste_amplifier()).build();

    private static final ItemEffectsList levitationToolEffects = new ItemEffectsListBuilder().addForHitToEnemy(MobEffects.LEVITATION, (int) (CONFIG.ametrineConfig.tools_levitation_duration() * 20), CONFIG.ametrineConfig.tools_levitation_amplifier()).build();

    private static final ItemEffectsList bouncerToolEffect = new ItemEffectsListBuilder().addForMainHand(BOUNCER, MobEffectInstance.INFINITE_DURATION, MythicUpgrades.CONFIG.jadeConfig.tools_bouncer_amplifier()).build();

    public static final Item AQUAMARINE = new Item(new Item.Properties());
    public static final Item AQUAMARINE_INGOT = new Item(new Item.Properties().fireResistant());
    public static final Item AQUAMARINE_CRYSTAL_SHARD = new Item(new Item.Properties().fireResistant());
    public static final Item AQUAMARINE_POTION = new MythicPotionItem(new Item.Properties().fireResistant().food(MUPotions.AQUAMARINE_POTION).stacksTo(16));

    public static final Item PERIDOT = new Item(new Item.Properties());
    public static final Item PERIDOT_INGOT = new Item(new Item.Properties().fireResistant());
    public static final Item PERIDOT_CRYSTAL_SHARD = new Item(new Item.Properties().fireResistant());
    public static final Item PERIDOT_POTION = new MythicPotionItem(new Item.Properties().fireResistant().food(MUPotions.PERIDOT_POTION).stacksTo(16));

    public static final Item RUBY = new Item(new Item.Properties());
    public static final Item RUBY_INGOT = new Item(new Item.Properties().fireResistant());
    public static final Item RUBY_CRYSTAL_SHARD = new Item(new Item.Properties().fireResistant());
    public static final Item RUBY_POTION = new MythicPotionItem(new Item.Properties().fireResistant().food(MUPotions.RUBY_POTION).stacksTo(16));

    public static final Item SAPPHIRE = new Item(new Item.Properties());
    public static final Item SAPPHIRE_INGOT = new Item(new Item.Properties().fireResistant());
    public static final Item SAPPHIRE_CRYSTAL_SHARD = new Item(new Item.Properties().fireResistant());
    public static final Item SAPPHIRE_POTION = new MythicPotionItem(new Item.Properties().fireResistant().food(MUPotions.SAPPHIRE_POTION).stacksTo(16));

    public static final Item TOPAZ = new Item(new Item.Properties());
    public static final Item TOPAZ_INGOT = new Item(new Item.Properties().fireResistant());
    public static final Item TOPAZ_CRYSTAL_SHARD = new Item(new Item.Properties().fireResistant());
    public static final Item TOPAZ_POTION = new MythicPotionItem(new Item.Properties().fireResistant().food(MUPotions.TOPAZ_POTION).stacksTo(16));

    public static final Item AMETRINE = new Item(new Item.Properties());
    public static final Item AMETRINE_INGOT = new Item(new Item.Properties().fireResistant());
    public static final Item AMETRINE_CRYSTAL_SHARD = new Item(new Item.Properties().fireResistant());
    public static final Item AMETRINE_POTION = new MythicPotionItem(new Item.Properties().fireResistant().food(MUPotions.AMETRINE_POTION).stacksTo(16));
    
    public static final Item JADE = new Item(new Item.Properties());
    public static final Item JADE_INGOT = new Item(new Item.Properties().fireResistant());
    public static final Item JADE_CRYSTAL_SHARD = new Item(new Item.Properties().fireResistant());
    public static final Item JADE_POTION = new MythicPotionItem(new Item.Properties().fireResistant().food(MUPotions.JADE_POTION).stacksTo(16));

    public static final Item RAW_NECOIUM = new Item(new Item.Properties().fireResistant());
    public static final Item NECOIUM_INGOT = new Item(new Item.Properties().fireResistant());

    public static final MythicEffectsArmorItem AQUAMARINE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(50)), aquamarineArmorEffects, "aquamarine_armor.description", aquamarineAmplifiers, ChatFormatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(50)), aquamarineArmorEffects, "aquamarine_armor.description", aquamarineAmplifiers, ChatFormatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), aquamarineArmorEffects, "aquamarine_armor.description", aquamarineAmplifiers, ChatFormatting.AQUA);
    public static final MythicEffectsArmorItem AQUAMARINE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.AQUAMARINE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), aquamarineArmorEffects, "aquamarine_armor.description", aquamarineAmplifiers, ChatFormatting.AQUA);
    public static final MythicEffectsShovelItem AQUAMARINE_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.AQUAMARINE, new Item.Properties().fireResistant().attributes(MythicEffectsShovelItem.createAttributes(MUToolMaterials.AQUAMARINE, 2, -2.9f)), freezeToolEffects, "aquamarine_tool.description", ChatFormatting.AQUA);
    public static final MythicEffectsPickaxeItem AQUAMARINE_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.AQUAMARINE, new Item.Properties().fireResistant().attributes(MythicEffectsPickaxeItem.createAttributes(MUToolMaterials.AQUAMARINE, 1, -2.7f)), freezeToolEffects, "aquamarine_tool.description", ChatFormatting.AQUA);
    public static final MythicEffectsAxeItem AQUAMARINE_AXE = new MythicEffectsAxeItem(MUToolMaterials.AQUAMARINE, new Item.Properties().fireResistant().attributes(MythicEffectsAxeItem.createAttributes(MUToolMaterials.AQUAMARINE, 5, -2.9f)), freezeToolEffects, "aquamarine_tool.description", ChatFormatting.AQUA);
    public static final MythicEffectsHoeItem AQUAMARINE_HOE = new MythicEffectsHoeItem(MUToolMaterials.AQUAMARINE, new Item.Properties().fireResistant().attributes(MythicEffectsHoeItem.createAttributes(MUToolMaterials.AQUAMARINE, -4, 0.1f)), freezeToolEffects, "aquamarine_tool.description", ChatFormatting.AQUA);
    public static final MythicEffectsSwordItem AQUAMARINE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.AQUAMARINE, new Item.Properties().fireResistant().attributes(MythicEffectsSwordItem.createAttributes(MUToolMaterials.AQUAMARINE, 3, -2.3f)), freezeToolEffects, "aquamarine_tool.description", ChatFormatting.AQUA);

    public static final MythicEffectsShovelItem PERIDOT_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.PERIDOT, new Item.Properties().fireResistant().attributes(MythicEffectsShovelItem.createAttributes(MUToolMaterials.PERIDOT, 2, -2.9f)), poisonToolEffects, "peridot_tool.description", ChatFormatting.GREEN);
    public static final MythicEffectsPickaxeItem PERIDOT_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.PERIDOT, new Item.Properties().fireResistant().attributes(MythicEffectsPickaxeItem.createAttributes(MUToolMaterials.PERIDOT, 1, -2.7f)), poisonToolEffects, "peridot_tool.description", ChatFormatting.GREEN);
    public static final MythicEffectsHoeItem PERIDOT_HOE = new MythicEffectsHoeItem(MUToolMaterials.PERIDOT, new Item.Properties().fireResistant().attributes(MythicEffectsHoeItem.createAttributes(MUToolMaterials.PERIDOT, -4, 0.1f)), poisonToolEffects, "peridot_tool.description", ChatFormatting.GREEN);
    public static final MythicEffectsAxeItem PERIDOT_AXE = new MythicEffectsAxeItem(MUToolMaterials.PERIDOT, new Item.Properties().fireResistant().attributes(MythicEffectsAxeItem.createAttributes(MUToolMaterials.PERIDOT, 5, -2.9f)), poisonToolEffects, "peridot_tool.description", ChatFormatting.GREEN);
    public static final MythicEffectsSwordItem PERIDOT_SWORD = new MythicEffectsSwordItem(MUToolMaterials.PERIDOT, new Item.Properties().fireResistant().attributes(MythicEffectsSwordItem.createAttributes(MUToolMaterials.PERIDOT, 3, -2.3f)), poisonToolEffects, "peridot_tool.description", ChatFormatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(50)), peridotArmorEffects, "peridot_armor.description", peridotAmplifiers, ChatFormatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(50)), peridotArmorEffects, "peridot_armor.description", peridotAmplifiers, ChatFormatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), peridotArmorEffects, "peridot_armor.description", peridotAmplifiers, ChatFormatting.GREEN);
    public static final MythicEffectsArmorItem PERIDOT_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.PERIDOT, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), peridotArmorEffects, "peridot_armor.description", peridotAmplifiers, ChatFormatting.GREEN);

    public static final MythicEffectsShovelItem RUBY_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.RUBY, new Item.Properties().fireResistant().attributes(MythicEffectsShovelItem.createAttributes(MUToolMaterials.RUBY, 2, -2.1f)), hasteToolEffects, "ruby_tool.description", ChatFormatting.RED);
    public static final MythicEffectsPickaxeItem RUBY_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.RUBY, new Item.Properties().fireResistant().attributes(MythicEffectsPickaxeItem.createAttributes(MUToolMaterials.RUBY, 1, -1.9f)), hasteToolEffects, "ruby_tool.description", ChatFormatting.RED);
    public static final MythicEffectsAxeItem RUBY_AXE = new MythicEffectsAxeItem(MUToolMaterials.RUBY, new Item.Properties().fireResistant().attributes(MythicEffectsAxeItem.createAttributes(MUToolMaterials.RUBY, 5, -2.1f)), hasteToolEffects, "ruby_tool.description", ChatFormatting.RED);
    public static final MythicEffectsHoeItem RUBY_HOE = new MythicEffectsHoeItem(MUToolMaterials.RUBY, new Item.Properties().fireResistant().attributes(MythicEffectsHoeItem.createAttributes(MUToolMaterials.RUBY, -4, 0.9f)), hasteToolEffects, "ruby_tool.description", ChatFormatting.RED);
    public static final MythicEffectsSwordItem RUBY_SWORD = new MythicEffectsSwordItem(MUToolMaterials.RUBY, new Item.Properties().fireResistant().attributes(MythicEffectsSwordItem.createAttributes(MUToolMaterials.RUBY, 3, -1.5f)), hasteToolEffects, "ruby_tool.description", ChatFormatting.RED);
    public static final MythicEffectsArmorItem RUBY_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(50)), rubyArmorEffects, "ruby_armor.description", rubyAmplifiers, ChatFormatting.RED);
    public static final MythicEffectsArmorItem RUBY_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(50)), rubyArmorEffects, "ruby_armor.description", rubyAmplifiers, ChatFormatting.RED);
    public static final MythicEffectsArmorItem RUBY_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), rubyArmorEffects, "ruby_armor.description", rubyAmplifiers, ChatFormatting.RED);
    public static final MythicEffectsArmorItem RUBY_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), rubyArmorEffects, "ruby_armor.description", rubyAmplifiers, ChatFormatting.RED);

    public static final SapphireHoeItem SAPPHIRE_HOE = new SapphireHoeItem(CONFIG.sapphireConfig.tools_percentage_damage_percent(), new Item.Properties().fireResistant().attributes(SapphireHoeItem.createAttributes(MUToolMaterials.SAPPHIRE, -4, 0.1f)), noToolEffects, "sapphire_tool.description", ChatFormatting.DARK_BLUE);
    public static final SapphireShovelItem SAPPHIRE_SHOVEL = new SapphireShovelItem(CONFIG.sapphireConfig.tools_percentage_damage_percent(), new Item.Properties().fireResistant().attributes(MythicEffectsShovelItem.createAttributes(MUToolMaterials.SAPPHIRE, 2, -2.9f)), noToolEffects, "sapphire_tool.description", ChatFormatting.DARK_BLUE);
    public static final SapphirePickaxeItem SAPPHIRE_PICKAXE = new SapphirePickaxeItem(CONFIG.sapphireConfig.tools_percentage_damage_percent(), new Item.Properties().fireResistant().attributes(MythicEffectsPickaxeItem.createAttributes(MUToolMaterials.SAPPHIRE, 1, -2.7f)), noToolEffects, "sapphire_tool.description", ChatFormatting.DARK_BLUE);
    public static final SapphireAxeItem SAPPHIRE_AXE = new SapphireAxeItem(CONFIG.sapphireConfig.tools_percentage_damage_percent(), new Item.Properties().fireResistant().attributes(MythicEffectsAxeItem.createAttributes(MUToolMaterials.SAPPHIRE, 5, -2.9f)), noToolEffects, "sapphire_tool.description", ChatFormatting.DARK_BLUE);
    public static final SapphireSwordItem SAPPHIRE_SWORD = new SapphireSwordItem(CONFIG.sapphireConfig.tools_percentage_damage_percent(), new Item.Properties().fireResistant().attributes(MythicEffectsSwordItem.createAttributes(MUToolMaterials.SAPPHIRE, 3, -2.3f)), noToolEffects, "sapphire_tool.description", ChatFormatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(50)), sapphireArmorEffects, "sapphire_armor.description", sapphireAmplifiers, ChatFormatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(50)), sapphireArmorEffects, "sapphire_armor.description", sapphireAmplifiers, ChatFormatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), sapphireArmorEffects, "sapphire_armor.description", sapphireAmplifiers, ChatFormatting.DARK_BLUE);
    public static final MythicEffectsArmorItem SAPPHIRE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), sapphireArmorEffects, "sapphire_armor.description", sapphireAmplifiers, ChatFormatting.DARK_BLUE);

    public static final Item TOPAZ_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.TOPAZ, new Item.Properties().fireResistant().attributes(MythicEffectsShovelItem.createAttributes(MUToolMaterials.TOPAZ, 2, -2.9f)), noToolEffects, "topaz_tool.description", ChatFormatting.GOLD);
    public static final Item TOPAZ_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.TOPAZ, new Item.Properties().fireResistant().attributes(MythicEffectsPickaxeItem.createAttributes(MUToolMaterials.TOPAZ, 1, -2.7f)), noToolEffects, "topaz_tool.description", ChatFormatting.GOLD);
    public static final Item TOPAZ_AXE = new MythicEffectsAxeItem(MUToolMaterials.TOPAZ, new Item.Properties().fireResistant().attributes(MythicEffectsAxeItem.createAttributes(MUToolMaterials.TOPAZ, 5, -2.9f)), noToolEffects, "topaz_tool.description", ChatFormatting.GOLD);
    public static final Item TOPAZ_HOE = new MythicEffectsHoeItem(MUToolMaterials.TOPAZ, new Item.Properties().fireResistant().attributes(MythicEffectsHoeItem.createAttributes(MUToolMaterials.TOPAZ, -4, 0.1f)), noToolEffects, "topaz_tool.description", ChatFormatting.GOLD);
    public static final Item TOPAZ_SWORD = new TopazSwordItem(new Item.Properties().fireResistant().attributes(MythicEffectsSwordItem.createAttributes(MUToolMaterials.TOPAZ, 3, -2.3f)), noToolEffects, "topaz_tool.description", ChatFormatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(50)), topazArmorEffects, "topaz_armor.description", topazAmplifiers, ChatFormatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(50)), topazArmorEffects, "topaz_armor.description", topazAmplifiers, ChatFormatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), topazArmorEffects, "topaz_armor.description", topazAmplifiers, ChatFormatting.GOLD);
    public static final MythicEffectsArmorItem TOPAZ_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), topazArmorEffects, "topaz_armor.description", topazAmplifiers, ChatFormatting.GOLD);

    public static final MythicEffectsHoeItem AMETRINE_HOE = new MythicEffectsHoeItem(MUToolMaterials.AMETRINE, new Item.Properties().fireResistant().attributes(MythicEffectsHoeItem.createAttributes(MUToolMaterials.AMETRINE, -4, 0.1f)), levitationToolEffects, "ametrine_tool.description", ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsShovelItem AMETRINE_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.AMETRINE, new Item.Properties().fireResistant().attributes(MythicEffectsShovelItem.createAttributes(MUToolMaterials.AMETRINE, 2, -2.9f)), levitationToolEffects, "ametrine_tool.description", ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsPickaxeItem AMETRINE_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.AMETRINE, new Item.Properties().fireResistant().attributes(MythicEffectsPickaxeItem.createAttributes(MUToolMaterials.AMETRINE, 1, -2.7f)), levitationToolEffects, "ametrine_tool.description", ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsAxeItem AMETRINE_AXE = new MythicEffectsAxeItem(MUToolMaterials.AMETRINE, new Item.Properties().fireResistant().attributes(MythicEffectsAxeItem.createAttributes(MUToolMaterials.AMETRINE, 5, -2.9f)), levitationToolEffects, "ametrine_tool.description", ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsSwordItem AMETRINE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.AMETRINE, new Item.Properties().fireResistant().attributes(MythicEffectsSwordItem.createAttributes(MUToolMaterials.AMETRINE, 3, -2.3f)), levitationToolEffects, "ametrine_tool.description", ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(50)), ametrineArmorEffects, "ametrine_armor.description", ametrineAmplifiers, ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(50)), ametrineArmorEffects, "ametrine_armor.description", ametrineAmplifiers, ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), ametrineArmorEffects, "ametrine_armor.description", ametrineAmplifiers, ChatFormatting.DARK_PURPLE);
    public static final MythicEffectsArmorItem AMETRINE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.AMETRINE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), ametrineArmorEffects, "ametrine_armor.description", ametrineAmplifiers, ChatFormatting.DARK_PURPLE);

    public static final MythicEffectsShovelItem JADE_SHOVEL = new MythicEffectsShovelItem(MUToolMaterials.JADE, new Item.Properties().fireResistant().attributes(MythicEffectsShovelItem.createAttributes(MUToolMaterials.JADE, 2, -2.9f)), bouncerToolEffect, "jade_tool.description", ChatFormatting.DARK_GREEN);
    public static final MythicEffectsPickaxeItem JADE_PICKAXE = new MythicEffectsPickaxeItem(MUToolMaterials.JADE, new Item.Properties().fireResistant().attributes(MythicEffectsPickaxeItem.createAttributes(MUToolMaterials.JADE, 1, -2.7f)), bouncerToolEffect, "jade_tool.description", ChatFormatting.DARK_GREEN);
    public static final MythicEffectsHoeItem JADE_HOE = new MythicEffectsHoeItem(MUToolMaterials.JADE, new Item.Properties().fireResistant().attributes(MythicEffectsHoeItem.createAttributes(MUToolMaterials.JADE, -4, 0.1f)), bouncerToolEffect, "jade_tool.description", ChatFormatting.DARK_GREEN);
    public static final MythicEffectsAxeItem JADE_AXE = new MythicEffectsAxeItem(MUToolMaterials.JADE, new Item.Properties().fireResistant().attributes(MythicEffectsAxeItem.createAttributes(MUToolMaterials.JADE, 5, -2.9f)), noToolEffects, "jade_tool.description", ChatFormatting.DARK_GREEN);
    public static final MythicEffectsSwordItem JADE_SWORD = new MythicEffectsSwordItem(MUToolMaterials.JADE, new Item.Properties().fireResistant().attributes(MythicEffectsSwordItem.createAttributes(MUToolMaterials.JADE, 3, -2.3f)), noToolEffects, "jade_tool.description", ChatFormatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_HELMET = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(50)), jadeArmorEffects, "jade_armor.description", jadeAmplifiers, ChatFormatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_CHESTPLATE = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(50)), jadeArmorEffects, "jade_armor.description", jadeAmplifiers, ChatFormatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_LEGGINGS = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), jadeArmorEffects, "jade_armor.description", jadeAmplifiers, ChatFormatting.DARK_GREEN);
    public static final MythicEffectsArmorItem JADE_BOOTS = new MythicEffectsArmorItem(MUArmorMaterials.JADE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50)), jadeArmorEffects, "jade_armor.description", jadeAmplifiers, ChatFormatting.DARK_GREEN);

    public static final Item AQUAMARINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createAquamarineUpgrade();
    public static final Item PERIDOT_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createPeridotUpgrade();
    public static final Item RUBY_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createRubyUpgrade();
    public static final Item SAPPHIRE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createSapphireUpgrade();
    public static final Item TOPAZ_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createTopazUpgrade();
    public static final Item AMETRINE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createAmetrineUpgrade();
    public static final Item JADE_UPGRADE_SMITHING_TEMPLATE = MUTemplateItem.createJadeUpgrade();
}