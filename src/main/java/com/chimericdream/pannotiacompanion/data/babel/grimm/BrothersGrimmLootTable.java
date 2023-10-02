package com.chimericdream.pannotiacompanion.data.babel.grimm;

import com.chimericdream.pannotiacompanion.data.babel.AbstractBookLootTable;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.util.Pair;

import java.util.function.BiFunction;

import static com.chimericdream.pannotiacompanion.data.babel.grimm.BookList.*;

public class BrothersGrimmLootTable extends AbstractBookLootTable {
    public static final String AUTHOR = "The Brothers Grimm";

    public static LootPoolEntry[] getBookEntries(BiFunction<String, Pair<String, String[]>, LootPoolEntry.Builder<?>> method) {
        LootPool.Builder builder = LootPool.builder()
            .with(method.apply(AUTHOR, THE_12_DANCING_PRINCESSES))
            .with(method.apply(AUTHOR, THE_BLUE_LIGHT))
            .with(method.apply(AUTHOR, BRIAR_ROSE))
            .with(method.apply(AUTHOR, CAT_AND_MOUSE_IN_PARTNERSHIP))
            .with(method.apply(AUTHOR, CAT_SKIN))
            .with(method.apply(AUTHOR, CLEVER_ELSIE))
            .with(method.apply(AUTHOR, CLEVER_GRETEL))
            .with(method.apply(AUTHOR, CLEVER_HANS))
            .with(method.apply(AUTHOR, DOCTOR_KNOWALL))
            .with(method.apply(AUTHOR, THE_DOG_AND_THE_SPARROW))
            .with(method.apply(AUTHOR, THE_ELVES_AND_THE_SHOEMAKER))
            .with(method.apply(AUTHOR, THE_FISHERMAN_AND_HIS_WIFE))
            .with(method.apply(AUTHOR, THE_FOUR_CLEVER_BROTHERS))
            .with(method.apply(AUTHOR, THE_FOX_AND_THE_HORSE))
            .with(method.apply(AUTHOR, FREDERICK_AND_CATHERINE))
            .with(method.apply(AUTHOR, THE_FROG_PRINCE))
            .with(method.apply(AUTHOR, FUNDEVOGEL))
            .with(method.apply(AUTHOR, THE_GOLDEN_BIRD))
            .with(method.apply(AUTHOR, THE_GOLDEN_GOOSE))
            .with(method.apply(AUTHOR, THE_GOOSE_GIRL))
            .with(method.apply(AUTHOR, HANS_IN_LUCK))
            .with(method.apply(AUTHOR, JORINDA_AND_JORINDEL))
            .with(method.apply(AUTHOR, THE_KING_OF_THE_GOLDEN_MOUNTAIN))
            .with(method.apply(AUTHOR, KING_GRISLY_BEARD))
            .with(method.apply(AUTHOR, LILY_AND_THE_LION))
            .with(method.apply(AUTHOR, THE_LITTLE_PEASANT))
            .with(method.apply(AUTHOR, LITTLE_RED_CAP))
            .with(method.apply(AUTHOR, THE_MISER_IN_THE_BUSH))
            .with(method.apply(AUTHOR, MOTHER_HOLLE))
            .with(method.apply(AUTHOR, THE_MOUSE_BIRD_AND_SAUSAGE))
            .with(method.apply(AUTHOR, OLD_SULTAN))
            .with(method.apply(AUTHOR, THE_QUEEN_BEE))
            .with(method.apply(AUTHOR, RAPUNZEL))
            .with(method.apply(AUTHOR, THE_RAVEN))
            .with(method.apply(AUTHOR, THE_ROBBER_BRIDEGROOM))
            .with(method.apply(AUTHOR, RUMPELSTILTSKIN))
            .with(method.apply(AUTHOR, THE_SALAD))
            .with(method.apply(AUTHOR, THE_SEVEN_RAVENS))
            .with(method.apply(AUTHOR, SNOWDROP))
            .with(method.apply(AUTHOR, SNOW_WHITE_AND_ROSE_RED))
            .with(method.apply(AUTHOR, THE_STRAW_THE_COAL_AND_THE_BEAN))
            .with(method.apply(AUTHOR, SWEETHEART_ROLAND))
            .with(method.apply(AUTHOR, THE_PINK))
            .with(method.apply(AUTHOR, THE_THREE_LANGUAGES))
            .with(method.apply(AUTHOR, TOM_THUMB))
            .with(method.apply(AUTHOR, THE_TRAVELLING_MUSICIANS))
            .with(method.apply(AUTHOR, THE_TURNIP))
            .with(method.apply(AUTHOR, THE_TWELVE_HUNTSMEN))
            .with(method.apply(AUTHOR, THE_WHITE_SNAKE))
            .with(method.apply(AUTHOR, THE_WILLOW_WREN_AND_THE_BEAR))
            .with(method.apply(AUTHOR, THE_WOLF_AND_THE_7_LITTLE_KIDS));

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
