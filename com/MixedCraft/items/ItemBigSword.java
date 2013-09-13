package com.MixedCraft.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.MixedCraft.items.tools.SwordBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBigSword extends SwordBase{

	public ItemBigSword(int par1, EnumToolMaterial par3enum) {
		super(par1, par3enum);
	}

	  @Override
	    @SideOnly(Side.CLIENT)
	    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	    {
	            par3List.add(EnumChatFormatting.GREEN + "Infinate uses");
	    }
	
}
