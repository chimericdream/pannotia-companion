package com.chimericdream.pannotiacompanion.loot;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.function.SetNameLootFunction;
import net.minecraft.loot.function.SetNbtLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.data.TreasureGemTextures.*;

public class TreasureGemLootTables {
    private static LootPoolEntry.Builder<?> getGemLootTable(String name, int color, Pair<String, int[]> data) {
        Item headItem = Items.PLAYER_HEAD;

        NbtCompound headTexture = new NbtCompound();
        headTexture.putString("Value", data.getLeft());
        NbtList textureList = new NbtList();
        textureList.add(headTexture);

        NbtCompound properties = new NbtCompound();
        properties.put("textures", textureList);

        NbtCompound owner = new NbtCompound();
        owner.putIntArray("Id", data.getRight());
        owner.put("Properties", properties);
        NbtCompound skullOwner = new NbtCompound();
        skullOwner.put("SkullOwner", owner);

        Text formattedName = MutableText.of(TextContent.EMPTY)
            .append(name)
            .setStyle(Style.EMPTY.withItalic(false).withColor(color));

        LootFunction.Builder nameBuilder = () -> SetNameLootFunction.builder(formattedName).build();

        LootFunction.Builder textureBuilder = () -> SetNbtLootFunction.builder(skullOwner).build();

        return ItemEntry.builder(headItem)
            .apply(nameBuilder)
            .apply(textureBuilder)
            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0, 2)));
    }

    public static LootPool.Builder getRandomGemLootTable() {
        return LootPool.builder()
            .with(getAmberGemLootTable())
            .with(getAmethystGemLootTable())
            .with(getAmetrineGemLootTable())
            .with(getAmmoliteGemLootTable())
            .with(getApatiteGemLootTable())
            .with(getAventurineGemLootTable())
            .with(getBloodRedPearlGemLootTable())
            .with(getCarobbiiteGemLootTable())
            .with(getCitrineGemLootTable())
            .with(getCosmicQuartzGemLootTable())
            .with(getCrystalOpalGemLootTable())
            .with(getDragonsbreathOpalGemLootTable())
            .with(getFireAgateGemLootTable())
            .with(getGreenPearlGemLootTable())
            .with(getMalachiteGemLootTable())
            .with(getMidnightOpalGemLootTable())
            .with(getMorganiteGemLootTable())
            .with(getOnyxGemLootTable())
            .with(getPearlGemLootTable())
            .with(getQuartzGemLootTable())
            .with(getRedEnderPearlGemLootTable())
            .with(getSapphireGemLootTable())
            .with(getZirconGemLootTable())
            .rolls(UniformLootNumberProvider.create(0, 2));
    }

    public static LootPoolEntry.Builder<?> getAmberGemLootTable() {
        return getGemLootTable("Amber", 15493380, AMBER);
    }

    public static LootPoolEntry.Builder<?> getAmethystGemLootTable() {
        return getGemLootTable("Amethyst", 16075758, AMETHYST);
    }

    public static LootPoolEntry.Builder<?> getAmetrineGemLootTable() {
        return getGemLootTable("Ametrine", 16651445, AMETRINE);
    }

    public static LootPoolEntry.Builder<?> getAmmoliteGemLootTable() {
        return getGemLootTable("Ammolite", 3316796, AMMOLITE);
    }

    public static LootPoolEntry.Builder<?> getApatiteGemLootTable() {
        return getGemLootTable("Apatite", 1893276, APATITE);
    }

    public static LootPoolEntry.Builder<?> getAventurineGemLootTable() {
        return getGemLootTable("Aventurine", 11927718, AVENTURINE);
    }

    public static LootPoolEntry.Builder<?> getBloodRedPearlGemLootTable() {
        return getGemLootTable("Blood Red Pearl", 16667770, BLOOD_RED_PEARL);
    }

    public static LootPoolEntry.Builder<?> getCarobbiiteGemLootTable() {
        return getGemLootTable("Carobbiite", 13029977, CAROBBIITE);
    }

    public static LootPoolEntry.Builder<?> getCitrineGemLootTable() {
        return getGemLootTable("Citrine", 16704031, CITRINE);
    }

    public static LootPoolEntry.Builder<?> getCosmicQuartzGemLootTable() {
        return getGemLootTable("Cosmic Quartz", 13880053, COSMIC_QUARTZ);
    }

    public static LootPoolEntry.Builder<?> getCrystalOpalGemLootTable() {
        return getGemLootTable("Crystal Opal", 13097701, CRYSTAL_OPAL);
    }

    public static LootPoolEntry.Builder<?> getDragonsbreathOpalGemLootTable() {
        return getGemLootTable("Dragonsbreath Opal", 11421632, DRAGONSBREATH_OPAL);
    }

    public static LootPoolEntry.Builder<?> getFireAgateGemLootTable() {
        return getGemLootTable("Fire Agate", 14438912, FIRE_AGATE);
    }

    public static LootPoolEntry.Builder<?> getGreenPearlGemLootTable() {
        return getGemLootTable("Green Pearl", 13366236, GREEN_PEARL);
    }

    public static LootPoolEntry.Builder<?> getMalachiteGemLootTable() {
        return getGemLootTable("Malachite", 3633491, MALACHITE);
    }

    public static LootPoolEntry.Builder<?> getMidnightOpalGemLootTable() {
        return getGemLootTable("Midnight Opal", 4031452, MIDNIGHT_OPAL);
    }

    public static LootPoolEntry.Builder<?> getMorganiteGemLootTable() {
        return getGemLootTable("Morganite", 14752179, MORGANITE);
    }

    public static LootPoolEntry.Builder<?> getOnyxGemLootTable() {
        return getGemLootTable("Onyx", 9539985, ONYX);
    }

    public static LootPoolEntry.Builder<?> getPearlGemLootTable() {
        return getGemLootTable("Pearl", 14733044, PEARL);
    }

    public static LootPoolEntry.Builder<?> getQuartzGemLootTable() {
        return getGemLootTable("Quartz", 15461355, QUARTZ);
    }

    public static LootPoolEntry.Builder<?> getRedEnderPearlGemLootTable() {
        return getGemLootTable("Red Ender Pearl", 9839149, RED_ENDER_PEARL);
    }

    public static LootPoolEntry.Builder<?> getSapphireGemLootTable() {
        return getGemLootTable("Sapphire", 3031232, SAPPHIRE);
    }

    public static LootPoolEntry.Builder<?> getZirconGemLootTable() {
        return getGemLootTable("Zircon", 3858410, ZIRCON);
    }
}
