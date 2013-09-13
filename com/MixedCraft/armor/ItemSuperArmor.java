package com.MixedCraft.armor;


import java.util.List;

import com.MixedCraft.ItemHelper;
import com.MixedCraft.helper.Utils;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSuperArmor extends ItemArmor{

    private String[] description;

    public ItemSuperArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);
    }

    public ItemSuperArmor setDescriptors(String[] descs) {
    	description = descs;
        return this;
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == ItemHelper.SuperHelmet.itemID || itemstack.itemID == ItemHelper.SuperBody.itemID || itemstack.itemID == ItemHelper.SuperBoots.itemID)
            return Utils.MOD_ID + ":" + "/textures/items/armor/Super_1.png";

        if (itemstack.itemID == ItemHelper.SuperLegs.itemID)
            return Utils.MOD_ID + ":" + "/textures/items/armor/Super_2.png";
        return Utils.MOD_ID + ":" + "/textures/items/armor/Super_2.png"; 
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        if(itemID == ItemHelper.SuperHelmet.itemID) {
            this.itemIcon = par1IconRegister.registerIcon(Utils.MOD_ID + ":" + "SuperHelmet");
        }
        if(itemID == ItemHelper.SuperBody.itemID) {
            this.itemIcon = par1IconRegister.registerIcon(Utils.MOD_ID + ":" + "SuperBody");
        }
        if(itemID == ItemHelper.SuperLegs.itemID) {
            this.itemIcon = par1IconRegister.registerIcon(Utils.MOD_ID + ":" + "SuperLegs");
        }
        if(itemID == ItemHelper.SuperBoots.itemID) {
            this.itemIcon = par1IconRegister.registerIcon(Utils.MOD_ID + ":" + "SuperBoots");
        }	   
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
       // for (String desc : description) {
       //     par3List.add(desc);
       // }
    }
}
