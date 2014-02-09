package com.MixedCraft.blocks;

import com.MixedCraft.MixedCraft;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockSinkSand extends BlockSand{

	public BlockSinkSand() {
		super();
        this.setCreativeTab(MixedCraft.BlockTab);
	}
	
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
        return null;
    }
    
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
        par5Entity.setInWeb();
    }
}
