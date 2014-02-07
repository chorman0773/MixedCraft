package com.MixedCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;

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

	public static final Item FlashDrive = new ItemsBase("FlashDrive").registerTextures("FlashDrive").setUnlocalizedName("FD").setCreativeTab(MixedCraft.MiscTab);
	public static final Item FailDrive = new ItemDNABase(0).setDescriptors(DNAKeys.Failed).registerTextures("FailDrive").setUnlocalizedName("FAD").setCreativeTab(MixedCraft.MiscTab);
	
	public static final Item CowDNADrive = new ItemDNABase(2).setDescriptors(DNAKeys.Cow).setCreativeTab(MixedCraft.DNATab);
	public static final Item PigDNADrive = new ItemDNABase(3).setDescriptors(DNAKeys.Pig).setCreativeTab(MixedCraft.DNATab);
	public static final Item SheepDNADrive = new ItemDNABase(9).setDescriptors(DNAKeys.Sheep).setCreativeTab(MixedCraft.DNATab);
	public static final Item ChickenDNADrive = new ItemDNABase(5).setDescriptors(DNAKeys.Chicken).setCreativeTab(MixedCraft.DNATab);
	public static final Item CreeperDNADrive = new ItemDNABase(6).setDescriptors(DNAKeys.Creeper).setCreativeTab(MixedCraft.DNATab);
	public static final Item EndermanDNADrive = new ItemDNABase(7).setDescriptors(DNAKeys.Enderman).setCreativeTab(MixedCraft.DNATab);
	public static final Item ZombieDNADrive = new ItemDNABase(16).setDescriptors(DNAKeys.Zombie).setCreativeTab(MixedCraft.DNATab);
	public static final Item SkeletonDNADrive = new ItemDNABase(10).setDescriptors(DNAKeys.Skeleton).setCreativeTab(MixedCraft.DNATab);
	public static final Item GhastDNADrive = new ItemDNABase(8).setDescriptors(DNAKeys.Ghast).setCreativeTab(MixedCraft.DNATab);
	public static final Item SpiderDNADrive = new ItemDNABase(12).setDescriptors(DNAKeys.Spider).setCreativeTab(MixedCraft.DNATab);
	public static final Item SlimeDNADrive = new ItemDNABase(11).setDescriptors(DNAKeys.Slime).setCreativeTab(MixedCraft.DNATab);
	public static final Item SquidDNADrive = new ItemDNABase(13).setDescriptors(DNAKeys.Squid).setCreativeTab(MixedCraft.DNATab);
	public static final Item BlazeDNADrive = new ItemDNABase(4).setDescriptors(DNAKeys.Blaze).setCreativeTab(MixedCraft.DNATab);
	public static final Item WitherSDNADrive = new ItemDNABase(15).setDescriptors(DNAKeys.WitherS).setCreativeTab(MixedCraft.DNATab);
	public static final Item WitherDNADrive = new ItemDNABase(14).setDescriptors(DNAKeys.Wither).setCreativeTab(MixedCraft.DNATab);
	
	public static final Item CowPigMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowPig).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSheepMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowSheep).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowChickenMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowChicken).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowCreeperMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowCreeper).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowEndermanMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowEnderman).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowZombieMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowZombie).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSlimeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowSlime).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowBlazeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowBlaze).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSpiderMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowSpider).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowGhastMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowGhast).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowMagmaCubeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowMagmaCube).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSkeletonMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowSkeleton).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSquidMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowSquid).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowWitherMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowWither).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowWitherSMixedDrive = new ItemMixedBase().setDescription(DNAKeys.CowWitherS).setCreativeTab(MixedCraft.MixedDNATab);

	public static final Item PigSheepMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigSheep).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigChickenMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigChicken).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigCreeperMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigCreeper).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigEndermanMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigEnderman).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigZombieMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigZombie).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSlimeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigSlime).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigBlazeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigBlaze).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSpiderMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigSpider).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigGhastMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigGhast).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigMagmaCubeMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigMagmaCube).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSkeletonMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigSkeleton).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSquidMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigSquid).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigWitherMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigWither).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigWitherSMixedDrive = new ItemMixedBase().setDescription(DNAKeys.PigWitherS).setCreativeTab(MixedCraft.MixedDNATab);
	
	public static final Item CowPigSpawner = new ItemCowPigSpawner().registerTextures("CowPigSpawner").setUnlocalizedName("CowPigSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowSheepSpawner = new ItemCowSheepPlacer().registerTextures("CowSheepSpawner").setUnlocalizedName("CowSheepSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowChickenSpawner = new ItemCowChickenSpawner().registerTextures("CowChickenSpawner").setUnlocalizedName("CowChickenSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowCreeperSpawner = new ItemCreeperPlacer().registerTextures("CowCreeperSpawner").setUnlocalizedName("CowCreeperSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowEndermanSpawner = new ItemCowEndermanPlacer().registerTextures("CowEndermanSpawner").setUnlocalizedName("CowEndermanSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowZombieSpawner = new ItemCowZombiePlacer().registerTextures("CowZombieSpawner").setUnlocalizedName("CowZombieSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	
	//TODO: Put mobs in!
	//public static final Item CowSlimeSpawner = new ItemCowSlimePlacer(x.CowSlimeSpawnerID).registerTextures("CowSlimeSpawner").setUnlocalizedName("CowSlimeSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowBlazeSpawner = new ItemCowBlazePlacer(x.CowBlazeSpawnerID).registerTextures("CowBlazeSpawner").setUnlocalizedName("CowBlazeSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowSpiderSpawner = new ItemCowSpiderPlacer(x.CowSpiderSpawnerID).registerTextures("CowSpiderSpawner").setUnlocalizedName("CowSpiderSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowGhastSpawner = new ItemCowGhastPlacer(x.CowGhastSpawnerID).registerTextures("CowGhastSpawner").setUnlocalizedName("CowGhastSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowMagmaCubeSpawner = new ItemCowMagmaCubePlacer(x.CowMagmaCubeSpawnerID).registerTextures("CowMagmaCubeSpawner").setUnlocalizedName("CowMagmaCubeSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowSkeletonSpawner = new ItemCowSkeletonPlacer(x.CowSkeletonSpawnerID).registerTextures("CowSkeletonSpawner").setUnlocalizedName("CowSkeletonSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowSquidSpawner = new ItemCowSquidPlacer(x.CowSquidSpawnerID).registerTextures("CowSquidSpawner").setUnlocalizedName("CowSquidSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowWitherSpawner = new ItemCowWitherPlacer(x.CowWitherSpawnerID).registerTextures("CowWitherSpawner").setUnlocalizedName("CowWitherSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowWitherSSpawner = new ItemCowWitherSPlacer(x.CowWitherSSpawnerID).registerTextures("CowWitherSSpawner").setUnlocalizedName("CowWitherSSpawn").setCreativeTab(MixedCraft.SpawnerTab);

	public static final Item CopperIngot = new ItemsBase"CopperIngot").setCreativeTab(MixedCraft.MiscTab);
	public static final Item TinIngot = new ItemsBase("TinIngot").setCreativeTab(MixedCraft.MiscTab);
	public static final Item SilverIngot = new ItemsBase("SilverIngot").setCreativeTab(MixedCraft.MiscTab);
	public static final Item GoldHandsaw = new ItemsBase("GoldHandsaw").setCreativeTab(MixedCraft.MiscTab);
	public static final Item DiamondHandsaw = new ItemsBase("DiamondHandsaw").setCreativeTab(MixedCraft.MiscTab);

	public static final Item SilverSword = new ToolSword(Silver, "SilverSword");
	public static final Item SilverHoe = new ToolHoe(Silver, "SilverHoe");
	public static final Item SilverShovel = new ToolShovel(Silver, "SilverShovel");
	public static final Item SilverPickaxe = new ToolPickaxe(Silver, "SilverPickaxe");
	public static final Item SilverAxe = new ToolAxe(Silver, "SilverAxe");
	public static final Item SilverShickaxe = new ToolShickaxe(SilverShick, "SilverShickaxe");
	public static final Item DiamondBigSword = new ItemBigSword(Diamond, "DiamondBigSword");
	public static final Item IronBigSword = new ItemBigSword(Iron, "IronBigSword");
	public static final Item GoldBigSword = new ItemBigSword(Gold, "GoldenBigSword");
	public static final Item WoodBigSword = new ItemBigSword(Wood, "WoodenBigSword");
	public static final Item StoneBigSword = new ItemBigSword(Stone, "StoneBigSword");

	public static final Item LightningBow = new LightningBow().setUnlocalizedName("LightningBow").setCreativeTab(MixedCraft.ToolTab);
	public static final Item LightningArrow = new ModItem().registerTextures("LightningArrow").setUnlocalizedName("LightningArrow").setCreativeTab(MixedCraft.MiscTab);
	public static final Item GoldDoor = new ItemGoldDoor(Material.wood).registerTextures("GoldDoor").setUnlocalizedName("GoldDoor").setCreativeTab(MixedCraft.BlockTab);

	public static final Item TNTBow = new ItemTNTBow().setUnlocalizedName("TNTBow").setCreativeTab(MixedCraft.ToolTab);
	public static final Item TNTArrow = new ModItem().registerTextures("TNTArrow").setUnlocalizedName("TNTArrow").setCreativeTab(MixedCraft.MiscTab);

	public static final Item ChocalateCake = new ItemReed(BlockHelper.ChocolateCake).setUnlocalizedName("ChocolateCake").setTextureName("MixedCraft:ChocolateCake").setCreativeTab(MixedCraft.BlockTab);
	public static final Item LightningRod = new ItemLightningRod().registerTextures("LightningRod").setUnlocalizedName("LightningRod").setCreativeTab(MixedCraft.ToolTab);
	public static final Item FlameSword = new ItemFlameSword(Flame).registerTexture("FlameSword").setUnlocalizedName("FlameSword");

    public static final Item ChocolateBean = new ItemModSeeds(BlockHelper.ChocolateCrop, Blocks.farmland, "ChocolateBean");
	public static final Item Droid = new ItemDroid();
	public static final Item Wand = new ItemMobShooter();
	//public static final Item Test = new ItemHouse(4235);
	
	public static final Item wandDeath = new WandOfDeath("wandDeath");
	public static final Item wandFire = new WandOfFire("wandFire");
	public static final Item wandGrowth = new WandOfGrowth("wandGrowth");
	public static final Item wandHarvest = new WandOfHarvesting("wandHarvest");
	public static final Item wandHealing = new WandOfHealing("wandHeal");
	public static final Item wandIce = new WandOfIce("wandIce");
	public static final Item wandMissile = new WandOfMagicMissile("wandMissiles");
	public static final Item wandMining = new WandOfMining("wandMining");
	public static final Item wandTeleport = new WandOfTeleportation("wandTeleport");
	public static final Item wandHarming = new WandOfHarming("wandHarm");
	
	public static final Item TorchBow = new ItemTorchBow();
	
	public static void addNames(){
		addItem(TorchBow, "Torch Bow");
		
		addItem(Droid, "Droid");
		addItem(wandHarming, "Wand Of Harming");
		addItem(wandDeath, "Wand Of Death");
		addItem(wandFire, "Wand Of Fire");
		addItem(wandGrowth, "Wand Of Growth");
		addItem(wandHarvest, "Wand Of Harvest");
		addItem(wandHealing, "Wand Of Healing");
		addItem(wandIce, "Wand Of Ice");
		addItem(wandMissile, "Wand Of Missile");
		addItem(wandMining, "Wand Of Mining");
		addItem(wandTeleport, "Wand Of Teleport");
		
		addItem(ChocalateCake, "Chocolate Cake");
		addItem(LightningRod, "Lightning Rod");
		addItem(IronBigSword, "Iron Big Sword");
		addItem(GoldBigSword, "Gold Big Sword");
		addItem(StoneBigSword, "Stone Big Sword");
		addItem(WoodBigSword, "Wood Big Sword");
		addItem(FlameSword, "Flame Sword");
		addItem(ChocolateBean, "Chocolate Bean");
		addItem(DiamondBigSword, "Diamond Big Sword");
		addItem(SilverShickaxe, "Silver Shickaxe");
		addItem(TNTBow, "TNT Bow");
		addItem(TNTArrow, "TNT Arrow");
		addItem(GoldDoor, "Gold Door Item");
		addItem(LightningArrow, "Lightning Arrow");
		addItem(LightningBow, "Lightning Bow");
		
		addItem(FlashDrive, "DNA Key");
		addItem(FailDrive, "Failed DNA Key");
		addItem(TinIngot, "Tin Ingot");
		addItem(CopperIngot, "Copper Ingot");
		addItem(SilverIngot, "Silver Ingot");

		addAlotItem("DNAKey", "DNA Key");
		addAlotItem("MixedDNA", "Mixed DNA Key");

		addItem(DiamondHandsaw, "Diamond Handsaw");
		addItem(GoldHandsaw, "Gold Handsaw");
		
		addItem(CowCreeperSpawner, "Spawn: COWCREEPER");
		addItem(CowPigSpawner, "Spawn: COWPIG");
		addItem(CowSheepSpawner, "Spawn: COWSHEEP");
		addItem(CowChickenSpawner, "Spawn: COWCHICKEN");
		addItem(CowEndermanSpawner, "Spawn: COWENDERMAN");
		addItem(CowZombieSpawner, "Spawn: COWZOMBIE");

		addItem(SilverSword, "Silver Sword");
		addItem(SilverHoe, "Silver Hoe");
		addItem(SilverShovel, "Silver Shovel");
		addItem(SilverPickaxe, "Silver Pickaxe");
		addItem(SilverAxe, "Silver Axe");

		addItem(Wand, "Wand");
		
		addAlotItem("MixedDNAKey", "Mixed DNA Key");
	}
}
