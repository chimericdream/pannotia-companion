package com.chimericdream.pannotiacompanion.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(LivingEntity.class)
abstract public class LivingEntityMixin extends EntityMixin {
    @Shadow
    abstract public boolean isBaby();
}
