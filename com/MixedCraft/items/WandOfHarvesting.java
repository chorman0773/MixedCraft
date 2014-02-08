package com.MixedCraft.items;

import com.MixedCraft.helper.ManaHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WandOfHarvesting extends ItemBaseWand {

	public static int cooldown = 10;
	
	public static int defaultCharges = 100;
	
	public WandOfHarvesting(String par2) {
		super(par2);
        this.setMaxDamage(defaultCharges + 1);
	}

	@Override 
	public int getUseCost() {
		return 1;
	}

	@Override 
	public int getBaseRepairCost() {
		return 5;
	}

	@Override 
	public boolean onItemUse(ItemStack srcItemStack, EntityPlayer playerEntity, World world, int targetX, int targetY, int targetZ, int par7, float par8, float par9, float par10){
		if(isHarvestable(world,targetX,targetY,targetZ)){
			if (!playerEntity.capabilities.isCreativeMode)
	        {
	        	if(isOutOfCharge(srcItemStack)){

	        		playSound(noChargeAttackSound,world,playerEntity);
	        		return true;
	        	}
	        	srcItemStack.damageItem(getUseCost(), playerEntity);
	        }
			for(int y = targetY+1; y >= targetY-1; y--){
				if(y < 0) continue;
				for(int x = targetX-1; x <= targetX+1; x++){
					for(int z = targetZ-1; z <= targetZ+1; z++){
						harvestBlock(world,x,y,z);
					}
				}
			}
			
			return true;
		}
		return false;
	}
	
	protected void harvestBlock(World w, int x, int y, int z){
		if(isHarvestable(w,x,y,z)){
			w.destroyBlock(x, y, z, true);
		}
	}
	
	protected boolean isHarvestable(World w, int x, int y, int z){
		Material mat = w.getBlockMaterial(x, y, z);

		return mat == Material.cactus || mat == Material.leaves 
				|| mat == Material.plants || mat == Material.pumpkin || mat == Material.vine
				|| mat == Material.web || mat == Material.dragonEgg || mat == Material.wood
				|| mat == Material.sand || mat == Material.cloth || mat == Material.rock
				|| mat == Material.iron || mat == Material.grass || mat == Material.ground;
	}
}
