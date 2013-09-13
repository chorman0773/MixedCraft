package com.MixedCraft.helper;

import java.util.ArrayList;

import com.MixedCraft.recipes.RecipeHelper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;

public class RecipeRemover {
	
    public static void init() { 	
        RecipeHelper.init();
    }
    
    public static void removeRecipes(Item removeThis)
    {
        ItemStack recipeResult = null;
        ArrayList recipes = (ArrayList)CraftingManager.getInstance().getRecipeList();

        for (int i = 0; i < recipes.size(); i++)
        {
            IRecipe tmpRecipe = (IRecipe)recipes.get(i);

            if (tmpRecipe instanceof ShapedRecipes)
            {
                ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(removeThis), recipeResult))
            {
                System.out.println("[MixedCraft] Removed The Recipe: " + recipes.get(i) + " -> " + recipeResult);
                recipes.remove(i);
            }
        }
    }
}
