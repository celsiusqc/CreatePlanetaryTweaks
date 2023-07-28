package net.celsiusqc.cp_tweaks.item;
import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreatePlanetaryTweaks.MOD_ID);

    public static final RegistryObject<Item> AUTUMN = ITEMS.register("autumn",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRY = ITEMS.register("dry",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPRING = ITEMS.register("spring",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUMMER = ITEMS.register("summer",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WET = ITEMS.register("wet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WINTER = ITEMS.register("winter",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VOID_WORM_GU = ITEMS.register("void_worm_gu",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNSTABLE_ICE_SHARD = ITEMS.register("unstable_ice_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REINFORCED_ROCKET_FIN = ITEMS.register("reinforced_rocket_fin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IGNITIUM_SHEET = ITEMS.register("ignitium_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IGNITIUM_ENGINE = ITEMS.register("ignitium_engine",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEART_OF_THE_MONSTROSITY = ITEMS.register("heart_of_the_monstrosity",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MONSTROSITY_HEART_GU = ITEMS.register("monstrosity_heart_gu",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IMBUED_ROCKET_NOSE_CONE = ITEMS.register("imbued_rocket_nose_cone",
            () -> new Item(new Item.Properties()));




    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}