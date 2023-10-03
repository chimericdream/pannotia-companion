package com.chimericdream.pannotiacompanion.recipes.pannotia;

import com.chimericdream.pannotiacompanion.ModInfo;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createStonecuttingRecipeJson;

public class StonecuttingRecipes {
    public static final Pair<Identifier, JsonObject> BRICK_SLAB_FROM_TERRACOTTA_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/brick_slab_from_terracotta_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "terracotta")),
            new Identifier("minecraft", "brick_slab"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> BRICK_STAIRS_FROM_TERRACOTTA_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/brick_stairs_from_terracotta_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "terracotta")),
            new Identifier("minecraft", "brick_stairs")
        )
    );

    public static final Pair<Identifier, JsonObject> BRICK_WALL_FROM_TERRACOTTA_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/brick_wall_from_terracotta_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "terracotta")),
            new Identifier("minecraft", "brick_wall")
        )
    );

    public static final Pair<Identifier, JsonObject> BRICKS_FROM_TERRACOTTA_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/bricks_from_terracotta_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "terracotta")),
            new Identifier("minecraft", "bricks")
        )
    );

    public static final Pair<Identifier, JsonObject> COBBLED_DEEPSLATE_FROM_DEEPSLATE_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/cobbled_deepslate_from_deepslate_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "deepslate")),
            new Identifier("minecraft", "cobbled_deepslate")
        )
    );

    public static final Pair<Identifier, JsonObject> COBBLESTONE_FROM_STONE_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/cobblestone_from_stone_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "stone")),
            new Identifier("minecraft", "cobblestone")
        )
    );

    public static final Pair<Identifier, JsonObject> NETHER_BRICKS_FROM_CHISELED_NETHER_BRICKS_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/nether_bricks_from_chiseled_nether_bricks_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "chiseled_nether_bricks")),
            new Identifier("minecraft", "nether_bricks")
        )
    );

    public static final Pair<Identifier, JsonObject> NETHER_BRICKS_FROM_CRACKED_NETHER_BRICKS_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/nether_bricks_from_cracked_nether_bricks_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "cracked_nether_bricks")),
            new Identifier("minecraft", "nether_bricks")
        )
    );

    public static final Pair<Identifier, JsonObject> QUARTZ_BLOCK_FROM_CHISELED_QUARTZ_BLOCK_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/quartz_block_from_chiseled_quartz_block_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "chiseled_quartz")),
            new Identifier("minecraft", "quartz_block")
        )
    );

    public static final Pair<Identifier, JsonObject> QUARTZ_BLOCK_FROM_SMOOTH_QUARTZ_BLOCK_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/quartz_block_from_smooth_quartz_block_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "smooth_quartz")),
            new Identifier("minecraft", "quartz_block")
        )
    );

    public static final Pair<Identifier, JsonObject> RED_SANDSTONE_FROM_CHISELED_RED_SANDSTONE_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/red_sandstone_from_chiseled_red_sandstone_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "chiseled_red_sandstone")),
            new Identifier("minecraft", "red_sandstone")
        )
    );

    public static final Pair<Identifier, JsonObject> RED_SANDSTONE_FROM_CUT_RED_SANDSTONE_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/red_sandstone_from_cut_red_sandstone_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "cut_red_sandstone")),
            new Identifier("minecraft", "red_sandstone")
        )
    );

    public static final Pair<Identifier, JsonObject> RED_SANDSTONE_FROM_SMOOTH_RED_SANDSTONE_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/red_sandstone_from_smooth_red_sandstone_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "smooth_red_sandstone")),
            new Identifier("minecraft", "red_sandstone")
        )
    );

    public static final Pair<Identifier, JsonObject> SANDSTONE_FROM_CHISELED_SANDSTONE_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/sandstone_from_chiseled_sandstone_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "chiseled_sandstone")),
            new Identifier("minecraft", "sandstone")
        )
    );

    public static final Pair<Identifier, JsonObject> SANDSTONE_FROM_CUT_SANDSTONE_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/sandstone_from_cut_sandstone_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "cut_sandstone")),
            new Identifier("minecraft", "sandstone")
        )
    );

    public static final Pair<Identifier, JsonObject> SANDSTONE_FROM_SMOOTH_SANDSTONE_STONECUTTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "stonecutting/sandstone_from_smooth_sandstone_stonecutting"),
        createStonecuttingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "smooth_sandstone")),
            new Identifier("minecraft", "sandstone")
        )
    );

    @SuppressWarnings("unchecked")
    public static final Pair<Identifier, JsonObject>[] STONECUTTING_RECIPES = new Pair[]{
        BRICK_SLAB_FROM_TERRACOTTA_STONECUTTING,
        BRICK_STAIRS_FROM_TERRACOTTA_STONECUTTING,
        BRICK_WALL_FROM_TERRACOTTA_STONECUTTING,
        BRICKS_FROM_TERRACOTTA_STONECUTTING,
        COBBLED_DEEPSLATE_FROM_DEEPSLATE_STONECUTTING,
        COBBLESTONE_FROM_STONE_STONECUTTING,
        NETHER_BRICKS_FROM_CHISELED_NETHER_BRICKS_STONECUTTING,
        NETHER_BRICKS_FROM_CRACKED_NETHER_BRICKS_STONECUTTING,
        QUARTZ_BLOCK_FROM_CHISELED_QUARTZ_BLOCK_STONECUTTING,
        QUARTZ_BLOCK_FROM_SMOOTH_QUARTZ_BLOCK_STONECUTTING,
        RED_SANDSTONE_FROM_CHISELED_RED_SANDSTONE_STONECUTTING,
        RED_SANDSTONE_FROM_CUT_RED_SANDSTONE_STONECUTTING,
        RED_SANDSTONE_FROM_SMOOTH_RED_SANDSTONE_STONECUTTING,
        SANDSTONE_FROM_CHISELED_SANDSTONE_STONECUTTING,
        SANDSTONE_FROM_CUT_SANDSTONE_STONECUTTING,
        SANDSTONE_FROM_SMOOTH_SANDSTONE_STONECUTTING
    };
}
