package com.MixedCraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.MixedCraft.ItemHelper;
import com.MixedCraft.blocks.container.BlockModContainer;
import com.MixedCraft.blocks.tileEntity.TileEntityWindmill;

public class BlockWindmill extends BlockModContainer{

	public BlockWindmill() {
		super(Material.wood);
	}

	@Override
	public Item getItem(World world, int x, int y, int z) {
		return ItemHelper.itemWindmill;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	/*@Override
	public int getRenderType() {
		return -1;
	}*/

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityWindmill();
	}
}