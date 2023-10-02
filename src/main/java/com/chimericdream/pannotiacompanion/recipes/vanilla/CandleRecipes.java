package com.chimericdream.pannotiacompanion.recipes.vanilla;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createShapedRecipeJson;

public class CandleRecipes {
    public static final Pair<Identifier, JsonObject> BLACK_CANDLE = new Pair<>(
        new Identifier("minecraft", "black_candle"),
        makeCandleRecipe("black")
    );
    public static final Pair<Identifier, JsonObject> BLUE_CANDLE = new Pair<>(
        new Identifier("minecraft", "blue_candle"),
        makeCandleRecipe("blue")
    );
    public static final Pair<Identifier, JsonObject> BROWN_CANDLE = new Pair<>(
        new Identifier("minecraft", "brown_candle"),
        makeCandleRecipe("brown")
    );
    public static final Pair<Identifier, JsonObject> CYAN_CANDLE = new Pair<>(
        new Identifier("minecraft", "cyan_candle"),
        makeCandleRecipe("cyan")
    );
    public static final Pair<Identifier, JsonObject> GRAY_CANDLE = new Pair<>(
        new Identifier("minecraft", "gray_candle"),
        makeCandleRecipe("gray")
    );
    public static final Pair<Identifier, JsonObject> GREEN_CANDLE = new Pair<>(
        new Identifier("minecraft", "green_candle"),
        makeCandleRecipe("green")
    );
    public static final Pair<Identifier, JsonObject> LIGHT_BLUE_CANDLE = new Pair<>(
        new Identifier("minecraft", "light_blue_candle"),
        makeCandleRecipe("light_blue")
    );
    public static final Pair<Identifier, JsonObject> LIGHT_GRAY_CANDLE = new Pair<>(
        new Identifier("minecraft", "light_gray_candle"),
        makeCandleRecipe("light_gray")
    );
    public static final Pair<Identifier, JsonObject> LIME_CANDLE = new Pair<>(
        new Identifier("minecraft", "lime_candle"),
        makeCandleRecipe("lime")
    );
    public static final Pair<Identifier, JsonObject> MAGENTA_CANDLE = new Pair<>(
        new Identifier("minecraft", "magenta_candle"),
        makeCandleRecipe("magenta")
    );
    public static final Pair<Identifier, JsonObject> ORANGE_CANDLE = new Pair<>(
        new Identifier("minecraft", "orange_candle"),
        makeCandleRecipe("orange")
    );
    public static final Pair<Identifier, JsonObject> PINK_CANDLE = new Pair<>(
        new Identifier("minecraft", "pink_candle"),
        makeCandleRecipe("pink")
    );
    public static final Pair<Identifier, JsonObject> PURPLE_CANDLE = new Pair<>(
        new Identifier("minecraft", "purple_candle"),
        makeCandleRecipe("purple")
    );
    public static final Pair<Identifier, JsonObject> RED_CANDLE = new Pair<>(
        new Identifier("minecraft", "red_candle"),
        makeCandleRecipe("red")
    );
    public static final Pair<Identifier, JsonObject> WHITE_CANDLE = new Pair<>(
        new Identifier("minecraft", "white_candle"),
        makeCandleRecipe("white")
    );
    public static final Pair<Identifier, JsonObject> YELLOW_CANDLE = new Pair<>(
        new Identifier("minecraft", "yellow_candle"),
        makeCandleRecipe("yellow")
    );

    public static JsonObject makeCandleRecipe(String color) {
        return createShapedRecipeJson(
            Lists.newArrayList('#', 'D'),
            Lists.newArrayList(new Identifier("minecraft", "candles"), new Identifier("minecraft", color + "_dye")),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("###", "#D#", "###"),
            new Identifier("minecraft", color + "_candle"),
            8
        );
    }

    @SuppressWarnings("unchecked")
    public static final Pair<Identifier, JsonObject>[] CANDLE_RECIPES = new Pair[]{
        BLACK_CANDLE,
        BLUE_CANDLE,
        BROWN_CANDLE,
        CYAN_CANDLE,
        GRAY_CANDLE,
        GREEN_CANDLE,
        LIGHT_BLUE_CANDLE,
        LIGHT_GRAY_CANDLE,
        LIME_CANDLE,
        MAGENTA_CANDLE,
        ORANGE_CANDLE,
        PINK_CANDLE,
        PURPLE_CANDLE,
        RED_CANDLE,
        WHITE_CANDLE,
        YELLOW_CANDLE
    };
}
