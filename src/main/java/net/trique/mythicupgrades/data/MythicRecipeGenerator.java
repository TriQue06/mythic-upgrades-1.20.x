package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.trique.mythicupgrades.block.MythicBlocks;
import net.trique.mythicupgrades.registry.RegisterMythicItems;
import static net.trique.mythicupgrades.data.MythicRecipeProvider.*;
import java.util.List;
import java.util.function.Consumer;

public class MythicRecipeGenerator extends FabricRecipeProvider {
    public MythicRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(MythicBlocks.SAPPHIRE_ORE), RecipeCategory.MISC, RegisterMythicItems.SAPPHIRE,
                3.0f, 200, "sapphire");
        offerBlasting(exporter, List.of(MythicBlocks.SAPPHIRE_ORE), RecipeCategory.MISC, RegisterMythicItems.SAPPHIRE,
                3.0f, 100, "sapphire");

        offerSmelting(exporter, List.of(MythicBlocks.RUBY_ORE), RecipeCategory.MISC, RegisterMythicItems.RUBY,
                3.0f, 200, "ruby");
        offerBlasting(exporter, List.of(MythicBlocks.RUBY_ORE), RecipeCategory.MISC, RegisterMythicItems.RUBY,
                3.0f, 100, "ruby");

        offerSmelting(exporter, List.of(MythicBlocks.JADE_ORE, MythicBlocks.DEEPSLATE_JADE_ORE), RecipeCategory.MISC, RegisterMythicItems.JADE,
                3.0f, 200, "jade");
        offerBlasting(exporter, List.of(MythicBlocks.JADE_ORE, MythicBlocks.DEEPSLATE_JADE_ORE), RecipeCategory.MISC, RegisterMythicItems.JADE,
                3.0f, 100, "jade");

        offerSmelting(exporter, List.of(MythicBlocks.TOPAZ_ORE, MythicBlocks.DEEPSLATE_TOPAZ_ORE), RecipeCategory.MISC, RegisterMythicItems.TOPAZ,
                3.0f, 200, "topaz");
        offerBlasting(exporter, List.of(MythicBlocks.TOPAZ_ORE, MythicBlocks.DEEPSLATE_TOPAZ_ORE), RecipeCategory.MISC, RegisterMythicItems.TOPAZ,
                3.0f, 100, "topaz");

        offerSmelting(exporter, List.of(MythicBlocks.AMETRINE_ORE), RecipeCategory.MISC, RegisterMythicItems.AMETRINE,
                3.0f, 200, "ametrine");
        offerBlasting(exporter, List.of(MythicBlocks.AMETRINE_ORE), RecipeCategory.MISC, RegisterMythicItems.AMETRINE,
                3.0f, 100, "ametrine");

        offerSmelting(exporter, List.of(MythicBlocks.AQUAMARINE_ORE, MythicBlocks.DEEPSLATE_AQUAMARINE_ORE), RecipeCategory.MISC, RegisterMythicItems.AQUAMARINE,
                3.0f, 200, "aquamarine");
        offerBlasting(exporter, List.of(MythicBlocks.AQUAMARINE_ORE, MythicBlocks.DEEPSLATE_AQUAMARINE_ORE), RecipeCategory.MISC, RegisterMythicItems.AQUAMARINE,
                3.0f, 100, "aquamarine");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.SAPPHIRE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.SAPPHIRE_BLOCK,
                "sapphire_block", "sapphire", "sapphire_ingot_from_sapphire_block", "sapphire");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.RUBY_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.RUBY_BLOCK,
                "ruby_block", "ruby", "ruby_ingot_from_ruby_block", "ruby");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.JADE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.JADE_BLOCK,
                "jade_block", "jade", "jade_ingot_from_jade_block", "jade");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.TOPAZ_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.TOPAZ_BLOCK,
                "topaz_block", "topaz", "topaz_ingot_from_topaz_block", "topaz");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.AMETRINE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.AMETRINE_BLOCK,
                "ametrine_block", "ametrine", "ametrine_ingot_from_ametrine_block", "ametrine");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.AQUAMARINE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.AQUAMARINE_BLOCK,
                "aquamarine_block", "aquamarine", "aquamarine_ingot_from_aquamarine_block", "aquamarine");

        offerCustomSmithingTemplateCopyingRecipe(exporter, ()->RegisterMythicItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                ()->RegisterMythicItems.AMETRINE, ()->Items.END_STONE);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()->RegisterMythicItems.AQUAMARINE_UPGRADE_SMITHING_TEMPLATE,
                ()->RegisterMythicItems.AQUAMARINE, ()->Items.ICE);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()->RegisterMythicItems.JADE_UPGRADE_SMITHING_TEMPLATE,
                ()->RegisterMythicItems.JADE, ()->Items.MOSSY_COBBLESTONE);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()->RegisterMythicItems.RUBY_UPGRADE_SMITHING_TEMPLATE,
                ()->RegisterMythicItems.RUBY, ()->Items.BLACKSTONE);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()->RegisterMythicItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                ()->RegisterMythicItems.SAPPHIRE, ()->Items.NETHER_BRICKS);
        offerCustomSmithingTemplateCopyingRecipe(exporter, ()->RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                ()->RegisterMythicItems.TOPAZ, ()->Items.SANDSTONE);

        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.AMETRINE_INGOT, List.of(RegisterMythicItems.AMETRINE, RegisterMythicItems.AMETRINE, RegisterMythicItems.AMETRINE, RegisterMythicItems.AMETRINE,
                Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT), "ametrine", 2);
        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.AQUAMARINE_INGOT, List.of(RegisterMythicItems.AQUAMARINE, RegisterMythicItems.AQUAMARINE, RegisterMythicItems.AQUAMARINE, RegisterMythicItems.AQUAMARINE,
                Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT), "aquamarine", 2);
        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.RUBY_INGOT, List.of(RegisterMythicItems.RUBY, RegisterMythicItems.RUBY, RegisterMythicItems.RUBY, RegisterMythicItems.RUBY,
                Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT), "ruby", 2);
        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.SAPPHIRE_INGOT, List.of(RegisterMythicItems.SAPPHIRE, RegisterMythicItems.SAPPHIRE, RegisterMythicItems.SAPPHIRE, RegisterMythicItems.SAPPHIRE,
                Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT), "sapphire", 2);
        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.TOPAZ_INGOT, List.of(RegisterMythicItems.TOPAZ, RegisterMythicItems.TOPAZ, RegisterMythicItems.TOPAZ, RegisterMythicItems.TOPAZ,
                Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT), "topaz", 2);
        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.JADE_INGOT, List.of(RegisterMythicItems.JADE, RegisterMythicItems.JADE, RegisterMythicItems.JADE, RegisterMythicItems.JADE,
                Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT, Items.NETHERITE_INGOT), "jade", 2);
        
        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.MUSIC_DISC_APPOMATTOX, 
                List.of(RegisterMythicItems.BROKEN_AMETRINE_DISC, RegisterMythicItems.AMETRINE), "ametrine", 1);
        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.MUSIC_DISC_FLOW_OF_THE_ABYSS, 
                List.of(RegisterMythicItems.BROKEN_AQUAMARINE_DISC, RegisterMythicItems.AQUAMARINE), "aquamarine", 1);
        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.MUSIC_DISC_NELUMBO, 
                List.of(RegisterMythicItems.BROKEN_JADE_DISC, RegisterMythicItems.JADE), "jade", 1);
        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.MUSIC_DISC_TANKER_ON_THE_LEVANTINES, 
                List.of(RegisterMythicItems.BROKEN_RUBY_DISC, RegisterMythicItems.RUBY), "ruby", 1);
        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.MUSIC_DISC_SOOT, 
                List.of(RegisterMythicItems.BROKEN_SAPPHIRE_DISC, RegisterMythicItems.SAPPHIRE), "sapphire", 1);
        offerShapelessRecipeWithMultipleInputs(exporter, ()->RegisterMythicItems.MUSIC_DISC_FIERCE, 
                List.of(RegisterMythicItems.BROKEN_TOPAZ_DISC, RegisterMythicItems.TOPAZ), "topaz", 1);

        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, RegisterMythicItems.AMETRINE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.AMETRINE_AXE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, RegisterMythicItems.AMETRINE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.AMETRINE_SWORD);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HELMET, RegisterMythicItems.AMETRINE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.AMETRINE_HELMET);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_CHESTPLATE, RegisterMythicItems.AMETRINE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.AMETRINE_CHESTPLATE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_LEGGINGS, RegisterMythicItems.AMETRINE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.AMETRINE_LEGGINGS);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.AMETRINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_BOOTS, RegisterMythicItems.AMETRINE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.AMETRINE_BOOTS);
        
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, RegisterMythicItems.JADE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.JADE_AXE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, RegisterMythicItems.JADE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.JADE_SWORD);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HELMET, RegisterMythicItems.JADE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.JADE_HELMET);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_CHESTPLATE, RegisterMythicItems.JADE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.JADE_CHESTPLATE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_LEGGINGS, RegisterMythicItems.JADE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.JADE_LEGGINGS);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.JADE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_BOOTS, RegisterMythicItems.JADE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.JADE_BOOTS);

        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, RegisterMythicItems.SAPPHIRE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.SAPPHIRE_AXE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, RegisterMythicItems.SAPPHIRE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.SAPPHIRE_SWORD);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HELMET, RegisterMythicItems.SAPPHIRE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.SAPPHIRE_HELMET);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_CHESTPLATE, RegisterMythicItems.SAPPHIRE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.SAPPHIRE_CHESTPLATE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_LEGGINGS, RegisterMythicItems.SAPPHIRE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.SAPPHIRE_LEGGINGS);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_BOOTS, RegisterMythicItems.SAPPHIRE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.SAPPHIRE_BOOTS);

        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, RegisterMythicItems.TOPAZ_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.TOPAZ_AXE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, RegisterMythicItems.TOPAZ_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.TOPAZ_SWORD);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_PICKAXE, RegisterMythicItems.TOPAZ_INGOT, RecipeCategory.TOOLS, RegisterMythicItems.TOPAZ_PICKAXE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SHOVEL, RegisterMythicItems.TOPAZ_INGOT, RecipeCategory.TOOLS, RegisterMythicItems.TOPAZ_SHOVEL);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HOE, RegisterMythicItems.TOPAZ_INGOT, RecipeCategory.TOOLS, RegisterMythicItems.TOPAZ_HOE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HELMET, RegisterMythicItems.TOPAZ_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.TOPAZ_HELMET);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_CHESTPLATE, RegisterMythicItems.TOPAZ_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.TOPAZ_CHESTPLATE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_LEGGINGS, RegisterMythicItems.TOPAZ_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.TOPAZ_LEGGINGS);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_BOOTS, RegisterMythicItems.TOPAZ_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.TOPAZ_BOOTS);

        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.AQUAMARINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, RegisterMythicItems.AQUAMARINE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.AQUAMARINE_AXE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.AQUAMARINE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, RegisterMythicItems.AQUAMARINE_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.AQUAMARINE_SWORD);

        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.RUBY_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE, RegisterMythicItems.RUBY_INGOT, RecipeCategory.TOOLS, RegisterMythicItems.RUBY_AXE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.RUBY_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD, RegisterMythicItems.RUBY_INGOT, RecipeCategory.COMBAT, RegisterMythicItems.RUBY_SWORD);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.RUBY_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SHOVEL, RegisterMythicItems.RUBY_INGOT, RecipeCategory.TOOLS, RegisterMythicItems.RUBY_SHOVEL);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.RUBY_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_PICKAXE, RegisterMythicItems.RUBY_INGOT, RecipeCategory.TOOLS, RegisterMythicItems.RUBY_PICKAXE);
        offerCustomUpgradeRecipe(exporter, RegisterMythicItems.RUBY_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HOE, RegisterMythicItems.RUBY_INGOT, RecipeCategory.TOOLS, RegisterMythicItems.RUBY_HOE);
    }
}