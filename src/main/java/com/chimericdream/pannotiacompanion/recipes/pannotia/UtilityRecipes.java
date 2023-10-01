package com.chimericdream.pannotiacompanion.recipes.pannotia;

import com.chimericdream.pannotiacompanion.ModInfo;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.*;

public class UtilityRecipes {
    public static Pair<Identifier, JsonObject> BLACKSTONE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "blackstone"),
        createShapedRecipeJson(
            Lists.newArrayList('#', 'B'),
            Lists.newArrayList(
                new Identifier(ModInfo.MOD_ID, "coal_charcoal"),
                new Identifier("minecraft", "basalt")
            ),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("#B", "B#"),
            new Identifier("minecraft", "blackstone"),
            2
        )
    );

    public static Pair<Identifier, JsonObject> BLACKSTONE_MIRROR = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "blackstone_mirror"),
        createShapedRecipeJson(
            Lists.newArrayList('#', 'B'),
            Lists.newArrayList(
                new Identifier(ModInfo.MOD_ID, "coal_charcoal"),
                new Identifier("minecraft", "basalt")
            ),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("B#", "#B"),
            new Identifier("minecraft", "blackstone"),
            2
        )
    );

    public static Pair<Identifier, JsonObject> BONE_BLOCK_FROM_BONES = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "bone_block_from_bones"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "bone")),
                new Pair<>("item", new Identifier("minecraft", "bone")),
                new Pair<>("item", new Identifier("minecraft", "bone"))
            ),
            new Identifier("minecraft", "bone_block")
        )
    );

    public static Pair<Identifier, JsonObject> CHESTS_FROM_BAMBOO_BLOCKS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "chests_from_bamboo_blocks"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "bamboo_blocks")),
            Lists.newArrayList("tag"),
            Lists.newArrayList("###", "# #", "###"),
            new Identifier("minecraft", "chest"),
            2
        )
    );

    public static Pair<Identifier, JsonObject> CHESTS_FROM_LOGS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "chests_from_logs"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "logs")),
            Lists.newArrayList("tag"),
            Lists.newArrayList("###", "# #", "###"),
            new Identifier("minecraft", "chest"),
            4
        )
    );

    public static Pair<Identifier, JsonObject> CLAY_BLOCK_FROM_SAND_AND_GRAVEL = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "clay_block_from_sand_and_gravel"),
        createShapedRecipeJson(
            Lists.newArrayList('x', 'y', 'z'),
            Lists.newArrayList(
                new Identifier("minecraft", "gravel"),
                new Identifier("minecraft", "sand"),
                new Identifier("minecraft", "water_bucket")
            ),
            Lists.newArrayList("item", "item", "item"),
            Lists.newArrayList("xyx", "yzy", "xyx"),
            new Identifier("minecraft", "clay"),
            8
        )
    );

    public static Pair<Identifier, JsonObject> COBBLED_DEEPSLATE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "cobbled_deepslate"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "basalt")),
                new Pair<>("item", new Identifier("minecraft", "cobblestone"))
            ),
            new Identifier("minecraft", "cobbled_deepslate"),
            2
        )
    );

    public static Pair<Identifier, JsonObject> DISPENSER_FROM_DROPPER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "dispenser_from_dropper"),
        createShapedRecipeJson(
            Lists.newArrayList('/', 's', '#'),
            Lists.newArrayList(
                new Identifier("minecraft", "string"),
                new Identifier("minecraft", "stick"),
                new Identifier("minecraft", "dropper")
            ),
            Lists.newArrayList("item", "item", "item"),
            Lists.newArrayList(" s/", "s#/", " s/"),
            new Identifier("minecraft", "dispenser"),
            "dispenser"
        )
    );

    public static Pair<Identifier, JsonObject> DISPENSER_FROM_DROPPER_ALT = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "dispenser_from_dropper_alt"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "dropper")),
                new Pair<>("item", new Identifier("minecraft", "bow"))
            ),
            new Identifier("minecraft", "dispenser"),
            "dispenser"
        )
    );

    public static Pair<Identifier, JsonObject> FASTER_COPPER_OXIDIZATION = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "faster_copper_oxidization"),
        createShapedRecipeJson(
            Lists.newArrayList('#', 'G', 'W'),
            Lists.newArrayList(
                new Identifier("minecraft", "copper_block"),
                new Identifier("minecraft", "gunpowder"),
                new Identifier("minecraft", "water_bucket")
            ),
            Lists.newArrayList("item", "item", "item"),
            Lists.newArrayList("#G#", "#W#", "###"),
            new Identifier("minecraft", "oxidized_copper"),
            7
        )
    );

    public static Pair<Identifier, JsonObject> GRAVEL_FROM_FLINT = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "gravel_from_flint"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "flint")),
            Lists.newArrayList("item"),
            Lists.newArrayList("##", "##"),
            new Identifier("minecraft", "gravel")
        )
    );

    public static Pair<Identifier, JsonObject> HEART_OF_THE_SEA = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "heart_of_the_sea"),
        createShapedRecipeJson(
            Lists.newArrayList('x', 'y'),
            Lists.newArrayList(
                new Identifier("minecraft", "nautilus_shell"),
                new Identifier("minecraft", "nether_star")
            ),
            Lists.newArrayList("item", "item"),
            Lists.newArrayList("xxx", "xyx", "xxx"),
            new Identifier("minecraft", "heart_of_the_sea")
        )
    );

    public static Pair<Identifier, JsonObject> LEATHER_FROM_SMELTING_ROTTEN_FLESH = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "leather_from_smelting_rotten_flesh"),
        createSmeltingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "rotten_flesh")),
            new Identifier("minecraft", "leather"),
            200,
            1f
        )
    );

    public static Pair<Identifier, JsonObject> MOSS_BLOCKS_FROM_CARPET = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "moss_blocks_from_carpet"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "moss_carpet")),
                new Pair<>("item", new Identifier("minecraft", "moss_carpet")),
                new Pair<>("item", new Identifier("minecraft", "moss_carpet"))
            ),
            new Identifier("minecraft", "moss_block"),
            2
        )
    );

    public static Pair<Identifier, JsonObject> POLISHED_BLACKSTONE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "polished_blackstone"),
        createShapedRecipeJson(
            Lists.newArrayList('#', 'B'),
            Lists.newArrayList(
                new Identifier(ModInfo.MOD_ID, "coal_charcoal"),
                new Identifier("minecraft", "polished_basalt")
            ),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("#B", "B#"),
            new Identifier("minecraft", "polished_blackstone"),
            2
        )
    );

    public static Pair<Identifier, JsonObject> POLISHED_BLACKSTONE_MIRROR = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "polished_blackstone_mirror"),
        createShapedRecipeJson(
            Lists.newArrayList('#', 'B'),
            Lists.newArrayList(
                new Identifier(ModInfo.MOD_ID, "coal_charcoal"),
                new Identifier("minecraft", "polished_basalt")
            ),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("B#", "#B"),
            new Identifier("minecraft", "polished_blackstone"),
            2
        )
    );

    public static Pair<Identifier, JsonObject> POLISHED_DEEPSLATE_FROM_DEEPSLATE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "polished_deepslate_from_deepslate"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "deepslate")),
            Lists.newArrayList("item"),
            Lists.newArrayList("##", "##"),
            new Identifier("minecraft", "polished_deepslate"),
            4
        )
    );

    public static Pair<Identifier, JsonObject> PRISMARINE_SHARDS_FROM_BRICKS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "prismarine_shards_from_bricks"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "prismarine_bricks"))),
            new Identifier("minecraft", "prismarine_shard"),
            9
        )
    );

    public static Pair<Identifier, JsonObject> REDSTONE_TORCH_FROM_TORCH = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "redstone_torch_from_torch"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "redstone")),
                new Pair<>("item", new Identifier("minecraft", "torch"))
            ),
            new Identifier("minecraft", "redstone_torch")
        )
    );

    public static Pair<Identifier, JsonObject> REPEATER_PLUS_TORCHES = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "repeater_plus_torches"),
        createShapedRecipeJson(
            Lists.newArrayList('x', 'y', 'z'),
            Lists.newArrayList(
                new Identifier("minecraft", "stone"),
                new Identifier("minecraft", "redstone"),
                new Identifier("minecraft", "stick")
            ),
            Lists.newArrayList("item", "item", "item"),
            Lists.newArrayList("y y", "zyz", "xxx"),
            new Identifier("minecraft", "repeater")
        )
    );

    public static Pair<Identifier, JsonObject> SMALL_DRIPLEAF = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "small_dripleaf"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "vine")),
                new Pair<>("item", new Identifier("minecraft", "lily_pad"))
            ),
            new Identifier("minecraft", "small_dripleaf")
        )
    );

    public static Pair<Identifier, JsonObject> SNOW_BLOCK_FROM_LAYERS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "snow_block_from_layers"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "snow")),
            Lists.newArrayList("item"),
            Lists.newArrayList("###", "# #", "###"),
            new Identifier("minecraft", "snow_block")
        )
    );

    public static Pair<Identifier, JsonObject> SPONGE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "sponge"),
        createShapedRecipeJson(
            Lists.newArrayList('x', 'y'),
            Lists.newArrayList(
                new Identifier("minecraft", "wool"),
                new Identifier("minecraft", "heart_of_the_sea")
            ),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("xxx", "xyx", "xxx"),
            new Identifier("minecraft", "sponge"),
            16
        )
    );

    public static Pair<Identifier, JsonObject> STICKS_FROM_LOGS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "sticks_from_logs"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "logs")),
            Lists.newArrayList("tag"),
            Lists.newArrayList("#", "#"),
            new Identifier("minecraft", "stick"),
            16
        )
    );

    public static Pair<Identifier, JsonObject> TRAPPED_CHEST = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "trapped_chest"),
        createShapedRecipeJson(
            Lists.newArrayList('x', 'h'),
            Lists.newArrayList(
                new Identifier("minecraft", "planks"),
                new Identifier("minecraft", "tripwire_hook")
            ),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("xxx", "xhx", "xxx"),
            new Identifier("minecraft", "trapped_chest")
        )
    );

    @SuppressWarnings("unchecked")
    public static Pair<Identifier, JsonObject>[] UTILITY_RECIPES = new Pair[]{
        BLACKSTONE,
        BLACKSTONE_MIRROR,
        BONE_BLOCK_FROM_BONES,
        CHESTS_FROM_BAMBOO_BLOCKS,
        CHESTS_FROM_LOGS,
        CLAY_BLOCK_FROM_SAND_AND_GRAVEL,
        COBBLED_DEEPSLATE,
        DISPENSER_FROM_DROPPER,
        DISPENSER_FROM_DROPPER_ALT,
        FASTER_COPPER_OXIDIZATION,
        GRAVEL_FROM_FLINT,
        HEART_OF_THE_SEA,
        LEATHER_FROM_SMELTING_ROTTEN_FLESH,
        MOSS_BLOCKS_FROM_CARPET,
        POLISHED_BLACKSTONE,
        POLISHED_BLACKSTONE_MIRROR,
        POLISHED_DEEPSLATE_FROM_DEEPSLATE,
        PRISMARINE_SHARDS_FROM_BRICKS,
        REDSTONE_TORCH_FROM_TORCH,
        REPEATER_PLUS_TORCHES,
        SMALL_DRIPLEAF,
        SNOW_BLOCK_FROM_LAYERS,
        SPONGE,
        STICKS_FROM_LOGS,
        TRAPPED_CHEST
    };
}
