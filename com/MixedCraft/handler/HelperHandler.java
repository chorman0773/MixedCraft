package com.MixedCraft.handler;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

import com.MixedCraft.helper.ConfigHelper;
import com.MixedCraft.helper.Utils;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class HelperHandler {
	
	public static String MobTexturePrefix = Utils.MOD_ID + ":" + "textures/entity/";
	public static String ModelTexturePrefix = Utils.MOD_ID + ":" + "textures/model/";
	public static String GuiTexturePrefix = Utils.MOD_ID + ":" + "textures/gui/";
	
	public static ConfigHelper x;
	
	public static int HEAD = 0;
	public static int BODY = 1;
	public static int LEGS = 2;
	public static int BOOTS = 3;
	
	public static EnumToolMaterial Silver = EnumHelper.addToolMaterial("Silver", 4, 1000, 11.0F, 7, 16);
    public static EnumToolMaterial SilverShick = EnumHelper.addToolMaterial("SilverShick", 5, -1, 150.0F, 22, 20);
	public static EnumToolMaterial Flame = EnumHelper.addToolMaterial("Flame", 4, -1, 0.0F, 6, 16);
	public static EnumToolMaterial Iron = EnumHelper.addToolMaterial("Iron", 4, 1000, 0.2F, 4, 16);
	public static EnumToolMaterial Diamond = EnumHelper.addToolMaterial("Diamond", 4, 1000, 0.2F, 7, 16);
	public static EnumToolMaterial Gold = EnumHelper.addToolMaterial("Gold", 4, 1000, 0.2F, 4, 16);
	public static EnumToolMaterial Wood = EnumHelper.addToolMaterial("Wood", 0, 1000, 0.1F, 0, 5);
	public static EnumToolMaterial Stone = EnumHelper.addToolMaterial("Stone", 4, 1000, 0.2F, 2, 16);

	static EnumArmorMaterial SuperArmor = EnumHelper.addArmorMaterial("Super", -1, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial FlameArmor = EnumHelper.addArmorMaterial("Fire", -1, new int[]{3, 8, 6, 3}, 10);

	public static void addTabName(String par1, String name){
		LanguageRegistry.instance().addStringLocalization("itemGroup." + par1, "MixedCraft: " + name);
	}	
	
	public static void addAchievementName(String achievement, String name){
		LanguageRegistry.instance().addStringLocalization("achievement." + achievement, "en_US", name);
	}

	public static void addAchievementDesc(String achievement, String description){
		LanguageRegistry.instance().addStringLocalization("achievement." + achievement + ".desc", "en_US", description);
	}
	
	public static void addItem(Item object, String name){
		LanguageRegistry.addName(object, name);
		GameRegistry.registerItem(object, name);
	}
	
	public static void addBlock(Block object, String name){
		LanguageRegistry.addName(object, name);
		GameRegistry.registerBlock(object, name);
	}
	
	public static void addAlotItem(String unlocalizedName, String Name){
		LanguageRegistry.instance().addStringLocalization("item." + unlocalizedName + ".name", Name);
	}
	
	public static void addAlotBlock(String unlocalizedName, String Name){
		LanguageRegistry.instance().addStringLocalization("tile." + unlocalizedName + ".name", Name);
	}
}
