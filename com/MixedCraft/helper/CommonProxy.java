package com.MixedCraft.helper;

import java.io.File;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;

import com.MixedCraft.Achievements;
import com.MixedCraft.BlockHelper;
import com.MixedCraft.ItemHelper;
import com.MixedCraft.MixedCraft;
import com.MixedCraft.dimension.DimensionHelper;
import com.MixedCraft.entity.*;
import com.MixedCraft.entity.render.*;
import com.MixedCraft.gen.WorldGenMixedMinable;
import com.MixedCraft.handler.EntityLivingHandler;
import com.MixedCraft.handler.ExplosiveArrowHitHandler;
import com.MixedCraft.handler.MixedCraftTickHandler;
import com.MixedCraft.recipes.RecipeHelper;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy
{
    public void registerRenderInformation()
    {        
   
    }    
    
    public static void Arrow(){
		RenderingRegistry.registerEntityRenderingHandler(EntityLightningArrow.class, new RenderLightningArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityTNTArrow.class, new RenderTNTArrow());

	}
    
    public void preInit(FMLPreInitializationEvent event)
    {         

		ConfigHelper.initConfig(event);
	
		NetworkRegistry.instance().registerGuiHandler(MixedCraft.instance, new GuiHandler());

        //MinecraftForge.EVENT_BUS.register(new SoundHandler());
        GameRegistry.registerWorldGenerator(new WorldGenMixedMinable());
        BlockHelper.addNames();
        ItemHelper.addNames(); 
        HarvestLevelHelper.init();
        RecipeRemover.init();
        MobRendering.init();
        MobRegistry.init();
        DimensionHelper.init();
        MinecraftForge.EVENT_BUS.register(new ExplosiveArrowHitHandler());
        tickRegistry();
    }
    

    public void init(FMLInitializationEvent event)
    {     
    	Arrow();
    	//Achievements.init();
    	MinecraftForge.EVENT_BUS.register(new EntityLivingHandler());
    }
    
    public static void tickRegistry(){
    	TickRegistry.registerTickHandler(new MixedCraftTickHandler(), Side.CLIENT);

    }
}
