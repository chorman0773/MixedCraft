package com.MixedCraft.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.helper.ItemsBase;
import com.MixedCraft.helper.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCard extends ItemsBase {


	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	public ItemCard(int id) {
		super(id);		
		setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return "Card" + itemstack.getItemDamage();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		icons = new Icon[ItemInfo.CARD_ICONS.length];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = register.registerIcon(Utils.MOD_ID + ":" + ItemInfo.CARD_ICONS[i]);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int dmg) {
		return icons[dmg];
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int id, CreativeTabs tab, List list) {
		for (int i = 0; i < ItemInfo.CARD_NAMES.length; i++) {
			ItemStack stack  = new ItemStack(id, 1, i);
			list.add(stack);
		}
	}
	
	/*@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote && world.getBlockId(x, y, z) == BlockHelper.Machine.blockID) {
			int meta = world.getBlockMetadata(x, y, z);
			
			int disabled = meta % 2;
		
			int type = stack.getItemDamage() + 1;
			
			int newMeta = type * 2 + disabled;
			
			world.setBlockMetadataWithNotify(x, y, z, newMeta, 3);
			stack.stackSize--;
		
			return true;
		}else{
			return false;
		}
				
	}*/
}
