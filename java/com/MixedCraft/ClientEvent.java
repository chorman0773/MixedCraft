package com.MixedCraft;

import net.minecraft.server.MinecraftServer;

import com.MixedCraft.helper.ManaHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class ClientEvent {

	@SubscribeEvent
	public void onTick(TickEvent event){
		ManaHelper.updateAllBars(MinecraftServer.getServer().getConfigurationManager().playerEntityList);
	}
	
}
