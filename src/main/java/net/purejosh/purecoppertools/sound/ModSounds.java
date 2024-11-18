package net.purejosh.purecoppertools.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.purejosh.purecoppertools.PureCopperTools;

public class ModSounds {

    public static final SoundEvent ITEM_ARMOR_EQUIP_COPPER = registerSoundEvent("item.armor.equip_copper");
    public static final SoundEvent ITEM_ARMOR_EQUIP_EXPOSED_COPPER = registerSoundEvent("item.armor.equip_exposed_copper");
    public static final SoundEvent ITEM_ARMOR_EQUIP_WEATHERED_COPPER = registerSoundEvent("item.armor.equip_weathered_copper");
    public static final SoundEvent ITEM_ARMOR_EQUIP_OXIDIZED_COPPER = registerSoundEvent("item.armor.equip_oxidized_copper");

    // Helper method for registering a sound event.
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(PureCopperTools.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    // Class initializer called from the entrypoint.
    public static void init() {
    }
}
