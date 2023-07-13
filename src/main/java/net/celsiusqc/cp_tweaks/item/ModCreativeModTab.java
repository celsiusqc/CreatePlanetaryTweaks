package net.celsiusqc.cp_tweaks.item;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreatePlanetaryTweaks.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CP_TWEAKS_TAB = CREATIVE_MODE_TABS.register("cp_tweaks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VOID_WORM_GU.get()))
                    .title(Component.translatable("creativetab.cp_tweaks_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.UNSTABLE_ICE_SHARD.get());

                        pOutput.accept(ModItems.AUTUMN.get());
                        pOutput.accept(ModItems.WINTER.get());
                        pOutput.accept(ModItems.SPRING.get());
                        pOutput.accept(ModItems.SUMMER.get());
                        pOutput.accept(ModItems.DRY.get());
                        pOutput.accept(ModItems.WET.get());

                        pOutput.accept(ModItems.COPPER_AXE.get());
                        pOutput.accept(ModItems.COPPER_SWORD.get());
                        pOutput.accept(ModItems.COPPER_PICKAXE.get());
                        pOutput.accept(ModItems.COPPER_SHOVEL.get());
                        pOutput.accept(ModItems.COPPER_HOE.get());

                        pOutput.accept(ModItems.ZINC_AXE.get());
                        pOutput.accept(ModItems.ZINC_SWORD.get());
                        pOutput.accept(ModItems.ZINC_PICKAXE.get());
                        pOutput.accept(ModItems.ZINC_SHOVEL.get());
                        pOutput.accept(ModItems.ZINC_HOE.get());

                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.STEEL_AXE.get());
                        pOutput.accept(ModItems.STEEL_SWORD.get());
                        pOutput.accept(ModItems.STEEL_PICKAXE.get());
                        pOutput.accept(ModItems.STEEL_SHOVEL.get());
                        pOutput.accept(ModItems.STEEL_HOE.get());

                        pOutput.accept(ModItems.BRASS_AXE.get());
                        pOutput.accept(ModItems.BRASS_SWORD.get());
                        pOutput.accept(ModItems.BRASS_PICKAXE.get());
                        pOutput.accept(ModItems.BRASS_SHOVEL.get());
                        pOutput.accept(ModItems.BRASS_HOE.get());

                        pOutput.accept(ModItems.VOID_WORM_GU.get());
                        pOutput.accept(ModItems.VOID_WORM_AXE.get());
                        pOutput.accept(ModItems.VOID_WORM_SWORD.get());
                        pOutput.accept(ModItems.VOID_WORM_PICKAXE.get());
                        pOutput.accept(ModItems.VOID_WORM_SHOVEL.get());
                        pOutput.accept(ModItems.VOID_WORM_HOE.get());
                        pOutput.accept(ModItems.VOID_WORMED_HELMET.get());
                        pOutput.accept(ModItems.VOID_WORMED_CHESTPLATE.get());
                        pOutput.accept(ModItems.VOID_WORMED_LEGGINGS.get());
                        pOutput.accept(ModItems.VOID_WORMED_BOOTS.get());


                        pOutput.accept(ModItems.DESH_AXE.get());
                        pOutput.accept(ModItems.DESH_SWORD.get());
                        pOutput.accept(ModItems.DESH_PICKAXE.get());
                        pOutput.accept(ModItems.DESH_SHOVEL.get());
                        pOutput.accept(ModItems.DESH_HOE.get());

                        pOutput.accept(ModItems.CALORITE_AXE.get());
                        pOutput.accept(ModItems.CALORITE_SWORD.get());
                        pOutput.accept(ModItems.CALORITE_PICKAXE.get());
                        pOutput.accept(ModItems.CALORITE_SHOVEL.get());
                        pOutput.accept(ModItems.CALORITE_HOE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register((eventBus));
    }
}