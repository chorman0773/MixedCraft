package com.MixedCraft.blocks.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class DNAContainer extends Container
{
        public DNAContainer()
        {
        	
        }
        
        public boolean canInteractWith(EntityPlayer entityplayer)
        {
                return true;
        }
}