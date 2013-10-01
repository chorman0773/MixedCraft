package com.MixedCraft.helper;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.entity.*;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MobRegistry {

	public static int START_EID = 0;

	public static void init(){

		ModMobRegistry.registerEntity(EntityChickenCow.class, "ChickenCow", 0, 64, 10, true);
		ModMobRegistry.registerEntity(EntityCowCreeper.class, "CowCreeper", 1, 64, 10, true);
		ModMobRegistry.registerEntity(EntityCowPig.class, "CowPig", 2, 64, 10, true);
		ModMobRegistry.registerEntity(EntityCowSheep.class, "CowSheep", 3, 64, 10, true);
		ModMobRegistry.registerEntity(EntityCowEnderman.class, "CowEnderman", 4, 64, 10, true);
		ModMobRegistry.registerEntity(EntityCowZombie.class, "CowZombie", 5, 64, 10, true);
		
		EntityRegistry.registerModEntity(EntityDroid.class, "Droid", 6, MixedCraft.instance, 80, 3, true);
		EntityRegistry.registerModEntity(EntityShip.class, "EntitySpaceship", 7, MixedCraft.instance, 80, 3, true);
		EntityRegistry.registerModEntity(EntityBomb.class, "EntityBomb", 8, MixedCraft.instance, 80, 3, true);

		addNames();
	}



	public static DamageSource causeLightningDamage(EntityLightningArrow par0EntityArrow, Entity par1Entity) {

		return (new EntityDamageSourceIndirect("Lightning", par0EntityArrow, par1Entity)).setProjectile();
	}	
	
	public static DamageSource causeTNTDamage(EntityTNTArrow par0EntityArrow, Entity par1Entity) {

		return (new EntityDamageSourceIndirect("Lightning", par0EntityArrow, par1Entity)).setProjectile();
	}	


	public static void addNames(){

		LanguageRegistry.instance().addStringLocalization("entity.ChickenCow.name", "Cow Chicken");
		LanguageRegistry.instance().addStringLocalization("entity.CowCreeper.name", "Cow Creeper");
		LanguageRegistry.instance().addStringLocalization("entity.CowPig.name", "Cow Pig");
		LanguageRegistry.instance().addStringLocalization("entity.CowSheep.name", "Cow Sheep");
		LanguageRegistry.instance().addStringLocalization("entity.CowEnderman.name", "Cow Enderman");
		LanguageRegistry.instance().addStringLocalization("entity.CowZombie.name", "Cow Zombie");

	}

}
