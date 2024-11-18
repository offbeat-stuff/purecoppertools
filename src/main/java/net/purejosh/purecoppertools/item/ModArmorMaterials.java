package net.purejosh.purecoppertools.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.purejosh.purecoppertools.PureCopperTools;
import net.purejosh.purecoppertools.sound.ModSounds;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> COPPER = register("copper",
            Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.BODY, 7);
            }), 22, 0.0F, 0.0F,
            RegistryEntry.of(ModSounds.ITEM_ARMOR_EQUIP_COPPER), () -> Ingredient.ofItems(Items.COPPER_INGOT));

    public static final int COPPER_DURABILITY = 9;

    public static final RegistryEntry<ArmorMaterial> EXPOSED_COPPER = register("exposed_copper",
            Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.BODY, 7);
            }), 18, 0.0F, 0.0F,
            RegistryEntry.of(ModSounds.ITEM_ARMOR_EQUIP_EXPOSED_COPPER), () -> Ingredient.ofItems(ModItems.EXPOSED_COPPER_INGOT));

    public static final int EXPOSED_COPPER_DURABILITY = 11;

    public static final RegistryEntry<ArmorMaterial> WEATHERED_COPPER = register("weathered_copper",
            Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.BODY, 7);
            }), 14, 0.0F, 0.0F,
            RegistryEntry.of(ModSounds.ITEM_ARMOR_EQUIP_WEATHERED_COPPER), () -> Ingredient.ofItems(ModItems.WEATHERED_COPPER_INGOT));

    public static final int WEATHERED_COPPER_DURABILITY = 13;

    public static final RegistryEntry<ArmorMaterial> OXIDIZED_COPPER = register("oxidized_copper",
            Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.BODY, 7);
            }), 10, 0.0F, 0.0F,
            RegistryEntry.of(ModSounds.ITEM_ARMOR_EQUIP_OXIDIZED_COPPER), () -> Ingredient.ofItems(ModItems.OXIDIZED_COPPER_INGOT));

    public static final int OXIDIZED_COPPER_DURABILITY = 15;
    
    private static RegistryEntry<ArmorMaterial> register(
            String id,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchant,
            float tough,
            float knockback,
            RegistryEntry<SoundEvent> equipSound,
            Supplier<Ingredient> repairItem
    ) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(Identifier.of(PureCopperTools.MOD_ID, id)));
        return register(id, defense, enchant, tough, knockback, equipSound, repairItem, list);
    }

    private static RegistryEntry<ArmorMaterial> register(
            String id,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchant,
            float tough,
            float knockback,
            RegistryEntry<SoundEvent> equipSound,
            Supplier<Ingredient> repairItem,
            List<ArmorMaterial.Layer> layers
    ) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<>(ArmorItem.Type.class);

        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            enumMap.put(type, defense.get(type));
        }

        return Registry.registerReference(
                Registries.ARMOR_MATERIAL, Identifier.of(PureCopperTools.MOD_ID, id),
                new ArmorMaterial(enumMap, enchant, equipSound, repairItem, layers, tough, knockback)
        );
    }

    // Initialization called from the entrypoint, as this armor material needs to be added to the registry.
    public static void init() {
    }
}
