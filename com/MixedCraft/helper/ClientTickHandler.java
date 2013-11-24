package com.MixedCraft.helper;

import java.awt.Color;
import java.awt.Point;
import java.util.EnumSet;


import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ClientTickHandler implements ITickHandler
{
	private static boolean initialized = false;

	Minecraft mc = Minecraft.getMinecraft();
	World world = FMLClientHandler.instance().getClient().theWorld;
	
	@Override
	public void tickStart(EnumSet var1, Object ... mc) {
	}

	@Override
	public void tickEnd(EnumSet var1, Object ... mc) {
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;

		if (!var1.equals(EnumSet.of(TickType.RENDER)) && var1.equals(EnumSet.of(TickType.CLIENT)) && FMLClientHandler.instance().getClient().currentScreen == null && !initialized) {
			initialized = true;
			FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage(EnumChatFormatting.GREEN + "Welcome " + player.username);
		}
		else if (var1.equals(EnumSet.of(TickType.RENDER))) {
			onRenderTick();
		}

	}


	@Override
	public EnumSet ticks() {
		return EnumSet.of(TickType.RENDER, TickType.CLIENT, TickType.PLAYER);
	}

	@Override
	public String getLabel() {
		return "Mixedcraft Client Ticks";
	}
	
	public void onRenderTick() {

		//Minecraft mc = Minecraft.getMinecraft();
		GuiIngame gig = mc.ingameGUI;
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		//World world = FMLClientHandler.instance().getClient().theWorld;
		if(mc.currentScreen == null) {
		int var29;
		int var19;
		int var26;
		int var47;
		ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int k = scaledresolution.getScaledHeight();
		this.mc.getTextureManager().bindTexture(new ResourceLocation("MixedCraft:textures/gui/ManaBar.png"));
		var26 = k - 18;
		var29 = i - 220;
		gig.drawTexturedModalRect(var29, var26, 0, 0, 200 + 3, 10);
		gig.drawTexturedModalRect(var29, var26, 0, 10, (int) ManaHelper.getBarValue() + 1, 20);  
		}
	}
}