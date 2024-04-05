package net.celsiusqc.cp_tweaks.fluid;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.base.block.ModBlocks;
import net.celsiusqc.cp_tweaks.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreatePlanetaryTweaks.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_ARACHNARCH_VENOM = FLUIDS.register("arachnarch_venom",
            () -> new ForgeFlowingFluid.Source(ModFluids.ARACHNARCH_VENOM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ARACHNARCH_VENOM = FLUIDS.register("flowing_arachnarch_venom",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ARACHNARCH_VENOM_PROPERTIES));

    public static final ForgeFlowingFluid.Properties ARACHNARCH_VENOM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.ARACHNARCH_VENOM_TYPE, SOURCE_ARACHNARCH_VENOM, FLOWING_ARACHNARCH_VENOM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.ARACHNARCH_VENOM_BLOCK)
            .bucket(ModItems.ARACHNARCH_VENOM_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}
