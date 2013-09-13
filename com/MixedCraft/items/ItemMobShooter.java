package com.MixedCraft.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.MixedCraft.helper.ItemsBase;

public class ItemMobShooter extends ItemsBase {
	
	public ItemMobShooter(int par1) {
		super(par1);
		setMaxStackSize(1);
		setUnlocalizedName("Wand");
	}
	
	@Override
	public boolean func_111207_a(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if(!target.worldObj.isRemote){
			target.motionY = 4;
			if(isCharged(itemstack.getItemDamage())){
				target.motionX = (target.posX - player.posX) * 2;
				target.motionZ = (target.posZ - player.posZ) * 2;
				
				itemstack.setItemDamage(0);
			}else{
				itemstack.setItemDamage(itemstack.getItemDamage() + 1);
			}
		}
		return false;
	}

	private boolean isCharged(int itemDamage){
		return false;
	}

}
