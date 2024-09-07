package net.trique.mythicupgrades.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.world.entity.ExperienceOrb;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.trique.mythicupgrades.item.base.BaseMythicToolItem;
import net.trique.mythicupgrades.item.materials.MUToolMaterials;
import org.apache.commons.lang3.tuple.Pair;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;
import java.util.stream.Collectors;

@Mixin(BlockBehaviour.class)
public abstract class BlockBehaviourMixin {
    @ModifyReturnValue(method = "getDrops", at = @At(value = "RETURN"))
    private List<ItemStack> smeltLoot(List<ItemStack> original, BlockState blockState, LootParams.Builder builder) {
        ItemStack tool = builder.getParameter(LootContextParams.TOOL);
        if (tool.getItem() instanceof BaseMythicToolItem item &&
                item.getMythicMaterial().equals(MUToolMaterials.TOPAZ)) {
            List<Pair<ItemStack, Float>> list = original.stream().map(
                    stack -> builder.getLevel().getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SingleRecipeInput(stack), builder.getLevel())
                                    .map(holder -> {
                                        ItemStack result = holder.value().getResultItem(builder.getLevel().registryAccess()).copy();
                                        result.setCount(stack.getCount() * result.getCount());
                                        return Pair.of(result, holder.value().getExperience());
                                    })
                                    .filter(pair -> !pair.getLeft().isEmpty())
                                    .orElse(Pair.of(stack, 0.0F))
            ).toList();

            float xp = (float) list.stream().mapToDouble(Pair::getRight).sum();
            if (xp > 0.0F && builder.getOptionalParameter(LootContextParams.THIS_ENTITY) != null) {
                ExperienceOrb.award(builder.getLevel(), builder.getParameter(LootContextParams.THIS_ENTITY).position(), Math.round(xp));
            }

            return list.stream().map(Pair::getLeft).collect(Collectors.toCollection(ObjectArrayList::new));
        }
        return original;
    }
}
