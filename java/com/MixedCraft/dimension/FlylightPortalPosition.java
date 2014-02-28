package com.MixedCraft.dimension;

import net.minecraft.util.ChunkCoordinates;

public class FlylightPortalPosition extends ChunkCoordinates
{
    public long field_85087_d;
    final TeleporterFlylight field_85088_e;

    public FlylightPortalPosition(TeleporterFlylight iceikaTeleporter, int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.field_85088_e = iceikaTeleporter;
        this.field_85087_d = par5;
    }
}