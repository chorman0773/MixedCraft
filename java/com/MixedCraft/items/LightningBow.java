package com.MixedCraft.items;

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
import com.MixedCraft.entity.EntityLightningArrow;
import com.MixedCraft.helper.ItemsBase;

public class LightningBow extends ItemsBase {

	public LightningBow() {
		this.maxStackSize = 1;
		this.setMaxDamage(500);
		setCreativeTab(MixedCraft.ToolTab);
	}

	/**
	 * called when the player releases the use item button. Args: itemstack, world, player, itemInUseCount
	 */
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer player, int par4)
	{
		int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

		ArrowLooseEvent event = new ArrowLooseEvent(player, par1ItemStack, j);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
		{
			return;
		}
		j = event.charge;

		boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

		if (flag || player.inventory.hasItem(ItemHelper.LightningArrow))
		{
			float f = (float)j / 20.0F;
			f = (f * f + f * 2.0F) / 3.0F;

			if ((double)f < 0.1D)
			{
				return;
			}

			if (f > 1.0F)
			{
				f = 1.0F;
			}


			float f10 = 1.0F;
			float f1 = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * f10;
			float f2 = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * f10;
			double d = player.prevPosX + (player.posX - player.prevPosX) * (double)f10;
			double d1 = (player.prevPosY + (player.posY - player.prevPosY) * (double)f10 + 1.6200000000000001D) - (double)player.yOffset;
			double d2 = player.prevPosZ + (player.posZ - player.prevPosZ) * (double)f10;
			Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
			float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
			float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
			float f5 = -MathHelper.cos(-f1 * 0.01745329F);
			float f6 = MathHelper.sin(-f1 * 0.01745329F);
			float f7 = f4 * f5;
			float f8 = f6;
			float f9 = f3 * f5;
			double d3 = 5000D;
			Vec3 vec3d1 = vec3d.addVector((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);


			EntityLightningArrow entityarrow = new EntityLightningArrow(par2World, player, f10 * 2.0F);

			if (f10 == 1.0F)
			{
				entityarrow.setIsCritical(true);
			}

			int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

			if (k > 0)
			{
				entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
			}

			int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

			if (l > 0)
			{
				entityarrow.setKnockbackStrength(l);
			}

			if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
			{
				entityarrow.setFire(100);
			}

			par1ItemStack.damageItem(1, player);
			par2World.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f10 * 0.5F);

			if (flag)
			{
				entityarrow.canBePickedUp = 2;
			}
			else
			{
				player.inventory.consumeInventoryItem(ItemHelper.LightningArrow);
			}

			/*if(movingobjectposition == null)
			{
				return;
			}

			if (movingobjectposition.entityHit != null)
			{
				int b = movingobjectposition.blockX;
				int r = movingobjectposition.blockY;
				int o = movingobjectposition.blockZ;
				par2World.spawnEntityInWorld(new EntityLightningBolt(par2World, b, r, o));

			}*/

				//par2World.spawnEntityInWorld(lightning);
			if(!par2World.isRemote)
				par2World.spawnEntityInWorld(entityarrow);
			}
		}
	


	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer player)
	{
		return par1ItemStack;
	}

	/**
	 * How long it takes to use or consume an item
	 */
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 72000;
	}

	/**
	 * returns the action that specifies what animation to play when the items is being used
	 */
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

		if (player.capabilities.isCreativeMode || player.inventory.hasItem(ItemHelper.LightningArrow))
		{
			player.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		}

		return par1ItemStack;
	}

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

	public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
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