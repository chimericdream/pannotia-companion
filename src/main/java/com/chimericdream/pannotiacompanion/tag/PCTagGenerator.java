package com.chimericdream.pannotiacompanion.tag;

import com.chimericdream.pannotiacompanion.ModInfo;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class PCTagGenerator extends FabricTagProvider.ItemTagProvider {
    private static final TagKey<Item> BEDS;
    private static final TagKey<Item> BRAIN_CORAL;
    private static final TagKey<Item> BUBBLE_CORAL;
    private static final TagKey<Item> COAL_CHARCOAL;
    private static final TagKey<Item> CONCRETE;
    private static final TagKey<Item> CONCRETE_POWDERS;
    private static final TagKey<Item> FIRE_CORAL;
    private static final TagKey<Item> GLAZED_TERRACOTTA;
    private static final TagKey<Item> HORN_CORAL;
    private static final TagKey<Item> MUSHROOMS;
    private static final TagKey<Item> NETHERITE_BOOTS;
    private static final TagKey<Item> NETHERITE_CHESTPLATES;
    private static final TagKey<Item> NETHERITE_HELMETS;
    private static final TagKey<Item> NETHERITE_LEGGINGS;
    private static final TagKey<Item> QUARTZ_BLOCKS;
    private static final TagKey<Item> TERRACOTTA;
    private static final TagKey<Item> TUBE_CORAL;

    static {
        BEDS = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "beds")
        );
        BRAIN_CORAL = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "brain_coral")
        );
        BUBBLE_CORAL = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "bubble_coral")
        );
        COAL_CHARCOAL = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "coal_charcoal")
        );
        CONCRETE = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "concrete")
        );
        CONCRETE_POWDERS = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "concrete_powders")
        );
        FIRE_CORAL = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "fire_coral")
        );
        GLAZED_TERRACOTTA = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "glazed_terracotta")
        );
        HORN_CORAL = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "horn_coral")
        );
        MUSHROOMS = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "mushrooms")
        );
        NETHERITE_BOOTS = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "netherite_boots")
        );
        NETHERITE_CHESTPLATES = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "netherite_chestplates")
        );
        NETHERITE_HELMETS = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "netherite_helmets")
        );
        NETHERITE_LEGGINGS = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "netherite_leggings")
        );
        QUARTZ_BLOCKS = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "quartz_blocks")
        );
        TERRACOTTA = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "terracotta")
        );
        TUBE_CORAL = TagKey.of(
            Registries.ITEM.getKey(),
            new Identifier(ModInfo.MOD_ID, "tube_coral")
        );
    }

    public PCTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BEDS)
            .add(Items.WHITE_BED)
            .add(Items.ORANGE_BED)
            .add(Items.MAGENTA_BED)
            .add(Items.LIGHT_BLUE_BED)
            .add(Items.YELLOW_BED)
            .add(Items.LIME_BED)
            .add(Items.PINK_BED)
            .add(Items.GRAY_BED)
            .add(Items.LIGHT_GRAY_BED)
            .add(Items.CYAN_BED)
            .add(Items.PURPLE_BED)
            .add(Items.BLUE_BED)
            .add(Items.BROWN_BED)
            .add(Items.GREEN_BED)
            .add(Items.RED_BED)
            .add(Items.BLACK_BED);

        getOrCreateTagBuilder(BRAIN_CORAL)
            .add(Items.BRAIN_CORAL)
            .add(Items.BRAIN_CORAL_FAN);

        getOrCreateTagBuilder(BUBBLE_CORAL)
            .add(Items.BUBBLE_CORAL)
            .add(Items.BUBBLE_CORAL_FAN);

        getOrCreateTagBuilder(COAL_CHARCOAL)
            .add(Items.COAL)
            .add(Items.CHARCOAL);

        getOrCreateTagBuilder(CONCRETE)
            .add(Items.WHITE_CONCRETE)
            .add(Items.ORANGE_CONCRETE)
            .add(Items.MAGENTA_CONCRETE)
            .add(Items.LIGHT_BLUE_CONCRETE)
            .add(Items.YELLOW_CONCRETE)
            .add(Items.LIME_CONCRETE)
            .add(Items.PINK_CONCRETE)
            .add(Items.GRAY_CONCRETE)
            .add(Items.LIGHT_GRAY_CONCRETE)
            .add(Items.CYAN_CONCRETE)
            .add(Items.PURPLE_CONCRETE)
            .add(Items.BLUE_CONCRETE)
            .add(Items.BROWN_CONCRETE)
            .add(Items.GREEN_CONCRETE)
            .add(Items.RED_CONCRETE)
            .add(Items.BLACK_CONCRETE);

        getOrCreateTagBuilder(CONCRETE_POWDERS)
            .add(Items.WHITE_CONCRETE_POWDER)
            .add(Items.ORANGE_CONCRETE_POWDER)
            .add(Items.MAGENTA_CONCRETE_POWDER)
            .add(Items.LIGHT_BLUE_CONCRETE_POWDER)
            .add(Items.YELLOW_CONCRETE_POWDER)
            .add(Items.LIME_CONCRETE_POWDER)
            .add(Items.PINK_CONCRETE_POWDER)
            .add(Items.GRAY_CONCRETE_POWDER)
            .add(Items.LIGHT_GRAY_CONCRETE_POWDER)
            .add(Items.CYAN_CONCRETE_POWDER)
            .add(Items.PURPLE_CONCRETE_POWDER)
            .add(Items.BLUE_CONCRETE_POWDER)
            .add(Items.BROWN_CONCRETE_POWDER)
            .add(Items.GREEN_CONCRETE_POWDER)
            .add(Items.RED_CONCRETE_POWDER)
            .add(Items.BLACK_CONCRETE_POWDER);

        getOrCreateTagBuilder(FIRE_CORAL)
            .add(Items.FIRE_CORAL)
            .add(Items.FIRE_CORAL_FAN);

        getOrCreateTagBuilder(GLAZED_TERRACOTTA)
            .add(Items.WHITE_GLAZED_TERRACOTTA)
            .add(Items.ORANGE_GLAZED_TERRACOTTA)
            .add(Items.MAGENTA_GLAZED_TERRACOTTA)
            .add(Items.LIGHT_BLUE_GLAZED_TERRACOTTA)
            .add(Items.YELLOW_GLAZED_TERRACOTTA)
            .add(Items.LIME_GLAZED_TERRACOTTA)
            .add(Items.PINK_GLAZED_TERRACOTTA)
            .add(Items.GRAY_GLAZED_TERRACOTTA)
            .add(Items.LIGHT_GRAY_GLAZED_TERRACOTTA)
            .add(Items.CYAN_GLAZED_TERRACOTTA)
            .add(Items.PURPLE_GLAZED_TERRACOTTA)
            .add(Items.BLUE_GLAZED_TERRACOTTA)
            .add(Items.BROWN_GLAZED_TERRACOTTA)
            .add(Items.GREEN_GLAZED_TERRACOTTA)
            .add(Items.RED_GLAZED_TERRACOTTA)
            .add(Items.BLACK_GLAZED_TERRACOTTA);

        getOrCreateTagBuilder(MUSHROOMS)
            .add(Items.BROWN_MUSHROOM)
            .add(Items.RED_MUSHROOM)
            .add(Items.CRIMSON_FUNGUS)
            .add(Items.WARPED_FUNGUS);

        getOrCreateTagBuilder(HORN_CORAL)
            .add(Items.HORN_CORAL)
            .add(Items.HORN_CORAL_FAN);

        getOrCreateTagBuilder(NETHERITE_BOOTS)
            .add(Items.NETHERITE_BOOTS);

        getOrCreateTagBuilder(NETHERITE_CHESTPLATES)
            .add(Items.NETHERITE_CHESTPLATE);

        getOrCreateTagBuilder(NETHERITE_HELMETS)
            .add(Items.NETHERITE_HELMET);

        getOrCreateTagBuilder(NETHERITE_LEGGINGS)
            .add(Items.NETHERITE_LEGGINGS);

        getOrCreateTagBuilder(QUARTZ_BLOCKS)
            .add(Items.QUARTZ_BLOCK)
            .add(Items.QUARTZ_PILLAR)
            .add(Items.CHISELED_QUARTZ_BLOCK);

        getOrCreateTagBuilder(TERRACOTTA)
            .add(Items.TERRACOTTA)
            .add(Items.WHITE_TERRACOTTA)
            .add(Items.ORANGE_TERRACOTTA)
            .add(Items.MAGENTA_TERRACOTTA)
            .add(Items.LIGHT_BLUE_TERRACOTTA)
            .add(Items.YELLOW_TERRACOTTA)
            .add(Items.LIME_TERRACOTTA)
            .add(Items.PINK_TERRACOTTA)
            .add(Items.GRAY_TERRACOTTA)
            .add(Items.LIGHT_GRAY_TERRACOTTA)
            .add(Items.CYAN_TERRACOTTA)
            .add(Items.PURPLE_TERRACOTTA)
            .add(Items.BLUE_TERRACOTTA)
            .add(Items.BROWN_TERRACOTTA)
            .add(Items.GREEN_TERRACOTTA)
            .add(Items.RED_TERRACOTTA)
            .add(Items.BLACK_TERRACOTTA);

        getOrCreateTagBuilder(TUBE_CORAL)
            .add(Items.TUBE_CORAL)
            .add(Items.TUBE_CORAL_FAN);
    }
}
