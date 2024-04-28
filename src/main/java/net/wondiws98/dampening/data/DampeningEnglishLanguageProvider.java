package net.wondiws98.dampening.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.wondiws98.dampening.enchantment.DampeningEnchantments;

import java.util.concurrent.CompletableFuture;

public class DampeningEnglishLanguageProvider extends FabricLanguageProvider {
    public DampeningEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(DampeningEnchantments.DAMPENING, "Dampening");
    }
}
