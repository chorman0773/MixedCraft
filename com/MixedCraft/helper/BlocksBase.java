package com.MixedCraft.helper;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.MixedCraft;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlocksBase extends Block {
    protected Icon tileSide;
    protected String tileSideName;
    protected Icon tileTop;
    protected String tileTopName;
    protected Icon tileBottom;
    protected String tileBottomName;
    protected boolean enableStats = true;



    public BlocksBase(int blockID, Material material) {
        super(blockID, material);
        this.setCreativeTab(MixedCraft.BlockTab);
        GameRegistry.registerBlock(this);
    }
    
	public void addName(String name)
	{
		LanguageRegistry.instance().addStringLocalization("tile." + name + ".name", name);
	}
    
    public boolean getEnableStats()
    {
        return this.enableStats;
    }

    /**
     * Disable statistics for the block, the block will no count for mined or placed.
     */
    public Block disableStats()
    {
        this.enableStats = false;
        return this;
    }

    public Block registerTexture(String text) {
        tileSideName = tileTopName = tileBottomName = text;
		return this;
    }

    public Block registerTexture(String side, String top, String bottom) {
        tileSideName = side;
        tileTopName = top;
        tileBottomName = bottom;
		return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        tileSide = icon.registerIcon(Utils.MOD_ID +":" + tileSideName);
        tileTop = icon.registerIcon(Utils.MOD_ID +":" + tileTopName);
        tileBottom = icon.registerIcon(Utils.MOD_ID +":" + tileBottomName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return side == 1 ? tileTop : side == 0 ? tileBottom : tileSide;
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return blockID;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        return 1;
    }
    

}
