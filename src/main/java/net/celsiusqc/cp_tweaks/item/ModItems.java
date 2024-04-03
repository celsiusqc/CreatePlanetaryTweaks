package net.celsiusqc.cp_tweaks.item;
import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.item.Tooltips.EnderGuardianGuTooltip;
import net.celsiusqc.cp_tweaks.item.Tooltips.MonstrosityGuTooltip;
import net.celsiusqc.cp_tweaks.item.Tooltips.UnstableIceShardTooltip;
import net.celsiusqc.cp_tweaks.item.Tooltips.VoidWormGuTooltip;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreatePlanetaryTweaks.MOD_ID);

    // Logo and Branding
    public static final RegistryObject<Item> CREATE_PLANETARY_TWEAKS_LOGO = ITEMS.register("create_planetary_tweaks_logo",
            () -> new Item(new Item.Properties()));

    // Seasonal Items
    public static final RegistryObject<Item> AUTUMN = ITEMS.register("autumn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WINTER = ITEMS.register("winter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRING = ITEMS.register("spring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUMMER = ITEMS.register("summer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRY = ITEMS.register("dry",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WET = ITEMS.register("wet",
            () -> new Item(new Item.Properties()));

    // Special Items with Tooltips
    public static final RegistryObject<Item> VOID_WORM_GU = ITEMS.register("void_worm_gu",
            () -> new VoidWormGuTooltip(new Item.Properties()));
    public static final RegistryObject<Item> UNSTABLE_ICE_SHARD = ITEMS.register("unstable_ice_shard",
            () -> new UnstableIceShardTooltip(new Item.Properties()));
    public static final RegistryObject<Item> MONSTROSITY_GU = ITEMS.register("monstrosity_gu",
            () -> new MonstrosityGuTooltip(new Item.Properties()));
    public static final RegistryObject<Item> ENDER_GUARDIAN_GU = ITEMS.register("ender_guardian_gu",
            () -> new EnderGuardianGuTooltip(new Item.Properties()));

    // Engineering and Rocketry Items
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REINFORCED_ROCKET_FIN = ITEMS.register("reinforced_rocket_fin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REINFORCED_ROCKET_NOSE_CONE = ITEMS.register("reinforced_rocket_nose_cone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IGNITIUM_SHEET = ITEMS.register("ignitium_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IGNITIUM_ENGINE = ITEMS.register("ignitium_engine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STURDY_OSTRUM_SHEET = ITEMS.register("sturdy_ostrum_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STURDY_DESH_SHEET = ITEMS.register("sturdy_desh_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STABILIZED_ICE_SHEET = ITEMS.register("stabilized_ice_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FTL_GLACIAN_ENGINE = ITEMS.register("ftl_glacian_engine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STABILIZED_FROZEN_GU = ITEMS.register("stabilized_frozen_gu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLACIAN_ENGINE_FRAME = ITEMS.register("glacian_engine_frame",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLACIAN_ENGINE_FAN = ITEMS.register("glacian_engine_fan",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
