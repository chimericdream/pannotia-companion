package com.chimericdream.pannotiacompanion.recipes.pannotia;

import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.chimericdream.pannotiacompanion.recipes.pannotia.CoralRecipes.CORAL_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.pannotia.MoreDyesRecipes.DYE_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.pannotia.PowderFromConcreteBlastingRecipes.POWDER_FROM_CONCRETE_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.pannotia.PowderToGlassRecipes.POWDER_TO_GLASS_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.pannotia.RawMetalBlastingRecipes.RAW_METAL_BLASTING_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.pannotia.SandstoneDyeingRecipes.SANDSTONE_DYEING_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.pannotia.StonecuttingRecipes.STONECUTTING_RECIPES;
import static com.chimericdream.pannotiacompanion.recipes.pannotia.UtilityRecipes.UTILITY_RECIPES;

public class PannotiaRecipes {
    public static final Pair<Identifier, JsonObject>[] PANNOTIA_ADDED_RECIPES;

    static {
        List<Pair<Identifier, JsonObject>> overrides = new ArrayList<>();

        overrides.addAll(Arrays.asList(CORAL_RECIPES));
        overrides.addAll(Arrays.asList(DYE_RECIPES));
        overrides.addAll(Arrays.asList(POWDER_FROM_CONCRETE_RECIPES));
        overrides.addAll(Arrays.asList(POWDER_TO_GLASS_RECIPES));
        overrides.addAll(Arrays.asList(RAW_METAL_BLASTING_RECIPES));
        overrides.addAll(Arrays.asList(SANDSTONE_DYEING_RECIPES));
        overrides.addAll(Arrays.asList(STONECUTTING_RECIPES));
        overrides.addAll(Arrays.asList(UTILITY_RECIPES));

        //noinspection unchecked
        PANNOTIA_ADDED_RECIPES = overrides.toArray(new Pair[0]);
    }
}
