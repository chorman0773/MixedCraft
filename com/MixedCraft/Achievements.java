package com.MixedCraft;

import com.MixedCraft.handler.HelperHandler;
import com.MixedCraft.helper.CraftingHandler;
import com.MixedCraft.helper.PickupHandler;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class Achievements extends HelperHandler{
	
	public static AchievementPage MixedPage;

	public static Achievement Extractor;
	public static Achievement Copper;
	public static Achievement CopperOre;
	
	public static void init(){
		AchievementPage.registerAchievementPage(MixedPage);

    	GameRegistry.registerPickupHandler(new PickupHandler());
    	GameRegistry.registerCraftingHandler(new CraftingHandler());
		
		MixedPage = new AchievementPage("Mixed Achievements", Extractor, Copper);

		Extractor = new Achievement(40, "Extractor", 0, 0, BlockHelper.Extractor, Extractor).registerAchievement(); 
		Copper = new Achievement(41, "Copper", 0, 0, ItemHelper.CopperIngot, Copper).registerAchievement(); 
		CopperOre = new Achievement(42, "CopperOre", 0, 0, BlockHelper.CopperOre, CopperOre).registerAchievement(); 

		
		addAchievementName("Extractor", "Craft Extractor!");
		addAchievementDesc("Extractor", "Craft Extractor");
		
		addAchievementName("CopperOre", "Mine Copper!");
		addAchievementDesc("CopperOre", "Mine Copper!");
		
		addAchievementName("Copper", "Smelt Copper Ore!");
		addAchievementDesc("Copper", "Smelt Copper Ore!");

	}
}
