package net.celsiusqc.cp_tweaks.item.Tooltips;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UnstableIceShard extends Item {
    public UnstableIceShard(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> components, @NotNull TooltipFlag flag) {
        /*if (Screen.hasShiftDown()) {
            components.add(Component.literal("This is a test message.").withStyle(ChatFormatting.DARK_BLUE));
        }   else {
            components.add(Component.literal("Press SHIFT for more information.").withStyle(ChatFormatting.YELLOW));
        }*/
        components.add(Component.literal("This item can be obtained by Killing The Harbinger from the Cataclysm mod.").withStyle(ChatFormatting.YELLOW));

        super.appendHoverText(stack, level, components, flag);
    }

}
