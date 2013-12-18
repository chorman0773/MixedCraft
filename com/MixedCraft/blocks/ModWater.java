package com.MixedCraft.blocks;

import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraftforge.fluids.BlockFluidClassic;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModWater extends BlockFluidClassic{

	Icon[] theIcon;
	
	public ModWater(int id) {
		super(id, MixedCraft.Mod, Material.water);
		MixedCraft.Mod.setBlockID(id);
	}

	@Override
    public Icon getIcon(int par1, int par2)
    {
        return par1 != 0 && par1 != 1 ? this.theIcon[1] : this.theIcon[0];
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.theIcon = new Icon[] {par1IconRegister.registerIcon(Utils.MOD_ID + ":" + "Liquid"), par1IconRegister.registerIcon(Utils.MOD_ID + ":" + "Liquid_2")};
	}
}
