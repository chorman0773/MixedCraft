package com.MixedCraft.recipes;

import com.MixedCraft.ItemHelper;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InputFurnaceRecipes
{
    public InputFurnaceRecipes()
    {
    }

    public static ItemStack getSmeltingResult(Item i, Item j)
    {
        return getOutput(i, j);
    }

    private static ItemStack getOutput(Item i, Item j)
    {
        if (i == Items.coal && j == Items.iron_ingot || i == Items.iron_ingot && j == Items.coal)
        {
            return new ItemStack(Items.gold_ingot, 1);
        }
        if (i == ItemHelper.GoldHandsaw && j == ItemHelper.DiamondHandsaw || i == ItemHelper.DiamondHandsaw && j == ItemHelper.GoldHandsaw)
        {
            return new ItemStack(Items.gold_ingot, 1);
        }
		return null;
    }
}