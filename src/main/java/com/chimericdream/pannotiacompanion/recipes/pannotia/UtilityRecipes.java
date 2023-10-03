package com.chimericdream.pannotiacompanion.recipes.pannotia;

import com.chimericdream.pannotiacompanion.ModInfo;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.*;

public class UtilityRecipes {
    public static final Pair<Identifier, JsonObject> ACACIA_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/acacia_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "acacia_log"),
            new Identifier("minecraft", "acacia_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> AMETHYST_SHARDS_FROM_BLOCK = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/amethyst_shards_from_block"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "amethyst_block"))),
            new Identifier("minecraft", "amethyst_shard"),
            4
        )
    );

    public static final Pair<Identifier, JsonObject> BAMBOO_FROM_BAMBOO_BLOCK = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/bamboo_from_bamboo_block"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("tag", new Identifier("minecraft", "bamboo_blocks"))),
            new Identifier("minecraft", "bamboo"),
            9
        )
    );

    public static final Pair<Identifier, JsonObject> BIRCH_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/birch_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "birch_log"),
            new Identifier("minecraft", "birch_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> BLACKSTONE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/blackstone"),
        createShapedRecipeJson(
            Lists.newArrayList('#', 'B'),
            Lists.newArrayList(
                new Identifier(ModInfo.MOD_ID, "utility/coal_charcoal"),
                new Identifier("minecraft", "basalt")
            ),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("#B", "B#"),
            new Identifier("minecraft", "blackstone"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> BLACKSTONE_MIRROR = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/blackstone_mirror"),
        createShapedRecipeJson(
            Lists.newArrayList('#', 'B'),
            Lists.newArrayList(
                new Identifier(ModInfo.MOD_ID, "utility/coal_charcoal"),
                new Identifier("minecraft", "basalt")
            ),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("B#", "#B"),
            new Identifier("minecraft", "blackstone"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> BONE_BLOCK_FROM_BONES = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/bone_block_from_bones"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "bone")),
                new Pair<>("item", new Identifier("minecraft", "bone")),
                new Pair<>("item", new Identifier("minecraft", "bone"))
            ),
            new Identifier("minecraft", "bone_block")
        )
    );

    public static final Pair<Identifier, JsonObject> CHERRY_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/cherry_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "cherry_log"),
            new Identifier("minecraft", "cherry_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> CHESTS_FROM_BAMBOO_BLOCKS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/chests_from_bamboo_blocks"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "bamboo_blocks")),
            Lists.newArrayList("tag"),
            Lists.newArrayList("###", "# #", "###"),
            new Identifier("minecraft", "chest"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> CHESTS_FROM_LOGS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/chests_from_logs"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "logs")),
            Lists.newArrayList("tag"),
            Lists.newArrayList("###", "# #", "###"),
            new Identifier("minecraft", "chest"),
            4
        )
    );

    public static final Pair<Identifier, JsonObject> CLAY_BALLS_FROM_CLAY = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/clay_balls_from_clay"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "clay"))),
            new Identifier("minecraft", "clay_ball"),
            4
        )
    );

    public static final Pair<Identifier, JsonObject> CLAY_BLOCK_FROM_SAND_AND_GRAVEL = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/clay_block_from_sand_and_gravel"),
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

    public static final Pair<Identifier, JsonObject> COBBLED_DEEPSLATE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/cobbled_deepslate"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "basalt")),
                new Pair<>("item", new Identifier("minecraft", "cobblestone"))
            ),
            new Identifier("minecraft", "cobbled_deepslate"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> COPPER_BLOCK_FROM_CUT_COPPER_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/copper_block_from_cut_copper_blasting"),
        createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "cut_copper")),
            new Identifier("minecraft", "copper_block")
        )
    );

    public static final Pair<Identifier, JsonObject> CRIMSON_STEM_FROM_HYPHAE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/crimson_stem_from_hyphae"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "crimson_stem"),
            new Identifier("minecraft", "crimson_hyphae")
        )
    );

    public static final Pair<Identifier, JsonObject> DARK_OAK_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/dark_oak_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "dark_oak_log"),
            new Identifier("minecraft", "dark_oak_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> DISPENSER_FROM_DROPPER = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/dispenser_from_dropper"),
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

    public static final Pair<Identifier, JsonObject> DISPENSER_FROM_DROPPER_ALT = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/dispenser_from_dropper_alt"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "dropper")),
                new Pair<>("item", new Identifier("minecraft", "bow"))
            ),
            new Identifier("minecraft", "dispenser"),
            "dispenser"
        )
    );

    public static final Pair<Identifier, JsonObject> EXPOSED_COPPER_FROM_EXPOSED_CUT_COPPER_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/exposed_copper_from_exposed_cut_copper_blasting"),
        createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "exposed_cut_copper")),
            new Identifier("minecraft", "exposed_copper")
        )
    );

    public static final Pair<Identifier, JsonObject> FASTER_COPPER_OXIDIZATION = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/faster_copper_oxidization"),
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

    public static final Pair<Identifier, JsonObject> GRAVEL_FROM_FLINT = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/gravel_from_flint"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "flint")),
            Lists.newArrayList("item"),
            Lists.newArrayList("##", "##"),
            new Identifier("minecraft", "gravel")
        )
    );

    public static final Pair<Identifier, JsonObject> HEART_OF_THE_SEA = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/heart_of_the_sea"),
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

    public static final Pair<Identifier, JsonObject> HONEYCOMB_FROM_HONEYCOMB_BLOCK = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/honeycomb_from_honeycomb_block"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "honeycomb_block"))),
            new Identifier("minecraft", "honeycomb"),
            4
        )
    );

    public static final Pair<Identifier, JsonObject> ICE_FROM_PACKED_ICE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/ice_from_packed_ice"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "packed_ice"))),
            new Identifier("minecraft", "ice"),
            9
        )
    );

    public static final Pair<Identifier, JsonObject> JUNGLE_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/jungle_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "jungle_log"),
            new Identifier("minecraft", "jungle_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> LEATHER_FROM_SMELTING_ROTTEN_FLESH = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/leather_from_smelting_rotten_flesh"),
        createSmeltingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "rotten_flesh")),
            new Identifier("minecraft", "leather"),
            200,
            1f
        )
    );

    public static final Pair<Identifier, JsonObject> MANGROVE_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/mangrove_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "mangrove_log"),
            new Identifier("minecraft", "mangrove_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> MOSS_BLOCKS_FROM_CARPET = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/moss_blocks_from_carpet"),
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

    public static final Pair<Identifier, JsonObject> NETHER_WART_FROM_BLOCK = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/nether_wart_from_block"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "nether_wart_block"))),
            new Identifier("minecraft", "nether_wart"),
            9
        )
    );

    public static final Pair<Identifier, JsonObject> OAK_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/oak_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "oak_log"),
            new Identifier("minecraft", "oak_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> OXIDIZED_COPPER_FROM_OXIDIZED_CUT_COPPER_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/oxidized_copper_from_oxidized_cut_copper_blasting"),
        createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "oxidized_cut_copper")),
            new Identifier("minecraft", "oxidized_copper")
        )
    );

    public static final Pair<Identifier, JsonObject> PACKED_ICE_FROM_BLUE_ICE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/packed_ice_from_blue_ice"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "blue_ice"))),
            new Identifier("minecraft", "packed_ice"),
            9
        )
    );

    public static final Pair<Identifier, JsonObject> POLISHED_BLACKSTONE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/polished_blackstone"),
        createShapedRecipeJson(
            Lists.newArrayList('#', 'B'),
            Lists.newArrayList(
                new Identifier(ModInfo.MOD_ID, "utility/coal_charcoal"),
                new Identifier("minecraft", "polished_basalt")
            ),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("#B", "B#"),
            new Identifier("minecraft", "polished_blackstone"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> POLISHED_BLACKSTONE_MIRROR = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/polished_blackstone_mirror"),
        createShapedRecipeJson(
            Lists.newArrayList('#', 'B'),
            Lists.newArrayList(
                new Identifier(ModInfo.MOD_ID, "utility/coal_charcoal"),
                new Identifier("minecraft", "polished_basalt")
            ),
            Lists.newArrayList("tag", "item"),
            Lists.newArrayList("B#", "#B"),
            new Identifier("minecraft", "polished_blackstone"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> POLISHED_DEEPSLATE_FROM_DEEPSLATE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/polished_deepslate_from_deepslate"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "deepslate")),
            Lists.newArrayList("item"),
            Lists.newArrayList("##", "##"),
            new Identifier("minecraft", "polished_deepslate"),
            4
        )
    );

    public static final Pair<Identifier, JsonObject> PRISMARINE_SHARDS_FROM_BRICKS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/prismarine_shards_from_bricks"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "prismarine_bricks"))),
            new Identifier("minecraft", "prismarine_shard"),
            9
        )
    );

    public static final Pair<Identifier, JsonObject> QUARTZ_FROM_QUARTZ_BLOCK = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/quartz_from_quartz_block"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "quartz_block"))),
            new Identifier("minecraft", "quartz"),
            4
        )
    );

    public static final Pair<Identifier, JsonObject> RED_SAND_FROM_RED_SANDSTONE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/red_sand_from_red_sandstone"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "red_sandstone"))),
            new Identifier("minecraft", "red_sand"),
            4
        )
    );

    public static final Pair<Identifier, JsonObject> REDSTONE_TORCH_FROM_TORCH = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/redstone_torch_from_torch"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "redstone")),
                new Pair<>("item", new Identifier("minecraft", "torch"))
            ),
            new Identifier("minecraft", "redstone_torch")
        )
    );

    public static final Pair<Identifier, JsonObject> REPEATER_PLUS_TORCHES = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/repeater_plus_torches"),
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

    public static final Pair<Identifier, JsonObject> SAND_FROM_SANDSTONE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/sand_from_sandstone"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "sandstone"))),
            new Identifier("minecraft", "sand"),
            4
        )
    );

    public static final Pair<Identifier, JsonObject> SMALL_DRIPLEAF = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/small_dripleaf"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "vine")),
                new Pair<>("item", new Identifier("minecraft", "lily_pad"))
            ),
            new Identifier("minecraft", "small_dripleaf")
        )
    );

    public static final Pair<Identifier, JsonObject> SNOW_BLOCK_FROM_LAYERS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/snow_block_from_layers"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "snow")),
            Lists.newArrayList("item"),
            Lists.newArrayList("###", "# #", "###"),
            new Identifier("minecraft", "snow_block")
        )
    );

    public static final Pair<Identifier, JsonObject> SPONGE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/sponge"),
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

    public static final Pair<Identifier, JsonObject> SPRUCE_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/spruce_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "spruce_log"),
            new Identifier("minecraft", "spruce_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> STICKS_FROM_LOGS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/sticks_from_logs"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "logs")),
            Lists.newArrayList("tag"),
            Lists.newArrayList("#", "#"),
            new Identifier("minecraft", "stick"),
            16
        )
    );

    public static final Pair<Identifier, JsonObject> STRING_FROM_WOOL = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/string_from_wool"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("tag", new Identifier("minecraft", "wool"))),
            new Identifier("minecraft", "string"),
            4
        )
    );

    public static final Pair<Identifier, JsonObject> STRIPPED_ACACIA_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/stripped_acacia_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "stripped_acacia_log"),
            new Identifier("minecraft", "stripped_acacia_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> STRIPPED_BIRCH_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/stripped_birch_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "stripped_birch_log"),
            new Identifier("minecraft", "stripped_birch_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> STRIPPED_CHERRY_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/stripped_cherry_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "stripped_cherry_log"),
            new Identifier("minecraft", "stripped_cherry_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> STRIPPED_CRIMSON_STEM_FROM_HYPHAE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/stripped_crimson_stem_from_hyphae"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "stripped_crimson_stem"),
            new Identifier("minecraft", "stripped_crimson_hyphae")
        )
    );

    public static final Pair<Identifier, JsonObject> STRIPPED_DARK_OAK_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/stripped_dark_oak_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "stripped_dark_oak_log"),
            new Identifier("minecraft", "stripped_dark_oak_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> STRIPPED_JUNGLE_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/stripped_jungle_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "stripped_jungle_log"),
            new Identifier("minecraft", "stripped_jungle_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> STRIPPED_MANGROVE_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/stripped_mangrove_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "stripped_mangrove_log"),
            new Identifier("minecraft", "stripped_mangrove_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> STRIPPED_OAK_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/stripped_oak_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "stripped_oak_log"),
            new Identifier("minecraft", "stripped_oak_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> STRIPPED_SPRUCE_LOG_FROM_WOOD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/stripped_spruce_log_from_wood"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "stripped_spruce_log"),
            new Identifier("minecraft", "stripped_spruce_wood")
        )
    );

    public static final Pair<Identifier, JsonObject> STRIPPED_WARPED_STEM_FROM_HYPHAE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/stripped_warped_stem_from_hyphae"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "stripped_warped_stem"),
            new Identifier("minecraft", "stripped_warped_hyphae")
        )
    );

    public static final Pair<Identifier, JsonObject> TRAPPED_CHEST = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/trapped_chest"),
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

    public static final Pair<Identifier, JsonObject> WARPED_STEM_FROM_HYPHAE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/warped_stem_from_hyphae"),
        makeLogFromWoodRecipeJson(
            new Identifier("minecraft", "warped_stem"),
            new Identifier("minecraft", "warped_hyphae")
        )
    );

    public static final Pair<Identifier, JsonObject> WEATHERED_COPPER_FROM_WEATHERED_CUT_COPPER_BLASTING = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "utility/weathered_copper_from_weathered_cut_copper_blasting"),
        createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "weathered_cut_copper")),
            new Identifier("minecraft", "weathered_copper")
        )
    );

    public static JsonObject makeLogFromWoodRecipeJson(Identifier logId, Identifier woodId) {
        return createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(woodId),
            Lists.newArrayList("item"),
            Lists.newArrayList("##", "##"),
            logId,
            4
        );
    }

    @SuppressWarnings("unchecked")
    public static final Pair<Identifier, JsonObject>[] UTILITY_RECIPES = new Pair[]{
        ACACIA_LOG_FROM_WOOD,
        AMETHYST_SHARDS_FROM_BLOCK,
        BAMBOO_FROM_BAMBOO_BLOCK,
        BIRCH_LOG_FROM_WOOD,
        BLACKSTONE,
        BLACKSTONE_MIRROR,
        BONE_BLOCK_FROM_BONES,
        CHERRY_LOG_FROM_WOOD,
        CHESTS_FROM_BAMBOO_BLOCKS,
        CHESTS_FROM_LOGS,
        CLAY_BALLS_FROM_CLAY,
        CLAY_BLOCK_FROM_SAND_AND_GRAVEL,
        COBBLED_DEEPSLATE,
        COPPER_BLOCK_FROM_CUT_COPPER_BLASTING,
        CRIMSON_STEM_FROM_HYPHAE,
        DARK_OAK_LOG_FROM_WOOD,
        DISPENSER_FROM_DROPPER,
        DISPENSER_FROM_DROPPER_ALT,
        EXPOSED_COPPER_FROM_EXPOSED_CUT_COPPER_BLASTING,
        FASTER_COPPER_OXIDIZATION,
        GRAVEL_FROM_FLINT,
        HEART_OF_THE_SEA,
        HONEYCOMB_FROM_HONEYCOMB_BLOCK,
        ICE_FROM_PACKED_ICE,
        JUNGLE_LOG_FROM_WOOD,
        LEATHER_FROM_SMELTING_ROTTEN_FLESH,
        MANGROVE_LOG_FROM_WOOD,
        MOSS_BLOCKS_FROM_CARPET,
        NETHER_WART_FROM_BLOCK,
        OAK_LOG_FROM_WOOD,
        OXIDIZED_COPPER_FROM_OXIDIZED_CUT_COPPER_BLASTING,
        PACKED_ICE_FROM_BLUE_ICE,
        POLISHED_BLACKSTONE,
        POLISHED_BLACKSTONE_MIRROR,
        POLISHED_DEEPSLATE_FROM_DEEPSLATE,
        PRISMARINE_SHARDS_FROM_BRICKS,
        QUARTZ_FROM_QUARTZ_BLOCK,
        RED_SAND_FROM_RED_SANDSTONE,
        REDSTONE_TORCH_FROM_TORCH,
        REPEATER_PLUS_TORCHES,
        SAND_FROM_SANDSTONE,
        SMALL_DRIPLEAF,
        SNOW_BLOCK_FROM_LAYERS,
        SPONGE,
        SPRUCE_LOG_FROM_WOOD,
        STICKS_FROM_LOGS,
        STRING_FROM_WOOL,
        STRIPPED_ACACIA_LOG_FROM_WOOD,
        STRIPPED_BIRCH_LOG_FROM_WOOD,
        STRIPPED_CHERRY_LOG_FROM_WOOD,
        STRIPPED_CRIMSON_STEM_FROM_HYPHAE,
        STRIPPED_DARK_OAK_LOG_FROM_WOOD,
        STRIPPED_JUNGLE_LOG_FROM_WOOD,
        STRIPPED_MANGROVE_LOG_FROM_WOOD,
        STRIPPED_OAK_LOG_FROM_WOOD,
        STRIPPED_SPRUCE_LOG_FROM_WOOD,
        STRIPPED_WARPED_STEM_FROM_HYPHAE,
        TRAPPED_CHEST,
        WARPED_STEM_FROM_HYPHAE,
        WEATHERED_COPPER_FROM_WEATHERED_CUT_COPPER_BLASTING
    };
}
