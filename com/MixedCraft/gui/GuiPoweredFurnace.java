package com.MixedCraft.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;

import org.lwjgl.opengl.GL11;

import com.MixedCraft.blocks.container.ContainerPowerFurnace;
import com.MixedCraft.blocks.tileEntity.TileEntityPowerFurnace;
import com.MixedCraft.handler.GuiResourceLocation;

public class GuiPoweredFurnace extends GuiContainer{
		
	public TileEntityPowerFurnace PowerFurnace;
	
	public GuiPoweredFurnace(InventoryPlayer invPlayer, TileEntityPowerFurnace entity) {
		super(new ContainerPowerFurnace(invPlayer, entity));
		
		this.PowerFurnace = entity;

		this.xSize = 176;
		this.ySize = 165;
	}
	
	public void drawGuiContainerForegroundLayer(int par1, int par2){
		String s = "Powered Furnace";
		this.fontRenderer.drawString(s, this.xSize / 2 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
		this.fontRenderer.drawString(I18n.getString("container.inventory"), 8, this.ySize - 96 + 5, 4210752);
	}
	
	public void drawGuiContainerBackgroundLayer(float f, int j, int i) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().
		bindTexture(GuiResourceLocation.PowerFurnace);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		int i1;

		if(this.PowerFurnace.hasPower()){
			i1 = this.PowerFurnace.getPowerRemainingScaled(45);
			this.drawTexturedModalRect(guiLeft + 8, guiTop + 53 - i1, 176, 62 - i1, 16, i1);
		}
		
		i1 = this.PowerFurnace.getCookProgressScaled(24);
		this.drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 0, i1 + 1, 16);
	}
}
