package com.MixedCraft;

import net.minecraft.util.EnumChatFormatting;

public class MobNames {

	public static EnumChatFormatting x;
	
	public static String COWCREEPER = addDarkGreen("Cow Creeper");
	public static String COWZOMBIE = x.DARK_RED + "Cow Zombie";
	public static String COWCHICKEN = x.GREEN + "Cow Chicken";
	public static String COWENDERMAN = x.DARK_RED + "Cow Enderman";
	public static String COWPIG = x.GREEN + "Cow Pig";
	public static String COWSHEEP = x.GREEN + "Cow Sheep";
	
	static String addDarkGreen(String s){
		return x.DARK_GREEN + s;
	}
}
