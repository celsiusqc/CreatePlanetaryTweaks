package net.celsiusqc.cp_tweaks;

import net.celsiusqc.cp_tweaks.base.block.ModBlocks;
import net.celsiusqc.cp_tweaks.config.CreatePlanetaryTweaksConfig;
import net.celsiusqc.cp_tweaks.entity.ModEntities;
import net.celsiusqc.cp_tweaks.entity.custom.StarviewerGiant;
import net.celsiusqc.cp_tweaks.fluid.ModFluidTypes;
import net.celsiusqc.cp_tweaks.fluid.ModFluids;
import net.celsiusqc.cp_tweaks.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib.GeckoLib;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(CreatePlanetaryTweaks.MOD_ID)
public class CreatePlanetaryTweaks {
    public static final String MOD_ID = "cp_tweaks";
    public static final String ARMOR_DIR = MOD_ID + ":textures/models/armor/";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public CreatePlanetaryTweaks() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTab.register(modEventBus);
        modEventBus.addListener(this::setup);
        ModItems.register(modEventBus);
        Tools.register(modEventBus);
        Armor.register(modEventBus);
        ZincTools.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        ModEntities.register(modEventBus);

        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        // Register the configuration and load it
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CreatePlanetaryTweaksConfig.CONFIG);
        CreatePlanetaryTweaksConfig.loadConfig(CreatePlanetaryTweaksConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("createplanetarytweaks.toml").toString());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Setup code
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Common setup code
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {
        @SubscribeEvent
        public static void onAttributeCreate(EntityAttributeCreationEvent event) {
            if (CreatePlanetaryTweaksConfig.isStarlitGiantEnabled()) {
                event.put(ModEntities.STARVIEWER_GIANT.get(), StarviewerGiant.createAttributes().build());
            }
        }
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Add items to creative tab
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Server starting event
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Client setup event
        }
    }
}
