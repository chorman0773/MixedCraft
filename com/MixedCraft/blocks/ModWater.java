package com.MixedCraft.blocks;

import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModWater extends BlockFluidClassic{

	IIcon[] theIIcon;
	
	public ModWater() {
		super(MixedCraft.Mod, Material.water);
		MixedCraft.Mod.setBlockID(id);
	}

	@Override
    public IIcon getIcon(int par1, int par2)
    {
        return par1 != 0 && par1 != 1 ? this.theIIcon[1] : this.theIIcon[0];
    }
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IIconRegister)
	{
		this.theIIcon = new IIcon[] {par1IIconRegister.registerIcon(Utils.MOD_ID + ":" + "Liquid"), par1IIconRegister.registerIcon(Utils.MOD_ID + ":" + "Liquid_2")};
	}
}
