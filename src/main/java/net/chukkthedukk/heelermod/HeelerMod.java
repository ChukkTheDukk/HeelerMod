package net.chukkthedukk.heelermod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeelerMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}