package com.MixedCraft.helper;

import java.io.File;

import net.minecraftforge.common.config.Configuration;


public class ConfigHelper {

	public static Configuration config;
	public static int Flylight;

	public static void initConfig() {
		config = new Configuration(new File("./config/MixedCraft.cfg"));
		
		Flylight = config.get("Dimension", "Flylight", 15).getInt();
	}
}
