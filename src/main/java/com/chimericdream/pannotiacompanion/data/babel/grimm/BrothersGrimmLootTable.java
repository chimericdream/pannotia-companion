package com.chimericdream.pannotiacompanion.data.babel.grimm;

import com.chimericdream.pannotiacompanion.data.babel.AbstractBookLootTable;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.LootPoolEntry;

import static com.chimericdream.pannotiacompanion.data.babel.grimm.BookList.*;

public class BrothersGrimmLootTable extends AbstractBookLootTable {
    public static String AUTHOR = "The Brothers Grimm";

    public static LootPoolEntry[] getBookEntries() {
        LootPool.Builder builder = LootPool.builder()
            .with(getBookLootTable(AUTHOR, THE_12_DANCING_PRINCESSES))
            .with(getBookLootTable(AUTHOR, THE_BLUE_LIGHT))
            .with(getBookLootTable(AUTHOR, BRIAR_ROSE))
            .with(getBookLootTable(AUTHOR, CAT_AND_MOUSE_IN_PARTNERSHIP))
            .with(getBookLootTable(AUTHOR, CAT_SKIN))
            .with(getBookLootTable(AUTHOR, CLEVER_ELSIE))
            .with(getBookLootTable(AUTHOR, CLEVER_GRETEL))
            .with(getBookLootTable(AUTHOR, CLEVER_HANS))
            .with(getBookLootTable(AUTHOR, DOCTOR_KNOWALL))
            .with(getBookLootTable(AUTHOR, THE_DOG_AND_THE_SPARROW))
            .with(getBookLootTable(AUTHOR, THE_ELVES_AND_THE_SHOEMAKER))
            .with(getBookLootTable(AUTHOR, THE_FISHERMAN_AND_HIS_WIFE))
            .with(getBookLootTable(AUTHOR, THE_FOUR_CLEVER_BROTHERS))
            .with(getBookLootTable(AUTHOR, THE_FOX_AND_THE_HORSE))
            .with(getBookLootTable(AUTHOR, FREDERICK_AND_CATHERINE))
            .with(getBookLootTable(AUTHOR, THE_FROG_PRINCE))
            .with(getBookLootTable(AUTHOR, FUNDEVOGEL))
            .with(getBookLootTable(AUTHOR, THE_GOLDEN_BIRD))
            .with(getBookLootTable(AUTHOR, THE_GOLDEN_GOOSE))
            .with(getBookLootTable(AUTHOR, THE_GOOSE_GIRL))
            .with(getBookLootTable(AUTHOR, HANS_IN_LUCK))
            .with(getBookLootTable(AUTHOR, JORINDA_AND_JORINDEL))
            .with(getBookLootTable(AUTHOR, THE_KING_OF_THE_GOLDEN_MOUNTAIN))
            .with(getBookLootTable(AUTHOR, KING_GRISLY_BEARD))
            .with(getBookLootTable(AUTHOR, LILY_AND_THE_LION))
            .with(getBookLootTable(AUTHOR, THE_LITTLE_PEASANT))
            .with(getBookLootTable(AUTHOR, LITTLE_RED_CAP))
            .with(getBookLootTable(AUTHOR, THE_MISER_IN_THE_BUSH))
            .with(getBookLootTable(AUTHOR, MOTHER_HOLLE))
            .with(getBookLootTable(AUTHOR, THE_MOUSE_BIRD_AND_SAUSAGE))
            .with(getBookLootTable(AUTHOR, OLD_SULTAN))
            .with(getBookLootTable(AUTHOR, THE_QUEEN_BEE))
            .with(getBookLootTable(AUTHOR, RAPUNZEL))
            .with(getBookLootTable(AUTHOR, THE_RAVEN))
            .with(getBookLootTable(AUTHOR, THE_ROBBER_BRIDEGROOM))
            .with(getBookLootTable(AUTHOR, RUMPELSTILTSKIN))
            .with(getBookLootTable(AUTHOR, THE_SALAD))
            .with(getBookLootTable(AUTHOR, THE_SEVEN_RAVENS))
            .with(getBookLootTable(AUTHOR, SNOWDROP))
            .with(getBookLootTable(AUTHOR, SNOW_WHITE_AND_ROSE_RED))
            .with(getBookLootTable(AUTHOR, THE_STRAW_THE_COAL_AND_THE_BEAN))
            .with(getBookLootTable(AUTHOR, SWEETHEART_ROLAND))
            .with(getBookLootTable(AUTHOR, THE_PINK))
            .with(getBookLootTable(AUTHOR, THE_THREE_LANGUAGES))
            .with(getBookLootTable(AUTHOR, TOM_THUMB))
            .with(getBookLootTable(AUTHOR, THE_TRAVELLING_MUSICIANS))
            .with(getBookLootTable(AUTHOR, THE_TURNIP))
            .with(getBookLootTable(AUTHOR, THE_TWELVE_HUNTSMEN))
            .with(getBookLootTable(AUTHOR, THE_WHITE_SNAKE))
            .with(getBookLootTable(AUTHOR, THE_WILLOW_WREN_AND_THE_BEAR))
            .with(getBookLootTable(AUTHOR, THE_WOLF_AND_THE_7_LITTLE_KIDS));

        return builder.build().entries;
    }
}
