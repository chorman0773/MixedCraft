package com.MixedCraft.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.MixedCraft.blocks.container.ContainerBigCrafting;
import com.MixedCraft.blocks.container.ContainerHugeChest;

public class GuiHugeChest extends GuiContainer
{
	private static final ResourceLocation field_110410_t = new ResourceLocation("MixedCraft:/textures/gui/HugeChest.png");

	public GuiHugeChest(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5)
	{
		super(new ContainerHugeChest(par1InventoryPlayer, par1InventoryPlayer));
	}

	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRenderer.drawString("Huge Chest", 40 + 5, - 10 - 10, 4210752);
		this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 50 + 14, this.ySize - 96 - 10 - 19, 4210752);
	}


	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{

		this.mc.func_110434_K().func_110577_a(field_110410_t);

		this.ySize = 311;
		this.xSize = 176;

		int var5 = (this.width - this.xSize) / 2;
		int var6 = (this.height - this.ySize) / 2;
		int var7;

		this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
	}
}