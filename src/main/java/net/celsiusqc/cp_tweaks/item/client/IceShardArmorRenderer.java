package net.celsiusqc.cp_tweaks.item.client;

import net.celsiusqc.cp_tweaks.base.armors.IceShardArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class IceShardArmorRenderer extends GeoArmorRenderer<IceShardArmorItem> {
    public IceShardArmorRenderer() {
        super(new IceShardArmorModel());
    }
}
