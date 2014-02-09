package com.MixedCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.BlocksBase;

public class ModDirt extends BlocksBase {

    public ModDirt() {
        super(Material.ground);
        setCreativeTab(MixedCraft.BlockTab);
        setStepSound(Block.soundTypeGravel);
    }

    
}
