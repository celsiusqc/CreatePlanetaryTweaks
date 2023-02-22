package net.celsiusqc.cd_addon.item;

import net.celsiusqc.cd_addon.CreateDimensionsAddon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateDimensionsAddon.MOD_ID);

    public static final RegistryObject<Item> SHATTERED_WARP_STONE = ITEMS.register("shattered_warp_stone",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> WARP_STONE = ITEMS.register("warp_stone",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> AMETRINE_DUST = ITEMS.register("ametrine_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> BURNING = ITEMS.register("burning",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> WARM = ITEMS.register("warm",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> COMFY = ITEMS.register("comfy",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> COLD = ITEMS.register("cold",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> FREEZING = ITEMS.register("freezing",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));

    public static final RegistryObject<Item> AUTUMN = ITEMS.register("autumn",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> DRY = ITEMS.register("dry",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> SPRING = ITEMS.register("spring",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> SUMMER = ITEMS.register("summer",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> WET = ITEMS.register("wet",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> WINTER = ITEMS.register("winter",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));

    public static final RegistryObject<Item> GUNPOWDER_INFUSED_AMETRINE = ITEMS.register("gunpowder_infused_ametrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));

    public static final RegistryObject<Item> CRUSHED_VENTIUM_ORE = ITEMS.register("crushed_ventium_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> CRUSHED_HORIZONITE_ORE = ITEMS.register("crushed_horizonite_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> CRUSHED_FALSITE_ORE = ITEMS.register("crushed_falsite_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> CRUSHED_CHAROITE_ORE = ITEMS.register("crushed_charoite_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));
    public static final RegistryObject<Item> CRUSHED_AQUITE_ORE = ITEMS.register("crushed_aquite_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cd_addon)));



    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
