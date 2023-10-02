package com.chimericdream.pannotiacompanion.data.babel;

import net.minecraft.item.Items;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetNbtLootFunction;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.util.Pair;

abstract public class AbstractBookLootTable {
    public static final NbtCompound thirdEdition;
    public static final NbtCompound secondEdition;
    public static final NbtCompound firstEdition;

    static {
        thirdEdition = new NbtCompound();
        thirdEdition.putInt("generation", 2);

        secondEdition = new NbtCompound();
        secondEdition.putInt("generation", 1);

        firstEdition = new NbtCompound();
        firstEdition.putInt("generation", 0);
    }

    public static NbtCompound makeBaseBook(String author, Pair<String, String[]> data) {
        NbtCompound bookProperties = new NbtCompound();
        bookProperties.putString("author", author);
        bookProperties.putString("title", data.getLeft());
        bookProperties.putInt("generation", 3);

        String[] pageList = data.getRight();

        NbtList pages = new NbtList();
        for (int i = 0; i < pageList.length; i++) {
            NbtCompound page = new NbtCompound();
            page.putString("text", pageList[i]);

            pages.addElement(i, NbtString.of(page.toString()));
        }

        bookProperties.put("pages", pages);

        return bookProperties;
    }

    public static LeafEntry.Builder<?> getBaseBookLootTable(String author, Pair<String, String[]> data) {
        NbtCompound bookProperties = makeBaseBook(author, data);

        return ItemEntry.builder(Items.WRITTEN_BOOK)
            .apply(() -> SetNbtLootFunction.builder(bookProperties).build());
    }

    public static LootPoolEntry.Builder<?> getTopTierBookLootTable(String author, Pair<String, String[]> data) {
        return getBaseBookLootTable(author, data)
            .apply(() -> SetNbtLootFunction.builder(thirdEdition).conditionally(RandomChanceLootCondition.builder(1f)).build())
            .apply(() -> SetNbtLootFunction.builder(secondEdition).conditionally(RandomChanceLootCondition.builder(0.6f)).build())
            .apply(() -> SetNbtLootFunction.builder(firstEdition).conditionally(RandomChanceLootCondition.builder(0.3f)).build());
    }

    public static LootPoolEntry.Builder<?> getMediumTierBookLootTable(String author, Pair<String, String[]> data) {
        return getBaseBookLootTable(author, data)
            .apply(() -> SetNbtLootFunction.builder(thirdEdition).conditionally(RandomChanceLootCondition.builder(0.6f)).build())
            .apply(() -> SetNbtLootFunction.builder(secondEdition).conditionally(RandomChanceLootCondition.builder(0.2f)).build())
            .apply(() -> SetNbtLootFunction.builder(firstEdition).conditionally(RandomChanceLootCondition.builder(0.1f)).build());
    }

    public static LootPoolEntry.Builder<?> getRandomBookLootTable(String author, Pair<String, String[]> data) {
        return getBaseBookLootTable(author, data)
            .apply(() -> SetNbtLootFunction.builder(thirdEdition).conditionally(RandomChanceLootCondition.builder(0.4f)).build())
            .apply(() -> SetNbtLootFunction.builder(secondEdition).conditionally(RandomChanceLootCondition.builder(0.1f)).build())
            .apply(() -> SetNbtLootFunction.builder(firstEdition).conditionally(RandomChanceLootCondition.builder(0.01f)).build());
    }
}
