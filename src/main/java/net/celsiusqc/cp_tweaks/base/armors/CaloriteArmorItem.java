package net.celsiusqc.cp_tweaks.base.armors;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class CaloriteArmorItem extends ArmorItem{

    public CaloriteArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String layer) {
        if (slot == EquipmentSlot.LEGS) {
            return CreatePlanetaryTweaks.ARMOR_DIR + "calorite_layer_2.png";
        } else {
            return CreatePlanetaryTweaks.ARMOR_DIR + "calorite_layer_1.png";
        }
    }

}
