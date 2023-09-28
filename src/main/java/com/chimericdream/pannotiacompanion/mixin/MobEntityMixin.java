package com.chimericdream.pannotiacompanion.mixin;

import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MobEntity.class)
abstract public class MobEntityMixin extends LivingEntityMixin {
    public boolean isForeverBaby = false;

    @Inject(method = "readCustomDataFromNbt", at = @At("TAIL"))
    public void pc$readCustomDataFromNbt(NbtCompound nbt, CallbackInfo info) {
        boolean makeEternalBaby = nbt.getBoolean("IsForeverBaby");
        if (makeEternalBaby) {
            this.isForeverBaby = true;
        }
    }

    @Inject(method = "interactWithItem", at = @At("TAIL"), cancellable = true)
    public void pc$interactWithItem(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> info) {
        if (!this.isBaby() || this.isForeverBaby) {
            return;
        }

        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.POISONOUS_POTATO)) {
            this.isForeverBaby = true;

            if (this.getWorld().isClient) {
                this.pc$showParticles();
                this.pc$PlaySound(player);
            }

            itemStack.decrement(1);
            info.setReturnValue(ActionResult.success(this.getWorld().isClient));
        }
    }

    private void pc$PlaySound(PlayerEntity player) {
        //noinspection DataFlowIssue
        this.getWorld().playSoundFromEntity(
            player,
            ((MobEntity) (Object) this),
            SoundEvents.ENTITY_GENERIC_EAT,
            SoundCategory.NEUTRAL,
            1.0F,
            1.0F
        );
    }

    private void pc$showParticles() {
        for(int i = 0; i < 20; ++i) {
            double d = this.random.nextGaussian() * 0.02;
            double e = this.random.nextGaussian() * 0.02;
            double f = this.random.nextGaussian() * 0.02;

            this.getWorld().addParticle(
                ParticleTypes.MYCELIUM,
                this.offsetX(1.0) - d * 10.0,
                this.getRandomBodyY() - e * 10.0,
                this.getParticleZ(1.0) - f * 10.0,
                d,
                e,
                f
            );
        }
    }
}
