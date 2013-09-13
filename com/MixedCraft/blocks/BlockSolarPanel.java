package com.MixedCraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.blocks.tileEntity.TileEntitySolarPanel;
import com.MixedCraft.helper.ContainerBase;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityDaylightDetector;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSolarPanel extends ContainerBase
{

    public BlockSolarPanel(int par1)
    {
        super(par1, Material.wood);
        //this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
        this.setCreativeTab(MixedCraft.BlockTab);
        GameRegistry.registerBlock(this);
        registerTexture("SolarPanel_Side", "SolarPanel_Top", "SolarPanel_Bottom");
        }

    public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return par1IBlockAccess.getBlockMetadata(par2, par3, par4);
    }


    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {}

    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {}

    public void onBlockAdded(World par1World, int par2, int par3, int par4) {}

    public void updateLightLevel(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.provider.hasNoSky)
        {
            int l = par1World.getBlockMetadata(par2, par3, par4);
            int i1 = par1World.getSavedLightValue(EnumSkyBlock.Sky, par2, par3, par4) - par1World.skylightSubtracted;
            float f = par1World.getCelestialAngleRadians(1.0F);

            if (f < (float)Math.PI)
            {
                f += (0.0F - f) * 0.2F;
            }
            else
            {
                f += (((float)Math.PI * 2F) - f) * 0.2F;
            }

            i1 = Math.round((float)i1 * MathHelper.cos(f));

            if (i1 < 0)
            {
                i1 = 0;
            }

            if (i1 > 15)
            {
                i1 = 15;
            }

            if (l != i1)
            {
                par1World.setBlockMetadataWithNotify(par2, par3, par4, i1, 3);
            }
        }
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean canProvidePower()
    {
        return true;
    }

    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntitySolarPanel();
    }
}
