package com.chimericdream.pannotiacompanion.data.babel.japanesetales;

import com.chimericdream.pannotiacompanion.data.babel.AbstractBookLootTable;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.LootPoolEntry;

import static com.chimericdream.pannotiacompanion.data.babel.japanesetales.BookList.*;

public class JapaneseTalesLootTable extends AbstractBookLootTable {
    public static String AUTHOR = "Japanese Fairy Tale";

    public static LootPoolEntry[] getBookEntries() {
        LootPool.Builder builder = LootPool.builder()
            .with(getBookLootTable(AUTHOR, THE_FARMER_AND_THE_BADGER))
            .with(getBookLootTable(AUTHOR, THE_GOBLIN_OF_ADACHIGAHARA))
            .with(getBookLootTable(AUTHOR, HOW_AN_OLD_MAN_LOST_HIS_WEN))
            .with(getBookLootTable(AUTHOR, THE_SAGACIOUS_MONKEY))
            .with(getBookLootTable(AUTHOR, MY_LORD_BAG_OF_RICE))
            .with(getBookLootTable(AUTHOR, THE_OGRE_OF_RASHOMON))
            .with(getBookLootTable(AUTHOR, THE_SHINANSHA))
            .with(getBookLootTable(AUTHOR, THE_WHITE_HARE_AND_THE_CROCODILES));

        return builder.build().entries;
    }
}
