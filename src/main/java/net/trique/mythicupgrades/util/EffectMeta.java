package net.trique.mythicupgrades.util;

public class EffectMeta {
    private final int amplifier;
    private final int duration;
    private final boolean ambient;
    private final boolean showParticles;
    private final boolean showIcon;

    public EffectMeta(int duration, int amplifier, boolean ambient, boolean showParticles, boolean showIcon) {
        this.amplifier = amplifier;
        this.duration = duration;
        this.ambient = ambient;
        this.showParticles = showParticles;
        this.showIcon = showIcon;
    }

    public static EffectMeta fullyVisible(int duration, int amplifier) {
        return new EffectMeta(duration, amplifier, true, true, true);
    }

    public static EffectMeta partiallyVisible(int duration, int amplifier) {
        return new EffectMeta(duration, amplifier, true, false, true);
    }

    public int getAmplifier() {
        return amplifier;
    }
    public int getDuration() {
        return duration;
    }
    public boolean isAmbient() {
        return ambient;
    }
    public boolean shouldShowParticles() {
        return showParticles;
    }
    public boolean shouldShowIcon() {
        return showIcon;
    }
}