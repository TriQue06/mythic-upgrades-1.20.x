package net.trique.mythicupgrades.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.item.custom.*;
import net.trique.mythicupgrades.sound.MythicSounds;
import net.trique.mythicupgrades.effect.MythicEffects;
import net.trique.mythicupgrades.util.EffectMeta;

import java.util.HashMap;

public class MythicItems {

    private static final HashMap<StatusEffect, Integer> sapphireArmourEffects = new HashMap<>();
    private static final HashMap<StatusEffect, Integer> ametrineArmourEffects = new HashMap<>();
    private static final HashMap<StatusEffect, Integer> topazArmourEffects = new HashMap<>();

    private static final HashMap<StatusEffect, EffectMeta> sapphireItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> rubyItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> jadeItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> topazItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> ametrineItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> aquamarineItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> freezeAxeItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> freezeSwordItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> levitationAxeItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> levitationSwordItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> poisonSwordItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> poisonAxeItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> hasteAxeItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> hastePickaxeItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> hasteHoeItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> hasteShovelItemEffects = new HashMap<>();
    private static final HashMap<StatusEffect, EffectMeta> hasteSwordItemEffects = new HashMap<>();

    public static final Item BROKEN_SAPPHIRE_DISC = registerItem("broken_sapphire_disc",
            new BrokenDiscItem("sapphiredisc.description", new FabricItemSettings().maxCount(16)));
    public static final Item BROKEN_RUBY_DISC = registerItem("broken_ruby_disc",
            new BrokenDiscItem("rubydisc.description", new FabricItemSettings().maxCount(16)));
    public static final Item BROKEN_JADE_DISC = registerItem("broken_jade_disc",
            new BrokenDiscItem("jade.description", new FabricItemSettings().maxCount(16)));
    public static final Item BROKEN_TOPAZ_DISC = registerItem("broken_topaz_disc",
            new BrokenDiscItem("topazdisc.description", new FabricItemSettings().maxCount(16)));
    public static final Item BROKEN_AMETRINE_DISC = registerItem("broken_ametrine_disc",
            new BrokenDiscItem("ametrinedisc.description", new FabricItemSettings().maxCount(16)));
    public static final Item BROKEN_AQUAMARINE_DISC = registerItem("broken_aquamarine_disc",
            new BrokenDiscItem("aquamarinedisc.description", new FabricItemSettings().maxCount(16)));

    public static final Item MUSIC_DISC_SOOT = registerItem("music_disc_soot",
            new MusicDiscItem(15, MythicSounds.SOOT, new FabricItemSettings().maxCount(1), 299));
    public static final Item MUSIC_DISC_APPOMATTOX = registerItem("music_disc_appomattox",
            new MusicDiscItem(14, MythicSounds.APPOMATTOX, new FabricItemSettings().maxCount(1), 724));
    public static final Item MUSIC_DISC_FIERCE = registerItem("music_disc_fierce",
            new MusicDiscItem(14, MythicSounds.FIERCE, new FabricItemSettings().maxCount(1), 129));
    public static final Item MUSIC_DISC_NELUMBO = registerItem("music_disc_nelumbo",
            new MusicDiscItem(14, MythicSounds.NELUMBO, new FabricItemSettings().maxCount(1), 118));
    public static final Item MUSIC_DISC_FLOW_OF_THE_ABYSS = registerItem("music_disc_flow_of_the_abyss",
            new MusicDiscItem(14, MythicSounds.FLOW_OF_THE_ABYSS, new FabricItemSettings().maxCount(1), 125));
    public static final Item MUSIC_DISC_TANKER_ON_THE_LEVANTINES = registerItem("music_disc_tanker_on_the_levantines",
            new MusicDiscItem(14, MythicSounds.TANKER_ON_THE_LEVANTINES, new FabricItemSettings().maxCount(1), 201));
    
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new MythicEffectAxeItem(MythicToolMaterials.SAPPHIRE, 5.0f, -3.0f,
                    (new FabricItemSettings().fireproof()), freezeAxeItemEffects));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new MythicEffectSwordItem(MythicToolMaterials.SAPPHIRE, 3, -2.4f,
                    (new FabricItemSettings().fireproof()), freezeSwordItemEffects));
    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new ArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new MythicArmorEffectItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(),
                    sapphireArmourEffects, false, false, false));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new ArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new ArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE = registerItem("sapphire",
            new MythicGemItem("sapphire.description", sapphireItemEffects, new FabricItemSettings()));
    public static final Item SAPPHIRE_INGOT = registerItem("sapphire_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new MythicEffectShovelItem(MythicToolMaterials.RUBY, 1.5f, -2.2f,
                    (new FabricItemSettings().fireproof()), hasteShovelItemEffects));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new MythicEffectPickaxeItem(MythicToolMaterials.RUBY, 1, -2.2f,
                    (new FabricItemSettings().fireproof()), hastePickaxeItemEffects));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new MythicEffectAxeItem(MythicToolMaterials.RUBY, 5.0f, -2.5f,
                    (new FabricItemSettings().fireproof()), hasteAxeItemEffects));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new MythicEffectHoeItem(MythicToolMaterials.RUBY, -4, 0.6f,
                    (new FabricItemSettings().fireproof()), hasteHoeItemEffects));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new MythicEffectSwordItem(MythicToolMaterials.RUBY, 3, -1.6f,
                    (new FabricItemSettings().fireproof()), hasteSwordItemEffects));
    public static final Item RUBY = registerItem("ruby",
            new MythicGemItem("ruby.description", rubyItemEffects, new FabricItemSettings()));
    public static final Item RUBY_INGOT = registerItem("ruby_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item JADE_AXE = registerItem("jade_axe",
            new MythicEffectAxeItem(MythicToolMaterials.JADE, 7, -3.0f,
                    (new FabricItemSettings().fireproof()), poisonAxeItemEffects));
    public static final Item JADE_SWORD = registerItem("jade_sword",
            new MythicEffectSwordItem(MythicToolMaterials.JADE, 3, -2.4f,
                    (new FabricItemSettings().fireproof()), poisonSwordItemEffects));
    public static final Item JADE_HELMET = registerItem("jade_helmet",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item JADE_CHESTPLATE = registerItem("jade_chestplate",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item JADE_LEGGINGS = registerItem("jade_leggings",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item JADE_BOOTS = registerItem("jade_boots",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item JADE = registerItem("jade",
            new MythicGemItem("jade.description", jadeItemEffects, new FabricItemSettings()));
    public static final Item JADE_INGOT = registerItem("jade_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel",
            new ShovelItem(MythicToolMaterials.TOPAZ, 1.5f, -3.0f,(new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe",
            new PickaxeItem(MythicToolMaterials.TOPAZ, 1, -2.8f,(new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_AXE = registerItem("topaz_axe",
            new AxeItem(MythicToolMaterials.TOPAZ, 5.0f, -3f,(new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_HOE = registerItem("topaz_hoe",
            new HoeItem(MythicToolMaterials.TOPAZ, -4, 0.0f,(new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_SWORD = registerItem("topaz_sword",
            new SwordItem(MythicToolMaterials.TOPAZ, 3, -2.4f,(new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_HELMET = registerItem("topaz_helmet",
            new ArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate",
            new ArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings",
            new ArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots",
            new MythicArmorEffectItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(),
                    topazArmourEffects, false, false, false));
    public static final Item TOPAZ = registerItem("topaz",
            new MythicGemItem("topaz.description", topazItemEffects, new FabricItemSettings()));
    public static final Item TOPAZ_INGOT = registerItem("topaz_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item AMETRINE_AXE = registerItem("ametrine_axe",
            new MythicEffectAxeItem(MythicToolMaterials.AMETRINE, 5, -3.0f,
                    (new FabricItemSettings().fireproof()), levitationAxeItemEffects));
    public static final Item AMETRINE_SWORD = registerItem("ametrine_sword",
            new MythicEffectSwordItem(MythicToolMaterials.AMETRINE, 3, -2.4f,
                    (new FabricItemSettings().fireproof()), levitationSwordItemEffects));
    public static final Item AMETRINE_HELMET = registerItem("ametrine_helmet",
            new ArmorItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item AMETRINE_CHESTPLATE = registerItem("ametrine_chestplate",
            new ArmorItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item AMETRINE_LEGGINGS = registerItem("ametrine_leggings",
            new ArmorItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item AMETRINE_BOOTS = registerItem("ametrine_boots",
            new MythicArmorEffectItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof(),
                    ametrineArmourEffects, false, false, false));
    public static final Item AMETRINE = registerItem("ametrine",
            new MythicGemItem("ametrine.description", ametrineItemEffects, new FabricItemSettings()));
    public static final Item AMETRINE_INGOT = registerItem("ametrine_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item AQUAMARINE_AXE = registerItem("aquamarine_axe",
            new MythicEffectAxeItem(MythicToolMaterials.AQUAMARINE, 5, -3.3f,
                    (new FabricItemSettings().fireproof()), freezeAxeItemEffects));
    public static final Item AQUAMARINE_SWORD = registerItem("aquamarine_sword",
            new MythicEffectSwordItem(MythicToolMaterials.AQUAMARINE, 3, -2.7f,
                    (new FabricItemSettings().fireproof()), freezeSwordItemEffects));
    public static final Item AQUAMARINE = registerItem("aquamarine",
            new MythicGemItem("aquamarine.description", aquamarineItemEffects, new FabricItemSettings()));
    public static final Item AQUAMARINE_INGOT = registerItem("aquamarine_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item JADE_UPGRADE_SMITHING_TEMPLATE;
    static {
        JADE_UPGRADE_SMITHING_TEMPLATE = registerItem("jade_upgrade_smithing_template", MythicTemplateItem.createJadeUpgrade());
    }
    
    public static final Item TOPAZ_UPGRADE_SMITHING_TEMPLATE;
    static {
        TOPAZ_UPGRADE_SMITHING_TEMPLATE = registerItem("topaz_upgrade_smithing_template", MythicTemplateItem.createTopazUpgrade());
    }
    
    public static final Item AQUAMARINE_UPGRADE_SMITHING_TEMPLATE;
    static {
        AQUAMARINE_UPGRADE_SMITHING_TEMPLATE = registerItem("aquamarine_upgrade_smithing_template", MythicTemplateItem.createAquamarineUpgrade());
    }
    public static final Item SAPPHIRE_UPGRADE_SMITHING_TEMPLATE;
    static {
        SAPPHIRE_UPGRADE_SMITHING_TEMPLATE = registerItem("sapphire_upgrade_smithing_template", MythicTemplateItem.createSapphireUpgrade());
    }

    public static final Item RUBY_UPGRADE_SMITHING_TEMPLATE;
    static {
        RUBY_UPGRADE_SMITHING_TEMPLATE = registerItem("ruby_upgrade_smithing_template", MythicTemplateItem.createRubyUpgrade());
    }

    public static final Item AMETRINE_UPGRADE_SMITHING_TEMPLATE;
    static {
        AMETRINE_UPGRADE_SMITHING_TEMPLATE = registerItem("ametrine_upgrade_smithing_template", MythicTemplateItem.createAmetrineUpgrade());
    }

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MythicUpgrades.MOD_ID, name), item);
    }

    private static void createEffectsHashMaps() {
        ametrineArmourEffects.put(StatusEffects.SPEED, 1);
        ametrineArmourEffects.put(StatusEffects.JUMP_BOOST, 1);
        sapphireArmourEffects.put(MythicEffects.THORNS, 4);
        topazArmourEffects.put(StatusEffects.FIRE_RESISTANCE, 0);
        jadeItemEffects.put(StatusEffects.POISON, EffectMeta.nonPositive(30, 1));
        ametrineItemEffects.put(StatusEffects.LEVITATION,EffectMeta.nonPositive(8, 4));
        aquamarineItemEffects.put(MythicEffects.FREEZE, EffectMeta.nonPositive(5, 0));
        freezeAxeItemEffects.put(MythicEffects.FREEZE, EffectMeta.nonPositive(5, 0));
        freezeSwordItemEffects.put(MythicEffects.FREEZE, EffectMeta.nonPositive(5, 0));
        levitationAxeItemEffects.put(StatusEffects.LEVITATION, EffectMeta.nonPositive(8, 4));
        levitationSwordItemEffects.put(StatusEffects.LEVITATION, EffectMeta.nonPositive(8, 4));
        poisonAxeItemEffects.put(StatusEffects.POISON, EffectMeta.nonPositive(30, 1));
        poisonSwordItemEffects.put(StatusEffects.POISON, EffectMeta.nonPositive(30, 1));
        hasteAxeItemEffects.put(StatusEffects.HASTE, EffectMeta.positive(StatusEffectInstance.INFINITE, 0));
        hastePickaxeItemEffects.put(StatusEffects.HASTE, EffectMeta.positive(StatusEffectInstance.INFINITE, 0));
        hasteShovelItemEffects.put(StatusEffects.HASTE, EffectMeta.positive(StatusEffectInstance.INFINITE, 0));
        hasteHoeItemEffects.put(StatusEffects.HASTE, EffectMeta.positive(StatusEffectInstance.INFINITE, 0));
        hasteSwordItemEffects.put(StatusEffects.HASTE, EffectMeta.positive(StatusEffectInstance.INFINITE, 0));
    }

    public static void registerMythicItems() {
        createEffectsHashMaps();
        MythicUpgrades.LOGGER.info("Registering Mythic Items for " + MythicUpgrades.MOD_ID);
    }
}