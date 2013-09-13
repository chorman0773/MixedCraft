package com.MixedCraft.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.MixedCraft.helper.ItemsBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMixedBase extends ItemsBase{

	private String[] descriptors;
	
	  public ItemMixedBase(int par1) {
		super(par1);
		
	}
	  
	  public ItemMixedBase setDescription(String[] desc) {
	        descriptors = desc;
	        return this;
	    }
	
	    @Override
	    @SideOnly(Side.CLIENT)
	    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	    {
	        for (String desc : descriptors) {
	            par3List.add(desc);
	        }
	    }
}
