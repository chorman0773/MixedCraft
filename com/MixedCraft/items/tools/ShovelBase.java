package com.MixedCraft.items.tools;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ShovelBase extends ItemSpade{
	
	private String iconPath;
    
	public ShovelBase(ToolMaterial par3ENUM){
		super(par3ENUM);
		setMaxStackSize(1);
        this.setCreativeTab(MixedCraft.ToolTab);
	}
	
    public Item registerItemTexture(String texture) {
        iconPath = texture;
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        itemIcon = icon.registerIcon(Utils.MOD_ID + ":" + iconPath);
    }
}
