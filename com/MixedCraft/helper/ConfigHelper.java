package com.MixedCraft.helper;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigHelper {

	public static int FlashDriveID;
	public static int FailDriveID;

	public static int CowDNADriveID;
	public static int PigDNADriveID;
	public static int SheepDNADriveID;
	public static int EndermanDNADriveID;
	public static int ChickenDNADriveID;
	public static int ZombieDNADriveID;
	public static int SkeletonDNADriveID;
	public static int SquidDNADriveID;
	public static int BlazeDNADriveID;
	public static int WitherSDNADriveID;
	public static int WitherDNADriveID;
	public static int GhastDNADriveID;
	public static int SpiderDNADriveID;
	public static int SlimeDNADriveID;

	public static int CowChickenMixedDriveID;
	public static int CowZombieMixedDriveID;
	public static int CowEndermanMixedDriveID;
	public static int CowSheepMixedDriveID;
	public static int CowPigMixedDriveID;
	public static int CowSlimeMixedDriveID;
	public static int CowBlazeMixedDriveID;
	public static int CowSpiderMixedDriveID;
	public static int CowGhastMixedDriveID;
	public static int CowMagmaCubeMixedDriveID;
	public static int CowSkeletonMixedDriveID;
	public static int CowSquidMixedDriveID;
	public static int CowCreeperMixedDriveID;
	public static int CowWitherMixedDriveID;
	public static int CowWitherSMixedDriveID;

	public static int PigChickenMixedDriveID;
	public static int PigZombieMixedDriveID;
	public static int PigEndermanMixedDriveID;
	public static int PigSheepMixedDriveID;
	public static int PigSlimeMixedDriveID;
	public static int PigBlazeMixedDriveID;
	public static int PigSpiderMixedDriveID;
	public static int PigGhastMixedDriveID;
	public static int PigMagmaCubeMixedDriveID;
	public static int PigSkeletonMixedDriveID;
	public static int PigSquidMixedDriveID;
	public static int PigCreeperMixedDriveID;
	public static int PigWitherMixedDriveID;
	public static int PigWitherSMixedDriveID;

	public static int CowSlimeSpawnerID;
	public static int CowBlazeSpawnerID;
	public static int CowSpiderSpawnerID;
	public static int CowGhastSpawnerID;
	public static int CowMagmaCubeSpawnerID;
	public static int CowSkeletonSpawnerID;
	public static int CowSquidSpawnerID;
	public static int CowWitherSpawnerID;
	public static int CowWitherSSpawnerID;
	public static int CowChickenSpawnerID;
	public static int CreeperDNADriveID;
	public static int CowCreeperSpawnerID;
	public static int CowPigSpawnerID;
	public static int CowEndermanSpawnerID;
	public static int CowZombieSpawnerID;
	public static int CowSheepSpawnerID;

	public static int CopperIngotID;
	public static int TinIngotID;
	public static int SilverIngotID;
	public static int GoldDoorItemID;
	public static int GoldHandsawID;
	public static int DiamondHandsawID;
	public static int ItemBlueComparatorID;
	public static int ItemBluestoneID;
	public static int ItemBluestoneRepeaterID;
	public static int StructureBuilderID;

	public static int SilverSwordID;
	public static int SilverHoeID;
	public static int SilverShovelID;
	public static int SilverPickaxeID;
	public static int SilverAxeID;
	public static int SilverShickaxeID;
	public static int DiamondBigSwordID;
	public static int IronBigSwordID;
	public static int GoldBigSwordID;
	public static int WoodBigSwordID;
	public static int StoneBigSwordID;

	public static int LightningRodID;
	public static int ChocolateCakeID;
	public static int FlameSwordID;

	public static int LightningBowID;
	public static int LightningArrowID;

	public static int TNTBowID;
	public static int TNTArrowID;

	public static int ExtractorID;
	public static int MixerID;
	public static int AssemblerID;
	public static int CopperOreID;
	public static int CraftingID;
	public static int TinOreID;
	public static int TinBlockID;
	public static int CopperBlockID;
	public static int SilverOreID;
	public static int SilverBlockID;
	public static int SolarPanelID;
	public static int CowSheepWoolID;
	public static int DisasemblerID;
	public static int IronFurnaceID;
	public static int IronFurnaceOnID;
	public static int GoldDoorID;
	public static int TableID;
	public static int DiamondFurnaceOnID;
	public static int DiamondFurnaceOffID;
	public static int ColourID;
	public static int BluestoneOreGlowingID;
	public static int BluestoneOreID;
	public static int BlueRepeaterID;
	public static int BlueRepeaterOnID;
	public static int FlylightPortalID;
	public static int BlueComparatorOnID;
	public static int BlueTorchID;
	public static int SlowSandID;
	public static int BluestoneBlockID;
	public static int House1ID;
	public static int HugeChestID;
	public static int ChocolateCakeBlockID;
	public static int ChocolateCropBlockID;
	public static int ChocolateBeanID;
	public static int BombBlockID;
	public static int MachineBlockID;
	public static int CardID, WandID, DroidID;
	public static int GoldFurnaceID;
	public static int GoldFurnaceOnID;
	public static int DoubleFurnaceOffID;
	public static int DoubleFurnaceOnID;
	public static int WandDeathID, WandFireID, WandGrowthID, WandHarvestID, WandHealingID, WandIceID, WandMissileID, WandMiningID, WandTeleportID
	, WandHarmingID;
	
	public static int Flower1, Flower2, FlylightLog, FlylightLeaves, SugarCane, Grass, Fern, Sapling, ItemCane, ModWater, Vine;
	public static int Iron, Coal, Redstone, Emerald, Diamond, Lapis, Gold;
	
	public static int id = 3000;

	static FMLPreInitializationEvent Event;



	public static void initConfig(FMLPreInitializationEvent event) {
		Event = event;
		blocks();
		items();
	}

	static void blocks(){
		ExtractorID = addBlock("extractor");
		MixerID = addBlock("mixer");
		AssemblerID = addBlock("assembler");
		CopperOreID = addBlock("copperOre");
		CraftingID = addBlock("BigCrafting");
		TinOreID = addBlock("TinOre");
		TinBlockID = addBlock("TinBlock");
		CopperBlockID = addBlock("CopperBlock");
		SilverOreID = addBlock("SilverOre");
		SilverBlockID = addBlock("SilverBlock");
		SolarPanelID = addBlock("SolarPanel");
		CowSheepWoolID = addBlock("CowSheepWool");
		DisasemblerID = addBlock("Disasembler");
		IronFurnaceID = addBlock("IronFurnace");
		IronFurnaceOnID = addBlock("IronFurnaceOn");
		GoldDoorID = addBlock("GoldDoor");
		TableID = addBlock("Table");
		DiamondFurnaceOffID = addBlock("DiamondFurnace");
		DiamondFurnaceOnID = addBlock("DiamondFurnaceOn");
		ColourID = addBlock("Colourfull block");
		BluestoneOreID = addBlock("BluestoneOre");
		BluestoneOreGlowingID = addBlock("BluestoneOreGlowing");
		BlueRepeaterID = addBlock("BlueRepeater");
		BlueRepeaterOnID = addBlock("BlueRepeaterOn");
		FlylightPortalID = addBlock("FlyLight Portal");
		BlueComparatorOnID = addBlock("BlueComparatorOn");
		BlueTorchID = addBlock("BlueTorch");
		SlowSandID = addBlock("Sink Sand");
		BluestoneBlockID = addBlock("BluestoneBlock");
		House1ID = addBlock("House1");
		HugeChestID = addBlock("HugeChest");
		ChocolateCakeID = addBlock("ChocolateCake");
		ChocolateCakeBlockID = addBlock("ChocolateCakeBlock");
		ChocolateCropBlockID = addBlock("ChocolateCropBlock");
		GoldFurnaceID = addBlock("Gold Furnace");
		GoldFurnaceOnID = addBlock("Gold Furnace On");
		DoubleFurnaceOffID = addBlock("DoubleFurnace");
		DoubleFurnaceOnID = addBlock("DoubleFurnaceOn");
		Flower1 = addBlock("Flower 1");
		Flower2 = addBlock("Flower 2");
		FlylightLog = addBlock("Flylight Log");
		FlylightLeaves = addBlock("Flylight Leaves");
		SugarCane = addBlock("S+Sugar Cane");
		Grass = addBlock("Grass");
		Fern = addBlock("Fern");
		Sapling = addBlock("Sapling");
		ModWater = addBlock("Flylight Water");
		Vine = addBlock("Flylight Vine");
		Iron = addBlock("Flylight Iron Ore");
		Coal = addBlock("Flylight Coal Ore");
		Redstone = addBlock("Flylight Redstone Ore");
		Emerald = addBlock("Flylight Emerald Ore");
		Diamond = addBlock("Flylight Diamond Ore");
		Lapis = addBlock("Flylight Lapis Ore");
		Gold = addBlock("Flylight Gold Ore");
	}

	static void items(){
		FlashDriveID = addItem("flashDrive");
		FailDriveID = addItem("failDrive");
		CowDNADriveID = addItem("CowDNADrive");
		SheepDNADriveID = addItem("SheepDNADrive");
		ChickenDNADriveID = addItem("ChickenDNADrive");
		CreeperDNADriveID = addItem("CreeperDNADrive");
		PigDNADriveID = addItem("PigDNADrive");
		EndermanDNADriveID = addItem("EndermanDNADrive");
		ZombieDNADriveID = addItem("ZombieDNADrive");
		SkeletonDNADriveID = addItem("SkeletonDNADrive");
		GhastDNADriveID = addItem("GhastDNADrive");
		SpiderDNADriveID = addItem("SpiderDNADrive");
		SlimeDNADriveID = addItem("SlimeDNADrive");
		SquidDNADriveID = addItem("SquidDNADrive");
		BlazeDNADriveID = addItem("BlazeDNADrive");
		WitherSDNADriveID = addItem("WitherSDNADrive");
		WitherDNADriveID = addItem("WitherDNADrive");
		CowPigMixedDriveID = addItem("CowPigMixedDrive");
		CowSheepMixedDriveID = addItem("Cow Sheep");
		CowChickenMixedDriveID = addItem("CowChickenMixedDrive");
		CowCreeperMixedDriveID = addItem("CowCreeperMixedDrive");
		CowEndermanMixedDriveID = addItem("CowEndermanMixedDrive");
		CowZombieMixedDriveID = addItem("CowZombieMixedDrive");
		CowSlimeMixedDriveID = addItem("CowSlimeMixedDrive");
		CowBlazeMixedDriveID = addItem("CowBlazeMixedDrive");
		CowSpiderMixedDriveID = addItem("CowSpiderMixedDrive");
		CowGhastMixedDriveID = addItem("CowGhastMixedDrive");
		CowMagmaCubeMixedDriveID = addItem("CowMagmaCubeMixedDrive");
		CowSkeletonMixedDriveID = addItem("CowSkeletonMixedDrive");
		CowSquidMixedDriveID = addItem("CowSquidMixedDrive");
		CowWitherMixedDriveID = addItem("CowSquidMixedDrive");
		CowWitherSMixedDriveID = addItem("CowWitherSMixedDrive");
		PigChickenMixedDriveID = addItem("PigChickenMixedDrive");
		PigCreeperMixedDriveID = addItem("CowCreeperMixedDrive");
		PigEndermanMixedDriveID = addItem("PigEndermanMixedDrive");
		PigSheepMixedDriveID = addItem("Pig Sheep");
		PigZombieMixedDriveID = addItem("PigZombieMixedDrive");
		PigSlimeMixedDriveID = addItem("PigSlimeMixedDrive");
		PigBlazeMixedDriveID = addItem("PigBlazeMixedDrive");
		PigSpiderMixedDriveID = addItem("PigSpiderMixedDrive");
		PigGhastMixedDriveID = addItem("PigGhastMixedDrive");
		PigMagmaCubeMixedDriveID = addItem("PigMagmaCubeMixedDrive");
		PigSkeletonMixedDriveID = addItem("PigSkeletonMixedDrive");
		PigSquidMixedDriveID = addItem("PigSquidMixedDrive");
		PigWitherMixedDriveID = addItem("PigWitherMixedDrive");
		PigWitherSMixedDriveID = addItem("PigWitherSMixedDrive");
		CowPigSpawnerID = addItem("CowPigSpawner");
		CowSheepSpawnerID = addItem("CowSheepSpawner");
		CowChickenSpawnerID = addItem("CowChickenSpawner");
		CowCreeperSpawnerID = addItem("CowCreeperSpawner");
		CowEndermanSpawnerID = addItem("CowEndermanSpawner");
		CowZombieSpawnerID = addItem("CowZombieSpawner");
		CowSlimeSpawnerID = addItem("CowSlimeSpawner");
		CowBlazeSpawnerID = addItem("CowBlazeSpawner");
		CowSpiderSpawnerID = addItem("CowSpiderSpawner");
		CowGhastSpawnerID = addItem("CowGhastSpawner");
		CowMagmaCubeSpawnerID = addItem("CowMagmaCubeSpawner");
		CowSkeletonSpawnerID = addItem("CowSkeletonSpawner");
		CowSquidSpawnerID = addItem("CowSquidSpawner");
		CowWitherSpawnerID = addItem("CowWitherSpawner");
		CowWitherSSpawnerID = addItem("CowWitherSSpawner");
		CopperIngotID = addItem("CopperIngot");
		TinIngotID = addItem("TinIngot");
		SilverIngotID = addItem("SilverIngot");
		GoldHandsawID = addItem("GoldHandsaw");
		DiamondHandsawID = addItem("DiamondHandsaw");
		GoldDoorItemID = addItem("GoldDoorItem");
		StructureBuilderID = addItem("StructureBuilder");
		LightningRodID = addItem("LightningRod");
		SilverSwordID = addItem("SilverSword");
		SilverHoeID = addItem("SilverHoe");
		SilverShovelID = addItem("SilverShovel");
		SilverPickaxeID = addItem("SilverPickaxe");
		SilverAxeID = addItem("SilverAxe");
		SilverShickaxeID = addItem("SilverShickaxe");
		DiamondBigSwordID = addItem("DiamondBigSword");
		IronBigSwordID = addItem("IronBigSword");
		GoldBigSwordID = addItem("GoldBigSword");
		WoodBigSwordID = addItem("WoodBigSword");
		StoneBigSwordID = addItem("StoneBigSword");
		FlameSwordID = addItem("FlameSwordID");
		ItemBlueComparatorID = addItem("ItemBlueComparator");
		ItemBluestoneID = addItem("ItemBluestone");
		ItemBluestoneRepeaterID = addItem("ItemBluestoneRepeater");
		ChocolateBeanID = addItem("ChocolateBeanID");
		LightningBowID = addItem("LightningBow");
		LightningArrowID = addItem("LightningArrow");
		TNTBowID = addItem("TNTBow");
		TNTArrowID = addItem("TNTArrow");
		DroidID = addItem("Droid Item");
		WandID = addItem("Wand");
		WandDeathID = addItem("Wand Of Death");
		WandFireID = addItem("Wand Of Fire");
		WandGrowthID = addItem("Wand Of Growth");
		WandHarvestID = addItem("Wand Of Harvest");
		WandHealingID = addItem("Wand Of Healing");
		WandIceID = addItem("Wand Of Ice");
		WandMissileID = addItem("Wand Of Missile");
		WandMiningID = addItem("Wand Of Mining");
		WandTeleportID = addItem("Wand Of Teleport");
		WandHarmingID = addItem("Wand Of Harming");
		ItemCane = addItem("Flylight Sugar Cane Item");
	}
	static int item;
	static int block;

	public static int addItem(String name){
		File file = new File(Event.getModConfigurationDirectory(), "MixedCraft.cfg");
		Configuration config = new Configuration(file);
		config.load();
		item = config.getItem(name, id++).getInt();
		config.save();
		return item++;
	}
	
	public static int Flylight;
	
	public static int addBlock(String Name){
		File file = new File(Event.getModConfigurationDirectory(), "MixedCraft.cfg");
		Configuration config = new Configuration(file);
		config.load();
		block = config.getBlock(Name, id++).getInt();
		Flylight = config.get("Dimension", "Flylight", 15).getInt();
		config.save();
		return block++;
	}
}
