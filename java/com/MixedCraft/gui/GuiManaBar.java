package com.MixedCraft.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import com.MixedCraft.helper.ConfigHelper;
import com.MixedCraft.helper.ManaHelper;

public class GuiManaBar {

	private static Minecraft mc = Minecraft.getMinecraft();

	public static void draw(){
		if(mc.currentScreen == null) {
			String s = "MANA BAR";
			GuiIngame gig = mc.ingameGUI;
			EntityPlayer player = Minecraft.getMinecraft().thePlayer;
			int var29;
			int var26;
			ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int k = scaledresolution.getScaledHeight();
			mc.getTextureManager().bindTexture(new ResourceLocation("MixedCraft:textures/gui/ManaBar.png"));
			var26 = k - ConfigHelper.manaY;
			var29 = i - ConfigHelper.manaX;
			gig.drawTexturedModalRect(var29, var26, 0, 0, 200 + 3, 10);
			gig.drawTexturedModalRect(var29, var26, 0, 10, (int) ManaHelper.getBarValue() + 1, 20);  
		}
	}
}
