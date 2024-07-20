package net.trique.mythicupgrades.item;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.SmithingTemplateItem;

public class MUTemplateItem extends SmithingTemplateItem {
    private static final ChatFormatting TITLE_FORMATTING;
    private static final ChatFormatting DESCRIPTION_FORMATTING;
    private static final String TRANSLATION_KEY;
    private static final ResourceLocation EMPTY_ARMOR_SLOT_HELMET_TEXTURE;
    private static final ResourceLocation EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE;
    private static final ResourceLocation EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE;
    private static final ResourceLocation EMPTY_ARMOR_SLOT_BOOTS_TEXTURE;
    private static final ResourceLocation EMPTY_SLOT_HOE_TEXTURE;
    private static final ResourceLocation EMPTY_SLOT_AXE_TEXTURE;
    private static final ResourceLocation EMPTY_SLOT_SWORD_TEXTURE;
    private static final ResourceLocation EMPTY_SLOT_SHOVEL_TEXTURE;
    private static final ResourceLocation EMPTY_SLOT_PICKAXE_TEXTURE;
    private static final ResourceLocation EMPTY_SLOT_INGOT_TEXTURE;
    private final Component baseSlotDescriptionText;
    private final Component additionsSlotDescriptionText;
    private final List<ResourceLocation> emptyBaseSlotTextures;
    private final List<ResourceLocation> emptyAdditionsSlotTextures;

    private static final Component PERIDOT_UPGRADE_TEXT;
    private static final Component PERIDOT_UPGRADE_APPLIES_TO_TEXT;
    private static final Component PERIDOT_UPGRADE_INGREDIENTS_TEXT;
    private static final Component PERIDOT_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Component PERIDOT_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Component TOPAZ_UPGRADE_TEXT;
    private static final Component TOPAZ_UPGRADE_APPLIES_TO_TEXT;
    private static final Component TOPAZ_UPGRADE_INGREDIENTS_TEXT;
    private static final Component TOPAZ_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Component TOPAZ_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Component AQUAMARINE_UPGRADE_TEXT;
    private static final Component AQUAMARINE_UPGRADE_APPLIES_TO_TEXT;
    private static final Component AQUAMARINE_UPGRADE_INGREDIENTS_TEXT;
    private static final Component AQUAMARINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Component AQUAMARINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Component SAPPHIRE_UPGRADE_TEXT;
    private static final Component SAPPHIRE_UPGRADE_APPLIES_TO_TEXT;
    private static final Component SAPPHIRE_UPGRADE_INGREDIENTS_TEXT;
    private static final Component SAPPHIRE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Component SAPPHIRE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Component RUBY_UPGRADE_TEXT;
    private static final Component RUBY_UPGRADE_APPLIES_TO_TEXT;
    private static final Component RUBY_UPGRADE_INGREDIENTS_TEXT;
    private static final Component RUBY_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Component RUBY_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Component AMETRINE_UPGRADE_TEXT;
    private static final Component AMETRINE_UPGRADE_APPLIES_TO_TEXT;
    private static final Component AMETRINE_UPGRADE_INGREDIENTS_TEXT;
    private static final Component AMETRINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Component AMETRINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Component JADE_UPGRADE_TEXT;
    private static final Component JADE_UPGRADE_APPLIES_TO_TEXT;
    private static final Component JADE_UPGRADE_INGREDIENTS_TEXT;
    private static final Component JADE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Component JADE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;

    public MUTemplateItem(Component appliesToText, Component ingredientsText, Component titleText, Component baseSlotDescriptionText, Component additionsSlotDescriptionText, List<ResourceLocation> emptyBaseSlotTextures, List<ResourceLocation> emptyAdditionsSlotTextures) {
        super(appliesToText, ingredientsText, titleText, baseSlotDescriptionText, additionsSlotDescriptionText, emptyBaseSlotTextures, emptyAdditionsSlotTextures);
        this.baseSlotDescriptionText = baseSlotDescriptionText;
        this.additionsSlotDescriptionText = additionsSlotDescriptionText;
        this.emptyBaseSlotTextures = emptyBaseSlotTextures;
        this.emptyAdditionsSlotTextures = emptyAdditionsSlotTextures;
    }

    public static MUTemplateItem createPeridotUpgrade() {
        return new MUTemplateItem(PERIDOT_UPGRADE_APPLIES_TO_TEXT, PERIDOT_UPGRADE_INGREDIENTS_TEXT, PERIDOT_UPGRADE_TEXT, PERIDOT_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, PERIDOT_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getPeridotUpgradeEmptyBaseSlotTextures(), getPeridotUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<ResourceLocation> getPeridotUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }

    private static List<ResourceLocation> getPeridotUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static MUTemplateItem createTopazUpgrade() {
        return new MUTemplateItem(TOPAZ_UPGRADE_APPLIES_TO_TEXT, TOPAZ_UPGRADE_INGREDIENTS_TEXT, TOPAZ_UPGRADE_TEXT, TOPAZ_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, TOPAZ_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getTopazUpgradeEmptyBaseSlotTextures(), getTopazUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<ResourceLocation> getTopazUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    private static List<ResourceLocation> getTopazUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static MUTemplateItem createAquamarineUpgrade() {
        return new MUTemplateItem(AQUAMARINE_UPGRADE_APPLIES_TO_TEXT, AQUAMARINE_UPGRADE_INGREDIENTS_TEXT, AQUAMARINE_UPGRADE_TEXT, AQUAMARINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, AQUAMARINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getAquamarineUpgradeEmptyBaseSlotTextures(), getAquamarineUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<ResourceLocation> getAquamarineUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE);
    }

    private static List<ResourceLocation> getAquamarineUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static MUTemplateItem createSapphireUpgrade() {
        return new MUTemplateItem(SAPPHIRE_UPGRADE_APPLIES_TO_TEXT, SAPPHIRE_UPGRADE_INGREDIENTS_TEXT, SAPPHIRE_UPGRADE_TEXT, SAPPHIRE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, SAPPHIRE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getSapphireUpgradeEmptyBaseSlotTextures(), getSapphireUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<ResourceLocation> getSapphireUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }

    private static List<ResourceLocation> getSapphireUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static MUTemplateItem createRubyUpgrade() {
        return new MUTemplateItem(RUBY_UPGRADE_APPLIES_TO_TEXT, RUBY_UPGRADE_INGREDIENTS_TEXT, RUBY_UPGRADE_TEXT, RUBY_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, RUBY_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getRubyUpgradeEmptyBaseSlotTextures(), getRubyUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<ResourceLocation> getRubyUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_SWORD_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    private static List<ResourceLocation> getRubyUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static MUTemplateItem createAmetrineUpgrade() {
        return new MUTemplateItem(AMETRINE_UPGRADE_APPLIES_TO_TEXT, AMETRINE_UPGRADE_INGREDIENTS_TEXT, AMETRINE_UPGRADE_TEXT, AMETRINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, AMETRINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getAmetrineUpgradeEmptyBaseSlotTextures(), getAmetrineUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<ResourceLocation> getAmetrineUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }

    private static List<ResourceLocation> getAmetrineUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public static MUTemplateItem createJadeUpgrade() {
        return new MUTemplateItem(JADE_UPGRADE_APPLIES_TO_TEXT, JADE_UPGRADE_INGREDIENTS_TEXT, JADE_UPGRADE_TEXT, JADE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, JADE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getJadeUpgradeEmptyBaseSlotTextures(), getJadeUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<ResourceLocation> getJadeUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }

    private static List<ResourceLocation> getJadeUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public Component getBaseSlotDescription() {
        return this.baseSlotDescriptionText;
    }

    public Component getAdditionSlotDescription() {
        return this.additionsSlotDescriptionText;
    }

    public List<ResourceLocation> getBaseSlotEmptyIcons() {
        return this.emptyBaseSlotTextures;
    }

    public List<ResourceLocation> getAdditionalSlotEmptyIcons() {
        return this.emptyAdditionsSlotTextures;
    }

    public String getDescriptionId() {
        return TRANSLATION_KEY;
    }

    static {
        TITLE_FORMATTING = ChatFormatting.GRAY;
        DESCRIPTION_FORMATTING = ChatFormatting.BLUE;
        TRANSLATION_KEY = Util.makeDescriptionId("item", new ResourceLocation("smithing_template"));
        EMPTY_ARMOR_SLOT_HELMET_TEXTURE = new ResourceLocation("item/empty_armor_slot_helmet");
        EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = new ResourceLocation("item/empty_armor_slot_chestplate");
        EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = new ResourceLocation("item/empty_armor_slot_leggings");
        EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = new ResourceLocation("item/empty_armor_slot_boots");
        EMPTY_SLOT_HOE_TEXTURE = new ResourceLocation("item/empty_slot_hoe");
        EMPTY_SLOT_AXE_TEXTURE = new ResourceLocation("item/empty_slot_axe");
        EMPTY_SLOT_SWORD_TEXTURE = new ResourceLocation("item/empty_slot_sword");
        EMPTY_SLOT_SHOVEL_TEXTURE = new ResourceLocation("item/empty_slot_shovel");
        EMPTY_SLOT_PICKAXE_TEXTURE = new ResourceLocation("item/empty_slot_pickaxe");
        EMPTY_SLOT_INGOT_TEXTURE = new ResourceLocation(":item/empty_slot_ingot");

        PERIDOT_UPGRADE_TEXT = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation("peridot_upgrade"))).withStyle(TITLE_FORMATTING);
        PERIDOT_UPGRADE_APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.peridot_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING);
        PERIDOT_UPGRADE_INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.peridot_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING);
        PERIDOT_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.peridot_upgrade.base_slot_description")));
        PERIDOT_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.peridot_upgrade.additions_slot_description")));

        TOPAZ_UPGRADE_TEXT = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation("topaz_upgrade"))).withStyle(TITLE_FORMATTING);
        TOPAZ_UPGRADE_APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.topaz_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING);
        TOPAZ_UPGRADE_INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.topaz_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING);
        TOPAZ_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.topaz_upgrade.base_slot_description")));
        TOPAZ_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.topaz_upgrade.additions_slot_description")));

        AQUAMARINE_UPGRADE_TEXT = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation("aquamarine_upgrade"))).withStyle(TITLE_FORMATTING);
        AQUAMARINE_UPGRADE_APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.aquamarine_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING);
        AQUAMARINE_UPGRADE_INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.aquamarine_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING);
        AQUAMARINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.aquamarine_upgrade.base_slot_description")));
        AQUAMARINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.aquamarine_upgrade.additions_slot_description")));
    
        SAPPHIRE_UPGRADE_TEXT = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation("sapphire_upgrade"))).withStyle(TITLE_FORMATTING);
        SAPPHIRE_UPGRADE_APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.sapphire_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING);
        SAPPHIRE_UPGRADE_INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.sapphire_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING);
        SAPPHIRE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.sapphire_upgrade.base_slot_description")));
        SAPPHIRE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.sapphire_upgrade.additions_slot_description")));

        RUBY_UPGRADE_TEXT = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation("ruby_upgrade"))).withStyle(TITLE_FORMATTING);
        RUBY_UPGRADE_APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.ruby_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING);
        RUBY_UPGRADE_INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.ruby_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING);
        RUBY_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.ruby_upgrade.base_slot_description")));
        RUBY_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.ruby_upgrade.additions_slot_description")));

        AMETRINE_UPGRADE_TEXT = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation("ametrine_upgrade"))).withStyle(TITLE_FORMATTING);
        AMETRINE_UPGRADE_APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.ametrine_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING);
        AMETRINE_UPGRADE_INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.ametrine_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING);
        AMETRINE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.ametrine_upgrade.base_slot_description")));
        AMETRINE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.ametrine_upgrade.additions_slot_description")));
    
        JADE_UPGRADE_TEXT = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation("jade_upgrade"))).withStyle(TITLE_FORMATTING);
        JADE_UPGRADE_APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.jade_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING);
        JADE_UPGRADE_INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.jade_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING);
        JADE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.jade_upgrade.base_slot_description")));
        JADE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.jade_upgrade.additions_slot_description")));
    }
}