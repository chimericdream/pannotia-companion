package com.chimericdream.pannotiacompanion.data.babel.englishtales;

import com.chimericdream.pannotiacompanion.data.babel.AbstractBookLootTable;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.LootPoolEntry;

import static com.chimericdream.pannotiacompanion.data.babel.englishtales.BookList.*;

public class EnglishTalesLootTable extends AbstractBookLootTable {
    public static String AUTHOR = "English Fairy Tale";

    public static LootPoolEntry[] getBookEntries() {
        LootPool.Builder builder = LootPool.builder()
            .with(getBookLootTable(AUTHOR, THE_ASS_THE_TABLE_AND_THE_STICK))
            .with(getBookLootTable(AUTHOR, BINNORIE))
            .with(getBookLootTable(AUTHOR, CAP_O_RUSHES))
            .with(getBookLootTable(AUTHOR, CHILDE_ROWLAND))
            .with(getBookLootTable(AUTHOR, EARL_MARS_DAUGHTER))
            .with(getBookLootTable(AUTHOR, FAIRY_OINTMENT))
            .with(getBookLootTable(AUTHOR, THE_FISH_AND_THE_RING))
            .with(getBookLootTable(AUTHOR, HENNY_PENNY))
            .with(getBookLootTable(AUTHOR, JACK_AND_THE_BEANSTALK))
            .with(getBookLootTable(AUTHOR, JACK_HANNAFORD))
            .with(getBookLootTable(AUTHOR, JACK_WENT_TO_SEEK_HIS_FORTUNE))
            .with(getBookLootTable(AUTHOR, JOHNNY_CAKE))
            .with(getBookLootTable(AUTHOR, KATE_CRACKERNUTS))
            .with(getBookLootTable(AUTHOR, LAZY_JACK))
            .with(getBookLootTable(AUTHOR, THE_MASTER_AND_HIS_PUPIL))
            .with(getBookLootTable(AUTHOR, MOLLY_WHUPPIE))
            .with(getBookLootTable(AUTHOR, MR_FOX))
            .with(getBookLootTable(AUTHOR, MR_MIACCA))
            .with(getBookLootTable(AUTHOR, MR_VINEGAR))
            .with(getBookLootTable(AUTHOR, NIX_NOUGHT_NOTHING))
            .with(getBookLootTable(AUTHOR, THE_OLD_WOMAN_AND_HER_PIG))
            .with(getBookLootTable(AUTHOR, THE_RED_ETTIN))
            .with(getBookLootTable(AUTHOR, THE_ROSE_TREE))
            .with(getBookLootTable(AUTHOR, THE_THREE_BEARS))
            .with(getBookLootTable(AUTHOR, THE_THREE_HEADS_OF_THE_WELL))
            .with(getBookLootTable(AUTHOR, THE_3_LITTLE_PIGS))
            .with(getBookLootTable(AUTHOR, THE_THREE_SILLIES))
            .with(getBookLootTable(AUTHOR, TITTY_MOUSE_AND_TATTY_MOUSE))
            .with(getBookLootTable(AUTHOR, TOM_TIT_TOT))
            .with(getBookLootTable(AUTHOR, THE_WELL_OF_THE_WORLDS_END));

        return builder.build().entries;
    }
}
