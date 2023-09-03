package net.trique.mythicupgrades.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;

public class MythicEffects {
    public static StatusEffect THORNS;
    public static StatusEffect FREEZE;

    public static StatusEffect registerThorns(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(MythicUpgrades.MOD_ID, name),
                new ThornsEffect(StatusEffectCategory.BENEFICIAL, 4699647));
    }
    public static StatusEffect registerFreeze(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(MythicUpgrades.MOD_ID, name),
                new FreezeEffect(StatusEffectCategory.HARMFUL, 0x45c1e0));
    }

        public static void registerEffects() {
            THORNS = registerThorns("thorns");
            FREEZE = registerFreeze("freeze");
    }
}
