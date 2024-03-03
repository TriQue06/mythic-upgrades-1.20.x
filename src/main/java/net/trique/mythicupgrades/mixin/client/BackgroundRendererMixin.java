package net.trique.mythicupgrades.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.trique.mythicupgrades.attributes.MUAttributes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BackgroundRenderer.class)
public abstract class BackgroundRendererMixin {

    @ModifyConstant(method = "applyFog", constant = @Constant(floatValue = 0.25F, ordinal = 0))
    private static float additionalEntityAttributes$modifyLavaVisibilityMinWithoutFireResistance(float original, Camera camera) {
        EntityAttributeInstance lavaVisibilityAttribute = MinecraftClient.getInstance().player.getAttributeInstance(MUAttributes.LAVA_VISIBILITY);
        if (lavaVisibilityAttribute == null) {
            return original;
        } else {
            if (lavaVisibilityAttribute.getBaseValue() != original) {
                lavaVisibilityAttribute.setBaseValue(original);
            }
            return original - (float) lavaVisibilityAttribute.getValue() * 0.25F;
        }
    }

    @ModifyConstant(method = "applyFog", constant = @Constant(floatValue = 1.0F, ordinal = 0))
    private static float additionalEntityAttributes$modifyLavaVisibilityMaxWithoutFireResistance(float original, Camera camera) {
        EntityAttributeInstance lavaVisibilityAttribute = MinecraftClient.getInstance().player.getAttributeInstance(MUAttributes.LAVA_VISIBILITY);
        if (lavaVisibilityAttribute == null) {
            return original;
        } else {
            if (lavaVisibilityAttribute.getBaseValue() != original) {
                lavaVisibilityAttribute.setBaseValue(original);
            }
            return (float) lavaVisibilityAttribute.getValue();
        }
    }

    @ModifyConstant(method = "applyFog", constant = @Constant(floatValue = 0.0F, ordinal = 0))
    private static float additionalEntityAttributes$modifyLavaVisibilityMinFireResistance(float original, Camera camera) {
        EntityAttributeInstance lavaVisibilityAttribute = MinecraftClient.getInstance().player.getAttributeInstance(MUAttributes.LAVA_VISIBILITY);
        if (lavaVisibilityAttribute == null) {
            return original;
        } else {
            if (lavaVisibilityAttribute.getBaseValue() != original) {
                lavaVisibilityAttribute.setBaseValue(original);
            }
            return original - (float) lavaVisibilityAttribute.getValue();
        }
    }

    @ModifyConstant(method = "applyFog", constant = @Constant(floatValue = 3.0F, ordinal = 0))
    private static float additionalEntityAttributes$modifyLavaVisibilityMaxWithFireResistance(float original, Camera camera) {
        EntityAttributeInstance lavaVisibilityAttribute = MinecraftClient.getInstance().player.getAttributeInstance(MUAttributes.LAVA_VISIBILITY);
        if (lavaVisibilityAttribute == null) {
            return original;
        } else {
            if (lavaVisibilityAttribute.getBaseValue() != original) {
                lavaVisibilityAttribute.setBaseValue(original);
            }
            return (float) lavaVisibilityAttribute.getValue();
        }
    }

    @ModifyConstant(method = "applyFog", constant = @Constant(floatValue = 96F, ordinal = 0))
    private static float additionalEntityAttributes$modifyWaterVisibility(float original, Camera camera) {
        EntityAttributeInstance waterVisibilityAttribute = MinecraftClient.getInstance().player.getAttributeInstance(MUAttributes.WATER_VISIBILITY);
        if (waterVisibilityAttribute == null) {
            return original;
        } else {
            if (waterVisibilityAttribute.getBaseValue() != original) {
                waterVisibilityAttribute.setBaseValue(original);
            }
            return (float) waterVisibilityAttribute.getValue();
        }
    }

}