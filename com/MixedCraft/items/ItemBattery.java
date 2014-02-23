package com.MixedCraft.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.ItemsBase;

public class ItemBattery extends ItemPower{

	public ItemBattery(int power) {
		super(power);
	}

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add(par1ItemStack.getMaxDamage() - getDamage(par1ItemStack) + " Power left");
	}

}
