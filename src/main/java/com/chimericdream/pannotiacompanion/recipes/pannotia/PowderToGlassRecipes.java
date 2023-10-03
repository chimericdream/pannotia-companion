package com.chimericdream.pannotiacompanion.recipes.pannotia;

import com.chimericdream.pannotiacompanion.ModInfo;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createSmeltingRecipeJson;

public class PowderToGlassRecipes {
    public static final Pair<Identifier, JsonObject> BLACK_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/black_stained_glass"),
        makeRecipeJson("black")
    );

    public static final Pair<Identifier, JsonObject> BLUE_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/blue_stained_glass"),
        makeRecipeJson("blue")
    );

    public static final Pair<Identifier, JsonObject> BROWN_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/brown_stained_glass"),
        makeRecipeJson("brown")
    );

    public static final Pair<Identifier, JsonObject> CYAN_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/cyan_stained_glass"),
        makeRecipeJson("cyan")
    );

    public static final Pair<Identifier, JsonObject> GRAY_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/gray_stained_glass"),
        makeRecipeJson("gray")
    );

    public static final Pair<Identifier, JsonObject> GREEN_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/green_stained_glass"),
        makeRecipeJson("green")
    );

    public static final Pair<Identifier, JsonObject> LIGHT_BLUE_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/light_blue_stained_glass"),
        makeRecipeJson("light_blue")
    );

    public static final Pair<Identifier, JsonObject> LIGHT_GRAY_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/light_gray_stained_glass"),
        makeRecipeJson("light_gray")
    );

    public static final Pair<Identifier, JsonObject> LIME_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/lime_stained_glass"),
        makeRecipeJson("lime")
    );

    public static final Pair<Identifier, JsonObject> MAGENTA_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/magenta_stained_glass"),
        makeRecipeJson("magenta")
    );

    public static final Pair<Identifier, JsonObject> ORANGE_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/orange_stained_glass"),
        makeRecipeJson("orange")
    );

    public static final Pair<Identifier, JsonObject> PINK_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/pink_stained_glass"),
        makeRecipeJson("pink")
    );

    public static final Pair<Identifier, JsonObject> PURPLE_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/purple_stained_glass"),
        makeRecipeJson("purple")
    );

    public static final Pair<Identifier, JsonObject> RED_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/red_stained_glass"),
        makeRecipeJson("red")
    );

    public static final Pair<Identifier, JsonObject> WHITE_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/white_stained_glass"),
        makeRecipeJson("white")
    );

    public static final Pair<Identifier, JsonObject> YELLOW_STAINED_GLASS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "powder_to_glass/yellow_stained_glass"),
        makeRecipeJson("yellow")
    );

    public static JsonObject makeRecipeJson(String color) {
        return createSmeltingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", color + "_concrete_powder")),
            new Identifier("minecraft", color + "_stained_glass")
        );
    }

    @SuppressWarnings("unchecked")
    public static final Pair<Identifier, JsonObject>[] POWDER_TO_GLASS_RECIPES = new Pair[]{
        BLACK_STAINED_GLASS,
        BLUE_STAINED_GLASS,
        BROWN_STAINED_GLASS,
        CYAN_STAINED_GLASS,
        GRAY_STAINED_GLASS,
        GREEN_STAINED_GLASS,
        LIGHT_BLUE_STAINED_GLASS,
        LIGHT_GRAY_STAINED_GLASS,
        LIME_STAINED_GLASS,
        MAGENTA_STAINED_GLASS,
        ORANGE_STAINED_GLASS,
        PINK_STAINED_GLASS,
        PURPLE_STAINED_GLASS,
        RED_STAINED_GLASS,
        WHITE_STAINED_GLASS,
        YELLOW_STAINED_GLASS
    };
}
