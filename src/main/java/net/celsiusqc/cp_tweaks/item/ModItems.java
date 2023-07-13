package net.celsiusqc.cp_tweaks.item;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.base.ArmorTiers;
import net.celsiusqc.cp_tweaks.base.ToolTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
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



    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}