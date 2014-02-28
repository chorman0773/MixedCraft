package com.MixedCraft.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.ItemsBase;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDNABase extends ItemsBase{

	private String[] descriptors;
	private int Gui;

	public ItemDNABase(int Gui){
		super();
		this.Gui = Gui;
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3) {
		var3.openGui(MixedCraft.instance, Gui, var2, 0, 0, 0);
		return var1;
	}

	public ItemDNABase setDescription(String[] descs) {
		descriptors = descs;
		return this;
	}

	@Override 
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		for (String desc : descriptors) {
			par3List.add(desc);
		}
	}
}