package net.trique.mythicupgrades.registry;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

import static net.trique.mythicupgrades.command.MUCommands.*;

public class RegisterMUCommands {
    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
                if (environment.includeDedicated) {
                    updateConfig(dispatcher);
                    restoreDefaultsAndReload(dispatcher);
                }
            }
        );
    }
}