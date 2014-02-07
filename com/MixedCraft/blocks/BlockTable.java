package com.MixedCraft.blocks;

import com.MixedCraft.blocks.tileEntity.TileEntityTable;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTable extends BlockContainer
{
    public BlockTable(int id)
    {
        super(id, Material.rock);
       
    }

    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityTable();
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
    public void registerIcons(IIconRegister par1IIconRegister)
    {
        this.blockIcon = par1IIconRegister.registerIcon("planks_oak");
    }
}
