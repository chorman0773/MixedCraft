package com.MixedCraft.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBomb extends ModelBase
{

	ModelRenderer Tip;
	ModelRenderer Body;
	ModelRenderer[] Legs;

	public ModelBomb()
	{
		textureWidth = 64;
		textureHeight = 32;

		Tip = new ModelRenderer(this, 0, 15);
		Tip.addBox(-2F, -1F, -2F, 4, 2, 4);
		Tip.setRotationPoint(0F, 0F, -1F);
		Tip.setTextureSize(64, 32);
		Tip.mirror = true;
		setRotation(Tip, 0F, 0F, 0F);

		Body = new ModelRenderer(this, 0, 4);
		Body.addBox(-2.5F, -3F, -3.5F, 5, 6, 5);
		Body.setRotationPoint(0F, -4F, 0F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);

		Legs = new ModelRenderer[4];
		for(int i = 0; i < Legs.length; i++) {
			ModelRenderer rotationHelper = new ModelRenderer(this);
			ModelRenderer Leg = new ModelRenderer(this, 0, 0);
			Leg.addBox(5F, -1.5F, 1.5F, 4, 3, 1);
			rotationHelper.setRotationPoint(0F, -1F, 0F);
			rotationHelper.addChild(Leg);
			
			Leg.setTextureSize(64, 32);
			Leg.mirror = true;
			
			setRotation(rotationHelper, 0, 1.570796F * i, 0);
			setRotation(Leg, 1.570796F, 0, -0.7853982F);

			Legs[i] = rotationHelper;
		}
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Tip.render(f5);
		Body.render(f5);
		for(ModelRenderer Leg : Legs){
			Leg.render(f5);
		}

	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
