package net.celsiusqc.cp_tweaks.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

public class CreatePlanetaryTweaksConfig {
    public static ForgeConfigSpec.BooleanValue enableStarlitGiant;
    public static final ForgeConfigSpec CONFIG;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        enableStarlitGiant = builder
                .comment("Should Custom Twilight Forest Entity be Enabled (Uses special entity rendering from Twilight Forest, entity name is Starlit Giant)?")
                .define("items.enableStarlitGiant", false);

        CONFIG = builder.build();
    }

    public static void loadConfig(ForgeConfigSpec config, String path) {
        final CommentedFileConfig file = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();

        file.load();
        config.setConfig(file);
    }

    public static boolean isStarlitGiantEnabled() {
        return enableStarlitGiant.get();
    }
}
