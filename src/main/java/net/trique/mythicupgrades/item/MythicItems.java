package net.trique.mythicupgrades.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.item.custom.*;
import net.trique.mythicupgrades.sound.MythicSounds;

import static net.minecraft.item.Items.register;

public class MythicItems {
    public static final Item BROKEN_SAPPHIRE_DISC = registerItem("broken_sapphire_disc",
            new BrokenSapphireDiscItem(new FabricItemSettings().maxCount(16)));
    public static final Item BROKEN_RUBY_DISC = registerItem("broken_ruby_disc",
            new BrokenRubyDiscItem(new FabricItemSettings().maxCount(16)));
    public static final Item BROKEN_JADE_DISC = registerItem("broken_jade_disc",
            new BrokenJadeDiscItem(new FabricItemSettings().maxCount(16)));
    public static final Item BROKEN_TOPAZ_DISC = registerItem("broken_topaz_disc",
            new BrokenTopazDiscItem(new FabricItemSettings().maxCount(16)));
    public static final Item BROKEN_AMETRINE_DISC = registerItem("broken_ametrine_disc",
            new BrokenAmetrineDiscItem(new FabricItemSettings().maxCount(16)));
    public static final Item BROKEN_AQUAMARINE_DISC = registerItem("broken_aquamarine_disc",
            new BrokenAquamarineDiscItem(new FabricItemSettings().maxCount(16)));

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
            new AxeItem(MythicToolMaterials.SAPPHIRE, 5.0f, -3.0f,(new FabricItemSettings().fireproof())));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new SwordItem(MythicToolMaterials.SAPPHIRE, 3, -2.4f,(new FabricItemSettings().fireproof())));
    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new ThornsArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new ArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new ArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new ArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE = registerItem("sapphire",
            new SapphireItem(new FabricItemSettings()));
    public static final Item SAPPHIRE_INGOT = registerItem("sapphire_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(MythicToolMaterials.RUBY, 1.5f, -2.2f,(new FabricItemSettings().fireproof())));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(MythicToolMaterials.RUBY, 1, -2.2f,(new FabricItemSettings().fireproof())));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(MythicToolMaterials.RUBY, 5.0f, -2.5f,(new FabricItemSettings().fireproof())));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(MythicToolMaterials.RUBY, -4, 0.6f,(new FabricItemSettings().fireproof())));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(MythicToolMaterials.RUBY, 3, -1.6f,(new FabricItemSettings().fireproof())));
    public static final Item RUBY = registerItem("ruby",
            new RubyItem(new FabricItemSettings()));
    public static final Item RUBY_INGOT = registerItem("ruby_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item JADE_AXE = registerItem("jade_axe",
            new PoisonAxeItem(MythicToolMaterials.JADE, 7, -3.0f,(new FabricItemSettings().fireproof())));
    public static final Item JADE_SWORD = registerItem("jade_sword",
            new PoisonSwordItem(MythicToolMaterials.JADE, 3, -2.4f,(new FabricItemSettings().fireproof())));
    public static final Item JADE_HELMET = registerItem("jade_helmet",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item JADE_CHESTPLATE = registerItem("jade_chestplate",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item JADE_LEGGINGS = registerItem("jade_leggings",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item JADE_BOOTS = registerItem("jade_boots",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item JADE = registerItem("jade",
            new JadeItem(new FabricItemSettings()));
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
            new ArmorEffectItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), StatusEffects.FIRE_RESISTANCE));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate",
            new ArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings",
            new ArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots",
            new ArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ = registerItem("topaz",
            new TopazItem(new FabricItemSettings()));
    public static final Item TOPAZ_INGOT = registerItem("topaz_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item AMETRINE_AXE = registerItem("ametrine_axe",
            new LevitationAxeItem(MythicToolMaterials.AMETRINE, 5, -3.0f,(new FabricItemSettings().fireproof())));
    public static final Item AMETRINE_SWORD = registerItem("ametrine_sword",
            new LevitationSwordItem(MythicToolMaterials.AMETRINE, 3, -2.4f,(new FabricItemSettings().fireproof())));
    public static final Item AMETRINE_HELMET = registerItem("ametrine_helmet",
            new PowerfulArmorEffectItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), StatusEffects.SPEED));
    public static final Item AMETRINE_CHESTPLATE = registerItem("ametrine_chestplate",
            new PowerfulArmorEffectItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), StatusEffects.JUMP_BOOST));
    public static final Item AMETRINE_LEGGINGS = registerItem("ametrine_leggings",
            new ArmorItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item AMETRINE_BOOTS = registerItem("ametrine_boots",
            new ArmorItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item AMETRINE = registerItem("ametrine",
            new AmetrineItem(new FabricItemSettings()));
    public static final Item AMETRINE_INGOT = registerItem("ametrine_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item AQUAMARINE_AXE = registerItem("aquamarine_axe",
            new FreezeAxeItem(MythicToolMaterials.AQUAMARINE, 5, -3.3f,(new FabricItemSettings().fireproof())));
    public static final Item AQUAMARINE_SWORD = registerItem("aquamarine_sword",
            new FreezeSwordItem(MythicToolMaterials.AQUAMARINE, 3, -2.7f,(new FabricItemSettings().fireproof())));
    public static final Item AQUAMARINE = registerItem("aquamarine",
            new AquamarineItem(new FabricItemSettings()));
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

    public static void registerMythicItems() {
        MythicUpgrades.LOGGER.info("Registering Mythic Items for " + MythicUpgrades.MOD_ID);
    }
}