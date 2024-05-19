package net.trique.mythicupgrades.util;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class ClientFunctions {

    public static void handleTooltipForArmor(ItemStack stack, List<Component> tooltips, MutableComponent successTooltip, ChatFormatting color, ArmorMaterial material) {
        LocalPlayer player = getLocalPlayer();
        if (player != null) {
            MutableComponent defaultArmorTooltip = Component.translatable("defaultArmorTooltip.description").withStyle(ChatFormatting.GRAY).
                    withStyle(ChatFormatting.ITALIC);
            ArrayList<ItemStack> toCheck = new ArrayList<>();
            player.getArmorSlots().forEach(toCheck::add);
            if (CommonFunctions.hasCorrectArmorOn(player, material) && toCheck.contains(stack)) {
                tooltips.add(successTooltip.withStyle(color));
            } else {
                tooltips.add(defaultArmorTooltip);
            }
        }
    }
    public static LocalPlayer getLocalPlayer() {
        return Minecraft.getInstance().player;
    }
}