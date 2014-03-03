package com.MixedCraft.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.ItemsBase;

public class ItemWindmill extends ItemsBase{

	public ItemWindmill() {
		setCreativeTab(MixedCraft.BlockTab);
	}

	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float x2, float y2, float z2) {
		if(!world.isRemote){
			if(!player.isSneaking() && isPlacable(world, x, y, z)){
				if(side == 1)
					world.setBlock(x, y + 1, z, BlockHelper.windmill);				
				if(!player.capabilities.isCreativeMode)
					item.stackSize--;
				return true;
			}
		}
		return false;
	}

	public boolean isPlacable(World w, int x, int y, int z){
		Block wind = BlockHelper.windmillBase;
		if(w.getBlock(x, y, z) == wind && w.getBlock(x + 1, y, z) == wind && w.getBlock(x, y, z + 1) == wind && w.getBlock(x + 1, y, z + 1) == wind 
				&& w.getBlock(x - 1, y, z - 1) == wind && w.getBlock(x - 1, y, z) == wind && w.getBlock(x, y, z - 1) == wind && w.getBlock(x + 1, y, z - 1) == wind
				&& w.getBlock(x - 1, y, z + 1) == wind){
			return true;
		} else {
			return false;
		}
	}
}