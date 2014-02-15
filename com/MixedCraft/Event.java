package com.MixedCraft;

import net.minecraftforge.event.entity.player.BonemealEvent;

import com.MixedCraft.blocks.BlockChocolateCrop;
import com.MixedCraft.blocks.FlylightSapling;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Event {	
	
	@SubscribeEvent
	public void bonemealUsed(BonemealEvent event) {
		if(event.world.getBlock(event.x, event.y, event.z) == BlockHelper.FlylightSapling) {
			((FlylightSapling)BlockHelper.FlylightSapling).growTree(event.world, event.x, event.y, event.z, event.world.rand);
		}
	}
}