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
    public static LootPool.Builder getLootTable(float chance, float multiplier, float rolls) {
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

    public static LootPool.Builder getLootTable() {
        return getLootTable(0.3f, 0.05f, 1f);
    }
}
