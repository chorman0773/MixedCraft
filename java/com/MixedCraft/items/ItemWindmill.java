package com.MixedCraft.items;

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
			if(!player.isSneaking()){
				if(side == 1)
					world.setBlock(x, y + 1, z, BlockHelper.windmill);
				if(side == 2)
					world.setBlock(x, y, z - 1, BlockHelper.windmill);
				if(side == 3)
					world.setBlock(x, y, z + 1, BlockHelper.windmill);
				if(side == 4)
					world.setBlock(x - 1, y, z, BlockHelper.windmill);
				if(side == 5)
					world.setBlock(x + 1, y, z, BlockHelper.windmill);
				System.out.println(side);
				
				if(!player.capabilities.isCreativeMode)
					item.stackSize--;
				return true;
			}
		}
		return false;
	}
}