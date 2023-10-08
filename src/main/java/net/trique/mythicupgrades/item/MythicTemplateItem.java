package net.trique.mythicupgrades.item;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class MythicTemplateItem extends SmithingTemplateItem {
    private static final Formatting TITLE_FORMATTING;
    private static final Formatting DESCRIPTION_FORMATTING;
    private static final String TRANSLATION_KEY;
    private static final Text INGREDIENTS_TEXT;
    private static final Text APPLIES_TO_TEXT;
    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE;
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE;
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE;
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE;
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE;
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE;
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE;
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE;
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE;
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE;
    private final Text baseSlotDescriptionText;
    private final Text additionsSlotDescriptionText;
    private final List<Identifier> emptyBaseSlotTextures;
    private final List<Identifier> emptyAdditionsSlotTextures;

    private static final Text JADE_UPGRADE_TEXT;
    private static final Text JADE_UPGRADE_APPLIES_TO_TEXT;
    private static final Text JADE_UPGRADE_INGREDIENTS_TEXT;
    private static final Text JADE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Text JADE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Text TOPAZ_UPGRADE_TEXT;
    private static final Text TOPAZ_UPGRADE_APPLIES_TO_TEXT;
    private static final Text TOPAZ_UPGRADE_INGREDIENTS_TEXT;
    private static final Text TOPAZ_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Text TOPAZ_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Text AQUAMARINE_UPGRADE_TEXT;
    private static final Text AQUAMARINE_UPGRADE_APPLIES_TO_TEXT;
    private static final Text AQUAMARINE_UPGRADE_INGREDIENTS_TEXT;
    private static final Text AQUAMARINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Text AQUAMARINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Text SAPPHIRE_UPGRADE_TEXT;
    private static final Text SAPPHIRE_UPGRADE_APPLIES_TO_TEXT;
    private static final Text SAPPHIRE_UPGRADE_INGREDIENTS_TEXT;
    private static final Text SAPPHIRE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Text SAPPHIRE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Text RUBY_UPGRADE_TEXT;
    private static final Text RUBY_UPGRADE_APPLIES_TO_TEXT;
    private static final Text RUBY_UPGRADE_INGREDIENTS_TEXT;
    private static final Text RUBY_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Text RUBY_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Text AMETRINE_UPGRADE_TEXT;
    private static final Text AMETRINE_UPGRADE_APPLIES_TO_TEXT;
    private static final Text AMETRINE_UPGRADE_INGREDIENTS_TEXT;
    private static final Text AMETRINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Text AMETRINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;

    public MythicTemplateItem(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures) {
        super(appliesToText, ingredientsText, titleText, baseSlotDescriptionText, additionsSlotDescriptionText, emptyBaseSlotTextures, emptyAdditionsSlotTextures);
        this.baseSlotDescriptionText = baseSlotDescriptionText;
        this.additionsSlotDescriptionText = additionsSlotDescriptionText;
        this.emptyBaseSlotTextures = emptyBaseSlotTextures;
        this.emptyAdditionsSlotTextures = emptyAdditionsSlotTextures;
    }

    public static MythicTemplateItem createJadeUpgrade() {
        return new MythicTemplateItem(JADE_UPGRADE_APPLIES_TO_TEXT, JADE_UPGRADE_INGREDIENTS_TEXT, JADE_UPGRADE_TEXT, JADE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, JADE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getJadeUpgradeEmptyBaseSlotTextures(), getJadeUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getJadeUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }

    private static List<Identifier> getJadeUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static MythicTemplateItem createTopazUpgrade() {
        return new MythicTemplateItem(TOPAZ_UPGRADE_APPLIES_TO_TEXT, TOPAZ_UPGRADE_INGREDIENTS_TEXT, TOPAZ_UPGRADE_TEXT, TOPAZ_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, TOPAZ_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getTopazUpgradeEmptyBaseSlotTextures(), getTopazUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getTopazUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    private static List<Identifier> getTopazUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static MythicTemplateItem createAquamarineUpgrade() {
        return new MythicTemplateItem(AQUAMARINE_UPGRADE_APPLIES_TO_TEXT, AQUAMARINE_UPGRADE_INGREDIENTS_TEXT, AQUAMARINE_UPGRADE_TEXT, AQUAMARINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, AQUAMARINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getAquamarineUpgradeEmptyBaseSlotTextures(), getAquamarineUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getAquamarineUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_SWORD_TEXTURE, EMPTY_SLOT_AXE_TEXTURE);
    }

    private static List<Identifier> getAquamarineUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static MythicTemplateItem createSapphireUpgrade() {
        return new MythicTemplateItem(SAPPHIRE_UPGRADE_APPLIES_TO_TEXT, SAPPHIRE_UPGRADE_INGREDIENTS_TEXT, SAPPHIRE_UPGRADE_TEXT, SAPPHIRE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, SAPPHIRE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getSapphireUpgradeEmptyBaseSlotTextures(), getSapphireUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getSapphireUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }

    private static List<Identifier> getSapphireUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static MythicTemplateItem createRubyUpgrade() {
        return new MythicTemplateItem(RUBY_UPGRADE_APPLIES_TO_TEXT, RUBY_UPGRADE_INGREDIENTS_TEXT, RUBY_UPGRADE_TEXT, RUBY_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, RUBY_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getRubyUpgradeEmptyBaseSlotTextures(), getRubyUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getRubyUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_SWORD_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    private static List<Identifier> getRubyUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static MythicTemplateItem createAmetrineUpgrade() {
        return new MythicTemplateItem(AMETRINE_UPGRADE_APPLIES_TO_TEXT, AMETRINE_UPGRADE_INGREDIENTS_TEXT, AMETRINE_UPGRADE_TEXT, AMETRINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, AMETRINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getAmetrineUpgradeEmptyBaseSlotTextures(), getAmetrineUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getAmetrineUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }

    private static List<Identifier> getAmetrineUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public Text getBaseSlotDescription() {
        return this.baseSlotDescriptionText;
    }

    public Text getAdditionsSlotDescription() {
        return this.additionsSlotDescriptionText;
    }

    public List<Identifier> getEmptyBaseSlotTextures() {
        return this.emptyBaseSlotTextures;
    }

    public List<Identifier> getEmptyAdditionsSlotTextures() {
        return this.emptyAdditionsSlotTextures;
    }

    public String getTranslationKey() {
        return TRANSLATION_KEY;
    }

    static {
        TITLE_FORMATTING = Formatting.GRAY;
        DESCRIPTION_FORMATTING = Formatting.BLUE;
        TRANSLATION_KEY = Util.createTranslationKey("item", new Identifier("smithing_template"));
        INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.ingredients"))).formatted(TITLE_FORMATTING);
        APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.applies_to"))).formatted(TITLE_FORMATTING);
        EMPTY_ARMOR_SLOT_HELMET_TEXTURE = new Identifier("item/empty_armor_slot_helmet");
        EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = new Identifier("item/empty_armor_slot_chestplate");
        EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = new Identifier("item/empty_armor_slot_leggings");
        EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = new Identifier("item/empty_armor_slot_boots");
        EMPTY_SLOT_HOE_TEXTURE = new Identifier("item/empty_slot_hoe");
        EMPTY_SLOT_AXE_TEXTURE = new Identifier("item/empty_slot_axe");
        EMPTY_SLOT_SWORD_TEXTURE = new Identifier("item/empty_slot_sword");
        EMPTY_SLOT_SHOVEL_TEXTURE = new Identifier("item/empty_slot_shovel");
        EMPTY_SLOT_PICKAXE_TEXTURE = new Identifier("item/empty_slot_pickaxe");
        EMPTY_SLOT_INGOT_TEXTURE = new Identifier(":item/empty_slot_ingot");

        JADE_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("jade_upgrade"))).formatted(TITLE_FORMATTING);
        JADE_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.jade_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
        JADE_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.jade_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
        JADE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.jade_upgrade.base_slot_description")));
        JADE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.jade_upgrade.additions_slot_description")));

        TOPAZ_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("topaz_upgrade"))).formatted(TITLE_FORMATTING);
        TOPAZ_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.topaz_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
        TOPAZ_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.topaz_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
        TOPAZ_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.topaz_upgrade.base_slot_description")));
        TOPAZ_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.topaz_upgrade.additions_slot_description")));

        AQUAMARINE_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("aquamarine_upgrade"))).formatted(TITLE_FORMATTING);
        AQUAMARINE_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.aquamarine_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
        AQUAMARINE_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.aquamarine_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
        AQUAMARINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.aquamarine_upgrade.base_slot_description")));
        AQUAMARINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.aquamarine_upgrade.additions_slot_description")));
    
        SAPPHIRE_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("sapphire_upgrade"))).formatted(TITLE_FORMATTING);
        SAPPHIRE_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.sapphire_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
        SAPPHIRE_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.sapphire_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
        SAPPHIRE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.sapphire_upgrade.base_slot_description")));
        SAPPHIRE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.sapphire_upgrade.additions_slot_description")));

        RUBY_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("ruby_upgrade"))).formatted(TITLE_FORMATTING);
        RUBY_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.ruby_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
        RUBY_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.ruby_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
        RUBY_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.ruby_upgrade.base_slot_description")));
        RUBY_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.ruby_upgrade.additions_slot_description")));

        AMETRINE_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("ametrine_upgrade"))).formatted(TITLE_FORMATTING);
        AMETRINE_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.ametrine_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
        AMETRINE_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.ametrine_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
        AMETRINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.ametrine_upgrade.base_slot_description")));
        AMETRINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.ametrine_upgrade.additions_slot_description")));
    }
}