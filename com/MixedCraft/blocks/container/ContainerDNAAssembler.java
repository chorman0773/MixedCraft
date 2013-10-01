package com.MixedCraft.blocks.container;

import java.util.Iterator;

import com.MixedCraft.blocks.tileEntity.TileEntityDNAAssembler;
import com.MixedCraft.recipes.ExtractorRecipes;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerDNAAssembler extends Container
{
    private TileEntityDNAAssembler furnace;
    private int lastCookTime = 0;
    private int lastBurnTime = 0;
    private int lastItemBurnTime = 0;

    public ContainerDNAAssembler(InventoryPlayer var1, TileEntityDNAAssembler var2)
    { 
        this.furnace = var2;
        this.addSlotToContainer(new Slot(var2, 0, 28, 36));
        //this.addSlotToContainer(new Slot(var2, 1, 38, 54));
        this.addSlotToContainer(new SlotFurnace(var1.player, var2, 2, 116 + 12, 36));
        int var3;

        for (var3 = 0; var3 < 3; ++var3)
        {
            for (int var4 = 0; var4 < 9; ++var4)
            {
                this.addSlotToContainer(new Slot(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18 + 25));
            }
        }

        for (var3 = 0; var3 < 9; ++var3)
        {
            this.addSlotToContainer(new Slot(var1, var3, 8 + var3 * 18, 142 + 25));
        }
    }


    public void addCraftingToCrafters(ICrafting var1)
    {
        super.addCraftingToCrafters(var1);
        var1.sendProgressBarUpdate(this, 0, this.furnace.furnaceCookTime);
        var1.sendProgressBarUpdate(this, 1, this.furnace.furnaceBurnTime);
        var1.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
    }

    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i)
        {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.lastCookTime != this.furnace.furnaceCookTime)
            {
                icrafting.sendProgressBarUpdate(this, 0, this.furnace.furnaceCookTime);
            }

            if (this.lastBurnTime != this.furnace.furnaceBurnTime)
            {
                icrafting.sendProgressBarUpdate(this, 1, this.furnace.furnaceBurnTime);
            }

            if (this.lastItemBurnTime != this.furnace.currentItemBurnTime)
            {
                icrafting.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
            }
        }

        this.lastCookTime = this.furnace.furnaceCookTime;
        this.lastBurnTime = this.furnace.furnaceBurnTime;
        this.lastItemBurnTime = this.furnace.currentItemBurnTime;
    }

    public void updateCraftingResults()
    {
        
        Iterator var1 = this.crafters.iterator();

        while (var1.hasNext())
        {
            ICrafting var2 = (ICrafting)var1.next();

            if (this.lastCookTime != this.furnace.furnaceCookTime)
            {
                var2.sendProgressBarUpdate(this, 0, this.furnace.furnaceCookTime);
            }

            if (this.lastBurnTime != this.furnace.furnaceBurnTime)
            {
                var2.sendProgressBarUpdate(this, 1, this.furnace.furnaceBurnTime);
            }

            if (this.lastItemBurnTime != this.furnace.currentItemBurnTime)
            {
                var2.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
            }
        }

        this.lastCookTime = this.furnace.furnaceCookTime;
        this.lastBurnTime = this.furnace.furnaceBurnTime;
        this.lastItemBurnTime = this.furnace.currentItemBurnTime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2)
    {
        if (par1 == 0)
        {
            this.furnace.furnaceCookTime = par2;
        }

        if (par1 == 1)
        {
            this.furnace.furnaceBurnTime = par2;
        }

        if (par1 == 2)
        {
            this.furnace.currentItemBurnTime = par2;
        }
    }

    public boolean canInteractWith(EntityPlayer var1)
    {
        return this.furnace.isUseableByPlayer(var1);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int i)
	{
		ItemStack stack = null;
		Slot slot_object = (Slot) inventorySlots.get(i);

		if(slot_object != null && slot_object.getHasStack())
			{
			ItemStack stack_in_slot = slot_object.getStack();
			stack = stack_in_slot.copy();

			if(i == 0 || i == 1)
			{
				if(!mergeItemStack(stack_in_slot, 1, inventorySlots.size(), true))
				{
					return null;
				}
			} 
			else if(!mergeItemStack(stack_in_slot, 0, 1, false))
			{
				return null;
			}
			
			if(i == 2)
			{
				return null;
			}

			if(stack_in_slot.stackSize == 0)
			{
				slot_object.putStack(null);
			} else
			{
				slot_object.onSlotChanged();
			}
		}

		return stack;
	}
}
