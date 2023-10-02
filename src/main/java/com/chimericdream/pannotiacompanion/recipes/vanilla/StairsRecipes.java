package com.chimericdream.pannotiacompanion.recipes.vanilla;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createShapedRecipeJson;

public class StairsRecipes {
    public static final Pair<Identifier, JsonObject> ACACIA_STAIRS = new Pair<>(
        new Identifier("minecraft", "acacia_stairs"),
        makeWoodenStairsRecipe(new Identifier("minecraft", "acacia_planks"), new Identifier("minecraft", "acacia_stairs"))
    );
    public static final Pair<Identifier, JsonObject> ANDESITE_STAIRS = new Pair<>(
        new Identifier("minecraft", "andesite_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "andesite"), new Identifier("minecraft", "andesite_stairs"))
    );
    public static final Pair<Identifier, JsonObject> BAMBOO_STAIRS = new Pair<>(
        new Identifier("minecraft", "bamboo_stairs"),
        makeWoodenStairsRecipe(new Identifier("minecraft", "bamboo_planks"), new Identifier("minecraft", "bamboo_stairs"))
    );
    public static final Pair<Identifier, JsonObject> BIRCH_STAIRS = new Pair<>(
        new Identifier("minecraft", "birch_stairs"),
        makeWoodenStairsRecipe(new Identifier("minecraft", "birch_planks"), new Identifier("minecraft", "birch_stairs"))
    );
    public static final Pair<Identifier, JsonObject> BLACKSTONE_STAIRS = new Pair<>(
        new Identifier("minecraft", "blackstone_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "blackstone"), new Identifier("minecraft", "blackstone_stairs"))
    );
    public static final Pair<Identifier, JsonObject> BRICK_STAIRS = new Pair<>(
        new Identifier("minecraft", "brick_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "bricks"), new Identifier("minecraft", "brick_stairs"))
    );
    public static final Pair<Identifier, JsonObject> CHERRY_STAIRS = new Pair<>(
        new Identifier("minecraft", "cherry_stairs"),
        makeWoodenStairsRecipe(new Identifier("minecraft", "cherry_planks"), new Identifier("minecraft", "cherry_stairs"))
    );
    public static final Pair<Identifier, JsonObject> COBBLED_DEEPSLATE_STAIRS = new Pair<>(
        new Identifier("minecraft", "cobbled_deepslate_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "cobbled_deepslate"), new Identifier("minecraft", "cobbled_deepslate_stairs"))
    );
    public static final Pair<Identifier, JsonObject> COBBLESTONE_STAIRS = new Pair<>(
        new Identifier("minecraft", "cobblestone_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "cobblestone"), new Identifier("minecraft", "cobblestone_stairs"))
    );
    public static final Pair<Identifier, JsonObject> CRIMSON_STAIRS = new Pair<>(
        new Identifier("minecraft", "crimson_stairs"),
        makeWoodenStairsRecipe(new Identifier("minecraft", "crimson_planks"), new Identifier("minecraft", "crimson_stairs"))
    );
    public static final Pair<Identifier, JsonObject> CUT_COPPER_STAIRS = new Pair<>(
        new Identifier("minecraft", "cut_copper_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "cut_copper"), new Identifier("minecraft", "cut_copper_stairs"))
    );
    public static final Pair<Identifier, JsonObject> DARK_OAK_STAIRS = new Pair<>(
        new Identifier("minecraft", "dark_oak_stairs"),
        makeWoodenStairsRecipe(new Identifier("minecraft", "dark_oak_planks"), new Identifier("minecraft", "dark_oak_stairs"))
    );
    public static final Pair<Identifier, JsonObject> DARK_PRISMARINE_STAIRS = new Pair<>(
        new Identifier("minecraft", "dark_prismarine_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "dark_prismarine"), new Identifier("minecraft", "dark_prismarine_stairs"))
    );
    public static final Pair<Identifier, JsonObject> DEEPSLATE_BRICK_STAIRS = new Pair<>(
        new Identifier("minecraft", "deepslate_brick_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "deepslate_bricks"), new Identifier("minecraft", "deepslate_brick_stairs"))
    );
    public static final Pair<Identifier, JsonObject> DEEPSLATE_TILE_STAIRS = new Pair<>(
        new Identifier("minecraft", "deepslate_tile_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "deepslate_tiles"), new Identifier("minecraft", "deepslate_tile_stairs"))
    );
    public static final Pair<Identifier, JsonObject> DIORITE_STAIRS = new Pair<>(
        new Identifier("minecraft", "diorite_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "diorite"), new Identifier("minecraft", "diorite_stairs"))
    );
    public static final Pair<Identifier, JsonObject> END_STONE_BRICK_STAIRS = new Pair<>(
        new Identifier("minecraft", "end_stone_brick_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "end_stone_bricks"), new Identifier("minecraft", "end_stone_brick_stairs"))
    );
    public static final Pair<Identifier, JsonObject> EXPOSED_CUT_COPPER_STAIRS = new Pair<>(
        new Identifier("minecraft", "exposed_cut_copper_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "exposed_cut_copper"), new Identifier("minecraft", "exposed_cut_copper_stairs"))
    );
    public static final Pair<Identifier, JsonObject> GRANITE_STAIRS = new Pair<>(
        new Identifier("minecraft", "granite_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "granite"), new Identifier("minecraft", "granite_stairs"))
    );
    public static final Pair<Identifier, JsonObject> JUNGLE_STAIRS = new Pair<>(
        new Identifier("minecraft", "jungle_stairs"),
        makeWoodenStairsRecipe(new Identifier("minecraft", "jungle_planks"), new Identifier("minecraft", "jungle_stairs"))
    );
    public static final Pair<Identifier, JsonObject> MANGROVE_STAIRS = new Pair<>(
        new Identifier("minecraft", "mangrove_stairs"),
        makeWoodenStairsRecipe(new Identifier("minecraft", "mangrove_planks"), new Identifier("minecraft", "mangrove_stairs"))
    );
    public static final Pair<Identifier, JsonObject> MOSSY_COBBLESTONE_STAIRS = new Pair<>(
        new Identifier("minecraft", "mossy_cobblestone_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "mossy_cobblestone"), new Identifier("minecraft", "mossy_cobblestone_stairs"))
    );
    public static final Pair<Identifier, JsonObject> MOSSY_STONE_BRICK_STAIRS = new Pair<>(
        new Identifier("minecraft", "mossy_stone_brick_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "mossy_stone_bricks"), new Identifier("minecraft", "mossy_stone_brick_stairs"))
    );
    public static final Pair<Identifier, JsonObject> MUD_BRICK_STAIRS = new Pair<>(
        new Identifier("minecraft", "mud_brick_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "mud_bricks"), new Identifier("minecraft", "mud_brick_stairs"))
    );
    public static final Pair<Identifier, JsonObject> NETHER_BRICK_STAIRS = new Pair<>(
        new Identifier("minecraft", "nether_brick_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "nether_bricks"), new Identifier("minecraft", "nether_brick_stairs"))
    );
    public static final Pair<Identifier, JsonObject> OAK_STAIRS = new Pair<>(
        new Identifier("minecraft", "oak_stairs"),
        makeWoodenStairsRecipe(new Identifier("minecraft", "oak_planks"), new Identifier("minecraft", "oak_stairs"))
    );
    public static final Pair<Identifier, JsonObject> OXIDIZED_CUT_COPPER_STAIRS = new Pair<>(
        new Identifier("minecraft", "oxidized_cut_copper_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "oxidized_cut_copper"), new Identifier("minecraft", "oxidized_cut_copper_stairs"))
    );
    public static final Pair<Identifier, JsonObject> POLISHED_ANDESITE_STAIRS = new Pair<>(
        new Identifier("minecraft", "polished_andesite_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "polished_andesite"), new Identifier("minecraft", "polished_andesite_stairs"))
    );
    public static final Pair<Identifier, JsonObject> POLISHED_BLACKSTONE_BRICK_STAIRS = new Pair<>(
        new Identifier("minecraft", "polished_blackstone_brick_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "polished_blackstone_bricks"), new Identifier("minecraft", "polished_blackstone_brick_stairs"))
    );
    public static final Pair<Identifier, JsonObject> POLISHED_BLACKSTONE_STAIRS = new Pair<>(
        new Identifier("minecraft", "polished_blackstone_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "polished_blackstone"), new Identifier("minecraft", "polished_blackstone_stairs"))
    );
    public static final Pair<Identifier, JsonObject> POLISHED_DEEPSLATE_STAIRS = new Pair<>(
        new Identifier("minecraft", "polished_deepslate_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "polished_deepslate"), new Identifier("minecraft", "polished_deepslate_stairs"))
    );
    public static final Pair<Identifier, JsonObject> POLISHED_DIORITE_STAIRS = new Pair<>(
        new Identifier("minecraft", "polished_diorite_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "polished_diorite"), new Identifier("minecraft", "polished_diorite_stairs"))
    );
    public static final Pair<Identifier, JsonObject> POLISHED_GRANITE_STAIRS = new Pair<>(
        new Identifier("minecraft", "polished_granite_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "polished_granite"), new Identifier("minecraft", "polished_granite_stairs"))
    );
    public static final Pair<Identifier, JsonObject> PRISMARINE_BRICK_STAIRS = new Pair<>(
        new Identifier("minecraft", "prismarine_brick_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "prismarine_bricks"), new Identifier("minecraft", "prismarine_brick_stairs"))
    );
    public static final Pair<Identifier, JsonObject> PRISMARINE_STAIRS = new Pair<>(
        new Identifier("minecraft", "prismarine_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "prismarine"), new Identifier("minecraft", "prismarine_stairs"))
    );
    public static final Pair<Identifier, JsonObject> PURPUR_STAIRS = new Pair<>(
        new Identifier("minecraft", "purpur_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "purpur_block"), new Identifier("minecraft", "purpur_stairs"))
    );
    public static final Pair<Identifier, JsonObject> QUARTZ_STAIRS = new Pair<>(
        new Identifier("minecraft", "quartz_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "quartz"), new Identifier("minecraft", "quartz_stairs"))
    );
    public static final Pair<Identifier, JsonObject> RED_NETHER_BRICK_STAIRS = new Pair<>(
        new Identifier("minecraft", "red_nether_brick_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "red_nether_bricks"), new Identifier("minecraft", "red_nether_brick_stairs"))
    );
    public static final Pair<Identifier, JsonObject> RED_SANDSTONE_STAIRS = new Pair<>(
        new Identifier("minecraft", "red_sandstone_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "red_sandstone"), new Identifier("minecraft", "red_sandstone_stairs"))
    );
    public static final Pair<Identifier, JsonObject> SANDSTONE_STAIRS = new Pair<>(
        new Identifier("minecraft", "sandstone_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "sandstone"), new Identifier("minecraft", "sandstone_stairs"))
    );
    public static final Pair<Identifier, JsonObject> SMOOTH_QUARTZ_STAIRS = new Pair<>(
        new Identifier("minecraft", "smooth_quartz_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "smooth_quartz"), new Identifier("minecraft", "smooth_quartz_stairs"))
    );
    public static final Pair<Identifier, JsonObject> SMOOTH_RED_SANDSTONE_STAIRS = new Pair<>(
        new Identifier("minecraft", "smooth_red_sandstone_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "smooth_red_sandstone"), new Identifier("minecraft", "smooth_red_sandstone_stairs"))
    );
    public static final Pair<Identifier, JsonObject> SMOOTH_SANDSTONE_STAIRS = new Pair<>(
        new Identifier("minecraft", "smooth_sandstone_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "smooth_sandstone"), new Identifier("minecraft", "smooth_sandstone_stairs"))
    );
    public static final Pair<Identifier, JsonObject> SPRUCE_STAIRS = new Pair<>(
        new Identifier("minecraft", "spruce_stairs"),
        makeWoodenStairsRecipe(new Identifier("minecraft", "spruce_planks"), new Identifier("minecraft", "spruce_stairs"))
    );
    public static final Pair<Identifier, JsonObject> STONE_BRICK_STAIRS = new Pair<>(
        new Identifier("minecraft", "stone_brick_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "stone_bricks"), new Identifier("minecraft", "stone_brick_stairs"))
    );
    public static final Pair<Identifier, JsonObject> STONE_STAIRS = new Pair<>(
        new Identifier("minecraft", "stone_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "stone"), new Identifier("minecraft", "stone_stairs"))
    );
    public static final Pair<Identifier, JsonObject> WARPED_STAIRS = new Pair<>(
        new Identifier("minecraft", "warped_stairs"),
        makeWoodenStairsRecipe(new Identifier("minecraft", "warped_planks"), new Identifier("minecraft", "warped_stairs"))
    );
    public static final Pair<Identifier, JsonObject> WAXED_CUT_COPPER_STAIRS = new Pair<>(
        new Identifier("minecraft", "waxed_cut_copper_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "waxed_cut_copper"), new Identifier("minecraft", "waxed_cut_copper_stairs"))
    );
    public static final Pair<Identifier, JsonObject> WAXED_EXPOSED_CUT_COPPER_STAIRS = new Pair<>(
        new Identifier("minecraft", "waxed_exposed_cut_copper_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "waxed_exposed_cut_copper"), new Identifier("minecraft", "waxed_exposed_cut_copper_stairs"))
    );
    public static final Pair<Identifier, JsonObject> WAXED_OXIDIZED_CUT_COPPER_STAIRS = new Pair<>(
        new Identifier("minecraft", "waxed_oxidized_cut_copper_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "waxed_oxidized_cut_copper"), new Identifier("minecraft", "waxed_oxidized_cut_copper_stairs"))
    );
    public static final Pair<Identifier, JsonObject> WAXED_WEATHERED_CUT_COPPER_STAIRS = new Pair<>(
        new Identifier("minecraft", "waxed_weathered_cut_copper_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "waxed_weathered_cut_copper"), new Identifier("minecraft", "waxed_weathered_cut_copper_stairs"))
    );
    public static final Pair<Identifier, JsonObject> WEATHERED_CUT_COPPER_STAIRS = new Pair<>(
        new Identifier("minecraft", "weathered_cut_copper_stairs"),
        makeStairsRecipe(new Identifier("minecraft", "weathered_cut_copper"), new Identifier("minecraft", "weathered_cut_copper_stairs"))
    );

    public static JsonObject makeStairsRecipe(Identifier planks, Identifier stairs) {
        return makeStairsRecipe(planks, stairs, null);
    }

    public static JsonObject makeStairsRecipe(Identifier planks, Identifier stairs, String group) {
        return createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(planks),
            Lists.newArrayList("item"),
            Lists.newArrayList("#  ", "## ", "###"),
            stairs,
            8,
            group
        );
    }

    public static JsonObject makeWoodenStairsRecipe(Identifier planks, Identifier stairs) {
        return makeStairsRecipe(planks, stairs, "wooden_stairs");
    }

    @SuppressWarnings("unchecked")
    public static final Pair<Identifier, JsonObject>[] STAIRS_RECIPES = new Pair[]{
        ACACIA_STAIRS,
        ANDESITE_STAIRS,
        BIRCH_STAIRS,
        BAMBOO_STAIRS,
        BLACKSTONE_STAIRS,
        BRICK_STAIRS,
        CHERRY_STAIRS,
        COBBLED_DEEPSLATE_STAIRS,
        COBBLESTONE_STAIRS,
        CRIMSON_STAIRS,
        CUT_COPPER_STAIRS,
        DARK_OAK_STAIRS,
        DARK_PRISMARINE_STAIRS,
        DEEPSLATE_BRICK_STAIRS,
        DEEPSLATE_TILE_STAIRS,
        DIORITE_STAIRS,
        END_STONE_BRICK_STAIRS,
        EXPOSED_CUT_COPPER_STAIRS,
        GRANITE_STAIRS,
        JUNGLE_STAIRS,
        MANGROVE_STAIRS,
        MOSSY_COBBLESTONE_STAIRS,
        MOSSY_STONE_BRICK_STAIRS,
        MUD_BRICK_STAIRS,
        NETHER_BRICK_STAIRS,
        OAK_STAIRS,
        OXIDIZED_CUT_COPPER_STAIRS,
        POLISHED_ANDESITE_STAIRS,
        POLISHED_BLACKSTONE_BRICK_STAIRS,
        POLISHED_BLACKSTONE_STAIRS,
        POLISHED_DEEPSLATE_STAIRS,
        POLISHED_DIORITE_STAIRS,
        POLISHED_GRANITE_STAIRS,
        PRISMARINE_BRICK_STAIRS,
        PRISMARINE_STAIRS,
        PURPUR_STAIRS,
        QUARTZ_STAIRS,
        RED_NETHER_BRICK_STAIRS,
        RED_SANDSTONE_STAIRS,
        SANDSTONE_STAIRS,
        SMOOTH_QUARTZ_STAIRS,
        SMOOTH_RED_SANDSTONE_STAIRS,
        SMOOTH_SANDSTONE_STAIRS,
        SPRUCE_STAIRS,
        STONE_BRICK_STAIRS,
        STONE_STAIRS,
        WARPED_STAIRS,
        WAXED_CUT_COPPER_STAIRS,
        WAXED_EXPOSED_CUT_COPPER_STAIRS,
        WAXED_OXIDIZED_CUT_COPPER_STAIRS,
        WAXED_WEATHERED_CUT_COPPER_STAIRS,
        WEATHERED_CUT_COPPER_STAIRS
    };
}
