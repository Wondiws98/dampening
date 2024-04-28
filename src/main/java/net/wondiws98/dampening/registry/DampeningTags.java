package net.wondiws98.dampening.registry;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.wondiws98.dampening.DampeningMain;

public interface DampeningTags {
    public static final TagKey<DamageType> FLY_INTO_WALL = DampeningTags.damageOf("fly_into_wall");
    public static final TagKey<Item> DAMPENING_ENCHANTABLE = DampeningTags.itemOf("dampening_enchantable");

    private static TagKey<DamageType> damageOf(String id) {
        return TagKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier(DampeningMain.MOD_ID, id));
    }

    private static TagKey<Item> itemOf(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(DampeningMain.MOD_ID, id));
    }

}
