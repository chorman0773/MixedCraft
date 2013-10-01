package com.MixedCraft.items;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.MixedCraft.items.tools.SwordBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFlameSword extends SwordBase
{
    private float weaponDamage;
    private final EnumToolMaterial field_40439_b;
	private String iconPath;

    public ItemFlameSword(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.field_40439_b = var2;
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.weaponDamage = 9;
    }

    @Override
    public float getStrVsBlock(ItemStack var1, Block var2)
    {
        return var2.blockID != Block.web.blockID ? 1.5F : 15.0F;
    }

    public boolean hitEntity(ItemStack var1, EntityLivingBase var2, EntityLivingBase var3)
    {
        var1.damageItem(1, var3);
        var2.setFire(16);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack var1, int var2, int var3, int var4, int var5, EntityLivingBase var6)
    {
        var1.damageItem(2, var6);
        return true;
    }
    
    public float getDamageVsEntity(Entity var1)
    {
        return this.weaponDamage;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.block;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 72000;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
        return var1;
    }

    @Override
    public boolean canHarvestBlock(Block var1)
    {
        return var1.blockID == Block.web.blockID;
    }

    @Override
    public int getItemEnchantability()
    {
        return this.field_40439_b.getEnchantability();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
        par3List.add("When hits: Burns for 16 seconds");
    }
}
