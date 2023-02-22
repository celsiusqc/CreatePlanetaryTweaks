package net.celsiusqc.cd_addon.base;

import net.celsiusqc.cd_addon.CreateDimensionsAddon;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public record ModArmorMaterial(String name, int durability, int[] protection, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) implements ArmorMaterial {
    private static final int[] DURABILITY_PER_SLOT = new int[] {13, 15, 16, 11};

    public int getDurabilityForSlot(EquipmentSlot slot) {
        return this.durability;
    }


    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.protection[slot.getIndex()];
    }


    public int getEnchantmentValue() {
        return this.enchantability;
    }


    public SoundEvent getEquipSound() {
        return this.equipSound;
    }


    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }


    public String getName() {
        return CreateDimensionsAddon.MOD_ID + ":" + this.name;
    }


    public float getToughness() {
        return this.toughness;
    }


    public float getKnockbackResistance() {
        return this.knockbackResistance();
    }
}
