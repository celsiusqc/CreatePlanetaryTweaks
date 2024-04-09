package net.celsiusqc.cp_tweaks.entity.client.model;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.entity.client.ModelLayers;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreatePlanetaryTweaks.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class LayerDefinitions {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {

        event.registerLayerDefinition(ModelLayers.STARVIEWER_GIANT, () -> LayerDefinition.create(HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F), 64, 32));



    }
}
