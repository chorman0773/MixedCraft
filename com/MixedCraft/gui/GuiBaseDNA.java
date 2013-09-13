package com.MixedCraft.gui;

import com.MixedCraft.blocks.container.ContainerBigCrafting;
import com.MixedCraft.blocks.container.DNAContainer;
import com.MixedCraft.handler.GuiResourceLocation;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiBaseDNA extends GuiContainer{

	public GuiBaseDNA(Container par1)
	{
		super(new DNAContainer());
	}
	
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		
	}


	public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{
        
		
		this.mc.func_110434_K().func_110577_a(GuiResourceLocation.DNA);

		this.xSize = 238;
		this.ySize = 247;

		int var5 = (this.width - this.xSize) / 2;
		int var6 = (this.height - this.ySize) / 2;

		this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);

	}


}
