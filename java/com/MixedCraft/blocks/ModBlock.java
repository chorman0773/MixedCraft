package com.MixedCraft.blocks;

import net.minecraft.block.material.Material;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.helper.BlocksBase;

public class ModBlock extends BlocksBase{

	public ModBlock() {
		super(Material.rock);
	}
	
	@Override
	public void setHarvestLevel(String toolClass, int level) {
		if(isOre()){
			setHarvestLevel("pickaxe", 3);
		}
	}
	
	public boolean isOre(){
		if(this == BlockHelper.CopperOre)
			return true;
		if(this == BlockHelper.SilverOre)
			return true;
		if(this == BlockHelper.TinOre)
			return true;
		else
			return false;
	}

}
