package com.MixedCraft.helper;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;

import com.MixedCraft.Achievements;
import com.MixedCraft.BlockHelper;
import com.MixedCraft.ItemHelper;

import cpw.mods.fml.common.IPickupNotifier;

public class PickupHandler implements IPickupNotifier {

	@Override
	public void notifyPickup(EntityItem item, EntityPlayer player) {


		if(item.getEntityItem().itemID == BlockHelper.CopperOre.blockID)
		{
			player.addStat(Achievements.CopperOre, 1);
		}
		
		if(item.getEntityItem().itemID == BlockHelper.TinOre.blockID)
		{
			player.addStat(Achievements.TinOre, 1);
		}

		
		
		
	}

}
