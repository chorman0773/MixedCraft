package com.MixedCraft.gui;

import com.MixedCraft.ItemHelper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SpawnerTab extends CreativeTabs {

	public SpawnerTab(String label) {
		super(label);
		
	}
	

	public ItemStack getIconItemStack() { 
	return new ItemStack(ItemHelper.CowChickenSpawner);

	}

}
