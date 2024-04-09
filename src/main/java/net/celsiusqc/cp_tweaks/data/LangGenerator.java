package net.celsiusqc.cp_tweaks.data;

import net.celsiusqc.cp_tweaks.entity.ModEntities;
import net.minecraft.data.PackOutput;
import twilightforest.data.helpers.TFLangProvider;

public class LangGenerator extends TFLangProvider {

    public LangGenerator(PackOutput output) {
        super(output);
    }
    @Override
    protected void addTranslations() {
        this.addEntityAndEgg(ModEntities.STARVIEWER_GIANT, "Starviewer Giant");
    }
}
