package net.celsiusqc.cp_tweaks.base;

import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ArmorTiers implements ArmorMaterial {
    VOID_WORMED("void_wormed", 45, Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 5);
        map.put(ArmorItem.Type.LEGGINGS, 8);
        map.put(ArmorItem.Type.CHESTPLATE, 10);
        map.put(ArmorItem.Type.HELMET, 5);
    }), 17, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.2F, 0.12F, () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "gu/void_worm")))),

    DESH("desh", 51, Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 6);
        map.put(ArmorItem.Type.LEGGINGS, 9);
        map.put(ArmorItem.Type.CHESTPLATE, 11);
        map.put(ArmorItem.Type.HELMET, 6);
    }), 17, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.2F, 0.12F, () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/desh")))),

    CALORITE("calorite", 56, Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 7);
        map.put(ArmorItem.Type.LEGGINGS, 11);
        map.put(ArmorItem.Type.CHESTPLATE, 13);
        map.put(ArmorItem.Type.HELMET, 8);
    }), 17, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.2F, 0.12F, () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/calorite")))),

    OSTRUM("ostrum", 61, Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 8);
        map.put(ArmorItem.Type.LEGGINGS, 12);
        map.put(ArmorItem.Type.CHESTPLATE, 14);
        map.put(ArmorItem.Type.HELMET, 9);
    }), 17, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.4F, 0.14F, () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/ostrum")))),

    ICE_SHARD("ice_shard", 70, Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 10);
        map.put(ArmorItem.Type.LEGGINGS, 14);
        map.put(ArmorItem.Type.CHESTPLATE, 16);
        map.put(ArmorItem.Type.HELMET, 11);
    }), 17, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.2F, 0.12F, () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "shards/unstable_ice"))));           //   <---- Remove the semi-colon if you add new armor










    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockback;
    private final Supplier<Ingredient> repairMaterial;

    ArmorTiers(String name, int durability, EnumMap<ArmorItem.Type, Integer> damageReduction, int enchantability, SoundEvent sound, float toughness, float knockback, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.durabilityMultiplier = durability;
        this.protectionFunctionForType = damageReduction;
        this.enchantability = enchantability;
        this.equipSound = sound;
        this.toughness = toughness;
        this.knockback = knockback;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return HEALTH_FUNCTION_FOR_TYPE.get(type) * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionFunctionForType.get(type);
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockback;
    }
}