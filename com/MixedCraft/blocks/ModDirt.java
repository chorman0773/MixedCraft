package com.MixedCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.MixedCraft.MixedCraft;

public class ModDirt extends Block {

    public ModDirt() {
        super(Material.ground);
        setCreativeTab(MixedCraft.BlockTab);
        setStepSound(Block.soundTypeGravel);
    }

    
}
