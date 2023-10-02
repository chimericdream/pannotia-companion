package com.chimericdream.pannotiacompanion.data.babel.japanesetales;

import com.chimericdream.pannotiacompanion.data.babel.AbstractBookLootTable;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.util.Pair;

import java.util.function.BiFunction;

import static com.chimericdream.pannotiacompanion.data.babel.japanesetales.BookList.*;

public class JapaneseTalesLootTable extends AbstractBookLootTable {
    public static final String AUTHOR = "Japanese Fairy Tale";

    public static LootPoolEntry[] getBookEntries(BiFunction<String, Pair<String, String[]>, LootPoolEntry.Builder<?>> method) {
        LootPool.Builder builder = LootPool.builder()
            .with(method.apply(AUTHOR, THE_FARMER_AND_THE_BADGER))
            .with(method.apply(AUTHOR, THE_GOBLIN_OF_ADACHIGAHARA))
            .with(method.apply(AUTHOR, HOW_AN_OLD_MAN_LOST_HIS_WEN))
            .with(method.apply(AUTHOR, THE_SAGACIOUS_MONKEY))
            .with(method.apply(AUTHOR, MY_LORD_BAG_OF_RICE))
            .with(method.apply(AUTHOR, THE_OGRE_OF_RASHOMON))
            .with(method.apply(AUTHOR, THE_SHINANSHA))
            .with(method.apply(AUTHOR, THE_WHITE_HARE_AND_THE_CROCODILES));

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
