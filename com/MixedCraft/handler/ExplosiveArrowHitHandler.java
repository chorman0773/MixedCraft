package com.MixedCraft.handler;

import net.minecraft.entity.Entity;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import com.MixedCraft.entity.EntityTNTArrow;

public class ExplosiveArrowHitHandler {

    @ForgeSubscribe
    public void onEntityDamage(LivingHurtEvent event) 
    {
        if(event.source != null && event.source.getEntity() != null && event.source.getEntity() instanceof EntityTNTArrow)
        {
            Entity arrow = event.source.getEntity();
            event.entity.worldObj.createExplosion(event.source.getEntity(), arrow.posX, arrow.posY, arrow.posZ, 3F, false);
        }
    }	

}
