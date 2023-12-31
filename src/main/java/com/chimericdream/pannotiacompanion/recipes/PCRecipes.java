package com.chimericdream.pannotiacompanion.recipes;

import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.chimericdream.pannotiacompanion.recipes.pannotia.PannotiaRecipes.PANNOTIA_ADDED_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.vanilla.VanillaRecipes.VANILLA_RECIPE_OVERRIDES;

public class PCRecipes {
    public static final Pair<Identifier, JsonObject>[] ALL_RECIPES;

    static {
        List<Pair<Identifier, JsonObject>> allRecipes = new ArrayList<>();

        allRecipes.addAll(Arrays.asList(VANILLA_RECIPE_OVERRIDES));
        allRecipes.addAll(Arrays.asList(PANNOTIA_ADDED_RECIPES));

        //noinspection unchecked
        ALL_RECIPES = allRecipes.toArray(new Pair[0]);
    }
}
