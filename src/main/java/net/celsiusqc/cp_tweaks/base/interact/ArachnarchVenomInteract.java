package net.celsiusqc.cp_tweaks.interact;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.celsiusqc.cp_tweaks.item.ModItems;
// Import the class where the Arachnarch entity type is stored
import com.legacy.blue_skies.entities.hostile.boss.ArachnarchEntity;
import net.minecraft.world.entity.EntityType;
import java.util.Random; // Make sure this import is added
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.resources.ResourceLocation;






@Mod.EventBusSubscriber(modid = "cp_tweaks")
public class ArachnarchVenomInteract {

    private static final Random RANDOM = new Random();

    @SubscribeEvent
    public static void onEntityRightClick(PlayerInteractEvent.EntityInteract event) {
        Level world = event.getLevel();
        var player = event.getEntity();
        Entity targetEntity = event.getTarget();

        // Check if the EntityType for arachnarch is registered in the EntityType registry
        EntityType<?> arachnarchEntityType = ForgeRegistries.ENTITY_TYPES.getValue(new ResourceLocation("blue_skies:arachnarch"));

        // If arachnarchEntityType is null, the Blue Skies mod is not loaded or the entity is not registered.
        if (arachnarchEntityType != null && targetEntity.getType().equals(arachnarchEntityType)) {
            ItemStack heldItem = event.getItemStack();


            if (heldItem.getItem() == Items.GLASS_BOTTLE) {
                event.setCanceled(true);

                if (!world.isClientSide) {
                    boolean gotVenomBottle = RANDOM.nextFloat() < 0.33;

                    // Only shrink the item stack if the player is not in Creative mode
                    if (!player.isCreative()) {
                        heldItem.shrink(1);
                    }

                    if (gotVenomBottle) {
                        // 25% chance was successful, give the item
                        ItemStack venomBottle = new ItemStack(ModItems.ARACHNARCH_VENOM_BOTTLE.get());
                        if (!player.getInventory().add(venomBottle)) {
                            player.drop(venomBottle, false);
                        }
                        world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL, SoundSource.PLAYERS, 1.0F, 1.0F);
                    } else {
                        // 25% chance was not successful, apply poison effect and damage
                        player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 0)); // Blindness
                        player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 0)); // Nausea
                        player.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 0)); // Harm Effect
                        world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.PLAYER_HURT, SoundSource.PLAYERS, 1.0F, 1.0F);
                    }

                    // This will consume the interaction result to indicate the event has been handled
                    event.setCancellationResult(InteractionResult.CONSUME);
                }


            }
        }
    }
}
