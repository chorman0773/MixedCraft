package com.MixedCraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class WandOfHarming extends ItemBaseWand {

	public static int cooldown = 10;

	public static int defaultCharges = 64;

	public WandOfHarming(int itemID, String par2) {
		super(itemID, par2);
		this.setMaxDamage(defaultCharges + 1);
	}

	@Override
	public int getUseCost() {
		return 1;
	}

	@Override
	public int getBaseRepairCost() {
		return 15;
	}


	@Override 
	public ItemStack onItemRightClick(ItemStack srcItemStack, World world, EntityPlayer playerEntity){
		if (!playerEntity.capabilities.isCreativeMode)
		{
			if(isOutOfCharge(srcItemStack)){
				playSound(noChargeAttackSound, world, playerEntity);
				return srcItemStack;
			}
			srcItemStack.damageItem(getUseCost(), playerEntity);
		}
		playSound("random.pop", world, playerEntity);

		ItemStack hp = new ItemStack(Item.potion, 5);
		hp.setItemDamage(5149388);
		if (!world.isRemote)
		{
			world.spawnEntityInWorld(new EntityPotion(world, playerEntity, hp));
		}

		return srcItemStack;
	}
}
