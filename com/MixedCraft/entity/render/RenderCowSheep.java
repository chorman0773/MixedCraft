package com.MixedCraft.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.MixedCraft.MobNames;
import com.MixedCraft.entity.EntityCowCreeper;
import com.MixedCraft.entity.EntityCowSheep;
import com.MixedCraft.handler.EntityResourceLocation;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCowSheep extends RenderLiving
{

	public RenderCowSheep(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3)
	{
		super(par1ModelBase, par3);
		this.setRenderPassModel(par2ModelBase);
	}

	protected int setWoolColorAndRender(EntityCowSheep par1EntityCowSheep, int par2, float par3)
	{
		if (par2 == 0 && !par1EntityCowSheep.getSheared())
		{
			this.bindTexture(EntityResourceLocation.CowSheepWool);
			float f1 = 1.0F;
			int j = par1EntityCowSheep.getFleeceColor();
			return 1;
		}
		else
		{
			return -1;
		}
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return EntityResourceLocation.CowSheep;
	}

	/**
	 * Queries whether should render the specified pass or not.
	 */
	 protected int shouldRenderPass(EntityLivingBase par1EntityLivingBase, int par2, float par3)
	 {
		 return this.setWoolColorAndRender((EntityCowSheep)par1EntityLivingBase, par2, par3);
	 }

	 protected void renderLabel(EntityCowSheep entityLiving, double par2, double par4, double par6)
	 {
		 int distanceToEntity = 32;
		 //this.renderLivingLabel(entityLiving, MobNames.COWSHEEP, par2, par4, par6, distanceToEntity);
		 par4 += (double)((float)this.getFontRendererFromRenderManager().FONT_HEIGHT * 1.15F * par6);
	 }

	 protected void passSpecialRender(EntityLivingBase par1EntityLiving, double par2, double par4, double par6)
	 {
		 this.renderLabel((EntityCowSheep)par1EntityLiving, par2, par4, par6);
	 }
}
