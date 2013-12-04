package com.MixedCraft.entity.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import com.MixedCraft.MobNames;
import com.MixedCraft.entity.EntityCompanion;
import com.MixedCraft.entity.EntityCowPig;
import com.MixedCraft.handler.EntityResourceLocation;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderTameable extends RenderLiving
{

	private ModelZombie endermanModel;

	public RenderTameable()
	{
		super(new ModelZombie(), 0.5F);
		this.endermanModel = (ModelZombie)super.mainModel;
		this.setRenderPassModel(this.endermanModel);
	}

	protected ResourceLocation getEntityTexture(Entity entity){
		return EntityResourceLocation.CowZombie;
	}

	protected void renderLabel(EntityCompanion entityLiving, double par2, double par4, double par6){
		int distanceToEntity = 32;
		this.renderLivingLabel(entityLiving, entityLiving.getOwnerName() + "'s Companion", par2, par4, par6, distanceToEntity);
		par4 += (double)((float)this.getFontRendererFromRenderManager().FONT_HEIGHT * 1.50F * par6);
	}

	@Override
	protected void passSpecialRender(EntityLivingBase par1EntityLiving, double par2, double par4, double par6)
	{
		this.renderLabel((EntityCompanion)par1EntityLiving, par2, par4, par6);
	}
}
