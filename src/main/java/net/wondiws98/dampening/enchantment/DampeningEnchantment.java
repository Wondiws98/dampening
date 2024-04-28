package net.wondiws98.dampening.enchantment;

import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.damage.DamageSource;
import net.wondiws98.dampening.registry.DampeningTags;

public class DampeningEnchantment extends ProtectionEnchantment {
    public DampeningEnchantment(Properties properties) {
        super(properties, Type.ALL);
    }

    @Override
    public int getProtectionAmount(int level, DamageSource source) {
        if (source.isIn(DampeningTags.FLY_INTO_WALL)) {
            return level * 5;
        }
        return 0;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return false;
    }
}
