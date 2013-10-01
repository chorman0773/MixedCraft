package com.MixedCraft.handler;

import com.MixedCraft.helper.Utils;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class HelperHandler {
	
	public static String MobTexturePrefix = Utils.MOD_ID + ":" + "textures/entity/";
	public static String ModelTexturePrefix = Utils.MOD_ID + ":" + "textures/model/";
	public static String GuiTexturePrefix = Utils.MOD_ID + ":" + "textures/gui/";

	public static void addTabName(String par1, String name){
		LanguageRegistry.instance().addStringLocalization("itemGroup." + par1, "MixedCraft: " + name);
	}	
	
	public static void addAchievementName(String achievement, String name){
		LanguageRegistry.instance().addStringLocalization("achievement." + achievement, "en_US", name);
	}

	public static void addAchievementDesc(String achievement, String description){
		LanguageRegistry.instance().addStringLocalization("achievement." + achievement + ".desc", "en_US", description);
	}
	
}
