package com.chimericdream.pannotiacompanion.data.babel;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetNbtLootFunction;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.util.Pair;

abstract public class AbstractBookLootTable {
    public static LootPoolEntry.Builder<?> getBookLootTable(String author, Pair<String, String[]> data) {
        Item book = Items.WRITTEN_BOOK;

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

        NbtCompound copyOfCopy = new NbtCompound();
        copyOfCopy.putInt("generation", 2);

        NbtCompound copyOfOriginal = new NbtCompound();
        copyOfOriginal.putInt("generation", 1);

        NbtCompound firstEdition = new NbtCompound();
        firstEdition.putInt("generation", 0);

        return ItemEntry.builder(book)
            .apply(() -> SetNbtLootFunction.builder(bookProperties).build())
            .apply(() -> SetNbtLootFunction.builder(copyOfCopy).conditionally(RandomChanceLootCondition.builder(0.4f)).build())
            .apply(() -> SetNbtLootFunction.builder(copyOfOriginal).conditionally(RandomChanceLootCondition.builder(0.1f)).build())
            .apply(() -> SetNbtLootFunction.builder(firstEdition).conditionally(RandomChanceLootCondition.builder(0.01f)).build());
    }
}
