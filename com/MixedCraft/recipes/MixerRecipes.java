package com.MixedCraft.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.MixedCraft.ItemHelper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MixerRecipes
{
    private static final MixerRecipes smeltingBase = new MixerRecipes();

    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static final MixerRecipes smelting()
    {
        return smeltingBase;
    }

    private MixerRecipes()
    {
        this.addSmelting(ItemHelper.ChickenDNADrive.itemID, new ItemStack(ItemHelper.CowChickenMixedDrive), 0.0F);
        //this.addSmelting(ItemHelper.CowDNADrive.itemID, new ItemStack(ItemHelper.Cow), 0.0F);
        this.addSmelting(ItemHelper.CreeperDNADrive.itemID, new ItemStack(ItemHelper.CowCreeperMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.PigDNADrive.itemID, new ItemStack(ItemHelper.CowPigMixedDrive), 0.0F); 
        this.addSmelting(ItemHelper.SheepDNADrive.itemID, new ItemStack(ItemHelper.CowSheepMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.EndermanDNADrive.itemID, new ItemStack(ItemHelper.CowEndermanMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.ZombieDNADrive.itemID, new ItemStack(ItemHelper.CowZombieMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SlimeDNADrive.itemID, new ItemStack(ItemHelper.CowSlimeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.BlazeDNADrive.itemID, new ItemStack(ItemHelper.CowBlazeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SpiderDNADrive.itemID, new ItemStack(ItemHelper.CowSpiderMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.GhastDNADrive.itemID, new ItemStack(ItemHelper.CowGhastMixedDrive), 0.0F);
        //this.addSmelting(ItemHelper.MagmaCubeDNADrive.itemID, new ItemStack(ItemHelper.CowMagmaCubeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SkeletonDNADrive.itemID, new ItemStack(ItemHelper.CowSkeletonMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SquidDNADrive.itemID, new ItemStack(ItemHelper.CowSquidMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.WitherDNADrive.itemID, new ItemStack(ItemHelper.CowWitherMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.WitherSDNADrive.itemID, new ItemStack(ItemHelper.CowWitherSMixedDrive), 0.0F);

        this.addSmelting(ItemHelper.ChickenDNADrive.itemID, new ItemStack(ItemHelper.PigChickenMixedDrive), 0.0F);
        //this.addSmelting(ItemHelper.CowDNADrive.itemID, new ItemStack(ItemHelper.Cow), 0.0F);
        this.addSmelting(ItemHelper.CreeperDNADrive.itemID, new ItemStack(ItemHelper.PigCreeperMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SheepDNADrive.itemID, new ItemStack(ItemHelper.PigSheepMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.EndermanDNADrive.itemID, new ItemStack(ItemHelper.PigEndermanMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.ZombieDNADrive.itemID, new ItemStack(ItemHelper.PigZombieMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SlimeDNADrive.itemID, new ItemStack(ItemHelper.PigSlimeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.BlazeDNADrive.itemID, new ItemStack(ItemHelper.PigBlazeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SpiderDNADrive.itemID, new ItemStack(ItemHelper.PigSpiderMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.GhastDNADrive.itemID, new ItemStack(ItemHelper.PigGhastMixedDrive), 0.0F);
        //this.addSmelting(ItemHelper.MagmaCubeDNADrive.itemID, new ItemStack(ItemHelper.PigMagmaCubeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SkeletonDNADrive.itemID, new ItemStack(ItemHelper.PigSkeletonMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SquidDNADrive.itemID, new ItemStack(ItemHelper.PigSquidMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.WitherDNADrive.itemID, new ItemStack(ItemHelper.PigWitherMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.WitherSDNADrive.itemID, new ItemStack(ItemHelper.PigWitherSMixedDrive), 0.0F);
        
        
    }

    /**
     * Adds a smelting recipe.
     */
    public void addSmelting(int par1, ItemStack par2ItemStack, float par3)
    {
        this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
        this.experienceList.put(Integer.valueOf(par2ItemStack.itemID), Float.valueOf(par3));
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
        ItemStack ret = (ItemStack)metaSmeltingList.get(Arrays.asList(item.itemID, item.getItemDamage()));
        if (ret != null) 
        {
            return ret;
        }
        return (ItemStack)smeltingList.get(Integer.valueOf(item.itemID));
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
        if (ret < 0 && metaExperience.containsKey(Arrays.asList(item.itemID, item.getItemDamage())))
        {
            ret = metaExperience.get(Arrays.asList(item.itemID, item.getItemDamage()));
        }
        if (ret < 0 && experienceList.containsKey(item.itemID))
        {
            ret = ((Float)experienceList.get(item.itemID)).floatValue();
        }
        return (ret < 0 ? 0 : ret);
    }
}
