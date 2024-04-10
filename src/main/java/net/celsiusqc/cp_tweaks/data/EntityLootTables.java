package net.celsiusqc.cp_tweaks.data;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.entity.ModEntities;
import net.celsiusqc.cp_tweaks.item.ModItems;
import net.celsiusqc.cp_tweaks.item.Tools;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Stream;

@SuppressWarnings("deprecation")
public class EntityLootTables extends EntityLootSubProvider {

    protected EntityLootTables() {
        super(FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {


        add(ModEntities.STARVIEWER_GIANT.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Tools.GIANT_ICE_SHARD_SWORD.get()))
                                .when(LootItemKilledByPlayerCondition.killedByPlayer())));

    }


    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return ForgeRegistries.ENTITY_TYPES.getValues().stream().filter(entities -> ForgeRegistries.ENTITY_TYPES.getKey(entities).getNamespace().equals(CreatePlanetaryTweaks.MOD_ID));
    }
}
