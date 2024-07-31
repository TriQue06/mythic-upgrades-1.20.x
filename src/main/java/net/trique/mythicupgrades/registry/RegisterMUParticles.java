package net.trique.mythicupgrades.registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.trique.mythicupgrades.MythicUpgrades;

public class RegisterMUParticles {

    public static final SimpleParticleType PERCENT_PARTICLE = FabricParticleTypes.simple();


    public static void registerParticles() {
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, new ResourceLocation(MythicUpgrades.MOD_ID,
                "percent_particle"), PERCENT_PARTICLE);
    }
}
