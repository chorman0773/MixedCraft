package com.MixedCraft.dimension;

import com.MixedCraft.dimension.flylight.WorldProviderFlyLight;

import net.minecraftforge.common.DimensionManager;

public class DimensionHelper 
{
	public static int FlyLightID = 15;

	public static void init(){		 

		DimensionManager.registerProviderType(FlyLightID, WorldProviderFlyLight.class, true);
		DimensionManager.registerDimension(FlyLightID, FlyLightID);
	}	
}

