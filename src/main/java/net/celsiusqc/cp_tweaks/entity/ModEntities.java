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
import twilightforest.entity.monster.ArmoredGiant;
import twilightforest.entity.monster.GiantMiner;

@Mod.EventBusSubscriber(modid = CreatePlanetaryTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    // Entity type registration, assuming you have something like this:
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreatePlanetaryTweaks.MOD_ID);

    public static final RegistryObject<EntityType<StarviewerGiant>> STARVIEWER_GIANT = ENTITIES.register("starviewer_giant",
            () -> EntityType.Builder.of(StarviewerGiant::new, MobCategory.MONSTER)
                    .sized(2.4F, 7.2F) // Adjust the size for your entity
                    .build(new ResourceLocation(CreatePlanetaryTweaks.MOD_ID, "starviewer_giant").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
