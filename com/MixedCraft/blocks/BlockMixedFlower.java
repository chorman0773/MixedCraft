package com.MixedCraft.blocks;

import com.MixedCraft.helper.Utils;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockMixedFlower extends BlockFlower {

	String Name;
	
	public BlockMixedFlower(int par1, String par2) {
		super(par1);
		Name = par2;
		setUnlocalizedName(Name);
	}
	
	
	
	@Override
	public void registerIcons(IIconRegister IIcon) {
		blockIcon = IIcon.registerIcon(Utils.MOD_ID + ":" + Name);
	}

}
