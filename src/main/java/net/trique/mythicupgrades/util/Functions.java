package net.trique.mythicupgrades.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

public class Functions {
    public static ClientPlayerEntity getLocalPlayer() {
        return MinecraftClient.getInstance().player;
    }
}
