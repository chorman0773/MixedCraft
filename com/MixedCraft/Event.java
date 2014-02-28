package com.MixedCraft;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.entity.player.BonemealEvent;

import com.MixedCraft.blocks.FlylightSapling;
import com.MixedCraft.gui.GuiManaBar;
import com.MixedCraft.helper.ManaHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class Event {	
	
	@SubscribeEvent
	public void bonemealUsed(BonemealEvent event) {
		if(event.world.getBlock(event.x, event.y, event.z) == BlockHelper.FlylightSapling) {
			((FlylightSapling)BlockHelper.FlylightSapling).growTree(event.world, event.x, event.y, event.z, event.world.rand);
		}
	}
	
	@SubscribeEvent
	public void onRenderOverlay(RenderGameOverlayEvent e){
		if(!Minecraft.getMinecraft().playerController.shouldDrawHUD() || e.isCancelable() || e.type != ElementType.EXPERIENCE) 
			return;
		GuiManaBar.draw();
	}
	
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event){
		ManaHelper.add(event.player.getDisplayName());
	}
	
	@SubscribeEvent
	public static void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event){
		ManaHelper.remove(event.player.getDisplayName());
	}
	
	@SubscribeEvent
	public static void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event){
		ManaHelper.add(event.player.getDisplayName());
	}
	
	@SubscribeEvent
	public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event){
		ManaHelper.add(event.player.getDisplayName());
	}
}