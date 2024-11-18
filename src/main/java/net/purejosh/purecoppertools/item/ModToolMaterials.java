package net.purejosh.purecoppertools.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 150, 6.0F, 2.0F,
            22, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    EXPOSED_COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 183, 6.0F, 2.0F,
            18, () -> Ingredient.ofItems(ModItems.EXPOSED_COPPER_INGOT)),
    WEATHERED_COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 217, 6.0F, 2.0F,
            14, () -> Ingredient.ofItems(ModItems.WEATHERED_COPPER_INGOT)),
    OXIDIZED_COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6.0F, 2.0F,
            10, () -> Ingredient.ofItems(ModItems.OXIDIZED_COPPER_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}