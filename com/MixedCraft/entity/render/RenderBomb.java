package com.MixedCraft.entity.render;

import org.lwjgl.opengl.GL11;

import com.MixedCraft.entity.model.ModelBomb;
import com.MixedCraft.handler.EntityResourceLocation;
import com.MixedCraft.helper.Utils;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBomb extends Render{
	
	private ModelBomb model;
	
	public RenderBomb(){
		model = new ModelBomb();
		shadowSize = 0.5F;
	}
	
	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime) {
		GL11.glPushMatrix();
		
		GL11.glTranslatef((float)x, (float)y, (float)z);
		GL11.glScalef(-1F, -1F, 1F);
		
		func_110777_b(entity);
		model.render(entity, 0, 0, 0, 0, 0, 0.0635F);
		
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		return EntityResourceLocation.Bomb;
	}

}
