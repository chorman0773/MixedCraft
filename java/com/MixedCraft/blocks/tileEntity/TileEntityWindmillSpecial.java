package com.MixedCraft.blocks.tileEntity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import com.MixedCraft.helper.Utils;

public class TileEntityWindmillSpecial extends TileEntitySpecialRenderer {

	public static ResourceLocation texture = new ResourceLocation(Utils.MOD_ID, "textures/blocks/windmillModel.png");

	public int width = 64, height = 32;
	private Tessellator t = Tessellator.instance;

	@Override
	public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		this.bindTexture(texture);
		t.startDrawingQuads(); {
			t.addVertexWithUV(0, 0, 1, 1, 1);
			t.addVertexWithUV(1, 1, 1, 1 / 4, 1 / 4);
			t.addVertexWithUV(0, 1, 0, 0, 0);
			t.addVertexWithUV(0, 0, 1, 1, 1);
			t.addVertexWithUV(0, 0, 0, 0, 1);
		}
		t.draw();
		GL11.glPopMatrix();
	}
}