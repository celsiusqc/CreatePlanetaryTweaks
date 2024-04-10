package net.celsiusqc.cp_tweaks.base.armors;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class VoidWormedArmorItem extends ArmorItem {

    public VoidWormedArmorItem(ArmorMaterial material, Type type, Item.Properties properties) {
        super(material, type, properties);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String layer) {
        if (slot == EquipmentSlot.LEGS) {
            return CreatePlanetaryTweaks.ARMOR_DIR + "void_wormed_layer_2.png";
        } else {
            return CreatePlanetaryTweaks.ARMOR_DIR + "void_wormed_layer_1.png";
        }
    }

}
