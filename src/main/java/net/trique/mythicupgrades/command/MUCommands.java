package net.trique.mythicupgrades.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import static net.trique.mythicupgrades.MythicUpgrades.*;
import static net.minecraft.server.command.CommandManager.*;

public class MUCommands {
    public static void updateConfig(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal(MOD_ID)
                .requires(source -> source.hasPermissionLevel(4))
                .then(literal("config").then(literal("reload").executes(ctx -> {
                     CONFIG.load();
                     ctx.getSource().sendFeedback(() -> Text.literal("Successfully reloaded config!"), false);
                     return Command.SINGLE_SUCCESS;
                })))
        );
    }

    public static void restoreDefaultsAndReload(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal(MOD_ID)
                .requires(source -> source.hasPermissionLevel(4))
                .then(literal("config").then(literal("restoreDefaults").executes(ctx -> {
                    CONFIG.aquamarineConfig.ice_shield_amplifier(2);
                    CONFIG.aquamarineConfig.ice_shield_duration(3f);
                    CONFIG.peridotConfig.tools_poison_duration(1.5f);
                    CONFIG.peridotConfig.tools_poison_amplifier(2);
                    CONFIG.peridotConfig.poisonous_thorns_amplifier(2);
                    CONFIG.peridotConfig.poisonous_thorns_poison_duration(3f);
                    CONFIG.topazConfig.item_mastery_amplifier(4);
                    CONFIG.rubyConfig.tools_haste_amplifier(0);
                    CONFIG.sapphireConfig.tools_percentage_damage_percent(5);
                    CONFIG.sapphireConfig.damage_deflection_amplifier(2);
                    CONFIG.ametrineConfig.tools_levitation_duration(0.75f);
                    CONFIG.ametrineConfig.tools_levitation_amplifier(4);
                    CONFIG.ametrineConfig.arcane_aura_amplifier(2);
                    CONFIG.ametrineConfig.arcane_aura_duration(0.5f);
                    CONFIG.jadeConfig.speed_amplifier(2);
                    CONFIG.jadeConfig.jump_boost_amplifier(2);
                    CONFIG.load();
                    ctx.getSource().sendFeedback(() -> Text.literal("Successfully restored default values and reloaded config!"), false);
                    return Command.SINGLE_SUCCESS;
                })))
        );
    }
}