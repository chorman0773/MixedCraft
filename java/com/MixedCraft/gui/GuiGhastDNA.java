package com.MixedCraft.gui;

import com.MixedCraft.blocks.container.ContainerBigCrafting;
import com.MixedCraft.blocks.container.DNAContainer;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiGhastDNA extends GuiBaseDNA{

	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.fontRendererObj.drawString("GHAST", 40 + 12, 20 - 33, 0xFFFFFF);
		
		this.fontRendererObj.drawString("Monster", 40 + 16, 20 + 39, 0xFFFFFF);

		this.fontRendererObj.drawString("Mob", 40 + 16, 20 + 56, 0xFFFFFF);
		
		this.fontRendererObj.drawString("Ghast", 40 + 16, 20 + 71, 0xFFFFFF);

		this.fontRendererObj.drawString("A large creature thats in the", 1 - 10, 20 + 129, 0xFFFFFF);
		this.fontRendererObj.drawString("Nether and fires charges at you", 1 - 10, 20 + 139, 0xFFFFFF);
		this.fontRendererObj.drawString("on sight.", 1 - 10, 20 + 149, 0xFFFFFF);	
	}
}