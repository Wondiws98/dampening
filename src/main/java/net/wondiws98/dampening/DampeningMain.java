package net.wondiws98.dampening;

import net.fabricmc.api.ModInitializer;

import net.wondiws98.dampening.enchantment.DampeningEnchantments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DampeningMain implements ModInitializer {
	public static final String MOD_ID = "dampening";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DampeningEnchantments.registerEnchantments();
		LOGGER.info("Dampening in!");
	}
}