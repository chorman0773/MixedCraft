package com.MixedCraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.ItemsBase;

public abstract class ItemBaseWand extends ItemsBase {
	
	public static String noChargeAttackSound = "random.bow";

	public ItemBaseWand(String par1) {
		super(par1);
		this.maxStackSize = 1;
		this.setCreativeTab(MixedCraft.MiscTab);
	}

	public abstract int getUseCost();

	@Override 
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.block;
	}

	@Override 
	public boolean getIsRepairable(ItemStack stack, ItemStack mat) {
		return mat.getItem() == Items.gold_ingot;
	}
	
	public boolean isOutOfCharge(ItemStack stack){
		return stack.getItemDamage() >= (stack.getMaxDamage() - getUseCost());
	}
	
	protected void playSound(String sound, World world, EntityPlayer playerEntity){
		if (!world.isRemote)
		{
			world.playSoundAtEntity(playerEntity, sound, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		}
	}

	public abstract int getBaseRepairCost();

}
