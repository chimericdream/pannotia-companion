package com.chimericdream.pannotiacompanion.recipes;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createShapedRecipeJson;

public class VanillaTrapdoorsRecipes {
    public static Pair<Identifier, JsonObject> ACACIA_TRAPDOOR = new Pair<>(
        new Identifier("minecraft", "acacia_trapdoor"),
        makeWoodenTrapdoorRecipe(new Identifier("minecraft", "acacia_planks"), new Identifier("minecraft", "acacia_trapdoor"))
    );
    public static Pair<Identifier, JsonObject> BIRCH_TRAPDOOR = new Pair<>(
        new Identifier("minecraft", "birch_trapdoor"),
        makeWoodenTrapdoorRecipe(new Identifier("minecraft", "birch_planks"), new Identifier("minecraft", "birch_trapdoor"))
    );
    public static Pair<Identifier, JsonObject> CHERRY_TRAPDOOR = new Pair<>(
        new Identifier("minecraft", "cherry_trapdoor"),
        makeWoodenTrapdoorRecipe(new Identifier("minecraft", "cherry_planks"), new Identifier("minecraft", "cherry_trapdoor"))
    );
    public static Pair<Identifier, JsonObject> CRIMSON_TRAPDOOR = new Pair<>(
        new Identifier("minecraft", "crimson_trapdoor"),
        makeWoodenTrapdoorRecipe(new Identifier("minecraft", "crimson_planks"), new Identifier("minecraft", "crimson_trapdoor"))
    );
    public static Pair<Identifier, JsonObject> DARK_OAK_TRAPDOOR = new Pair<>(
        new Identifier("minecraft", "dark_oak_trapdoor"),
        makeWoodenTrapdoorRecipe(new Identifier("minecraft", "dark_oak_planks"), new Identifier("minecraft", "dark_oak_trapdoor"))
    );
    public static Pair<Identifier, JsonObject> JUNGLE_TRAPDOOR = new Pair<>(
        new Identifier("minecraft", "jungle_trapdoor"),
        makeWoodenTrapdoorRecipe(new Identifier("minecraft", "jungle_planks"), new Identifier("minecraft", "jungle_trapdoor"))
    );
    public static Pair<Identifier, JsonObject> MANGROVE_TRAPDOOR = new Pair<>(
        new Identifier("minecraft", "mangrove_trapdoor"),
        makeWoodenTrapdoorRecipe(new Identifier("minecraft", "mangrove_planks"), new Identifier("minecraft", "mangrove_trapdoor"))
    );
    public static Pair<Identifier, JsonObject> OAK_TRAPDOOR = new Pair<>(
        new Identifier("minecraft", "oak_trapdoor"),
        makeWoodenTrapdoorRecipe(new Identifier("minecraft", "oak_planks"), new Identifier("minecraft", "oak_trapdoor"))
    );
    public static Pair<Identifier, JsonObject> SPRUCE_TRAPDOOR = new Pair<>(
        new Identifier("minecraft", "spruce_trapdoor"),
        makeWoodenTrapdoorRecipe(new Identifier("minecraft", "spruce_planks"), new Identifier("minecraft", "spruce_trapdoor"))
    );
    public static Pair<Identifier, JsonObject> WARPED_TRAPDOOR = new Pair<>(
        new Identifier("minecraft", "warped_trapdoor"),
        makeWoodenTrapdoorRecipe(new Identifier("minecraft", "warped_planks"), new Identifier("minecraft", "warped_trapdoor"))
    );

    public static JsonObject makeTrapdoorRecipe(Identifier planks, Identifier trapdoor) {
        return makeTrapdoorRecipe(planks, trapdoor, null);
    }

    public static JsonObject makeTrapdoorRecipe(Identifier planks, Identifier trapdoor, String group) {
        return createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(planks),
            Lists.newArrayList("item"),
            Lists.newArrayList("###", "###"),
            trapdoor,
            12,
            group
        );
    }

    public static JsonObject makeWoodenTrapdoorRecipe(Identifier planks, Identifier trapdoor) {
        return makeTrapdoorRecipe(planks, trapdoor, "wooden_trapdoor");
    }

    public static Pair<Identifier, JsonObject>[] VANILLA_TRAPDOORS_RECIPES = new Pair[]{
        ACACIA_TRAPDOOR,
        BIRCH_TRAPDOOR,
        CHERRY_TRAPDOOR,
        CRIMSON_TRAPDOOR,
        DARK_OAK_TRAPDOOR,
        JUNGLE_TRAPDOOR,
        MANGROVE_TRAPDOOR,
        OAK_TRAPDOOR,
        SPRUCE_TRAPDOOR,
        WARPED_TRAPDOOR,
    };
}
