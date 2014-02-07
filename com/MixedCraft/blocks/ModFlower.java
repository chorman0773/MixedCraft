package com.MixedCraft.blocks;

import com.MixedCraft.helper.Utils;

import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class ModFlower extends BlockFlower {

	String t;
	
	public ModFlower(int par1, String tex) {
		super(par1);
		t = tex;
	}
	
	@Override
	public void registerIcons(IIconRegister IIcon) {
		blockIcon = IIcon.registerIcon(Utils.MOD_ID + ":" + t);
	}

}
