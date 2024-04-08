package net.celsiusqc.cp_tweaks.base.interact;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.celsiusqc.cp_tweaks.item.ModItems;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;

@Mod.EventBusSubscriber(modid = "cp_tweaks")
public class StarlitTreeBarkInteract {

    private static final Random RANDOM = new Random();

    @SubscribeEvent
    public static void onEntityRightClick(PlayerInteractEvent.EntityInteract event) {
        Level world = event.getLevel();
        Player player = event.getEntity();
        Entity targetEntity = event.getTarget();

        EntityType<?> starlit_crusherEntityType = ForgeRegistries.ENTITY_TYPES.getValue(new ResourceLocation("blue_skies:starlit_crusher"));

        if (starlit_crusherEntityType != null && targetEntity.getType().equals(starlit_crusherEntityType)) {
            ItemStack heldItem = event.getItemStack();

            // Check if the item is an axe
            if (heldItem.getItem() instanceof AxeItem && !world.isClientSide) {
                // Check if the axe is specifically the cp_tweaks:ice_shard_axe
                if (heldItem.is(ForgeRegistries.ITEMS.getValue(new ResourceLocation("cp_tweaks:ice_shard_axe")))) {

                    int currentDurability = heldItem.getDamageValue();
                    int damageToApply = RANDOM.nextInt(201) + 300; // Random number between 300 and 500

                    if (currentDurability + damageToApply > heldItem.getMaxDamage()) {
                        if (player instanceof ServerPlayer) {
                            player.displayClientMessage(Component.translatable("message.too_flimsy").withStyle(ChatFormatting.DARK_AQUA), true);
                        }
                        return; // Exit early
                    }


                    heldItem.hurt(damageToApply, RandomSource.create(), (ServerPlayer) player); // Apply the damage
                    int quantity = 1 + RANDOM.nextInt(3); // Randomly give 1-3 starlit tree bark
                    player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 0)); // Nausea
                    ItemStack barkStack = new ItemStack(ModItems.STARLIT_TREE_BARK.get(), quantity);
                    world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.AXE_STRIP, SoundSource.PLAYERS, 1.0F, 1.0F);

                    if (!player.getInventory().add(barkStack)) {
                        player.drop(barkStack, false); // Drop the item in the world if the inventory is full
                    }
                } else {
                    // If it's an axe, but not the cp_tweaks:ice_shard_axe, send the message
                    if (player instanceof ServerPlayer) {
                        player.displayClientMessage(Component.translatable("message.incorrect_axe").withStyle(ChatFormatting.DARK_AQUA), true);
                    }
                }
            } else if (heldItem.getItem() instanceof PickaxeItem ||
                    heldItem.getItem() instanceof ShovelItem ||
                    heldItem.getItem() instanceof HoeItem ||
                    heldItem.getItem() instanceof SwordItem) {
                // If the player is holding a hoe, pickaxe, shovel, or sword
                if (player instanceof ServerPlayer) {
                    player.displayClientMessage(Component.translatable("message.unsuitable_tool").withStyle(ChatFormatting.RED), true);
                }
                }
            }
        }
    }
