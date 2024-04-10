package net.celsiusqc.cp_tweaks.item.client;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.base.armors.IceShardArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class IceShardArmorModel extends GeoModel<IceShardArmorItem> {
    @Override
    public ResourceLocation getModelResource(IceShardArmorItem animatable) {
        return new ResourceLocation(CreatePlanetaryTweaks.MOD_ID, "geo/ice_shard_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IceShardArmorItem animatable) {
        return new ResourceLocation(CreatePlanetaryTweaks.MOD_ID, "textures/armor/ice_shard.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IceShardArmorItem animatable) {
        return new ResourceLocation(CreatePlanetaryTweaks.MOD_ID, "animations/ice_shard_armor.animation.json");
    }
}
