package com.chimericdream.pannotiacompanion.recipes.vanilla;

import com.chimericdream.pannotiacompanion.ModInfo;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.*;

public class MiscRecipes {
    public static Pair<Identifier, JsonObject> BAMBOO_PLANKS = new Pair<>(
        new Identifier("minecraft", "bamboo_planks"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "bamboo_blocks")),
            Lists.newArrayList("tag"),
            Lists.newArrayList("##", "##"),
            new Identifier("minecraft", "bamboo_planks"),
            8,
            "planks",
            "building"
        )
    );

    public static Pair<Identifier, JsonObject> BREAD = new Pair<>(
        new Identifier("minecraft", "bread"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "wheat")),
                new Pair<>("item", new Identifier("minecraft", "wheat")),
                new Pair<>("item", new Identifier("minecraft", "wheat"))
            ),
            new Identifier("minecraft", "bread")
        )
    );

    public static Pair<Identifier, JsonObject> BRICKS = new Pair<>(
        new Identifier("minecraft", "bricks"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "brick")),
            Lists.newArrayList("item"),
            Lists.newArrayList("##", "##"),
            new Identifier("minecraft", "bricks"),
            4
        )
    );

    public static Pair<Identifier, JsonObject> FERMENTED_SPIDER_EYE = new Pair<>(
        new Identifier("minecraft", "fermented_spider_eye"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "spider_eye")),
                new Pair<>("tag", new Identifier(ModInfo.MOD_ID, "mushrooms")),
                new Pair<>("item", new Identifier("minecraft", "sugar"))
            ),
            new Identifier("minecraft", "fermented_spider_eye")
        )
    );

    public static Pair<Identifier, JsonObject> GOLD_NUGGET_FROM_BLASTING = new Pair<>(
        new Identifier("minecraft", "gold_nugget_from_blasting"),
        createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "gold_nugget")),
            new Identifier("minecraft", "gold_nugget"),
            100,
            0.1f,
            null,
            "misc"
        )
    );

    public static Pair<Identifier, JsonObject> GOLD_NUGGET_FROM_SMELTING = new Pair<>(
        new Identifier("minecraft", "gold_nugget_from_smelting"),
        createSmeltingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "gold_nugget")),
            new Identifier("minecraft", "gold_nugget"),
            200,
            0.1f,
            null,
            "misc"
        )
    );

    public static Pair<Identifier, JsonObject> IRON_NUGGET_FROM_BLASTING = new Pair<>(
        new Identifier("minecraft", "iron_nugget_from_blasting"),
        createBlastingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "iron_nugget")),
            new Identifier("minecraft", "iron_nugget"),
            100,
            0.1f,
            null,
            "misc"
        )
    );

    public static Pair<Identifier, JsonObject> IRON_NUGGET_FROM_SMELTING = new Pair<>(
        new Identifier("minecraft", "iron_nugget_from_smelting"),
        createSmeltingRecipeJson(
            new Pair<>("item", new Identifier("minecraft", "iron_nugget")),
            new Identifier("minecraft", "iron_nugget"),
            200,
            0.1f,
            null,
            "misc"
        )
    );

    public static Pair<Identifier, JsonObject> NETHERITE_INGOT = new Pair<>(
        new Identifier("minecraft", "netherite_ingot"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "netherite_scrap")),
                new Pair<>("item", new Identifier("minecraft", "netherite_scrap")),
                new Pair<>("item", new Identifier("minecraft", "netherite_scrap")),
                new Pair<>("item", new Identifier("minecraft", "netherite_scrap")),
                new Pair<>("item", new Identifier("minecraft", "gold_ingot")),
                new Pair<>("item", new Identifier("minecraft", "gold_ingot")),
                new Pair<>("item", new Identifier("minecraft", "gold_ingot")),
                new Pair<>("item", new Identifier("minecraft", "gold_ingot"))
            ),
            new Identifier("minecraft", "netherite_ingot")
        )
    );

    public static Pair<Identifier, JsonObject> PACKED_ICE = new Pair<>(
        new Identifier("minecraft", "packed_ice"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "ice")),
            Lists.newArrayList("item"),
            Lists.newArrayList("###", "###", "###"),
            new Identifier("minecraft", "packed_ice")
        )
    );

    public static Pair<Identifier, JsonObject> PAPER = new Pair<>(
        new Identifier("minecraft", "paper"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "sugar_cane")),
                new Pair<>("item", new Identifier("minecraft", "sugar_cane")),
                new Pair<>("item", new Identifier("minecraft", "sugar_cane"))
            ),
            new Identifier("minecraft", "paper"),
            3
        )
    );

    public static Pair<Identifier, JsonObject> SHULKER_BOX = new Pair<>(
        new Identifier("minecraft", "shulker_box"),
        createShapelessRecipeJson(
            Lists.newArrayList(
                new Pair<>("item", new Identifier("minecraft", "shulker_shell")),
                new Pair<>("item", new Identifier("minecraft", "shulker_shell")),
                new Pair<>("item", new Identifier("minecraft", "chest"))
            ),
            new Identifier("minecraft", "shulker_box")
        )
    );

    public static Pair<Identifier, JsonObject> SLIME_BALL = new Pair<>(
        new Identifier("minecraft", "slime_ball"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "slime_block"))),
            new Identifier("minecraft", "slime_ball"),
            4
        )
    );

    public static Pair<Identifier, JsonObject> SLIME_BLOCK = new Pair<>(
        new Identifier("minecraft", "slime_block"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "slime_ball")),
            Lists.newArrayList("item"),
            Lists.newArrayList("##", "##"),
            new Identifier("minecraft", "slime_block")
        )
    );

    public static Pair<Identifier, JsonObject> SNOW = new Pair<>(
        new Identifier("minecraft", "snow"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "snow_block")),
            Lists.newArrayList("item"),
            Lists.newArrayList("##"),
            new Identifier("minecraft", "snow"),
            16
        )
    );

    public static Pair<Identifier, JsonObject> SNOW_BLOCK = new Pair<>(
        new Identifier("minecraft", "snow_block"),
        createShapedRecipeJson(
            Lists.newArrayList('#'),
            Lists.newArrayList(new Identifier("minecraft", "snowball")),
            Lists.newArrayList("item"),
            Lists.newArrayList("##", "##"),
            new Identifier("minecraft", "snow_block")
        )
    );


    public static Pair<Identifier, JsonObject>[] MISC_RECIPES = new Pair[]{
        BAMBOO_PLANKS,
        BREAD,
        BRICKS,
        FERMENTED_SPIDER_EYE,
        GOLD_NUGGET_FROM_BLASTING,
        GOLD_NUGGET_FROM_SMELTING,
        IRON_NUGGET_FROM_BLASTING,
        IRON_NUGGET_FROM_SMELTING,
        NETHERITE_INGOT,
        PACKED_ICE,
        PAPER,
        SHULKER_BOX,
        SLIME_BALL,
        SLIME_BLOCK,
        SNOW,
        SNOW_BLOCK
    };
}
