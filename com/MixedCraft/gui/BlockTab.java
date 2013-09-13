package com.MixedCraft.gui;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.ItemHelper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockTab extends CreativeTabs {

	public BlockTab(String label) {
		super(label);
		
	}
	

	public ItemStack getIconItemStack() { 
	return new ItemStack(BlockHelper.Extractor);

	}

}
