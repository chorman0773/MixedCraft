package com.MixedCraft.helper;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.ItemHelper;

import net.minecraftforge.common.MinecraftForge;

public class HarvestLevelHelper {

	public static void init(){
		MinecraftForge.setBlockHarvestLevel(BlockHelper.CopperOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(BlockHelper.TinOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(BlockHelper.SilverOre, "pickaxe", 3);
		
		MinecraftForge.setToolClass(ItemHelper.SilverPickaxe, "pickaxe", 3);

	}
	
}
