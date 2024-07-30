package net.trique.mythicupgrades.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.NotNull;

public class PercentParticle extends TextureSheetParticle {
    public PercentParticle(ClientLevel clientLevel, double d, double e, double f, double g, double h, double i) {
        super(clientLevel, d, e, f, 0.0, 0.0, 0.0);
        this.friction = 0.7F;
        this.gravity = 0.5F;
        this.xd *= 0.10000000149011612;
        this.yd *= 0.10000000149011612;
        this.zd *= 0.10000000149011612;
        this.xd += g * 0.4;
        this.yd += h * 0.4;
        this.zd += i * 0.4;
        this.rCol = 1f;
        this.gCol = 1f;
        this.bCol = 1f;
        this.quadSize *= 0.5F;
        this.lifetime = Math.max((int)(6.0 / (Math.random() * 0.8 + 0.6)), 1);
        this.hasPhysics = false;
        this.tick();
    }

    public float getQuadSize(float f) {
        return this.quadSize * Mth.clamp(((float)this.age + f) / (float)this.lifetime * 32.0F, 0.0F, 1.0F);
    }

    public void tick() {
        super.tick();
        this.gCol *= 0.96F;
        this.bCol *= 0.9F;
    }

    public @NotNull ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprite;

        public Provider(SpriteSet spriteSet) {
            this.sprite = spriteSet;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientLevel, double d, double e, double f, double g, double h, double i) {
            PercentParticle critParticle = new PercentParticle(clientLevel, d, e, f, g, h, i);
            critParticle.pickSprite(this.sprite);
            return critParticle;
        }
    }
}
