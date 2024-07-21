package net.trique.mythicupgrades.util;

import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.trique.mythicupgrades.MythicUpgrades;
import org.jetbrains.annotations.Nullable;
import static net.minecraft.data.recipes.RecipeProvider.inventoryTrigger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DataGenHelper {
    public static void offerShapelessRecipeWithMultipleInputs(RecipeOutput exporter, ItemLike output, List<ItemLike> inputs, @Nullable String group, int outputCount) {
        offerShapelessRecipeWithMultipleInputsAndKeyItems(exporter, output, inputs, inputs, group, outputCount);
    }

    public static void offerCustomUpgradeRecipe(RecipeOutput exporter, Item template, Item input, Item itemMaterialUpgrade, RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(template), Ingredient.of(input), Ingredient.of(itemMaterialUpgrade), category, result).
                unlocks(RecipeProvider.getHasName(() -> itemMaterialUpgrade), RecipeProvider.has(itemMaterialUpgrade)).save(exporter, ResourceLocation.fromNamespaceAndPath(MythicUpgrades.MOD_ID, RecipeProvider.getItemName(result) + "_smithing"));
    }

    public static void offerCustomSmithingTemplateCopyingRecipe(RecipeOutput exporter, ItemLike template, ItemLike duplicationMaterial, ItemLike resource) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, template, 2).define('#', duplicationMaterial).define('C', resource).define('S', template).pattern("#S#").pattern("#C#").pattern("###").
                unlockedBy(RecipeProvider.getHasName(template), RecipeProvider.has(template)).save(exporter);
    }

    public static Criterion<InventoryChangeTrigger.TriggerInstance> conditionsFromItems(ItemLike... items) {
        return inventoryTrigger(ItemPredicate.Builder.item().of(items).build());
    }

    public static void offerShapelessRecipeWithMultipleInputsAndKeyItems(RecipeOutput exporter, ItemLike output, List<ItemLike> inputs, List<ItemLike> keyItems, @Nullable String group, int outputCount) {
        ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, outputCount);

        for (ItemLike itemConvertible : inputs) {
            builder = builder.requires(itemConvertible);
        }
        builder = builder.unlockedBy("has_necessary_ingredients", conditionsFromItems(fromList(keyItems))).group(group);
        builder.save(exporter);
    }

    public static ItemLike [] fromList(List<ItemLike> list) {
        HashSet<ItemLike> crts = new HashSet<>();
        ArrayList<ItemLike> tmp = new ArrayList<>();
        for (ItemLike itemConvertible : list) {
            if (!crts.contains(itemConvertible)) {
                crts.add(itemConvertible);
                tmp.add(itemConvertible);
            }
        }
        ItemLike [] ans = new ItemLike[tmp.size()];
        tmp.toArray(ans);
        return ans;
    }
}