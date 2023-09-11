package net.trique.mythicupgrades.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.block.MythicBlocks;
import net.trique.mythicupgrades.effect.MythicEffects;
import net.trique.mythicupgrades.item.*;
import net.trique.mythicupgrades.sound.MythicSounds;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.ItemEffectsListBuilder;

public class RegisterMythicItems {
    

    private static final ItemEffectsList sapphireArmourEffects = new ItemEffectsListBuilder().addForEquipment(MythicEffects.THORNS, 4).build();
    private static final ItemEffectsList ametrineArmourEffects = new ItemEffectsListBuilder().addForEquipment(StatusEffects.SPEED, 1).addForEquipment(StatusEffects.JUMP_BOOST, 1).build();
    private static final ItemEffectsList topazArmourEffects = new ItemEffectsListBuilder().addForEquipment(StatusEffects.FIRE_RESISTANCE, 0).build();

    private static final ItemEffectsList sapphireItemEffects = new ItemEffectsList();
    private static final ItemEffectsList rubyItemEffects = new ItemEffectsList();
    private static final ItemEffectsList jadeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, 40, 3).build();
    private static final ItemEffectsList topazItemEffects = new ItemEffectsList();
    private static final ItemEffectsList ametrineItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, 10, 4).build();
    private static final ItemEffectsList aquamarineItemEffects = new ItemEffectsListBuilder().addForHit(MythicEffects.FREEZE, 20, 0).build();
    private static final ItemEffectsList freezeAxeItemEffects = new ItemEffectsListBuilder().addForHit(MythicEffects.FREEZE, 20, 0).build();

    private static final ItemEffectsList freezeSwordItemEffects = new ItemEffectsListBuilder().addForHit(MythicEffects.FREEZE, 20, 0).build();
    private static final ItemEffectsList levitationAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, 10, 4).build();
    private static final ItemEffectsList levitationSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.LEVITATION, 10, 4).build();
    private static final ItemEffectsList poisonSwordItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, 40, 3).build();
    private static final ItemEffectsList poisonAxeItemEffects = new ItemEffectsListBuilder().addForHit(StatusEffects.POISON, 40, 3).build();
    private static final ItemEffectsList hasteAxeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, 0).build();
    private static final ItemEffectsList hastePickaxeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, 0).build();
    private static final ItemEffectsList hasteHoeItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, 0).build();
    private static final ItemEffectsList hasteShovelItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, 0).build();
    private static final ItemEffectsList hasteSwordItemEffects = new ItemEffectsListBuilder().addForMainHand(StatusEffects.HASTE, StatusEffectInstance.INFINITE, 0).build();

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
            new MythicEffectsAxeItem(MythicToolMaterials.SAPPHIRE, 5.0f, -3.0f,
                    (new FabricItemSettings().fireproof()), freezeAxeItemEffects));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new MythicEffectsSwordItem(MythicToolMaterials.SAPPHIRE, 3, -2.4f,
                    (new FabricItemSettings().fireproof()), freezeSwordItemEffects));
    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new MythicEffectsArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET,
                    new FabricItemSettings().fireproof(), sapphireArmourEffects));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new MythicEffectsArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings().fireproof(), sapphireArmourEffects));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new MythicEffectsArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings().fireproof(), sapphireArmourEffects));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new MythicEffectsArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS,
                    new FabricItemSettings().fireproof(), sapphireArmourEffects));
    public static final Item SAPPHIRE = registerItem("sapphire",
            new MythicGemItem("sapphire.description", sapphireItemEffects, new FabricItemSettings()));
    public static final Item SAPPHIRE_INGOT = registerItem("sapphire_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new MythicEffectsShovelItem(MythicToolMaterials.RUBY, 1.5f, -2.2f,
                    (new FabricItemSettings().fireproof()), hasteShovelItemEffects));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new MythicEffectsPickaxeItem(MythicToolMaterials.RUBY, 1, -2.2f,
                    (new FabricItemSettings().fireproof()), hastePickaxeItemEffects));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new MythicEffectsAxeItem(MythicToolMaterials.RUBY, 5.0f, -2.5f,
                    (new FabricItemSettings().fireproof()), hasteAxeItemEffects));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new MythicEffectsHoeItem(MythicToolMaterials.RUBY, -4, 0.6f,
                    (new FabricItemSettings().fireproof()), hasteHoeItemEffects));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new MythicEffectsSwordItem(MythicToolMaterials.RUBY, 3, -1.6f,
                    (new FabricItemSettings().fireproof()), hasteSwordItemEffects));
    public static final Item RUBY = registerItem("ruby",
            new MythicGemItem("ruby.description", rubyItemEffects, new FabricItemSettings()));
    public static final Item RUBY_INGOT = registerItem("ruby_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item JADE_AXE = registerItem("jade_axe",
            new MythicEffectsAxeItem(MythicToolMaterials.JADE, 7, -3.0f,
                    (new FabricItemSettings().fireproof()), poisonAxeItemEffects));
    public static final Item JADE_SWORD = registerItem("jade_sword",
            new MythicEffectsSwordItem(MythicToolMaterials.JADE, 3, -2.4f,
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
            new ShovelItem(MythicToolMaterials.TOPAZ, 1.5f, -3.0f, (new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe",
            new PickaxeItem(MythicToolMaterials.TOPAZ, 1, -2.8f, (new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_AXE = registerItem("topaz_axe",
            new AxeItem(MythicToolMaterials.TOPAZ, 5.0f, -3f, (new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_HOE = registerItem("topaz_hoe",
            new HoeItem(MythicToolMaterials.TOPAZ, -4, 0.0f, (new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_SWORD = registerItem("topaz_sword",
            new SwordItem(MythicToolMaterials.TOPAZ, 3, -2.4f, (new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_HELMET = registerItem("topaz_helmet",
            new MythicEffectsArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.HELMET,
                    new FabricItemSettings().fireproof(), topazArmourEffects));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate",
            new MythicEffectsArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings().fireproof(), topazArmourEffects));
    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings",
            new MythicEffectsArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings().fireproof(), topazArmourEffects));
    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots",
            new MythicEffectsArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS,
                    new FabricItemSettings().fireproof(), topazArmourEffects));
    public static final Item TOPAZ = registerItem("topaz",
            new MythicGemItem("topaz.description", topazItemEffects, new FabricItemSettings()));
    public static final Item TOPAZ_INGOT = registerItem("topaz_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item AMETRINE_AXE = registerItem("ametrine_axe",
            new MythicEffectsAxeItem(MythicToolMaterials.AMETRINE, 5, -3.0f,
                    (new FabricItemSettings().fireproof()), levitationAxeItemEffects));
    public static final Item AMETRINE_SWORD = registerItem("ametrine_sword",
            new MythicEffectsSwordItem(MythicToolMaterials.AMETRINE, 3, -2.4f,
                    (new FabricItemSettings().fireproof()), levitationSwordItemEffects));
    public static final Item AMETRINE_HELMET = registerItem("ametrine_helmet",
            new MythicEffectsArmorItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.HELMET,
                    new FabricItemSettings().fireproof(), ametrineArmourEffects));
    public static final Item AMETRINE_CHESTPLATE = registerItem("ametrine_chestplate",
            new MythicEffectsArmorItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings().fireproof(), ametrineArmourEffects));
    public static final Item AMETRINE_LEGGINGS = registerItem("ametrine_leggings",
            new MythicEffectsArmorItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings().fireproof(), ametrineArmourEffects));
    public static final Item AMETRINE_BOOTS = registerItem("ametrine_boots",
            new MythicEffectsArmorItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.BOOTS,
                    new FabricItemSettings().fireproof(), ametrineArmourEffects));
    public static final Item AMETRINE = registerItem("ametrine",
            new MythicGemItem("ametrine.description", ametrineItemEffects, new FabricItemSettings()));
    public static final Item AMETRINE_INGOT = registerItem("ametrine_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item AQUAMARINE_AXE = registerItem("aquamarine_axe",
            new MythicEffectsAxeItem(MythicToolMaterials.AQUAMARINE, 5, -3.3f,
                    (new FabricItemSettings().fireproof()), freezeAxeItemEffects));
    public static final Item AQUAMARINE_SWORD = registerItem("aquamarine_sword",
            new MythicEffectsSwordItem(MythicToolMaterials.AQUAMARINE, 3, -2.7f,
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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MythicUpgrades.MOD_ID, name), item);
    }

    private static void registerMythicItemGroup() {
        ItemGroup MYTHICITEMGROUP = FabricItemGroup.builder().displayName(Text.literal("Mythic Upgrades"))
                        .icon(() -> new ItemStack(RegisterMythicItems.AMETRINE_SWORD)).entries((displayContext, entries) -> {

                            entries.add(RegisterMythicItems.BROKEN_JADE_DISC);
                            entries.add(RegisterMythicItems.MUSIC_DISC_NELUMBO);

                            entries.add(RegisterMythicItems.BROKEN_TOPAZ_DISC);
                            entries.add(RegisterMythicItems.MUSIC_DISC_FIERCE);

                            entries.add(RegisterMythicItems.BROKEN_AQUAMARINE_DISC);
                            entries.add(RegisterMythicItems.MUSIC_DISC_FLOW_OF_THE_ABYSS);

                            entries.add(RegisterMythicItems.BROKEN_SAPPHIRE_DISC);
                            entries.add(RegisterMythicItems.MUSIC_DISC_SOOT);

                            entries.add(RegisterMythicItems.BROKEN_RUBY_DISC);
                            entries.add(RegisterMythicItems.MUSIC_DISC_TANKER_ON_THE_LEVANTINES);

                            entries.add(RegisterMythicItems.BROKEN_AMETRINE_DISC);
                            entries.add(RegisterMythicItems.MUSIC_DISC_APPOMATTOX);

                            entries.add(RegisterMythicItems.JADE_UPGRADE_SMITHING_TEMPLATE);
                            entries.add(RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE);
                            entries.add(RegisterMythicItems.AQUAMARINE_UPGRADE_SMITHING_TEMPLATE);
                            entries.add(RegisterMythicItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);
                            entries.add(RegisterMythicItems.RUBY_UPGRADE_SMITHING_TEMPLATE);
                            entries.add(RegisterMythicItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE);

                            entries.add(MythicBlocks.JADE_BLOCK);
                            entries.add(MythicBlocks.JADE_RUINS);
                            entries.add(MythicBlocks.JADE_ORE);
                            entries.add(MythicBlocks.DEEPSLATE_JADE_ORE);
                            entries.add(RegisterMythicItems.JADE_AXE);
                            entries.add(RegisterMythicItems.JADE_SWORD);
                            entries.add(RegisterMythicItems.JADE_HELMET);
                            entries.add(RegisterMythicItems.JADE_CHESTPLATE);
                            entries.add(RegisterMythicItems.JADE_LEGGINGS);
                            entries.add(RegisterMythicItems.JADE_BOOTS);
                            entries.add(RegisterMythicItems.JADE);
                            entries.add(RegisterMythicItems.JADE_INGOT);

                            entries.add(MythicBlocks.TOPAZ_BLOCK);
                            entries.add(MythicBlocks.TOPAZ_RUINS);
                            entries.add(MythicBlocks.TOPAZ_ORE);
                            entries.add(MythicBlocks.DEEPSLATE_TOPAZ_ORE);
                            entries.add(RegisterMythicItems.TOPAZ_SHOVEL);
                            entries.add(RegisterMythicItems.TOPAZ_PICKAXE);
                            entries.add(RegisterMythicItems.TOPAZ_AXE);
                            entries.add(RegisterMythicItems.TOPAZ_HOE);
                            entries.add(RegisterMythicItems.TOPAZ_SWORD);
                            entries.add(RegisterMythicItems.TOPAZ_HELMET);
                            entries.add(RegisterMythicItems.TOPAZ_CHESTPLATE);
                            entries.add(RegisterMythicItems.TOPAZ_LEGGINGS);
                            entries.add(RegisterMythicItems.TOPAZ_BOOTS);
                            entries.add(RegisterMythicItems.TOPAZ);
                            entries.add(RegisterMythicItems.TOPAZ_INGOT);

                            entries.add(MythicBlocks.AQUAMARINE_BLOCK);
                            entries.add(MythicBlocks.AQUAMARINE_RUINS);
                            entries.add(MythicBlocks.AQUAMARINE_ORE);
                            entries.add(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE);
                            entries.add(RegisterMythicItems.AQUAMARINE_AXE);
                            entries.add(RegisterMythicItems.AQUAMARINE_SWORD);
                            entries.add(RegisterMythicItems.AQUAMARINE);
                            entries.add(RegisterMythicItems.AQUAMARINE_INGOT);

                            entries.add(MythicBlocks.SAPPHIRE_BLOCK);
                            entries.add(MythicBlocks.SAPPHIRE_RUINS);
                            entries.add(MythicBlocks.SAPPHIRE_ORE);
                            entries.add(RegisterMythicItems.SAPPHIRE_AXE);
                            entries.add(RegisterMythicItems.SAPPHIRE_SWORD);
                            entries.add(RegisterMythicItems.SAPPHIRE_HELMET);
                            entries.add(RegisterMythicItems.SAPPHIRE_CHESTPLATE);
                            entries.add(RegisterMythicItems.SAPPHIRE_LEGGINGS);
                            entries.add(RegisterMythicItems.SAPPHIRE_BOOTS);
                            entries.add(RegisterMythicItems.SAPPHIRE);
                            entries.add(RegisterMythicItems.SAPPHIRE_INGOT);

                            entries.add(MythicBlocks.RUBY_BLOCK);
                            entries.add(MythicBlocks.RUBY_RUINS);
                            entries.add(MythicBlocks.RUBY_ORE);
                            entries.add(RegisterMythicItems.RUBY_SHOVEL);
                            entries.add(RegisterMythicItems.RUBY_PICKAXE);
                            entries.add(RegisterMythicItems.RUBY_AXE);
                            entries.add(RegisterMythicItems.RUBY_HOE);
                            entries.add(RegisterMythicItems.RUBY_SWORD);
                            entries.add(RegisterMythicItems.RUBY);
                            entries.add(RegisterMythicItems.RUBY_INGOT);

                            entries.add(MythicBlocks.AMETRINE_BLOCK);
                            entries.add(MythicBlocks.AMETRINE_RUINS);
                            entries.add(MythicBlocks.AMETRINE_ORE);
                            entries.add(RegisterMythicItems.AMETRINE_AXE);
                            entries.add(RegisterMythicItems.AMETRINE_SWORD);
                            entries.add(RegisterMythicItems.AMETRINE_HELMET);
                            entries.add(RegisterMythicItems.AMETRINE_CHESTPLATE);
                            entries.add(RegisterMythicItems.AMETRINE_LEGGINGS);
                            entries.add(RegisterMythicItems.AMETRINE_BOOTS);
                            entries.add(RegisterMythicItems.AMETRINE);
                            entries.add(RegisterMythicItems.AMETRINE_INGOT);

                        }).build();
        Registry.register(Registries.ITEM_GROUP, new Identifier(MythicUpgrades.MOD_ID, "mythicitemgroup"), MYTHICITEMGROUP);
    }

    public static void registerMythicItems() {
        registerMythicItemGroup();
        MythicUpgrades.LOGGER.info("Registering Mythic Items for " + MythicUpgrades.MOD_ID);
    }
}