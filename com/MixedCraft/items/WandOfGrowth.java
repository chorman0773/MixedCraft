package com.MixedCraft.items;

import com.MixedCraft.helper.ManaHelper;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WandOfGrowth extends ItemBaseWand {

	public static int cooldown = 10;
	
	public static int defaultCharges = 100;
	
	public WandOfGrowth(String par2) {
		super(par2);
        this.setMaxDamage(defaultCharges + 1);
	}

	@Override 
	public int getUseCost() {
		return 1;
	}

	@Override 
	public int getBaseRepairCost() {
		return 7;
	}
	
	@Override public boolean onItemUse(ItemStack srcItemStack, EntityPlayer playerEntity, World world, int targetX, int targetY, int targetZ, int par7, float par8, float par9, float par10){
		if (!playerEntity.capabilities.isCreativeMode)
        {
        	if(isOutOfCharge(srcItemStack)){

        		playSound(noChargeAttackSound,world,playerEntity);
        		return true;
        	}
        }
		boolean success = growBlock(playerEntity,world,targetX,targetY,targetZ);
		if(success){
			if (!playerEntity.capabilities.isCreativeMode)
	        {
	        	srcItemStack.damageItem(getUseCost(), playerEntity);
	        }
		}
		return success;
		
	}
	
	protected boolean growBlock(EntityPlayer playerEntity, World world, int targetX, int targetY, int targetZ){

		int target = world.getBlock(targetX, targetY, targetZ);
		ItemStack fauxItemStack = new ItemStack(Item.dyePowder);
		
		if(target == Block.cactus.block && ManaHelper.useBar(playerEntity, 10)){

			int y = targetY+1;
			while(world.getBlock(targetX, y, targetZ) == Block.cactus.block){
				y++;
			}
			if(world.getBlock(targetX, y, targetZ) == 0){

				world.setBlock(targetX, y, targetZ, Block.cactus.block);
			}
			return true;
		} else if(target == Block.reed.block && ManaHelper.useBar(playerEntity, 10)){

			int y = targetY+1;
			while(world.getBlock(targetX, y, targetZ) == Block.reed.block){
				y++;
			}
			if(world.getBlock(targetX, y, targetZ) == 0){

				world.setBlock(targetX, y, targetZ, Block.reed.block);
			}
			return true;
		} else if(target == Block.cobblestone.block && ManaHelper.useBar(playerEntity, 10)){

			world.setBlock(targetX, targetY, targetZ, Block.cobblestoneMossy.block);
			return true;
		} else if(target == Block.stoneBrick.block && ManaHelper.useBar(playerEntity, 10)){
			if( world.getBlockMetadata(targetX, targetY, targetZ) == 0){

				world.setBlockMetadataWithNotify(targetX, targetY, targetZ, 1, 3);
				return true;
			}
		}
		return ItemDye.applyBonemeal(fauxItemStack, world, targetX, targetY, targetZ, playerEntity);
		
	}

}
