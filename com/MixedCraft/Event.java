package com.MixedCraft;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

import com.MixedCraft.blocks.FlylightSapling;

public class Event
{
	private int BlockID;
	
	@ForgeSubscribe
	public void bonemealUsed(BonemealEvent event)
	{
		if(event.world.getBlockId(event.X, event.Y, event.Z) == BlockHelper.FlylightSapling.blockID)
		{
			((FlylightSapling)BlockHelper.FlylightSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
		}
	}
}