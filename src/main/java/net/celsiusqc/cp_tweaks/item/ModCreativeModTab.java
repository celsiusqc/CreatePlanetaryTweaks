package net.celsiusqc.cp_tweaks.item;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.base.block.ModBlocks;
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

                        // Always accept this item
                        pOutput.accept(ModItems.CREATE_PLANETARY_TWEAKS_LOGO.get());

// Accept items if 'disabled' mod is loaded
                        if (ModList.get().isLoaded("disabled")) {
                            pOutput.accept(ModBlocks.CREATE_PLANETARY_TWEAKS_LOGO_BLOCK.get());
                        }

// Accept items if 'create' and 'ad_astra' mods are loaded
                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("ad_astra")) {
                            pOutput.accept(ModItems.UNSTABLE_ICE_SHARD.get());

                            // Accept steel ingot if additionally 'ad_astra' mod is not loaded
                            if (ModList.get().isLoaded("alexsmobs") && ModList.get().isLoaded("cataclysm")) {
                                pOutput.accept(ModItems.STABILIZED_FROZEN_GU.get());
                                pOutput.accept(ModItems.STABILIZED_ICE_SHEET.get());
                                pOutput.accept(ModItems.GLACIAN_ENGINE_FAN.get());
                                pOutput.accept(ModItems.GLACIAN_ENGINE_FRAME.get());
                                pOutput.accept(ModItems.FTL_GLACIAN_ENGINE.get());

                                if (ModList.get().isLoaded("twilightforest")) {
                                    pOutput.accept(ModItems.WEIRD_SATELLITE.get());
                                    pOutput.accept(ModItems.GIANT_WEIRD_SATELLITE.get());
                                }


                            }

                        }

                        if (ModList.get().isLoaded("blue_skies")) {
                            pOutput.accept(ModItems.ARACHNARCH_VENOM_BOTTLE.get());
                            pOutput.accept(ModItems.ARACHNARCH_VENOM_BUCKET.get());
                            pOutput.accept(ModItems.STARLIT_TREE_BARK.get());
                        }


// Accept items if 'create' and 'alexsmobs' mods are loaded
                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {
                            pOutput.accept(ModItems.VOID_WORM_GU.get());
                        }

// Accept items if 'cataclysm' and 'create' mods are loaded
                        if (ModList.get().isLoaded("cataclysm") && ModList.get().isLoaded("create")) {
                            pOutput.accept(ModItems.ENDER_GUARDIAN_GU.get());
                            pOutput.accept(ModItems.MONSTROSITY_GU.get());
                        }


                        if (ModList.get().isLoaded("sereneseasons")) {
                            pOutput.accept(ModItems.AUTUMN.get());
                            pOutput.accept(ModItems.WINTER.get());
                            pOutput.accept(ModItems.SPRING.get());
                            pOutput.accept(ModItems.SUMMER.get());
                            pOutput.accept(ModItems.DRY.get());
                            pOutput.accept(ModItems.WET.get());
                        }

                        if (ModList.get().isLoaded("ad_astra") && ModList.get().isLoaded("disabled")) {
                            pOutput.accept(Tools.DESH_TIPPED_STONE_AXE.get());
                            pOutput.accept(Tools.DESH_TIPPED_STONE_SWORD.get());
                            pOutput.accept(Tools.DESH_TIPPED_STONE_PICKAXE.get());
                            pOutput.accept(Tools.DESH_TIPPED_STONE_SHOVEL.get());
                            pOutput.accept(Tools.DESH_TIPPED_STONE_HOE.get());
                        }


                        if (!ModList.get().isLoaded("create_sa")) {
                            pOutput.accept(Tools.COPPER_AXE.get());
                            pOutput.accept(Tools.COPPER_SWORD.get());
                            pOutput.accept(Tools.COPPER_PICKAXE.get());
                            pOutput.accept(Tools.COPPER_SHOVEL.get());
                            pOutput.accept(Tools.COPPER_HOE.get());
                        }


                        if (ModList.get().isLoaded("create") && !ModList.get().isLoaded("create_sa")) {
                            // Zinc tools
                            pOutput.accept(ZincTools.ZINC_AXE.get());
                            pOutput.accept(ZincTools.ZINC_SWORD.get());
                            pOutput.accept(ZincTools.ZINC_PICKAXE.get());
                            pOutput.accept(ZincTools.ZINC_SHOVEL.get());
                            pOutput.accept(ZincTools.ZINC_HOE.get());

                            // Brass tools
                            pOutput.accept(Tools.BRASS_AXE.get());
                            pOutput.accept(Tools.BRASS_SWORD.get());
                            pOutput.accept(Tools.BRASS_PICKAXE.get());
                            pOutput.accept(Tools.BRASS_SHOVEL.get());
                            pOutput.accept(Tools.BRASS_HOE.get());
                        }


                        if (!ModList.get().isLoaded("alloyed")) {
                            // Accept steel tools only if the 'alloyed' mod is not loaded
                            pOutput.accept(Tools.STEEL_AXE.get());
                            pOutput.accept(Tools.STEEL_SWORD.get());
                            pOutput.accept(Tools.STEEL_PICKAXE.get());
                            pOutput.accept(Tools.STEEL_SHOVEL.get());
                            pOutput.accept(Tools.STEEL_HOE.get());

                            // Accept steel ingot if additionally 'ad_astra' mod is not loaded
                            if (!ModList.get().isLoaded("ad_astra")) {
                                pOutput.accept(ModItems.STEEL_INGOT.get());
                            }
                        }

                        if (ModList.get().isLoaded("create") && ModList.get().isLoaded("alexsmobs")) {
                            pOutput.accept(Tools.VOID_WORM_AXE.get());
                            pOutput.accept(Tools.VOID_WORM_SWORD.get());
                            pOutput.accept(Tools.VOID_WORM_PICKAXE.get());
                            pOutput.accept(Tools.VOID_WORM_SHOVEL.get());
                            pOutput.accept(Tools.VOID_WORM_HOE.get());
                            pOutput.accept(Armor.VOID_WORMED_HELMET.get());
                            pOutput.accept(Armor.VOID_WORMED_CHESTPLATE.get());
                            pOutput.accept(Armor.VOID_WORMED_LEGGINGS.get());
                            pOutput.accept(Armor.VOID_WORMED_BOOTS.get());
                        }

                        if (ModList.get().isLoaded("ad_astra")) {
                            // Desh items
                            pOutput.accept(Tools.DESH_AXE.get());
                            pOutput.accept(Tools.DESH_SWORD.get());
                            pOutput.accept(Tools.DESH_PICKAXE.get());
                            pOutput.accept(Tools.DESH_SHOVEL.get());
                            pOutput.accept(Tools.DESH_HOE.get());
                            pOutput.accept(Armor.DESH_HELMET.get());
                            pOutput.accept(Armor.DESH_CHESTPLATE.get());
                            pOutput.accept(Armor.DESH_LEGGINGS.get());
                            pOutput.accept(Armor.DESH_BOOTS.get());

                            // Calorite items
                            pOutput.accept(Tools.CALORITE_AXE.get());
                            pOutput.accept(Tools.CALORITE_SWORD.get());
                            pOutput.accept(Tools.CALORITE_PICKAXE.get());
                            pOutput.accept(Tools.CALORITE_SHOVEL.get());
                            pOutput.accept(Tools.CALORITE_HOE.get());
                            pOutput.accept(Armor.CALORITE_HELMET.get());
                            pOutput.accept(Armor.CALORITE_CHESTPLATE.get());
                            pOutput.accept(Armor.CALORITE_LEGGINGS.get());
                            pOutput.accept(Armor.CALORITE_BOOTS.get());

                            // Ostrum items
                            pOutput.accept(Tools.OSTRUM_AXE.get());
                            pOutput.accept(Tools.OSTRUM_SWORD.get());
                            pOutput.accept(Tools.OSTRUM_PICKAXE.get());
                            pOutput.accept(Tools.OSTRUM_SHOVEL.get());
                            pOutput.accept(Tools.OSTRUM_HOE.get());
                            pOutput.accept(Armor.OSTRUM_HELMET.get());
                            pOutput.accept(Armor.OSTRUM_CHESTPLATE.get());
                            pOutput.accept(Armor.OSTRUM_LEGGINGS.get());
                            pOutput.accept(Armor.OSTRUM_BOOTS.get());
                        }


                        if (ModList.get().isLoaded("ad_astra") && ModList.get().isLoaded("create")) {
                            // Armor items
                            pOutput.accept(Armor.ICE_SHARD_HELMET.get());
                            pOutput.accept(Armor.ICE_SHARD_CHESTPLATE.get());
                            pOutput.accept(Armor.ICE_SHARD_LEGGINGS.get());
                            pOutput.accept(Armor.ICE_SHARD_BOOTS.get());

                            // Tools items
                            pOutput.accept(Tools.ICE_SHARD_AXE.get());
                            pOutput.accept(Tools.ICE_SHARD_SWORD.get());
                            pOutput.accept(Tools.ICE_SHARD_PICKAXE.get());
                            pOutput.accept(Tools.ICE_SHARD_SHOVEL.get());
                            pOutput.accept(Tools.ICE_SHARD_HOE.get());

                            if (ModList.get().isLoaded("twilightforest")) {
                                pOutput.accept(Tools.GIANT_ICE_SHARD_SWORD.get());
                                pOutput.accept(Tools.GIANT_ICE_SHARD_AXE.get());
                            }

                        }

                        // Accept items if 'ad_astra' mod is loaded
                        if (ModList.get().isLoaded("ad_astra")) {
                            pOutput.accept(ModItems.REINFORCED_ROCKET_FIN.get());
                        }

// Accept items if both 'cataclysm' and 'create' mods are loaded
                        if (ModList.get().isLoaded("cataclysm") && ModList.get().isLoaded("create")) {
                            pOutput.accept(ModItems.STURDY_DESH_SHEET.get());
                            pOutput.accept(ModItems.IGNITIUM_SHEET.get());

                            // Further accept items if additionally 'ad_astra' mod is loaded
                            if (ModList.get().isLoaded("ad_astra")) {
                                pOutput.accept(ModItems.STURDY_OSTRUM_SHEET.get());
                                pOutput.accept(ModItems.IGNITIUM_ENGINE.get());
                                pOutput.accept(ModItems.REINFORCED_ROCKET_NOSE_CONE.get());
                            }
                        }














                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register((eventBus));
    }
}