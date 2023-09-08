package net.trique.mythicupgrades.util;

public class EffectMeta {
    private Integer amplifier;
    private Integer duration;
    private boolean ambient;
    private boolean showParticles;
    private boolean showIcon;

    public EffectMeta(Integer amplifier, Integer duration, boolean ambient, boolean showParticles, boolean showIcon) {
        this.amplifier = amplifier;
        this.duration = duration;
        this.ambient = ambient;
        this.showParticles = showParticles;
        this.showIcon = showIcon;
    }

    public static EffectMeta nonPositive(Integer duration, Integer amplifier) {
        return new EffectMeta(duration, amplifier, true, true, true);
    }


    public static EffectMeta positive(Integer duration, Integer amplifier) {
        return new EffectMeta(duration, amplifier, true, true, true);
    }

    public Integer getAmplifier() {
        return amplifier;
    }

    public void setAmplifier(Integer amplifier) {
        this.amplifier = amplifier;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public boolean isAmbient() {
        return ambient;
    }

    public void setAmbient(boolean ambient) {
        this.ambient = ambient;
    }

    public boolean isShowParticles() {
        return showParticles;
    }

    public void setShowParticles(boolean showParticles) {
        this.showParticles = showParticles;
    }

    public boolean isShowIcon() {
        return showIcon;
    }

    public void setShowIcon(boolean showIcon) {
        this.showIcon = showIcon;
    }
}
