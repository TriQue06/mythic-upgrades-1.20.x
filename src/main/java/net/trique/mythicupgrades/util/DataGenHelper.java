package net.trique.mythicupgrades.util;

import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import org.jetbrains.annotations.Nullable;
import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItemPredicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

import static net.trique.mythicupgrades.util.CommonFunctions.getId;

public class DataGenHelper {
    public static void offerShapelessRecipeWithMultipleInputs(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, List<ItemConvertible> inputs, @Nullable String group, int outputCount) {
        offerShapelessRecipeWithMultipleInputsAndKeyItems(exporter, output, inputs, inputs, group, outputCount);
    }

    public static void offerCustomUpgradeRecipe(Consumer<RecipeJsonProvider> exporter, Item template, Item input, Item itemMaterialUpgrade, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(template), Ingredient.ofItems(input), Ingredient.ofItems(itemMaterialUpgrade), category, result).
                criterion(RecipeProvider.hasItem(() -> itemMaterialUpgrade), RecipeProvider.conditionsFromItem(itemMaterialUpgrade)).offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing");
    }

    public static void offerCustomSmithingTemplateCopyingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible template, ItemConvertible duplicationMaterial, ItemConvertible resource) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, template, 2).input('#', duplicationMaterial).input('C', resource).input('S', template).pattern("#S#").pattern("#C#").pattern("###").
                criterion(RecipeProvider.hasItem(template), RecipeProvider.conditionsFromItem(template)).offerTo(exporter);
    }

    public static InventoryChangedCriterion.Conditions conditionsFromItems(ItemConvertible... items) {
        return conditionsFromItemPredicates(ItemPredicate.Builder.create().items(items).build());
    }

    public static void offerShapelessRecipeWithMultipleInputsAndKeyItems(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, List<ItemConvertible> inputs, List<ItemConvertible> keyItems, @Nullable String group, int outputCount) {
        ShapelessRecipeJsonBuilder builder = ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, outputCount);

        for (ItemConvertible itemConvertible : inputs) {
            builder = builder.input(itemConvertible);
        }
        builder = builder.criterion("has_necessary_ingredients", conditionsFromItems(fromList(keyItems))).group(group);
        builder.offerTo(exporter, getId(RecipeProvider.getItemPath(output) + "_shapeless"));
    }

    public static ItemConvertible [] fromList(List<ItemConvertible> list) {
        HashSet<ItemConvertible> crts = new HashSet<>();
        ArrayList<ItemConvertible> tmp = new ArrayList<>();
        for (ItemConvertible itemConvertible : list) {
            if (!crts.contains(itemConvertible)) {
                crts.add(itemConvertible);
                tmp.add(itemConvertible);
            }
        }
        ItemConvertible [] ans = new ItemConvertible[tmp.size()];
        tmp.toArray(ans);
        return ans;
    }
}
