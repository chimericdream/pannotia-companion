package com.chimericdream.pannotiacompanion.recipes.pannotia;

import com.chimericdream.pannotiacompanion.ModInfo;
import com.chimericdream.pannotiacompanion.recipes.RecipeHelpers;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createBlastingRecipeJson;

public class RawMetalBlastingRecipes {
    public static final Pair<Identifier, JsonObject> COPPER_BLOCK_FROM_RAW_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "raw_metal_blasting/copper_block_from_raw_blasting"),
        RecipeHelpers.createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "raw_copper_block")),
            new Identifier("minecraft", "copper_block"),
            1,
            100,
            0.7f
        )
    );

    public static final Pair<Identifier, JsonObject> GOLD_BLOCK_FROM_RAW_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "raw_metal_blasting/gold_block_from_raw_blasting"),
        RecipeHelpers.createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "raw_gold_block")),
            new Identifier("minecraft", "gold_block"),
            1,
            100,
            0.7f
        )
    );

    public static final Pair<Identifier, JsonObject> IRON_BLOCK_FROM_RAW_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "raw_metal_blasting/iron_block_from_raw_blasting"),
        RecipeHelpers.createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "raw_iron_block")),
            new Identifier("minecraft", "iron_block"),
            1,
            100,
            0.7f
        )
    );

    public static final Pair<Identifier, JsonObject> RAW_COPPER_FROM_BLOCK_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "raw_metal_blasting/raw_copper_from_block_blasting"),
        RecipeHelpers.createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "copper_block")),
            new Identifier("minecraft", "raw_copper_block"),
            1,
            100,
            0.7f
        )
    );

    public static final Pair<Identifier, JsonObject> RAW_COPPER_FROM_INGOT_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "raw_metal_blasting/raw_copper_from_ingot_blasting"),
        createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "copper_ingot")),
            new Identifier("minecraft", "raw_copper")
        )
    );

    public static final Pair<Identifier, JsonObject> RAW_GOLD_FROM_BLOCK_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "raw_metal_blasting/raw_gold_from_block_blasting"),
        RecipeHelpers.createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "gold_block")),
            new Identifier("minecraft", "raw_gold_block"),
            1,
            100,
            0.7f
        )
    );

    public static final Pair<Identifier, JsonObject> RAW_GOLD_FROM_INGOT_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "raw_metal_blasting/raw_gold_from_ingot_blasting"),
        createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "gold_ingot")),
            new Identifier("minecraft", "raw_gold")
        )
    );

    public static final Pair<Identifier, JsonObject> RAW_IRON_FROM_INGOT_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "raw_metal_blasting/raw_iron_from_ingot_blasting"),
        createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "iron_ingot")),
            new Identifier("minecraft", "raw_iron")
        )
    );

    public static final Pair<Identifier, JsonObject> RAW_IRON_FROM_BLOCK_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "raw_metal_blasting/raw_iron_from_block_blasting"),
        RecipeHelpers.createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "iron_block")),
            new Identifier("minecraft", "raw_iron_block"),
            1,
            100,
            0.7f
        )
    );

    @SuppressWarnings("unchecked")
    public static final Pair<Identifier, JsonObject>[] RAW_METAL_BLASTING_RECIPES = new Pair[]{
        COPPER_BLOCK_FROM_RAW_BLASTING,
        GOLD_BLOCK_FROM_RAW_BLASTING,
        IRON_BLOCK_FROM_RAW_BLASTING,
        RAW_COPPER_FROM_BLOCK_BLASTING,
        RAW_COPPER_FROM_INGOT_BLASTING,
        RAW_GOLD_FROM_BLOCK_BLASTING,
        RAW_GOLD_FROM_INGOT_BLASTING,
        RAW_IRON_FROM_BLOCK_BLASTING,
        RAW_IRON_FROM_INGOT_BLASTING
    };
}
