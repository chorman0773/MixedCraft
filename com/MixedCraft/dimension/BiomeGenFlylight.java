package com.MixedCraft.dimension;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LAKE;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND;

import java.util.Random;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraftforge.event.terraingen.TerrainGen;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.gen.WorldGenModReed;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BiomeGenFlylight extends BiomeGenBase{

	public BiomeGenFlylight() {
		super(DimensionHelper.FlyLightID);		 
		setBiomeName("Flylight");
		topBlock = (byte)BlockHelper.FlyLightGrass.blockID;
		fillerBlock = (byte)BlockHelper.FlyLightDirt.blockID;
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 3, 2, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 3, 2, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 3, 2, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 3, 2, 6));
        spawnableWaterCreatureList.clear();
        spawnableCaveCreatureList.clear();
		maxHeight = 2.0F;
		minHeight = 1.2F;
		this.theBiomeDecorator.reedGen = new WorldGenModReed();
	}

	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float par1)
	{
		return 0x00D91D;
	}

}
