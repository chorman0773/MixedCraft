package com.MixedCraft.helper;

import com.MixedCraft.MixedCraft;
import com.jadarstudios.developercapes.DevCapes;

import cpw.mods.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderInformation() {
    	//TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
    	MobRendering.init();
		NetworkRegistry.INSTANCE.registerGuiHandler(MixedCraft.instance, new GuiHandler());
    }
    
    @Override
    public void registerCape() {
		DevCapes.getInstance().registerConfig("https://dl.dropboxusercontent.com/s/vlyyr7ujn42tne9/Capes.json", "MixedCraft");
    }

}
