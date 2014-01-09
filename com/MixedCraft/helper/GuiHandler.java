package com.MixedCraft.helper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.blocks.container.*;
import com.MixedCraft.blocks.tileEntity.*;
import com.MixedCraft.gui.*;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static int craftingTable = 1, extractor = 17, PF = 18;

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {

		TileEntity entity = world.getBlockTileEntity(x, y, z);

		if (entity instanceof TileEntityDNAExtractor) {
			return new ContainerDNAExtractor(player.inventory, (TileEntityDNAExtractor) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityDNAMixer) {
			return new ContainerDNAMixer(player.inventory, (TileEntityDNAMixer) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityDNAAssembler) {
			return new ContainerDNAAssembler(player.inventory, (TileEntityDNAAssembler) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityDisasembler) {
			return new ContainerDisasembler(player.inventory, (TileEntityDisasembler) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityIronFurnace) {
			return new ContainerIronFurnace(player.inventory, (TileEntityIronFurnace) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityDiamondFurnace) {
			return new ContainerDiamondFurnace(player.inventory, (TileEntityDiamondFurnace) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityGoldFurnace) {
			return new ContainerGoldFurnace(player.inventory, (TileEntityGoldFurnace) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityDNAExtractor) {
			return new ContainerDoubleFurnace(player.inventory, (TileEntityDoubleFurnace) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityPowerFurnace) {
			return new ContainerPowerFurnace(player.inventory, (TileEntityPowerFurnace) world.getBlockTileEntity(x, y, z));
		}

		switch (id) {

		case 1: return id == craftingTable && world.getBlockId(x, y, z) == BlockHelper.BigCrafting.blockID ? new ContainerBigCrafting(player.inventory, world, x, y, z) : null;
		case 2: return new DNAContainer();
		case 3: return new DNAContainer();
		case 4: return new DNAContainer();
		case 5: return new DNAContainer();
		case 6: return new DNAContainer();
		case 7: return new DNAContainer();
		case 8: return new DNAContainer();
		case 9: return new DNAContainer();
		case 10: return new DNAContainer();
		case 11: return new DNAContainer();
		case 12: return new DNAContainer();
		case 13: return new DNAContainer();
		case 14: return new DNAContainer();
		case 15: return new DNAContainer();
		case 16: return new DNAContainer();
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {

		TileEntity entity = world.getBlockTileEntity(x, y, z);

		if (entity instanceof TileEntityDNAExtractor) {
			return new GuiDNAExtractor(player.inventory,
					(TileEntityDNAExtractor) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityDNAMixer) {
			return new GuiDNAMixer(player.inventory,
					(TileEntityDNAMixer) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityDNAAssembler) {
			return new GuiMobAssembler(player.inventory,
					(TileEntityDNAAssembler) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityDisasembler) {
			return new GuiDisasembler(player.inventory,
					(TileEntityDisasembler) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityIronFurnace) {
			return new GuiIronFurnace(player.inventory,
					(TileEntityIronFurnace) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityDiamondFurnace) {
			return new GuiDiamondFurnace(player.inventory,
					(TileEntityDiamondFurnace) world
							.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityGoldFurnace) {
			return new GuiGoldFurnace(player.inventory,
					(TileEntityGoldFurnace) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityDoubleFurnace) {
			return new GuiDoubleFurnace(player.inventory,
					(TileEntityDoubleFurnace) world.getBlockTileEntity(x, y, z));
		}

		if (entity instanceof TileEntityPowerFurnace) {
			return new GuiPoweredFurnace(player.inventory,
					(TileEntityPowerFurnace) world.getBlockTileEntity(x, y, z));
		}

		switch (id) {
		case 1:
			return id == craftingTable
					&& world.getBlockId(x, y, z) == BlockHelper.BigCrafting.blockID ? new GuiBigCrafting(
					player.inventory, world, x, y, z) : null;

		case 2:
			return new GuiCowDNA(new DNAContainer());
		case 3:
			return new GuiPigDNA(new DNAContainer());
		case 4:
			return new GuiBlazeDNA(new DNAContainer());
		case 5:
			return new GuiChickenDNA(new DNAContainer());
		case 6:
			return new GuiCreeperDNA(new DNAContainer());
		case 7:
			return new GuiEndermanDNA(new DNAContainer());
		case 8:
			return new GuiGhastDNA(new DNAContainer());
		case 9:
			return new GuiSheepDNA(new DNAContainer());
		case 10:
			return new GuiSkeletonDNA(new DNAContainer());
		case 11:
			return new GuiSlimeDNA(new DNAContainer());
		case 12:
			return new GuiSpiderDNA(new DNAContainer());
		case 13:
			return new GuiSquidDNA(new DNAContainer());
		case 14:
			return new GuiWitherDNA(new DNAContainer());
		case 15:
			return new GuiWitherSkeletonDNA(new DNAContainer());
		case 16:
			return new GuiZombieDNA(new DNAContainer());
		}
		return null;
	}

}