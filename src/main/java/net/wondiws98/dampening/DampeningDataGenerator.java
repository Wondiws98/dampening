package net.wondiws98.dampening;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.wondiws98.dampening.data.DampeningEnglishLanguageProvider;
import net.wondiws98.dampening.data.DampeningItemTagProvider;

public class DampeningDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack =  fabricDataGenerator.createPack();
		pack.addProvider(DampeningItemTagProvider::new);
		pack.addProvider(DampeningEnglishLanguageProvider::new);
	}
}
