package net.celsiusqc.create_dimensions_addon.item;

import net.celsiusqc.create_dimensions_addon.CreateDimensionsAddon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateDimensionsAddon.MOD_ID);

    public static final RegistryObject<Item> SHATTERED_WARP_STONE = ITEMS.register("shattered_warp_stone",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.Create_Dimensions_addon)));
    public static final RegistryObject<Item> WARP_STONE = ITEMS.register("warp_stone",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.Create_Dimensions_addon)));
    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.Create_Dimensions_addon)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
