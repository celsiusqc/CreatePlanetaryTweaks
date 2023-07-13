package net.celsiusqc.cp_tweaks.base;

import net.celsiusqc.cp_tweaks.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolTiers {

        //Void Worm
        public static final Tier VOID_WORMED = new ForgeTier(
                4,
                2067,
                10,
                6,
                15,
                null,
                () -> Ingredient.of(ModItems.VOID_WORM_GU.get()));

        //Desh
        public static final Tier DESH = new ForgeTier(
                4,
                2189,
                10,
                7,
                15,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/desh"))));

        //Calorite
        public static final Tier CALORITE = new ForgeTier(
                4,
                2354,
                10,
                8,
                15,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/calorite"))));

        //Calorite
        public static final Tier OSTRUM = new ForgeTier(
                4,
                2414,
                10,
                9,
                15,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/ostrum"))));

        //Steel
        public static final Tier STEEL = new ForgeTier(
                2,
                1000,
                6,
                3,
                14,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/steel"))));

        //Brass
        public static final Tier BRASS = new ForgeTier(
                2,
                450,
                7,
                3,
                12,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/brass"))));

        //Zinc
        public static final Tier ZINC = new ForgeTier(
                2,
                250,
                7,
                2,
                14,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/zinc"))));

        //Copper
        public static final Tier COPPER = new ForgeTier(
                2,
                131,
                5,
                2,
                13,
                null,
                () -> Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/copper"))));


}
