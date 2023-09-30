package com.chimericdream.pannotiacompanion.mixin;

import com.google.gson.JsonElement;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Arrays;
import java.util.Map;

import static com.chimericdream.pannotiacompanion.recipes.PCRecipes.ALL_RECIPES;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {
    @SuppressWarnings("AmbiguousMixinReference")
    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        Arrays.stream(ALL_RECIPES).forEach((pair) -> {
            map.put(pair.getLeft(), pair.getRight());
        });
    }
}
