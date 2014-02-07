package com.MixedCraft.helper;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.MixedCraft.MixedCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemsBase extends Item {
    private String iconPath;


    public ItemsBase(String texture) {
        super();
        registerTextures(texture);
        setUnlocalizedName(texture);
        this.setCreativeTab(MixedCraft.MiscTab);
    }
    
    public Item registerTextures(String texture) {
        iconPath = texture;
        return this;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        itemIcon = icon.registerIcon(Utils.MOD_ID + ":" + iconPath);
    }
}
