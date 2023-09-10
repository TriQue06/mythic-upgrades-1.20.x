package net.trique.mythicupgrades.util;

public class EffectMeta {
    private int amplifier;
    private int duration;
    private boolean ambient;
    private boolean showParticles;
    private boolean showIcon;

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

    public void setAmplifier(int amplifier) {
        this.amplifier = amplifier;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isAmbient() {
        return ambient;
    }

    public void setAmbient(boolean ambient) {
        this.ambient = ambient;
    }

    public boolean shouldShowParticles() {
        return showParticles;
    }

    public void setShowParticles(boolean showParticles) {
        this.showParticles = showParticles;
    }

    public boolean shouldShowIcon() {
        return showIcon;
    }

    public void setShowIcon(boolean showIcon) {
        this.showIcon = showIcon;
    }
}
