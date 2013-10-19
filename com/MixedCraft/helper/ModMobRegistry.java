package com.MixedCraft.helper;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModMobRegistry 
{
	static int eggID = 150;

	public static void registerEntity(Class entityClass, String entityName)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, entityID);
		LanguageRegistry.instance().addStringLocalization("entity." + entityName + ".name", entityName);
		int ID = getUniqueID(); 
		EntityList.IDtoClassMapping.put(ID, entityClass);
		EntityList.entityEggs.put(ID, new EntityEggInfo(ID, 0x000000, 0xFFFFFF));
	}


	private static int getUniqueID() 
	{
		return eggID++;
	}
}
