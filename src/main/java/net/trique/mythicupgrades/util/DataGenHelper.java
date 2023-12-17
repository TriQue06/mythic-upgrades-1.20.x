package net.trique.mythicupgrades.util;

import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.data.server.recipe.*;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import org.jetbrains.annotations.Nullable;
import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItemPredicates;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DataGenHelper {
    public static void offerShapelessRecipeWithMultipleInputs(RecipeExporter exporter, ItemConvertible output, List<ItemConvertible> inputs, @Nullable String group, int outputCount) {
        offerShapelessRecipeWithMultipleInputsAndKeyItems(exporter, output, inputs, inputs, group, outputCount);
    }

    public static void offerCustomUpgradeRecipe(RecipeExporter exporter, Item template, Item input, Item itemMaterialUpgrade, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(template), Ingredient.ofItems(input), Ingredient.ofItems(itemMaterialUpgrade), category, result).
                criterion(RecipeProvider.hasItem(() -> itemMaterialUpgrade), RecipeProvider.conditionsFromItem(itemMaterialUpgrade)).offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing");
    }

    public static void offerCustomSmithingTemplateCopyingRecipe(RecipeExporter exporter, ItemConvertible template, ItemConvertible duplicationMaterial, ItemConvertible resource) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, template, 2).input('#', duplicationMaterial).input('C', resource).input('S', template).pattern("#S#").pattern("#C#").pattern("###").
                criterion(RecipeProvider.hasItem(template), RecipeProvider.conditionsFromItem(template)).offerTo(exporter);
    }

    public static AdvancementCriterion<InventoryChangedCriterion.Conditions> conditionsFromItems(ItemConvertible... items) {
        return conditionsFromItemPredicates(ItemPredicate.Builder.create().items(items).build());
    }

    public static void offerShapelessRecipeWithMultipleInputsAndKeyItems(RecipeExporter exporter, ItemConvertible output, List<ItemConvertible> inputs, List<ItemConvertible> keyItems, @Nullable String group, int outputCount) {
        ShapelessRecipeJsonBuilder builder = ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, outputCount);

        for (ItemConvertible itemConvertible : inputs) {
            builder = builder.input(itemConvertible);
        }
        builder = builder.criterion("has_necessary_ingredients", conditionsFromItems(fromList(keyItems))).group(group);
        builder.offerTo(exporter);
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


    public static LootTable.Builder addClusterDrops(BlockLootTableGenerator instance, Block block_drop, Item item_drop, float min_count, float max_count) {
        return BlockLootTableGenerator.dropsWithSilkTouch(block_drop, instance.applyExplosionDecay(block_drop, ItemEntry.builder(item_drop).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min_count, max_count))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
