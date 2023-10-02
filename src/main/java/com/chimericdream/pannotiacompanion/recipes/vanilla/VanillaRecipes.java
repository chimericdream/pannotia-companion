package com.chimericdream.pannotiacompanion.recipes.vanilla;

import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.chimericdream.pannotiacompanion.recipes.vanilla.CandleRecipes.CANDLE_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.vanilla.MiscRecipes.MISC_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.vanilla.StairsRecipes.STAIRS_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.vanilla.TrapdoorsRecipes.TRAPDOORS_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.vanilla.WoodRecipes.WOOD_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.vanilla.WoolRecipes.WOOL_RECIPES;

public class VanillaRecipes {
    public static final Pair<Identifier, JsonObject>[] VANILLA_RECIPE_OVERRIDES;

    static {
        List<Pair<Identifier, JsonObject>> overrides = new ArrayList<>();

        overrides.addAll(Arrays.asList(CANDLE_RECIPES));
        overrides.addAll(Arrays.asList(MISC_RECIPES));
        overrides.addAll(Arrays.asList(STAIRS_RECIPES));
        overrides.addAll(Arrays.asList(TRAPDOORS_RECIPES));
        overrides.addAll(Arrays.asList(WOOD_RECIPES));
        overrides.addAll(Arrays.asList(WOOL_RECIPES));

        //noinspection unchecked
        VANILLA_RECIPE_OVERRIDES = overrides.toArray(new Pair[0]);
    }
}
