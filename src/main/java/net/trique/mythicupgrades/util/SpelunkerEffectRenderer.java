package net.trique.mythicupgrades.util;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.minecraft.client.Camera;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.core.BlockPos;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.trique.mythicupgrades.effect.MUEffects;
import org.joml.Vector3f;

import java.util.ArrayList;
import java.util.List;


public class SpelunkerEffectRenderer {
    private static final List<BlockPos> ORES_HIGHLIGHT_POSITIONS = new ArrayList<>();

    public static void clientFillRenderPositions(LocalPlayer player) {
        if (player != null) {
            if (player.hasEffect(MUEffects.SPELUNKER)) {
                updateOresList(player.getOnPos().above(), player.level(), player.getEffect(MUEffects.SPELUNKER).getAmplifier());
            } else {
                ORES_HIGHLIGHT_POSITIONS.clear();
            }
        }
    }


    private static void updateOresList(BlockPos startPos, Level level, int amplifier) {
        ORES_HIGHLIGHT_POSITIONS.clear();
        int radius = getRadius(amplifier);
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos pos = startPos.offset(x, y, z);
                    BlockState state = level.getBlockState(pos);
                    if (state.is(MUBlockTags.SPELUNKER_OUTLINED)) {
                        ORES_HIGHLIGHT_POSITIONS.add(pos);
                    }
                }
            }
        }
    }

    public static void render(WorldRenderContext context) {
        renderOres(context);
    }


    private static void renderOres(WorldRenderContext context) {
        PoseStack stack = context.matrixStack();
        if (stack != null) {
            Camera cam = context.camera();
            RenderSystem.disableDepthTest();
            RenderSystem.disableCull();
            PoseStack posestack = RenderSystem.getModelViewStack();
            posestack.pushPose();
            posestack.mulPoseMatrix(stack.last().pose());
            RenderSystem.applyModelViewMatrix();
            RenderSystem.setShader(GameRenderer::getRendertypeLinesShader);
            BufferBuilder bufferBuilder = Tesselator.getInstance().getBuilder();
            RenderSystem.lineWidth(2f);
            bufferBuilder.begin(VertexFormat.Mode.LINES, DefaultVertexFormat.POSITION_COLOR_NORMAL);
            for (BlockPos pos : ORES_HIGHLIGHT_POSITIONS) {
                Vector3f cameraPos = cam.getPosition().toVector3f();
                float posx = pos.getX() - cameraPos.x();
                float posy = pos.getY() - cameraPos.y();
                float posz = pos.getZ() - cameraPos.z();
                renderBlock(bufferBuilder, posx, posy, posz);
            }
            Tesselator.getInstance().end();
            posestack.popPose();
            RenderSystem.applyModelViewMatrix();
        }
    }

    private static void renderBlock(BufferBuilder builder, float x, float y, float z) {
        int [][] offsets = {
                {0, 0, 0}, {0, 1, 0}, {0, 0, 0}, {1, 0, 0},
                {0, 0, 0}, {0, 0, 1}, {0, 1, 0}, {0, 1, 1},
                {0, 1, 0}, {1, 1, 0}, {1, 1, 1}, {1, 1, 0},
                {1, 1, 1}, {0, 1, 1}, {1, 1, 1}, {1, 0, 1},
                {1, 0, 1}, {0, 0, 1}, {1, 0, 1}, {1, 0, 0},
                {0, 0, 1}, {0, 1, 1}, {1, 0, 0}, {1, 1, 0}
        };

        int [][] normals = {
                {0, 1, 0}, {0, -1, 0}, {1, 0, 0}, {-1, 0, 0},
                {0, 0, 1}, {0, 0, -1}, {0, 0, 1}, {0, 0, -1},
                {1, 0, 0}, {-1, 0, 0}, {0, 0, -1}, {0, 0, 1},
                {-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0},
                {-1, 0, 0}, {1, 0, 0}, {0, 0, -1}, {0, 0, 1},
                {0, 1, 0}, {0, -1, 0}, {0, 1, 0}, {0, -1, 0}
        };

        for (int i = 0; i < offsets.length; i++) {
            builder.vertex(x + offsets[i][0], y + offsets[i][1], z + offsets[i][2])
                    .color(255, 0, 0, 255)
                    .normal(normals[i][0], normals[i][1], normals[i][2]).endVertex();
        }
    }


    public static int getRadius(int amplifier) {
        return 2 * (amplifier + 1);
    }
}
