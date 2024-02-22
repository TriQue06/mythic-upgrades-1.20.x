package net.trique.mythicupgrades.attributes;

import net.fabricmc.api.*;
import net.minecraft.entity.attribute.*;
import net.minecraft.registry.*;
import net.minecraft.util.*;

public class MUAttributes implements ModInitializer {

    public static final String MOD_ID = "mythicupgrades";

    /**
     * Controls the bonus damage dealt when dealing critical hits
     * By default, critical hits deal 1.5 times the damage, so the base value of this attribute is 0.5.
     * Adding a flat value of 0.5 will bump that value up to make critical hits deal 2x the damage, for example
     * Multiplying this attribute's value with a modifier value of 0.5 will increase the critical hit damage
     * by 50%, meaning it will add 50% of the base 50% bonus damage on top, resulting in a critical hit damage
     * multiplier of 75% (1.75x damage).
     */
    public static final EntityAttribute CRITICAL_BONUS_DAMAGE = register("player.critical_bonus_damage", 0.5, -1.0, 1024.0);

    /**
     * Controls the speed of the player when in water
     * The base value of this attribute is always set dynamically, therefore setting it via a command will have no effect.
     * For the sake of maneuverability and server performance it is capped at 1.
     * Stacks with dolphins grace and depth strider, albeit the latter has little felt effect at higher speeds.
     */
    public static final EntityAttribute WATER_SPEED = register("water_speed", 0.5, 0, 1);

    /**
     * Controls the vision of the player when in water by adjusting the fog distance
     */
    public static final EntityAttribute WATER_VISIBILITY = register("player.water_visibility", 96.0, 0, 1024.0);
    /**
     * Controls the speed of the player when in lava
     * The base value of this attribute is always set dynamically, therefore setting it via a command will have no effect.
     * For the sake of maneuverability and server performance it is capped at 1.
     * Negative values will make the player even slower with -1.0 resulting in being almost unable to move
     */
    public static final EntityAttribute LAVA_SPEED = register("generic.lava_speed", 0.5, 0, 1);

    /**
     * Controls the vision of the player when in lava by adjusting the fog distance
     */
    public static final EntityAttribute LAVA_VISIBILITY = register("player.lava_visibility", 1.0, 0, 1024.0);

    /**
     * Controls the dig speed of the player
     */
    public static final EntityAttribute DIG_SPEED = register("player.dig_speed", 0.0D, 0.0D, 2048.0D);

    /**
     * Modifies the experience dropped from mining blocks and killing mobs.
     * The default of 1.0 equals the vanilla drop amount, 0.0 will result in no xp drops altogether.
     */
    public static final EntityAttribute DROPPED_EXPERIENCE = register("player.dropped_experience", 1.0D, 0.0D, 1024.0D);


    private static EntityAttribute register(final String name, double base, double min, double max) {
        EntityAttribute attribute = new ClampedEntityAttribute("attribute.name." + MOD_ID + '.' + name, base, min, max).setTracked(true);
        return Registry.register(Registries.ATTRIBUTE, new Identifier(MOD_ID, name), attribute);
    }

    @Override
    public void onInitialize() {
    }
}