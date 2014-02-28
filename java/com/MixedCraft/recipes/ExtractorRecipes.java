package com.MixedCraft.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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

    private ExtractorRecipes() {
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
    
    public boolean isItem(ItemStack i){
    	if(i.getItem() == Items.porkchop || i.getItem() == Items.beef || i.getItem() == Item.getItemFromBlock(Blocks.wool) 
    			|| i.getItem() == Items.gunpowder || i.getItem() == Items.chicken || i.getItem() == Items.ender_pearl
    			|| i.getItem() == Items.rotten_flesh || i.getItem() == Items.feather || i.getItem() == Items.bone 
    			|| i.getItem() == Items.ghast_tear || i.getItem() == Items.arrow || i.getItem() == Items.string
    			|| i.getItem() == Items.slime_ball || i.getItem() == Items.blaze_rod || i.getItem() == Items.spider_eye 
    			|| i.getItem() == Items.dye || i == new ItemStack(Items.skull, 1, 1) || i.getItem() == Items.nether_star){
    		return true;
    	}else{
    		return false;
    	}
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
