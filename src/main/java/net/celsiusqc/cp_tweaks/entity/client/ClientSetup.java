package net.celsiusqc.cp_tweaks.entity.client;



import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.entity.ModEntities;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import twilightforest.client.JappaPackReloadListener;
import twilightforest.client.MagicPaintingTextureManager;
import twilightforest.client.renderer.entity.NoopRenderer;
import twilightforest.client.renderer.entity.TFGiantRenderer;
import twilightforest.compat.jei.renderers.EntityRenderer;
import twilightforest.entity.TFPart;
import twilightforest.init.TFEntities;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.BooleanSupplier;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD, modid = CreatePlanetaryTweaks.MOD_ID)
public class ClientSetup {

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void registerClientReloadListeners(RegisterClientReloadListenersEvent event) {
        event.registerReloadListener(JappaPackReloadListener.INSTANCE);
        MagicPaintingTextureManager.instance = new MagicPaintingTextureManager(Minecraft.getInstance().getTextureManager());
        event.registerReloadListener(MagicPaintingTextureManager.instance);
    }
    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.STARVIEWER_GIANT.get(), TFGiantRenderer::new);
    }



}
