package com.MixedCraft.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
