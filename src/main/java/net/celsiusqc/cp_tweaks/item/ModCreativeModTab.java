package net.celsiusqc.cp_tweaks.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab cp_tweaks = new CreativeModeTab("cp_tweaks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VOID_WORM_GU.get());
        }
    };
}
