package com.MixedCraft.handler;

import java.util.EnumSet;
import java.util.Random;

import com.MixedCraft.ItemHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MixedCraftTickHandler implements ITickHandler
{
	Random rand = new Random();

	public void onPlayerTick(EntityPlayer player, World par2World, Random random, int x, int y, int z)
	{
		ItemStack boots = player.getCurrentArmor(0);
		ItemStack legs = player.getCurrentArmor(1);
		ItemStack chest = player.getCurrentArmor(2);
		ItemStack helm = player.getCurrentArmor(3);

		if(boots != null && legs != null && chest != null && helm != null)
		{
			if(boots.itemID == ItemHelper.SuperBoots.itemID && legs.itemID == ItemHelper.SuperLegs.itemID && chest.itemID == ItemHelper.SuperBody.itemID && helm.itemID == ItemHelper.SuperHelmet.itemID)
				if(!(player.isPotionActive(Potion.moveSpeed))){}
			if(!(player.isPotionActive(Potion.jump))){}
			{
				double d3 = this.rand.nextGaussian() * 0.02D;
				double d4 = this.rand.nextGaussian() * 0.1D;
				double d5 = this.rand.nextGaussian() * 0.02D;
				Minecraft.getMinecraft().theWorld.spawnParticle("enchantmenttable",player.posX, player.posY, player.posZ, d3, d4, d5);

				if(player.worldObj.getBlockId((int) player.posX, (int) player.posY - 1, (int) player.posZ) == Block.waterStill.blockID)
				{
					player.motionY = 0;
				}

				System.out.println("[MixedCraft Tick Handler] Tick Handler Works Good!");
				player.capabilities.allowFlying = true;
				player.fallDistance = 0.0F;

				player.addPotionEffect((new PotionEffect((Potion.moveSpeed.id), 200, 8)));
				player.addPotionEffect((new PotionEffect((Potion.jump.id), 200, 12)));
			}
		}
		
		
		else if(boots != null && legs != null && chest != null && helm != null)
		{
			if(boots.itemID == ItemHelper.FlameBoots.itemID && legs.itemID == ItemHelper.FlameLegs.itemID && chest.itemID == ItemHelper.FlameBody.itemID && helm.itemID == ItemHelper.FlameHelmet.itemID)
				if(!(player.isPotionActive(Potion.fireResistance))){}
			{
				double d0 = this.rand.nextGaussian() * 0.02D;
				double d1 = this.rand.nextGaussian() * 0.02D;
				double d2 = this.rand.nextGaussian() * 0.02D;
				Minecraft.getMinecraft().theWorld.spawnParticle("flame",player.posX, player.posY, player.posZ, d0, d1, d2);
				Minecraft.getMinecraft().theWorld.spawnParticle("lava",player.posX, player.posY, player.posZ, d0, d1, d2);

				if (player.isInWater())
				{
					player.addPotionEffect((new PotionEffect((Potion.poison.id), 50, 1)));
				}
				player.addPotionEffect((new PotionEffect((Potion.fireResistance.id), 200, 1)));
			}
		}
	}

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{
		if(type.equals(EnumSet.of(TickType.PLAYER)))
		{
			onPlayerTick((EntityPlayer) tickData[0], null, null, 0, 0, 0);
		}
	}
	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
	}
	@Override
	public EnumSet<TickType> ticks()
	{
		return EnumSet.of(TickType.PLAYER);
	}
	@Override
	public String getLabel()
	{
		return "MixedCraft Tick Handler";
	}
}