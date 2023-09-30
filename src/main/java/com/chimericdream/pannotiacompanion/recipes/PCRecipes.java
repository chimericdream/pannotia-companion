package com.chimericdream.pannotiacompanion.recipes;

import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.chimericdream.pannotiacompanion.recipes.VanillaCandleRecipes.VANILLA_CANDLE_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.VanillaMiscRecipes.VANILLA_MISC_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.VanillaStairsRecipes.VANILLA_STAIRS_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.VanillaTrapdoorsRecipes.VANILLA_TRAPDOORS_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.VanillaWoodRecipes.VANILLA_WOOD_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.VanillaWoolRecipes.VANILLA_WOOL_RECIPES;

public class PCRecipes {
    public static Pair<Identifier, JsonObject>[] RECIPE_OVERRIDES;

    static {
        List<Pair<Identifier, JsonObject>> recipeOverrides = new ArrayList<>();

        recipeOverrides.addAll(Arrays.asList(VANILLA_CANDLE_RECIPES));
        recipeOverrides.addAll(Arrays.asList(VANILLA_MISC_RECIPES));
        recipeOverrides.addAll(Arrays.asList(VANILLA_STAIRS_RECIPES));
        recipeOverrides.addAll(Arrays.asList(VANILLA_TRAPDOORS_RECIPES));
        recipeOverrides.addAll(Arrays.asList(VANILLA_WOOD_RECIPES));
        recipeOverrides.addAll(Arrays.asList(VANILLA_WOOL_RECIPES));

        //noinspection unchecked
        RECIPE_OVERRIDES = recipeOverrides.toArray(new Pair[0]);
    }
}
