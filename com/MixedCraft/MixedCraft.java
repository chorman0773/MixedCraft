package com.MixedCraft;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.biome.*;
import net.minecraftforge.fluids.Fluid;

import com.MixedCraft.blocks.ModFluid;
import com.MixedCraft.dimension.BiomeGenFlylight;
import com.MixedCraft.handler.*;
import com.MixedCraft.helper.*;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;

@Mod(modid = Utils.MOD_ID, name = Utils.MOD_NAME, version = Utils.MOD_VERSION)
@NetworkMod(channels = { Utils.MOD_ID }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class MixedCraft extends HelperHandler{

	@Instance(Utils.MOD_ID)
	public static MixedCraft instance;

	@SidedProxy(serverSide = Utils.COMMONPROXY, clientSide = Utils.CLIENTPROXY)

	public static CommonProxy proxy; 

	public static Fluid Mod = new ModFluid("Fluid");
	
	public static final CreativeTabs DNATab = new CreativeTabs("DNA"){
		public ItemStack getIconItemStack() { 
			return new ItemStack(ItemHelper.CowDNADrive);
		}
	};
	public static final CreativeTabs MixedDNATab = new CreativeTabs("MixedDNA"){
		public ItemStack getIconItemStack() { 
			return new ItemStack(ItemHelper.CowBlazeMixedDrive);
		}
	};
	public static final CreativeTabs SpawnerTab = new CreativeTabs("Spawner"){
		public ItemStack getIconItemStack() { 
			return new ItemStack(ItemHelper.CowChickenSpawner);
		}
	};
	public static final CreativeTabs BlockTab = new CreativeTabs("Block"){
		public ItemStack getIconItemStack() { 
			return new ItemStack(BlockHelper.Extractor);
		}
	};
	public static final CreativeTabs ToolTab = new CreativeTabs("Tool"){
		public ItemStack getIconItemStack() { 
			return new ItemStack(ItemHelper.SilverPickaxe);
		}
	};
	public static final CreativeTabs MiscTab = new CreativeTabs("Misc"){
		public ItemStack getIconItemStack() { 
			return new ItemStack(ItemHelper.SilverIngot);
		}
	};

	public static void addTabName(){
		addTabName("DNA", "DNA Tab");
		addTabName("MixedDNA", "Mixed DNA Tab");
		addTabName("Spawner", "Spawner Tab");
		addTabName("Block", "Block Tab");
		addTabName("Tool", "Tool Tab");
		addTabName("Misc", "Misc. Tab");
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{	    
		proxy.preInit(event);
		proxy.registerRenderInformation();
		event.getModMetadata().credits = "The_Slayer ~ The programmer, DrCyano ~ The programmer for the Magic Wands mod";
		event.getModMetadata().description = "MixedCraft is a mod made by The_Slayer, it's still in the making";
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
		addTabName();
	}	

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event){}

}
