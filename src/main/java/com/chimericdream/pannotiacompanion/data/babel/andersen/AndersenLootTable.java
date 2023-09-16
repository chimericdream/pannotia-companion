package com.chimericdream.pannotiacompanion.data.babel.andersen;

import com.chimericdream.pannotiacompanion.data.babel.AbstractBookLootTable;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.LootPoolEntry;

import static com.chimericdream.pannotiacompanion.data.babel.andersen.BookList.*;

public class AndersenLootTable extends AbstractBookLootTable {
    public static String AUTHOR = "Hans Christian Andersen";

    public static LootPoolEntry[] getBookEntries() {
        LootPool.Builder builder = LootPool.builder()
            .with(getBookLootTable(AUTHOR, THE_BELL))
            .with(getBookLootTable(AUTHOR, THE_DREAM_OF_LITTLE_TUK))
            .with(getBookLootTable(AUTHOR, THE_EMPERORS_NEW_CLOTHES))
            .with(getBookLootTable(AUTHOR, THE_FALSE_COLLAR))
            .with(getBookLootTable(AUTHOR, THE_HAPPY_FAMILY))
            .with(getBookLootTable(AUTHOR, THE_LEAP_FROG))
            .with(getBookLootTable(AUTHOR, THE_LITTLE_MATCH_GIRL))
            .with(getBookLootTable(AUTHOR, THE_NAUGHTY_BOY))
            .with(getBookLootTable(AUTHOR, PUSS_IN_BOOTS))
            .with(getBookLootTable(AUTHOR, THE_REAL_PRINCESS))
            .with(getBookLootTable(AUTHOR, THE_RED_SHOES))
            .with(getBookLootTable(AUTHOR, THE_STORY_OF_A_MOTHER))
            .with(getBookLootTable(AUTHOR, THE_SWINEHERD));

        return builder.build().entries;
    }
}
