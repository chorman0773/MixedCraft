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

public class GuiPigDNA extends GuiBaseDNA{

	
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString("PIG", 40 + 12, 20 - 33, 0xFFFFFF);
		
		this.fontRendererObj.drawString("Animal", 40 + 16, 20 + 39, 0xFFFFFF);

		this.fontRendererObj.drawString("Mammal", 40 + 16, 20 + 56, 0xFFFFFF);
		
		this.fontRendererObj.drawString("Pig", 40 + 16, 20 + 71, 0xFFFFFF);

		this.fontRendererObj.drawString("A wandering animal that grazes through", 1 - 10, 20 + 129, 0xFFFFFF);
		this.fontRendererObj.drawString("the grass. This animal has four legs.", 1 - 10, 20 + 139, 0xFFFFFF);
		this.fontRendererObj.drawString("This animal is used for pork.", 1 - 10, 20 + 149, 0xFFFFFF);

	}

}
