package com.MixedCraft;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

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
	public void onBlockHarvested(HarvestDropsEvent event){
		if (event.harvester != null) {
			if (event.harvester.getHeldItem().getItem() == ItemHelper.SilverPickaxe || event.harvester.getHeldItem().getItem() == ItemHelper.SilverShickaxe) {
				ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(event.block, 1, event.blockMetadata));
				if (stack != null && event.block != Blocks.redstone_ore && event.block != Blocks.lapis_ore) {
					event.drops.clear();
					event.drops.add(stack.copy());
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event){
		ManaHelper.add(event.player.getDisplayName());
	}

	@SubscribeEvent
	public void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event){
		ManaHelper.remove(event.player.getDisplayName());
	}

	@SubscribeEvent
	public void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event){
		ManaHelper.add(event.player.getDisplayName());
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event){
		ManaHelper.add(event.player.getDisplayName());
	}
}