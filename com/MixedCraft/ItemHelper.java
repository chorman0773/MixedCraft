package com.MixedCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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

	public static final Item FlashDrive = new ItemsBase(x.FlashDriveID, "FlashDrive").registerTextures("FlashDrive").setUnlocalizedName("FD").setCreativeTab(MixedCraft.MiscTab);
	public static final Item FailDrive = new ItemDNABase(x.FailDriveID, 0).setDescriptors(DNAKeys.Failed).registerTextures("FailDrive").setUnlocalizedName("FAD").setCreativeTab(MixedCraft.MiscTab);
	
	public static final Item CowDNADrive = new ItemDNABase(x.CowDNADriveID, 2).setDescriptors(DNAKeys.Cow).setCreativeTab(MixedCraft.DNATab);
	public static final Item PigDNADrive = new ItemDNABase(x.PigDNADriveID, 3).setDescriptors(DNAKeys.Pig).setCreativeTab(MixedCraft.DNATab);
	public static final Item SheepDNADrive = new ItemDNABase(x.SheepDNADriveID, 9).setDescriptors(DNAKeys.Sheep).setCreativeTab(MixedCraft.DNATab);
	public static final Item ChickenDNADrive = new ItemDNABase(x.ChickenDNADriveID, 5).setDescriptors(DNAKeys.Chicken).setCreativeTab(MixedCraft.DNATab);
	public static final Item CreeperDNADrive = new ItemDNABase(x.CreeperDNADriveID, 6).setDescriptors(DNAKeys.Creeper).setCreativeTab(MixedCraft.DNATab);
	public static final Item EndermanDNADrive = new ItemDNABase(x.EndermanDNADriveID, 7).setDescriptors(DNAKeys.Enderman).setCreativeTab(MixedCraft.DNATab);
	public static final Item ZombieDNADrive = new ItemDNABase(x.ZombieDNADriveID, 16).setDescriptors(DNAKeys.Zombie).setCreativeTab(MixedCraft.DNATab);
	public static final Item SkeletonDNADrive = new ItemDNABase(x.SkeletonDNADriveID, 10).setDescriptors(DNAKeys.Skeleton).setCreativeTab(MixedCraft.DNATab);
	public static final Item GhastDNADrive = new ItemDNABase(x.GhastDNADriveID, 8).setDescriptors(DNAKeys.Ghast).setCreativeTab(MixedCraft.DNATab);
	public static final Item SpiderDNADrive = new ItemDNABase(x.SpiderDNADriveID, 12).setDescriptors(DNAKeys.Spider).setCreativeTab(MixedCraft.DNATab);
	public static final Item SlimeDNADrive = new ItemDNABase(x.SlimeDNADriveID, 11).setDescriptors(DNAKeys.Slime).setCreativeTab(MixedCraft.DNATab);
	public static final Item SquidDNADrive = new ItemDNABase(x.SquidDNADriveID, 13).setDescriptors(DNAKeys.Squid).setCreativeTab(MixedCraft.DNATab);
	public static final Item BlazeDNADrive = new ItemDNABase(x.BlazeDNADriveID, 4).setDescriptors(DNAKeys.Blaze).setCreativeTab(MixedCraft.DNATab);
	public static final Item WitherSDNADrive = new ItemDNABase(x.WitherSDNADriveID, 15).setDescriptors(DNAKeys.WitherS).setCreativeTab(MixedCraft.DNATab);
	public static final Item WitherDNADrive = new ItemDNABase(x.WitherDNADriveID, 14).setDescriptors(DNAKeys.Wither).setCreativeTab(MixedCraft.DNATab);
	
	public static final Item CowPigMixedDrive = new ItemMixedBase(x.CowPigMixedDriveID).setDescription(DNAKeys.CowPig).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSheepMixedDrive = new ItemMixedBase(x.CowSheepMixedDriveID).setDescription(DNAKeys.CowSheep).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowChickenMixedDrive = new ItemMixedBase(x.CowChickenMixedDriveID).setDescription(DNAKeys.CowChicken).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowCreeperMixedDrive = new ItemMixedBase(x.CowCreeperMixedDriveID).setDescription(DNAKeys.CowCreeper).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowEndermanMixedDrive = new ItemMixedBase(x.CowEndermanMixedDriveID).setDescription(DNAKeys.CowEnderman).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowZombieMixedDrive = new ItemMixedBase(x.CowZombieMixedDriveID).setDescription(DNAKeys.CowZombie).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSlimeMixedDrive = new ItemMixedBase(x.CowSlimeMixedDriveID).setDescription(DNAKeys.CowSlime).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowBlazeMixedDrive = new ItemMixedBase(x.CowBlazeMixedDriveID).setDescription(DNAKeys.CowBlaze).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSpiderMixedDrive = new ItemMixedBase(x.CowSpiderMixedDriveID).setDescription(DNAKeys.CowSpider).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowGhastMixedDrive = new ItemMixedBase(x.CowGhastMixedDriveID).setDescription(DNAKeys.CowGhast).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowMagmaCubeMixedDrive = new ItemMixedBase(x.CowMagmaCubeMixedDriveID).setDescription(DNAKeys.CowMagmaCube).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSkeletonMixedDrive = new ItemMixedBase(x.CowSkeletonMixedDriveID).setDescription(DNAKeys.CowSkeleton).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSquidMixedDrive = new ItemMixedBase(x.CowSquidMixedDriveID).setDescription(DNAKeys.CowSquid).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowWitherMixedDrive = new ItemMixedBase(x.CowWitherMixedDriveID).setDescription(DNAKeys.CowWither).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowWitherSMixedDrive = new ItemMixedBase(x.CowWitherSMixedDriveID).setDescription(DNAKeys.CowWitherS).setCreativeTab(MixedCraft.MixedDNATab);

	public static final Item PigSheepMixedDrive = new ItemMixedBase(x.PigSheepMixedDriveID).setDescription(DNAKeys.PigSheep).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigChickenMixedDrive = new ItemMixedBase(x.PigChickenMixedDriveID).setDescription(DNAKeys.PigChicken).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigCreeperMixedDrive = new ItemMixedBase(x.PigCreeperMixedDriveID).setDescription(DNAKeys.PigCreeper).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigEndermanMixedDrive = new ItemMixedBase(x.PigEndermanMixedDriveID).setDescription(DNAKeys.PigEnderman).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigZombieMixedDrive = new ItemMixedBase(x.PigZombieMixedDriveID).setDescription(DNAKeys.PigZombie).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSlimeMixedDrive = new ItemMixedBase(x.PigSlimeMixedDriveID).setDescription(DNAKeys.PigSlime).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigBlazeMixedDrive = new ItemMixedBase(x.PigBlazeMixedDriveID).setDescription(DNAKeys.PigBlaze).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSpiderMixedDrive = new ItemMixedBase(x.PigSpiderMixedDriveID).setDescription(DNAKeys.PigSpider).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigGhastMixedDrive = new ItemMixedBase(x.PigGhastMixedDriveID).setDescription(DNAKeys.PigGhast).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigMagmaCubeMixedDrive = new ItemMixedBase(x.PigMagmaCubeMixedDriveID).setDescription(DNAKeys.PigMagmaCube).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSkeletonMixedDrive = new ItemMixedBase(x.PigSkeletonMixedDriveID).setDescription(DNAKeys.PigSkeleton).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSquidMixedDrive = new ItemMixedBase(x.PigSquidMixedDriveID).setDescription(DNAKeys.PigSquid).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigWitherMixedDrive = new ItemMixedBase(x.PigWitherMixedDriveID).setDescription(DNAKeys.PigWither).setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigWitherSMixedDrive = new ItemMixedBase(x.PigWitherSMixedDriveID).setDescription(DNAKeys.PigWitherS).setCreativeTab(MixedCraft.MixedDNATab);
	
	public static final Item CowPigSpawner = new ItemCowPigSpawner(x.CowPigSpawnerID).registerTextures("CowPigSpawner").setUnlocalizedName("CowPigSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowSheepSpawner = new ItemCowSheepPlacer(x.CowSheepSpawnerID).registerTextures("CowSheepSpawner").setUnlocalizedName("CowSheepSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowChickenSpawner = new ItemCowChickenSpawner(x.CowChickenSpawnerID).registerTextures("CowChickenSpawner").setUnlocalizedName("CowChickenSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowCreeperSpawner = new ItemCreeperPlacer(x.CowCreeperSpawnerID).registerTextures("CowCreeperSpawner").setUnlocalizedName("CowCreeperSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowEndermanSpawner = new ItemCowEndermanPlacer(x.CowEndermanSpawnerID).registerTextures("CowEndermanSpawner").setUnlocalizedName("CowEndermanSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowZombieSpawner = new ItemCowZombiePlacer(x.CowZombieSpawnerID).registerTextures("CowZombieSpawner").setUnlocalizedName("CowZombieSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	
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

	public static final Item CopperIngot = new ItemsBase(x.CopperIngotID, "CopperIngot").setCreativeTab(MixedCraft.MiscTab);
	public static final Item TinIngot = new ItemsBase(x.TinIngotID, "TinIngot").setCreativeTab(MixedCraft.MiscTab);
	public static final Item SilverIngot = new ItemsBase(x.SilverIngotID, "SilverIngot").setCreativeTab(MixedCraft.MiscTab);
	public static final Item GoldHandsaw = new ItemsBase(x.GoldHandsawID, "GoldHandsaw").setCreativeTab(MixedCraft.MiscTab);
	public static final Item DiamondHandsaw = new ItemsBase(x.DiamondHandsawID, "DiamondHandsaw").setCreativeTab(MixedCraft.MiscTab);

	public static final Item SilverSword = new ToolSword(x.SilverSwordID, Silver, "SilverSword");
	public static final Item SilverHoe = new ToolHoe(x.SilverHoeID, Silver, "SilverHoe");
	public static final Item SilverShovel = new ToolShovel(x.SilverShovelID, Silver, "SilverShovel");
	public static final Item SilverPickaxe = new ToolPickaxe(x.SilverPickaxeID, Silver, "SilverPickaxe");
	public static final Item SilverAxe = new ToolAxe(x.SilverAxeID, Silver, "SilverAxe");
	public static final Item SilverShickaxe = new ToolShickaxe(x.SilverShickaxeID, SilverShick, "SilverShickaxe");
	public static final Item DiamondBigSword = new ItemBigSword(x.DiamondBigSwordID, Diamond, "DiamondBigSword");
	public static final Item IronBigSword = new ItemBigSword(x.IronBigSwordID, Iron, "IronBigSword");
	public static final Item GoldBigSword = new ItemBigSword(x.GoldBigSwordID, Gold, "GoldenBigSword");
	public static final Item WoodBigSword = new ItemBigSword(x.WoodBigSwordID, Wood, "WoodenBigSword");
	public static final Item StoneBigSword = new ItemBigSword(x.StoneBigSwordID, Stone, "StoneBigSword");

	public static final Item LightningBow = new LightningBow(x.LightningBowID).setUnlocalizedName("LightningBow").setCreativeTab(MixedCraft.ToolTab);
	public static final Item LightningArrow = new ModItem(x.LightningArrowID).registerTextures("LightningArrow").setUnlocalizedName("LightningArrow").setCreativeTab(MixedCraft.MiscTab);
	public static final Item GoldDoor = new ItemGoldDoor(x.GoldDoorItemID, Material.wood).registerTextures("GoldDoor").setUnlocalizedName("GoldDoor").setCreativeTab(MixedCraft.BlockTab);

	public static final Item TNTBow = new ItemTNTBow(x.TNTBowID).setUnlocalizedName("TNTBow").setCreativeTab(MixedCraft.ToolTab);
	public static final Item TNTArrow = new ModItem(x.TNTArrowID).registerTextures("TNTArrow").setUnlocalizedName("TNTArrow").setCreativeTab(MixedCraft.MiscTab);

	public static final Item ChocalateCake = new ItemReed(x.ChocolateCakeID, BlockHelper.ChocolateCake).setUnlocalizedName("ChocolateCake").setTextureName("MixedCraft:ChocolateCake").setCreativeTab(MixedCraft.BlockTab);
	public static final Item LightningRod = new ItemLightningRod(x.LightningRodID).registerTextures("LightningRod").setUnlocalizedName("LightningRod").setCreativeTab(MixedCraft.ToolTab);
	public static final Item FlameSword = new ItemFlameSword(x.FlameSwordID, Flame).registerTexture("FlameSword").setUnlocalizedName("FlameSword");

    public static final Item ChocolateBean = new ItemModSeeds(x.ChocolateBeanID, BlockHelper.ChocolateCrop.blockID, Block.tilledField.blockID, "ChocolateBean");
	public static final Item Droid = new ItemDroid(x.DroidID);
	public static final Item Wand = new ItemMobShooter(x.WandID);
	//public static final Item Test = new ItemHouse(4235);
	
	public static final Item wandDeath = new WandOfDeath(x.WandDeathID, "wandDeath");
	public static final Item wandFire = new WandOfFire(x.WandFireID, "wandFire");
	public static final Item wandGrowth = new WandOfGrowth(x.WandGrowthID, "wandGrowth");
	public static final Item wandHarvest = new WandOfHarvesting(x.WandHarvestID, "wandHarvest");
	public static final Item wandHealing = new WandOfHealing(x.WandHealingID, "wandHeal");
	public static final Item wandIce = new WandOfIce(x.WandIceID, "wandIce");
	public static final Item wandMissile = new WandOfMagicMissile(x.WandMissileID, "wandMissiles");
	public static final Item wandMining = new WandOfMining(x.WandMiningID, "wandMining");
	public static final Item wandTeleport = new WandOfTeleportation(x.WandTeleportID, "wandTeleport");
	public static final Item wandHarming = new WandOfHarming(x.WandHarmingID, "wandHarm");
	
	public static final Item TorchBow = new ItemTorchBow(x.TorchBowID);
	
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
