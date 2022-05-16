package net.chukkthedukk.heelermod;

import net.chukkthedukk.heelermod.item.ModItems;
import net.chukkthedukk.heelermod.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class HeelerMod implements ModInitializer {
	public static final String MOD_ID = "heelermod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModRegistries.registerModStuffs();
		GeckoLib.initialize();

	}
}
