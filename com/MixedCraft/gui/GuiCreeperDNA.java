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

public class GuiCreeperDNA extends GuiBaseDNA{

	public GuiCreeperDNA(Container par1)
	{
		super(new DNAContainer());
	}
	
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRenderer.drawString("CREEPER", 40 + 12, 20 - 33, 0xFFFFFF);
		
		this.fontRenderer.drawString("Monster", 40 + 16, 20 + 39, 0xFFFFFF);

		this.fontRenderer.drawString("Mob", 40 + 16, 20 + 56, 0xFFFFFF);
		
		this.fontRenderer.drawString("Creeper", 40 + 16, 20 + 71, 0xFFFFFF);

		this.fontRenderer.drawString("A little green monster that creeps", 1 - 10, 20 + 129, 0xFFFFFF);
		this.fontRenderer.drawString("around and explodes.", 1 - 10, 20 + 139, 0xFFFFFF);
	}
}
