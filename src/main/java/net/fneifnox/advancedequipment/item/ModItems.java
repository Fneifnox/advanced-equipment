package net.fneifnox.advancedequipment.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fneifnox.advancedequipment.AdvancedEquipment;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item ADVANCED_WOODEN_SWORD = registerItem("advanced_wooden_sword",
            new SwordItem(ModToolMaterials.ADVANCED_WOOD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ADVANCED_WOOD, 4, -2.4f))));
    public static Item ADVANCED_STONE_SWORD = registerItem("advanced_stone_sword",
            new SwordItem(ModToolMaterials.ADVANCED_STONE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ADVANCED_STONE, 4, -2.4f))));
    public static Item ADVANCED_IRON_SWORD = registerItem("advanced_iron_sword",
            new SwordItem(ModToolMaterials.ADVANCED_IRON, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ADVANCED_IRON, 4, -2.4f))));
    public static Item ADVANCED_GOLDEN_SWORD = registerItem("advanced_golden_sword",
            new SwordItem(ModToolMaterials.ADVANCED_GOLD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ADVANCED_GOLD, 4, -2.4f))));
    public static Item ADVANCED_DIAMOND_SWORD = registerItem("advanced_diamond_sword",
            new SwordItem(ModToolMaterials.ADVANCED_DIAMOND, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ADVANCED_DIAMOND, 5, -2.4f))));
    public static Item ADVANCED_NETHERITE_SWORD = registerItem("advanced_netherite_sword",
            new SwordItem(ModToolMaterials.ADVANCED_NETHERITE, new Item.Settings()
                    .fireproof()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ADVANCED_NETHERITE, 3, -2.4f))));

    public static final Item ADVANCED_WOODEN_PICKAXE = registerItem("advanced_wooden_pickaxe",
            new PickaxeItem(ModToolMaterials.ADVANCED_WOOD, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_WOOD, 1, -2.8f))));
    public static final Item ADVANCED_STONE_PICKAXE = registerItem("advanced_stone_pickaxe",
            new PickaxeItem(ModToolMaterials.ADVANCED_STONE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_STONE, 1, -2.8f))));
    public static final Item ADVANCED_IRON_PICKAXE = registerItem("advanced_iron_pickaxe",
            new PickaxeItem(ModToolMaterials.ADVANCED_IRON, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_IRON, 1, -2.8f))));
    public static final Item ADVANCED_GOLDEN_PICKAXE = registerItem("advanced_golden_pickaxe",
            new PickaxeItem(ModToolMaterials.ADVANCED_GOLD, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_GOLD, 1, -2.8f))));
    public static final Item ADVANCED_DIAMOND_PICKAXE = registerItem("advanced_diamond_pickaxe",
            new PickaxeItem(ModToolMaterials.ADVANCED_DIAMOND, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_DIAMOND, 1, -2.8f))));
    public static final Item ADVANCED_NETHERITE_PICKAXE = registerItem("advanced_netherite_pickaxe",
            new PickaxeItem(ModToolMaterials.ADVANCED_NETHERITE, new Item.Settings()
                    .fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_NETHERITE, 1, -2.8f))));

    public static final Item ADVANCED_WOODEN_SHOVEL = registerItem("advanced_wooden_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_WOOD, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ADVANCED_WOOD, 1.5f, -3))));
    public static final Item ADVANCED_STONE_SHOVEL = registerItem("advanced_stone_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_STONE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ADVANCED_STONE, 1.5f, -3))));
    public static final Item ADVANCED_IRON_SHOVEL = registerItem("advanced_iron_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_IRON, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ADVANCED_IRON, 1.5f, -3))));
    public static final Item ADVANCED_GOLDEN_SHOVEL = registerItem("advanced_golden_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_GOLD, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ADVANCED_GOLD, 1.5f, -3))));
    public static final Item ADVANCED_DIAMOND_SHOVEL = registerItem("advanced_diamond_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_DIAMOND, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ADVANCED_DIAMOND, 1.5f, -3))));
    public static final Item ADVANCED_NETHERITE_SHOVEL = registerItem("advanced_netherite_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_NETHERITE, new Item.Settings()
                    .fireproof()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ADVANCED_NETHERITE, 1.5f, -3))));

    public static final Item ADVANCED_WOODEN_AXE = registerItem("advanced_wooden_axe",
            new AxeItem(ModToolMaterials.ADVANCED_WOOD, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_WOOD, 7, -3.2f))));
    public static final Item ADVANCED_STONE_AXE = registerItem("advanced_stone_axe",
            new AxeItem(ModToolMaterials.ADVANCED_STONE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_STONE, 8, -3.2f))));
    public static final Item ADVANCED_IRON_AXE = registerItem("advanced_iron_axe",
            new AxeItem(ModToolMaterials.ADVANCED_IRON, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_IRON, 7, -3.1f))));
    public static final Item ADVANCED_GOLDEN_AXE = registerItem("advanced_golden_axe",
            new AxeItem(ModToolMaterials.ADVANCED_GOLD, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_GOLD, 7, -3))));
    public static final Item ADVANCED_DIAMOND_AXE = registerItem("advanced_diamond_axe",
            new AxeItem(ModToolMaterials.ADVANCED_DIAMOND, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_DIAMOND, 6, -3))));
    public static final Item ADVANCED_NETHERITE_AXE = registerItem("advanced_netherite_axe",
            new AxeItem(ModToolMaterials.ADVANCED_NETHERITE, new Item.Settings()
                    .fireproof()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_NETHERITE, 6, -3))));

    public static final Item ADVANCED_WOODEN_HOE = registerItem("advanced_wooden_hoe",
            new HoeItem(ModToolMaterials.ADVANCED_WOOD, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_WOOD, 0, -3))));
    public static final Item ADVANCED_STONE_HOE = registerItem("advanced_stone_hoe",
            new HoeItem(ModToolMaterials.ADVANCED_STONE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_STONE, -1, -3))));
    public static final Item ADVANCED_IRON_HOE = registerItem("advanced_iron_hoe",
            new HoeItem(ModToolMaterials.ADVANCED_IRON, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_IRON, -2, -3))));
    public static final Item ADVANCED_GOLDEN_HOE = registerItem("advanced_golden_hoe",
            new HoeItem(ModToolMaterials.ADVANCED_GOLD, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_GOLD, 0, -3))));
    public static final Item ADVANCED_DIAMOND_HOE = registerItem("advanced_diamond_hoe",
            new HoeItem(ModToolMaterials.ADVANCED_DIAMOND, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_DIAMOND, -3, -3))));
    public static final Item ADVANCED_NETHERITE_HOE = registerItem("advanced_netherite_hoe",
            new HoeItem(ModToolMaterials.ADVANCED_NETHERITE, new Item.Settings()
                    .fireproof()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ADVANCED_NETHERITE, -4, -3))));

    public static final Item ADVANCED_IRON_HELMET = registerItem("advanced_iron_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_IRON_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(30))));
    public static final Item ADVANCED_IRON_CHESTPLATE = registerItem("advanced_iron_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_IRON_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(30))));
    public static final Item ADVANCED_IRON_LEGGINGS = registerItem("advanced_iron_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_IRON_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(30))));
    public static final Item ADVANCED_IRON_BOOTS = registerItem("advanced_iron_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_IRON_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(30))));

    public static final Item ADVANCED_GOLDEN_HELMET = registerItem("advanced_golden_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_GOLDEN_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(14))));
    public static final Item ADVANCED_GOLDEN_CHESTPLATE = registerItem("advanced_golden_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_GOLDEN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(14))));
    public static final Item ADVANCED_GOLDEN_LEGGINGS = registerItem("advanced_golden_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_GOLDEN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(14))));
    public static final Item ADVANCED_GOLDEN_BOOTS = registerItem("advanced_golden_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_GOLDEN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(14))));

    public static final Item ADVANCED_DIAMOND_HELMET = registerItem("advanced_diamond_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(66))));
    public static final Item ADVANCED_DIAMOND_CHESTPLATE = registerItem("advanced_diamond_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(66))));
    public static final Item ADVANCED_DIAMOND_LEGGINGS = registerItem("advanced_diamond_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(66))));
    public static final Item ADVANCED_DIAMOND_BOOTS = registerItem("advanced_diamond_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(66))));

    public static final Item ADVANCED_NETHERITE_HELMET = registerItem("advanced_netherite_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(74))));
    public static final Item ADVANCED_NETHERITE_CHESTPLATE = registerItem("advanced_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(74))));
    public static final Item ADVANCED_NETHERITE_LEGGINGS = registerItem("advanced_netherite_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(74))));
    public static final Item ADVANCED_NETHERITE_BOOTS = registerItem("advanced_netherite_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(74))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AdvancedEquipment.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AdvancedEquipment.LOGGER.info("Registering Mod Items for " + AdvancedEquipment.MOD_ID);
    }
}
