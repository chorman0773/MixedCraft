package com.MixedCraft.dimension.flylight;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.dimension.DimensionHelper;

public class WorldProviderFlyLight extends WorldProvider
{

    @Override
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManagerHell(MixedCraft.flyLight, 0.5F, 0.5F);
        this.dimensionId = DimensionHelper.FlyLightID;
    }

    @Override
    public float getCloudHeight()
    {
        return 128.0F;
    }

    @Override
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderFlyLight(this.worldObj, this.worldObj.getSeed(), true);
    }

    @Override
    public boolean isSurfaceWorld()
    {
        return false;
    }

    @Override
    public float calculateCelestialAngle(long var1, float var3)
    {
        return 0.1F;
    }

    @Override
    public boolean canRespawnHere()
    {
        return false;
    }

    @Override
    public String getWelcomeMessage()
    {
        return "Entering FlyLight";
    }

    @Override
    public String getDepartMessage()
    {
        return "Leaving FlyLight";
    }

    @Override
    public String getDimensionName()
    {
        return "FlyLight";
    }
}
