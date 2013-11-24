package com.MixedCraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;

import com.MixedCraft.gui.BlockTab;
import com.MixedCraft.gui.DNATab;
import com.MixedCraft.gui.MiscTab;
import com.MixedCraft.gui.MixedTab;
import com.MixedCraft.gui.SpawnerTab;
import com.MixedCraft.gui.ToolTab;
import com.MixedCraft.handler.HelperHandler;
import com.MixedCraft.helper.CommonProxy;
import com.MixedCraft.helper.PacketHandler;
import com.MixedCraft.helper.Utils;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Utils.MOD_ID, name = Utils.MOD_NAME, version = Utils.MOD_VERSION)
@NetworkMod(channels = { Utils.MOD_ID }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class MixedCraft extends HelperHandler{


	@Instance(Utils.MOD_ID)
	public static MixedCraft instance;

	@SidedProxy(serverSide = Utils.COMMONPROXY, clientSide = Utils.CLIENTPROXY)
	
	public static CommonProxy proxy; 

	public static final CreativeTabs DNATab = new DNATab("DNA"){
		public ItemStack getIconItemStack() { 
			return new ItemStack(ItemHelper.CowDNADrive);

			}
	};
	
	public static final CreativeTabs MixedDNATab = new MixedTab("MixedDNA");
	public static final CreativeTabs SpawnerTab = new SpawnerTab("Spawner");
	public static final CreativeTabs BlockTab = new BlockTab("Block");
	public static final CreativeTabs ToolTab = new ToolTab("Tool");
	public static final CreativeTabs MiscTab = new MiscTab("Misc");


	//public static final BiomeGenBase flyLight = new Flylight(50);
	

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
