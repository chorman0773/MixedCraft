package com.MixedCraft.dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

import com.MixedCraft.MixedCraft;

public class WorldProviderFlyLight extends WorldProvider {

    @Override
    public void registerWorldChunkManager() {
        this.worldChunkMgr = new WorldChunkManagerHell(DimensionHelper.Flylight, 5.0F);
        this.dimensionId = DimensionHelper.FlyLightID;
    }

    @Override
    public float getCloudHeight() {
        return 128.0F;
    }

    @Override
    public IChunkProvider createChunkGenerator() {
        //return new ChunkGeneratorFlylight(this.worldObj, this.worldObj.getSeed());
    	return new ChunkGeneratorFlylight();
    }

    @Override
    public String getSaveFolder() {
    	return "Flylight";
    }

    @Override
    public boolean isSurfaceWorld() {
        return false;
    }

    @Override
    public boolean canRespawnHere() {
        return false;
    }

     @Override
    public String getDimensionName() {
        return "Flylight";
    }
}