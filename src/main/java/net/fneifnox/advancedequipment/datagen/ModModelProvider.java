package net.fneifnox.advancedequipment.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fneifnox.advancedequipment.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.ADVANCED_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_STONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_WOODEN_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ADVANCED_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_STONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_WOODEN_PICKAXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ADVANCED_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_STONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_WOODEN_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ADVANCED_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_STONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_WOODEN_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ADVANCED_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_IRON_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_NETHERITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_GOLDEN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_STONE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADVANCED_WOODEN_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_IRON_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_IRON_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_IRON_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_IRON_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_GOLDEN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_GOLDEN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_GOLDEN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_GOLDEN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_DIAMOND_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_DIAMOND_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_DIAMOND_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_DIAMOND_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_NETHERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_NETHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_NETHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADVANCED_NETHERITE_BOOTS));
    }
}
