package com.MixedCraft.helper;

import net.minecraftforge.common.MinecraftForge;

import com.MixedCraft.*;
import com.MixedCraft.Cape.*;
import com.MixedCraft.blocks.tileEntity.*;
import com.MixedCraft.dimension.*;
import com.MixedCraft.gen.*;
import com.MixedCraft.handler.*;

import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;

public class CommonProxy extends HelperHandler {
	
	public void registerRenderInformation() {}    

	//ClientProxy
	public void preInit(FMLPreInitializationEvent event) {         
		ConfigHelper.initConfig(event);
		GameRegistry.registerWorldGenerator(new WorldGenMixedMinable());
		BlockHelper.addNames();
		ItemHelper.addNames(); 
		HarvestLevelHelper.init();
		RecipeRemover.init();
		MobRegistry.init();
		DimensionHelper.init();
		tickRegistry();
		registerTileEntity();
		GameRegistry.registerPlayerTracker(new ManaHelper());
		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
		MinecraftForge.EVENT_BUS.register(new Event());
	}

	public void registerTileEntity() {
		GameRegistry.registerTileEntity(TileEntityDiamondFurnace.class, "TileEntity Diamond Furnace");
		GameRegistry.registerTileEntity(TileEntityIronFurnace.class, "TileEntity Iron Furnace");
		GameRegistry.registerTileEntity(TileEntityDNAExtractor.class, "TileEntity Extractor");
		GameRegistry.registerTileEntity(TileEntityDNAMixer.class, "TileEntity Mixer");
		GameRegistry.registerTileEntity(TileEntityDNAAssembler.class, "TileEntity Assember");
		GameRegistry.registerTileEntity(TileEntityGoldFurnace.class, "TileEntity Gold Furnace");
		GameRegistry.registerTileEntity(TileEntitySolarPanel.class, "TileEntity SolarPanel");
		GameRegistry.registerTileEntity(TileEntityPowerFurnace.class, "TileEntity SolarPPanel");

	}

	public void init(FMLInitializationEvent event) {     
		Achievements.init();
		MinecraftForge.EVENT_BUS.register(new EntityLivingHandler());
	}

	public static void tickRegistry() {
		TickRegistry.registerTickHandler(new MixedCraftTickHandler(), Side.CLIENT);
		TickRegistry.registerTickHandler(new DevCapesTickHandler(), Side.CLIENT);

	}
}
