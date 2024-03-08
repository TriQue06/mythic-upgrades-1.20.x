package net.trique.mythicupgrades.block;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class BuddingPeridotCrystalBlock
extends AmethystBlock {
    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingPeridotCrystalBlock(Settings settings) {
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
        if (BuddingPeridotCrystalBlock.canGrowIn(blockState)) {
            block = MUBlocks.SMALL_PERIDOT_CRYSTAL_BUD;
        } else if (blockState.isOf(MUBlocks.SMALL_PERIDOT_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
            block = MUBlocks.MEDIUM_PERIDOT_CRYSTAL_BUD;
        } else if (blockState.isOf(MUBlocks.MEDIUM_PERIDOT_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
            block = MUBlocks.LARGE_PERIDOT_CRYSTAL_BUD;
        } else if (blockState.isOf(MUBlocks.LARGE_PERIDOT_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
            block = MUBlocks.PERIDOT_CRYSTAL_CLUSTER;
        }
        if (block != null) {
            BlockState blockState2 = (BlockState)((BlockState)block.getDefaultState().with(AmethystClusterBlock.FACING, direction)).with(AmethystClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
            world.setBlockState(blockPos, blockState2);
        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }
}