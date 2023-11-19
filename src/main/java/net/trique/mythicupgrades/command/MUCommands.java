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
                .then(
                        literal("config").then(literal("reload")
                                .executes(ctx -> {
                                    CONFIG.load();
                                    ctx.getSource().sendFeedback(() -> Text.literal("Successfully reloaded config!"), false);
                                    return Command.SINGLE_SUCCESS;
                                })
                        )
                )
        );

    }

    public static void restoreDefaultsAndReload(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal(MOD_ID)
                .requires(source -> source.hasPermissionLevel(4))
                .then(
                        literal("config").then(literal("restoreDefaults")
                                .executes(ctx -> {
                                    CONFIG.sapphireConfig.axe_percentage_damage_percent(5);
                                    CONFIG.sapphireConfig.sword_percentage_damage_percent(5);
                                    CONFIG.sapphireConfig.damage_deflection_amplifier(2);
                                    CONFIG.ametrineConfig.ametrine_armor_speed_amplifier(1);
                                    CONFIG.ametrineConfig.ametrine_armor_jump_boost_amplifier(1);
                                    CONFIG.rubyConfig.haste_pickaxe_amplifier(0);
                                    CONFIG.rubyConfig.haste_axe_amplifier(0);
                                    CONFIG.rubyConfig.haste_shovel_amplifier(0);
                                    CONFIG.rubyConfig.haste_sword_amplifier(0);
                                    CONFIG.rubyConfig.haste_hoe_amplifier(0);
                                    CONFIG.ametrineConfig.axe_levitation_duration(0.5f);
                                    CONFIG.ametrineConfig.axe_levitation_amplifier(4);
                                    CONFIG.ametrineConfig.sword_levitation_duration(0.5f);
                                    CONFIG.ametrineConfig.sword_levitation_amplifier(4);
                                    CONFIG.jadeConfig.axe_poison_duration(2f);
                                    CONFIG.jadeConfig.axe_poison_amplifier(2);
                                    CONFIG.jadeConfig.sword_poison_duration(2f);
                                    CONFIG.jadeConfig.sword_poison_amplifier(2);
                                    CONFIG.jadeConfig.poisonous_thorns_amplifier(2);
                                    CONFIG.jadeConfig.poisonous_thorns_poison_duration(3f);
                                    CONFIG.sapphireConfig.axe_percentage_damage_percent(5);
                                    CONFIG.sapphireConfig.sword_percentage_damage_percent(5);
                                    CONFIG.aquamarineConfig.axe_freeze_duration(1.25f);
                                    CONFIG.aquamarineConfig.axe_freeze_duration(1.25f);


                                    CONFIG.load();
                                    ctx.getSource().sendFeedback(() -> Text.literal("Successfully restored default values and reloaded config!"), false);
                                    return Command.SINGLE_SUCCESS;
                                }))
                )
        );
    }
}
