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
    public CitrineConfig citrineConfig = new CitrineConfig();
    @Nest
    public PeridotConfig peridotConfig = new PeridotConfig();
    @Nest
    public ZirconConfig zirconConfig = new ZirconConfig();
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
        @RangeConstraint(min = 0, max = 4)
        public int ocean_shield_amplifier = 2;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 1f, max = 5f)
        public float ocean_shield_duration = 3f;
    }

    public static class CitrineConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 1f, max = 10f)
        public float hindering_duration = 5f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int hindering_amplifier = 0;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int weapons_weakness_amplifier = 0;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int weapons_slowness_amplifier = 0;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int weapons_hunger_amplifier = 0;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 2f, max = 7f)
        public float weapons_weakness_duration = 5f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 2f, max = 7f)
        public float weapons_slowness_duration = 5f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 2f, max = 7f)
        public float weapons_hunger_duration = 5f;
    }

    public static class PeridotConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 3f)
        public float weapons_poison_duration = 1.5f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 5)
        public int weapons_poison_amplifier = 2;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 7f)
        public float poisonous_thorns_poison_duration = 5f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int poisonous_thorns_amplifier = 0;
    }

    public static class ZirconConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 1f)
        public float weapons_freeze_duration = 0.5f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 3f)
        public float ice_shield_duration = 1.0f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int ice_shield_amplifier = 2;
    }

    public static class RubyConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int tools_haste_amplifier = 0;
    }

    public static class SapphireConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 1, max = 7)
        public int weapons_percentage_damage_percent = 5;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int damage_deflection_amplifier = 2;
    }

    public static class TopazConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 6)
        public int item_mastery_amplifier = 4;
    }

    public static class AmetrineConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 2f)
        public float weapons_levitation_duration = 0.75f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 4, max = 6)
        public int weapons_levitation_amplifier = 4;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.5f, max = 3f)
        public float arcane_aura_duration = 0.75f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int arcane_aura_amplifier = 2;
    }

    public static class JadeConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int speed_amplifier = 2;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int jump_boost_amplifier = 2;
    }
}