package net.trique.mythicupgrades.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;

public class MUSounds {

    public static SoundEvent SOOT = registerSoundEvent("soot");
    public static SoundEvent APPOMATTOX = registerSoundEvent("appomattox");
    public static SoundEvent FIERCE = registerSoundEvent("fierce");
    public static SoundEvent NELUMBO = registerSoundEvent("nelumbo");
    public static SoundEvent FLOW_OF_THE_ABYSS = registerSoundEvent("flow_of_the_abyss");
    public static SoundEvent TANKER_ON_THE_LEVANTINES = registerSoundEvent("tanker_on_the_levantines");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MythicUpgrades.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}