package com.MixedCraft.entity.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import com.MixedCraft.entity.model.ModelDroid;

public class RenderDroidItem implements IItemRenderer{

	private ModelDroid model;
	
	public RenderDroidItem(){
		model = new ModelDroid();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		GL11.glPushMatrix();
		
		GL11.glScalef(-1F, -1F, 1F);
		
		switch(type){
		case INVENTORY: 
			GL11.glTranslatef(0, 0.12F, 0);
			break;
		case EQUIPPED: 
			GL11.glTranslatef(-0.8F, -0.2F, 0.7F);
			break;
		case EQUIPPED_FIRST_PERSON: 
			GL11.glTranslatef(0, -0.7F, 0.7F);
			break;
			default:
		}

		Minecraft.getMinecraft().func_110434_K().func_110577_a(RenderDroid.texture);
		
		model.render(0, 0, - (float)Math.PI / 2, -6, 0.5F, 0, item.stackSize / 64F, 0.0625F);
		
		GL11.glPopMatrix();
	}

}
