package com.MixedCraft.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.world.World;

public class MagicMissile extends EntityArrow{

	public MagicMissile(World par1World)
	{
		super(par1World);
		this.canBePickedUp = 0;
	}

	public MagicMissile(World par1World, double par2, double par4, double par6)
	{
		super(par1World,par2,par4,par6);
		this.canBePickedUp = 0;
	}

	public MagicMissile(World par1World, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase, float par4, float par5)
	{
		super(par1World,par2EntityLivingBase,par3EntityLivingBase,par4,par5);
		this.canBePickedUp = 0;
	}

	public MagicMissile(World par1World, EntityLivingBase par2EntityLivingBase, float par3)
	{
		super(par1World,par2EntityLivingBase,par3);
		this.canBePickedUp = 0;
	}

}
