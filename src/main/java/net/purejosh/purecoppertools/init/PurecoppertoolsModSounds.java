
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.purecoppertools.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PurecoppertoolsModSounds {
	public static SoundEvent EQUIP_COPPER = SoundEvent.createVariableRangeEvent(new ResourceLocation("purecoppertools", "equip_copper"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purecoppertools", "equip_copper"), EQUIP_COPPER);
	}
}
