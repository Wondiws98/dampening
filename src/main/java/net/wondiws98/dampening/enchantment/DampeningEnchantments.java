package net.wondiws98.dampening.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wondiws98.dampening.DampeningMain;
import net.wondiws98.dampening.registry.DampeningTags;

public class DampeningEnchantments {
    public static final Enchantment DAMPENING = DampeningEnchantments.register("dampening", new DampeningEnchantment(Enchantment.properties(DampeningTags.DAMPENING_ENCHANTABLE, 5, 4, Enchantment.leveledCost(10, 8), Enchantment.leveledCost(18, 8), 2, EquipmentSlot.CHEST)));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(DampeningMain.MOD_ID, name), enchantment);
    }

    public static void registerEnchantments() {
    }
}
