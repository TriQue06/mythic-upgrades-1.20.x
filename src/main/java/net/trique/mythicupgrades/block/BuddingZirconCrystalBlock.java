package net.trique.mythicupgrades.block;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class BuddingZirconCrystalBlock
extends AmethystBlock {
    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingZirconCrystalBlock(Settings settings) {
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
        if (BuddingZirconCrystalBlock.canGrowIn(blockState)) {
            block = MUBlocks.SMALL_ZIRCON_CRYSTAL_BUD;
        } else if (blockState.isOf(MUBlocks.SMALL_ZIRCON_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
            block = MUBlocks.MEDIUM_ZIRCON_CRYSTAL_BUD;
        } else if (blockState.isOf(MUBlocks.MEDIUM_ZIRCON_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
            block = MUBlocks.LARGE_ZIRCON_CRYSTAL_BUD;
        } else if (blockState.isOf(MUBlocks.LARGE_ZIRCON_CRYSTAL_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
            block = MUBlocks.ZIRCON_CRYSTAL_CLUSTER;
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