package com.MixedCraft.helper;



import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StringTranslate;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.items.ItemDNABase;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemsBase extends Item {
    private String iconPath;


    public ItemsBase(int par1) {
        super(par1);
        this.setCreativeTab(MixedCraft.MiscTab);

    }
    
    public Item registerTextures(String texture) {
        iconPath = texture;
        return this;
    }
    

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        itemIcon = icon.registerIcon(Utils.MOD_ID + ":" + iconPath);
    }
}
