package net.celsiusqc.cp_tweaks.item;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.base.ArmorTiers;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Armor {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreatePlanetaryTweaks.MOD_ID);
    public static final RegistryObject<ArmorItem> VOID_WORMED_HELMET = ITEMS.register("void_wormed_helmet",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, ArmorItem.Type.HELMET, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> VOID_WORMED_CHESTPLATE = ITEMS.register("void_wormed_chestplate",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> VOID_WORMED_LEGGINGS = ITEMS.register("void_wormed_leggings",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> VOID_WORMED_BOOTS = ITEMS.register("void_wormed_boots",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, ArmorItem.Type.BOOTS, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> DESH_HELMET = ITEMS.register("desh_helmet",
            () -> new ArmorItem(ArmorTiers.DESH, ArmorItem.Type.HELMET, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> DESH_CHESTPLATE = ITEMS.register("desh_chestplate",
            () -> new ArmorItem(ArmorTiers.DESH, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> DESH_LEGGINGS = ITEMS.register("desh_leggings",
            () -> new ArmorItem(ArmorTiers.DESH, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> DESH_BOOTS = ITEMS.register("desh_boots",
            () -> new ArmorItem(ArmorTiers.DESH, ArmorItem.Type.BOOTS, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> CALORITE_HELMET = ITEMS.register("calorite_helmet",
            () -> new ArmorItem(ArmorTiers.CALORITE, ArmorItem.Type.HELMET, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> CALORITE_CHESTPLATE = ITEMS.register("calorite_chestplate",
            () -> new ArmorItem(ArmorTiers.CALORITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> CALORITE_LEGGINGS = ITEMS.register("calorite_leggings",
            () -> new ArmorItem(ArmorTiers.CALORITE, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> CALORITE_BOOTS = ITEMS.register("calorite_boots",
            () -> new ArmorItem(ArmorTiers.CALORITE, ArmorItem.Type.BOOTS, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
