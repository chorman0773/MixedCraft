package com.MixedCraft.items.tools;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ToolPickaxe extends PickaxeBase {

    private final EnumToolMaterial field_40439_b;

	
	public ToolPickaxe(int par1, EnumToolMaterial par3enum) {
		super(par1, par3enum);
        this.field_40439_b = par3enum;

	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(EnumChatFormatting.GREEN + "Efficiency: " + this.field_40439_b.getEfficiencyOnProperMaterial());
        if (par1ItemStack.getMaxDamage() != -1)
        {
            par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
        }
    }
}
