package com.MixedCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;

import com.MixedCraft.armor.*;
import com.MixedCraft.entity.EntityCowZombie;
import com.MixedCraft.handler.HelperHandler;
import com.MixedCraft.helper.*;
import com.MixedCraft.items.*;
import com.MixedCraft.items.DNA.spawner.*;
import com.MixedCraft.items.tools.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHelper extends HelperHandler{

	public static final Item FlashDrive = new ItemsBase().setName("flashDrive");
	public static final Item FailDrive = new ItemDNABase(0).setDescription(DNAKeys.Failed).setName("failDrive");
	
	public static final Item CowDNADrive = new ItemDNABase(2).setDescription(DNAKeys.Cow).setName("dnaKey");
	public static final Item PigDNADrive = new ItemDNABase(3).setDescription(DNAKeys.Pig).setName("dnaKey");
	public static final Item SheepDNADrive = new ItemDNABase(9).setDescription(DNAKeys.Sheep).setName("dnaKey");
	public static final Item ChickenDNADrive = new ItemDNABase(5).setDescription(DNAKeys.Chicken).setName("dnaKey");
	public static final Item CreeperDNADrive = new ItemDNABase(6).setDescription(DNAKeys.Creeper).setName("dnaKey");
	public static final Item EndermanDNADrive = new ItemDNABase(7).setDescription(DNAKeys.Enderman).setName("dnaKey");
	public static final Item ZombieDNADrive = new ItemDNABase(16).setDescription(DNAKeys.Zombie).setName("dnaKey");
	public static final Item SkeletonDNADrive = new ItemDNABase(10).setDescription(DNAKeys.Skeleton).setName("dnaKey");
	public static final Item GhastDNADrive = new ItemDNABase(8).setDescription(DNAKeys.Ghast).setName("dnaKey");
	public static final Item SpiderDNADrive = new ItemDNABase(12).setDescription(DNAKeys.Spider).setName("dnaKey");
	public static final Item SlimeDNADrive = new ItemDNABase(11).setDescription(DNAKeys.Slime).setName("dnaKey");
	public static final Item SquidDNADrive = new ItemDNABase(13).setDescription(DNAKeys.Squid).setName("dnaKey");
	public static final Item BlazeDNADrive = new ItemDNABase(4).setDescription(DNAKeys.Blaze).setName("dnaKey");
	public static final Item WitherSDNADrive = new ItemDNABase(15).setDescription(DNAKeys.WitherS).setName("dnaKey");
	public static final Item WitherDNADrive = new ItemDNABase(14).setDescription(DNAKeys.Wither).setName("dnaKey");
	
	public static final Item CowPigMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowPig).setName("mixeddnaKey");
	public static final Item CowSheepMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowSheep).setName("mixeddnaKey");
	public static final Item CowChickenMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowChicken).setName("mixeddnaKey");
	public static final Item CowCreeperMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowCreeper).setName("mixeddnaKey");
	public static final Item CowEndermanMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowEnderman).setName("mixeddnaKey");
	public static final Item CowZombieMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowZombie).setName("mixeddnaKey");
	public static final Item CowSlimeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowSlime).setName("mixeddnaKey");
	public static final Item CowBlazeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowBlaze).setName("mixeddnaKey");
	public static final Item CowSpiderMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowSpider).setName("mixeddnaKey");
	public static final Item CowGhastMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowGhast).setName("mixeddnaKey");
	public static final Item CowMagmaCubeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowMagmaCube).setName("mixeddnaKey");
	public static final Item CowSkeletonMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowSkeleton).setName("mixeddnaKey");
	public static final Item CowSquidMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowSquid).setName("mixeddnaKey");
	public static final Item CowWitherMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowWither).setName("mixeddnaKey");
	public static final Item CowWitherSMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowWitherS).setName("mixeddnaKey");

	public static final Item PigSheepMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigSheep).setName("mixeddnaKey");
	public static final Item PigChickenMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigChicken).setName("mixeddnaKey");
	public static final Item PigCreeperMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigCreeper).setName("mixeddnaKey");
	public static final Item PigEndermanMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigEnderman).setName("mixeddnaKey");
	public static final Item PigZombieMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigZombie).setName("mixeddnaKey");
	public static final Item PigSlimeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigSlime).setName("mixeddnaKey");
	public static final Item PigBlazeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigBlaze).setName("mixeddnaKey");
	public static final Item PigSpiderMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigSpider).setName("mixeddnaKey");
	public static final Item PigGhastMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigGhast).setName("mixeddnaKey");
	public static final Item PigMagmaCubeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigMagmaCube).setName("mixeddnaKey");
	public static final Item PigSkeletonMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigSkeleton).setName("mixeddnaKey");
	public static final Item PigSquidMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigSquid).setName("mixeddnaKey");
	public static final Item PigWitherMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigWither).setName("mixeddnaKey");
	public static final Item PigWitherSMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigWitherS).setName("mixeddnaKey");
	
	public static final Item CowPigSpawner = new ItemCowSpawner().setName("cowPigSpawner");
	public static final Item CowSheepSpawner = new ItemCowSpawner().setName("cowSheepSpawner");
	public static final Item CowChickenSpawner = new ItemCowSpawner().setName("cowChickenSpawner");
	public static final Item CowCreeperSpawner = new ItemCowSpawner().setName("cowCreeperSpawner");
	public static final Item CowEndermanSpawner = new ItemCowSpawner().setName("cowEndermanSpawner");
	public static final Item CowZombieSpawner = new ItemCowSpawner().setName("cowZombieSpawner");
	//TODO: Put mobs in!
	//public static final Item CowSlimeSpawner = new ItemCowSpawner();
	//public static final Item CowBlazeSpawner = new ItemCowSpawner();
	//public static final Item CowSpiderSpawner = new ItemCowSpawner();
	//public static final Item CowGhastSpawner = new ItemCowSpawner();
	//public static final Item CowMagmaCubeSpawner = new ItemCowSpawner();
	//public static final Item CowSkeletonSpawner = new ItemCowSpawner();
	//public static final Item CowSquidSpawner = new ItemCowSpawner();
	//public static final Item CowWitherSpawner = new ItemCowSpawner();
	//public static final Item CowWitherSSpawner = new ItemCowSpawner();

	public static final Item CopperIngot = new ItemsBase().setName("copperIngot");
	public static final Item TinIngot = new ItemsBase().setName("tinIngot");
	public static final Item SilverIngot = new ItemsBase().setName("silverIngot");
	public static final Item GoldHandsaw = new ItemsBase().setName("goldHandsaw");
	public static final Item DiamondHandsaw = new ItemsBase().setName("diamondHandsaw");

	public static final Item SilverSword = new SwordBase(Silver).setName("silverSword");
	public static final Item SilverHoe = new HoeBase(Silver).setName("silverHoe");
	public static final Item SilverShovel = new ShovelBase(Silver).setName("silverShovel");
	public static final Item SilverPickaxe = new PickaxeBase(Silver).setName("silverPickaxe");
	public static final Item SilverAxe = new AxeBase(Silver).setName("silverAxe");
	public static final Item SilverShickaxe = new ToolShickaxe(SilverShick).setName("silverShickaxe");
	public static final Item DiamondBigSword = new ItemBigSword(Diamond).setName("diamondBigSword");
	public static final Item IronBigSword = new ItemBigSword(Iron).setName("ironBigSword");
	public static final Item GoldBigSword = new ItemBigSword(Gold).setName("goldenBigSword");
	public static final Item WoodBigSword = new ItemBigSword(Wood).setName("woodenBigSword");
	public static final Item StoneBigSword = new ItemBigSword(Stone).setName("stoneBigSword");

	public static final Item LightningBow = new LightningBow().setName("lightningBow");
	public static final Item LightningArrow = new ModItem().setName("lightningArrow");
	public static final Item GoldDoor = new ItemGoldDoor(Material.wood).setName("goldDoor");

	public static final Item TNTBow = new ItemTNTBow().setName("tntBow");
	public static final Item TNTArrow = new ModItem().setName("tntArrow");
	public static final Item TorchBow = new ItemTorchBow().setName("torchBow");

	public static final Item ChocolateCake = new ItemModReed(BlockHelper.ChocolateCake).setName("chocolateCake");
	public static final Item LightningRod = new ItemLightningRod().setName("lightningRod");
	public static final Item FlameSword = new ItemFlameSword(Flame).setName("flameSword");

    public static final Item ChocolateBean = new ItemModSeeds(BlockHelper.ChocolateCrop, Blocks.farmland).setName("chocolateBean");
	public static final Item Droid = new ItemDroid().setName("droid");
	public static final Item Wand = new ItemMobShooter().setName("wand");
	//public static final Item Test = new ItemHouse().setName("");
	
	public static final Item wandDeath = new WandOfDeath().setName("wandOfDeath");
	public static final Item wandFire = new WandOfFire().setName("wandOfFire");
	public static final Item wandGrowth = new WandOfGrowth().setName("wandOfGrowth");
	public static final Item wandHarvest = new WandOfHarvesting().setName("wandOfHarvest");
	public static final Item wandHealing = new WandOfHealing().setName("wandOfHealing");
	public static final Item wandIce = new WandOfIce().setName("wandOfIce");
	public static final Item wandMissile = new WandOfMagicMissile().setName("wandOfMissile");
	public static final Item wandMining = new WandOfMining().setName("wandOfMining");
	public static final Item wandTeleport = new WandOfTeleportation().setName("wandOfTeleportation");
	public static final Item wandHarming = new WandOfHarming().setName("wandOfHarming");
	
	public static final Item batteryWeak = new ItemBattery(1500).setName("weakBattery");
	public static final Item battery = new ItemBattery(3000).setName("battery");
	public static final Item batteryStrong = new ItemBattery(5000).setName("strongBattery");
	
	public static final Item itemWindmill = new ItemWindmill().setName("windmill");
}