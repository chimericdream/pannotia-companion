package com.chimericdream.pannotiacompanion.mixin;

import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MobEntity.class)
abstract public class MobEntityMixin {
    public boolean isForeverBaby = false;

    @Inject(method = "interactWithItem", at = @At("TAIL"), cancellable = true)
    public void pc$interactWithItem(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> info) {
        //noinspection DataFlowIssue
        if (!((MobEntity) (Object) this).isBaby()) {
            return;
        }

        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.POISONOUS_POTATO)) {
            this.isForeverBaby = true;

            itemStack.decrement(1);
            //noinspection DataFlowIssue
            info.setReturnValue(ActionResult.success(((MobEntity) (Object) this).getWorld().isClient));
        }
    }
}
