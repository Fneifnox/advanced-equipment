package net.fneifnox.advancedequipment.item;

import net.fneifnox.advancedequipment.AdvancedEquipment;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> ADVANCED_IRON_ARMOR_MATERIAL = registerArmorMaterial("advanced_iron_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 7);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 5);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.IRON_BLOCK),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedEquipment.MOD_ID, "advanced_iron_armor"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> ADVANCED_GOLDEN_ARMOR_MATERIAL = registerArmorMaterial("advanced_golden_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 7);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, () -> Ingredient.ofItems(Items.GOLD_BLOCK),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedEquipment.MOD_ID, "advanced_golden_armor"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> ADVANCED_DIAMOND_ARMOR_MATERIAL = registerArmorMaterial("advanced_diamond_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 11);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(Items.DIAMOND_BLOCK),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedEquipment.MOD_ID, "advanced_diamond_armor"))), 2, 0));

    public static final RegistryEntry<ArmorMaterial> ADVANCED_NETHERITE_ARMOR_MATERIAL = registerArmorMaterial("advanced_netherite_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 11);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(Items.NETHERITE_BLOCK),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AdvancedEquipment.MOD_ID, "advanced_netherite_armor"))), 3, 0.1f));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(AdvancedEquipment.MOD_ID, name), material.get());
    }
}
