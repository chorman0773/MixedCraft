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

public class GuiChickenDNA extends GuiBaseDNA{

	public GuiChickenDNA(Container par1)
	{
		super(new DNAContainer());
	}
	
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRenderer.drawString("CHICKEN", 40 + 12, 20 - 33, 0xFFFFFF);
		
		this.fontRenderer.drawString("Animal", 40 + 16, 20 + 39, 0xFFFFFF);

		this.fontRenderer.drawString("Bird", 40 + 16, 20 + 56, 0xFFFFFF);
		
		this.fontRenderer.drawString("Chicken", 40 + 16, 20 + 71, 0xFFFFFF);

		this.fontRenderer.drawString("A little bird that likes seeds and", 1 - 10, 20 + 129, 0xFFFFFF);
		this.fontRenderer.drawString("lays eggs.", 1 - 10, 20 + 139, 0xFFFFFF);
	}
}
