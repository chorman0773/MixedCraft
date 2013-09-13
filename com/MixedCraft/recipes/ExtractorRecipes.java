package com.MixedCraft.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.MixedCraft.ItemHelper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
        this.addSmelting(ItemHelper.CowDNADrive.itemID, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.SheepDNADrive.itemID, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.ChickenDNADrive.itemID, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.FailDrive.itemID, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.CowPigMixedDrive.itemID, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.CowChickenMixedDrive.itemID, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(ItemHelper.CowSheepMixedDrive.itemID, new ItemStack(ItemHelper.FailDrive), 0.0F);
        this.addSmelting(Item.porkRaw.itemID, new ItemStack(ItemHelper.PigDNADrive), 0.0F);
        this.addSmelting(Item.beefRaw.itemID, new ItemStack(ItemHelper.CowDNADrive), 0.0F);
        this.addSmelting(Block.cloth.blockID, new ItemStack(ItemHelper.SheepDNADrive), 0.0F);
        this.addSmelting(Item.gunpowder.itemID, new ItemStack(ItemHelper.CreeperDNADrive), 0.0F);
        this.addSmelting(Item.chickenRaw.itemID, new ItemStack(ItemHelper.ChickenDNADrive), 0.0F);
        this.addSmelting(Item.enderPearl.itemID, new ItemStack(ItemHelper.EndermanDNADrive), 0.0F);
        this.addSmelting(Item.rottenFlesh.itemID, new ItemStack(ItemHelper.ZombieDNADrive), 0.0F);
        this.addSmelting(Item.feather.itemID, new ItemStack(ItemHelper.ChickenDNADrive), 0.0F);
        this.addSmelting(Item.bone.itemID, new ItemStack(ItemHelper.SkeletonDNADrive), 0.0F);
        this.addSmelting(Item.ghastTear.itemID, new ItemStack(ItemHelper.GhastDNADrive), 0.0F);
        this.addSmelting(Item.arrow.itemID, new ItemStack(ItemHelper.SkeletonDNADrive), 0.0F);
        this.addSmelting(Item.silk.itemID, new ItemStack(ItemHelper.SpiderDNADrive), 0.0F);
        this.addSmelting(Item.slimeBall.itemID, new ItemStack(ItemHelper.SlimeDNADrive), 0.0F);
        this.addSmelting(Item.blazeRod.itemID, new ItemStack(ItemHelper.BlazeDNADrive), 0.0F);
        this.addSmelting(Item.spiderEye.itemID, new ItemStack(ItemHelper.SpiderDNADrive), 0.0F);
        this.addSmelting(Item.dyePowder.itemID, new ItemStack(ItemHelper.SquidDNADrive), 0.0F);
        this.addSmelting(Item.skull.itemID, 1, new ItemStack(ItemHelper.WitherSDNADrive), 0.0F);
        this.addSmelting(Item.netherStar.itemID, new ItemStack(ItemHelper.WitherDNADrive), 0.0F);
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
