package net.trique.mythicupgrades;

import net.fabricmc.api.ModInitializer;

import net.trique.mythicupgrades.block.MUBlocks;
import net.trique.mythicupgrades.config.MUConfig;
import net.trique.mythicupgrades.registry.RegisterMUCommands;
import net.trique.mythicupgrades.registry.RegisterMUEffects;
import net.trique.mythicupgrades.registry.RegisterMUItems;
import net.trique.mythicupgrades.world.gen.MUWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class MythicUpgrades implements ModInitializer {
	public static final String MOD_ID = "mythicupgrades";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final MUConfig CONFIG = MUConfig.createAndLoad();

	public static Random RANDOM = new Random();

	@Override
	public void onInitialize() {
		CONFIG.load();
		RegisterMUEffects.registerEffects();
		RegisterMUItems.registerMythicItems();
		RegisterMUCommands.registerCommands();
		MUBlocks.registerMythicBlocks();
		MUWorldGeneration.generateModWorldGen();
		LOGGER.info("Mythic Upgrades works properly! CAN ANNENE SELAMLAR KARDES <3!");
	}
}