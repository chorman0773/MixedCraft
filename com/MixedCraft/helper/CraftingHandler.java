package com.MixedCraft.helper;

import com.MixedCraft.Achievements;
import com.MixedCraft.BlockHelper;
import com.MixedCraft.ItemHelper;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler {

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		
		if (item.itemID == BlockHelper.Extractor.blockID)
		{
			player.addStat(Achievements.Extractor, 1);
		}
		
		if (item.itemID == BlockHelper.Mixer.blockID)
		{
			player.addStat(Achievements.Mixer, 1);
		}
		
		if (item.itemID == BlockHelper.Assembler.blockID)
		{
			player.addStat(Achievements.Assembler, 1);
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		
		if (item.itemID == ItemHelper.CopperIngot.itemID)
		{
			player.addStat(Achievements.Copper, 1);
		}
		
		if (item.itemID == ItemHelper.TinIngot.itemID)
		{
			player.addStat(Achievements.Tin, 1);
		}
	}
}

