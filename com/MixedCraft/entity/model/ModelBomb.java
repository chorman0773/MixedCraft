package com.MixedCraft.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBomb extends ModelBase
{
  
    ModelRenderer Tip;
    ModelRenderer Body;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg0;
  
  public ModelBomb()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Tip = new ModelRenderer(this, 0, 15);
      Tip.addBox(0F, 0F, 0F, 3, 2, 3);
      Tip.setRotationPoint(1F, 2F, 1F);
      Tip.setTextureSize(64, 32);
      Tip.mirror = true;
      setRotation(Tip, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 4);
      Body.addBox(0F, 0F, 0F, 5, 6, 5);
      Body.setRotationPoint(0F, -4F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 0);
      Leg1.addBox(0F, 0F, 0F, 4, 3, 1);
      Leg1.setRotationPoint(5F, -3F, 1F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 1.570796F, 0F, -0.7853982F);
      Leg2 = new ModelRenderer(this, 0, 0);
      Leg2.addBox(0F, 0F, 0F, 4, 3, 1);
      Leg2.setRotationPoint(1F, -3F, 0F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 1.570796F, 1.570796F, -0.7853982F);
      Leg3 = new ModelRenderer(this, 0, 0);
      Leg3.addBox(0F, 0F, 0F, 4, 3, 1);
      Leg3.setRotationPoint(0F, -3F, 4F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 1.570796F, 3.141593F, -0.7853982F);
      Leg0 = new ModelRenderer(this, 0, 0);
      Leg0.addBox(0F, 0F, 0F, 4, 3, 1);
      Leg0.setRotationPoint(4F, -3F, 5F);
      Leg0.setTextureSize(64, 32);
      Leg0.mirror = true;
      setRotation(Leg0, 1.570796F, -1.570796F, -0.7853982F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Tip.render(f5);
    Body.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg0.render(f5);
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
