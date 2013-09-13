package com.MixedCraft.entity.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.MixedCraft.blocks.tileEntity.TileEntityHugeChest;
import com.MixedCraft.entity.model.ModelHugeChest;


public class RenderHugeChest extends TileEntitySpecialRenderer
{
	private static final ResourceLocation texture = new ResourceLocation("MixedCraft:textures/model/HugeChest.png");
    
    static final float scale = (float)(1.0 / 16.0);
    private ModelHugeChest modelTable;

    public RenderHugeChest()
    {
        modelTable = new ModelHugeChest();
    }
    
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityHugeChest)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityHugeChest tile, double x, double y, double z, float f)
    {
        int rotation = 0;
        if(tile.worldObj != null)
        {
            rotation = tile.getBlockMetadata();
        }
        
        this.func_110628_a(texture);
        
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x + 0.5F, (float)y - 0.6F, (float)z + 0.5F);
        GL11.glRotatef(rotation * 90, 0.0F, 1.0F, 0.0F);
        GL11.glPopMatrix();
    }
    
}
