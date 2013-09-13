package com.MixedCraft.recipes;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class RecipeSorterBig implements Comparator{

	final CraftingBigManager BigCraftingManager;

	RecipeSorterBig(CraftingBigManager par1BigCraftingManager)
	{
	         this.BigCraftingManager = par1BigCraftingManager;
	}

	public int compareRecipes(IRecipe par1IRecipe, IRecipe par2IRecipe)
	{
	return par1IRecipe instanceof BigShapelessRecipes && par2IRecipe instanceof BigShapedRecipes ? 1 : (par2IRecipe instanceof BigShapelessRecipes && par1IRecipe instanceof BigShapedRecipes ? -1 : (par2IRecipe.getRecipeSize() < par1IRecipe.getRecipeSize() ? -1 : (par2IRecipe.getRecipeSize() > par1IRecipe.getRecipeSize() ? 1 : 0)));
	}

	public int compare(Object par1Obj, Object par2Obj)
	{
		return this.compareRecipes((IRecipe)par1Obj, (IRecipe)par2Obj);
	}
}