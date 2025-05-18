package net.fneifnox.advancedequipment.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fneifnox.advancedequipment.AdvancedEquipment;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ADVANCED_EQUIPMENT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AdvancedEquipment.MOD_ID, "advanced_equipment_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ADVANCED_DIAMOND_SWORD))
                    .displayName(Text.translatable("itemgroup.advanced_equipment.advanced_equipment_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.ADVANCED_WOODEN_SWORD);
                        entries.add(ModItems.ADVANCED_STONE_SWORD);
                        entries.add(ModItems.ADVANCED_IRON_SWORD);
                        entries.add(ModItems.ADVANCED_GOLDEN_SWORD);
                        entries.add(ModItems.ADVANCED_DIAMOND_SWORD);
                        entries.add(ModItems.ADVANCED_NETHERITE_SWORD);

                        entries.add(ModItems.ADVANCED_WOODEN_PICKAXE);
                        entries.add(ModItems.ADVANCED_STONE_PICKAXE);
                        entries.add(ModItems.ADVANCED_IRON_PICKAXE);
                        entries.add(ModItems.ADVANCED_GOLDEN_PICKAXE);
                        entries.add(ModItems.ADVANCED_DIAMOND_PICKAXE);
                        entries.add(ModItems.ADVANCED_NETHERITE_PICKAXE);

                        entries.add(ModItems.ADVANCED_WOODEN_AXE);
                        entries.add(ModItems.ADVANCED_STONE_AXE);
                        entries.add(ModItems.ADVANCED_IRON_AXE);
                        entries.add(ModItems.ADVANCED_GOLDEN_AXE);
                        entries.add(ModItems.ADVANCED_DIAMOND_AXE);
                        entries.add(ModItems.ADVANCED_NETHERITE_AXE);

                        entries.add(ModItems.ADVANCED_WOODEN_SHOVEL);
                        entries.add(ModItems.ADVANCED_STONE_SHOVEL);
                        entries.add(ModItems.ADVANCED_IRON_SHOVEL);
                        entries.add(ModItems.ADVANCED_GOLDEN_SHOVEL);
                        entries.add(ModItems.ADVANCED_DIAMOND_SHOVEL);
                        entries.add(ModItems.ADVANCED_NETHERITE_SHOVEL);

                        entries.add(ModItems.ADVANCED_WOODEN_HOE);
                        entries.add(ModItems.ADVANCED_STONE_HOE);
                        entries.add(ModItems.ADVANCED_IRON_HOE);
                        entries.add(ModItems.ADVANCED_GOLDEN_HOE);
                        entries.add(ModItems.ADVANCED_DIAMOND_HOE);
                        entries.add(ModItems.ADVANCED_NETHERITE_HOE);

                        entries.add(ModItems.ADVANCED_IRON_HELMET);
                        entries.add(ModItems.ADVANCED_IRON_CHESTPLATE);
                        entries.add(ModItems.ADVANCED_IRON_LEGGINGS);
                        entries.add(ModItems.ADVANCED_IRON_BOOTS);

                        entries.add(ModItems.ADVANCED_GOLDEN_HELMET);
                        entries.add(ModItems.ADVANCED_GOLDEN_CHESTPLATE);
                        entries.add(ModItems.ADVANCED_GOLDEN_LEGGINGS);
                        entries.add(ModItems.ADVANCED_GOLDEN_BOOTS);

                        entries.add(ModItems.ADVANCED_DIAMOND_HELMET);
                        entries.add(ModItems.ADVANCED_DIAMOND_CHESTPLATE);
                        entries.add(ModItems.ADVANCED_DIAMOND_LEGGINGS);
                        entries.add(ModItems.ADVANCED_DIAMOND_BOOTS);

                        entries.add(ModItems.ADVANCED_NETHERITE_HELMET);
                        entries.add(ModItems.ADVANCED_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.ADVANCED_NETHERITE_LEGGINGS);
                        entries.add(ModItems.ADVANCED_NETHERITE_BOOTS);
                    }).build());

    public static void registerItemGroups() {
        AdvancedEquipment.LOGGER.info("Registering Item Groups for " + AdvancedEquipment.MOD_ID);
    }
}
