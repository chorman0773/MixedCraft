package com.MixedCraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.MixedCraft.blocks.tileEntity.TileEntityTable;
import com.MixedCraft.helper.BlocksBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTable extends BlocksBase {
    public BlockTable() {
        super(Material.rock);
       
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return -1;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IIconRegister)
    {
        this.blockIcon = par1IIconRegister.registerIcon("planks_oak");
    }
}
