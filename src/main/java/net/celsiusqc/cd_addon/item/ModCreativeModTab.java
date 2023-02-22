package net.celsiusqc.cd_addon.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab cd_addon = new CreativeModeTab("cd_addon_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SHATTERED_WARP_STONE.get());
        }
    };
}
