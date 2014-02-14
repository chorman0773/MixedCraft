package com.MixedCraft.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.MixedCraft.ItemHelper;

public class ExtractorRecipes
{
    private static final ExtractorRecipes smeltingBase = new ExtractorRecipes();

    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();
	private ItemStack itemstack;

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static final ExtractorRecipes smelting()
    {
        return smeltingBase;
    }

    private ExtractorRecipes()
    {
        this.addSmelting(ItemHelper.CowDNADrive, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.SheepDNADrive, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.ChickenDNADrive, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.FailDrive, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.CowPigMixedDrive, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.CowChickenMixedDrive, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.CowSheepMixedDrive, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(Items.porkchop, new ItemStack(ItemHelper.PigDNADrive), 0.0F);
        this.addSmelting(Items.beef, new ItemStack(ItemHelper.CowDNADrive), 0.0F);
        this.addSmelting(Blocks.wool, new ItemStack(ItemHelper.SheepDNADrive), 0.0F);
        this.addSmelting(Items.gunpowder, new ItemStack(ItemHelper.CreeperDNADrive), 0.0F);
        this.addSmelting(Items.chicken, new ItemStack(ItemHelper.ChickenDNADrive), 0.0F);
        this.addSmelting(Items.ender_pearl, new ItemStack(ItemHelper.EndermanDNADrive), 0.0F);
        this.addSmelting(Items.rotten_flesh, new ItemStack(ItemHelper.ZombieDNADrive), 0.0F);
        this.addSmelting(Items.feather, new ItemStack(ItemHelper.ChickenDNADrive), 0.0F);
        this.addSmelting(Items.bone, new ItemStack(ItemHelper.SkeletonDNADrive), 0.0F);
        this.addSmelting(Items.ghast_tear, new ItemStack(ItemHelper.GhastDNADrive), 0.0F);
        this.addSmelting(Items.arrow, new ItemStack(ItemHelper.SkeletonDNADrive), 0.0F);
        this.addSmelting(Items.string, new ItemStack(ItemHelper.SpiderDNADrive), 0.0F);
        this.addSmelting(Items.slime_ball, new ItemStack(ItemHelper.SlimeDNADrive), 0.0F);
        this.addSmelting(Items.blaze_rod, new ItemStack(ItemHelper.BlazeDNADrive), 0.0F);
        this.addSmelting(Items.spider_eye, new ItemStack(ItemHelper.SpiderDNADrive), 0.0F);
        this.addSmelting(Items.dye, new ItemStack(ItemHelper.SquidDNADrive), 0.0F);
        this.addSmelting(Items.skull, new ItemStack(ItemHelper.WitherSDNADrive), 0.0F);
        this.addSmelting(Items.nether_star, new ItemStack(ItemHelper.WitherDNADrive), 0.0F);
    }


    /**
     * Adds a smelting recipe.
     */
    public void addSmelting(Object par1, ItemStack par2ItemStack, float par3)
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
