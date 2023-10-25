package net.trique.mythicupgrades.data;

import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

public class MURecipeProvider {
    public static void offerShapelessRecipeWithMultipleInputs(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, List<ItemConvertible> inputs, @Nullable String group, int outputCount) {
        ShapelessRecipeJsonBuilder builder = ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, outputCount);
        HashSet<String> crts = new HashSet<>();
        for (ItemConvertible itemConvertible : inputs) {
            builder = builder.input(itemConvertible);
            if (!crts.contains(RecipeProvider.hasItem(itemConvertible))) {
                builder = builder.criterion(RecipeProvider.hasItem(itemConvertible), RecipeProvider.conditionsFromItem(itemConvertible));
                crts.add(RecipeProvider.hasItem(itemConvertible));
            }
        }
        builder = builder.group(group);
        builder.offerTo(exporter, RecipeProvider.getItemPath(output) + "_shapeless");
    }

    public static void offerCustomUpgradeRecipe(Consumer<RecipeJsonProvider> exporter, Item template, Item input, Item itemMaterialUpgrade, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(template), Ingredient.ofItems(input), Ingredient.ofItems(itemMaterialUpgrade), category, result).
                criterion(RecipeProvider.hasItem(() -> itemMaterialUpgrade), RecipeProvider.conditionsFromItem(itemMaterialUpgrade)).offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing");
    }

    public static void offerCustomSmithingTemplateCopyingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible template, ItemConvertible duplicationMaterial, ItemConvertible resource) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, template, 2).input('#', duplicationMaterial).input('C', resource).input('S', template).pattern("#S#").pattern("#C#").pattern("###").
                criterion(RecipeProvider.hasItem(template), RecipeProvider.conditionsFromItem(template)).offerTo(exporter);
    }
}
