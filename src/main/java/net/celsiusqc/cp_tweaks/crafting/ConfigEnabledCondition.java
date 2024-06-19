package net.celsiusqc.cp_tweaks.crafting;

import com.google.gson.JsonObject;
import net.celsiusqc.cp_tweaks.config.CreatePlanetaryTweaksConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class ConfigEnabledCondition implements ICondition {
    private final ResourceLocation location;
    private final String configName;

    public ConfigEnabledCondition(ResourceLocation location, String configName) {
        this.location = location;
        this.configName = configName;
    }

    @Override
    public ResourceLocation getID() {
        return location;
    }

    @Override
    public boolean test(IContext context) {
        if (this.configName.equals("enableStarlitGiant")) {
            return CreatePlanetaryTweaksConfig.isStarlitGiantEnabled();
        }
        return true; // Default to true if config name does not match
    }

    public static class Serializer implements IConditionSerializer<ConfigEnabledCondition> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void write(JsonObject json, ConfigEnabledCondition value) {
            json.addProperty("config", value.configName);
        }

        @Override
        public ConfigEnabledCondition read(JsonObject json) {
            return new ConfigEnabledCondition(new ResourceLocation("cp_tweaks", "config"), json.getAsJsonPrimitive("config").getAsString());
        }

        @Override
        public ResourceLocation getID() {
            return new ResourceLocation("cp_tweaks", "config");
        }
    }
}
