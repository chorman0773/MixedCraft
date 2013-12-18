package com.MixedCraft.helper;

import com.MixedCraft.MixedCraft;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderInformation() {
    	TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
    	MobRendering.init();
		NetworkRegistry.instance().registerGuiHandler(MixedCraft.instance, new GuiHandler());
    }

}
