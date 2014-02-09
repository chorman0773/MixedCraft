package com.MixedCraft.blocks;

import com.MixedCraft.helper.Utils;

import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class ModFlower extends BlockFlower {
	
	public ModFlower(int wut, String tex) {
		super(wut);
		setBlockTextureName(Utils.MOD_ID + ":" + tex);
	}

}
