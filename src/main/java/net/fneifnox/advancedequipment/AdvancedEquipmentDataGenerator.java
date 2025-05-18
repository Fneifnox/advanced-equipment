package net.fneifnox.advancedequipment;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fneifnox.advancedequipment.datagen.ModBlockTagProvider;
import net.fneifnox.advancedequipment.datagen.ModItemTagProvider;
import net.fneifnox.advancedequipment.datagen.ModModelProvider;
import net.fneifnox.advancedequipment.datagen.ModRecipeProvider;

public class AdvancedEquipmentDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
