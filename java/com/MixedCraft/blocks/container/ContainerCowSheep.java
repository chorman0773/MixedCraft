package com.MixedCraft.blocks.container;

import com.MixedCraft.entity.EntityCowSheep;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerCowSheep extends Container
{
    final EntityCowSheep field_90034_a;

    public ContainerCowSheep(EntityCowSheep par1EntitySheep)
    {
        this.field_90034_a = par1EntitySheep;
    }

    public boolean canInteractWith(EntityPlayer par1EntityPlayer)
    {
        return false;
    }
}
