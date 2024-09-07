package net.trique.mythicupgrades.registry;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.trique.mythicupgrades.MythicUpgrades;

import java.util.Optional;

public class RegisterMUAdditionalResourcePacks {
    private static void registerResourcePack(ModContainer container, String id) {
        MythicUpgrades.LOGGER.info("Registering resource pack {}...", id);
        boolean result = ResourceManagerHelper.registerBuiltinResourcePack(ResourceLocation.fromNamespaceAndPath(MythicUpgrades.MOD_ID, id), container,
                Component.translatable("pack." + MythicUpgrades.MOD_ID + "." + id), ResourcePackActivationType.NORMAL);
        if (result){
            MythicUpgrades.LOGGER.info("Successfully registered resource pack {}.", id);
        } else
            MythicUpgrades.LOGGER.warn("Failed to register resource pack {}.", id);
    }


    public static void addPacks() {
        Optional<ModContainer> container = FabricLoader.getInstance().getModContainer(MythicUpgrades.MOD_ID);
        container.ifPresent(modContainer -> registerResourcePack(modContainer, "32x"));
    }
}
