package com.MixedCraft.items.DNA.spawner;

import com.MixedCraft.ItemHelper;
import com.MixedCraft.MixedCraft;
import com.MixedCraft.entity.EntityChickenCow;
import com.MixedCraft.entity.EntityCowCreeper;
import com.MixedCraft.entity.EntityCowEnderman;
import com.MixedCraft.entity.EntityCowPig;
import com.MixedCraft.entity.EntityCowSheep;
import com.MixedCraft.entity.EntityCowZombie;
import com.MixedCraft.helper.ItemsBase;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCowSpawner extends ItemsBase {

	public Item setName(String name){
		registerTextures(name);
		setUnlocalizedName(name);
		setCreativeTab(MixedCraft.SpawnerTab);
		GameRegistry.registerItem(this, name);
		return this;
	}
	
	public boolean onItemUse(ItemStack item, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		int var4 = 0;
		if (!par3World.isRemote) {
			while (var4 < 1) {
				if(item.getItem().equals(ItemHelper.CowSheepSpawner)){
					EntityCowSheep var5 = new EntityCowSheep(par3World);
					var5.setPosition(par4, par5+1, par6);
					par3World.spawnEntityInWorld(var5);
					++var4;
				}

				if(item.getItem().equals(ItemHelper.CowPigSpawner)){
					EntityCowPig var5 = new EntityCowPig(par3World);
					var5.setPosition(par4, par5+1, par6);
					par3World.spawnEntityInWorld(var5);
					++var4;
					--item.stackSize;
				}

				if(item.getItem().equals(ItemHelper.CowChickenSpawner)){
					EntityChickenCow var5 = new EntityChickenCow(par3World);
					var5.setPosition(par4, par5+1, par6);
					par3World.spawnEntityInWorld(var5);
					++var4;
					--item.stackSize;
				}

				if(item.getItem().equals(ItemHelper.CowCreeperSpawner)){
					EntityCowCreeper var5 = new EntityCowCreeper(par3World);
					var5.setPosition(par4, par5+1, par6);
					par3World.spawnEntityInWorld(var5);
					++var4;
					--item.stackSize;
				}

				if(item.getItem().equals(ItemHelper.CowEndermanSpawner)){
					EntityCowEnderman var5 = new EntityCowEnderman(par3World);
					var5.setPosition(par4, par5+1, par6);
					par3World.spawnEntityInWorld(var5);
					++var4;
					--item.stackSize;
				}

				if(item.getItem().equals(ItemHelper.CowZombieSpawner)){
					EntityCowZombie var5 = new EntityCowZombie(par3World);
					var5.setPosition(par4, par5+1, par6);
					par3World.spawnEntityInWorld(var5);
					++var4;
					--item.stackSize;
				}
			}		
		}
		return false;
	}
}