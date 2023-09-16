package com.chimericdream.pannotiacompanion.loot;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

import static com.chimericdream.pannotiacompanion.loot.TreasureGemLootTables.getRandomGemLootTable;

public class PCLootTables {
    private static final Identifier BASTION_TREASURE_ID = new Identifier("minecraft", "chests/bastion_treasure");

    public static void init() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            // Only modify built-in loot tables and leave data pack loot tables untouched by checking the source.
            if (!source.isBuiltin()) {
                return;
            }

            List<LootPool.Builder> poolBuilders = new ArrayList<>();

            checkVanillaLootTables(id, poolBuilders);

            for (LootPool.Builder builder : poolBuilders) {
                tableBuilder.pool(builder);
            }
        });
    }

    private static void checkVanillaLootTables(Identifier id, List<LootPool.Builder> poolBuilders) {
        if (BASTION_TREASURE_ID.equals(id)) {
            poolBuilders.add(getRandomGemLootTable());
            poolBuilders.add(BabelBookLootTables.getLootTable());
        }
    }
}
