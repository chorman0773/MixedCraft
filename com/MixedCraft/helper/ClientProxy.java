package com.MixedCraft.helper;

import com.MixedCraft.MixedCraft;

import cpw.mods.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderInformation() {
    	//TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
    	MobRendering.init();
		NetworkRegistry.INSTANCE.registerGuiHandler(MixedCraft.instance, new GuiHandler());
    }

}
