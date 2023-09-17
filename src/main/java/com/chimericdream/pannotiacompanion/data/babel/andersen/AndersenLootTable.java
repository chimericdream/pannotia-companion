package com.chimericdream.pannotiacompanion.data.babel.andersen;

import com.chimericdream.pannotiacompanion.data.babel.AbstractBookLootTable;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.util.Pair;

import java.util.function.BiFunction;

import static com.chimericdream.pannotiacompanion.data.babel.andersen.BookList.*;

public class AndersenLootTable extends AbstractBookLootTable {
    public static String AUTHOR = "Hans Christian Andersen";

    public static LootPoolEntry[] getBookEntries(BiFunction<String, Pair<String, String[]>, LootPoolEntry.Builder<?>> method) {
        LootPool.Builder builder = LootPool.builder()
            .with(method.apply(AUTHOR, THE_BELL))
            .with(method.apply(AUTHOR, THE_DREAM_OF_LITTLE_TUK))
            .with(method.apply(AUTHOR, THE_EMPERORS_NEW_CLOTHES))
            .with(method.apply(AUTHOR, THE_FALSE_COLLAR))
            .with(method.apply(AUTHOR, THE_HAPPY_FAMILY))
            .with(method.apply(AUTHOR, THE_LEAP_FROG))
            .with(method.apply(AUTHOR, THE_LITTLE_MATCH_GIRL))
            .with(method.apply(AUTHOR, THE_NAUGHTY_BOY))
            .with(method.apply(AUTHOR, PUSS_IN_BOOTS))
            .with(method.apply(AUTHOR, THE_REAL_PRINCESS))
            .with(method.apply(AUTHOR, THE_RED_SHOES))
            .with(method.apply(AUTHOR, THE_STORY_OF_A_MOTHER))
            .with(method.apply(AUTHOR, THE_SWINEHERD));

        return builder.build().entries;
    }

    public static LootPoolEntry[] getTopTierBookEntries() {
        return getBookEntries(AbstractBookLootTable::getTopTierBookLootTable);
    }

    public static LootPoolEntry[] getMediumTierBookEntries() {
        return getBookEntries(AbstractBookLootTable::getMediumTierBookLootTable);
    }

    public static LootPoolEntry[] getBookEntries() {
        return getBookEntries(AbstractBookLootTable::getRandomBookLootTable);
    }
}
