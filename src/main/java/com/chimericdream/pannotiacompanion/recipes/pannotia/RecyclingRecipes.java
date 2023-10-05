package com.chimericdream.pannotiacompanion.recipes.pannotia;

import com.chimericdream.pannotiacompanion.ModInfo;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.recipes.RecipeHelpers.createShapelessRecipeJson;

public class RecyclingRecipes {
    public static final Pair<Identifier, JsonObject> CHAINMAIL_BOOTS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/chainmail_boots"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "chainmail_boots"))),
            new Identifier("minecraft", "chain"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> CHAINMAIL_CHESTPLATE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/chainmail_chestplate"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "chainmail_chestplate"))),
            new Identifier("minecraft", "chain"),
            4
        )
    );

    public static final Pair<Identifier, JsonObject> CHAINMAIL_HELMET = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/chainmail_helmet"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "chainmail_helmet"))),
            new Identifier("minecraft", "chain"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> CHAINMAIL_LEGGINGS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/chainmail_leggings"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "chainmail_leggings"))),
            new Identifier("minecraft", "chain"),
            3
        )
    );

    public static final Pair<Identifier, JsonObject> DIAMOND_AXE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/diamond_axe"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "diamond_axe"))),
            new Identifier("minecraft", "diamond")
        )
    );

    public static final Pair<Identifier, JsonObject> DIAMOND_BOOTS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/diamond_boots"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "diamond_boots"))),
            new Identifier("minecraft", "diamond")
        )
    );

    public static final Pair<Identifier, JsonObject> DIAMOND_CHESTPLATE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/diamond_chestplate"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "diamond_chestplate"))),
            new Identifier("minecraft", "diamond"),
            3
        )
    );

    public static final Pair<Identifier, JsonObject> DIAMOND_HELMET = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/diamond_helmet"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "diamond_helmet"))),
            new Identifier("minecraft", "diamond"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> DIAMOND_HORSE_ARMOR = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/diamond_horse_armor"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "diamond_horse_armor"))),
            new Identifier("minecraft", "diamond"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> DIAMOND_LEGGINGS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/diamond_leggings"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "diamond_leggings"))),
            new Identifier("minecraft", "diamond"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> DIAMOND_PICKAXE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/diamond_pickaxe"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "diamond_pickaxe"))),
            new Identifier("minecraft", "diamond")
        )
    );

    public static final Pair<Identifier, JsonObject> GOLD_HORSE_ARMOR = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/gold_horse_armor"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "gold_horse_armor"))),
            new Identifier("minecraft", "gold_ingot"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> GOLDEN_AXE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/golden_axe"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "golden_axe"))),
            new Identifier("minecraft", "gold_ingot")
        )
    );

    public static final Pair<Identifier, JsonObject> GOLDEN_BOOTS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/golden_boots"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "golden_boots"))),
            new Identifier("minecraft", "gold_ingot")
        )
    );

    public static final Pair<Identifier, JsonObject> GOLDEN_CHESTPLATE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/golden_chestplate"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "golden_chestplate"))),
            new Identifier("minecraft", "gold_ingot"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> GOLDEN_HELMET = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/golden_helmet"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "golden_helmet"))),
            new Identifier("minecraft", "gold_ingot")
        )
    );

    public static final Pair<Identifier, JsonObject> GOLDEN_HOE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/golden_hoe"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "golden_hoe"))),
            new Identifier("minecraft", "gold_nugget"),
            6
        )
    );

    public static final Pair<Identifier, JsonObject> GOLDEN_LEGGINGS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/golden_leggings"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "golden_leggings"))),
            new Identifier("minecraft", "gold_ingot"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> GOLDEN_PICKAXE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/golden_pickaxe"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "golden_pickaxe"))),
            new Identifier("minecraft", "gold_ingot")
        )
    );

    public static final Pair<Identifier, JsonObject> GOLDEN_SHOVEL = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/golden_shovel"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "golden_shovel"))),
            new Identifier("minecraft", "gold_nugget"),
            3
        )
    );

    public static final Pair<Identifier, JsonObject> GOLDEN_SWORD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/golden_sword"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "golden_sword"))),
            new Identifier("minecraft", "gold_nugget"),
            6
        )
    );

    public static final Pair<Identifier, JsonObject> IRON_AXE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/iron_axe"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "iron_axe"))),
            new Identifier("minecraft", "iron_ingot")
        )
    );

    public static final Pair<Identifier, JsonObject> IRON_BOOTS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/iron_boots"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "iron_boots"))),
            new Identifier("minecraft", "iron_ingot")
        )
    );

    public static final Pair<Identifier, JsonObject> IRON_CHESTPLATE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/iron_chestplate"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "iron_chestplate"))),
            new Identifier("minecraft", "iron_ingot"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> IRON_HELMET = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/iron_helmet"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "iron_helmet"))),
            new Identifier("minecraft", "iron_ingot")
        )
    );

    public static final Pair<Identifier, JsonObject> IRON_HOE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/iron_hoe"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "iron_hoe"))),
            new Identifier("minecraft", "iron_nugget"),
            6
        )
    );

    public static final Pair<Identifier, JsonObject> IRON_HORSE_ARMOR = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/iron_horse_armor"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "iron_horse_armor"))),
            new Identifier("minecraft", "iron_ingot"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> IRON_LEGGINGS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/iron_leggings"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "iron_leggings"))),
            new Identifier("minecraft", "iron_ingot"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> IRON_PICKAXE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/iron_pickaxe"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "iron_pickaxe"))),
            new Identifier("minecraft", "iron_ingot")
        )
    );

    public static final Pair<Identifier, JsonObject> IRON_SHOVEL = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/iron_shovel"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "iron_shovel"))),
            new Identifier("minecraft", "iron_nugget"),
            3
        )
    );

    public static final Pair<Identifier, JsonObject> IRON_SWORD = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/iron_sword"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "iron_sword"))),
            new Identifier("minecraft", "iron_nugget"),
            6
        )
    );

    public static final Pair<Identifier, JsonObject> LEATHER_BOOTS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/leather_boots"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "leather_boots"))),
            new Identifier("minecraft", "leather")
        )
    );

    public static final Pair<Identifier, JsonObject> LEATHER_CHESTPLATE = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/leather_chestplate"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "leather_chestplate"))),
            new Identifier("minecraft", "leather"),
            3
        )
    );

    public static final Pair<Identifier, JsonObject> LEATHER_HELMET = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/leather_helmet"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "leather_helmet"))),
            new Identifier("minecraft", "leather")
        )
    );

    public static final Pair<Identifier, JsonObject> LEATHER_HORSE_ARMOR = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/leather_horse_armor"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "leather_horse_armor"))),
            new Identifier("minecraft", "leather"),
            2
        )
    );

    public static final Pair<Identifier, JsonObject> LEATHER_LEGGINGS = new Pair<>(
        new Identifier(ModInfo.MOD_ID, "recycling/leather_leggings"),
        createShapelessRecipeJson(
            Lists.newArrayList(new Pair<>("item", new Identifier("minecraft", "leather_leggings"))),
            new Identifier("minecraft", "leather"),
            2
        )
    );

    @SuppressWarnings("unchecked")
    public static final Pair<Identifier, JsonObject>[] RECYCLING_RECIPES = new Pair[]{
        CHAINMAIL_BOOTS,
        CHAINMAIL_CHESTPLATE,
        CHAINMAIL_HELMET,
        CHAINMAIL_LEGGINGS,
        DIAMOND_AXE,
        DIAMOND_BOOTS,
        DIAMOND_CHESTPLATE,
        DIAMOND_HELMET,
        DIAMOND_HORSE_ARMOR,
        DIAMOND_LEGGINGS,
        DIAMOND_PICKAXE,
        GOLD_HORSE_ARMOR,
        GOLDEN_AXE,
        GOLDEN_BOOTS,
        GOLDEN_CHESTPLATE,
        GOLDEN_HELMET,
        GOLDEN_HOE,
        GOLDEN_LEGGINGS,
        GOLDEN_PICKAXE,
        GOLDEN_SHOVEL,
        GOLDEN_SWORD,
        IRON_AXE,
        IRON_BOOTS,
        IRON_CHESTPLATE,
        IRON_HELMET,
        IRON_HOE,
        IRON_HORSE_ARMOR,
        IRON_LEGGINGS,
        IRON_PICKAXE,
        IRON_SHOVEL,
        IRON_SWORD,
        LEATHER_BOOTS,
        LEATHER_CHESTPLATE,
        LEATHER_HELMET,
        LEATHER_HORSE_ARMOR,
        LEATHER_LEGGINGS
    };
}
