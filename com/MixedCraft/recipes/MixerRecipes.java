package com.MixedCraft.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.MixedCraft.ItemHelper;

import cpw.mods.fml.common.registry.GameRegistry;
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
        this.addSmelting(ItemHelper.ChickenDNADrive, new ItemStack(ItemHelper.CowChickenMixedDrive), 0.0F);
        //this.addSmelting(ItemHelper.CowDNADrive, new ItemStack(ItemHelper.Cow), 0.0F);
        this.addSmelting(ItemHelper.CreeperDNADrive, new ItemStack(ItemHelper.CowCreeperMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.PigDNADrive, new ItemStack(ItemHelper.CowPigMixedDrive), 0.0F); 
        this.addSmelting(ItemHelper.SheepDNADrive, new ItemStack(ItemHelper.CowSheepMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.EndermanDNADrive, new ItemStack(ItemHelper.CowEndermanMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.ZombieDNADrive, new ItemStack(ItemHelper.CowZombieMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SlimeDNADrive, new ItemStack(ItemHelper.CowSlimeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.BlazeDNADrive, new ItemStack(ItemHelper.CowBlazeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SpiderDNADrive, new ItemStack(ItemHelper.CowSpiderMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.GhastDNADrive, new ItemStack(ItemHelper.CowGhastMixedDrive), 0.0F);
        //this.addSmelting(ItemHelper.MagmaCubeDNADrive, new ItemStack(ItemHelper.CowMagmaCubeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SkeletonDNADrive, new ItemStack(ItemHelper.CowSkeletonMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SquidDNADrive, new ItemStack(ItemHelper.CowSquidMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.WitherDNADrive, new ItemStack(ItemHelper.CowWitherMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.WitherSDNADrive, new ItemStack(ItemHelper.CowWitherSMixedDrive), 0.0F);

        /*this.addSmelting(ItemHelper.ChickenDNADrive, new ItemStack(ItemHelper.PigChickenMixedDrive), 0.0F);
        //this.addSmelting(ItemHelper.CowDNADrive, new ItemStack(ItemHelper.Cow), 0.0F);
        this.addSmelting(ItemHelper.CreeperDNADrive, new ItemStack(ItemHelper.PigCreeperMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SheepDNADrive, new ItemStack(ItemHelper.PigSheepMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.EndermanDNADrive, new ItemStack(ItemHelper.PigEndermanMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.ZombieDNADrive, new ItemStack(ItemHelper.PigZombieMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SlimeDNADrive, new ItemStack(ItemHelper.PigSlimeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.BlazeDNADrive, new ItemStack(ItemHelper.PigBlazeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SpiderDNADrive, new ItemStack(ItemHelper.PigSpiderMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.GhastDNADrive, new ItemStack(ItemHelper.PigGhastMixedDrive), 0.0F);
        //this.addSmelting(ItemHelper.MagmaCubeDNADrive, new ItemStack(ItemHelper.PigMagmaCubeMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SkeletonDNADrive, new ItemStack(ItemHelper.PigSkeletonMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.SquidDNADrive, new ItemStack(ItemHelper.PigSquidMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.WitherDNADrive, new ItemStack(ItemHelper.PigWitherMixedDrive), 0.0F);
        this.addSmelting(ItemHelper.WitherSDNADrive, new ItemStack(ItemHelper.PigWitherSMixedDrive), 0.0F);*/
        
        
    }

    /**
     * Adds a smelting recipe.
     */
    public static void addSmelting(Item input, ItemStack output, float XP) {
		GameRegistry.addSmelting(input, output, XP);
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
