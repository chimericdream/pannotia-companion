package com.chimericdream.pannotiacompanion.recipes;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.ArrayList;

/*
 * @see https://fabricmc.net/wiki/tutorial:dynamic_recipe_generation
 */
public class RecipeHelpers {
    public static JsonObject createShapelessRecipeJson(ArrayList<Pair<String, Identifier>> ingredients, Identifier output, int count, String group, String category) {
        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:crafting_shapeless");

        JsonArray ingredientsJson = new JsonArray();
        JsonObject individualIngredient;

        for (Pair<String, Identifier> ingredient : ingredients) {
            individualIngredient = new JsonObject();
            individualIngredient.addProperty(ingredient.getLeft(), ingredient.getRight().toString());
            ingredientsJson.add(individualIngredient);
        }

        json.add("ingredients", ingredientsJson);

        JsonObject result = new JsonObject();
        result.addProperty("item", output.toString());
        result.addProperty("count", count);
        json.add("result", result);

        if (group != null) {
            json.addProperty("group", group);
        }

        if (category != null) {
            json.addProperty("category", category);
        }

        return json;
    }

    public static JsonObject createShapelessRecipeJson(ArrayList<Pair<String, Identifier>> ingredients, Identifier output, int count, String group) {
        return createShapelessRecipeJson(ingredients, output, count, group, null);
    }

    public static JsonObject createShapelessRecipeJson(ArrayList<Pair<String, Identifier>> ingredients, Identifier output, int count) {
        return createShapelessRecipeJson(ingredients, output, count, null, null);
    }

    public static JsonObject createShapelessRecipeJson(ArrayList<Pair<String, Identifier>> ingredients, Identifier output, String group, String category) {
        return createShapelessRecipeJson(ingredients, output, 1, group, category);
    }

    public static JsonObject createShapelessRecipeJson(ArrayList<Pair<String, Identifier>> ingredients, Identifier output, String group) {
        return createShapelessRecipeJson(ingredients, output, 1, group, null);
    }

    public static JsonObject createShapelessRecipeJson(ArrayList<Pair<String, Identifier>> ingredients, Identifier output) {
        return createShapelessRecipeJson(ingredients, output, 1, null, null);
    }

    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output, int count, String group, String category) {
        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:crafting_shaped");

        JsonArray patternJson = new JsonArray();
        for (String s : pattern) {
            patternJson.add(s);
        }

        json.add("pattern", patternJson);

        JsonObject individualKey;
        JsonObject keyJson = new JsonObject();

        for (int i = 0; i < keys.size(); ++i) {
            individualKey = new JsonObject();
            individualKey.addProperty(type.get(i), items.get(i).toString());
            keyJson.add(keys.get(i) + "", individualKey);
        }

        json.add("key", keyJson);

        JsonObject result = new JsonObject();
        result.addProperty("item", output.toString());
        result.addProperty("count", count);
        json.add("result", result);

        if (group != null) {
            json.addProperty("group", group);
        }

        if (category != null) {
            json.addProperty("category", category);
        }

        return json;
    }

    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output, int count, String group) {
        return createShapedRecipeJson(keys, items, type, pattern, output, count, group, null);
    }

    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output, int count) {
        return createShapedRecipeJson(keys, items, type, pattern, output, count, null, null);
    }

    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output, String group, String category) {
        return createShapedRecipeJson(keys, items, type, pattern, output, 1, group, category);
    }

    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output, String group) {
        return createShapedRecipeJson(keys, items, type, pattern, output, 1, group, null);
    }

    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output) {
        return createShapedRecipeJson(keys, items, type, pattern, output, 1, null, null);
    }

    public static JsonObject createCookingRecipeJson(Identifier cookType, Pair<String, Identifier> ingredient, Identifier output, int cookingTime, float experience, String group, String category) {
        JsonObject json = new JsonObject();
        json.addProperty("type", cookType.toString());

        JsonObject ingredientJson = new JsonObject();
        ingredientJson.addProperty(ingredient.getLeft(), ingredient.getRight().toString());

        json.add("ingredient", ingredientJson);
        json.addProperty("result", output.toString());
        json.addProperty("cookingtime", cookingTime);
        json.addProperty("experience", experience);

        if (group != null) {
            json.addProperty("group", group);
        }

        if (category != null) {
            json.addProperty("category", category);
        }

        return json;
    }

    public static JsonObject createBlastingRecipeJson(Pair<String, Identifier> ingredient, Identifier output, int cookingTime, float experience, String group, String category) {
        return createCookingRecipeJson(new Identifier("minecraft", "blasting"), ingredient, output, cookingTime, experience, group, category);
    }

    public static JsonObject createBlastingRecipeJson(Pair<String, Identifier> ingredient, Identifier output, int cookingTime, float experience, String group) {
        return createBlastingRecipeJson(ingredient, output, cookingTime, experience, group, null);
    }

    public static JsonObject createBlastingRecipeJson(Pair<String, Identifier> ingredient, Identifier output, int cookingTime, float experience) {
        return createBlastingRecipeJson(ingredient, output, cookingTime, experience, null, null);
    }

    public static JsonObject createBlastingRecipeJson(Pair<String, Identifier> ingredient, Identifier output, int cookingTime) {
        return createBlastingRecipeJson(ingredient, output, cookingTime, 0.1f, null, null);
    }

    public static JsonObject createBlastingRecipeJson(Pair<String, Identifier> ingredient, Identifier output) {
        return createBlastingRecipeJson(ingredient, output, 100, 0.1f, null, null);
    }

    public static JsonObject createSmeltingRecipeJson(Pair<String, Identifier> ingredient, Identifier output, int cookingTime, float experience, String group, String category) {
        return createCookingRecipeJson(new Identifier("minecraft", "smelting"), ingredient, output, cookingTime, experience, group, category);
    }

    public static JsonObject createSmeltingRecipeJson(Pair<String, Identifier> ingredient, Identifier output, int cookingTime, float experience, String group) {
        return createSmeltingRecipeJson(ingredient, output, cookingTime, experience, group, null);
    }

    public static JsonObject createSmeltingRecipeJson(Pair<String, Identifier> ingredient, Identifier output, int cookingTime, float experience) {
        return createSmeltingRecipeJson(ingredient, output, cookingTime, experience, null, null);
    }

    public static JsonObject createSmeltingRecipeJson(Pair<String, Identifier> ingredient, Identifier output, int cookingTime) {
        return createSmeltingRecipeJson(ingredient, output, cookingTime, 0.1f, null, null);
    }

    public static JsonObject createSmeltingRecipeJson(Pair<String, Identifier> ingredient, Identifier output) {
        return createSmeltingRecipeJson(ingredient, output, 200, 0.1f, null, null);
    }

    public static JsonObject createStonecuttingRecipeJson(Pair<String, Identifier> ingredient, Identifier output, int count) {
        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:stonecutting");

        JsonObject ingredientJson = new JsonObject();
        ingredientJson.addProperty(ingredient.getLeft(), ingredient.getRight().toString());

        json.add("ingredient", ingredientJson);
        json.addProperty("result", output.toString());
        json.addProperty("count", count);

        return json;
    }

    public static JsonObject createStonecuttingRecipeJson(Pair<String, Identifier> ingredient, Identifier output) {
        return createStonecuttingRecipeJson(ingredient, output, 1);
    }
}
