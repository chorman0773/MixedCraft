package com.MixedCraft.blocks;

import com.MixedCraft.helper.Utils;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockMixedFlower extends BlockFlower {

	String Name;
	
	public BlockMixedFlower(String par2) {
		super(0);
		Name = par2;
		setBlockName(Name);
	}
	
	
	
	@Override
	public void registerBlockIcons(IIconRegister IIcon) {
		blockIcon = IIcon.registerIcon(Utils.MOD_ID + ":" + Name);
	}

}
