package com.chimericdream.pannotiacompanion.recipes.vanilla;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createShapedRecipeJson;

public class WoolRecipes {
    public static Pair<Identifier, JsonObject> BLACK_WOOL = new Pair<>(
        new Identifier("minecraft", "black_wool"),
        makeWoolRecipe("black")
    );
    public static Pair<Identifier, JsonObject> BLUE_WOOL = new Pair<>(
        new Identifier("minecraft", "blue_wool"),
        makeWoolRecipe("blue")
    );
    public static Pair<Identifier, JsonObject> BROWN_WOOL = new Pair<>(
        new Identifier("minecraft", "brown_wool"),
        makeWoolRecipe("brown")
    );
    public static Pair<Identifier, JsonObject> CYAN_WOOL = new Pair<>(
        new Identifier("minecraft", "cyan_wool"),
        makeWoolRecipe("cyan")
    );
    public static Pair<Identifier, JsonObject> GRAY_WOOL = new Pair<>(
        new Identifier("minecraft", "gray_wool"),
        makeWoolRecipe("gray")
    );
    public static Pair<Identifier, JsonObject> GREEN_WOOL = new Pair<>(
        new Identifier("minecraft", "green_wool"),
        makeWoolRecipe("green")
    );
    public static Pair<Identifier, JsonObject> LIGHT_BLUE_WOOL = new Pair<>(
        new Identifier("minecraft", "light_blue_wool"),
        makeWoolRecipe("light_blue")
    );
    public static Pair<Identifier, JsonObject> LIGHT_GRAY_WOOL = new Pair<>(
        new Identifier("minecraft", "light_gray_wool"),
        makeWoolRecipe("light_gray")
    );
    public static Pair<Identifier, JsonObject> LIME_WOOL = new Pair<>(
        new Identifier("minecraft", "lime_wool"),
        makeWoolRecipe("lime")
    );
    public static Pair<Identifier, JsonObject> MAGENTA_WOOL = new Pair<>(
        new Identifier("minecraft", "magenta_wool"),
        makeWoolRecipe("magenta")
    );
    public static Pair<Identifier, JsonObject> ORANGE_WOOL = new Pair<>(
        new Identifier("minecraft", "orange_wool"),
        makeWoolRecipe("orange")
    );
    public static Pair<Identifier, JsonObject> PINK_WOOL = new Pair<>(
        new Identifier("minecraft", "pink_wool"),
        makeWoolRecipe("pink")
    );
    public static Pair<Identifier, JsonObject> PURPLE_WOOL = new Pair<>(
        new Identifier("minecraft", "purple_wool"),
        makeWoolRecipe("purple")
    );
    public static Pair<Identifier, JsonObject> RED_WOOL = new Pair<>(
        new Identifier("minecraft", "red_wool"),
        makeWoolRecipe("red")
    );
    public static Pair<Identifier, JsonObject> WHITE_WOOL = new Pair<>(
        new Identifier("minecraft", "white_wool"),
        makeWoolRecipe("white")
    );
    public static Pair<Identifier, JsonObject> YELLOW_WOOL = new Pair<>(
        new Identifier("minecraft", "yellow_wool"),
        makeWoolRecipe("yellow")
    );

    public static JsonObject makeWoolRecipe(String color) {
        return createShapedRecipeJson(
            Lists.newArrayList('#', 'D'),
            Lists.newArrayList(new Identifier("minecraft", "wool"), new Identifier("minecraft", color + "_dye")),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("###", "#D#", "###"),
            new Identifier("minecraft", color + "_wool"),
            8
        );
    }

    public static Pair<Identifier, JsonObject>[] WOOL_RECIPES = new Pair[]{
        BLACK_WOOL,
        BLUE_WOOL,
        BROWN_WOOL,
        CYAN_WOOL,
        GRAY_WOOL,
        GREEN_WOOL,
        LIGHT_BLUE_WOOL,
        LIGHT_GRAY_WOOL,
        LIME_WOOL,
        MAGENTA_WOOL,
        ORANGE_WOOL,
        PINK_WOOL,
        PURPLE_WOOL,
        RED_WOOL,
        WHITE_WOOL,
        YELLOW_WOOL
    };
}
