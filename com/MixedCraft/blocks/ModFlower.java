package com.MixedCraft.blocks;

import net.minecraft.block.BlockBush;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.Utils;

public class ModFlower extends BlockBush {
	
	public ModFlower(String tex) {
		super();
		setBlockTextureName(Utils.MOD_ID + ":" + tex);
		setCreativeTab(MixedCraft.BlockTab);
	}

}
