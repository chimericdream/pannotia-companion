package com.chimericdream.pannotiacompanion.recipes;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createShapedRecipeJson;

public class VanillaWoodRecipes {
    public static Pair<Identifier, JsonObject> ACACIA_WOOD = new Pair<>(
        new Identifier("minecraft", "acacia_wood"),
        makeWoodRecipe(new Identifier("minecraft", "acacia_log"), new Identifier("minecraft", "acacia_wood"))
    );
    public static Pair<Identifier, JsonObject> BIRCH_WOOD = new Pair<>(
        new Identifier("minecraft", "birch_wood"),
        makeWoodRecipe(new Identifier("minecraft", "birch_log"), new Identifier("minecraft", "birch_wood"))
    );
    public static Pair<Identifier, JsonObject> CHERRY_WOOD = new Pair<>(
        new Identifier("minecraft", "cherry_wood"),
        makeWoodRecipe(new Identifier("minecraft", "cherry_log"), new Identifier("minecraft", "cherry_wood"))
    );
    public static Pair<Identifier, JsonObject> CRIMSON_HYPHAE = new Pair<>(
        new Identifier("minecraft", "crimson_hyphae"),
        makeWoodRecipe(new Identifier("minecraft", "crimson_stem"), new Identifier("minecraft", "crimson_hyphae"))
    );
    public static Pair<Identifier, JsonObject> DARK_OAK_WOOD = new Pair<>(
        new Identifier("minecraft", "dark_oak_wood"),
        makeWoodRecipe(new Identifier("minecraft", "dark_oak_log"), new Identifier("minecraft", "dark_oak_wood"))
    );
    public static Pair<Identifier, JsonObject> JUNGLE_WOOD = new Pair<>(
        new Identifier("minecraft", "jungle_wood"),
        makeWoodRecipe(new Identifier("minecraft", "jungle_log"), new Identifier("minecraft", "jungle_wood"))
    );
    public static Pair<Identifier, JsonObject> MANGROVE_WOOD = new Pair<>(
        new Identifier("minecraft", "mangrove_wood"),
        makeWoodRecipe(new Identifier("minecraft", "mangrove_log"), new Identifier("minecraft", "mangrove_wood"))
    );
    public static Pair<Identifier, JsonObject> OAK_WOOD = new Pair<>(
        new Identifier("minecraft", "oak_wood"),
        makeWoodRecipe(new Identifier("minecraft", "oak_log"), new Identifier("minecraft", "oak_wood"))
    );
    public static Pair<Identifier, JsonObject> SPRUCE_WOOD = new Pair<>(
        new Identifier("minecraft", "spruce_wood"),
        makeWoodRecipe(new Identifier("minecraft", "spruce_log"), new Identifier("minecraft", "spruce_wood"))
    );
    public static Pair<Identifier, JsonObject> WARPED_HYPHAE = new Pair<>(
        new Identifier("minecraft", "warped_hyphae"),
        makeWoodRecipe(new Identifier("minecraft", "warped_stem"), new Identifier("minecraft", "warped_hyphae"))
    );

    public static Pair<Identifier, JsonObject> STRIPPED_ACACIA_WOOD = new Pair<>(
        new Identifier("minecraft", "stripped_acacia_wood"),
        makeWoodRecipe(new Identifier("minecraft", "stripped_acacia_log"), new Identifier("minecraft", "stripped_acacia_wood"))
    );
    public static Pair<Identifier, JsonObject> STRIPPED_BIRCH_WOOD = new Pair<>(
        new Identifier("minecraft", "stripped_birch_wood"),
        makeWoodRecipe(new Identifier("minecraft", "stripped_birch_log"), new Identifier("minecraft", "stripped_birch_wood"))
    );
    public static Pair<Identifier, JsonObject> STRIPPED_CHERRY_WOOD = new Pair<>(
        new Identifier("minecraft", "stripped_cherry_wood"),
        makeWoodRecipe(new Identifier("minecraft", "stripped_cherry_log"), new Identifier("minecraft", "stripped_cherry_wood"))
    );
    public static Pair<Identifier, JsonObject> STRIPPED_CRIMSON_HYPHAE = new Pair<>(
        new Identifier("minecraft", "stripped_crimson_hyphae"),
        makeWoodRecipe(new Identifier("minecraft", "stripped_crimson_stem"), new Identifier("minecraft", "stripped_crimson_hyphae"))
    );
    public static Pair<Identifier, JsonObject> STRIPPED_DARK_OAK_WOOD = new Pair<>(
        new Identifier("minecraft", "stripped_dark_oak_wood"),
        makeWoodRecipe(new Identifier("minecraft", "stripped_dark_oak_log"), new Identifier("minecraft", "stripped_dark_oak_wood"))
    );
    public static Pair<Identifier, JsonObject> STRIPPED_JUNGLE_WOOD = new Pair<>(
        new Identifier("minecraft", "stripped_jungle_wood"),
        makeWoodRecipe(new Identifier("minecraft", "stripped_jungle_log"), new Identifier("minecraft", "stripped_jungle_wood"))
    );
    public static Pair<Identifier, JsonObject> STRIPPED_MANGROVE_WOOD = new Pair<>(
        new Identifier("minecraft", "stripped_mangrove_wood"),
        makeWoodRecipe(new Identifier("minecraft", "stripped_mangrove_log"), new Identifier("minecraft", "stripped_mangrove_wood"))
    );
    public static Pair<Identifier, JsonObject> STRIPPED_OAK_WOOD = new Pair<>(
        new Identifier("minecraft", "stripped_oak_wood"),
        makeWoodRecipe(new Identifier("minecraft", "stripped_oak_log"), new Identifier("minecraft", "stripped_oak_wood"))
    );
    public static Pair<Identifier, JsonObject> STRIPPED_SPRUCE_WOOD = new Pair<>(
        new Identifier("minecraft", "stripped_spruce_wood"),
        makeWoodRecipe(new Identifier("minecraft", "stripped_spruce_log"), new Identifier("minecraft", "stripped_spruce_wood"))
    );
    public static Pair<Identifier, JsonObject> STRIPPED_WARPED_HYPHAE = new Pair<>(
        new Identifier("minecraft", "stripped_warped_hyphae"),
        makeWoodRecipe(new Identifier("minecraft", "stripped_warped_stem"), new Identifier("minecraft", "stripped_warped_hyphae"))
    );

    public static JsonObject makeWoodRecipe(Identifier log, Identifier wood) {
        return createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(log),
            Lists.newArrayList("item"),
            Lists.newArrayList("##", "##"),
            wood,
            4,
            "bark"
        );
    }

    public static Pair<Identifier, JsonObject>[] VANILLA_WOOD_RECIPES = new Pair[]{
        ACACIA_WOOD,
        BIRCH_WOOD,
        CHERRY_WOOD,
        CRIMSON_HYPHAE,
        DARK_OAK_WOOD,
        JUNGLE_WOOD,
        MANGROVE_WOOD,
        OAK_WOOD,
        SPRUCE_WOOD,
        WARPED_HYPHAE,

        STRIPPED_ACACIA_WOOD,
        STRIPPED_BIRCH_WOOD,
        STRIPPED_CHERRY_WOOD,
        STRIPPED_CRIMSON_HYPHAE,
        STRIPPED_DARK_OAK_WOOD,
        STRIPPED_JUNGLE_WOOD,
        STRIPPED_MANGROVE_WOOD,
        STRIPPED_OAK_WOOD,
        STRIPPED_SPRUCE_WOOD,
        STRIPPED_WARPED_HYPHAE,
    };
}
