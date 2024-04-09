package net.celsiusqc.cp_tweaks.entity.client;



import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.entity.ModEntities;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import twilightforest.client.JappaPackReloadListener;
import twilightforest.client.MagicPaintingTextureManager;

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
        BooleanSupplier jappa = JappaPackReloadListener.INSTANCE.uncachedJappaPackCheck();

        event.registerEntityRenderer(ModEntities.STARVIEWER_GIANT.get(), StarviewerGiantRenderer::new);


}
}
