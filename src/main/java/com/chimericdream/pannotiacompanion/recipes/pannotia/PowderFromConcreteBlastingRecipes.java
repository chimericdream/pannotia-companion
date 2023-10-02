package com.chimericdream.pannotiacompanion.recipes.pannotia;

import com.chimericdream.pannotiacompanion.ModInfo;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createBlastingRecipeJson;

public class PowderFromConcreteBlastingRecipes {
    public static final Pair<Identifier, JsonObject> BLACK_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "black_concrete_powder"),
        makeRecipeJson("black")
    );

    public static final Pair<Identifier, JsonObject> BLUE_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "blue_concrete_powder"),
        makeRecipeJson("blue")
    );

    public static final Pair<Identifier, JsonObject> BROWN_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "brown_concrete_powder"),
        makeRecipeJson("brown")
    );

    public static final Pair<Identifier, JsonObject> CYAN_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "cyan_concrete_powder"),
        makeRecipeJson("cyan")
    );

    public static final Pair<Identifier, JsonObject> GRAY_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "gray_concrete_powder"),
        makeRecipeJson("gray")
    );

    public static final Pair<Identifier, JsonObject> GREEN_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "green_concrete_powder"),
        makeRecipeJson("green")
    );

    public static final Pair<Identifier, JsonObject> LIGHT_BLUE_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "light_blue_concrete_powder"),
        makeRecipeJson("light_blue")
    );

    public static final Pair<Identifier, JsonObject> LIGHT_GRAY_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "light_gray_concrete_powder"),
        makeRecipeJson("light_gray")
    );

    public static final Pair<Identifier, JsonObject> LIME_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "lime_concrete_powder"),
        makeRecipeJson("lime")
    );

    public static final Pair<Identifier, JsonObject> MAGENTA_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "magenta_concrete_powder"),
        makeRecipeJson("magenta")
    );

    public static final Pair<Identifier, JsonObject> ORANGE_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "orange_concrete_powder"),
        makeRecipeJson("orange")
    );

    public static final Pair<Identifier, JsonObject> PINK_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "pink_concrete_powder"),
        makeRecipeJson("pink")
    );

    public static final Pair<Identifier, JsonObject> PURPLE_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "purple_concrete_powder"),
        makeRecipeJson("purple")
    );

    public static final Pair<Identifier, JsonObject> RED_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "red_concrete_powder"),
        makeRecipeJson("red")
    );

    public static final Pair<Identifier, JsonObject> WHITE_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "white_concrete_powder"),
        makeRecipeJson("white")
    );

    public static final Pair<Identifier, JsonObject> YELLOW_CONCRETE_POWDER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "yellow_concrete_powder"),
        makeRecipeJson("yellow")
    );

    public static JsonObject makeRecipeJson(String color) {
        return createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", color + "_concrete")),
            new Identifier("minecraft", color + "_concrete_powder")
        );
    }

    @SuppressWarnings("unchecked")
    public static final Pair<Identifier, JsonObject>[] POWDER_FROM_CONCRETE_RECIPES = new Pair[]{
        BLACK_CONCRETE_POWDER,
        BLUE_CONCRETE_POWDER,
        BROWN_CONCRETE_POWDER,
        CYAN_CONCRETE_POWDER,
        GRAY_CONCRETE_POWDER,
        GREEN_CONCRETE_POWDER,
        LIGHT_BLUE_CONCRETE_POWDER,
        LIGHT_GRAY_CONCRETE_POWDER,
        LIME_CONCRETE_POWDER,
        MAGENTA_CONCRETE_POWDER,
        ORANGE_CONCRETE_POWDER,
        PINK_CONCRETE_POWDER,
        PURPLE_CONCRETE_POWDER,
        RED_CONCRETE_POWDER,
        WHITE_CONCRETE_POWDER,
        YELLOW_CONCRETE_POWDER
    };
}
