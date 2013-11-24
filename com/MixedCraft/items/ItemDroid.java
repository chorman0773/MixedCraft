package com.MixedCraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.MixedCraft.entity.EntityDroid;
import com.MixedCraft.helper.ItemsBase;

public class ItemDroid extends ItemsBase{

	public ItemDroid(int ID){
		super(ID, "");
		setUnlocalizedName("DroidItem");
	}
	
	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ){
		if(!world.isRemote){
			world.spawnEntityInWorld(new EntityDroid(world, x + 0.5, y + 1.5, z + 0.5));
			stack.stackSize--;
			return true;
		}else{
			return false;
		}
	}
	
}
