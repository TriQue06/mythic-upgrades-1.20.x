package net.trique.mythicupgrades.item.materials;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.crafting.Ingredient;
import net.trique.mythicupgrades.MythicUpgrades;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static net.trique.mythicupgrades.item.MUItems.*;

public class MUArmorMaterials {
    public static final Holder<ArmorMaterial> AQUAMARINE;
    public static final Holder<ArmorMaterial> PERIDOT;
    public static final Holder<ArmorMaterial> SAPPHIRE;
    public static final Holder<ArmorMaterial> TOPAZ;
    public static final Holder<ArmorMaterial> RUBY;
    public static final Holder<ArmorMaterial> AMETRINE;
    public static final Holder<ArmorMaterial> JADE;

    private static Holder<ArmorMaterial> registerMaterial(String id, Map<Type, Integer> defensePoints, Holder<SoundEvent> equipSound, int enchantability, Supplier<Ingredient> repairIngredientSupplier, float toughness, float knockbackResistance, boolean dyeable) {
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MythicUpgrades.MOD_ID, id), "", dyeable)
        );

        ArmorMaterial material = new ArmorMaterial(defensePoints, enchantability, equipSound, repairIngredientSupplier, layers, toughness, knockbackResistance);
        material = Registry.register(BuiltInRegistries.ARMOR_MATERIAL, ResourceLocation.fromNamespaceAndPath(MythicUpgrades.MOD_ID, id), material);
        return Holder.direct(material);
    }

    static {
        AQUAMARINE = registerMaterial("aquamarine", Map.of(
                        Type.HELMET, 3,
                        Type.CHESTPLATE, 8,
                        Type.LEGGINGS, 6,
                        Type.BOOTS, 3
                ), SoundEvents.ARMOR_EQUIP_NETHERITE, 18,
                () -> Ingredient.of(AQUAMARINE_INGOT), 3.0F, 0.1F, false);
        PERIDOT = registerMaterial("peridot", Map.of(
                        Type.HELMET, 3,
                        Type.CHESTPLATE, 8,
                        Type.LEGGINGS, 6,
                        Type.BOOTS, 3
                ), SoundEvents.ARMOR_EQUIP_NETHERITE, 18,
                () -> Ingredient.of(PERIDOT_INGOT), 3.0F, 0.1F, false);
        SAPPHIRE = registerMaterial("sapphire",  Map.of(
                        Type.HELMET, 3,
                        Type.CHESTPLATE, 8,
                        Type.LEGGINGS, 6,
                        Type.BOOTS, 3
                ), SoundEvents.ARMOR_EQUIP_NETHERITE, 18,
                () -> Ingredient.of(SAPPHIRE_INGOT), 3.0F, 0.1F, false);
        TOPAZ = registerMaterial("topaz", Map.of(
                        Type.HELMET, 4,
                        Type.CHESTPLATE, 9,
                        Type.LEGGINGS, 7,
                        Type.BOOTS, 4
                ), SoundEvents.ARMOR_EQUIP_NETHERITE,
                 18, () -> Ingredient.of(TOPAZ_INGOT), 3.0F, 0.1F, false);
        RUBY = registerMaterial("ruby", Map.of(
                        Type.HELMET, 3,
                        Type.CHESTPLATE, 8,
                        Type.LEGGINGS, 6,
                        Type.BOOTS, 3
                ), SoundEvents.ARMOR_EQUIP_NETHERITE,
                 18, () -> Ingredient.of(RUBY_INGOT), 3.0F, 0.1F, false);
        AMETRINE = registerMaterial("ametrine", Map.of(
                        Type.HELMET, 3,
                        Type.CHESTPLATE, 8,
                        Type.LEGGINGS, 6,
                        Type.BOOTS, 3
                ), SoundEvents.ARMOR_EQUIP_NETHERITE,
                18, () -> Ingredient.of(AMETRINE_INGOT), 3.0F, 0.1F, false);
        JADE = registerMaterial("jade", Map.of(
                        Type.HELMET, 3,
                        Type.CHESTPLATE, 8,
                        Type.LEGGINGS, 6,
                        Type.BOOTS, 3
                ), SoundEvents.ARMOR_EQUIP_NETHERITE,
                18, () -> Ingredient.of(JADE_INGOT), 3.0F, 0.1F, false);

    }
}