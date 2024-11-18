package net.purejosh.purecoppertools;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.purejosh.purecoppertools.item.ModArmorMaterials;
import net.purejosh.purecoppertools.item.ModItemGroups;
import net.purejosh.purecoppertools.item.ModItems;
import net.purejosh.purecoppertools.sound.ModSounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PureCopperTools implements ModInitializer {
	public static final String MOD_ID = "purecoppertools";
	public static final String MOD_NAME = "Pure Copper Tools";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// This code is executed when the mod is loaded.
	@Override
	public void onInitialize() {

		// This is the log line that gets printed when the mod is loaded.
		LOGGER.info(PureCopperTools.MOD_NAME + " by purejosh has been loaded!");

		// Now, I call the init methods in the registry classes.
		ModArmorMaterials.init();
		ModItems.init();
		ModItemGroups.init();
		ModSounds.init();
	}

	// This is used in the configured features and placed features registry. No idea why.
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
