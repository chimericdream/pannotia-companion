package com.chimericdream.pannotiacompanion.loot;

import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.*;
import net.minecraft.loot.entry.AlternativeEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.predicate.NbtPredicate;
import net.minecraft.util.Pair;

import static com.chimericdream.pannotiacompanion.data.MobHeadTextures.*;
import static com.chimericdream.pannotiacompanion.loot.LootHelpers.*;

public class MobHeadLootTables {
    public static LootPool.Builder getAllayHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Allay", "minecraft:entity.allay.ambient_without_item", ALLAY))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.2f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getAxolotlHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getLucyAxolotlHeadLootTable(),
                getWildAxolotlHeadLootTable(),
                getGoldAxolotlHeadLootTable(),
                getCyanAxolotlHeadLootTable(),
                getBlueAxolotlHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getBatHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Bat", "minecraft:entity.bat.ambient", BAT))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.1f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getBeeHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getStandardBeeHeadLootTable(),
                getPollinatedBeeHeadLootTable(),
                getAngryBeeHeadLootTable(),
                getAngryPollinatedBeeHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.5f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getBlazeHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Blaze", "minecraft:entity.blaze.ambient", BLAZE))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.005f, 0.0005f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getCamelHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Camel", "minecraft:entity.camel.ambient", CAMEL))
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getCatHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getTabbyCatHeadLootTable(),
                getTuxedoCatHeadLootTable(),
                getGingerCatHeadLootTable(),
                getSiameseCatHeadLootTable(),
                getBritishShorthairCatHeadLootTable(),
                getCalicoCatHeadLootTable(),
                getPersianCatHeadLootTable(),
                getRagdollCatHeadLootTable(),
                getWhiteCatHeadLootTable(),
                getJellieCatHeadLootTable(),
                getBlackCatHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.5f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getCaveSpiderHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Cave Spider", "minecraft:entity.spider.step", CAVE_SPIDER))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.005f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getChickenHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Chicken", "minecraft:entity.chicken.ambient", CHICKEN))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.01f, 0.001f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getCodHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Cod", "minecraft:entity.cod.flop", COD))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.1f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getCowHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Cow", "minecraft:entity.cow.ambient", COW))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.01f, 0.001f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getChargedCreeperHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        NbtCompound powered = new NbtCompound();
        powered.putBoolean("powered", true);

        NbtPredicate poweredPredicate = new NbtPredicate(powered);

        return builder
            .with(makeHeadLootTable("Creeper", "minecraft:entity.generic.explode", CHARGED_CREEPER).conditionally(makeEntityPropertyCondition(poweredPredicate)))
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getDolphinHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Dolphin", "minecraft:entity.dolphin.ambient_water", DOLPHIN))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.33f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getDonkeyHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Donkey", "minecraft:entity.donkey.ambient", DONKEY))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.2f, 0.09f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getDrownedHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Drowned", "minecraft:entity.drowned.ambient", DROWNED))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.05f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getElderGuardianHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Elder Guardian", "minecraft:entity.elder_guardian.ambient", ELDER_GUARDIAN))
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getEndermanHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Enderman", "minecraft:entity.enderman.scream", ENDERMAN))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.005f, 0.0001f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getEndermiteHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Endermite", "minecraft:entity.endermite.ambient", ENDERMITE))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.1f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getEvokerHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Evoker", "minecraft:entity.evoker.prepare_attack", EVOKER))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.25f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getFoxHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getStandardFoxHeadLootTable(),
                getSnowFoxHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getFrogHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getColdFrogHeadLootTable(),
                getTemperateFrogHeadLootTable(),
                getWarmFrogHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.2f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getGhastHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Ghast", "minecraft:entity.ghast.warn", GHAST))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.0625f, 0.0125f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getGlowSquidHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Glow Squid", "minecraft:entity.glow_squid.ambient", GLOW_SQUID))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.05f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getGoatHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getStandardGoatHeadLootTable(),
                getScreamingGoatHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getGuardianHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Guardian", "minecraft:entity.elder_guardian.flop", GUARDIAN))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.005f, 0.001f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getHoglinHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Hoglin", "minecraft:entity.hoglin.angry", HOGLIN))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.03f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getHorseHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getWhiteHorseHeadLootTable(),
                getCreamyHorseHeadLootTable(),
                getChestnutHorseHeadLootTable(),
                getBrownHorseHeadLootTable(),
                getBlackHorseHeadLootTable(),
                getGrayHorseHeadLootTable(),
                getDarkBrownHorseHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.27f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getHuskHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        Pair<String, int[]> YUNGS_PHAROAH = new Pair<>("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTM1MGMwNDk5YTY4YmNkOWM3NWIyNWMxOTIzMTQzOWIxMDhkMDI3NTlmNDM1ZTMzZTRhZWU5ZWQxZGQyNDFhMiJ9fX0=", new int[]{});

        NbtCompound pharoah = makeHeadNbt(YUNGS_PHAROAH);
        NbtPredicate predicate = new NbtPredicate(pharoah);

        return builder
            .with(makeHeadLootTable("Husk", "minecraft:entity.husk.ambient", HUSK))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(InvertedLootCondition.builder(makeEntityPropertyCondition(predicate)).build())
            .conditionally(makeLootingCondition(0.06f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getIllusionerHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Illusioner", "minecraft:entity.illusioner.cast_spell", ILLUSIONER))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.25f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getIronGolemHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Iron Golem", "minecraft:entity.iron_golem.hurt", IRON_GOLEM))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.05f, 0.015f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getLlamaHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getCreamyLlamaHeadLootTable(),
                getWhiteLlamaHeadLootTable(),
                getBrownLlamaHeadLootTable(),
                getGrayLlamaHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.24f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getMagmaCubeHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Magma Cube", "minecraft:entity.magma_cube.squish", MAGMA_CUBE))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.005f, 0.001f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getMooshroomHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getRedMooshroomHeadLootTable(),
                getBrownMooshroomHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getMuleHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Mule", "minecraft:entity.mule.ambient", MULE))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.2f, 0.05f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getOcelotHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Ocelot", "minecraft:entity.ocelot.ambient", OCELOT))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.2f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getPandaHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getAggressivePandaHeadLootTable(),
                getLazyPandaHeadLootTable(),
                getPlayfulPandaHeadLootTable(),
                getWorriedPandaHeadLootTable(),
                getBrownPandaHeadLootTable(),
                getWeakPandaHeadLootTable(),
                getStandardPandaHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.27f, 0.004f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getParrotHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getRedParrotHeadLootTable(),
                getBlueParrotHeadLootTable(),
                getGreenParrotHeadLootTable(),
                getLightBlueParrotHeadLootTable(),
                getGrayParrotHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.25f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getPhantomHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Phantom", "minecraft:entity.phantom.ambient", PHANTOM))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.1f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getPigHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Pig", "minecraft:entity.pig.ambient", PIG))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.01f, 0.001f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getPiglinHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(ItemEntry.builder(Items.PIGLIN_HEAD))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.04f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getPiglinBruteHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Piglin Brute", "minecraft:entity.piglin_brute.ambient", PIGLIN_BRUTE))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.1f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getPillagerHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Pillager", "minecraft:entity.pillager.ambient", PILLAGER))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.025f, 0.005f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getPolarBearHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Polar Bear", "minecraft:entity.polar_bear.ambient", POLAR_BEAR))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.2f, 0.05f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getPufferfishHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Pufferfish", "minecraft:entity.puffer_fish.blow_up", PUFFERFISH))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.15f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getRabbitHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getToastRabbitHeadLootTable(),
                getBrownRabbitHeadLootTable(),
                getWhiteRabbitHeadLootTable(),
                getBlackRabbitHeadLootTable(),
                getBlackAndWhiteRabbitHeadLootTable(),
                getGoldRabbitHeadLootTable(),
                getSaltAndPepperRabbitHeadLootTable(),
                getKillerBunnyRabbitHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getRavagerHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Ravager", "minecraft:entity.ravager.roar", RAVAGER))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.25f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getSalmonHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Salmon", "minecraft:entity.salmon.flop", SALMON))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.1f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getSheepHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getJebSheepHeadLootTable(),
                getBlackSheepHeadLootTable(),
                getBlueSheepHeadLootTable(),
                getBrownSheepHeadLootTable(),
                getCyanSheepHeadLootTable(),
                getGraySheepHeadLootTable(),
                getGreenSheepHeadLootTable(),
                getLightBlueSheepHeadLootTable(),
                getLightGraySheepHeadLootTable(),
                getLimeSheepHeadLootTable(),
                getMagentaSheepHeadLootTable(),
                getOrangeSheepHeadLootTable(),
                getPinkSheepHeadLootTable(),
                getPurpleSheepHeadLootTable(),
                getRedSheepHeadLootTable(),
                getWhiteSheepHeadLootTable(),
                getYellowSheepHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getShulkerHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Shulker", "minecraft:entity.shulker.ambient", SHULKER))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.05f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getSilverfishHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Silverfish", "minecraft:entity.silverfish.ambient", SILVERFISH))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.05f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getSkeletonHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(ItemEntry.builder(Items.SKELETON_SKULL))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.025f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getSkeletonHorseHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Skeleton Horse", "minecraft:entity.skeleton_horse.ambient", SKELETON_HORSE))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.2f, 0.05f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getSlimeHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Slime", "minecraft:entity.slime.squish_small", SLIME))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.005f, 0.001f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getSnifferHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Sniffer", "minecraft:entity.sniffer.scenting", SNIFFER))
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getSnowGolemHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Snow Golem", "minecraft:entity.snow_golem.hurt", SNOW_GOLEM))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.05f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getSpiderHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Spider", "minecraft:entity.spider.ambient", SPIDER))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.005f, 0.001f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getSquidHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Squid", "minecraft:entity.squid.ambient", SQUID))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.05f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getStrayHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Stray", "minecraft:entity.stray.ambient", STRAY))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.06f, 0.05f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getStriderHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                makeHeadLootTable("Strider", "minecraft:entity.strider.happy", STRIDER),
                makeHeadLootTable("Cold Strider", "minecraft:entity.strider.ambient", COLD_STRIDER)
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.1f, 0.05f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getTadpoleHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Tadpole", "minecraft:entity.tadpole.flop", TADPOLE))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.1f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getTraderLlamaHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getCreamyTraderLlamaHeadLootTable(),
                getWhiteTraderLlamaHeadLootTable(),
                getBrownTraderLlamaHeadLootTable(),
                getGrayTraderLlamaHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.24f, 0.07f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getTropicalFishHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getClownfishHeadLootTable(),
                getTomatoClownfishHeadLootTable(),
                getTriggerfishHeadLootTable(),
                getRedSnapperHeadLootTable(),
                getRedCichlidHeadLootTable(),
                getOrnateButterflyfishHeadLootTable(),
                getQueenAngelfishHeadLootTable(),
                getCottonCandyBettaHeadLootTable(),
                getThreadfinHeadLootTable(),
                getGoatfishHeadLootTable(),
                getYellowTangHeadLootTable(),
                getYellowtailParrotfishHeadLootTable(),
                getDottybackHeadLootTable(),
                getParrotfishHeadLootTable(),
                getMoorishIdolHeadLootTable(),
                getButterflyfishHeadLootTable(),
                getAnemoneHeadLootTable(),
                getBlackTangHeadLootTable(),
                getCichlidHeadLootTable(),
                getBlueTangHeadLootTable(),
                getEmperorRedSnapperHeadLootTable(),
                getRedLippedBlennyHeadLootTable(),
                getStandardTropicalFishHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.15f, 0.025f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getTurtleHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Turtle", "minecraft:entity.turtle.ambient_land", TURTLE))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.1f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getVexHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                makeHeadLootTable("Vex", "minecraft:entity.vex.ambient", VEX),
                makeHeadLootTable("Angry Vex", "minecraft:entity.vex.charge", ANGRY_VEX)
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.1f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getVillagerHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getArmorerHeadLootTable(),
                getButcherHeadLootTable(),
                getCartographerHeadLootTable(),
                getClericHeadLootTable(),
                getFarmerHeadLootTable(),
                getFishermanHeadLootTable(),
                getFletcherHeadLootTable(),
                getLeatherworkerHeadLootTable(),
                getLibrarianHeadLootTable(),
                getMasonHeadLootTable(),
                getNitwitHeadLootTable(),
                getUnemployedVillagerHeadLootTable(),
                getShepherdHeadLootTable(),
                getToolsmithHeadLootTable(),
                getWeaponsmithHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getVindicatorHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Vindicator", "minecraft:entity.vindicator.ambient", VINDICATOR))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.05f, 0.015f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getWanderingTraderHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Wandering Trader", "minecraft:entity.wandering_trader.ambient", WANDERING_TRADER))
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getWardenHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Warden", "minecraft:entity.warden.ambient", WARDEN))
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getWitchHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Witch", "minecraft:entity.witch.ambient", WITCH))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.005f, 0.001f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getWitherHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Wither", "minecraft:entity.wither.ambient", WITHER))
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getWitherProjectileHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                makeHeadLootTable("Wither Projectile", "minecraft:entity.wither.shoot", WITHER_PROJECTILE),
                makeHeadLootTable("Blue Wither Projectile", "minecraft:entity.wither.shoot", BLUE_WITHER_PROJECTILE)
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeChanceCondition(0.5f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getWolfHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getAngryWolfHeadLootTable(),
                getStandardWolfHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.2f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getZoglinHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Zoglin", "minecraft:entity.zoglin.ambient", ZOGLIN))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.2f, 0.05f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getZombieHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(ItemEntry.builder(Items.ZOMBIE_HEAD))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.025f, 0.01f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getZombieHorseHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Zombie Horse", "minecraft:entity.zombie_horse.ambient", ZOMBIE_HORSE))
            .conditionally(KILLED_BY_PLAYER)
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getZombieVillagerHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(AlternativeEntry.builder(
                getZombieArmorerHeadLootTable(),
                getZombieButcherHeadLootTable(),
                getZombieCartographerHeadLootTable(),
                getZombieClericHeadLootTable(),
                getZombieFarmerHeadLootTable(),
                getZombieFishermanHeadLootTable(),
                getZombieFletcherHeadLootTable(),
                getZombieLeatherworkerHeadLootTable(),
                getZombieLibrarianHeadLootTable(),
                getZombieMasonHeadLootTable(),
                getZombieNitwitHeadLootTable(),
                getUnemployedZombieVillagerHeadLootTable(),
                getZombieShepherdHeadLootTable(),
                getZombieToolsmithHeadLootTable(),
                getZombieWeaponsmithHeadLootTable()
            ).build())
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.5f, 0.02f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    public static LootPool.Builder getZombifiedPiglinHeadLootTable() {
        LootPool.Builder builder = LootPool.builder();

        return builder
            .with(makeHeadLootTable("Zombified Piglin", "minecraft:entity.zombified_piglin.ambient", ZOMBIFIED_PIGLIN))
            .conditionally(KILLED_BY_PLAYER)
            .conditionally(makeLootingCondition(0.005f, 0.001f))
            .rolls(ConstantLootNumberProvider.create(1));
    }

    // Inner loot tables

    private static LootPoolEntry.Builder<?> getLucyAxolotlHeadLootTable() {
        return makeVariantHeadLootTable("Lucy Axolotl", "minecraft:entity.axolotl.idle_air", LUCY_AXOLOTL, 0)
            .conditionally(makeLootingCondition(0.2f, 0.01f));
    }
    private static LootPoolEntry.Builder<?> getWildAxolotlHeadLootTable() {
        return makeVariantHeadLootTable("Wild Axolotl", "minecraft:entity.axolotl.idle_air", WILD_AXOLOTL, 1)
            .conditionally(makeLootingCondition(0.2f, 0.01f));
    }
    private static LootPoolEntry.Builder<?> getGoldAxolotlHeadLootTable() {
        return makeVariantHeadLootTable("Gold Axolotl", "minecraft:entity.axolotl.idle_air", GOLD_AXOLOTL, 2)
            .conditionally(makeLootingCondition(0.2f, 0.01f));
    }
    private static LootPoolEntry.Builder<?> getCyanAxolotlHeadLootTable() {
        return makeVariantHeadLootTable("Cyan Axolotl", "minecraft:entity.axolotl.idle_air", CYAN_AXOLOTL, 3)
            .conditionally(makeLootingCondition(0.2f, 0.01f));
    }
    private static LootPoolEntry.Builder<?> getBlueAxolotlHeadLootTable() {
        return makeVariantHeadLootTable("Blue Axolotl", "minecraft:entity.axolotl.idle_air", BLUE_AXOLOTL, 4);
    }

    private static LootPoolEntry.Builder<?> getStandardBeeHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("AngerTime", 0);
        nbt.putBoolean("HasNectar", false);

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Bee", "minecraft:entity.bee.loop", BEE)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getPollinatedBeeHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("AngerTime", 0);
        nbt.putBoolean("HasNectar", true);

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Pollinated Bee", "minecraft:entity.bee.pollinate", POLLINATED_BEE)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getAngryBeeHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putBoolean("HasNectar", false);

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Angry Bee", "minecraft:entity.bee.loop_aggressive", ANGRY_BEE)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getAngryPollinatedBeeHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putBoolean("HasNectar", true);

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Angry Pollinated Bee", "minecraft:entity.bee.loop_aggressive", ANGRY_POLLINATED_BEE)
            .conditionally(makeEntityPropertyCondition(predicate));
    }

    private static LootPoolEntry.Builder<?> getTabbyCatHeadLootTable() {
        return makeVariantHeadLootTable("Tabby Cat", "minecraft:entity.cat.ambient", TABBY_CAT, "minecraft:tabby");
    }
    private static LootPoolEntry.Builder<?> getTuxedoCatHeadLootTable() {
        return makeVariantHeadLootTable("Tuxedo Cat", "minecraft:entity.cat.ambient", TUXEDO_CAT, "minecraft:black");
    }
    private static LootPoolEntry.Builder<?> getGingerCatHeadLootTable() {
        return makeVariantHeadLootTable("Ginger Cat", "minecraft:entity.cat.ambient", GINGER_CAT, "minecraft:red");
    }
    private static LootPoolEntry.Builder<?> getSiameseCatHeadLootTable() {
        return makeVariantHeadLootTable("Siamese Cat", "minecraft:entity.cat.ambient", SIAMESE_CAT, "minecraft:siamese");
    }
    private static LootPoolEntry.Builder<?> getBritishShorthairCatHeadLootTable() {
        return makeVariantHeadLootTable("British Shorthair Cat", "minecraft:entity.cat.ambient", BRITISH_SHORTHAIR_CAT, "minecraft:british_shorthair");
    }
    private static LootPoolEntry.Builder<?> getCalicoCatHeadLootTable() {
        return makeVariantHeadLootTable("Calico Cat", "minecraft:entity.cat.ambient", CALICO_CAT, "minecraft:calico");
    }
    private static LootPoolEntry.Builder<?> getPersianCatHeadLootTable() {
        return makeVariantHeadLootTable("Persian Cat", "minecraft:entity.cat.ambient", PERSIAN_CAT, "minecraft:persian");
    }
    private static LootPoolEntry.Builder<?> getRagdollCatHeadLootTable() {
        return makeVariantHeadLootTable("Ragdoll Cat", "minecraft:entity.cat.ambient", RAGDOLL_CAT, "minecraft:ragdoll");
    }
    private static LootPoolEntry.Builder<?> getWhiteCatHeadLootTable() {
        return makeVariantHeadLootTable("White Cat", "minecraft:entity.cat.ambient", WHITE_CAT, "minecraft:white");
    }
    private static LootPoolEntry.Builder<?> getJellieCatHeadLootTable() {
        return makeVariantHeadLootTable("Jellie Cat", "minecraft:entity.cat.ambient", JELLIE_CAT, "minecraft:jellie");
    }
    private static LootPoolEntry.Builder<?> getBlackCatHeadLootTable() {
        return makeVariantHeadLootTable("Black Cat", "minecraft:entity.cat.black", BLACK_CAT, "minecraft:all_black");
    }

    private static LootPoolEntry.Builder<?> getStandardFoxHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("Type", "red");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Fox", "minecraft:entity.fox.ambient", FOX)
            .conditionally(makeEntityPropertyCondition(predicate))
            .conditionally(makeLootingCondition(0.1f, 0.004f));
    }
    private static LootPoolEntry.Builder<?> getSnowFoxHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("Type", "snow");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Snow Fox", "minecraft:entity.fox.ambient", SNOW_FOX)
            .conditionally(makeEntityPropertyCondition(predicate))
            .conditionally(makeLootingCondition(0.2f, 0.004f));
    }

    private static LootPoolEntry.Builder<?> getColdFrogHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("variant", "cold");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Cold Frog", "minecraft:entity.frog.ambient", COLD_FROG)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getTemperateFrogHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("variant", "temperate");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Temperate Frog", "minecraft:entity.frog.ambient", TEMPERATE_FROG)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getWarmFrogHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("variant", "warm");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Warm Frog", "minecraft:entity.frog.ambient", WARM_FROG)
            .conditionally(makeEntityPropertyCondition(predicate));
    }

    private static LootPoolEntry.Builder<?> getStandardGoatHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putBoolean("IsScreamingGoat", false);

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Goat", "minecraft:entity.goat.ambient", GOAT)
            .conditionally(makeEntityPropertyCondition(predicate))
            .conditionally(makeLootingCondition(0.01f, 0.001f));
    }
    private static LootPoolEntry.Builder<?> getScreamingGoatHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putBoolean("IsScreamingGoat", true);

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Screaming Goat", "minecraft:entity.goat.screaming.prepare_ram", SCREAMING_GOAT)
            .conditionally(makeEntityPropertyCondition(predicate));
    }

    private static LootPoolEntry.Builder<?> getWhiteHorseHeadLootTable() {
        return makeHeadLootTable("White Horse", "minecraft:entity.horse.ambient", WHITE_HORSE)
            .conditionally(AnyOfLootCondition.builder(
                makeEntityPropertyCondition(makeVariantPredicate(0)),
                makeEntityPropertyCondition(makeVariantPredicate(256)),
                makeEntityPropertyCondition(makeVariantPredicate(512)),
                makeEntityPropertyCondition(makeVariantPredicate(768)),
                makeEntityPropertyCondition(makeVariantPredicate(1024))
            ));
    }
    private static LootPoolEntry.Builder<?> getCreamyHorseHeadLootTable() {
        return makeHeadLootTable("Creamy Horse", "minecraft:entity.horse.ambient", CREAMY_HORSE)
            .conditionally(AnyOfLootCondition.builder(
                makeEntityPropertyCondition(makeVariantPredicate(1)),
                makeEntityPropertyCondition(makeVariantPredicate(257)),
                makeEntityPropertyCondition(makeVariantPredicate(513)),
                makeEntityPropertyCondition(makeVariantPredicate(769)),
                makeEntityPropertyCondition(makeVariantPredicate(1025))
            ));
    }
    private static LootPoolEntry.Builder<?> getChestnutHorseHeadLootTable() {
        return makeHeadLootTable("Chestnut Horse", "minecraft:entity.horse.ambient", CHESTNUT_HORSE)
            .conditionally(AnyOfLootCondition.builder(
                makeEntityPropertyCondition(makeVariantPredicate(2)),
                makeEntityPropertyCondition(makeVariantPredicate(258)),
                makeEntityPropertyCondition(makeVariantPredicate(514)),
                makeEntityPropertyCondition(makeVariantPredicate(770)),
                makeEntityPropertyCondition(makeVariantPredicate(1026))
            ));
    }
    private static LootPoolEntry.Builder<?> getBrownHorseHeadLootTable() {
        return makeHeadLootTable("Brown Horse", "minecraft:entity.horse.ambient", BROWN_HORSE)
            .conditionally(AnyOfLootCondition.builder(
                makeEntityPropertyCondition(makeVariantPredicate(3)),
                makeEntityPropertyCondition(makeVariantPredicate(259)),
                makeEntityPropertyCondition(makeVariantPredicate(515)),
                makeEntityPropertyCondition(makeVariantPredicate(771)),
                makeEntityPropertyCondition(makeVariantPredicate(1027))
            ));
    }
    private static LootPoolEntry.Builder<?> getBlackHorseHeadLootTable() {
        return makeHeadLootTable("Black Horse", "minecraft:entity.horse.ambient", BLACK_HORSE)
            .conditionally(AnyOfLootCondition.builder(
                makeEntityPropertyCondition(makeVariantPredicate(4)),
                makeEntityPropertyCondition(makeVariantPredicate(260)),
                makeEntityPropertyCondition(makeVariantPredicate(516)),
                makeEntityPropertyCondition(makeVariantPredicate(772)),
                makeEntityPropertyCondition(makeVariantPredicate(1028))
            ));
    }
    private static LootPoolEntry.Builder<?> getGrayHorseHeadLootTable() {
        return makeHeadLootTable("Gray Horse", "minecraft:entity.horse.ambient", GRAY_HORSE)
            .conditionally(AnyOfLootCondition.builder(
                makeEntityPropertyCondition(makeVariantPredicate(5)),
                makeEntityPropertyCondition(makeVariantPredicate(261)),
                makeEntityPropertyCondition(makeVariantPredicate(517)),
                makeEntityPropertyCondition(makeVariantPredicate(773)),
                makeEntityPropertyCondition(makeVariantPredicate(1029))
            ));
    }
    private static LootPoolEntry.Builder<?> getDarkBrownHorseHeadLootTable() {
        return makeHeadLootTable("Dark Brown Horse", "minecraft:entity.horse.ambient", DARK_BROWN_HORSE)
            .conditionally(AnyOfLootCondition.builder(
                makeEntityPropertyCondition(makeVariantPredicate(6)),
                makeEntityPropertyCondition(makeVariantPredicate(262)),
                makeEntityPropertyCondition(makeVariantPredicate(518)),
                makeEntityPropertyCondition(makeVariantPredicate(774)),
                makeEntityPropertyCondition(makeVariantPredicate(1030))
            ));
    }

    private static LootPoolEntry.Builder<?> getCreamyLlamaHeadLootTable() {
        return makeVariantHeadLootTable("Creamy Llama", "minecraft:entity.llama.ambient", CREAMY_LLAMA, 0);
    }
    private static LootPoolEntry.Builder<?> getWhiteLlamaHeadLootTable() {
        return makeVariantHeadLootTable("White Llama", "minecraft:entity.llama.ambient", WHITE_LLAMA, 1);
    }
    private static LootPoolEntry.Builder<?> getBrownLlamaHeadLootTable() {
        return makeVariantHeadLootTable("Brown Llama", "minecraft:entity.llama.ambient", BROWN_LLAMA, 2);
    }
    private static LootPoolEntry.Builder<?> getGrayLlamaHeadLootTable() {
        return makeVariantHeadLootTable("Gray Llama", "minecraft:entity.llama.ambient", GRAY_LLAMA, 3);
    }

    private static LootPoolEntry.Builder<?> getRedMooshroomHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("Type", "red");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Red Mooshroom", "minecraft:entity.cow.ambient", RED_MOOSHROOM)
            .conditionally(makeEntityPropertyCondition(predicate))
            .conditionally(makeLootingCondition(0.01f, 0.001f));
    }
    private static LootPoolEntry.Builder<?> getBrownMooshroomHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("Type", "brown");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Brown Mooshroom", "minecraft:entity.cow.ambient", BROWN_MOOSHROOM)
            .conditionally(makeEntityPropertyCondition(predicate))
            .conditionally(makeLootingCondition(0.1f, 0.001f));
    }

    private static LootPoolEntry.Builder<?> getAggressivePandaHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("MainGene", "aggressive");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Aggressive Panda", "minecraft:entity.panda.aggressive_ambient", AGGRESSIVE_PANDA)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getLazyPandaHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("MainGene", "lazy");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Lazy Panda", "minecraft:entity.panda.ambient", LAZY_PANDA)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getPlayfulPandaHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("MainGene", "playful");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Playful Panda", "minecraft:entity.panda.ambient", PLAYFUL_PANDA)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getWorriedPandaHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("MainGene", "worried");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Worried Panda", "minecraft:entity.panda.worried_ambient", WORRIED_PANDA)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getBrownPandaHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("MainGene", "brown");
        nbt.putString("HiddenGene", "brown");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Brown Panda", "minecraft:entity.panda.ambient", BROWN_PANDA)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getWeakPandaHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("MainGene", "weak");
        nbt.putString("HiddenGene", "weak");

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Weak Panda", "minecraft:entity.panda.sneeze", WEAK_PANDA)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getStandardPandaHeadLootTable() {
        return makeHeadLootTable("Panda", "minecraft:entity.panda.ambient", PANDA);
    }

    private static LootPoolEntry.Builder<?> getRedParrotHeadLootTable() {
        return makeVariantHeadLootTable("Red Parrot", "minecraft:entity.parrot.ambient", RED_PARROT, 0);
    }
    private static LootPoolEntry.Builder<?> getBlueParrotHeadLootTable() {
        return makeVariantHeadLootTable("Blue Parrot", "minecraft:entity.parrot.ambient", BLUE_PARROT, 1);
    }
    private static LootPoolEntry.Builder<?> getGreenParrotHeadLootTable() {
        return makeVariantHeadLootTable("Green Parrot", "minecraft:entity.parrot.ambient", GREEN_PARROT, 2);
    }
    private static LootPoolEntry.Builder<?> getLightBlueParrotHeadLootTable() {
        return makeVariantHeadLootTable("Light Blue Parrot", "minecraft:entity.parrot.ambient", LIGHT_BLUE_PARROT, 3);
    }
    private static LootPoolEntry.Builder<?> getGrayParrotHeadLootTable() {
        return makeVariantHeadLootTable("Gray Parrot", "minecraft:entity.parrot.ambient", GRAY_PARROT, 4);
    }

    private static LootPoolEntry.Builder<?> getToastRabbitHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("CustomName", "{\"text\":\"Toast\"}");

        return makeHeadLootTable("Toast", "minecraft:entity.rabbit.attack", TOAST)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)));
    }
    private static LootPoolEntry.Builder<?> getBrownRabbitHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("RabbitType", 0);

        return makeHeadLootTable("Brown Rabbit", "minecraft:entity.rabbit.ambient", BROWN_RABBIT)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.26f, 0.05f));
    }
    private static LootPoolEntry.Builder<?> getWhiteRabbitHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("RabbitType", 1);

        return makeHeadLootTable("White Rabbit", "minecraft:entity.rabbit.ambient", WHITE_RABBIT)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.26f, 0.05f));
    }
    private static LootPoolEntry.Builder<?> getBlackRabbitHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("RabbitType", 2);

        return makeHeadLootTable("Black Rabbit", "minecraft:entity.rabbit.ambient", BLACK_RABBIT)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.26f, 0.05f));
    }
    private static LootPoolEntry.Builder<?> getBlackAndWhiteRabbitHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("RabbitType", 3);

        return makeHeadLootTable("Black and White Rabbit", "minecraft:entity.rabbit.ambient", BLACK_AND_WHITE_RABBIT)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.26f, 0.05f));
    }
    private static LootPoolEntry.Builder<?> getGoldRabbitHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("RabbitType", 4);

        return makeHeadLootTable("Gold Rabbit", "minecraft:entity.rabbit.ambient", GOLD_RABBIT)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.26f, 0.05f));
    }
    private static LootPoolEntry.Builder<?> getSaltAndPepperRabbitHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("RabbitType", 5);

        return makeHeadLootTable("Salt and Pepper Rabbit", "minecraft:entity.rabbit.ambient", SALT_AND_PEPPER_RABBIT)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.26f, 0.05f));
    }
    private static LootPoolEntry.Builder<?> getKillerBunnyRabbitHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("RabbitType", 99);

        return makeHeadLootTable("Killer Bunny", "minecraft:entity.rabbit.attack", THE_KILLER_BUNNY)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)));
    }

    private static LootPoolEntry.Builder<?> getJebSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putString("CustomName", "{\"text\":\"jeb_\"}");

        return makeHeadLootTable("jeb_ Sheep", "minecraft:entity.sheep.ambient", JEB_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)));
    }
    private static LootPoolEntry.Builder<?> getBlackSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 15);

        return makeHeadLootTable("Black Sheep", "minecraft:entity.sheep.ambient", BLACK_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getBlueSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 11);

        return makeHeadLootTable("Blue Sheep", "minecraft:entity.sheep.ambient", BLUE_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getBrownSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 12);

        return makeHeadLootTable("Brown Sheep", "minecraft:entity.sheep.ambient", BROWN_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getCyanSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 9);

        return makeHeadLootTable("Cyan Sheep", "minecraft:entity.sheep.ambient", CYAN_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getGraySheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 7);

        return makeHeadLootTable("Gray Sheep", "minecraft:entity.sheep.ambient", GRAY_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getGreenSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 13);

        return makeHeadLootTable("Green Sheep", "minecraft:entity.sheep.ambient", GREEN_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getLightBlueSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 3);

        return makeHeadLootTable("Light Blue Sheep", "minecraft:entity.sheep.ambient", LIGHT_BLUE_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getLightGraySheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 8);

        return makeHeadLootTable("Light Gray Sheep", "minecraft:entity.sheep.ambient", LIGHT_GRAY_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getLimeSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 5);

        return makeHeadLootTable("Lime Sheep", "minecraft:entity.sheep.ambient", LIME_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getMagentaSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 2);

        return makeHeadLootTable("Magenta Sheep", "minecraft:entity.sheep.ambient", MAGENTA_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getOrangeSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 1);

        return makeHeadLootTable("Orange Sheep", "minecraft:entity.sheep.ambient", ORANGE_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getPinkSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 6);

        return makeHeadLootTable("Pink Sheep", "minecraft:entity.sheep.ambient", PINK_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getPurpleSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 10);

        return makeHeadLootTable("Purple Sheep", "minecraft:entity.sheep.ambient", PURPLE_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getRedSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 14);

        return makeHeadLootTable("Red Sheep", "minecraft:entity.sheep.ambient", RED_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getWhiteSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 0);

        return makeHeadLootTable("White Sheep", "minecraft:entity.sheep.ambient", WHITE_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }
    private static LootPoolEntry.Builder<?> getYellowSheepHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putByte("Color", (byte) 4);

        return makeHeadLootTable("Yellow Sheep", "minecraft:entity.sheep.ambient", YELLOW_SHEEP)
            .conditionally(makeEntityPropertyCondition(new NbtPredicate(nbt)))
            .conditionally(makeLootingCondition(0.0175f, 0.0025f));
    }

    public static LootPoolEntry.Builder<?> getCreamyTraderLlamaHeadLootTable() {
        return makeVariantHeadLootTable("Creamy Trader Llama", "minecraft:entity.llama.ambient", CREAMY_TRADER_LLAMA, 0);
    }
    public static LootPoolEntry.Builder<?> getWhiteTraderLlamaHeadLootTable() {
        return makeVariantHeadLootTable("White Trader Llama", "minecraft:entity.llama.ambient", WHITE_TRADER_LLAMA, 1);
    }
    public static LootPoolEntry.Builder<?> getBrownTraderLlamaHeadLootTable() {
        return makeVariantHeadLootTable("Brown Trader Llama", "minecraft:entity.llama.ambient", BROWN_TRADER_LLAMA, 2);
    }
    public static LootPoolEntry.Builder<?> getGrayTraderLlamaHeadLootTable() {
        return makeVariantHeadLootTable("Gray Trader Llama", "minecraft:entity.llama.ambient", GRAY_TRADER_LLAMA, 3);
    }

    public static LootPoolEntry.Builder<?> getClownfishHeadLootTable() {
        return makeVariantHeadLootTable("Clownfish", "minecraft:entity.tropical_fish.flop", CLOWNFISH, 65536);
    }
    public static LootPoolEntry.Builder<?> getTriggerfishHeadLootTable() {
        return makeVariantHeadLootTable("Triggerfish", "minecraft:entity.tropical_fish.flop", TRIGGERFISH, 459008);
    }
    public static LootPoolEntry.Builder<?> getTomatoClownfishHeadLootTable() {
        return makeVariantHeadLootTable("Tomato Clownfish", "minecraft:entity.tropical_fish.flop", TOMATO_CLOWNFISH, 917504);
    }
    public static LootPoolEntry.Builder<?> getRedSnapperHeadLootTable() {
        return makeVariantHeadLootTable("Red Snapper", "minecraft:entity.tropical_fish.flop", RED_SNAPPER, 918273);
    }
    public static LootPoolEntry.Builder<?> getRedCichlidHeadLootTable() {
        return makeVariantHeadLootTable("Red Cichlid", "minecraft:entity.tropical_fish.flop", RED_CICHLID, 918529);
    }
    public static LootPoolEntry.Builder<?> getOrnateButterflyfishHeadLootTable() {
        return makeVariantHeadLootTable("Ornate Butterflyfish", "minecraft:entity.tropical_fish.flop", ORNATE_BUTTERFLYFISH, 16778497);
    }
    public static LootPoolEntry.Builder<?> getQueenAngelfishHeadLootTable() {
        return makeVariantHeadLootTable("Queen Angelfish", "minecraft:entity.tropical_fish.flop", QUEEN_ANGELFISH, 50660352);
    }
    public static LootPoolEntry.Builder<?> getCottonCandyBettaHeadLootTable() {
        return makeVariantHeadLootTable("Cotton Candy Betta", "minecraft:entity.tropical_fish.flop", COTTON_CANDY_BETTA, 50726144);
    }
    public static LootPoolEntry.Builder<?> getThreadfinHeadLootTable() {
        return makeVariantHeadLootTable("Threadfin", "minecraft:entity.tropical_fish.flop", THREADFIN, 67108865);
    }
    public static LootPoolEntry.Builder<?> getGoatfishHeadLootTable() {
        return makeVariantHeadLootTable("Goatfish", "minecraft:entity.tropical_fish.flop", GOATFISH, 67110144);
    }
    public static LootPoolEntry.Builder<?> getYellowTangHeadLootTable() {
        return makeVariantHeadLootTable("Yellow Tang", "minecraft:entity.tropical_fish.flop", YELLOW_TANG, 67371009);
    }
    public static LootPoolEntry.Builder<?> getYellowtailParrotfishHeadLootTable() {
        return makeVariantHeadLootTable("Yellowtail Parrotfish", "minecraft:entity.tropical_fish.flop", YELLOWTAIL_PARROTFISH, 67699456);
    }
    public static LootPoolEntry.Builder<?> getDottybackHeadLootTable() {
        return makeVariantHeadLootTable("Dottyback", "minecraft:entity.tropical_fish.flop", DOTTYBACK, 67764993);
    }
    public static LootPoolEntry.Builder<?> getParrotfishHeadLootTable() {
        return makeVariantHeadLootTable("Parrotfish", "minecraft:entity.tropical_fish.flop", PARROTFISH, 101253888);
    }
    public static LootPoolEntry.Builder<?> getMoorishIdolHeadLootTable() {
        return makeVariantHeadLootTable("Moorish Idol", "minecraft:entity.tropical_fish.flop", MOORISH_IDOL, 117441025);
    }
    public static LootPoolEntry.Builder<?> getButterflyfishHeadLootTable() {
        return makeVariantHeadLootTable("Butterflyfish", "minecraft:entity.tropical_fish.flop", BUTTERFLYFISH, 117441793);
    }
    public static LootPoolEntry.Builder<?> getAnemoneHeadLootTable() {
        return makeVariantHeadLootTable("Anemone", "minecraft:entity.tropical_fish.flop", ANEMONE, 117506305);
    }
    public static LootPoolEntry.Builder<?> getBlackTangHeadLootTable() {
        return makeVariantHeadLootTable("Black Tang", "minecraft:entity.tropical_fish.flop", BLACK_TANG, 117899265);
    }
    public static LootPoolEntry.Builder<?> getCichlidHeadLootTable() {
        return makeVariantHeadLootTable("Cichlid", "minecraft:entity.tropical_fish.flop", CICHLID, 118161664);
    }
    public static LootPoolEntry.Builder<?> getBlueTangHeadLootTable() {
        return makeVariantHeadLootTable("Blue Tang", "minecraft:entity.tropical_fish.flop", BLUE_TANG, 185008129);
    }
    public static LootPoolEntry.Builder<?> getEmperorRedSnapperHeadLootTable() {
        return makeVariantHeadLootTable("Emperor Red Snapper", "minecraft:entity.tropical_fish.flop", EMPEROR_RED_SNAPPER, 234882305);
    }
    public static LootPoolEntry.Builder<?> getRedLippedBlennyHeadLootTable() {
        return makeVariantHeadLootTable("Red Lipped Blenny", "minecraft:entity.tropical_fish.flop", RED_LIPPED_BLENNY, 235340288);
    }
    public static LootPoolEntry.Builder<?> getStandardTropicalFishHeadLootTable() {
        return makeHeadLootTable("Tropical Fish", "minecraft:entity.tropical_fish.flop", TROPICAL_FISH);
    }

    private static LootPoolEntry.Builder<?> getArmorerHeadLootTable() {
        return makeVillagerHeadLootTable("Armorer", "minecraft:armorer", ARMORER_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getButcherHeadLootTable() {
        return makeVillagerHeadLootTable("Butcher", "minecraft:butcher", BUTCHER_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getCartographerHeadLootTable() {
        return makeVillagerHeadLootTable("Cartographer", "minecraft:cartographer", CARTOGRAPHER_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getClericHeadLootTable() {
        return makeVillagerHeadLootTable("Cleric", "minecraft:cleric", CLERIC_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getFarmerHeadLootTable() {
        return makeVillagerHeadLootTable("Farmer", "minecraft:farmer", FARMER_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getFishermanHeadLootTable() {
        return makeVillagerHeadLootTable("Fisherman", "minecraft:fisherman", FISHERMAN_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getFletcherHeadLootTable() {
        return makeVillagerHeadLootTable("Fletcher", "minecraft:fletcher", FLETCHER_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getLeatherworkerHeadLootTable() {
        return makeVillagerHeadLootTable("Leatherworker", "minecraft:leatherworker", LEATHERWORKER_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getLibrarianHeadLootTable() {
        return makeVillagerHeadLootTable("Librarian", "minecraft:librarian", LIBRARIAN_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getMasonHeadLootTable() {
        return makeVillagerHeadLootTable("Mason", "minecraft:mason", MASON_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getNitwitHeadLootTable() {
        return makeVillagerHeadLootTable("Nitwit", "minecraft:nitwit", NITWIT_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getUnemployedVillagerHeadLootTable() {
        return makeVillagerHeadLootTable("Villager", "minecraft:none", VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getShepherdHeadLootTable() {
        return makeVillagerHeadLootTable("Shepherd", "minecraft:shepherd", SHEPHERD_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getToolsmithHeadLootTable() {
        return makeVillagerHeadLootTable("Toolsmith", "minecraft:toolsmith", TOOLSMITH_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getWeaponsmithHeadLootTable() {
        return makeVillagerHeadLootTable("Weaponsmith", "minecraft:weaponsmith", WEAPONSMITH_VILLAGER);
    }

    private static LootPoolEntry.Builder<?> getStandardWolfHeadLootTable() {
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("AngerTime", 0);

        NbtPredicate predicate =  new NbtPredicate(nbt);

        return makeHeadLootTable("Wolf", "minecraft:entity.wolf.ambient", WOLF)
            .conditionally(makeEntityPropertyCondition(predicate));
    }
    private static LootPoolEntry.Builder<?> getAngryWolfHeadLootTable() {
        return makeHeadLootTable("Angry Wolf", "minecraft:entity.wolf.growl", ANGRY_WOLF);
    }

    private static LootPoolEntry.Builder<?> getZombieArmorerHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Armorer", "minecraft:armorer", ZOMBIE_ARMORER);
    }
    private static LootPoolEntry.Builder<?> getZombieButcherHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Butcher", "minecraft:butcher", ZOMBIE_BUTCHER);
    }
    private static LootPoolEntry.Builder<?> getZombieCartographerHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Cartographer", "minecraft:cartographer", ZOMBIE_CARTOGRAPHER);
    }
    private static LootPoolEntry.Builder<?> getZombieClericHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Cleric", "minecraft:cleric", ZOMBIE_CLERIC);
    }
    private static LootPoolEntry.Builder<?> getZombieFarmerHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Farmer", "minecraft:farmer", ZOMBIE_FARMER);
    }
    private static LootPoolEntry.Builder<?> getZombieFishermanHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Fisherman", "minecraft:fisherman", ZOMBIE_FISHERMAN);
    }
    private static LootPoolEntry.Builder<?> getZombieFletcherHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Fletcher", "minecraft:fletcher", ZOMBIE_FLETCHER);
    }
    private static LootPoolEntry.Builder<?> getZombieLeatherworkerHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Leatherworker", "minecraft:leatherworker", ZOMBIE_LEATHERWORKER);
    }
    private static LootPoolEntry.Builder<?> getZombieLibrarianHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Librarian", "minecraft:librarian", ZOMBIE_LIBRARIAN);
    }
    private static LootPoolEntry.Builder<?> getZombieMasonHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Mason", "minecraft:mason", ZOMBIE_MASON);
    }
    private static LootPoolEntry.Builder<?> getZombieNitwitHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Nitwit", "minecraft:nitwit", ZOMBIE_NITWIT);
    }
    private static LootPoolEntry.Builder<?> getUnemployedZombieVillagerHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Villager", "minecraft:none", ZOMBIE_VILLAGER);
    }
    private static LootPoolEntry.Builder<?> getZombieShepherdHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Shepherd", "minecraft:shepherd", ZOMBIE_SHEPHERD);
    }
    private static LootPoolEntry.Builder<?> getZombieToolsmithHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Toolsmith", "minecraft:toolsmith", ZOMBIE_TOOLSMITH);
    }
    private static LootPoolEntry.Builder<?> getZombieWeaponsmithHeadLootTable() {
        return makeZombieVillagerHeadLootTable("Zombie Weaponsmith", "minecraft:weaponsmith", ZOMBIE_WEAPONSMITH);
    }
}
