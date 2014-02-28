package com.MixedCraft.blocks.tileEntity;

import net.minecraft.tileentity.TileEntity;

import com.MixedCraft.blocks.BlockSolarPanel;

public class TileEntitySolarPanel extends TileEntity
{
    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
        if (this.worldObj != null && !this.worldObj.isRemote && this.worldObj.getTotalWorldTime() % 20L == 0L)
        {
            this.blockType = this.getBlockType();

            if (this.blockType != null && this.blockType instanceof BlockSolarPanel)
            {
                ((BlockSolarPanel)this.blockType).updateLightLevel(this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
    }
}
