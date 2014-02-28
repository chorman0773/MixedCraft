package com.MixedCraft.items.DNA.spawner;

import com.MixedCraft.entity.EntityChickenCow;
import com.MixedCraft.entity.EntityCowCreeper;
import com.MixedCraft.entity.EntityCowPig;
import com.MixedCraft.entity.EntityCowSheep;
import com.MixedCraft.helper.ItemsBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCreeperPlacer extends ItemsBase
{
	private World worldObj;

	public ItemCreeperPlacer()
	{
		super();
	}


	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		int var4 = 0;
		if (!par3World.isRemote)
		{
			while (var4 < 1) 
			{
				EntityCowCreeper var5 = new EntityCowCreeper(par3World);
				var5.setPosition(par4, par5+1, par6);
				par3World.spawnEntityInWorld(var5);
				++var4;
			}
		}
		if(par3World.isRemote)
			--par1ItemStack.stackSize;
		par2EntityPlayer.inventory.consumeInventoryItem(this);

		return true;
	}

}