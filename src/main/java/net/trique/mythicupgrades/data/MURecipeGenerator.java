package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.trique.mythicupgrades.block.MUBlocks;
import net.trique.mythicupgrades.item.MUItems;
import static net.trique.mythicupgrades.item.MUItems.*;
import static net.trique.mythicupgrades.util.DataGenHelper.*;
import static net.trique.mythicupgrades.util.CommonFunctions.getId;
import java.util.List;
import java.util.function.Consumer;

public class MURecipeGenerator extends FabricRecipeProvider {
    public MURecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(MUBlocks.PERIDOT_ORE, MUBlocks.DEEPSLATE_PERIDOT_ORE), RecipeCategory.MISC, PERIDOT,
                3.0f, 200, "peridot");
        offerBlasting(exporter, List.of(MUBlocks.PERIDOT_ORE, MUBlocks.DEEPSLATE_PERIDOT_ORE), RecipeCategory.MISC, PERIDOT,
                3.0f, 100, "peridot");

        offerSmelting(exporter, List.of(MUBlocks.TOPAZ_ORE, MUBlocks.DEEPSLATE_TOPAZ_ORE), RecipeCategory.MISC, TOPAZ,
                3.0f, 200, "topaz");
        offerBlasting(exporter, List.of(MUBlocks.TOPAZ_ORE, MUBlocks.DEEPSLATE_TOPAZ_ORE), RecipeCategory.MISC, TOPAZ,
                3.0f, 100, "topaz");

        offerSmelting(exporter, List.of(MUBlocks.AQUAMARINE_ORE, MUBlocks.DEEPSLATE_AQUAMARINE_ORE), RecipeCategory.MISC, AQUAMARINE,
                3.0f, 200, "aquamarine");
        offerBlasting(exporter, List.of(MUBlocks.AQUAMARINE_ORE, MUBlocks.DEEPSLATE_AQUAMARINE_ORE), RecipeCategory.MISC, AQUAMARINE,
                3.0f, 100, "aquamarine");

        offerSmelting(exporter, List.of(MUBlocks.SAPPHIRE_ORE), RecipeCategory.MISC, SAPPHIRE,
                3.0f, 200, "sapphire");
        offerBlasting(exporter, List.of(MUBlocks.SAPPHIRE_ORE), RecipeCategory.MISC, SAPPHIRE,
                3.0f, 100, "sapphire");

        offerSmelting(exporter, List.of(MUBlocks.RUBY_ORE), RecipeCategory.MISC, RUBY,
                3.0f, 200, "ruby");
        offerBlasting(exporter, List.of(MUBlocks.RUBY_ORE), RecipeCategory.MISC, RUBY,
                3.0f, 100, "ruby");

        offerSmelting(exporter, List.of(MUBlocks.KYANITE_ORE), RecipeCategory.MISC, KYANITE,
                3.0f, 200, "kyanite");
        offerBlasting(exporter, List.of(MUBlocks.KYANITE_ORE), RecipeCategory.MISC, KYANITE,
                3.0f, 100, "kyanite");

        offerSmelting(exporter, List.of(MUBlocks.AMETRINE_ORE), RecipeCategory.MISC, AMETRINE,
                3.0f, 200, "ametrine");
        offerBlasting(exporter, List.of(MUBlocks.AMETRINE_ORE), RecipeCategory.MISC, AMETRINE,
                3.0f, 100, "ametrine");

        offerSmelting(exporter, List.of(MUBlocks.JADE_ORE), RecipeCategory.MISC, JADE,
                3.0f, 200, "jade");
        offerBlasting(exporter, List.of(MUBlocks.JADE_ORE), RecipeCategory.MISC, JADE,
                3.0f, 100, "jade");

        offerSmelting(exporter, List.of(MUBlocks.NECOIUM_ORE), RecipeCategory.MISC, MUItems.NECOIUM_INGOT,
                3.0f, 200, "necoium");
        offerBlasting(exporter, List.of(MUBlocks.NECOIUM_ORE), RecipeCategory.MISC, MUItems.NECOIUM_INGOT,
                3.0f, 100, "necoium");

        offerSmelting(exporter, List.of(RAW_NECOIUM), RecipeCategory.MISC, MUItems.NECOIUM_INGOT,
                3.0f, 200, "necoium");
        offerBlasting(exporter, List.of(RAW_NECOIUM), RecipeCategory.MISC, MUItems.NECOIUM_INGOT,
                3.0f, 100, "necoium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, PERIDOT_INGOT, RecipeCategory.BUILDING_BLOCKS, MUBlocks.PERIDOT_BLOCK,
                getId("peridot_block"), "peridot_block", getId("peridot_ingot_from_peridot_block"), "peridot_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, TOPAZ_INGOT, RecipeCategory.BUILDING_BLOCKS, MUBlocks.TOPAZ_BLOCK,
                getId("topaz_block"), "topaz_block", getId("topaz_ingot_from_topaz_block"), "topaz_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AQUAMARINE_INGOT, RecipeCategory.BUILDING_BLOCKS, MUBlocks.AQUAMARINE_BLOCK,
                getId("aquamarine_block"), "aquamarine_block", getId("aquamarine_ingot_from_aquamarine_block"), "aquamarine_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, SAPPHIRE_INGOT, RecipeCategory.BUILDING_BLOCKS, MUBlocks.SAPPHIRE_BLOCK,
                getId("sapphire_block"), "sapphire_block", getId("sapphire_ingot_from_sapphire_block"), "sapphire_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, RUBY_INGOT, RecipeCategory.BUILDING_BLOCKS, MUBlocks.RUBY_BLOCK,
                getId("ruby_block"), "ruby_block", getId("ruby_ingot_from_ruby_block"), "ruby_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, KYANITE_INGOT, RecipeCategory.BUILDING_BLOCKS, MUBlocks.KYANITE_BLOCK,
                getId("kyanite_block"), "kyanite_block", getId("kyanite_ingot_from_kyanite_block"), "kyanite_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AMETRINE_INGOT, RecipeCategory.BUILDING_BLOCKS, MUBlocks.AMETRINE_BLOCK,
                getId("ametrine_block"), "ametrine_block", getId("ametrine_ingot_from_ametrine_block"), "ametrine_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, JADE_INGOT, RecipeCategory.BUILDING_BLOCKS, MUBlocks.JADE_BLOCK,
                getId("jade_block"), "jade_block", getId("jade_ingot_from_jade_block"), "jade_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, MUItems.NECOIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, MUBlocks.NECOIUM_BLOCK,
                getId("necoium_block"), "necoium_block", getId("necoium_ingot_from_necoium_block"), "necoium_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, RAW_NECOIUM, RecipeCategory.BUILDING_BLOCKS, MUBlocks.RAW_NECOIUM_BLOCK,
                getId("raw_necoium_block"), "raw_necoium_block", getId("raw_necoium_from_raw_necoium_block"), "necoium_ingot");

        offerCustomSmithingTemplateCopyingRecipe(exporter, ()-> PERIDOT_UPGRADE_SMITHING_TEMPLATE,
                ()-> PERIDOT, ()->Items.MOSSY_COBBLESTONE);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()-> TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                ()-> TOPAZ, ()->Items.SANDSTONE);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()-> AQUAMARINE_UPGRADE_SMITHING_TEMPLATE,
                ()-> AQUAMARINE, ()->Items.PRISMARINE);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()-> SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                ()-> SAPPHIRE, ()->Items.NETHER_BRICKS);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()-> RUBY_UPGRADE_SMITHING_TEMPLATE,
                ()-> RUBY, ()->Items.BLACKSTONE);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()-> KYANITE_UPGRADE_SMITHING_TEMPLATE,
                ()-> KYANITE, ()->Items.BASALT);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()-> AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                ()-> AMETRINE, ()->Items.END_STONE_BRICKS);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()-> JADE_UPGRADE_SMITHING_TEMPLATE,
                ()-> JADE, ()->Items.END_STONE_BRICKS);

        offerShapelessRecipeWithMultipleInputsAndKeyItems(exporter, ()-> PERIDOT_INGOT, List.of(PERIDOT, PERIDOT, PERIDOT, PERIDOT,
                        MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT),
                List.of(PERIDOT), "peridot_ingot", 1);
        offerShapelessRecipeWithMultipleInputsAndKeyItems(exporter, ()-> TOPAZ_INGOT, List.of(TOPAZ, TOPAZ, TOPAZ, TOPAZ,
                        MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT),
                List.of(TOPAZ),"topaz_ingot", 1);
        offerShapelessRecipeWithMultipleInputsAndKeyItems(exporter, ()-> AQUAMARINE_INGOT, List.of(AQUAMARINE, AQUAMARINE, AQUAMARINE, AQUAMARINE,
                        MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT),
                List.of(AQUAMARINE),"aquamarine_ingot", 1);
        offerShapelessRecipeWithMultipleInputsAndKeyItems(exporter, ()-> SAPPHIRE_INGOT, List.of(SAPPHIRE, SAPPHIRE, SAPPHIRE, SAPPHIRE,
                        MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT),
                List.of(SAPPHIRE), "sapphire_ingot", 1);
        offerShapelessRecipeWithMultipleInputsAndKeyItems(exporter, ()-> RUBY_INGOT, List.of(RUBY, RUBY, RUBY, RUBY,
                        MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT),
                List.of(RUBY),"ruby_ingot", 1);
        offerShapelessRecipeWithMultipleInputsAndKeyItems(exporter, ()-> KYANITE_INGOT, List.of(KYANITE, KYANITE, KYANITE, KYANITE,
                        MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT),
                List.of(KYANITE),"kyanite_ingot", 1);
        offerShapelessRecipeWithMultipleInputsAndKeyItems(exporter, ()-> AMETRINE_INGOT, List.of(AMETRINE, AMETRINE, AMETRINE, AMETRINE,
                        MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT),
                List.of(AMETRINE),"ametrine_ingot", 1);
        offerShapelessRecipeWithMultipleInputsAndKeyItems(exporter, ()-> JADE_INGOT, List.of(JADE, JADE, JADE, JADE,
                        MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT, MUItems.NECOIUM_INGOT),
                List.of(JADE),"jade_ingot", 1);

        offerCustomUpgradeRecipe(exporter, PERIDOT_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, PERIDOT_INGOT, RecipeCategory.COMBAT, PERIDOT_AXE);
        offerCustomUpgradeRecipe(exporter, PERIDOT_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, PERIDOT_INGOT, RecipeCategory.COMBAT, PERIDOT_SWORD);
        offerCustomUpgradeRecipe(exporter, PERIDOT_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HELMET, PERIDOT_INGOT, RecipeCategory.COMBAT, PERIDOT_HELMET);
        offerCustomUpgradeRecipe(exporter, PERIDOT_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_CHESTPLATE, PERIDOT_INGOT, RecipeCategory.COMBAT, PERIDOT_CHESTPLATE);
        offerCustomUpgradeRecipe(exporter, PERIDOT_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_LEGGINGS, PERIDOT_INGOT, RecipeCategory.COMBAT, PERIDOT_LEGGINGS);
        offerCustomUpgradeRecipe(exporter, PERIDOT_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_BOOTS, PERIDOT_INGOT, RecipeCategory.COMBAT, PERIDOT_BOOTS);

        offerCustomUpgradeRecipe(exporter, TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, TOPAZ_INGOT, RecipeCategory.COMBAT, TOPAZ_AXE);
        offerCustomUpgradeRecipe(exporter, TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, TOPAZ_INGOT, RecipeCategory.COMBAT, TOPAZ_SWORD);
        offerCustomUpgradeRecipe(exporter, TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_PICKAXE, TOPAZ_INGOT, RecipeCategory.TOOLS, TOPAZ_PICKAXE);
        offerCustomUpgradeRecipe(exporter, TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SHOVEL, TOPAZ_INGOT, RecipeCategory.TOOLS, TOPAZ_SHOVEL);
        offerCustomUpgradeRecipe(exporter, TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HOE, TOPAZ_INGOT, RecipeCategory.TOOLS, TOPAZ_HOE);
        offerCustomUpgradeRecipe(exporter, TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HELMET, TOPAZ_INGOT, RecipeCategory.COMBAT, TOPAZ_HELMET);
        offerCustomUpgradeRecipe(exporter, TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_CHESTPLATE, TOPAZ_INGOT, RecipeCategory.COMBAT, TOPAZ_CHESTPLATE);
        offerCustomUpgradeRecipe(exporter, TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_LEGGINGS, TOPAZ_INGOT, RecipeCategory.COMBAT, TOPAZ_LEGGINGS);
        offerCustomUpgradeRecipe(exporter, TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_BOOTS, TOPAZ_INGOT, RecipeCategory.COMBAT, TOPAZ_BOOTS);

        offerCustomUpgradeRecipe(exporter, AQUAMARINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HELMET, AQUAMARINE_INGOT, RecipeCategory.COMBAT, AQUAMARINE_HELMET);
        offerCustomUpgradeRecipe(exporter, AQUAMARINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_CHESTPLATE, AQUAMARINE_INGOT, RecipeCategory.COMBAT, AQUAMARINE_CHESTPLATE);
        offerCustomUpgradeRecipe(exporter, AQUAMARINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_LEGGINGS, AQUAMARINE_INGOT, RecipeCategory.COMBAT, AQUAMARINE_LEGGINGS);
        offerCustomUpgradeRecipe(exporter, AQUAMARINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_BOOTS, AQUAMARINE_INGOT, RecipeCategory.COMBAT, AQUAMARINE_BOOTS);

        offerCustomUpgradeRecipe(exporter, SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, SAPPHIRE_INGOT, RecipeCategory.COMBAT, SAPPHIRE_AXE);
        offerCustomUpgradeRecipe(exporter, SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, SAPPHIRE_INGOT, RecipeCategory.COMBAT, SAPPHIRE_SWORD);
        offerCustomUpgradeRecipe(exporter, SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HELMET, SAPPHIRE_INGOT, RecipeCategory.COMBAT, SAPPHIRE_HELMET);
        offerCustomUpgradeRecipe(exporter, SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_CHESTPLATE, SAPPHIRE_INGOT, RecipeCategory.COMBAT, SAPPHIRE_CHESTPLATE);
        offerCustomUpgradeRecipe(exporter, SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_LEGGINGS, SAPPHIRE_INGOT, RecipeCategory.COMBAT, SAPPHIRE_LEGGINGS);
        offerCustomUpgradeRecipe(exporter, SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_BOOTS, SAPPHIRE_INGOT, RecipeCategory.COMBAT, SAPPHIRE_BOOTS);

        offerCustomUpgradeRecipe(exporter, RUBY_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, RUBY_INGOT, RecipeCategory.TOOLS, RUBY_AXE);
        offerCustomUpgradeRecipe(exporter, RUBY_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SHOVEL, RUBY_INGOT, RecipeCategory.TOOLS, RUBY_SHOVEL);
        offerCustomUpgradeRecipe(exporter, RUBY_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_PICKAXE, RUBY_INGOT, RecipeCategory.TOOLS, RUBY_PICKAXE);
        offerCustomUpgradeRecipe(exporter, RUBY_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HOE, RUBY_INGOT, RecipeCategory.TOOLS, RUBY_HOE);

        offerCustomUpgradeRecipe(exporter, KYANITE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, KYANITE_INGOT, RecipeCategory.COMBAT, KYANITE_AXE);
        offerCustomUpgradeRecipe(exporter, KYANITE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, KYANITE_INGOT, RecipeCategory.COMBAT, KYANITE_SWORD);
        offerCustomUpgradeRecipe(exporter, KYANITE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HELMET, KYANITE_INGOT, RecipeCategory.COMBAT, KYANITE_HELMET);
        offerCustomUpgradeRecipe(exporter, KYANITE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_CHESTPLATE, KYANITE_INGOT, RecipeCategory.COMBAT, KYANITE_CHESTPLATE);
        offerCustomUpgradeRecipe(exporter, KYANITE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_LEGGINGS, KYANITE_INGOT, RecipeCategory.COMBAT, KYANITE_LEGGINGS);
        offerCustomUpgradeRecipe(exporter, KYANITE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_BOOTS, KYANITE_INGOT, RecipeCategory.COMBAT, KYANITE_BOOTS);

        offerCustomUpgradeRecipe(exporter, AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, AMETRINE_INGOT, RecipeCategory.COMBAT, AMETRINE_AXE);
        offerCustomUpgradeRecipe(exporter, AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, AMETRINE_INGOT, RecipeCategory.COMBAT, AMETRINE_SWORD);
        offerCustomUpgradeRecipe(exporter, AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HELMET, AMETRINE_INGOT, RecipeCategory.COMBAT, AMETRINE_HELMET);
        offerCustomUpgradeRecipe(exporter, AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_CHESTPLATE, AMETRINE_INGOT, RecipeCategory.COMBAT, AMETRINE_CHESTPLATE);
        offerCustomUpgradeRecipe(exporter, AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_LEGGINGS, AMETRINE_INGOT, RecipeCategory.COMBAT, AMETRINE_LEGGINGS);
        offerCustomUpgradeRecipe(exporter, AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_BOOTS, AMETRINE_INGOT, RecipeCategory.COMBAT, AMETRINE_BOOTS);

        offerCustomUpgradeRecipe(exporter, JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, JADE_INGOT, RecipeCategory.COMBAT, JADE_AXE);
        offerCustomUpgradeRecipe(exporter, JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, JADE_INGOT, RecipeCategory.COMBAT, JADE_SWORD);
        offerCustomUpgradeRecipe(exporter, JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HELMET, JADE_INGOT, RecipeCategory.COMBAT, JADE_HELMET);
        offerCustomUpgradeRecipe(exporter, JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_CHESTPLATE, JADE_INGOT, RecipeCategory.COMBAT, JADE_CHESTPLATE);
        offerCustomUpgradeRecipe(exporter, JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_LEGGINGS, JADE_INGOT, RecipeCategory.COMBAT, JADE_LEGGINGS);
        offerCustomUpgradeRecipe(exporter, JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_BOOTS, JADE_INGOT, RecipeCategory.COMBAT, JADE_BOOTS);
    }
}