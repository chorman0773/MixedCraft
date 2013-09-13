package com.MixedCraft.dimension.flylight;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class Flylight extends BiomeGenBase
{
    public Flylight(int var1)
    {
        super(var1);
        this.setBiomeName("FlyLight");
        this.topBlock = (byte)Block.grass.blockID;
        this.fillerBlock = (byte)Block.dirt.blockID;
    }
}
