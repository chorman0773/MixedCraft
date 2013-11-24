package com.MixedCraft.helper;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler {

	public void tickStart(EnumSet var1, Object ... var2) {}

	public void tickEnd(EnumSet var1, Object ... var2) {
		manaRegen();
	}

	public EnumSet ticks() {
		return EnumSet.of(TickType.SERVER);
	}

	public String getLabel() {
		return "Mixedcraft Server Ticks";
	}

	public void onRenderTick() {}

	public void onTickInGUI(GuiScreen var1) {}

	public static void manaRegen() {
		ManaHelper.updateAllBars(MinecraftServer.getServer().getConfigurationManager().playerEntityList);
	}
}
