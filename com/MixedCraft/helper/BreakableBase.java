package com.MixedCraft.helper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BreakableBase extends BlockBreakable
{
    private boolean localFlag;
    private String breakableBlockIcon;
    protected Icon tileSide;
    protected String tileSideName;
    protected Icon tileTop;
    protected String tileTopName;
    protected Icon tileBottom;
    protected String tileBottomName;


    protected BreakableBase(int par1, String par2Str, Material par3Material, boolean par4)
    {
        super(par1, par2Str, par3Material, par4);
        this.localFlag = par4;
        this.breakableBlockIcon = par2Str;
    }

    public Block registerTexture(String text) {
        tileSideName = tileTopName = tileBottomName = text;
        return this;
    }

    public void registerTexture(String side, String top, String bottom) {
        tileSideName = side;
        tileTopName = top;
        tileBottomName = bottom;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        tileSide = icon.registerIcon(Utils.MOD_ID + ":" + tileSideName);
        tileTop = icon.registerIcon(Utils.MOD_ID + ":" + tileTopName); 
        tileBottom = icon.registerIcon(Utils.MOD_ID + ":" + tileBottomName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return side == 1 ? tileTop : side == 0 ? tileBottom : tileSide;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        int i1 = par1IBlockAccess.getBlockId(par2, par3, par4);
        return !this.localFlag && i1 == this.blockID ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }
}
