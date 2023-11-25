package net.trique.mythicupgrades.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import java.util.ArrayList;
import java.util.List;

public class ClientFunctions {

    public static void handleTooltipForArmor(ItemStack stack, List<Text> tooltips, MutableText successTooltip, Formatting color, ArmorMaterial material) {
        ClientPlayerEntity player = getLocalPlayer();
        if (player != null) {
            MutableText defaultArmorTooltip = Text.translatable("defaultArmorTooltip.description").formatted(Formatting.GRAY).
                    formatted(Formatting.ITALIC);
            ArrayList<ItemStack> toCheck = new ArrayList<>();
            player.getArmorItems().forEach(toCheck::add);
            if (CommonFunctions.hasCorrectArmorOn(player, material) && toCheck.contains(stack)) {
                tooltips.add(successTooltip.formatted(color));
            } else {
                tooltips.add(defaultArmorTooltip);
            }
        }
    }
    public static ClientPlayerEntity getLocalPlayer() {
        return MinecraftClient.getInstance().player;
    }
}