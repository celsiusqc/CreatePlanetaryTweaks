package net.celsiusqc.cp_tweaks.item;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.base.ToolTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Tools {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreatePlanetaryTweaks.MOD_ID);
    public static final RegistryObject<SwordItem> VOID_WORM_SWORD = ITEMS.register("void_wormed_sword",
            () -> new SwordItem(ToolTiers.VOID_WORMED, 3, -2.4f, new Item.Properties()));
    //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed
    public static final RegistryObject<AxeItem> VOID_WORM_AXE = ITEMS.register("void_wormed_axe",
            () -> new AxeItem(ToolTiers.VOID_WORMED, 5, -3.0f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> VOID_WORM_PICKAXE = ITEMS.register("void_wormed_pickaxe",
            () -> new PickaxeItem(ToolTiers.VOID_WORMED, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> VOID_WORM_SHOVEL = ITEMS.register("void_wormed_shovel",
            () -> new ShovelItem(ToolTiers.VOID_WORMED, 0, -3.0f, new Item.Properties()));
    public static final RegistryObject<HoeItem> VOID_WORM_HOE = ITEMS.register("void_wormed_hoe",
            () -> new HoeItem(ToolTiers.VOID_WORMED, -6, 0.0f, new Item.Properties()));


    public static final RegistryObject<SwordItem> DESH_SWORD = ITEMS.register("desh_sword",
            () -> new SwordItem(ToolTiers.DESH, 3, -2.4f, new Item.Properties()));
    //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed
    public static final RegistryObject<AxeItem> DESH_AXE = ITEMS.register("desh_axe",
            () -> new AxeItem(ToolTiers.DESH, 5, -3.0f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> DESH_PICKAXE = ITEMS.register("desh_pickaxe",
            () -> new PickaxeItem(ToolTiers.DESH, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> DESH_SHOVEL = ITEMS.register("desh_shovel",
            () -> new ShovelItem(ToolTiers.DESH, -1, -3.0f, new Item.Properties()));
    public static final RegistryObject<HoeItem> DESH_HOE = ITEMS.register("desh_hoe",
            () -> new HoeItem(ToolTiers.DESH, -7, 0.0f, new Item.Properties()));


    public static final RegistryObject<SwordItem> CALORITE_SWORD = ITEMS.register("calorite_sword",
            () -> new SwordItem(ToolTiers.CALORITE, 3, -2.4f, new Item.Properties()));
    //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed
    public static final RegistryObject<AxeItem> CALORITE_AXE = ITEMS.register("calorite_axe",
            () -> new AxeItem(ToolTiers.CALORITE, 5, -3.0f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> CALORITE_PICKAXE = ITEMS.register("calorite_pickaxe",
            () -> new PickaxeItem(ToolTiers.CALORITE, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> CALORITE_SHOVEL = ITEMS.register("calorite_shovel",
            () -> new ShovelItem(ToolTiers.CALORITE, -1, -3.0f, new Item.Properties()));
    public static final RegistryObject<HoeItem> CALORITE_HOE = ITEMS.register("calorite_hoe",
            () -> new HoeItem(ToolTiers.CALORITE, -8, 0.0f, new Item.Properties()));

    public static final RegistryObject<SwordItem> OSTRUM_SWORD = ITEMS.register("ostrum_sword",
            () -> new SwordItem(ToolTiers.OSTRUM, 3, -2.4f, new Item.Properties()));
    //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed
    public static final RegistryObject<AxeItem> OSTRUM_AXE = ITEMS.register("ostrum_axe",
            () -> new AxeItem(ToolTiers.OSTRUM, 5, -3.0f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> OSTRUM_PICKAXE = ITEMS.register("ostrum_pickaxe",
            () -> new PickaxeItem(ToolTiers.OSTRUM, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> OSTRUM_SHOVEL = ITEMS.register("ostrum_shovel",
            () -> new ShovelItem(ToolTiers.OSTRUM, -1, -3.0f, new Item.Properties()));
    public static final RegistryObject<HoeItem> OSTRUM_HOE = ITEMS.register("ostrum_hoe",
            () -> new HoeItem(ToolTiers.OSTRUM, -9, 0.0f, new Item.Properties()));

    public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ToolTiers.STEEL, 3, -2.4f, new Item.Properties()));
    //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed
    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ToolTiers.STEEL, 5, -3.0f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ToolTiers.STEEL, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ToolTiers.STEEL, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ToolTiers.STEEL, -3, 0.0f, new Item.Properties()));

    public static final RegistryObject<SwordItem> BRASS_SWORD = ITEMS.register("brass_sword",
            () -> new SwordItem(ToolTiers.BRASS, 3, -2.4f, new Item.Properties()));
    //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed
    public static final RegistryObject<AxeItem> BRASS_AXE = ITEMS.register("brass_axe",
            () -> new AxeItem(ToolTiers.BRASS, 5, -3.0f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> BRASS_PICKAXE = ITEMS.register("brass_pickaxe",
            () -> new PickaxeItem(ToolTiers.BRASS, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> BRASS_SHOVEL = ITEMS.register("brass_shovel",
            () -> new ShovelItem(ToolTiers.BRASS, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<HoeItem> BRASS_HOE = ITEMS.register("brass_hoe",
            () -> new HoeItem(ToolTiers.BRASS, -3, 0.0f, new Item.Properties()));

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

    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ToolTiers.COPPER, 3, -2.4f, new Item.Properties()));
    //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ToolTiers.COPPER, 5, -3.0f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ToolTiers.COPPER, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ToolTiers.COPPER, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ToolTiers.COPPER, -2, 0.0f, new Item.Properties()));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
