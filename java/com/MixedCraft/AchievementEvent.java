package com.MixedCraft;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class AchievementEvent {

	@SubscribeEvent
	public void onItemCrafted(PlayerEvent.ItemCraftedEvent event){
		if(event.crafting.getItem().equals(BlockHelper.Assembler)){
			event.player.addStat(Achievements.Assembler, 1);
		}
		
		if(event.crafting.getItem().equals(BlockHelper.Extractor)){
			event.player.addStat(Achievements.Extractor, 1);
		}
		
		if(event.crafting.getItem().equals(BlockHelper.Mixer)){
			event.player.addStat(Achievements.Mixer, 1);
		}
	}
	
	@SubscribeEvent
	public void onItemSmelting(PlayerEvent.ItemSmeltedEvent event){
		if(event.smelting.getItem().equals(ItemHelper.CopperIngot)){
			event.player.addStat(Achievements.Copper, 1);
		}
		
		if(event.smelting.getItem().equals(ItemHelper.TinIngot)){
			event.player.addStat(Achievements.Copper, 1);
		}
	}
	
	@SubscribeEvent
	public void onItemPickup(PlayerEvent.ItemPickupEvent event){
		if(event.pickedUp.equals(new ItemStack(BlockHelper.TinOre))) {
			event.player.addStat(Achievements.TinOre, 1);
		}
		
		if(event.pickedUp.equals(new ItemStack(BlockHelper.CopperOre))) {
			event.player.addStat(Achievements.CopperOre, 1);
		}
	}
	
}
