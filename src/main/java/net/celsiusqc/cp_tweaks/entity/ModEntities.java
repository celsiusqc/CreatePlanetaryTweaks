package net.celsiusqc.cp_tweaks.entity;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.config.CreatePlanetaryTweaksConfig;
import net.celsiusqc.cp_tweaks.entity.custom.StarviewerGiant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = CreatePlanetaryTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreatePlanetaryTweaks.MOD_ID);

    public static final RegistryObject<EntityType<StarviewerGiant>> STARVIEWER_GIANT = CreatePlanetaryTweaksConfig.isStarlitGiantEnabled() ?
            ENTITIES.register("starviewer_giant",
                    () -> EntityType.Builder.of(StarviewerGiant::new, MobCategory.MONSTER)
                            .sized(2.4F, 7.2F) // Adjust the size for your entity
                            .fireImmune()
                            .build(new ResourceLocation(CreatePlanetaryTweaks.MOD_ID, "starviewer_giant").toString()))
            : null;

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
