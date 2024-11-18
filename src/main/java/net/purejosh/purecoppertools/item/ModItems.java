package net.purejosh.purecoppertools.item;

import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.purejosh.purecoppertools.PureCopperTools;

import java.util.List;

public class ModItems {
    // Swords and tools
    public static final Item COPPER_SWORD = register("copper_sword", new SwordItem(ModToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.COPPER,3, -2.4f))));
    public static final Item EXPOSED_COPPER_SWORD = register("exposed_copper_sword", new SwordItem(ModToolMaterials.EXPOSED_COPPER, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.EXPOSED_COPPER,3, -2.4f))));
    public static final Item WEATHERED_COPPER_SWORD = register("weathered_copper_sword", new SwordItem(ModToolMaterials.WEATHERED_COPPER, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WEATHERED_COPPER,3, -2.4f))));
    public static final Item OXIDIZED_COPPER_SWORD = register("oxidized_copper_sword", new SwordItem(ModToolMaterials.OXIDIZED_COPPER, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OXIDIZED_COPPER,3, -2.4f))));

    // Tools
    public static final Item COPPER_SHOVEL = register("copper_shovel", new ShovelItem(ModToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER,1.5f, -3.0f))));
    public static final Item COPPER_PICKAXE = register("copper_pickaxe", new PickaxeItem(ModToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER,1.0f, -2.8f))));
    public static final Item COPPER_AXE = register("copper_axe", new AxeItem(ModToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER,6.0f, -3.1f))));
    public static final Item COPPER_HOE = register("copper_hoe", new HoeItem(ModToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER,-2.0f, -1.0f))));
    public static final Item EXPOSED_COPPER_SHOVEL = register("exposed_copper_shovel", new ShovelItem(ModToolMaterials.EXPOSED_COPPER, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.EXPOSED_COPPER,1.5f, -3.0f))));
    public static final Item EXPOSED_COPPER_PICKAXE = register("exposed_copper_pickaxe", new PickaxeItem(ModToolMaterials.EXPOSED_COPPER, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.EXPOSED_COPPER,1.0f, -2.8f))));
    public static final Item EXPOSED_COPPER_AXE = register("exposed_copper_axe", new AxeItem(ModToolMaterials.EXPOSED_COPPER, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.EXPOSED_COPPER,6.0f, -3.1f))));
    public static final Item EXPOSED_COPPER_HOE = register("exposed_copper_hoe", new HoeItem(ModToolMaterials.EXPOSED_COPPER, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.EXPOSED_COPPER,-2.0f, -1.0f))));
    public static final Item WEATHERED_COPPER_SHOVEL = register("weathered_copper_shovel", new ShovelItem(ModToolMaterials.WEATHERED_COPPER, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WEATHERED_COPPER,1.5f, -3.0f))));
    public static final Item WEATHERED_COPPER_PICKAXE = register("weathered_copper_pickaxe", new PickaxeItem(ModToolMaterials.WEATHERED_COPPER, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WEATHERED_COPPER,1.0f, -2.8f))));
    public static final Item WEATHERED_COPPER_AXE = register("weathered_copper_axe", new AxeItem(ModToolMaterials.WEATHERED_COPPER, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WEATHERED_COPPER,6.0f, -3.1f))));
    public static final Item WEATHERED_COPPER_HOE = register("weathered_copper_hoe", new HoeItem(ModToolMaterials.WEATHERED_COPPER, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WEATHERED_COPPER,-2.0f, -1.0f))));
    public static final Item OXIDIZED_COPPER_SHOVEL = register("oxidized_copper_shovel", new ShovelItem(ModToolMaterials.OXIDIZED_COPPER, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OXIDIZED_COPPER,1.5f, -3.0f))));
    public static final Item OXIDIZED_COPPER_PICKAXE = register("oxidized_copper_pickaxe", new PickaxeItem(ModToolMaterials.OXIDIZED_COPPER, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OXIDIZED_COPPER,1.0f, -2.8f))));
    public static final Item OXIDIZED_COPPER_AXE = register("oxidized_copper_axe", new AxeItem(ModToolMaterials.OXIDIZED_COPPER, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.OXIDIZED_COPPER,6.0f, -3.1f))));
    public static final Item OXIDIZED_COPPER_HOE = register("oxidized_copper_hoe", new HoeItem(ModToolMaterials.OXIDIZED_COPPER, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.OXIDIZED_COPPER,-2.0f, -1.0f))));

    // Armor
    public static final Item COPPER_HELMET = register("copper_helmet", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.COPPER_DURABILITY))));
    public static final Item COPPER_CHESTPLATE = register("copper_chestplate", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.COPPER_DURABILITY))));
    public static final Item COPPER_LEGGINGS = register("copper_leggings", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.COPPER_DURABILITY))));
    public static final Item COPPER_BOOTS = register("copper_boots", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.COPPER_DURABILITY))));
    public static final Item EXPOSED_COPPER_HELMET = register("exposed_copper_helmet", new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.EXPOSED_COPPER_DURABILITY))));
    public static final Item EXPOSED_COPPER_CHESTPLATE = register("exposed_copper_chestplate", new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.EXPOSED_COPPER_DURABILITY))));
    public static final Item EXPOSED_COPPER_LEGGINGS = register("exposed_copper_leggings", new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.EXPOSED_COPPER_DURABILITY))));
    public static final Item EXPOSED_COPPER_BOOTS = register("exposed_copper_boots", new ArmorItem(ModArmorMaterials.EXPOSED_COPPER, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.EXPOSED_COPPER_DURABILITY))));
    public static final Item WEATHERED_COPPER_HELMET = register("weathered_copper_helmet", new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.WEATHERED_COPPER_DURABILITY))));
    public static final Item WEATHERED_COPPER_CHESTPLATE = register("weathered_copper_chestplate", new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.WEATHERED_COPPER_DURABILITY))));
    public static final Item WEATHERED_COPPER_LEGGINGS = register("weathered_copper_leggings", new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.WEATHERED_COPPER_DURABILITY))));
    public static final Item WEATHERED_COPPER_BOOTS = register("weathered_copper_boots", new ArmorItem(ModArmorMaterials.WEATHERED_COPPER, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.WEATHERED_COPPER_DURABILITY))));
    public static final Item OXIDIZED_COPPER_HELMET = register("oxidized_copper_helmet", new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.OXIDIZED_COPPER_DURABILITY))));
    public static final Item OXIDIZED_COPPER_CHESTPLATE = register("oxidized_copper_chestplate", new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.OXIDIZED_COPPER_DURABILITY))));
    public static final Item OXIDIZED_COPPER_LEGGINGS = register("oxidized_copper_leggings", new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.OXIDIZED_COPPER_DURABILITY))));
    public static final Item OXIDIZED_COPPER_BOOTS = register("oxidized_copper_boots", new ArmorItem(ModArmorMaterials.OXIDIZED_COPPER, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.OXIDIZED_COPPER_DURABILITY))));

    // Horse Armor
    public static final Item COPPER_HORSE_ARMOR = register(
            "copper_horse_armor", new AnimalArmorItem(ModArmorMaterials.COPPER, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
    public static final Item EXPOSED_COPPER_HORSE_ARMOR = register(
            "exposed_copper_horse_armor", new AnimalArmorItem(ModArmorMaterials.EXPOSED_COPPER, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
    public static final Item WEATHERED_COPPER_HORSE_ARMOR = register(
            "weathered_copper_horse_armor", new AnimalArmorItem(ModArmorMaterials.WEATHERED_COPPER, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
    public static final Item OXIDIZED_COPPER_HORSE_ARMOR = register(
            "oxidized_copper_horse_armor", new AnimalArmorItem(ModArmorMaterials.OXIDIZED_COPPER, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    // Miscellaneous items
    public static final Item EXPOSED_COPPER_INGOT = register("exposed_copper_ingot", new Item(new Item.Settings()));
    public static final Item WEATHERED_COPPER_INGOT = register("weathered_copper_ingot", new Item(new Item.Settings()));
    public static final Item OXIDIZED_COPPER_INGOT = register("oxidized_copper_ingot", new Item(new Item.Settings()));
    public static final Item COPPER_NUGGET = register("copper_nugget", new Item(new Item.Settings()));
    public static final Item EXPOSED_COPPER_NUGGET = register("exposed_copper_nugget", new Item(new Item.Settings()));
    public static final Item WEATHERED_COPPER_NUGGET = register("weathered_copper_nugget", new Item(new Item.Settings()));
    public static final Item OXIDIZED_COPPER_NUGGET = register("oxidized_copper_nugget", new Item(new Item.Settings()));
    public static final Item EXPOSED_COPPER_BRUSH = register("exposed_copper_brush", new BrushItem(new Item.Settings().maxDamage(96)));
    public static final Item WEATHERED_COPPER_BRUSH = register("weathered_copper_brush", new BrushItem(new Item.Settings().maxDamage(128)));
    public static final Item OXIDIZED_COPPER_BRUSH = register("oxidized_copper_brush", new BrushItem(new Item.Settings().maxDamage(160)));
    public static final Item COPPER_UPGRADE_SMITHING_TEMPLATE = register("copper_upgrade_smithing_template", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.purecoppertools.copper_upgrade_smithing_template_2"));
            tooltip.add(Text.translatable("item.purecoppertools.blank_line"));
            tooltip.add(Text.translatable("item.purecoppertools.applies_to"));
            tooltip.add(Text.translatable("item.purecoppertools.leather_horse_armor"));
            tooltip.add(Text.translatable("item.purecoppertools.ingredients"));
            tooltip.add(Text.translatable("item.purecoppertools.copper_upgrade_smithing_template_4"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item EXPOSED_COPPER_UPGRADE_SMITHING_TEMPLATE = register("exposed_copper_upgrade_smithing_template", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.purecoppertools.exposed_copper_upgrade_smithing_template_2"));
            tooltip.add(Text.translatable("item.purecoppertools.blank_line"));
            tooltip.add(Text.translatable("item.purecoppertools.applies_to"));
            tooltip.add(Text.translatable("item.purecoppertools.leather_horse_armor"));
            tooltip.add(Text.translatable("item.purecoppertools.ingredients"));
            tooltip.add(Text.translatable("item.purecoppertools.exposed_copper_upgrade_smithing_template_4"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item WEATHERED_COPPER_UPGRADE_SMITHING_TEMPLATE = register("weathered_copper_upgrade_smithing_template", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.purecoppertools.weathered_copper_upgrade_smithing_template_2"));
            tooltip.add(Text.translatable("item.purecoppertools.blank_line"));
            tooltip.add(Text.translatable("item.purecoppertools.applies_to"));
            tooltip.add(Text.translatable("item.purecoppertools.leather_horse_armor"));
            tooltip.add(Text.translatable("item.purecoppertools.ingredients"));
            tooltip.add(Text.translatable("item.purecoppertools.weathered_copper_upgrade_smithing_template_4"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item OXIDIZED_COPPER_UPGRADE_SMITHING_TEMPLATE = register("oxidized_copper_upgrade_smithing_template", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.purecoppertools.oxidized_copper_upgrade_smithing_template_2"));
            tooltip.add(Text.translatable("item.purecoppertools.blank_line"));
            tooltip.add(Text.translatable("item.purecoppertools.applies_to"));
            tooltip.add(Text.translatable("item.purecoppertools.leather_horse_armor"));
            tooltip.add(Text.translatable("item.purecoppertools.ingredients"));
            tooltip.add(Text.translatable("item.purecoppertools.oxidized_copper_upgrade_smithing_template_4"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    // Helper method for registering an item.
    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PureCopperTools.MOD_ID, id), item);
    }

    // Class initializer called from the entrypoint.
    public static void init() {
    }
}
