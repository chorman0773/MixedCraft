package com.MixedCraft.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesDisasembler 
{
	public static HashMap<List<Integer>, ItemStack> recipes = new HashMap<List<Integer>, ItemStack>();
	public static HashMap<List<Integer>, Integer> numbero = new HashMap<List<Integer>, Integer>();
	
	public RecipesDisasembler()
	{
		this.recipes();
	}
	
	public static void recipes()
	{
		addRecipe(Item.swordDiamond.itemID, Item.swordDiamond.itemID, 1, new ItemStack(Item.diamond));
	}
	
	public static void addRecipe(int Item1, int Item2, int i, ItemStack item)
	{
		if(Item1 != 0 && item != null)
		{
			recipes.put(Arrays.asList(Item1, Item2, numbero.put(Arrays.asList(Item1, Item2), i)), item);
		}
	}
	
	public static ItemStack getResult(int Item1, int Item2)
	{
		ItemStack item = (ItemStack)recipes.get(Arrays.asList(Item1, Item2, numbero.get(Arrays.asList(Item1, Item2))));
		if(item != null)
			return item;
		else
			return null;
	}
	
	public static int getStackSize(int Item1, int Item2)
	{
		int i = numbero.get(Arrays.asList(Item1, Item2));
		if(i != 0)
			return i;
		else
			return 0;
	}
}
