package net.fneifnox.advancedequipment.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fneifnox.advancedequipment.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);


        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ADVANCED_WOODEN_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ADVANCED_STONE_TOOL)
                .addTag(BlockTags.NEEDS_STONE_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ADVANCED_IRON_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ADVANCED_GOLD_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ADVANCED_DIAMOND_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ADVANCED_NETHERITE_TOOL);
    }
}
