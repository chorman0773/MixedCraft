package com.MixedCraft.helper;

import java.io.File;

import net.minecraftforge.common.config.Configuration;


public class ConfigHelper {

	public static Configuration config;
	public static int Flylight;
	public static int manaX, manaY;
	
	public static void initConfig() {
		config = new Configuration(new File("./" + Utils.MOD_NAME + "MixedCraft.cfg"));
		
		Flylight = config.get("Dimension", "Flylight", 15).getInt();
		
		manaX = config.get("Mana bar coords", "Width", 220).getInt();
		manaY = config.get("Mana bar coords", "Height", 18).getInt();
	}
}
