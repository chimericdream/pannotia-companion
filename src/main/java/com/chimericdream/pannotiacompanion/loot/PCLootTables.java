package com.chimericdream.pannotiacompanion.loot;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class PCLootTables {
    private static final Identifier VILLAGE_ARMORER_ID = new Identifier("minecraft", "chests/village/village_armorer");
    private static final Identifier VILLAGE_BUTCHER_ID = new Identifier("minecraft", "chests/village/village_butcher");
    private static final Identifier VILLAGE_DESERT_HOUSE_ID = new Identifier("minecraft", "chests/village/village_desert_house");
    private static final Identifier VILLAGE_PLAINS_HOUSE_ID = new Identifier("minecraft", "chests/village/village_plains_house");
    private static final Identifier VILLAGE_SAVANNA_HOUSE_ID = new Identifier("minecraft", "chests/village/village_savanna_house");
    private static final Identifier VILLAGE_SHEPHERD_ID = new Identifier("minecraft", "chests/village/village_shepherd");
    private static final Identifier VILLAGE_SNOWY_HOUSE_ID = new Identifier("minecraft", "chests/village/village_snowy_house");
    private static final Identifier VILLAGE_TAIGA_HOUSE_ID = new Identifier("minecraft", "chests/village/village_taiga_house");
    private static final Identifier VILLAGE_TOOLSMITH_ID = new Identifier("minecraft", "chests/village/village_toolsmith");
    private static final Identifier VILLAGE_WEAPONSMITH_ID = new Identifier("minecraft", "chests/village/village_weaponsmith");
    private static final Identifier ABANDONED_MINESHAFT_ID = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier BASTION_TREASURE_ID = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier BURIED_TREASURE_ID = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier DESERT_PYRAMID_ID = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier END_CITY_TREASURE_ID = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier IGLOO_CHEST_ID = new Identifier("minecraft", "chests/igloo_chest");
    private static final Identifier JUNGLE_TEMPLE_ID = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier NETHER_BRIDGE_ID = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier PILLAGER_OUTPOST_ID = new Identifier("minecraft", "chests/pillager_outpost");
    private static final Identifier RUINED_PORTAL_ID = new Identifier("minecraft", "chests/ruined_portal");
    private static final Identifier SIMPLE_DUNGEON_ID = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier STRONGHOLD_CORRIDOR_ID = new Identifier("minecraft", "chests/stronghold_corridor");
    private static final Identifier STRONGHOLD_CROSSING_ID = new Identifier("minecraft", "chests/stronghold_crossing");
    private static final Identifier STRONGHOLD_LIBRARY_ID = new Identifier("minecraft", "chests/stronghold_library");
    private static final Identifier UNDERWATER_RUIN_BIG_ID = new Identifier("minecraft", "chests/underwater_ruin_big");
    private static final Identifier WOODLAND_MANSION_ID = new Identifier("minecraft", "chests/woodland_mansion");

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
        if (VILLAGE_ARMORER_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (VILLAGE_BUTCHER_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
        }

        if (VILLAGE_DESERT_HOUSE_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (VILLAGE_PLAINS_HOUSE_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (VILLAGE_SAVANNA_HOUSE_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (VILLAGE_SHEPHERD_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
        }

        if (VILLAGE_SNOWY_HOUSE_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (VILLAGE_TAIGA_HOUSE_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (VILLAGE_TOOLSMITH_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (VILLAGE_WEAPONSMITH_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (ABANDONED_MINESHAFT_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(0, 1));
        }

        if (BASTION_TREASURE_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 3));
        }

        if (BURIED_TREASURE_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.5f, 0.05f, 1f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (DESERT_PYRAMID_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.8f, 0.05f, 2f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (END_CITY_TREASURE_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getTopTierLootTable(0.8f, 0.05f, 2f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(2, 4));
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(1, 3));
        }

        if (IGLOO_CHEST_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(0, 1));
        }

        if (JUNGLE_TEMPLE_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 2));
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable());
        }

        if (NETHER_BRIDGE_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (PILLAGER_OUTPOST_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 3));
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(0, 1));
        }

        if (RUINED_PORTAL_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (SIMPLE_DUNGEON_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable(0.5f, 0.05f, 1f));
            poolBuilders.add(TreasureGemLootTables.getCommonGemLootTable());
        }

        if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.6f, 0.05f, 2f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 2));
        }

        if (STRONGHOLD_CROSSING_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.6f, 0.05f, 2f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 2));
        }

        if (STRONGHOLD_LIBRARY_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.6f, 0.05f, 2f));
            poolBuilders.add(BabelBookLootTables.getTopTierLootTable(1f, 0.1f, 3f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 3));
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(1, 2));
        }

        if (UNDERWATER_RUIN_BIG_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable());
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable());
        }

        if (WOODLAND_MANSION_ID.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getMediumTierLootTable(0.6f, 0.05f, 2f));
            poolBuilders.add(BabelBookLootTables.getTopTierLootTable(2f));
            poolBuilders.add(TreasureGemLootTables.getSemiRareGemLootTable(1, 2));
            poolBuilders.add(TreasureGemLootTables.getRareGemLootTable(0, 1));
        }
    }
}
