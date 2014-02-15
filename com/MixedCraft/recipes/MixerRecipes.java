package com.MixedCraft.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.MixedCraft.ItemHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

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
    public void addSmelting(Item item, ItemStack stack, float XP)
    {
        this.func_151394_a(new ItemStack(item, 1, 32767), stack, XP);
    }
    
    public void addSmelting(Block item, ItemStack stack, float XP)
    {
        this.func_151394_a(new ItemStack(item, 1, 32767), stack, XP);
    }

    public void func_151394_a(ItemStack p_151394_1_, ItemStack p_151394_2_, float p_151394_3_)
    {
        this.smeltingList.put(p_151394_1_, p_151394_2_);
        this.experienceList.put(p_151394_2_, Float.valueOf(p_151394_3_));
    }

    public ItemStack getSmeltingResult(ItemStack p_151395_1_)
    {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(p_151395_1_, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_)
    {
        return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }

    public float func_151398_b(ItemStack p_151398_1_)
    {
        float ret = p_151398_1_.getItem().getSmeltingExperience(p_151398_1_);
        if (ret != -1) return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return 0.0F;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(p_151398_1_, (ItemStack)entry.getKey()));

        return ((Float)entry.getValue()).floatValue();
    }
}
