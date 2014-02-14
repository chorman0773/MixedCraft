package com.MixedCraft.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.MixedCraft.ItemHelper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AssemblerRecipes
{
    private static final AssemblerRecipes smeltingBase = new AssemblerRecipes();

    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static final AssemblerRecipes smelting()
    {
        return smeltingBase;
    }

    private AssemblerRecipes()
    {
        this.addSmelting(ItemHelper.CowChickenMixedDrive, new ItemStack(ItemHelper.CowChickenSpawner), 0.0F);  
        this.addSmelting(ItemHelper.CowPigMixedDrive, new ItemStack(ItemHelper.CowPigSpawner), 0.0F);    
        this.addSmelting(ItemHelper.CowSheepMixedDrive, new ItemStack(ItemHelper.CowSheepSpawner), 0.0F);    
        this.addSmelting(ItemHelper.CowCreeperMixedDrive, new ItemStack(ItemHelper.CowCreeperSpawner), 0.0F);    
        this.addSmelting(ItemHelper.CowEndermanMixedDrive, new ItemStack(ItemHelper.CowEndermanSpawner), 0.0F);    
        this.addSmelting(ItemHelper.CowZombieMixedDrive, new ItemStack(ItemHelper.CowZombieSpawner), 0.0F);    
        //this.addSmelting(ItemHelper.CowSlimeMixedDrive.itemID, new ItemStack(ItemHelper.CowSlimeSpawner), 0.0F);
       // this.addSmelting(ItemHelper.CowBlazeMixedDrive.itemID, new ItemStack(ItemHelper.CowBlazeSpawner), 0.0F);
        //this.addSmelting(ItemHelper.CowSpiderMixedDrive.itemID, new ItemStack(ItemHelper.CowSpiderSpawner), 0.0F);
        //this.addSmelting(ItemHelper.CowGhastMixedDrive.itemID, new ItemStack(ItemHelper.CowGhastSpawner), 0.0F);
        //this.addSmelting(ItemHelper.CowMagmaCubeMixedDrive.itemID, new ItemStack(ItemHelper.CowMagmaCubeSpawner), 0.0F);
        //this.addSmelting(ItemHelper.CowSkeletonMixedDrive.itemID, new ItemStack(ItemHelper.CowSkeletonSpawner), 0.0F);
        //this.addSmelting(ItemHelper.CowSquidMixedDrive.itemID, new ItemStack(ItemHelper.CowSquidSpawner), 0.0F);
        //this.addSmelting(ItemHelper.CowWitherMixedDrive.itemID, new ItemStack(ItemHelper.CowWitherSpawner), 0.0F);
        //this.addSmelting(ItemHelper.CowWitherSMixedDrive.itemID, new ItemStack(ItemHelper.CowWitherSSpawner), 0.0F);
    }

    /**
     * Adds a smelting recipe.
     */
    public void addSmelting(Item par1, ItemStack par2ItemStack, float par3)
    {
        this.smeltingList.put(par1, par2ItemStack);
        this.experienceList.put(par2ItemStack, Float.valueOf(par3));
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }

    /**
     * A metadata sensitive version of adding a furnace recipe.
     */
    public void addSmelting(int itemID, int metadata, ItemStack itemstack, float experience)
    {
        metaSmeltingList.put(Arrays.asList(itemID, metadata), itemstack);
        metaExperience.put(Arrays.asList(itemID, metadata), experience);
    }

    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * @param item The Source ItemStack
     * @return The result ItemStack
     */
    public ItemStack getSmeltingResult(ItemStack item) 
    {
        if (item == null)
        {
            return null;
        }
        ItemStack ret = (ItemStack)metaSmeltingList.get(Arrays.asList(item, item.getItemDamage()));
        if (ret != null) 
        {
            return ret;
        }
        return (ItemStack)smeltingList.get(item);
    }

    /**
     * Grabs the amount of base experience for this item to give when pulled from the furnace slot.
     */
    public float getExperience(ItemStack item)
    {
        if (item == null || item.getItem() == null)
        {
            return 0;
        }
        float ret = item.getItem().getSmeltingExperience(item);
        if (ret < 0 && metaExperience.containsKey(Arrays.asList(item, item.getItemDamage())))
        {
            ret = metaExperience.get(Arrays.asList(item, item.getItemDamage()));
        }
        if (ret < 0 && experienceList.containsKey(item))
        {
            ret = ((Float)experienceList.get(item)).floatValue();
        }
        return (ret < 0 ? 0 : ret);
    }
}
