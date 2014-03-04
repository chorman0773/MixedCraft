package com.MixedCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.BlocksBase;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModLog extends BlocksBase{

	public ModLog() {
		super(Material.wood);
		setStepSound(soundTypeWood);
		setHardness(1.5F);
		setCreativeTab(MixedCraft.BlockTab);
	}
	
	public Block setName(String name){
		GameRegistry.registerBlock(this, name);
		setBlockName(name);
		registerTexture(name + "_Side", name + "_Top", name + "_Top");
		return this;
	}

	@Override
	public boolean isWood(IBlockAccess world, int x, int y, int z) {
		return true;
	}

	@Override
	public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
		return true;
	}

	public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
	{
		int j1 = par9 & 3;
		byte b0 = 0;
		switch (par5) {
		case 0:
		case 1:
			b0 = 0;
			break;
		case 2:
		case 3:
			b0 = 8;
			break;
		case 4:
		case 5:
			b0 = 4;
		}
		return j1 | b0;
	}
}
