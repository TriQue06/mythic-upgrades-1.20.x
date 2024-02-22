package net.trique.mythicupgrades.block;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.trique.mythicupgrades.MythicUpgrades;
import org.jetbrains.annotations.Nullable;

public class BuddingTopazCrystalBlock
extends AmethystBlock {
    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingTopazCrystalBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) != 0) {
            return;
        }
        Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
        BlockPos blockPos = pos.offset(direction);
        BlockState blockState = world.getBlockState(blockPos);
        Block block = null;
        if (BuddingTopazCrystalBlock.canGrowIn(blockState)) {
            block = MUBlocks.SMALL_TOPAZ_CRYSTAL_BUD;
        } else if (blockState.isOf(MUBlocks.SMALL_TOPAZ_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
            block = MUBlocks.MEDIUM_TOPAZ_CRYSTAL_BUD;
        } else if (blockState.isOf(MUBlocks.MEDIUM_TOPAZ_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
            block = MUBlocks.LARGE_TOPAZ_CRYSTAL_BUD;
        } else if (blockState.isOf(MUBlocks.LARGE_TOPAZ_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
            block = MUBlocks.TOPAZ_CRYSTAL_CLUSTER;
        }
        if (block != null) {
            BlockState blockState2 = (BlockState)((BlockState)block.getDefaultState().with(AmethystClusterBlock.FACING, direction)).with(AmethystClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
            world.setBlockState(blockPos, blockState2);
        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        // do it here rather than through loot tables to easily check for the config value
        super.afterBreak(world, player, pos, state, blockEntity, tool);
        if (MythicUpgrades.CONFIG.topazConfig.silk_touch_budding_crystal() && EnchantmentHelper.hasSilkTouch(tool)) {
            dropStack(world, pos, MUBlocks.BUDDING_TOPAZ_CRYSTAL.asItem().getDefaultStack());
        }
    }
}