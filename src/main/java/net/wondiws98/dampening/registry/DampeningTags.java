package net.wondiws98.dampening.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.wondiws98.dampening.DampeningMain;

public class DampeningTags {
    public static final TagKey<Item> DAMPENING_ENCHANTABLE = DampeningTags.itemOf("enchantable/dampening_enchantable");

    private static TagKey<Item> itemOf(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(DampeningMain.MOD_ID, id));
    }
}
