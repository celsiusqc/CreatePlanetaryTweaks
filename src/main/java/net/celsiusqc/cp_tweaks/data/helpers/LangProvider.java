package net.celsiusqc.cp_tweaks.data.helpers;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public abstract class LangProvider extends LanguageProvider {
    public LangProvider(PackOutput output) {
        super(output, CreatePlanetaryTweaks.MOD_ID, "en_us");
    }


    public void addEntityAndEgg(RegistryObject<? extends EntityType<?>> entity, String name) {
        this.addEntityType(entity, name);
        this.add("item.cp_tweaks." + entity.getId().getPath() + "_spawn_egg", name + " Spawn Egg");
    }

}
