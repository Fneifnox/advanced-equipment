package net.fneifnox.advancedequipment.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fneifnox.advancedequipment.item.ModItems;
import net.fneifnox.advancedequipment.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.ADVANCED_DIAMOND_SWORD)
                .add(ModItems.ADVANCED_IRON_SWORD)
                .add(ModItems.ADVANCED_NETHERITE_SWORD)
                .add(ModItems.ADVANCED_GOLDEN_SWORD)
                .add(ModItems.ADVANCED_STONE_SWORD)
                .add(ModItems.ADVANCED_WOODEN_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.ADVANCED_DIAMOND_PICKAXE)
                .add(ModItems.ADVANCED_IRON_PICKAXE)
                .add(ModItems.ADVANCED_NETHERITE_PICKAXE)
                .add(ModItems.ADVANCED_GOLDEN_PICKAXE)
                .add(ModItems.ADVANCED_STONE_PICKAXE)
                .add(ModItems.ADVANCED_WOODEN_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.ADVANCED_DIAMOND_SHOVEL)
                .add(ModItems.ADVANCED_IRON_SHOVEL)
                .add(ModItems.ADVANCED_NETHERITE_SHOVEL)
                .add(ModItems.ADVANCED_GOLDEN_SHOVEL)
                .add(ModItems.ADVANCED_STONE_SHOVEL)
                .add(ModItems.ADVANCED_WOODEN_SHOVEL);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.ADVANCED_DIAMOND_AXE)
                .add(ModItems.ADVANCED_IRON_AXE)
                .add(ModItems.ADVANCED_NETHERITE_AXE)
                .add(ModItems.ADVANCED_GOLDEN_AXE)
                .add(ModItems.ADVANCED_STONE_AXE)
                .add(ModItems.ADVANCED_WOODEN_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.ADVANCED_DIAMOND_HOE)
                .add(ModItems.ADVANCED_IRON_HOE)
                .add(ModItems.ADVANCED_NETHERITE_HOE)
                .add(ModItems.ADVANCED_GOLDEN_HOE)
                .add(ModItems.ADVANCED_STONE_HOE)
                .add(ModItems.ADVANCED_WOODEN_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ADVANCED_IRON_HELMET)
                .add(ModItems.ADVANCED_IRON_CHESTPLATE)
                .add(ModItems.ADVANCED_IRON_LEGGINGS)
                .add(ModItems.ADVANCED_IRON_BOOTS)

                .add(ModItems.ADVANCED_GOLDEN_HELMET)
                .add(ModItems.ADVANCED_GOLDEN_CHESTPLATE)
                .add(ModItems.ADVANCED_GOLDEN_LEGGINGS)
                .add(ModItems.ADVANCED_GOLDEN_BOOTS)

                .add(ModItems.ADVANCED_DIAMOND_HELMET)
                .add(ModItems.ADVANCED_DIAMOND_CHESTPLATE)
                .add(ModItems.ADVANCED_DIAMOND_LEGGINGS)
                .add(ModItems.ADVANCED_DIAMOND_BOOTS)

                .add(ModItems.ADVANCED_NETHERITE_HELMET)
                .add(ModItems.ADVANCED_NETHERITE_CHESTPLATE)
                .add(ModItems.ADVANCED_NETHERITE_LEGGINGS)
                .add(ModItems.ADVANCED_NETHERITE_BOOTS);
    }
}
