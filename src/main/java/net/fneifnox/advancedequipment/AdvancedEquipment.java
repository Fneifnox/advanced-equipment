package net.fneifnox.advancedequipment;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fneifnox.advancedequipment.datagen.ModRecipeProvider;
import net.fneifnox.advancedequipment.item.ModItemGroups;
import net.fneifnox.advancedequipment.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedEquipment implements ModInitializer {
	public static final String MOD_ID = "advanced-equipment";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}