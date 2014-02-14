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

public class GuiBlazeDNA extends GuiBaseDNA{

	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.fontRendererObj.drawString("BLAZE", 40 + 12, 20 - 33, 0xFFFFFF);
		
		this.fontRendererObj.drawString("Monster", 40 + 16, 20 + 39, 0xFFFFFF);

		this.fontRendererObj.drawString("Mob", 40 + 16, 20 + 56, 0xFFFFFF);
		
		this.fontRendererObj.drawString("Blaze", 40 + 16, 20 + 71, 0xFFFFFF);

		this.fontRendererObj.drawString("A Yellow flying creature that fires", 1 - 10, 20 + 129, 0xFFFFFF);
		this.fontRendererObj.drawString("little charges that set you on fire.", 1 - 10, 20 + 139, 0xFFFFFF);
	}
}