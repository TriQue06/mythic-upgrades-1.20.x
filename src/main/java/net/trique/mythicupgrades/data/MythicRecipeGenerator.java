package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.trique.mythicupgrades.block.MythicBlocks;
import net.trique.mythicupgrades.registry.RegisterMythicItems;

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

        offerSmelting(exporter, List.of(MythicBlocks.JADE_ORE), RecipeCategory.MISC, RegisterMythicItems.JADE,
                3.0f, 200, "jade");
        offerBlasting(exporter, List.of(MythicBlocks.JADE_ORE), RecipeCategory.MISC, RegisterMythicItems.JADE,
                3.0f, 100, "jade");
        offerSmelting(exporter, List.of(MythicBlocks.DEEPSLATE_JADE_ORE), RecipeCategory.MISC, RegisterMythicItems.JADE,
                3.0f, 200, "jade");
        offerBlasting(exporter, List.of(MythicBlocks.DEEPSLATE_JADE_ORE), RecipeCategory.MISC, RegisterMythicItems.JADE,
                3.0f, 100, "jade");

        offerSmelting(exporter, List.of(MythicBlocks.TOPAZ_ORE), RecipeCategory.MISC, RegisterMythicItems.TOPAZ,
                3.0f, 200, "topaz");
        offerBlasting(exporter, List.of(MythicBlocks.TOPAZ_ORE), RecipeCategory.MISC, RegisterMythicItems.TOPAZ,
                3.0f, 100, "topaz");
        offerSmelting(exporter, List.of(MythicBlocks.DEEPSLATE_TOPAZ_ORE), RecipeCategory.MISC, RegisterMythicItems.TOPAZ,
                3.0f, 200, "topaz");
        offerBlasting(exporter, List.of(MythicBlocks.DEEPSLATE_TOPAZ_ORE), RecipeCategory.MISC, RegisterMythicItems.TOPAZ,
                3.0f, 100, "topaz");

        offerSmelting(exporter, List.of(MythicBlocks.AMETRINE_ORE), RecipeCategory.MISC, RegisterMythicItems.AMETRINE,
                3.0f, 200, "ametrine");
        offerBlasting(exporter, List.of(MythicBlocks.AMETRINE_ORE), RecipeCategory.MISC, RegisterMythicItems.AMETRINE,
                3.0f, 100, "ametrine");

        offerSmelting(exporter, List.of(MythicBlocks.AQUAMARINE_ORE), RecipeCategory.MISC, RegisterMythicItems.AQUAMARINE,
                3.0f, 200, "aquamarine");
        offerBlasting(exporter, List.of(MythicBlocks.AQUAMARINE_ORE), RecipeCategory.MISC, RegisterMythicItems.AQUAMARINE,
                3.0f, 100, "aquamarine");
        offerSmelting(exporter, List.of(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE), RecipeCategory.MISC, RegisterMythicItems.AQUAMARINE,
                3.0f, 200, "aquamarine");
        offerBlasting(exporter, List.of(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE), RecipeCategory.MISC, RegisterMythicItems.AQUAMARINE,
                3.0f, 100, "aquamarine");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.SAPPHIRE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.SAPPHIRE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.RUBY_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.RUBY_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.JADE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.JADE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.TOPAZ_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.TOPAZ_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.AMETRINE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.AMETRINE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, RegisterMythicItems.AQUAMARINE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.AQUAMARINE_BLOCK);
    }
}
