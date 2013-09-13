package com.MixedCraft.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class EntityTNTArrow extends EntityModArrow {

    public EntityTNTArrow(World var1, EntityLivingBase entity, float var3) {
        super(var1, entity, var3, 0);
        shootingEntity = null;
    }

    public EntityTNTArrow(World par1World) {
        super(par1World, 0);
    }


}
