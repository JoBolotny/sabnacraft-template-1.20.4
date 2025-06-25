package net.kibito.sabnacraft;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.kibito.sabnacraft.block.ModBlocks;
import net.kibito.sabnacraft.item.ModItemGroup;
import net.kibito.sabnacraft.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sabnacraft implements ModInitializer {
	public static final String MOD_ID = "sabnacraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();

		Moditems.registerModItems();
		ModBlocks.registerModBlocks();
		FuelRegistry.INSTANCE.add(Moditems.ION_CUBE, 2400);
	}
}