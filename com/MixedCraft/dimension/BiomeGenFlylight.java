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
		this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 5, 2, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 5, 2, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 5, 2, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 5, 2, 6));
        spawnableWaterCreatureList.clear();
        spawnableCaveCreatureList.clear();
		maxHeight = 2.0F;
		minHeight = 1.2F;
		this.theBiomeDecorator.reedGen = new WorldGenModReed();
	}

	@Override
	public void decorate(World currentWorld, Random randomGenerator, int chunk_X, int chunk_Z) {
		super.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z);

		int j, k, l, i1;
		boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X,  chunk_Z, SAND);

		doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, LAKE);
		if (doGen)
		{
			for (j = 0; j < 50; ++j)
			{
				k = chunk_X + randomGenerator.nextInt(16) + 8;
				l = randomGenerator.nextInt(randomGenerator.nextInt(120) + 8);
				i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
				(new WorldGenLiquids(BlockHelper.Water.blockID)).generate(currentWorld, randomGenerator, k, l, i1);
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float par1)
	{
		return 0x00D91D;
	}

}
