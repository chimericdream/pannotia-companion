package com.chimericdream.pannotiacompanion.loot;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.*;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.SetNameLootFunction;
import net.minecraft.loot.function.SetNbtLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.predicate.NbtPredicate;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.util.Pair;

public class LootHelpers {
    public static final LootCondition.Builder KILLED_BY_PLAYER = () -> KilledByPlayerLootCondition.builder().build();

    public static LootCondition.Builder makeEntityPropertyCondition(NbtPredicate predicate) {
        return () -> EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS, EntityPredicate.Builder.create().nbt(predicate)).build();
    }

    public static LootCondition.Builder makeLootingCondition(float chance, float lootingMultiplier) {
        return () -> RandomChanceWithLootingLootCondition.builder(chance, lootingMultiplier).build();
    }

    public static LootCondition.Builder makeShearsCondition() {
        return () -> MatchToolLootCondition
            .builder(ItemPredicate.Builder.create().items(Items.SHEARS))
            .build();
    }

    public static LootCondition.Builder makeSilkTouchCondition() {
        return () -> MatchToolLootCondition
            .builder(ItemPredicate.Builder.create().enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.ANY)))
            .build();
    }

    public static LootCondition.Builder makeSurvivesExplosionCondition() {
        return () -> SurvivesExplosionLootCondition.builder().build();
    }

    public static LootCondition.Builder makeChanceCondition(float chance) {
        return () -> RandomChanceLootCondition.builder(chance).build();
    }

    public static NbtPredicate makeProfessionPredicate(String profession) {
        NbtCompound villagerData = new NbtCompound();
        villagerData.putString("profession", profession);

        NbtCompound nbt = new NbtCompound();
        nbt.put("VillagerData", villagerData);

        return new NbtPredicate(nbt);
    }

    public static NbtPredicate makeVariantPredicate(int variant) {
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("Variant", variant);

        return new NbtPredicate(nbt);
    }

    public static NbtPredicate makeVariantPredicate(String variant) {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("variant", variant);

        return new NbtPredicate(nbt);
    }

    public static NbtCompound makeHeadNbt(Pair<String, int[]> data) {
        NbtCompound headTexture = new NbtCompound();
        headTexture.putString("Value", data.getLeft());
        NbtList textureList = new NbtList();
        textureList.add(headTexture);

        NbtCompound properties = new NbtCompound();
        properties.put("textures", textureList);

        NbtCompound owner = new NbtCompound();
        if (data.getRight().length > 0) {
            owner.putIntArray("Id", data.getRight());
        }
        owner.put("Properties", properties);

        NbtCompound skullNbt = new NbtCompound();
        skullNbt.put("SkullOwner", owner);

        return skullNbt;
    }

    public static LootPoolEntry.Builder<?> makeZombieVillagerHeadLootTable(String name, String profession, Pair<String, int[]> data) {
        NbtPredicate professionPredicate = makeProfessionPredicate(profession);

        return makeHeadLootTable(name, "minecraft:entity.zombie_villager.ambient", data)
            .conditionally(makeEntityPropertyCondition(professionPredicate));
    }

    public static LootPoolEntry.Builder<?> makeVillagerHeadLootTable(String name, String profession, Pair<String, int[]> data) {
        NbtPredicate professionPredicate = makeProfessionPredicate(profession);

        return makeHeadLootTable(name, "minecraft:entity.villager.ambient", data)
            .conditionally(makeEntityPropertyCondition(professionPredicate));
    }

    public static LootPoolEntry.Builder<?> makeVariantHeadLootTable(String name, Pair<String, int[]> data, String variant) {
        NbtPredicate variantPredicate = makeVariantPredicate(variant);

        return makeHeadLootTable(name, data)
            .conditionally(makeEntityPropertyCondition(variantPredicate));
    }

    public static LootPoolEntry.Builder<?> makeVariantHeadLootTable(String name, String noteBlockSound, Pair<String, int[]> data, String variant) {
        NbtPredicate variantPredicate = makeVariantPredicate(variant);

        return makeHeadLootTable(name, noteBlockSound, data)
            .conditionally(makeEntityPropertyCondition(variantPredicate));
    }

    public static LootPoolEntry.Builder<?> makeVariantHeadLootTable(String name, Pair<String, int[]> data, int variant) {
        NbtPredicate variantPredicate = makeVariantPredicate(variant);

        return makeHeadLootTable(name, data)
            .conditionally(makeEntityPropertyCondition(variantPredicate));
    }

    public static LootPoolEntry.Builder<?> makeVariantHeadLootTable(String name, String noteBlockSound, Pair<String, int[]> data, int variant) {
        NbtPredicate variantPredicate = makeVariantPredicate(variant);

        return makeHeadLootTable(name, noteBlockSound, data)
            .conditionally(makeEntityPropertyCondition(variantPredicate));
    }

    public static LootPoolEntry.Builder<?> makeHeadLootTable(String name, Pair<String, int[]> data) {
        return makeHeadLootTable(name, null, data);
    }

    public static LootPoolEntry.Builder<?> makeHeadLootTable(String name, String noteBlockSound, Pair<String, int[]> data) {
        Item headItem = Items.PLAYER_HEAD;

        NbtCompound skullNbt = makeHeadNbt(data);

        if (noteBlockSound != null) {
            NbtCompound beTag = new NbtCompound();
            beTag.putString("note_block_sound", noteBlockSound);

            skullNbt.put("BlockEntityTag", beTag);
        }

        Text formattedName = MutableText.of(TextContent.EMPTY)
            .append(name)
            .setStyle(Style.EMPTY.withItalic(false));

        LootFunction.Builder nameBuilder = () -> SetNameLootFunction.builder(formattedName).build();

        LootFunction.Builder textureBuilder = () -> SetNbtLootFunction.builder(skullNbt).build();

        return ItemEntry.builder(headItem)
            .apply(nameBuilder)
            .apply(textureBuilder);
    }

    public static LootPool.Builder makeSingleItemLootTable(Item item) {
        return LootPool.builder()
            .with(ItemEntry.builder(item))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder makeWeightedItemLootTable(Item item, int weight) {
        return makeWeightedItemLootTable(item, weight, 1, 1);
    }

    public static LootPool.Builder makeWeightedItemLootTable(Item item, int weight, int min, int max) {
        return LootPool.builder()
            .with(ItemEntry.builder(item))
            .with(ItemEntry.builder(Items.AIR).weight(weight - 1))
            .rolls(UniformLootNumberProvider.create(min, max));
    }
}
