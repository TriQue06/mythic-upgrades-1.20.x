package net.trique.mythicupgrades.config;

import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.*;
import net.trique.mythicupgrades.MythicUpgrades;

@Modmenu(modId = MythicUpgrades.MOD_ID)

@Config(name = MythicUpgrades.MOD_ID + "-config", wrapperName = "MUConfig")
public class MUConfigModel {
    @Nest
    public AquamarineConfig aquamarineConfig = new AquamarineConfig();
    @Nest
    public PeridotConfig peridotConfig = new PeridotConfig();
    @Nest
    public RubyConfig rubyConfig = new RubyConfig();
    @Nest
    public SapphireConfig sapphireConfig = new SapphireConfig();
    @Nest
    public TopazConfig topazConfig = new TopazConfig();
    @Nest
    public AmetrineConfig ametrineConfig = new AmetrineConfig();
    @Nest
    public JadeConfig jadeConfig = new JadeConfig();

    public static class AquamarineConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 1f)
        public float tools_freeze_duration = 0.5f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 3f)
        public float ice_shield_slowness_duration = 1.0f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int ice_shield_amplifier = 2;
    }

    public static class PeridotConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int tools_effects_amplifier = 2;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 5f)
        public float tools_poison_duration = 3f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 20f)
        public float tools_nausea_duration = 12f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int poisonous_thorns_amplifier = 2;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 5f)
        public float poisonous_thorns_poison_duration = 3f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 20f)
        public float poisonous_thorns_nausea_duration = 9f;
    }

    public static class TopazConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 1f, max = 30f)
        public float topaz_tools_fire_seconds = 10f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 6)
        public int item_mastery_amplifier = 4;
    }

    public static class RubyConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int tools_haste_amplifier = 0;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 10)
        public int spelunker_amplifier = 5;
    }

    public static class SapphireConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 1f, max = 7f)
        public float tools_percentage_damage_percent = 5f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int damage_deflection_amplifier = 2;
    }

    public static class AmetrineConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 3f)
        public float tools_levitation_duration = 0.75f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 4, max = 6)
        public int tools_levitation_amplifier = 4;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.5f, max = 3f)
        public float arcane_aura_levitation_duration = 0.75f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int arcane_aura_amplifier = 2;
    }

    public static class JadeConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 5f)
        public float tools_bouncer_jump_boost_duration = 2f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 2, max = 6)
        public int tools_bouncer_amplifier = 4;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int speed_amplifier = 2;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int jump_boost_amplifier = 2;
    }
}