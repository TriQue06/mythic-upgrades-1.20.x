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
                    CONFIG.aquamarineConfig.ocean_shield_amplifier(2);
                    CONFIG.aquamarineConfig.ocean_shield_duration(3f);
                    CONFIG.citrineConfig.hindering_amplifier(0);
                    CONFIG.citrineConfig.hindering_duration(5f);
                    CONFIG.citrineConfig.axe_weakness_amplifier(0);
                    CONFIG.citrineConfig.axe_weakness_duration(7f);
                    CONFIG.citrineConfig.axe_slowness_amplifier(0);
                    CONFIG.citrineConfig.axe_slowness_duration(7f);
                    CONFIG.citrineConfig.axe_hunger_amplifier(0);
                    CONFIG.citrineConfig.axe_hunger_duration(7f);
                    CONFIG.citrineConfig.sword_weakness_amplifier(0);
                    CONFIG.citrineConfig.sword_weakness_duration(7f);
                    CONFIG.citrineConfig.sword_slowness_amplifier(0);
                    CONFIG.citrineConfig.sword_slowness_duration(7f);
                    CONFIG.citrineConfig.sword_hunger_amplifier(0);
                    CONFIG.citrineConfig.sword_hunger_duration(7f);
                    CONFIG.peridotConfig.axe_poison_duration(1.5f);
                    CONFIG.peridotConfig.axe_poison_amplifier(2);
                    CONFIG.peridotConfig.sword_poison_duration(1.5f);
                    CONFIG.peridotConfig.sword_poison_amplifier(2);
                    CONFIG.peridotConfig.poisonous_thorns_amplifier(2);
                    CONFIG.peridotConfig.poisonous_thorns_poison_duration(3f);
                    CONFIG.sapphireConfig.axe_percentage_damage_percent(5);
                    CONFIG.sapphireConfig.sword_percentage_damage_percent(5);
                    CONFIG.sapphireConfig.damage_deflection_amplifier(2);
                    CONFIG.kyaniteConfig.axe_freeze_duration(0.5f);
                    CONFIG.kyaniteConfig.sword_freeze_duration(0.5f);
                    CONFIG.kyaniteConfig.ice_shield_duration(1.0f);
                    CONFIG.kyaniteConfig.ice_shield_amplifier(2);
                    CONFIG.rubyConfig.haste_pickaxe_amplifier(0);
                    CONFIG.rubyConfig.haste_axe_amplifier(0);
                    CONFIG.rubyConfig.haste_shovel_amplifier(0);
                    CONFIG.rubyConfig.haste_hoe_amplifier(0);
                    CONFIG.topazConfig.topaz_item_mastery_amplifier(4);
                    CONFIG.ametrineConfig.axe_levitation_duration(0.75f);
                    CONFIG.ametrineConfig.axe_levitation_amplifier(4);
                    CONFIG.ametrineConfig.sword_levitation_duration(0.75f);
                    CONFIG.ametrineConfig.sword_levitation_amplifier(4);
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