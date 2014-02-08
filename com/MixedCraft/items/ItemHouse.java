package com.MixedCraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.MixedCraft.helper.ItemsBase;


public class ItemHouse extends ItemsBase
{

	public ItemHouse() {
		super("");
		registerTextures("House");
		setUnlocalizedName("House");
	}

/*
	@SuppressWarnings("unused")
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World var1, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		if(!var1.isRemote)
		{
			int direction = MathHelper.floor_double((double)(par2EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

			if(direction == 1 || direction == 3)
			{
				for(int par1 = 1; par1 < 5; par1++)
				{
					for (int par2 = -1; par2 < 2; par2++)
					{
						if(var1.getBlock(x, y + par1, z + par2) != 0)
						{
							par2EntityPlayer.addChatMessage("Cant place the house");
							return false;


						}
					}
				}

				var1.setBlock(x+0, y+0, z+-1, 5);
				var1.setBlock(x+0, y+0, z+-2, 5);
				var1.setBlock(x+0, y+0, z+-3, 5);
				var1.setBlock(x+0, y+0, z+-4, 5);
				var1.setBlock(x+0, y+1, z+0, 5);
				var1.setBlock(x+0, y+1, z+-1, 5);
				var1.setBlock(x+0, y+1, z+-2, 5);
				var1.setBlock(x+0, y+1, z+-3, 5);
				var1.setBlock(x+0, y+1, z+-4, 5);
				var1.setBlock(x+0, y+2, z+0, 20);
				var1.setBlock(x+0, y+2, z+-1, 20);
				var1.setBlock(x+0, y+2, z+-2, 20);
				var1.setBlock(x+0, y+2, z+-3, 20);
				var1.setBlock(x+0, y+2, z+-4, 20);
				var1.setBlock(x+0, y+3, z+0, 57);
				var1.setBlock(x+0, y+3, z+-1, 57);
				var1.setBlock(x+0, y+3, z+-2, 57);
				var1.setBlock(x+0, y+3, z+-3, 57);
				var1.setBlock(x+0, y+3, z+-4, 57);
				var1.setBlock(x+0, y+4, z+0, 0);
				var1.setBlock(x+0, y+4, z+-1, 0);
				var1.setBlock(x+0, y+4, z+-2, 0);
				var1.setBlock(x+0, y+4, z+-3, 0);
				var1.setBlock(x+0, y+4, z+-4, 0);
				var1.setBlock(x+1, y+0, z+0, 5);
				var1.setBlock(x+1, y+0, z+-1, 5);
				var1.setBlock(x+1, y+0, z+-2, 5);
				var1.setBlock(x+1, y+0, z+-3, 5);
				var1.setBlock(x+1, y+0, z+-4, 5);
				var1.setBlock(x+1, y+1, z+0, 5);
				var1.setBlock(x+1, y+1, z+-1, 0);
				var1.setBlock(x+1, y+1, z+-2, 0);
				var1.setBlock(x+1, y+1, z+-3, 0);
				var1.setBlock(x+1, y+1, z+-4, 5);
				var1.setBlock(x+1, y+2, z+0, 20);
				var1.setBlock(x+1, y+2, z+-1, 0);
				var1.setBlock(x+1, y+2, z+-2, 0);
				var1.setBlock(x+1, y+2, z+-3, 0);
				var1.setBlock(x+1, y+2, z+-4, 20);
				var1.setBlock(x+1, y+3, z+0, 57);
				var1.setBlock(x+1, y+3, z+-1, 0);
				var1.setBlock(x+1, y+3, z+-2, 0);
				var1.setBlock(x+1, y+3, z+-3, 0);
				var1.setBlock(x+1, y+3, z+-4, 57);
				var1.setBlock(x+1, y+4, z+0, 0);
				var1.setBlock(x+1, y+4, z+-1, 57);
				var1.setBlock(x+1, y+4, z+-2, 57);
				var1.setBlock(x+1, y+4, z+-3, 57);
				var1.setBlock(x+1, y+4, z+-4, 0);
				var1.setBlock(x+2, y+0, z+0, 5);
				var1.setBlock(x+2, y+0, z+-1, 5);
				var1.setBlock(x+2, y+0, z+-2, 5);
				var1.setBlock(x+2, y+0, z+-3, 5);
				var1.setBlock(x+2, y+0, z+-4, 5);
				var1.setBlock(x+2, y+1, z+0, 5);
				var1.setBlock(x+2, y+1, z+-1, 0);
				var1.setBlock(x+2, y+1, z+-2, 85);
				var1.setBlock(x+2, y+1, z+-3, 0);
				var1.setBlock(x+2, y+1, z+-4, 5);
				var1.setBlock(x+2, y+2, z+0, 20);
				var1.setBlock(x+2, y+2, z+-1, 0);
				var1.setBlock(x+2, y+2, z+-2, 72);
				var1.setBlock(x+2, y+2, z+-3, 0);
				var1.setBlock(x+2, y+2, z+-4, 20);
				var1.setBlock(x+2, y+3, z+0, 57);
				var1.setBlock(x+2, y+3, z+-1, 0);
				var1.setBlock(x+2, y+3, z+-2, 0);
				var1.setBlock(x+2, y+3, z+-3, 0);
				var1.setBlock(x+2, y+3, z+-4, 57);
				var1.setBlock(x+2, y+4, z+0, 0);
				var1.setBlock(x+2, y+4, z+-1, 57);
				var1.setBlock(x+2, y+4, z+-2, 69);
				var1.setBlock(x+2, y+4, z+-3, 57);
				var1.setBlock(x+2, y+4, z+-4, 0);
				var1.setBlock(x+3, y+0, z+0, 5);
				var1.setBlock(x+3, y+0, z+-1, 5);
				var1.setBlock(x+3, y+0, z+-2, 5);
				var1.setBlock(x+3, y+0, z+-3, 5);
				var1.setBlock(x+3, y+0, z+-4, 5);
				var1.setBlock(x+3, y+1, z+0, 5);
				var1.setBlock(x+3, y+1, z+-1, 0);
				var1.setBlock(x+3, y+1, z+-2, 0);
				var1.setBlock(x+3, y+1, z+-3, 0);
				var1.setBlock(x+3, y+1, z+-4, 5);
				var1.setBlock(x+3, y+2, z+0, 20);
				var1.setBlock(x+3, y+2, z+-1, 0);
				var1.setBlock(x+3, y+2, z+-2, 0);
				var1.setBlock(x+3, y+2, z+-3, 0);
				var1.setBlock(x+3, y+2, z+-4, 20);
				var1.setBlock(x+3, y+3, z+0, 57);
				var1.setBlock(x+3, y+3, z+-1, 0);
				var1.setBlock(x+3, y+3, z+-2, 0);
				var1.setBlock(x+3, y+3, z+-3, 0);
				var1.setBlock(x+3, y+3, z+-4, 57);
				var1.setBlock(x+3, y+4, z+0, 0);
				var1.setBlock(x+3, y+4, z+-1, 57);
				var1.setBlock(x+3, y+4, z+-2, 57);
				var1.setBlock(x+3, y+4, z+-3, 57);
				var1.setBlock(x+3, y+4, z+-4, 0);
				var1.setBlock(x+4, y+0, z+0, 5);
				var1.setBlock(x+4, y+0, z+-1, 5);
				var1.setBlock(x+4, y+0, z+-2, 5);
				var1.setBlock(x+4, y+0, z+-3, 5);
				var1.setBlock(x+4, y+0, z+-4, 5);
				var1.setBlock(x+4, y+1, z+0, 5);
				var1.setBlock(x+4, y+1, z+-1, 5);
				var1.setBlock(x+4, y+1, z+-2, 5);
				var1.setBlock(x+4, y+1, z+-3, 5);
				var1.setBlock(x+4, y+1, z+-4, 5);
				var1.setBlock(x+4, y+2, z+0, 20);
				var1.setBlock(x+4, y+2, z+-1, 20);
				var1.setBlock(x+4, y+2, z+-2, 20);
				var1.setBlock(x+4, y+2, z+-3, 20);
				var1.setBlock(x+4, y+2, z+-4, 20);
				var1.setBlock(x+4, y+3, z+0, 57);
				var1.setBlock(x+4, y+3, z+-1, 57);
				var1.setBlock(x+4, y+3, z+-2, 57);
				var1.setBlock(x+4, y+3, z+-3, 57);
				var1.setBlock(x+4, y+3, z+-4, 57);
				var1.setBlock(x+4, y+4, z+0, 0);
				var1.setBlock(x+4, y+4, z+-1, 0);
				var1.setBlock(x+4, y+4, z+-2, 0);
				var1.setBlock(x+4, y+4, z+-3, 0);
				var1.setBlock(x+4, y+4, z+-4, 0);

			}
			else
			{
				for(int par1 = 1; par1 < 5; par1++)
				{
					for (int par2 = -1; par2 < par2; par2++)
					{
						if(var1.getBlock(x + par1, y + par2, z) != 0);
						{
							par2EntityPlayer.addChatMessage("Cant place the house");
							return false;
						}
					}
				}
			}
			return true;
		}else{
			return false;
		}
	}*/
}
