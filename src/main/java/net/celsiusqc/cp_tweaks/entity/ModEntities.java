package net.celsiusqc.cp_tweaks.entity;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.entity.custom.StarviewerGiant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import twilightforest.entity.monster.GiantMiner;

@Mod.EventBusSubscriber(modid = CreatePlanetaryTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreatePlanetaryTweaks.MOD_ID);
    public static final DeferredRegister<Item> SPAWN_EGGS = DeferredRegister.create(ForgeRegistries.ITEMS, CreatePlanetaryTweaks.MOD_ID);


    public static final RegistryObject<EntityType<StarviewerGiant>> STARVIEWER_GIANT = make(EntityNames.STARVIEWER_GIANT, StarviewerGiant::new, MobCategory.MONSTER, 2.4F, 7.2F, 0x239391, 0x9a9a9a);




    private static <E extends Entity> RegistryObject<EntityType<E>> make(ResourceLocation id, EntityType.EntityFactory<E> factory, MobCategory classification, float width, float height, int primary, int secondary) {
        return make(id, factory, classification, width, height, false, primary, secondary);
    }

    private static <E extends Entity> RegistryObject<EntityType<E>> make(ResourceLocation id, EntityType.EntityFactory<E> factory, MobCategory classification, float width, float height, boolean fireproof, int primary, int secondary) {
        return build(id, makeBuilder(factory, classification, width, height, 80, 3), fireproof, primary, secondary);
    }

    private static <E extends Entity> RegistryObject<EntityType<E>> buildNoEgg(ResourceLocation id, EntityType.Builder<E> builder, boolean fireproof) {
        if (fireproof) builder.fireImmune();
        return ENTITIES.register(id.getPath(), () -> builder.build(id.toString()));
    }

    @SuppressWarnings("unchecked")
    private static <E extends Entity> RegistryObject<EntityType<E>> build(ResourceLocation id, EntityType.Builder<E> builder, boolean fireproof, int primary, int secondary) {
        if (fireproof) builder.fireImmune();
        RegistryObject<EntityType<E>> ret = ENTITIES.register(id.getPath(), () -> builder.build(id.toString()));
        if (primary != 0 && secondary != 0) {
            SPAWN_EGGS.register(id.getPath() + "_spawn_egg", () -> new ForgeSpawnEggItem(() -> (EntityType<? extends Mob>) ret.get(), primary, secondary, new Item.Properties()));
        }
        return ret;
    }

    private static <E extends Entity> EntityType.Builder<E> makeCastedBuilder(@SuppressWarnings("unused") Class<E> cast, EntityType.EntityFactory<E> factory, float width, float height, int range, int interval) {
        return makeBuilder(factory, MobCategory.MISC, width, height, range, interval);
    }

    private static <E extends Entity> EntityType.Builder<E> makeBuilder(EntityType.EntityFactory<E> factory, MobCategory classification, float width, float height, int range, int interval) {
        return EntityType.Builder.of(factory, classification).
                sized(width, height).
                setTrackingRange(range).
                setUpdateInterval(interval).
                setShouldReceiveVelocityUpdates(true);
    }


    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(STARVIEWER_GIANT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, GiantMiner::canSpawn, SpawnPlacementRegisterEvent.Operation.REPLACE);

    }

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {

        event.put(STARVIEWER_GIANT.get(), GiantMiner.registerAttributes().build());
    }


    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
