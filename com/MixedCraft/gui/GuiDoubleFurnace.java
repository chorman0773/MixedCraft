package com.MixedCraft.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import com.MixedCraft.blocks.container.ContainerDoubleFurnace;
import com.MixedCraft.blocks.tileEntity.TileEntityDoubleFurnace;

public class GuiDoubleFurnace extends GuiContainer
{
	private ResourceLocation tif = new ResourceLocation("textures/inputfurnace/textures/gui/tifGUI.png");
	private TileEntityDoubleFurnace inputFurnaceInventory;

	public GuiDoubleFurnace(InventoryPlayer inventoryplayer, TileEntityDoubleFurnace tileentityInputFurnace)
	{
		super(new ContainerDoubleFurnace(inventoryplayer, tileentityInputFurnace));
		inputFurnaceInventory = tileentityInputFurnace;
	}
	/**
	 * Draw the foreground layer for the GuiContainer (everythin in front of the items)
	 */
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		fontRenderer.drawString(StatCollector.translateToLocal("Dual Input Furnace"), 40, 6, 0x404040);
		fontRenderer.drawString(StatCollector.translateToLocal("Inventory"), 8, (ySize - 96) + 2, 0x404040);
	}
	/**
	 * Draw the background layer for the GuiContainer (everything behind the items)
	 */
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(tif);
		int l = (width - xSize) / 2;
		int i1 = (height - ySize) / 2;
		drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
		if (inputFurnaceInventory.isBurning())
		{
			int j1 = inputFurnaceInventory.getBurnTimeRemainingScaled(12);
			drawTexturedModalRect(l + 56, (i1 + 36 + 12) - j1, 176, 12 - j1, 14, j1 + 2);
		}
		int k1 = inputFurnaceInventory.getCookProgressScaled(24);
		drawTexturedModalRect(l + 79, i1 + 34, 176, 14, k1 + 1, 16);
	}
}