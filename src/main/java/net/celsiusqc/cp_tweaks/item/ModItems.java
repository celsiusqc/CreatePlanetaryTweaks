package net.celsiusqc.cp_tweaks.item;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.base.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreatePlanetaryTweaks.MOD_ID);
    public static final RegistryObject<Item> BURNING = ITEMS.register("burning",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));
    public static final RegistryObject<Item> WARM = ITEMS.register("warm",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));
    public static final RegistryObject<Item> COMFY = ITEMS.register("comfy",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));
    public static final RegistryObject<Item> COLD = ITEMS.register("cold",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));
    public static final RegistryObject<Item> FREEZING = ITEMS.register("freezing",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));

    public static final RegistryObject<Item> AUTUMN = ITEMS.register("autumn",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));
    public static final RegistryObject<Item> DRY = ITEMS.register("dry",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));
    public static final RegistryObject<Item> SPRING = ITEMS.register("spring",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));
    public static final RegistryObject<Item> SUMMER = ITEMS.register("summer",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));
    public static final RegistryObject<Item> WET = ITEMS.register("wet",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));
    public static final RegistryObject<Item> WINTER = ITEMS.register("winter",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));
    public static final RegistryObject<Item> WORM_GU = ITEMS.register("worm_gu",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));

    public static final RegistryObject<Item> UNSTABLE_ICE_SHARD = ITEMS.register("unstable_ice_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.cp_tweaks)));


    public static class ToolTiers {
        public static final Tier VOID_WORM = new ForgeTier(
                4,
                2067,
                0,
                0,
                15,
                null,
                () -> Ingredient.of(ModItems.WORM_GU.get()));
    }
    //Wood is tier 0, stone/gold is 1, iron 2, diamond 3, netherite 4
    public static class ArmorTiers {
        public static final ArmorMaterial VOID_WORM = new ModArmorMaterial(
                "void_wormed",
                600,
                new int[] {5, 8, 10, 5},
                15,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                1.7f,
                0.12f,
                () -> Ingredient.of(ModItems.WORM_GU.get()));

    }

    public static final RegistryObject<ArmorItem> VOID_WORM_HELMET = ITEMS.register("void_wormed_helmet",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> VOID_WORM_CHESTPLATE = ITEMS.register("void_wormed_chestplate",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> VOID_WORM_LEGGINGS = ITEMS.register("void_wormed_leggings",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> VOID_WORM_BOOTS = ITEMS.register("void_wormed_boots",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.FEET, props()));

    public static final RegistryObject<SwordItem> VOID_WORM_SWORD = ITEMS.register("void_wormed_sword",
            () -> new SwordItem(ToolTiers.VOID_WORM, 9, -2.4f, props()));
    //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed
    public static final RegistryObject<AxeItem> VOID_WORM_AXE = ITEMS.register("void_wormed_axe",
            () -> new AxeItem(ToolTiers.VOID_WORM, 11, -3.0f, props()));
    public static final RegistryObject<ShovelItem> VOID_WORM_SHOVEL = ITEMS.register("void_wormed_shovel",
            () -> new ShovelItem(ToolTiers.VOID_WORM, 6, -3.0f, props()));
    public static final RegistryObject<PickaxeItem> VOID_WORM_PICKAXE = ITEMS.register("void_wormed_pickaxe",
            () -> new PickaxeItem(ToolTiers.VOID_WORM, 6, -2.8f, props()));
    public static final RegistryObject<HoeItem> VOID_WORM_HOE = ITEMS.register("void_wormed_hoe",
            () -> new HoeItem(ToolTiers.VOID_WORM, 0, 0.0f, props()));

    private static Item.Properties props() {
        return new Item.Properties().tab(ModCreativeModTab.cp_tweaks);
    }

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
