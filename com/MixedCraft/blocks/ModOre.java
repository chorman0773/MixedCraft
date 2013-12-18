package com.MixedCraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.MixedCraft.BlockHelper;

public class ModOre extends ModBlock{

	public ModOre(int blockID) {
		super(blockID);
		setLightValue(0.6F);
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3)
	{
		if(blockID == BlockHelper.Coal.blockID){
			return Item.coal.itemID;
		}
		if(blockID == BlockHelper.Diamond.blockID){
			 return Item.diamond.itemID;
		}
		if(blockID == BlockHelper.Lapis.blockID){
			 return Item.dyePowder.itemID;
		}
		if(blockID == BlockHelper.Emerald.blockID){
			 return Item.emerald.itemID;
		}
		if(blockID == BlockHelper.Iron.blockID){
			 return blockID;
		}
		if(blockID == BlockHelper.Gold.blockID){
			return blockID;
		}
		if(blockID == BlockHelper.Redstone.blockID){
			 return Item.redstone.itemID;
		}
		return 0;
	}

	public int quantityDropped(Random par1Random) {
		if(blockID == BlockHelper.Lapis.blockID){
			return blockID == BlockHelper.Lapis.blockID ? 4 + par1Random.nextInt(5) : 1;
		}
		if(blockID == BlockHelper.Redstone.blockID){
			return 4 + par1Random.nextInt(2);
		}
		return 1;
	}
	
	 @Override
	    public int getExpDrop(World par1World, int par5, int par7)
	    {
	        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
	        {
	            int j1 = 0;

	            if (this.blockID == BlockHelper.Coal.blockID)
	            {
	                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 0, 2);
	            }
	            else if (this.blockID == BlockHelper.Diamond.blockID)
	            {
	                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
	            }
	            else if (this.blockID == BlockHelper.Emerald.blockID)
	            {
	                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
	            }
	            else if (this.blockID == BlockHelper.Lapis.blockID)
	            {
	                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 2, 5);
	            }
	            return j1;
	        }

	        return 0;
	    }
    
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1))
        {
            int j = par2Random.nextInt(par1 + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(par2Random) * (j + 1);
        }
        else
        {
            return this.quantityDropped(par2Random);
        }
    }
    
    public int damageDropped(int par1)
    {
        return this.blockID == BlockHelper.Lapis.blockID ? 4 : 0;
    }
}
