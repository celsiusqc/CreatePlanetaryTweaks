package net.celsiusqc.cp_tweaks.entity.custom;

import net.celsiusqc.cp_tweaks.item.Armor;
import net.celsiusqc.cp_tweaks.item.ModItems;
import net.celsiusqc.cp_tweaks.item.Tools;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.BossEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import twilightforest.entity.monster.ArmoredGiant;


public class StarviewerGiant extends ArmoredGiant {
    //Boss Bar Implementation
    private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(this.getDisplayName(), BossEvent.BossBarColor.BLUE, BossEvent.BossBarOverlay.PROGRESS));


    public StarviewerGiant(EntityType<? extends StarviewerGiant> type, Level world) {
        super(type, world);
    }

    @Override
    //Default Goals copied from TF
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, false) {
            @Override
            protected double getAttackReachSqr(LivingEntity attackTarget) {
                return this.mob.getBbWidth() * this.mob.getBbHeight();
            }

            @Override
            protected void checkAndPerformAttack(LivingEntity pEnemy, double pDistToEnemySqr) {
                double eyeHeightDistToEnemySqr = this.mob.distanceToSqr(pEnemy.getX(), pEnemy.getY() - this.mob.getEyeHeight() + pEnemy.getEyeHeight(), pEnemy.getZ());
                super.checkAndPerformAttack(pEnemy, Math.min(pDistToEnemySqr, eyeHeightDistToEnemySqr * 0.8D));
            }
        });
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));

        //Custom Goal
        this.goalSelector.addGoal(3, new CustomLeapAtTargetGoal(this, 0.6F)); // Change 0.4F to your desired leap force
        this.targetSelector.addGoal(3, new PanicGoal(this, 4.0F));
    }


    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 120.0D) // Example: Increased max health
                .add(Attributes.MOVEMENT_SPEED, 0.35D) // Example: Increased movement speed
                .add(Attributes.ATTACK_DAMAGE, 10.0D) // Example: Increased attack damage
                .add(Attributes.FOLLOW_RANGE, 50.0D); // Example: Increased follow range
    }


    @Override
    protected void populateDefaultEquipmentSlots(RandomSource random, DifficultyInstance difficulty) {
        super.populateDefaultEquipmentSlots(random, difficulty);
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Tools.GIANT_ICE_SHARD_AXE.get()));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(ModItems.GIANT_WEIRD_SATELLITE.get()));
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Armor.ICE_SHARD_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Armor.ICE_SHARD_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Armor.ICE_SHARD_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Armor.ICE_SHARD_BOOTS.get()));
    }


    //Boss Bar Implementation
    @Override
    public void startSeenByPlayer(ServerPlayer player) {
        super.startSeenByPlayer(player);
        this.bossEvent.addPlayer(player);
    }

    @Override
    public void stopSeenByPlayer(ServerPlayer player) {
        super.stopSeenByPlayer(player);
        this.bossEvent.removePlayer(player);
    }

    @Override
    public void baseTick() {
        super.baseTick();
        this.bossEvent.setProgress(this.getHealth() / this.getMaxHealth());
    }

    @Override
    public void die(DamageSource cause) {
        super.die(cause);
        this.bossEvent.removeAllPlayers();
    }



}
