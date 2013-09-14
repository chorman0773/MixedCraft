package com.MixedCraft.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import com.MixedCraft.blocks.container.ContainerDNAAssembler;
import com.MixedCraft.blocks.tileEntity.TileEntityDNAAssembler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class GuiMobAssembler extends GuiContainer{
    private static final ResourceLocation field_110410_t = new ResourceLocation("MixedCraft:/textures/gui/Assembler.png");

    private TileEntityDNAAssembler furnaceInventory;

	   public GuiMobAssembler(InventoryPlayer var1, TileEntityDNAAssembler var2)
	    {
	        super(new ContainerDNAAssembler(var1, var2));
	        this.furnaceInventory = var2;
	        
	        this.xSize = 176;
			this.ySize = 185;
	    }
	
	
	
	   protected void drawGuiContainerForegroundLayer(int par1, int par2)
	    {
	        this.fontRenderer.drawString("Mob Assembler", 50, 6, 0xFFFFFF);
	        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 90 - 10, 4210752);
	    }

	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(field_110410_t);
		
		this.xSize = 176;
		this.ySize = 197;
		
		int var5 = (this.width - this.xSize) / 2;
		int var6 = (this.height - this.ySize) / 2;
		int var7;
		
		this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
	
		if (this.furnaceInventory.isBurning())
        {
        	var7 = this.furnaceInventory.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 2);
        }

        var7 = this.furnaceInventory.getCookProgressScaled(80);
        this.drawTexturedModalRect(var5 + 45, var6 + 42, 176, 14, var7 + 0, 80);
    }
}


