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

public class GuiWitherSkeletonDNA extends GuiBaseDNA{

	public GuiWitherSkeletonDNA(Container par1)
	{
		super(new DNAContainer());
	}
	
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRenderer.drawString("WITHER SKELTON", 40 + 12, 20 - 33, 0xFFFFFF);
		
		this.fontRenderer.drawString("Monster", 40 + 16, 20 + 39, 0xFFFFFF);

		this.fontRenderer.drawString("Mob", 40 + 16, 20 + 56, 0xFFFFFF);
		
		this.fontRenderer.drawString("Wither Skeleton", 40 + 16, 20 + 71, 0xFFFFFF);

		this.fontRenderer.drawString("A skeleton type mob that uses a", 1 - 10, 20 + 129, 0xFFFFFF);
		this.fontRenderer.drawString("sword instead of a bow, this mob", 1 - 10, 20 + 139, 0xFFFFFF);
		this.fontRenderer.drawString("can cause a bad effect on touch.", 1 - 10, 20 + 149, 0xFFFFFF);
		
	}
}
