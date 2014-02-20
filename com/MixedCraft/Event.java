package com.MixedCraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.entity.RenderOcelot;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import com.MixedCraft.blocks.BlockChocolateCrop;
import com.MixedCraft.blocks.FlylightSapling;
import com.MixedCraft.gui.GuiManaBar;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Event {	
	
	@SubscribeEvent
	public void bonemealUsed(BonemealEvent event) {
		if(event.world.getBlock(event.x, event.y, event.z) == BlockHelper.FlylightSapling) {
			((FlylightSapling)BlockHelper.FlylightSapling).growTree(event.world, event.x, event.y, event.z, event.world.rand);
		}
	}
	
	@SubscribeEvent
	public void onRenderOverlay(RenderGameOverlayEvent e){
		/*if(!Minecraft.getMinecraft().playerController.shouldDrawHUD() || e.isCancelable() || e.type != ElementType.EXPERIENCE) 
			return;*/
		
		GuiManaBar.draw();
	}
	
	/*@SubscribeEvent
	public static void onPlayerTrack(Player e){//TODO figure out IPlayerTracker
		
	}*/
}