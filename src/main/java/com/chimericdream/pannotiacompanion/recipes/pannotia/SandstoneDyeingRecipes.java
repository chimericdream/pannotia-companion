package com.chimericdream.pannotiacompanion.recipes.pannotia;

import com.chimericdream.pannotiacompanion.ModInfo;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createShapelessRecipeJson;

public class SandstoneDyeingRecipes {
    public static final Pair<Identifier, JsonObject> RED_SAND = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "red_sand"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "sand")),
                new Pair<>("item", new Identifier("minecraft", "sand")),
                new Pair<>("item", new Identifier("minecraft", "sand")),
                new Pair<>("item", new Identifier("minecraft", "sand")),
                new Pair<>("item", new Identifier("minecraft", "sand")),
                new Pair<>("item", new Identifier("minecraft", "sand")),
                new Pair<>("item", new Identifier("minecraft", "sand")),
                new Pair<>("item", new Identifier("minecraft", "sand")),
                new Pair<>("item", new Identifier("minecraft", "red_dye"))
            ),
            new Identifier("minecraft", "red_sand"),
            8
        )
    );

    public static final Pair<Identifier, JsonObject> RED_SANDSTONE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "red_sandstone"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "sandstone")),
                new Pair<>("item", new Identifier("minecraft", "sandstone")),
                new Pair<>("item", new Identifier("minecraft", "red_dye"))
            ),
            new Identifier("minecraft", "red_sandstone"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> SAND_FROM_RED_SAND = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "sand_from_red_sand"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "red_sand")),
                new Pair<>("item", new Identifier("minecraft", "red_sand")),
                new Pair<>("item", new Identifier("minecraft", "red_sand")),
                new Pair<>("item", new Identifier("minecraft", "red_sand")),
                new Pair<>("item", new Identifier("minecraft", "red_sand")),
                new Pair<>("item", new Identifier("minecraft", "red_sand")),
                new Pair<>("item", new Identifier("minecraft", "red_sand")),
                new Pair<>("item", new Identifier("minecraft", "red_sand")),
                new Pair<>("item", new Identifier("minecraft", "ice"))
            ),
            new Identifier("minecraft", "sand"),
            8
        )
    );

    public static final Pair<Identifier, JsonObject> SANDSTONE_FROM_RED_SANDSTONE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "sandstone_from_red_sandstone"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "red_sandstone")),
                new Pair<>("item", new Identifier("minecraft", "red_sandstone")),
                new Pair<>("item", new Identifier("minecraft", "ice"))
            ),
            new Identifier("minecraft", "sandstone"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> SMOOTH_RED_SANDSTONE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "smooth_red_sandstone"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "smooth_sandstone")),
                new Pair<>("item", new Identifier("minecraft", "smooth_sandstone")),
                new Pair<>("item", new Identifier("minecraft", "red_dye"))
            ),
            new Identifier("minecraft", "smooth_red_sandstone"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> SMOOTH_SANDSTONE_FROM_SMOOTH_RED_SANDSTONE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "smooth_sandstone_from_smooth_red_sandstone"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "smooth_red_sandstone")),
                new Pair<>("item", new Identifier("minecraft", "smooth_red_sandstone")),
                new Pair<>("item", new Identifier("minecraft", "ice"))
            ),
            new Identifier("minecraft", "smooth_sandstone"),
            2
        )
    );

    @SuppressWarnings("unchecked")
    public static final Pair<Identifier, JsonObject>[] SANDSTONE_DYEING_RECIPES = new Pair[]{
        RED_SAND,
        RED_SANDSTONE,
        SAND_FROM_RED_SAND,
        SANDSTONE_FROM_RED_SANDSTONE,
        SMOOTH_RED_SANDSTONE,
        SMOOTH_SANDSTONE_FROM_SMOOTH_RED_SANDSTONE
    };
}
