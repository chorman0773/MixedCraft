package com.MixedCraft.items.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SwordBase extends ItemSword{
	
	private String iconPath;
	public SwordBase(int par1, EnumToolMaterial par3ENUM){
		super(par1, par3ENUM);
		setMaxStackSize(1);
        this.setCreativeTab(MixedCraft.ToolTab);
	}
	
    public Item registerTexture(String texture) {
        iconPath = texture;
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        itemIcon = icon.registerIcon(Utils.MOD_ID + ":" + iconPath);
    }
		
}
