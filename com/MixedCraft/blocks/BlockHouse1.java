package com.MixedCraft.blocks;

import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.MixedCraft.ItemHelper;
import com.MixedCraft.MixedCraft;
import com.MixedCraft.gen.House1;
import com.MixedCraft.helper.BlocksBase;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHouse1 extends BlocksBase
{
	private Random rand;
	private EntityPlayer entityplayer;

	public BlockHouse1(int i)
	{
		super(i, Material.wood);
		this.setCreativeTab(MixedCraft.BlockTab);
		GameRegistry.registerBlock(this);
	}
	public void registerIcons(IIconRegister var1)
	{
		this.blockIcon = var1.registerIcon("MixedCraft:House1");
	}

	public IIcon getBlockTextureFromSideAndMetadata(int var1, int var2)
	{
		return this.blockIcon;
	}
	
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5)
	{
		ItemStack equipped = entityplayer.getCurrentEquippedItem();
		if (equipped == null)
		{
			return false;
		}
		
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == ItemHelper.CopperIngot.itemID)
		{
			this.genTreeHouse(world, rand, i, j, k);
			if(!world.isRemote)
			{
				entityplayer.addChatMessage(EnumChatFormatting.GREEN + "Building a house!");
			}
			equipped.stackSize--;
			return true;
		}
		return false;
	}

	public void genTreeHouse(World world, Random rand, int i, int j, int k)
	{
		world.setBlock(i, j, k, 0);
		House1 treehouse = new House1();
		if (!treehouse.generate(world, rand, i, j, k))
		{
			world.setBlock(i, j, k, this);
		}
	}
}