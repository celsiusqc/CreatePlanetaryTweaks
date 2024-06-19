package net.celsiusqc.cp_tweaks.entity.client;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.config.CreatePlanetaryTweaksConfig;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModelLayers {

    public static final ModelLayerLocation STARVIEWER_GIANT = CreatePlanetaryTweaksConfig.isStarlitGiantEnabled() ? register("starviewer_giant") : null;

    private static ModelLayerLocation register(String p_171294_) {
        return register(p_171294_, "main");
    }

    private static ModelLayerLocation register(String p_171301_, String p_171302_) {
        return new ModelLayerLocation(new ResourceLocation(CreatePlanetaryTweaks.MOD_ID, p_171301_), p_171302_);
    }
}
