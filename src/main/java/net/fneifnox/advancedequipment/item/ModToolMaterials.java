package net.fneifnox.advancedequipment.item;

import com.google.common.base.Suppliers;
import net.fneifnox.advancedequipment.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    ADVANCED_WOOD(ModTags.Blocks.INCORRECT_FOR_ADVANCED_WOODEN_TOOL, 118, 3.5F, 0.0F, 15, () -> Ingredient.fromTag(ItemTags.LOGS)),
    ADVANCED_STONE(ModTags.Blocks.INCORRECT_FOR_ADVANCED_STONE_TOOL, 262, 5.5F, 1.0F, 5, () -> Ingredient.ofItems(Items.STONE)),
    ADVANCED_IRON(ModTags.Blocks.INCORRECT_FOR_ADVANCED_IRON_TOOL, 500, 7.5F, 2.0F, 14, () -> Ingredient.ofItems(Items.IRON_BLOCK)),
    ADVANCED_DIAMOND(ModTags.Blocks.INCORRECT_FOR_ADVANCED_DIAMOND_TOOL, 3122, 9.0F, 3.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND_BLOCK)),
    ADVANCED_GOLD(ModTags.Blocks.INCORRECT_FOR_ADVANCED_GOLDEN_TOOL, 64, 13.5F, 0.0F, 22, () -> Ingredient.ofItems(Items.GOLD_BLOCK)),
    ADVANCED_NETHERITE(ModTags.Blocks.INCORRECT_FOR_ADVANCED_NETHERITE_TOOL, 4062, 10.5F, 4.0F, 15, () -> Ingredient.ofItems(Items.NETHERITE_BLOCK));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
