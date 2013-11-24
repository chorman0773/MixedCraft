package com.MixedCraft.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import com.MixedCraft.EnumColourHandler;
import com.MixedCraft.MixedCraft;
import com.MixedCraft.items.tools.SwordBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBigSword extends SwordBase{

	public ItemBigSword(int ID, EnumToolMaterial par3enum, String name) {
		super(ID, par3enum);
		setUnlocalizedName(name);
		registerTexture(name);
		setCreativeTab(MixedCraft.ToolTab);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		int par2 = (int)player.posX;
		int par3 = (int)player.posY;
		int par4 = (int)player.posZ;
        double d0 = (double)((float)par2 + 0.5F);
        double d1 = (double)((float)par3 + 0.7F);
        double d2 = (double)((float)par4 + 0.5F);
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;
        world.spawnParticle("digging", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        world.spawnParticle("rain", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        world.spawnParticle("reddust", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
        world.spawnParticle("portal", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
        world.spawnParticle("breaking", d0, d1, d2, 0.0D, 0.0D, 0.0D);
		itemstack.damageItem(1, player);
        player.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));
        return itemstack;
	}

	  	@Override
	    @SideOnly(Side.CLIENT)
	    public void addInformation(ItemStack itemstack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	    {
	        par3List.add(itemstack.getMaxDamage() - itemstack.getItemDamage() + " Uses Remaining");
	    }
	
}
