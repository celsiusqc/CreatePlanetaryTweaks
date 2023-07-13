package net.celsiusqc.cp_tweaks.item;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.base.ModArmorMaterial;
import net.celsiusqc.cp_tweaks.base.ToolTiers;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
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

    //public static final RegistryObject<Item> DESH_INGOT = RegistryObject.create(new ResourceLocation("ad_astra:desh_ingot"), ForgeRegistries.ITEMS);

    //      VOID WORM TOOL


    //Wood is tier 0, stone/gold is 1, iron 2, diamond 3, netherite 4


    public static final RegistryObject<ArmorItem> VOID_WORMED_HELMET = ITEMS.register("void_wormed_helmet",
            () -> new ArmorItem(ModArmorMaterial.VOID_WORM, ArmorItem.Type.HELMET, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> VOID_WORMED_CHESTPLATE = ITEMS.register("void_wormed_chestplate",
            () -> new ArmorItem(ModArmorMaterial.VOID_WORM, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> VOID_WORMED_LEGGINGS = ITEMS.register("void_wormed_leggings",
            () -> new ArmorItem(ModArmorMaterial.VOID_WORM, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> VOID_WORMED_BOOTS = ITEMS.register("void_wormed_boots",
            () -> new ArmorItem(ModArmorMaterial.VOID_WORM, ArmorItem.Type.BOOTS, new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .rarity(Rarity.UNCOMMON)));


    /*public static final RegistryObject<ArmorItem> VOID_WORM_HELMET = ITEMS.register("void_wormed_helmet",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<ArmorItem> VOID_WORM_CHESTPLATE = ITEMS.register("void_wormed_chestplate",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<ArmorItem> VOID_WORM_LEGGINGS = ITEMS.register("void_wormed_leggings",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> VOID_WORM_BOOTS = ITEMS.register("void_wormed_boots",
            () -> new ArmorItem(ArmorTiers.VOID_WORM, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<ArmorItem> DESH_INGOT_HELMET = ITEMS.register("desh_helmet",
            () -> new ArmorItem(ArmorTiers.DESH, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<ArmorItem> DESH_INGOT_CHESTPLATE = ITEMS.register("desh_chestplate",
            () -> new ArmorItem(ArmorTiers.DESH, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<ArmorItem> DESH_INGOT_LEGGINGS = ITEMS.register("desh_leggings",
            () -> new ArmorItem(ArmorTiers.DESH, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> DESH_INGOT_BOOTS = ITEMS.register("desh_boots",
            () -> new ArmorItem(ArmorTiers.DESH, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<ArmorItem> CALORITE_INGOT_HELMET = ITEMS.register("calorite_helmet",
            () -> new ArmorItem(ArmorTiers.CALORITE, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<ArmorItem> CALORITE_INGOT_CHESTPLATE = ITEMS.register("calorite_chestplate",
            () -> new ArmorItem(ArmorTiers.CALORITE, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<ArmorItem> CALORITE_INGOT_LEGGINGS = ITEMS.register("calorite_leggings",
            () -> new ArmorItem(ArmorTiers.CALORITE, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> CALORITE_INGOT_BOOTS = ITEMS.register("calorite_boots",
            () -> new ArmorItem(ArmorTiers.CALORITE, EquipmentSlot.FEET, new Item.Properties()));*/




    public static final RegistryObject<SwordItem> VOID_WORM_SWORD = ITEMS.register("void_wormed_sword",
            () -> new SwordItem(ToolTiers.VOID_WORM, 3, -2.4f, new Item.Properties()));
    //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed
    public static final RegistryObject<AxeItem> VOID_WORM_AXE = ITEMS.register("void_wormed_axe",
            () -> new AxeItem(ToolTiers.VOID_WORM, 5, -3.0f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> VOID_WORM_PICKAXE = ITEMS.register("void_wormed_pickaxe",
            () -> new PickaxeItem(ToolTiers.VOID_WORM, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> VOID_WORM_SHOVEL = ITEMS.register("void_wormed_shovel",
            () -> new ShovelItem(ToolTiers.VOID_WORM, 0, -3.0f, new Item.Properties()));
    public static final RegistryObject<HoeItem> VOID_WORM_HOE = ITEMS.register("void_wormed_hoe",
            () -> new HoeItem(ToolTiers.VOID_WORM, -6, 0.0f, new Item.Properties()));


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