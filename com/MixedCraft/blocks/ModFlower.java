package com.MixedCraft.blocks;

import com.MixedCraft.helper.Utils;

import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class ModFlower extends BlockFlower {

	String t;
	
	public ModFlower(int par1, String tex) {
		super(par1);
		t = tex;
	}
	
	@Override
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(Utils.MOD_ID + ":" + t);
	}

}
