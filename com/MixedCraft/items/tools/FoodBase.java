package com.MixedCraft.items.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.TextureHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class FoodBase extends ItemFood{
	 private String iconPath;


	public FoodBase(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
        this.setCreativeTab(MixedCraft.ToolTab);
	}
	    public Item registerTextures(String texture) {
	        iconPath = texture;
	        return this;
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister iconRegister) {
	        itemIcon = TextureHelper.getIconFromTextureName(iconRegister, iconPath);
	    }
}