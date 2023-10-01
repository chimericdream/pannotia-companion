package com.chimericdream.pannotiacompanion.recipes.pannotia;

import com.chimericdream.pannotiacompanion.ModInfo;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createShapedRecipeJson;
import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createShapelessRecipeJson;

public class CoralRecipes {
    public static Pair<Identifier, JsonObject> BRAIN_CORAL_BLOCK = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "brain_coral_block"),
        makeCoralBlockRecipe("brain")
    );

    public static Pair<Identifier, JsonObject> BRAIN_CORAL_FAN_FROM_BRAIN_CORAL = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "brain_coral_fan_from_brain_coral"),
        makeCoralConversionRecipe("brain", false)
    );

    public static Pair<Identifier, JsonObject> BRAIN_CORAL_FROM_BRAIN_CORAL_FAN = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "brain_coral_from_brain_coral_fan"),
        makeCoralConversionRecipe("brain", true)
    );

    public static Pair<Identifier, JsonObject> BUBBLE_CORAL_BLOCK = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "bubble_coral_block"),
        makeCoralBlockRecipe("bubble")
    );

    public static Pair<Identifier, JsonObject> BUBBLE_CORAL_FAN_FROM_BUBBLE_CORAL = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "bubble_coral_fan_from_bubble_coral"),
        makeCoralConversionRecipe("bubble", false)
    );

    public static Pair<Identifier, JsonObject> BUBBLE_CORAL_FROM_BUBBLE_CORAL_FAN = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "bubble_coral_from_bubble_coral_fan"),
        makeCoralConversionRecipe("bubble", true)
    );

    public static Pair<Identifier, JsonObject> FIRE_CORAL_BLOCK = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "fire_coral_block"),
        makeCoralBlockRecipe("fire")
    );

    public static Pair<Identifier, JsonObject> FIRE_CORAL_FAN_FROM_FIRE_CORAL = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "fire_coral_fan_from_fire_coral"),
        makeCoralConversionRecipe("fire", false)
    );

    public static Pair<Identifier, JsonObject> FIRE_CORAL_FROM_FIRE_CORAL_FAN = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "fire_coral_from_fire_coral_fan"),
        makeCoralConversionRecipe("fire", true)
    );

    public static Pair<Identifier, JsonObject> HORN_CORAL_BLOCK = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "horn_coral_block"),
        makeCoralBlockRecipe("horn")
    );

    public static Pair<Identifier, JsonObject> HORN_CORAL_FAN_FROM_HORN_CORAL = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "horn_coral_fan_from_horn_coral"),
        makeCoralConversionRecipe("horn", false)
    );

    public static Pair<Identifier, JsonObject> HORN_CORAL_FROM_HORN_CORAL_FAN = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "horn_coral_from_horn_coral_fan"),
        makeCoralConversionRecipe("horn", true)
    );

    public static Pair<Identifier, JsonObject> TUBE_CORAL_BLOCK = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "tube_coral_block"),
        makeCoralBlockRecipe("tube")
    );

    public static Pair<Identifier, JsonObject> TUBE_CORAL_FAN_FROM_TUBE_CORAL = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "tube_coral_fan_from_tube_coral"),
        makeCoralConversionRecipe("tube", false)
    );

    public static Pair<Identifier, JsonObject> TUBE_CORAL_FROM_TUBE_CORAL_FAN = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "tube_coral_from_tube_coral_fan"),
        makeCoralConversionRecipe("tube", true)
    );

    public static JsonObject makeCoralBlockRecipe(String coralType) {
        return createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier(ModInfo.MOD_ID, coralType + "_coral")),
            Lists.newArrayList("tag"),
            Lists.newArrayList("##", "##"),
            new Identifier("minecraft", coralType + "_coral_block")
        );
    }

    public static JsonObject makeCoralConversionRecipe(String coralType, boolean inputIsFan) {
        String input = coralType + "_coral";
        String output = coralType + "_coral_fan";

        if (inputIsFan) {
            input = coralType + "_coral_fan";
            output = coralType + "_coral";
        }

        return createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", input))),
            new Identifier("minecraft", output)
        );
    }

    @SuppressWarnings("unchecked")
    public static Pair<Identifier, JsonObject>[] CORAL_RECIPES = new Pair[]{
        BRAIN_CORAL_BLOCK,
        BRAIN_CORAL_FAN_FROM_BRAIN_CORAL,
        BRAIN_CORAL_FROM_BRAIN_CORAL_FAN,
        BUBBLE_CORAL_BLOCK,
        BUBBLE_CORAL_FAN_FROM_BUBBLE_CORAL,
        BUBBLE_CORAL_FROM_BUBBLE_CORAL_FAN,
        FIRE_CORAL_BLOCK,
        FIRE_CORAL_FAN_FROM_FIRE_CORAL,
        FIRE_CORAL_FROM_FIRE_CORAL_FAN,
        HORN_CORAL_BLOCK,
        HORN_CORAL_FAN_FROM_HORN_CORAL,
        HORN_CORAL_FROM_HORN_CORAL_FAN,
        TUBE_CORAL_BLOCK,
        TUBE_CORAL_FAN_FROM_TUBE_CORAL,
        TUBE_CORAL_FROM_TUBE_CORAL_FAN
    };
}
