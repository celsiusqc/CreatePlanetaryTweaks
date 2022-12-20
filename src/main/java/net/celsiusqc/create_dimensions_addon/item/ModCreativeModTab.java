package net.celsiusqc.create_dimensions_addon.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab Create_Dimensions_addon = new CreativeModeTab("create_dimensions_addon_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SHATTERED_WARP_STONE.get());
        }
    };
}
