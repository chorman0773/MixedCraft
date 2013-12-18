package com.MixedCraft.dimension;

import com.MixedCraft.helper.ConfigHelper;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;

public class DimensionHelper 
{
	public static int FlyLightID = ConfigHelper.Flylight;
	
	public static BiomeGenBase Flylight = new BiomeGenFlylight();

	
	public static void init(){		 

		DimensionManager.registerProviderType(FlyLightID, WorldProviderFlyLight.class, true);
		DimensionManager.registerDimension(FlyLightID, FlyLightID);
	}	
}

