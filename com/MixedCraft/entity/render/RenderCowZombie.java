package com.MixedCraft.entity.render;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import com.MixedCraft.entity.EntityCowCreeper;
import com.MixedCraft.entity.EntityCowZombie;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCowZombie extends RenderLiving
{
    private static final ResourceLocation field_110833_a = new ResourceLocation("MixedCraft:/textures/mobs/CowZombie.png");

    private ModelZombie endermanModel;

    public RenderCowZombie()
    {
        super(new ModelZombie(), 0.5F);
        this.endermanModel = (ModelZombie)super.mainModel;
        this.setRenderPassModel(this.endermanModel);
    }


    protected ResourceLocation func_110832_a(EntityCowZombie par1EntityCowPig)
    {
        return field_110833_a;
    }

    protected ResourceLocation func_110775_a(Entity par1Entity)
    {
        return this.func_110832_a((EntityCowZombie)par1Entity);
    }
    
    protected void renderLabel(EntityCowZombie entityLiving, double par2, double par4, double par6)
	{
	int distanceToEntity = 32;
	this.renderLivingLabel(entityLiving, entityLiving.getDisplayName(), par2, par4, par6, distanceToEntity);
	par4 += (double)((float)this.getFontRendererFromRenderManager().FONT_HEIGHT * 1.15F * par6);
	}

	protected void passSpecialRender(EntityLivingBase par1EntityLiving, double par2, double par4, double par6)
	{
	this.renderLabel((EntityCowZombie)par1EntityLiving, par2, par4, par6);
	}
}
