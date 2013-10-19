package com.MixedCraft.helper;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumChatFormatting;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.entity.*;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MobRegistry {

	public static EnumChatFormatting x; 

	public static void init(){

		ModMobRegistry.registerEntity(EntityChickenCow.class, x.GREEN + "Cow: Chicken");
		ModMobRegistry.registerEntity(EntityCowCreeper.class, x.DARK_GREEN + "Cow: Creeper");
		ModMobRegistry.registerEntity(EntityCowPig.class, x.GREEN + "Cow: Pig");
		ModMobRegistry.registerEntity(EntityCowSheep.class, x.GREEN + "Cow: Sheep");
		ModMobRegistry.registerEntity(EntityCowEnderman.class, x.DARK_RED + "Cow: Enderman");
		ModMobRegistry.registerEntity(EntityCowZombie.class, x.DARK_RED + "Cow: Zombie");
		
		EntityRegistry.registerModEntity(EntityDroid.class, "Droid", 6, MixedCraft.instance, 80, 3, true);
		//EntityRegistry.registerModEntity(EntityShip.class, "EntitySpaceship", 7, MixedCraft.instance, 80, 3, true);
		//EntityRegistry.registerModEntity(EntityBomb.class, "EntityBomb", 8, MixedCraft.instance, 80, 3, true);

	}



	public static DamageSource causeLightningDamage(EntityLightningArrow par0EntityArrow, Entity par1Entity) {

		return (new EntityDamageSourceIndirect("Lightning", par0EntityArrow, par1Entity)).setProjectile();
	}	
	
	public static DamageSource causeTNTDamage(EntityTNTArrow par0EntityArrow, Entity par1Entity) {

		return (new EntityDamageSourceIndirect("Lightning", par0EntityArrow, par1Entity)).setProjectile();
	}	
}
