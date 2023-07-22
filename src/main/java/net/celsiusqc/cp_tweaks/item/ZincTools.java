package net.celsiusqc.cp_tweaks.item;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.base.ToolTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ZincTools {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreatePlanetaryTweaks.MOD_ID);


    public static final RegistryObject<SwordItem> ZINC_SWORD = ITEMS.register("zinc_sword",
            () -> new SwordItem(ToolTiers.ZINC, 3, -2.4f, new Item.Properties()));
    //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed
    public static final RegistryObject<AxeItem> ZINC_AXE = ITEMS.register("zinc_axe",
            () -> new AxeItem(ToolTiers.ZINC, 5, -3.0f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> ZINC_PICKAXE = ITEMS.register("zinc_pickaxe",
            () -> new PickaxeItem(ToolTiers.ZINC, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> ZINC_SHOVEL = ITEMS.register("zinc_shovel",
            () -> new ShovelItem(ToolTiers.ZINC, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<HoeItem> ZINC_HOE = ITEMS.register("zinc_hoe",
            () -> new HoeItem(ToolTiers.ZINC, -2, 0.0f, new Item.Properties()));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
