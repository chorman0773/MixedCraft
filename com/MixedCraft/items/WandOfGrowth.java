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
	
	public WandOfGrowth(int itemID, String par2) {
		super(itemID, par2);
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

		int targetID = world.getBlockId(targetX, targetY, targetZ);
		ItemStack fauxItemStack = new ItemStack(Item.dyePowder);
		
		if(targetID == Block.cactus.blockID && ManaHelper.useBar(playerEntity, 10)){

			int y = targetY+1;
			while(world.getBlockId(targetX, y, targetZ) == Block.cactus.blockID){
				y++;
			}
			if(world.getBlockId(targetX, y, targetZ) == 0){

				world.setBlock(targetX, y, targetZ, Block.cactus.blockID);
			}
			return true;
		} else if(targetID == Block.reed.blockID && ManaHelper.useBar(playerEntity, 10)){

			int y = targetY+1;
			while(world.getBlockId(targetX, y, targetZ) == Block.reed.blockID){
				y++;
			}
			if(world.getBlockId(targetX, y, targetZ) == 0){

				world.setBlock(targetX, y, targetZ, Block.reed.blockID);
			}
			return true;
		} else if(targetID == Block.cobblestone.blockID && ManaHelper.useBar(playerEntity, 10)){

			world.setBlock(targetX, targetY, targetZ, Block.cobblestoneMossy.blockID);
			return true;
		} else if(targetID == Block.stoneBrick.blockID && ManaHelper.useBar(playerEntity, 10)){
			if( world.getBlockMetadata(targetX, targetY, targetZ) == 0){

				world.setBlockMetadataWithNotify(targetX, targetY, targetZ, 1, 3);
				return true;
			}
		}
		return ItemDye.applyBonemeal(fauxItemStack, world, targetX, targetY, targetZ, playerEntity);
		
	}

}
