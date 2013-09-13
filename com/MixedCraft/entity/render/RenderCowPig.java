package com.MixedCraft.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import com.MixedCraft.entity.EntityCowCreeper;
import com.MixedCraft.entity.EntityCowPig;
import com.MixedCraft.handler.EntityResourceLocation;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCowPig extends RenderLiving
{
	
    public RenderCowPig(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation func_110832_a(EntityCowPig par1EntityCowPig)
    {
        return EntityResourceLocation.CowPig;
    }

    protected ResourceLocation func_110775_a(Entity par1Entity)
    {
        return this.func_110832_a((EntityCowPig)par1Entity);
    }
    
    protected void renderLabel(EntityCowPig entityLiving, double par2, double par4, double par6){
	int distanceToEntity = 32;
	this.renderLivingLabel(entityLiving, entityLiving.getDisplayName(), par2, par4, par6, distanceToEntity);
	par4 += (double)((float)this.getFontRendererFromRenderManager().FONT_HEIGHT * 1.15F * par6);
	}

	protected void passSpecialRender(EntityLivingBase par1EntityLiving, double par2, double par4, double par6)
	{
	this.renderLabel((EntityCowPig)par1EntityLiving, par2, par4, par6);
	}
}
