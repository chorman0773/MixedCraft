package com.MixedCraft.entity.render;

import com.MixedCraft.entity.EntityChickenCow;
import com.MixedCraft.entity.EntityCowCreeper;
import com.MixedCraft.handler.EntityResourceLocation;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderChickenCow extends RenderLiving
{
	
    public RenderChickenCow(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    public void renderChicken(EntityChickenCow par1EntityChickenCow, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityChickenCow, par2, par4, par6, par8, par9);
    }

	protected ResourceLocation getEntityTexture(Entity entity){
        return EntityResourceLocation.ChickenCow;
    }

    protected float getWingRotation(EntityChickenCow par1EntityChickenCow, float par2)
    {
        float f1 = par1EntityChickenCow.field_70888_h + (par1EntityChickenCow.field_70886_e - par1EntityChickenCow.field_70888_h) * par2;
        float f2 = par1EntityChickenCow.field_70884_g + (par1EntityChickenCow.destPos - par1EntityChickenCow.field_70884_g) * par2;
        return (MathHelper.sin(f1) + 1.0F) * f2;
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderChicken((EntityChickenCow)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityLivingBase par1EntityLivingBase, float par2)
    {
        return this.getWingRotation((EntityChickenCow)par1EntityLivingBase, par2);
    }

    public void renderPlayer(EntityLivingBase par1EntityLivingBase, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderChicken((EntityChickenCow)par1EntityLivingBase, par2, par4, par6, par8, par9);
    }

    protected ResourceLocation func_110775_a(Entity par1Entity)
    {
        return this.getEntityTexture((EntityChickenCow)par1Entity);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderChicken((EntityChickenCow)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void renderLabel(EntityChickenCow entityLiving, double par2, double par4, double par6)
	{
		int distanceToEntity = 32;
		this.renderLivingLabel(entityLiving, entityLiving.getDisplayName(), par2, par4, par6, distanceToEntity);
		par4 += (double)((float)this.getFontRendererFromRenderManager().FONT_HEIGHT * 1.15F * par6);
	}

	protected void passSpecialRender(EntityLivingBase par1EntityLiving, double par2, double par4, double par6)
	{
		this.renderLabel((EntityChickenCow)par1EntityLiving, par2, par4, par6);
	}
}
