package net.trique.mythicupgrades.registry;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.effect.MythicEffects;

public class RegisterMythicEffects {
    public static void registerEffect(StatusEffect effect, String name) {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(MythicUpgrades.MOD_ID, name), effect);
    }
    public static void registerEffects() {
        registerEffect(MythicEffects.THORNS, "thorns");
        registerEffect(MythicEffects.FREEZE, "freeze");
    }
}
