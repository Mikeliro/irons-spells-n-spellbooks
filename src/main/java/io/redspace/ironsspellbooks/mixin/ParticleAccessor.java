package io.redspace.ironsspellbooks.mixin;

import net.minecraft.client.particle.Particle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Particle.class)
public interface ParticleAccessor {
    @Accessor("xo")
    void irons_spellbooks$xo(double xo);
    @Accessor("yo")
    void irons_spellbooks$yo(double yo);
    @Accessor("zo")
    void irons_spellbooks$zo(double zo);
    @Accessor("gravity")
    void irons_spellbooks$gravity(float x);
    @Accessor("stoppedByCollision")
    void irons_spellbooks$stoppedByCollision(boolean b);
    @Accessor("z")
    void irons_spellbooks$z(double z);
}
