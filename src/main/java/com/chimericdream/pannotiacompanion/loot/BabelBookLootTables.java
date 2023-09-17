package com.chimericdream.pannotiacompanion.loot;

import com.chimericdream.pannotiacompanion.data.babel.andersen.AndersenLootTable;
import com.chimericdream.pannotiacompanion.data.babel.englishtales.EnglishTalesLootTable;
import com.chimericdream.pannotiacompanion.data.babel.grimm.BrothersGrimmLootTable;
import com.chimericdream.pannotiacompanion.data.babel.japanesetales.JapaneseTalesLootTable;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceWithLootingLootCondition;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

import java.util.Arrays;

public class BabelBookLootTables {
    public static LootPool.Builder getTopTierLootTable(float chance, float multiplier, float rolls) {
        LootPool.Builder builder = LootPool.builder();

        LootPoolEntry[] andersenEntries = AndersenLootTable.getTopTierBookEntries();
        LootPoolEntry[] brothersGrimmEntries = BrothersGrimmLootTable.getTopTierBookEntries();
        LootPoolEntry[] englishTalesEntries = EnglishTalesLootTable.getTopTierBookEntries();
        LootPoolEntry[] japaneseTalesEntries = JapaneseTalesLootTable.getTopTierBookEntries();

        return builder
            .with(Arrays.stream(andersenEntries).toList())
            .with(Arrays.stream(brothersGrimmEntries).toList())
            .with(Arrays.stream(englishTalesEntries).toList())
            .with(Arrays.stream(japaneseTalesEntries).toList())
            .conditionally(() -> RandomChanceWithLootingLootCondition.builder(chance, multiplier).build())
            .rolls(ConstantLootNumberProvider.create(rolls));
    }

    public static LootPool.Builder getMediumTierLootTable(float chance, float multiplier, float rolls) {
        LootPool.Builder builder = LootPool.builder();

        LootPoolEntry[] andersenEntries = AndersenLootTable.getMediumTierBookEntries();
        LootPoolEntry[] brothersGrimmEntries = BrothersGrimmLootTable.getMediumTierBookEntries();
        LootPoolEntry[] englishTalesEntries = EnglishTalesLootTable.getMediumTierBookEntries();
        LootPoolEntry[] japaneseTalesEntries = JapaneseTalesLootTable.getMediumTierBookEntries();

        return builder
            .with(Arrays.stream(andersenEntries).toList())
            .with(Arrays.stream(brothersGrimmEntries).toList())
            .with(Arrays.stream(englishTalesEntries).toList())
            .with(Arrays.stream(japaneseTalesEntries).toList())
            .conditionally(() -> RandomChanceWithLootingLootCondition.builder(chance, multiplier).build())
            .rolls(ConstantLootNumberProvider.create(rolls));
    }

    public static LootPool.Builder getRandomBookLootTable(float chance, float multiplier, float rolls) {
        LootPool.Builder builder = LootPool.builder();

        LootPoolEntry[] andersenEntries = AndersenLootTable.getBookEntries();
        LootPoolEntry[] brothersGrimmEntries = BrothersGrimmLootTable.getBookEntries();
        LootPoolEntry[] englishTalesEntries = EnglishTalesLootTable.getBookEntries();
        LootPoolEntry[] japaneseTalesEntries = JapaneseTalesLootTable.getBookEntries();

        return builder
            .with(Arrays.stream(andersenEntries).toList())
            .with(Arrays.stream(brothersGrimmEntries).toList())
            .with(Arrays.stream(englishTalesEntries).toList())
            .with(Arrays.stream(japaneseTalesEntries).toList())
            .conditionally(() -> RandomChanceWithLootingLootCondition.builder(chance, multiplier).build())
            .rolls(ConstantLootNumberProvider.create(rolls));
    }

    public static LootPool.Builder getTopTierLootTable(float rolls) {
        return getTopTierLootTable(0.3f, 0.05f, rolls);
    }

    public static LootPool.Builder getMediumTierLootTable(float rolls) {
        return getMediumTierLootTable(0.3f, 0.05f, rolls);
    }

    public static LootPool.Builder getRandomBookLootTable(float rolls) {
        return getRandomBookLootTable(0.3f, 0.05f, rolls);
    }

    public static LootPool.Builder getTopTierLootTable() {
        return getTopTierLootTable(1f);
    }

    public static LootPool.Builder getMediumTierLootTable() {
        return getMediumTierLootTable(1f);
    }

    public static LootPool.Builder getRandomBookLootTable() {
        return getRandomBookLootTable(1f);
    }
}
