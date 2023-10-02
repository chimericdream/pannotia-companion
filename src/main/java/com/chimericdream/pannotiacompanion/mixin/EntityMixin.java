package com.chimericdream.pannotiacompanion.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Entity.class)
abstract public class EntityMixin {
    @Shadow
    protected Random random;
    @Shadow
    abstract public double offsetX(double widthScale);
    @Shadow
    abstract public double getRandomBodyY();
    @Shadow
    abstract public double getParticleZ(double widthScale);
    @Shadow
    abstract public World getWorld();
}
