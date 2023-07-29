package net.celsiusqc.cp_tweaks.item;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreatePlanetaryTweaks.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CP_TWEAKS_TAB = CREATIVE_MODE_TABS.register("cp_tweaks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VOID_WORM_GU.get()))
                    .title(Component.translatable("creativetab.cp_tweaks_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        if (ModList.get().isLoaded("create") &&(ModList.get().isLoaded("ad_astra"))) { pOutput.accept(ModItems.UNSTABLE_ICE_SHARD.get()); }
                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {pOutput.accept(ModItems.VOID_WORM_GU.get());}
                        if (ModList.get().isLoaded("cataclysm") && ModList.get().isLoaded("create")) { pOutput.accept(ModItems.ENDER_GUARDIAN_GU.get()); }
                        if (ModList.get().isLoaded("cataclysm") && ModList.get().isLoaded("create")) { pOutput.accept(ModItems.MONSTROSITY_HEART_GU.get()); }

                        if (ModList.get().isLoaded("sereneseasons")) { pOutput.accept(ModItems.AUTUMN.get()); }
                        if (ModList.get().isLoaded("sereneseasons")) { pOutput.accept(ModItems.WINTER.get()); }
                        if (ModList.get().isLoaded("sereneseasons")) { pOutput.accept(ModItems.SPRING.get()); }
                        if (ModList.get().isLoaded("sereneseasons")) { pOutput.accept(ModItems.SUMMER.get()); }
                        if (ModList.get().isLoaded("sereneseasons")) { pOutput.accept(ModItems.DRY.get()); }
                        if (ModList.get().isLoaded("sereneseasons")) { pOutput.accept(ModItems.WET.get()); }

                        if (ModList.get().isLoaded("ad_astra") && ModList.get().isLoaded("disabled")) { pOutput.accept(Tools.DESH_TIPPED_STONE_AXE.get()); }
                        if (ModList.get().isLoaded("ad_astra") && ModList.get().isLoaded("disabled")) { pOutput.accept(Tools.DESH_TIPPED_STONE_SWORD.get()); }
                        if (ModList.get().isLoaded("ad_astra") && ModList.get().isLoaded("disabled")) { pOutput.accept(Tools.DESH_TIPPED_STONE_PICKAXE.get()); }
                        if (ModList.get().isLoaded("ad_astra") && ModList.get().isLoaded("disabled")) { pOutput.accept(Tools.DESH_TIPPED_STONE_SHOVEL.get()); }
                        if (ModList.get().isLoaded("ad_astra") && ModList.get().isLoaded("disabled")) { pOutput.accept(Tools.DESH_TIPPED_STONE_HOE.get()); }

                        if (!ModList.get().isLoaded("create_sa")) { pOutput.accept(Tools.COPPER_AXE.get()); }
                        if (!ModList.get().isLoaded("create_sa")) { pOutput.accept(Tools.COPPER_SWORD.get()); }
                        if (!ModList.get().isLoaded("create_sa")) { pOutput.accept(Tools.COPPER_PICKAXE.get()); }
                        if (!ModList.get().isLoaded("create_sa")) { pOutput.accept(Tools.COPPER_SHOVEL.get()); }
                        if (!ModList.get().isLoaded("create_sa")) { pOutput.accept(Tools.COPPER_HOE.get()); }

                        if (ModList.get().isLoaded("create") &&(!ModList.get().isLoaded("create_sa"))) { pOutput.accept(ZincTools.ZINC_AXE.get()); }
                        if (ModList.get().isLoaded("create") &&(!ModList.get().isLoaded("create_sa"))) { pOutput.accept(ZincTools.ZINC_SWORD.get()); }
                        if (ModList.get().isLoaded("create") &&(!ModList.get().isLoaded("create_sa"))) { pOutput.accept(ZincTools.ZINC_PICKAXE.get()); }
                        if (ModList.get().isLoaded("create") &&(!ModList.get().isLoaded("create_sa"))) { pOutput.accept(ZincTools.ZINC_SHOVEL.get()); }
                        if (ModList.get().isLoaded("create") &&(!ModList.get().isLoaded("create_sa"))) { pOutput.accept(ZincTools.ZINC_HOE.get()); }

                        if (ModList.get().isLoaded("create") &&(!ModList.get().isLoaded("create_sa"))) { pOutput.accept(Tools.BRASS_AXE.get()); }
                        if (ModList.get().isLoaded("create") &&(!ModList.get().isLoaded("create_sa"))) { pOutput.accept(Tools.BRASS_SWORD.get()); }
                        if (ModList.get().isLoaded("create") &&(!ModList.get().isLoaded("create_sa"))) { pOutput.accept(Tools.BRASS_PICKAXE.get()); }
                        if (ModList.get().isLoaded("create") &&(!ModList.get().isLoaded("create_sa"))) { pOutput.accept(Tools.BRASS_SHOVEL.get()); }
                        if (ModList.get().isLoaded("create") &&(!ModList.get().isLoaded("create_sa"))) { pOutput.accept(Tools.BRASS_HOE.get()); }

                        if (!ModList.get().isLoaded("alloyed") &&(!ModList.get().isLoaded("ad_astra"))) { pOutput.accept(ModItems.STEEL_INGOT.get()); }
                        if (!ModList.get().isLoaded("alloyed")) { pOutput.accept(Tools.STEEL_AXE.get()); }
                        if (!ModList.get().isLoaded("alloyed")) { pOutput.accept(Tools.STEEL_SWORD.get()); }
                        if (!ModList.get().isLoaded("alloyed")) { pOutput.accept(Tools.STEEL_PICKAXE.get()); }
                        if (!ModList.get().isLoaded("alloyed")) { pOutput.accept(Tools.STEEL_SHOVEL.get()); }
                        if (!ModList.get().isLoaded("alloyed")) { pOutput.accept(Tools.STEEL_HOE.get()); }



                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {pOutput.accept(Tools.VOID_WORM_AXE.get());}
                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {pOutput.accept(Tools.VOID_WORM_SWORD.get());}
                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {pOutput.accept(Tools.VOID_WORM_PICKAXE.get());}
                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {pOutput.accept(Tools.VOID_WORM_SHOVEL.get());}
                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {pOutput.accept(Tools.VOID_WORM_HOE.get());}
                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {pOutput.accept(Armor.VOID_WORMED_HELMET.get());}
                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {pOutput.accept(Armor.VOID_WORMED_CHESTPLATE.get());}
                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {pOutput.accept(Armor.VOID_WORMED_LEGGINGS.get());}
                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {pOutput.accept(Armor.VOID_WORMED_BOOTS.get());}

                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.DESH_AXE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.DESH_SWORD.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.DESH_PICKAXE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.DESH_SHOVEL.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.DESH_HOE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.DESH_HELMET.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.DESH_CHESTPLATE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.DESH_LEGGINGS.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.DESH_BOOTS.get()); }

                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.CALORITE_AXE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.CALORITE_SWORD.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.CALORITE_PICKAXE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.CALORITE_SHOVEL.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.CALORITE_HOE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.CALORITE_HELMET.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.CALORITE_CHESTPLATE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.CALORITE_LEGGINGS.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.CALORITE_BOOTS.get()); }

                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.OSTRUM_AXE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.OSTRUM_SWORD.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.OSTRUM_PICKAXE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.OSTRUM_SHOVEL.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Tools.OSTRUM_HOE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.OSTRUM_HELMET.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.OSTRUM_CHESTPLATE.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.OSTRUM_LEGGINGS.get()); }
                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(Armor.OSTRUM_BOOTS.get()); }

                        if (ModList.get().isLoaded("ad_astra") && (ModList.get().isLoaded("create"))) { pOutput.accept(Armor.ICE_SHARD_HELMET.get()); }
                        if (ModList.get().isLoaded("ad_astra") && (ModList.get().isLoaded("create"))) { pOutput.accept(Armor.ICE_SHARD_CHESTPLATE.get()); }
                        if (ModList.get().isLoaded("ad_astra") && (ModList.get().isLoaded("create"))) { pOutput.accept(Armor.ICE_SHARD_LEGGINGS.get()); }
                        if (ModList.get().isLoaded("ad_astra") && (ModList.get().isLoaded("create"))) { pOutput.accept(Armor.ICE_SHARD_BOOTS.get()); }
                        if (ModList.get().isLoaded("ad_astra") && (ModList.get().isLoaded("create"))) { pOutput.accept(Tools.ICE_SHARD_AXE.get()); }
                        if (ModList.get().isLoaded("ad_astra") && (ModList.get().isLoaded("create"))) { pOutput.accept(Tools.ICE_SHARD_SWORD.get()); }
                        if (ModList.get().isLoaded("ad_astra") && (ModList.get().isLoaded("create"))) { pOutput.accept(Tools.ICE_SHARD_PICKAXE.get()); }
                        if (ModList.get().isLoaded("ad_astra") && (ModList.get().isLoaded("create"))) { pOutput.accept(Tools.ICE_SHARD_SHOVEL.get()); }
                        if (ModList.get().isLoaded("ad_astra") && (ModList.get().isLoaded("create"))) { pOutput.accept(Tools.ICE_SHARD_HOE.get()); }


                        if (ModList.get().isLoaded("ad_astra")) { pOutput.accept(ModItems.REINFORCED_ROCKET_FIN.get()); }
                        if (ModList.get().isLoaded("cataclysm") && ModList.get().isLoaded("create")) { pOutput.accept(ModItems.IGNITIUM_SHEET.get()); }
                        if (ModList.get().isLoaded("cataclysm") && ModList.get().isLoaded("create") && ModList.get().isLoaded("ad_astra")) { pOutput.accept(ModItems.REINFORCED_OSTRUM_PLATE.get()); }
                        if (ModList.get().isLoaded("cataclysm") && ModList.get().isLoaded("create")) { pOutput.accept(ModItems.ENDER_PLATING.get()); }
                        if (ModList.get().isLoaded("cataclysm") && ModList.get().isLoaded("create") && ModList.get().isLoaded("ad_astra")) { pOutput.accept(ModItems.IGNITIUM_ENGINE.get()); }
                        if (ModList.get().isLoaded("cataclysm")) { pOutput.accept(ModItems.HEART_OF_THE_MONSTROSITY.get()); }

                        if (ModList.get().isLoaded("cataclysm") && ModList.get().isLoaded("create") && ModList.get().isLoaded("ad_astra")) { pOutput.accept(ModItems.REINFORCED_ROCKET_NOSE_CONE.get()); }










                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register((eventBus));
    }
}