package com.MixedCraft.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.MixedCraft.entity.EntityDroid;
import com.MixedCraft.helper.ItemsBase;
import com.MixedCraft.helper.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMobShooter extends ItemsBase {

	@SideOnly(Side.CLIENT)
	private Icon chargedIcon;

	public ItemMobShooter(int id) {
		super(id);
		setMaxStackSize(1);
		setUnlocalizedName("Wand");
	}
	

	
	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.motionY = 2;
			if (isCharged(itemstack.getItemDamage())) {
				target.motionX = (target.posX - player.posX) * 2;
				target.motionZ = (target.posZ - player.posZ) * 2;
				
				itemstack.setItemDamage(0);
			}else{
				itemstack.setItemDamage(itemstack.getItemDamage() + 1);
			}
		}
	
		return false;
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(Utils.MOD_ID + ":" + "Wand");
		chargedIcon = register.registerIcon(Utils.MOD_ID  + ":" + "WandCharged");
	}
	

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation) {
		info.add("Used " + itemstack.getItemDamage() + " times");
		
		if (isCharged(itemstack.getItemDamage())) {
			info.add(EnumChatFormatting.RED + "Charged");
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int dmg) {
		if (isCharged(dmg)) {
			return chargedIcon;
		}else{
			return itemIcon;
		}
	}
	
	private boolean isCharged(int dmg){
		return dmg >= 10;
	}
	
	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote && player.isSneaking()) {
			EntityDroid ship = new EntityDroid(world);
			
			ship.posX = x + 0.5;
			ship.posY = y + 1.5;
			ship.posZ = z + 0.5;
			
			if (isCharged(stack.getItemDamage())) {
				world.spawnEntityInWorld(ship);
				
				stack.setItemDamage(0);
			}else{
				stack.setItemDamage(stack.getItemDamage() + 1);			
			}
			
			world.spawnEntityInWorld(ship);

			return true;
		}else{
			return false;
		}
		
	}

}
