package com.MixedCraft.gui;

import java.awt.Color;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import com.MixedCraft.blocks.container.ContainerDisasembler;
import com.MixedCraft.blocks.tileEntity.TileEntityDisasembler;
import com.MixedCraft.handler.GuiResourceLocation;


public class GuiDisasembler extends GuiContainer
{
	private TileEntityDisasembler TeDisasembler;

	public GuiDisasembler(InventoryPlayer inventory, TileEntityDisasembler var7) 
	{
		super(new ContainerDisasembler(inventory, var7));
		this.TeDisasembler = var7;
	}

	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRenderer.drawString("Dissasembler", 10, 0, 4210752);
		this.fontRenderer.drawString("Inventory", 10, this.ySize - 96 - 7, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) 
	{
		
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(GuiResourceLocation.Dissasembler);
		this.xSize = 176;
		this.ySize = 184;
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
	}
	
    public void drawScreen(int par1, int par2, float par3)
	{
    	super.drawScreen(par1, par2, par3);
    	ItemStack item = null;
    	String s = null;
		item = TeDisasembler.getStackInSlot(1);
		if(item != null)
		{
			s = item.getDisplayName();
			this.drawString(fontRenderer, s, width / 2 - 20, 62, Color.cyan.getRGB());
		}		
	}
    
    public boolean doesGuiPauseGame()
    {
    	return false;
    }
    
    protected void keyTyped(char par1, int par2)
    {
        if (par2 == 1 || par2 == mc.gameSettings.keyBindInventory.keyCode)
        {
            mc.thePlayer.closeScreen();
        }
    }
}
