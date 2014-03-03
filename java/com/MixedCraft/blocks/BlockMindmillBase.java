package com.MixedCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.helper.BlocksBase;

public class BlockMindmillBase extends BlocksBase{

	public BlockMindmillBase() {
		super(Material.rock);
		setBlockBounds(0, 0, 0, 1, 0.3F, 1);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void onBlockAdded(World w, int x, int y, int z) {

	}

	/*@Override
	public void onBlockPlacedBy(World w, int x, int y, int z, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
		Block wind = BlockHelper.windmillBase;
		if(w.getBlock(x, y, z) == wind && w.getBlock(x + 1, y, z) == wind && w.getBlock(x, y, z + 1) == wind && w.getBlock(x + 1, y, z + 1) == wind  && w.getBlock(x - 1, y, z - 1) == wind && w.getBlock(x - 1, y, z) == wind && w.getBlock(x, y, z - 1) == wind && w.getBlock(x + 1, y, z - 1) == wind
				&& w.getBlock(x - 1, y, z + 1) == wind){
			w.setBlock(x, y, z, BlockHelper.BigCrafting);
			w.setBlock(x + 1, y, z, Blocks.air);
			w.setBlock(x, y, z + 1, Blocks.air);
			w.setBlock(x + 1, y, z + 1, Blocks.air);
			w.setBlock(x - 1, y, z - 1, Blocks.air);
			w.setBlock(x - 1, y, z, Blocks.air);
			w.setBlock(x, y, z - 1, Blocks.air);
			w.setBlock(x + 1, y, z - 1, Blocks.air);
			w.setBlock(x - 1, y, z + 1, Blocks.air);
		}
	}*/

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

}