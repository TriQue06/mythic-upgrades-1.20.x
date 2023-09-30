package net.trique.mythicupgrades;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MythicUpgradeDamageTypes {
    public static final RegistryKey<DamageType> PIERCING_DAMAGE_TYPE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE,
            new Identifier("mythicupgrades", "piercing_damage_type"));
    public static final RegistryKey<DamageType> DEFLECTING_DAMAGE_TYPE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE,
            new Identifier("mythicupgrades", "deflecting_damage_type"));

    public static DamageSource create(World world, RegistryKey<DamageType> key, @Nullable Entity attacker) {
        return new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(key), attacker);
    }
}
