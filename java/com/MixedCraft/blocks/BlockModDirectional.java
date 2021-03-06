package com.MixedCraft.blocks;

import com.MixedCraft.helper.BlocksBase;

import net.minecraft.block.material.Material;

public abstract class BlockModDirectional extends BlocksBase
{
    protected BlockModDirectional(Material par2Material)
    {
        super(par2Material);
    }

    /**
     * Returns the orentation value from the specified metadata
     */
    public static int getDirection(int par0)
    {
        return par0 & 3;
    }
}
