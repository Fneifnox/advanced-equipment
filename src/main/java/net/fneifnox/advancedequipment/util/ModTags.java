package net.fneifnox.advancedequipment.util;

import net.fneifnox.advancedequipment.AdvancedEquipment;
import net.fneifnox.advancedequipment.AdvancedEquipmentDataGenerator;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ADVANCED_WOODEN_TOOL = createTag("needs_advanced_wooden_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADVANCED_WOODEN_TOOL = createTag("incorrect_for_advanced_wooden_tool");

        public static final TagKey<Block> NEEDS_ADVANCED_STONE_TOOL = createTag("needs_advanced_stone_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADVANCED_STONE_TOOL = createTag("incorrect_for_advanced_stone_tool");

        public static final TagKey<Block> NEEDS_ADVANCED_IRON_TOOL = createTag("needs_advanced_iron_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADVANCED_IRON_TOOL = createTag("incorrect_for_advanced_iron_tool");

        public static final TagKey<Block> NEEDS_ADVANCED_GOLD_TOOL = createTag("needs_advanced_gold_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADVANCED_GOLDEN_TOOL = createTag("incorrect_for_advanced_golden_tool");

        public static final TagKey<Block> NEEDS_ADVANCED_DIAMOND_TOOL = createTag("needs_advanced_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADVANCED_DIAMOND_TOOL = createTag("incorrect_for_advanced_diamond_tool");

        public static final TagKey<Block> NEEDS_ADVANCED_NETHERITE_TOOL = createTag("needs_advanced_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADVANCED_NETHERITE_TOOL = createTag("incorrect_for_advanced_netherite_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(AdvancedEquipment.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedEquipment.MOD_ID, name));
        }
    }
}
