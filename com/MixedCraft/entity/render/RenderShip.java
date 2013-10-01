package com.MixedCraft.entity.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.MixedCraft.entity.EntityShip;
import com.MixedCraft.entity.model.ModelShip;
import com.MixedCraft.handler.EntityResourceLocation;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderShip extends Render
{

    protected ModelShip model;

    public RenderShip()
    {
        shadowSize = 0.8F;
        model = new ModelShip();
    }

    public void renderShip(EntityShip ship, double x, double y, double z, float yaw, float partialTickTime)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z);
        GL11.glRotatef(180.0F - yaw, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(-1.0F, -1.0F, 1.0F);     

        
        bindEntityTexture(ship);
        
        model.render(ship, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        
        GL11.glPopMatrix();
    }


    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime)
    {
        this.renderShip((EntityShip)entity, x, y, z, yaw, partialTickTime);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return ((EntityShip)entity).isCharged() ? EntityResourceLocation.ChargedShip : EntityResourceLocation.Ship;
	}

}
