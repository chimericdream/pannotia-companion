package com.chimericdream.pannotiacompanion.loot;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootingEnchantLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

import static com.chimericdream.pannotiacompanion.loot.LootHelpers.*;
import static com.chimericdream.pannotiacompanion.loot.MobHeadLootTables.*;

public class PCLootTables {
    public static void init() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            // Only modify built-in loot tables and leave data pack loot tables untouched by checking the source.
            if (!source.isBuiltin()) {
                return;
            }

            List<LootPool.Builder> poolBuilders = new ArrayList<>();

            checkVanillaMobs(id, poolBuilders);
            checkVanillaStructures(id, poolBuilders);
            checkVanillaGameplayEvents(id, poolBuilders);

            for (LootPool.Builder builder : poolBuilders) {
                tableBuilder.pool(builder);
            }
        });
    }

    private static void checkVanillaGameplayEvents(Identifier id, List<LootPool.Builder> poolBuilders) {
        if (LootTables.FISHING_TREASURE_GAMEPLAY.equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable(0.03125f, 0f, 1f));
        }

        if (LootTables.PIGLIN_BARTERING_GAMEPLAY.equals(id)) {
            poolBuilders.add(makeWeightedItemLootTable(Items.ANCIENT_DEBRIS, 1024, 1, 2));
        }
    }

    private static void checkVanillaMobs(Identifier id, List<LootPool.Builder> poolBuilders) {
        if (EntityType.ALLAY.getLootTableId().equals(id)) {
            poolBuilders.add(getAllayHeadLootTable());
        }

        if (EntityType.AXOLOTL.getLootTableId().equals(id)) {
            poolBuilders.add(getAxolotlHeadLootTable());
        }

        if (EntityType.BAT.getLootTableId().equals(id)) {
            poolBuilders.add(getBatHeadLootTable());
        }

        if (EntityType.BEE.getLootTableId().equals(id)) {
            poolBuilders.add(getBeeHeadLootTable());
        }

        if (EntityType.BLAZE.getLootTableId().equals(id)) {
            poolBuilders.add(getBlazeHeadLootTable());
        }

        if (EntityType.CAMEL.getLootTableId().equals(id)) {
            poolBuilders.add(getCamelHeadLootTable());
        }

        if (EntityType.CAT.getLootTableId().equals(id)) {
            poolBuilders.add(getCatHeadLootTable());
        }

        if (EntityType.CAVE_SPIDER.getLootTableId().equals(id)) {
            poolBuilders.add(getCaveSpiderHeadLootTable());
        }

        if (EntityType.CHICKEN.getLootTableId().equals(id)) {
            poolBuilders.add(getChickenHeadLootTable());
        }

        if (EntityType.COD.getLootTableId().equals(id)) {
            poolBuilders.add(getCodHeadLootTable());
        }

        if (EntityType.COW.getLootTableId().equals(id)) {
            poolBuilders.add(getCowHeadLootTable());
        }

        if (EntityType.CREEPER.getLootTableId().equals(id)) {
            poolBuilders.add(getChargedCreeperHeadLootTable());
        }

        if (EntityType.DOLPHIN.getLootTableId().equals(id)) {
            poolBuilders.add(getDolphinHeadLootTable());
        }

        if (EntityType.DONKEY.getLootTableId().equals(id)) {
            poolBuilders.add(getDonkeyHeadLootTable());
        }

        if (EntityType.DROWNED.getLootTableId().equals(id)) {
            poolBuilders.add(getDrownedHeadLootTable());
        }

        if (EntityType.ELDER_GUARDIAN.getLootTableId().equals(id)) {
            poolBuilders.add(getElderGuardianHeadLootTable());
        }

        if (EntityType.ENDER_DRAGON.getLootTableId().equals(id)) {
            poolBuilders.add(makeSingleItemLootTable(Items.DRAGON_EGG));
            poolBuilders.add(makeSingleItemLootTable(Items.DRAGON_HEAD));
            poolBuilders.add(makeSingleItemLootTable(Items.ELYTRA));
        }

        if (EntityType.ENDERMAN.getLootTableId().equals(id)) {
            poolBuilders.add(getEndermanHeadLootTable());
        }

        if (EntityType.ENDERMITE.getLootTableId().equals(id)) {
            poolBuilders.add(getEndermiteHeadLootTable());
        }

        if (EntityType.EVOKER.getLootTableId().equals(id)) {
            poolBuilders.add(getEvokerHeadLootTable());
        }

        if (EntityType.FOX.getLootTableId().equals(id)) {
            poolBuilders.add(getFoxHeadLootTable());
        }

        if (EntityType.FROG.getLootTableId().equals(id)) {
            poolBuilders.add(getFrogHeadLootTable());
        }

        if (EntityType.GHAST.getLootTableId().equals(id)) {
            poolBuilders.add(getGhastHeadLootTable());
        }

        if (EntityType.GLOW_SQUID.getLootTableId().equals(id)) {
            poolBuilders.add(getGlowSquidHeadLootTable());
        }

        if (EntityType.GOAT.getLootTableId().equals(id)) {
            poolBuilders.add(getGoatHeadLootTable());
        }

        if (EntityType.GUARDIAN.getLootTableId().equals(id)) {
            poolBuilders.add(getGuardianHeadLootTable());
        }

        if (EntityType.HOGLIN.getLootTableId().equals(id)) {
            poolBuilders.add(getHoglinHeadLootTable());
        }

        if (EntityType.HORSE.getLootTableId().equals(id)) {
            poolBuilders.add(getHorseHeadLootTable());
        }

        if (EntityType.HUSK.getLootTableId().equals(id)) {
            poolBuilders.add(getHuskHeadLootTable());

            poolBuilders.add(
                LootPool.builder()
                    .with(
                        ItemEntry.builder(Items.SAND)
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0, 1)))
                            .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0, 2)))
                    )
                    .conditionally(KILLED_BY_PLAYER)
                    .conditionally(makeLootingCondition(0.2f, 0.02f))
                    .rolls(ConstantLootNumberProvider.create(1))
            );
        }

        if (EntityType.ILLUSIONER.getLootTableId().equals(id)) {
            poolBuilders.add(getIllusionerHeadLootTable());
        }

        if (EntityType.IRON_GOLEM.getLootTableId().equals(id)) {
            poolBuilders.add(getIronGolemHeadLootTable());
        }

        if (EntityType.LLAMA.getLootTableId().equals(id)) {
            poolBuilders.add(getLlamaHeadLootTable());
        }

        if (EntityType.MAGMA_CUBE.getLootTableId().equals(id)) {
            poolBuilders.add(getMagmaCubeHeadLootTable());
        }

        if (EntityType.MOOSHROOM.getLootTableId().equals(id)) {
            poolBuilders.add(getMooshroomHeadLootTable());
        }

        if (EntityType.MULE.getLootTableId().equals(id)) {
            poolBuilders.add(getMuleHeadLootTable());
        }

        if (EntityType.OCELOT.getLootTableId().equals(id)) {
            poolBuilders.add(getOcelotHeadLootTable());
        }

        if (EntityType.PANDA.getLootTableId().equals(id)) {
            poolBuilders.add(getPandaHeadLootTable());
        }

        if (EntityType.PARROT.getLootTableId().equals(id)) {
            poolBuilders.add(getParrotHeadLootTable());
        }

        if (EntityType.PHANTOM.getLootTableId().equals(id)) {
            poolBuilders.add(getPhantomHeadLootTable());
        }

        if (EntityType.PIG.getLootTableId().equals(id)) {
            poolBuilders.add(getPigHeadLootTable());
        }

        if (EntityType.PIGLIN.getLootTableId().equals(id)) {
             poolBuilders.add(getPiglinHeadLootTable());
        }

        if (EntityType.PIGLIN_BRUTE.getLootTableId().equals(id)) {
            poolBuilders.add(getPiglinBruteHeadLootTable());
        }

        if (EntityType.PILLAGER.getLootTableId().equals(id)) {
            poolBuilders.add(getPillagerHeadLootTable());
        }

        if (EntityType.POLAR_BEAR.getLootTableId().equals(id)) {
            poolBuilders.add(getPolarBearHeadLootTable());
        }

        if (EntityType.PUFFERFISH.getLootTableId().equals(id)) {
            poolBuilders.add(getPufferfishHeadLootTable());
        }

        if (EntityType.RABBIT.getLootTableId().equals(id)) {
            poolBuilders.add(getRabbitHeadLootTable());
        }

        if (EntityType.RAVAGER.getLootTableId().equals(id)) {
            poolBuilders.add(getRavagerHeadLootTable());
        }

        if (EntityType.SALMON.getLootTableId().equals(id)) {
            poolBuilders.add(getSalmonHeadLootTable());
        }

        if (EntityType.SHEEP.getLootTableId().equals(id)) {
            poolBuilders.add(getSheepHeadLootTable());
        }

        if (EntityType.SHULKER.getLootTableId().equals(id)) {
            poolBuilders.add(getShulkerHeadLootTable());
            poolBuilders.add(
                LootPool.builder()
                    .with(
                        ItemEntry.builder(Items.SHULKER_SHELL)
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2)))
                            .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0, 2)))
                    )
                    .rolls(ConstantLootNumberProvider.create(1))
            );
        }

        if (EntityType.SILVERFISH.getLootTableId().equals(id)) {
            poolBuilders.add(getSilverfishHeadLootTable());
        }

        if (EntityType.SKELETON.getLootTableId().equals(id)) {
            poolBuilders.add(getSkeletonHeadLootTable());
        }

        if (EntityType.SKELETON_HORSE.getLootTableId().equals(id)) {
            poolBuilders.add(getSkeletonHorseHeadLootTable());
        }

        if (EntityType.SLIME.getLootTableId().equals(id)) {
            poolBuilders.add(getSlimeHeadLootTable());
        }

        if (EntityType.SNIFFER.getLootTableId().equals(id)) {
            poolBuilders.add(getSnifferHeadLootTable());
        }

        if (EntityType.SNOW_GOLEM.getLootTableId().equals(id)) {
            poolBuilders.add(getSnowGolemHeadLootTable());
        }

        if (EntityType.SPIDER.getLootTableId().equals(id)) {
            poolBuilders.add(getSpiderHeadLootTable());
        }

        if (EntityType.SQUID.getLootTableId().equals(id)) {
            poolBuilders.add(getSquidHeadLootTable());
        }

        if (EntityType.STRAY.getLootTableId().equals(id)) {
            poolBuilders.add(getStrayHeadLootTable());
        }

        if (EntityType.STRIDER.getLootTableId().equals(id)) {
            poolBuilders.add(getStriderHeadLootTable());
        }

        if (EntityType.TADPOLE.getLootTableId().equals(id)) {
            poolBuilders.add(getTadpoleHeadLootTable());
        }

        if (EntityType.TRADER_LLAMA.getLootTableId().equals(id)) {
            poolBuilders.add(getTraderLlamaHeadLootTable());
        }

        if (EntityType.TROPICAL_FISH.getLootTableId().equals(id)) {
            poolBuilders.add(getTropicalFishHeadLootTable());
        }

        if (EntityType.TURTLE.getLootTableId().equals(id)) {
            poolBuilders.add(getTurtleHeadLootTable());
        }

        if (EntityType.VEX.getLootTableId().equals(id)) {
            poolBuilders.add(getVexHeadLootTable());
        }

        if (EntityType.VILLAGER.getLootTableId().equals(id)) {
            poolBuilders.add(getVillagerHeadLootTable());
        }

        if (EntityType.VINDICATOR.getLootTableId().equals(id)) {
            poolBuilders.add(getVindicatorHeadLootTable());
        }

        if (EntityType.WANDERING_TRADER.getLootTableId().equals(id)) {
            poolBuilders.add(getWanderingTraderHeadLootTable());
        }

        if (EntityType.WARDEN.getLootTableId().equals(id)) {
            poolBuilders.add(getWardenHeadLootTable());
        }

        if (EntityType.WITCH.getLootTableId().equals(id)) {
            poolBuilders.add(getWitchHeadLootTable());
        }

        if (EntityType.WITHER.getLootTableId().equals(id)) {
            poolBuilders.add(getWitherHeadLootTable());
            poolBuilders.add(getWitherProjectileHeadLootTable());
        }

        if (EntityType.WOLF.getLootTableId().equals(id)) {
            poolBuilders.add(getWolfHeadLootTable());
        }

        if (EntityType.ZOGLIN.getLootTableId().equals(id)) {
            poolBuilders.add(getZoglinHeadLootTable());
        }

        if (EntityType.ZOMBIE.getLootTableId().equals(id)) {
            poolBuilders.add(BabelBookLootTables.getRandomBookLootTable(0.025f, 0.01f, 1f));
            poolBuilders.add(getZombieHeadLootTable());
        }

        if (EntityType.ZOMBIE_HORSE.getLootTableId().equals(id)) {
            poolBuilders.add(getZombieHorseHeadLootTable());
        }

        if (EntityType.ZOMBIE_VILLAGER.getLootTableId().equals(id)) {
            poolBuilders.add(getZombieVillagerHeadLootTable());
        }

        if (EntityType.ZOMBIFIED_PIGLIN.getLootTableId().equals(id)) {
            poolBuilders.add(getZombifiedPiglinHeadLootTable());
        }
    }

    private static void checkVanillaStructures(Identifier id, List<LootPool.Builder> poolBuilders) {
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
