package net.purejosh.purecoppertools.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

// This is used to arrange items in creative tabs.
public class ModItemGroups {
    public static void init() {
        // Tools
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                Items.IRON_HOE.getDefaultStack(), ModItems.COPPER_SHOVEL.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_SHOVEL.getDefaultStack(), ModItems.COPPER_PICKAXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_PICKAXE.getDefaultStack(), ModItems.COPPER_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_AXE.getDefaultStack(), ModItems.COPPER_HOE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_HOE.getDefaultStack(), ModItems.EXPOSED_COPPER_SHOVEL.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_SHOVEL.getDefaultStack(), ModItems.EXPOSED_COPPER_PICKAXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_PICKAXE.getDefaultStack(), ModItems.EXPOSED_COPPER_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_AXE.getDefaultStack(), ModItems.EXPOSED_COPPER_HOE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_HOE.getDefaultStack(), ModItems.WEATHERED_COPPER_SHOVEL.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_SHOVEL.getDefaultStack(), ModItems.WEATHERED_COPPER_PICKAXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_PICKAXE.getDefaultStack(), ModItems.WEATHERED_COPPER_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_AXE.getDefaultStack(), ModItems.WEATHERED_COPPER_HOE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_HOE.getDefaultStack(), ModItems.OXIDIZED_COPPER_SHOVEL.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.OXIDIZED_COPPER_SHOVEL.getDefaultStack(), ModItems.OXIDIZED_COPPER_PICKAXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.OXIDIZED_COPPER_PICKAXE.getDefaultStack(), ModItems.OXIDIZED_COPPER_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.OXIDIZED_COPPER_AXE.getDefaultStack(), ModItems.OXIDIZED_COPPER_HOE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                Items.BRUSH.getDefaultStack(), ModItems.EXPOSED_COPPER_BRUSH.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_BRUSH.getDefaultStack(), ModItems.WEATHERED_COPPER_BRUSH.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_BRUSH.getDefaultStack(), ModItems.OXIDIZED_COPPER_BRUSH.getDefaultStack()));

        // Combat
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.IRON_SWORD.getDefaultStack(), ModItems.COPPER_SWORD.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_SWORD.getDefaultStack(), ModItems.EXPOSED_COPPER_SWORD.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_SWORD.getDefaultStack(), ModItems.WEATHERED_COPPER_SWORD.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_SWORD.getDefaultStack(), ModItems.OXIDIZED_COPPER_SWORD.getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.IRON_AXE.getDefaultStack(), ModItems.COPPER_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_AXE.getDefaultStack(), ModItems.EXPOSED_COPPER_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_AXE.getDefaultStack(), ModItems.WEATHERED_COPPER_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_AXE.getDefaultStack(), ModItems.OXIDIZED_COPPER_AXE.getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.IRON_BOOTS.getDefaultStack(), ModItems.COPPER_HELMET.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_HELMET.getDefaultStack(), ModItems.COPPER_CHESTPLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_CHESTPLATE.getDefaultStack(), ModItems.COPPER_LEGGINGS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_LEGGINGS.getDefaultStack(), ModItems.COPPER_BOOTS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_BOOTS.getDefaultStack(), ModItems.EXPOSED_COPPER_HELMET.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_HELMET.getDefaultStack(), ModItems.EXPOSED_COPPER_CHESTPLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_CHESTPLATE.getDefaultStack(), ModItems.EXPOSED_COPPER_LEGGINGS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_LEGGINGS.getDefaultStack(), ModItems.EXPOSED_COPPER_BOOTS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_BOOTS.getDefaultStack(), ModItems.WEATHERED_COPPER_HELMET.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_HELMET.getDefaultStack(), ModItems.WEATHERED_COPPER_CHESTPLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_CHESTPLATE.getDefaultStack(), ModItems.WEATHERED_COPPER_LEGGINGS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_LEGGINGS.getDefaultStack(), ModItems.WEATHERED_COPPER_BOOTS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_BOOTS.getDefaultStack(), ModItems.OXIDIZED_COPPER_HELMET.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.OXIDIZED_COPPER_HELMET.getDefaultStack(), ModItems.OXIDIZED_COPPER_CHESTPLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.OXIDIZED_COPPER_CHESTPLATE.getDefaultStack(), ModItems.OXIDIZED_COPPER_LEGGINGS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.OXIDIZED_COPPER_LEGGINGS.getDefaultStack(), ModItems.OXIDIZED_COPPER_BOOTS.getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.IRON_HORSE_ARMOR.getDefaultStack(), ModItems.COPPER_HORSE_ARMOR.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_HORSE_ARMOR.getDefaultStack(), ModItems.EXPOSED_COPPER_HORSE_ARMOR.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_HORSE_ARMOR.getDefaultStack(), ModItems.WEATHERED_COPPER_HORSE_ARMOR.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_HORSE_ARMOR.getDefaultStack(), ModItems.OXIDIZED_COPPER_HORSE_ARMOR.getDefaultStack()));

        // Ingredients
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                Items.COPPER_INGOT.getDefaultStack(), ModItems.EXPOSED_COPPER_INGOT.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_INGOT.getDefaultStack(), ModItems.WEATHERED_COPPER_INGOT.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_INGOT.getDefaultStack(), ModItems.OXIDIZED_COPPER_INGOT.getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                Items.IRON_NUGGET.getDefaultStack(), ModItems.COPPER_NUGGET.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_NUGGET.getDefaultStack(), ModItems.EXPOSED_COPPER_NUGGET.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_NUGGET.getDefaultStack(), ModItems.WEATHERED_COPPER_NUGGET.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_NUGGET.getDefaultStack(), ModItems.OXIDIZED_COPPER_NUGGET.getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addBefore(
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE.getDefaultStack(), ModItems.COPPER_UPGRADE_SMITHING_TEMPLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COPPER_UPGRADE_SMITHING_TEMPLATE.getDefaultStack(), ModItems.EXPOSED_COPPER_UPGRADE_SMITHING_TEMPLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EXPOSED_COPPER_UPGRADE_SMITHING_TEMPLATE.getDefaultStack(), ModItems.WEATHERED_COPPER_UPGRADE_SMITHING_TEMPLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WEATHERED_COPPER_UPGRADE_SMITHING_TEMPLATE.getDefaultStack(), ModItems.OXIDIZED_COPPER_UPGRADE_SMITHING_TEMPLATE.getDefaultStack()));
    }
}
