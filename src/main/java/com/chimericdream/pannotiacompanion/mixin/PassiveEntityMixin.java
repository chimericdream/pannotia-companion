package com.chimericdream.pannotiacompanion.mixin;

import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PassiveEntity.class)
abstract public class PassiveEntityMixin extends MobEntityMixin {
    private static final int FOREVER_BABY_AGE = -2147483648;

    @Shadow
    abstract public void setBreedingAge(int age);

    @Inject(method = "getBreedingAge", at = @At("HEAD"), cancellable = true)
    public void pc$getBreedingAge(CallbackInfoReturnable<Integer> info) {
        if (this.isForeverBaby) {
            info.setReturnValue(FOREVER_BABY_AGE);
        }
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("TAIL"))
    public void pc$readCustomDataFromNbt(NbtCompound nbt, CallbackInfo info) {
        boolean makeEternalBaby = nbt.getBoolean("IsForeverBaby");
        if (makeEternalBaby) {
            this.isForeverBaby = true;
            this.setBreedingAge(FOREVER_BABY_AGE);
        }
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("TAIL"))
    public void pc$writeCustomDataToNbt(NbtCompound nbt, CallbackInfo info) {
        if (this.isForeverBaby) {
            nbt.putInt("Age", FOREVER_BABY_AGE);
            nbt.putBoolean("IsForeverBaby", true);
        }
    }
}
