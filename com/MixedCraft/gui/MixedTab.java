package com.MixedCraft.gui;

import com.MixedCraft.ItemHelper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MixedTab extends CreativeTabs {

	public MixedTab(String label) {
		super(label);
		
	}
	

	public ItemStack getIconItemStack() { 
	return new ItemStack(ItemHelper.CowBlazeMixedDrive);

	}

}
