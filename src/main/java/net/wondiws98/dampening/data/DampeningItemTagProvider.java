package net.wondiws98.dampening.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.wondiws98.dampening.registry.DampeningTags;

import java.util.concurrent.CompletableFuture;

public class DampeningItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DampeningItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(DampeningTags.DAMPENING_ENCHANTABLE)
                .add(Items.ELYTRA);
    }
}
