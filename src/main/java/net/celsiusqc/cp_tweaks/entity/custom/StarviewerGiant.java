package net.celsiusqc.cp_tweaks.entity.custom;

import net.celsiusqc.cp_tweaks.item.Armor;
import net.celsiusqc.cp_tweaks.item.Tools;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import twilightforest.entity.monster.GiantMiner;

public class StarviewerGiant extends GiantMiner {

    public StarviewerGiant(EntityType<? extends StarviewerGiant> type, Level world) {
        super(type, world);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));


        //this.goalSelector.addGoal(1, new RunAroundLikeCrazyGoal(this,5));
        //this.goalSelector.addGoal(1, new LeapAtTargetGoal(player,this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return GiantMiner.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 200)
                .add(Attributes.MOVEMENT_SPEED, 0.5)
                .add(Attributes.ATTACK_KNOCKBACK, 3.0f);
    }





    @Override
    protected void populateDefaultEquipmentSlots(RandomSource random, DifficultyInstance difficulty) {
        super.populateDefaultEquipmentSlots(random, difficulty);
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Tools.GIANT_ICE_SHARD_SWORD.get()));
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Armor.ICE_SHARD_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Armor.ICE_SHARD_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Armor.ICE_SHARD_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Armor.ICE_SHARD_BOOTS.get()));
    }


}
