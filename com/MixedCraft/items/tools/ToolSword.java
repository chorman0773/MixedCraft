package com.MixedCraft.items.tools;

import java.util.List;

import com.MixedCraft.MixedCraft;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ToolSword extends SwordBase {

	public ToolSword(int par1, EnumToolMaterial par3enum, String par2) {
		super(par1, par3enum);
        registerTexture(par2);
        setUnlocalizedName(par2);
        setCreativeTab(MixedCraft.ToolTab);
	}
}
