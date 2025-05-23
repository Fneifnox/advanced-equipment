package net.fneifnox.advancedequipment.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fneifnox.advancedequipment.item.ModItems;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;


import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        // swords
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.ADVANCED_DIAMOND_SWORD),
                        Ingredient.ofItems(Items.NETHERITE_BLOCK),
                        RecipeCategory.COMBAT,
                        ModItems.ADVANCED_NETHERITE_SWORD
                )
                .criterion(hasItem(ModItems.ADVANCED_DIAMOND_SWORD), conditionsFromItem(ModItems.ADVANCED_DIAMOND_SWORD))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_netherite_sword_upgrade"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ADVANCED_DIAMOND_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.DIAMOND_BLOCK)
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_diamond_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ADVANCED_IRON_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_iron_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ADVANCED_GOLDEN_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_golden_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ADVANCED_STONE_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.SMOOTH_STONE)
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_stone_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ADVANCED_WOODEN_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', ItemTags.LOGS)
                .criterion("has_log", RecipeProvider.conditionsFromTag(ItemTags.LOGS))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_wooden_sword"));

        // pickaxes

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.ADVANCED_DIAMOND_PICKAXE),
                        Ingredient.ofItems(Items.NETHERITE_BLOCK),
                        RecipeCategory.TOOLS,
                        ModItems.ADVANCED_NETHERITE_PICKAXE
                )
                .criterion(hasItem(ModItems.ADVANCED_DIAMOND_PICKAXE), conditionsFromItem(ModItems.ADVANCED_DIAMOND_PICKAXE))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_netherite_pickaxe_upgrade"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_DIAMOND_PICKAXE)
                .pattern("###")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.DIAMOND_BLOCK)
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_IRON_PICKAXE)
                .pattern("###")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_GOLDEN_PICKAXE)
                .pattern("###")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_STONE_PICKAXE)
                .pattern("###")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.SMOOTH_STONE)
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_WOODEN_PICKAXE)
                .pattern("###")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', ItemTags.LOGS)
                .criterion("has_log", RecipeProvider.conditionsFromTag(ItemTags.LOGS))
                .offerTo(recipeExporter);

        // shovels

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.ADVANCED_DIAMOND_SHOVEL),
                        Ingredient.ofItems(Items.NETHERITE_BLOCK),
                        RecipeCategory.TOOLS,
                        ModItems.ADVANCED_NETHERITE_SHOVEL
                )
                .criterion(hasItem(ModItems.ADVANCED_DIAMOND_SHOVEL), conditionsFromItem(ModItems.ADVANCED_DIAMOND_SHOVEL))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_netherite_shovel_upgrade"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_DIAMOND_SHOVEL)
                .pattern(" # ")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.DIAMOND_BLOCK)
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_IRON_SHOVEL)
                .pattern(" # ")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_GOLDEN_SHOVEL)
                .pattern(" # ")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_STONE_SHOVEL)
                .pattern(" # ")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.SMOOTH_STONE)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_WOODEN_SHOVEL)
                .pattern(" # ")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', ItemTags.LOGS)
                .criterion("has_log", RecipeProvider.conditionsFromTag(ItemTags.LOGS))
                .offerTo(recipeExporter);

        // axes (left and netherite)

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.ADVANCED_DIAMOND_AXE),
                        Ingredient.ofItems(Items.NETHERITE_BLOCK),
                        RecipeCategory.TOOLS,
                        ModItems.ADVANCED_NETHERITE_AXE
                )
                .criterion(hasItem(ModItems.ADVANCED_DIAMOND_AXE), conditionsFromItem(ModItems.ADVANCED_DIAMOND_AXE))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_netherite_axe_upgrade"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_DIAMOND_AXE)
                .pattern("## ")
                .pattern("#- ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.DIAMOND_BLOCK)
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_diamond_axe_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_IRON_AXE)
                .pattern("## ")
                .pattern("#- ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_iron_axe_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_GOLDEN_AXE)
                .pattern("## ")
                .pattern("#- ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_golden_axe_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_STONE_AXE)
                .pattern("## ")
                .pattern("#- ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.SMOOTH_STONE)
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_stone_axe_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_WOODEN_AXE)
                .pattern("## ")
                .pattern("#- ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', ItemTags.LOGS)
                .criterion("has_log", RecipeProvider.conditionsFromTag(ItemTags.LOGS))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_wooden_axe_left"));

        // axes (right)

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_DIAMOND_AXE)
                .pattern(" ##")
                .pattern(" -#")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.DIAMOND_BLOCK)
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_diamond_axe_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_IRON_AXE)
                .pattern(" ##")
                .pattern(" -#")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_iron_axe_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_GOLDEN_AXE)
                .pattern(" ##")
                .pattern(" -#")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_golden_axe_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_STONE_AXE)
                .pattern(" ##")
                .pattern(" -#")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.SMOOTH_STONE)
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_stone_axe_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_WOODEN_AXE)
                .pattern(" ##")
                .pattern(" -#")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', ItemTags.LOGS)
                .criterion("has_log", RecipeProvider.conditionsFromTag(ItemTags.LOGS))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_wooden_axe_right"));

        // Hoes (left and netherite)

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.ADVANCED_DIAMOND_HOE),
                        Ingredient.ofItems(Items.NETHERITE_BLOCK),
                        RecipeCategory.TOOLS,
                        ModItems.ADVANCED_NETHERITE_HOE
                )
                .criterion(hasItem(ModItems.ADVANCED_DIAMOND_HOE), conditionsFromItem(ModItems.ADVANCED_DIAMOND_HOE))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_netherite_hoe_upgrade"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_DIAMOND_HOE)
                .pattern("## ")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.DIAMOND_BLOCK)
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_diamond_hoe_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_IRON_HOE)
                .pattern("## ")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_iron_hoe_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_GOLDEN_HOE)
                .pattern("## ")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_golden_hoe_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_STONE_HOE)
                .pattern("## ")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.SMOOTH_STONE)
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_stone_hoe_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_WOODEN_HOE)
                .pattern("## ")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', ItemTags.LOGS)
                .criterion("has_log", RecipeProvider.conditionsFromTag(ItemTags.LOGS))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_wooden_hoe_left"));

        // Hoes (right)

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_DIAMOND_HOE)
                .pattern(" ##")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.DIAMOND_BLOCK)
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_diamond_hoe_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_IRON_HOE)
                .pattern(" ##")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_iron_hoe_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_GOLDEN_HOE)
                .pattern(" ##")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_golden_hoe_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_STONE_HOE)
                .pattern(" ##")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', Items.SMOOTH_STONE)
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_stone_hoe_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_WOODEN_HOE)
                .pattern(" ##")
                .pattern(" - ")
                .pattern(" - ")
                .input('-', Items.STICK)
                .input('#', ItemTags.LOGS)
                .criterion("has_log", RecipeProvider.conditionsFromTag(ItemTags.LOGS))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_wooden_hoe_right"));

        // Iron Armor (Boots up / down and Helmet up / down)

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_IRON_HELMET)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_iron_helmet_up"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_IRON_HELMET)
                .pattern("   ")
                .pattern("###")
                .pattern("# #")
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_iron_helmet_down"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ADVANCED_IRON_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ADVANCED_IRON_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_IRON_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .pattern("   ")
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_iron_boots_up"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_IRON_BOOTS)
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_iron_boots_down"));

        // Gold Armor (Boots up / down and Helmet up / down)

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_GOLDEN_HELMET)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_golden_helmet_up"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_GOLDEN_HELMET)
                .pattern("   ")
                .pattern("###")
                .pattern("# #")
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_golden_helmet_down"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ADVANCED_GOLDEN_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ADVANCED_GOLDEN_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_GOLDEN_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .pattern("   ")
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_golden_boots_up"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ADVANCED_GOLDEN_BOOTS)
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .input('#', Items.GOLD_BLOCK)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_golden_boots_down"));

        // Netherite Armor

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.ADVANCED_DIAMOND_HELMET),
                        Ingredient.ofItems(Items.NETHERITE_BLOCK),
                        RecipeCategory.TOOLS,
                        ModItems.ADVANCED_NETHERITE_HELMET
                )
                .criterion(hasItem(ModItems.ADVANCED_DIAMOND_HELMET), conditionsFromItem(ModItems.ADVANCED_DIAMOND_HELMET))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_netherite_helmet_upgrade"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.ADVANCED_DIAMOND_CHESTPLATE),
                        Ingredient.ofItems(Items.NETHERITE_BLOCK),
                        RecipeCategory.TOOLS,
                        ModItems.ADVANCED_NETHERITE_CHESTPLATE
                )
                .criterion(hasItem(ModItems.ADVANCED_DIAMOND_CHESTPLATE), conditionsFromItem(ModItems.ADVANCED_DIAMOND_CHESTPLATE))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_netherite_chestplate_upgrade"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.ADVANCED_DIAMOND_LEGGINGS),
                        Ingredient.ofItems(Items.NETHERITE_BLOCK),
                        RecipeCategory.TOOLS,
                        ModItems.ADVANCED_NETHERITE_LEGGINGS
                )
                .criterion(hasItem(ModItems.ADVANCED_DIAMOND_LEGGINGS), conditionsFromItem(ModItems.ADVANCED_DIAMOND_LEGGINGS))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_netherite_leggings_upgrade"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.ADVANCED_DIAMOND_BOOTS),
                        Ingredient.ofItems(Items.NETHERITE_BLOCK),
                        RecipeCategory.TOOLS,
                        ModItems.ADVANCED_NETHERITE_BOOTS
                )
                .criterion(hasItem(ModItems.ADVANCED_DIAMOND_BOOTS), conditionsFromItem(ModItems.ADVANCED_DIAMOND_BOOTS))
                .offerTo(recipeExporter, Identifier.of("advanced_equipment", "advanced_netherite_boots_upgrade"));
    }
}
