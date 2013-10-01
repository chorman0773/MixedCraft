package com.MixedCraft.helper;

import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.model.ModelCow;
import net.minecraftforge.client.MinecraftForgeClient;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.ItemHelper;
import com.MixedCraft.blocks.tileEntity.TileEntityTable;
import com.MixedCraft.entity.EntityBomb;
import com.MixedCraft.entity.EntityChickenCow;
import com.MixedCraft.entity.EntityCowCreeper;
import com.MixedCraft.entity.EntityCowEnderman;
import com.MixedCraft.entity.EntityCowPig;
import com.MixedCraft.entity.EntityCowSheep;
import com.MixedCraft.entity.EntityCowZombie;
import com.MixedCraft.entity.EntityDroid;
import com.MixedCraft.entity.EntityShip;
import com.MixedCraft.entity.model.ModelDroid;
import com.MixedCraft.entity.model.ModelSheep1;
import com.MixedCraft.entity.model.ModelSheep2;
import com.MixedCraft.entity.render.ItemTableRenderer;
import com.MixedCraft.entity.render.RenderBomb;
import com.MixedCraft.entity.render.RenderChickenCow;
import com.MixedCraft.entity.render.RenderCowCreeper;
import com.MixedCraft.entity.render.RenderCowEnderman;
import com.MixedCraft.entity.render.RenderCowPig;
import com.MixedCraft.entity.render.RenderCowSheep;
import com.MixedCraft.entity.render.RenderCowZombie;
import com.MixedCraft.entity.render.RenderDroid;
import com.MixedCraft.entity.render.RenderDroidItem;
import com.MixedCraft.entity.render.RenderShip;
import com.MixedCraft.entity.render.RenderTable;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;


public class MobRendering {

	public static void init(){

		RenderingRegistry.registerEntityRenderingHandler(EntityChickenCow.class, new RenderChickenCow(new ModelChicken(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCowCreeper.class, new RenderCowCreeper());
		RenderingRegistry.registerEntityRenderingHandler(EntityCowPig.class, new RenderCowPig(new ModelCow(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCowSheep.class, new RenderCowSheep(new ModelSheep2(), new ModelSheep1(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCowEnderman.class, new RenderCowEnderman());
		RenderingRegistry.registerEntityRenderingHandler(EntityCowZombie.class, new RenderCowZombie());
		RenderingRegistry.registerEntityRenderingHandler(EntityShip.class, new RenderShip());
		RenderingRegistry.registerEntityRenderingHandler(EntityBomb.class, new RenderBomb());


		RenderingRegistry.registerEntityRenderingHandler(EntityDroid.class, new RenderDroid(new ModelDroid()));
        MinecraftForgeClient.registerItemRenderer(ItemHelper.Droid.itemID, new RenderDroidItem());
		
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTable.class, new RenderTable());
        MinecraftForgeClient.registerItemRenderer(BlockHelper.Table.blockID, new ItemTableRenderer());
        
        //ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHugeChest.class, new RenderHugeChest());
        //MinecraftForgeClient.registerItemRenderer(BlockHelper.HugeChest.blockID, new ItemRenderHugeChest());
        
        
	}

}
