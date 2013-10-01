package com.MixedCraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.MixedCraft.blocks.tileEntity.TileEntityBomb;
import com.MixedCraft.helper.Utils;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBomb extends BlockContainer {

	public BlockBomb(int id) {
		super(id, Material.rock);
		setHardness(2F);
		setStepSound(Block.soundMetalFootstep);
		GameRegistry.registerBlock(this);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon idleIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(Utils.MOD_ID + ":" + "Bomb");
		idleIcon = register.registerIcon(Utils.MOD_ID + ":" + "Bomb_Idle");
	}
	
		
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return meta == 0 ? blockIcon : idleIcon;
	}


	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityBomb();
	}
	
	@Override
	public int idDropped(int meta, Random random, int forune) {
		return -1;
	}
	
}
