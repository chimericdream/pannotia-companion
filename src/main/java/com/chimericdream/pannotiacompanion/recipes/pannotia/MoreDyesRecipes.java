package com.chimericdream.pannotiacompanion.recipes.pannotia;

import com.chimericdream.pannotiacompanion.ModInfo;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createShapelessRecipeJson;

public class MoreDyesRecipes {
    public static Pair<Identifier, JsonObject> BROWN_DYE_FROM_MUSHROOMS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "brown_dye_from_mushrooms"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "brown_mushroom"))),
            new Identifier("minecraft", "brown_dye")
        )
    );

    public static Pair<Identifier, JsonObject> CYAN_DYE_FROM_TWISTING_VINES = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "cyan_dye_from_twisting_vines"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "twisting_vines"))),
            new Identifier("minecraft", "cyan_dye")
        )
    );

    public static Pair<Identifier, JsonObject> GREEN_DYE_FROM_BIG_DRIPLEAF = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "green_dye_from_big_dripleaf"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "big_dripleaf"))),
            new Identifier("minecraft", "green_dye")
        )
    );

    public static Pair<Identifier, JsonObject> GREEN_DYE_FROM_YELLOW_AND_BLUE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "green_dye_from_yellow_and_blue"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "blue_dye")),
                new Pair<>("item", new Identifier("minecraft", "yellow_dye"))
            ),
            new Identifier("minecraft", "green_dye"),
            2
        )
    );

    public static Pair<Identifier, JsonObject> ORANGE_DYE_FROM_CARROT = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "orange_dye_from_carrot"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "carrot"))),
            new Identifier("minecraft", "orange_dye")
        )
    );
    @SuppressWarnings("unchecked")
    public static Pair<Identifier, JsonObject>[] DYE_RECIPES = new Pair[]{
        BROWN_DYE_FROM_MUSHROOMS,
        CYAN_DYE_FROM_TWISTING_VINES,
        GREEN_DYE_FROM_BIG_DRIPLEAF,
        GREEN_DYE_FROM_YELLOW_AND_BLUE,
        ORANGE_DYE_FROM_CARROT
    };
}
