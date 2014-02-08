package com.MixedCraft.items;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

import com.MixedCraft.ItemHelper;
import com.MixedCraft.MixedCraft;
import com.MixedCraft.entity.EntityTorch;
import com.MixedCraft.helper.ItemsBase;

public class ItemTorchBow extends ItemsBase
{

	public ItemTorchBow(int par1) {
		super(par1, "");
		this.maxStackSize = 1;
		this.setMaxDamage(384);
		setUnlocalizedName("TorchBow");
		setCreativeTab(MixedCraft.MiscTab);
	}



	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer player, int par4) {
		int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

		ArrowLooseEvent event = new ArrowLooseEvent(player, par1ItemStack, j);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled()) {
			return;
		}
		j = event.charge;

		boolean flag = player.capabilities.isCreativeMode;

		if (flag || player.inventory.hasItem(Block.torchWood.block)) {

			float f10 = 1.0F;

			EntityTorch entityarrow = new EntityTorch(par2World, player, f10 * 2.0F);

			par1ItemStack.damageItem(1, player);
			par2World.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f10 * 0.5F);

			player.inventory.consumeInventoryItem(Block.torchWood.block);
			par2World.spawnEntityInWorld(entityarrow);
		}
	}

	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer player)
	{
		return par1ItemStack;
	}

	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 52000;
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.bow;
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player)
	{
		ArrowNockEvent event = new ArrowNockEvent(player, par1ItemStack);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
		{
			return event.result;
		}

		if (player.capabilities.isCreativeMode || player.inventory.hasItem(Block.torchWood.block))
		{
			player.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		}

		return par1ItemStack;
	}

	/**
	 * Return the enchantability factor of the item, most of the time is based on material.
	 */
	public int getItemEnchantability()
	{
		return 1;
	}

	private IIcon[] Texture = new IIcon[4];

	public void registerIcons(IIconRegister IIconRegister)
	{
		itemIcon = IIconRegister.registerIcon("MixedCraft:" + this.getUnlocalizedName().substring(5) + "_0");
		for (int N = 0; N < 4; N++)
		{
			this.Texture[N] = IIconRegister.registerIcon("MixedCraft:" + this.getUnlocalizedName().substring(5) + "_" + N);

		}
	}

	public IIcon getIIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
	{
		if(player.getItemInUse() == null) return this.itemIcon;

		int Pulling = stack.getMaxItemUseDuration() - useRemaining;

		if (Pulling >= 18)
		{
			return Texture[3];
		}

		else if (Pulling > 13)
		{
			return Texture[2];
		}

		else if (Pulling > 0)
		{
			return Texture[1];
		}	   

		return Texture[0];
	}
}