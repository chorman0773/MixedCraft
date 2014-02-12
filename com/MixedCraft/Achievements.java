package com.MixedCraft;

import com.MixedCraft.handler.HelperHandler;
import com.MixedCraft.helper.CraftingHandler;
import com.MixedCraft.helper.PickupHandler;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class Achievements extends HelperHandler{

	public static final Achievement CopperOre = new Achievement("CopperOre", "CopperOre", 0, 1, BlockHelper.CopperOre, null).registerStat(); 
	public static final Achievement TinOre = new Achievement("TinOre", "TinOre", 4, 1, BlockHelper.TinOre, null).registerStat(); 

	public static final Achievement Copper = new Achievement("Copper", "Copper", 0, 3, ItemHelper.CopperIngot, CopperOre).registerStat(); 
	public static final Achievement Tin = new Achievement("Tin", "Tin", 4, 3, ItemHelper.TinIngot, TinOre).registerStat(); 

	public static final Achievement Extractor = new Achievement("Extractor", "Extractor", 0, 5, BlockHelper.Extractor, Copper).registerStat().setSpecial(); 
	public static final Achievement Mixer = new Achievement("Mixer", "Mixer", 1, 6, BlockHelper.Mixer, Extractor).registerStat().setSpecial(); 
	public static final Achievement Assembler = new Achievement("Assembler", "Assembler", 2, 7, BlockHelper.Assembler, Mixer).registerStat().setSpecial(); 



	public static final AchievementPage MixedPage = new AchievementPage("MixedCraft", CopperOre, TinOre, 
																		Copper, Tin, Extractor, Mixer, Assembler);

	public static void init(){
		AchievementPage.registerAchievementPage(MixedPage);

		//GameRegistry.registerPickupHandler(new PickupHandler());
		//GameRegistry.registerCraftingHandler(new CraftingHandler());
		
		addAchievementName("Extractor", "Ready To Extract!");
		addAchievementDesc("Extractor", "Just Craft An Extractor!");
		
		addAchievementName("Mixer", "Ready To Mix!");
		addAchievementDesc("Mixer", "Just Craft A Mixer!");
		
		addAchievementName("Assembler", "Ready To Assemble!");
		addAchievementDesc("Assembler", "Just Craft A Mob Assembler!");
		
		addAchievementName("CopperOre", "Mine Copper!");
		addAchievementDesc("CopperOre", "Just Mine Copper!");
		
		addAchievementName("Copper", "Smelt Copper Ore!");
		addAchievementDesc("Copper", "Just Smelt Copper Ore!");
		
		addAchievementName("Tin", "Smelt Tin Ore!");
		addAchievementDesc("Tin", "Just Smelt Tin Ore!");
		
		addAchievementName("TinOre", "Mine Tin!");
		addAchievementDesc("TinOre", "Just Mine Tin!");
	}
}
