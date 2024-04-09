package net.celsiusqc.cp_tweaks.event;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.entity.client.ModelLayers;
import net.celsiusqc.cp_tweaks.entity.custom.StarviewerGiant;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreatePlanetaryTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
//    @SubscribeEvent
//    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
//        event.registerLayerDefinition(ModelLayers.STARVIEWER_GIANT, StarviewerGiant::createBodyLayer);
//    }
}
