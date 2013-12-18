package com.MixedCraft.helper;

import net.minecraftforge.common.MinecraftForge;

import com.MixedCraft.Achievements;
import com.MixedCraft.BlockHelper;
import com.MixedCraft.Event;
import com.MixedCraft.ItemHelper;
import com.MixedCraft.blocks.tileEntity.TileEntityDNAAssembler;
import com.MixedCraft.blocks.tileEntity.TileEntityDNAExtractor;
import com.MixedCraft.blocks.tileEntity.TileEntityDNAMixer;
import com.MixedCraft.blocks.tileEntity.TileEntityDiamondFurnace;
import com.MixedCraft.blocks.tileEntity.TileEntityGoldFurnace;
import com.MixedCraft.blocks.tileEntity.TileEntityIronFurnace;
import com.MixedCraft.blocks.tileEntity.TileEntitySolarPanel;
import com.MixedCraft.dimension.DimensionHelper;
import com.MixedCraft.gen.WorldGenMixedMinable;
import com.MixedCraft.handler.EntityLivingHandler;
import com.MixedCraft.handler.HelperHandler;
import com.MixedCraft.handler.MixedCraftTickHandler;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

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
	}

	public void init(FMLInitializationEvent event) {     
		Achievements.init();
		MinecraftForge.EVENT_BUS.register(new EntityLivingHandler());
	}

	public static void tickRegistry() {
		TickRegistry.registerTickHandler(new MixedCraftTickHandler(), Side.CLIENT);

	}
}
