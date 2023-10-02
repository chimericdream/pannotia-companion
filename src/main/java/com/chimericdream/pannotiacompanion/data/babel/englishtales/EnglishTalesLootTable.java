package com.chimericdream.pannotiacompanion.data.babel.englishtales;

import com.chimericdream.pannotiacompanion.data.babel.AbstractBookLootTable;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.util.Pair;

import java.util.function.BiFunction;

import static com.chimericdream.pannotiacompanion.data.babel.englishtales.BookList.*;

public class EnglishTalesLootTable extends AbstractBookLootTable {
    public static final String AUTHOR = "English Fairy Tale";

    public static LootPoolEntry[] getBookEntries(BiFunction<String, Pair<String, String[]>, LootPoolEntry.Builder<?>> method) {
        LootPool.Builder builder = LootPool.builder()
            .with(method.apply(AUTHOR, THE_ASS_THE_TABLE_AND_THE_STICK))
            .with(method.apply(AUTHOR, BINNORIE))
            .with(method.apply(AUTHOR, CAP_O_RUSHES))
            .with(method.apply(AUTHOR, CHILDE_ROWLAND))
            .with(method.apply(AUTHOR, EARL_MARS_DAUGHTER))
            .with(method.apply(AUTHOR, FAIRY_OINTMENT))
            .with(method.apply(AUTHOR, THE_FISH_AND_THE_RING))
            .with(method.apply(AUTHOR, HENNY_PENNY))
            .with(method.apply(AUTHOR, JACK_AND_THE_BEANSTALK))
            .with(method.apply(AUTHOR, JACK_HANNAFORD))
            .with(method.apply(AUTHOR, JACK_WENT_TO_SEEK_HIS_FORTUNE))
            .with(method.apply(AUTHOR, JOHNNY_CAKE))
            .with(method.apply(AUTHOR, KATE_CRACKERNUTS))
            .with(method.apply(AUTHOR, LAZY_JACK))
            .with(method.apply(AUTHOR, THE_MASTER_AND_HIS_PUPIL))
            .with(method.apply(AUTHOR, MOLLY_WHUPPIE))
            .with(method.apply(AUTHOR, MR_FOX))
            .with(method.apply(AUTHOR, MR_MIACCA))
            .with(method.apply(AUTHOR, MR_VINEGAR))
            .with(method.apply(AUTHOR, NIX_NOUGHT_NOTHING))
            .with(method.apply(AUTHOR, THE_OLD_WOMAN_AND_HER_PIG))
            .with(method.apply(AUTHOR, THE_RED_ETTIN))
            .with(method.apply(AUTHOR, THE_ROSE_TREE))
            .with(method.apply(AUTHOR, THE_THREE_BEARS))
            .with(method.apply(AUTHOR, THE_THREE_HEADS_OF_THE_WELL))
            .with(method.apply(AUTHOR, THE_3_LITTLE_PIGS))
            .with(method.apply(AUTHOR, THE_THREE_SILLIES))
            .with(method.apply(AUTHOR, TITTY_MOUSE_AND_TATTY_MOUSE))
            .with(method.apply(AUTHOR, TOM_TIT_TOT))
            .with(method.apply(AUTHOR, THE_WELL_OF_THE_WORLDS_END));

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
