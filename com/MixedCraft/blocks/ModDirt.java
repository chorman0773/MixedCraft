package com.MixedCraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

import com.MixedCraft.helper.BlocksBase;

public class ModDirt extends BlocksBase{

    public ModDirt(int blockID) 
    {
        super(blockID, Material.ground);
    }

    @Override
    public boolean canSustainPlant(World world, int x, int y, int z,
    		ForgeDirection direction, IPlantable plant) {
    	return true;
    }

    
}
