package com.chimericdream.pannotiacompanion.loot;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class PCLootTables {
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
        if (LootTables.VILLAGE_ARMORER_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.VILLAGE_BUTCHER_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
        }

        if (LootTables.VILLAGE_CARTOGRAPHER_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (LootTables.VILLAGE_DESERT_HOUSE_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.VILLAGE_FLETCHER_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.VILLAGE_FISHER_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.VILLAGE_MASON_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(0, 1));
        }

        if (LootTables.VILLAGE_PLAINS_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.VILLAGE_SAVANNA_HOUSE_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.VILLAGE_SHEPARD_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
        }

        if (LootTables.VILLAGE_SNOWY_HOUSE_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.VILLAGE_TAIGA_HOUSE_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.VILLAGE_TANNERY_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.VILLAGE_TEMPLE_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.VILLAGE_TOOLSMITH_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.VILLAGE_WEAPONSMITH_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.ABANDONED_MINESHAFT_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(0, 1));
        }

        if (LootTables.BURIED_TREASURE_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.5f, 0.05f, 1f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (LootTables.DESERT_PYRAMID_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.8f, 0.05f, 2f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (LootTables.END_CITY_TREASURE_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getTopTierLootTable(0.8f, 0.05f, 2f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(2, 4));
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(1, 3));
        }

        if (LootTables.IGLOO_CHEST_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(0, 1));
        }

        if (LootTables.JUNGLE_TEMPLE_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 2));
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable());
        }

        if (LootTables.JUNGLE_TEMPLE_DISPENSER_CHEST.equals(id)) {
        }

        if (LootTables.NETHER_BRIDGE_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (LootTables.PILLAGER_OUTPOST_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 3));
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(0, 1));
        }

        if (LootTables.RUINED_PORTAL_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (LootTables.SIMPLE_DUNGEON_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable(0.5f, 0.05f, 1f));
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.STRONGHOLD_CORRIDOR_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.6f, 0.05f, 2f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 2));
        }

        if (LootTables.STRONGHOLD_CROSSING_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.6f, 0.05f, 2f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 2));
        }

        if (LootTables.STRONGHOLD_LIBRARY_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.6f, 0.05f, 2f));
            poolBuilders.add(BabelBookLootTables.getTopTierLootTable(1f, 0.1f, 3f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 3));
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(1, 2));
        }

        if (LootTables.UNDERWATER_RUIN_SMALL_CHEST.equals(id)) {
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (LootTables.SHIPWRECK_MAP_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
        }

        if (LootTables.SHIPWRECK_SUPPLY_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
        }

        if (LootTables.SHIPWRECK_TREASURE_CHEST.equals(id)) {
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable(1, 3));
        }

        if (LootTables.WOODLAND_MANSION_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.6f, 0.05f, 2f));
            poolBuilders.add(BabelBookLootTables.getTopTierLootTable(2f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 2));
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(0, 1));
        }

        if (LootTables.BASTION_TREASURE_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getTopTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(1, 3));
        }

        if (LootTables.BASTION_OTHER_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (LootTables.BASTION_BRIDGE_CHEST.equals(id)) {
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (LootTables.BASTION_HOGLIN_STABLE_CHEST.equals(id)) {
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (LootTables.ANCIENT_CITY_CHEST.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getTopTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(1, 3));
        }

        if (LootTables.ANCIENT_CITY_ICE_BOX_CHEST.equals(id)) {
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(1, 3));
        }
    }
}
