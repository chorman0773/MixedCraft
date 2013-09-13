package com.MixedCraft.entity.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.MixedCraft.entity.EntityDroid;
import com.MixedCraft.entity.model.ModelDroid;
import com.MixedCraft.helper.Utils;

public class RenderDroid extends Render{

	private ModelDroid model;

	public RenderDroid(ModelDroid droid){
		model = droid;
		shadowSize = 0.5F;
		
	}

	public static final ResourceLocation texture = new ResourceLocation("mixedcraft", "textures/Model/Droid.png");


	public void renderDroid(EntityDroid droid, double x, double y, double z, float yaw, float partialTickTime){
		GL11.glPushMatrix();

		GL11.glTranslatef((float)x, (float)y, (float)z);
		GL11.glScalef(-1F, -1F, 1F);

		func_110777_b(droid);
		model.render(droid.getCoreRotation(), droid.getPanelRotation(), droid.getOuterPanelRotation(), droid.getHelmetPosition(), droid.getRedColour(), droid.getGreenColour(), droid.getBlueColour(), 0.0625F);

		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		return texture;
	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime) {
		renderDroid((EntityDroid)entity, x, y, z, yaw, partialTickTime);
	}

}