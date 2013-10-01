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
	public static int PigPigMixedDriveID;
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
	public static int Diamond;
	public static int GoldDoorID;
	public static int TableID;
	public static int DiamondFurnaceOnID;
	public static int DiamondFurnaceOffID;
	public static int BluestoneWireBlockID;
	public static int BluestoneOreGlowingID;
	public static int BluestoneOreID;
	public static int BlueRepeaterID;
	public static int BlueRepeaterOnID;
	public static int BlueComparatorID;
	public static int BlueComparatorOnID;
	public static int BlueTorchID;
	public static int BlueTorchOnID;
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
	public static int poisonOreID;
	
	
	public static int id = 1500;
		
    public static void initConfig(FMLPreInitializationEvent event) {
    		File file = new File(event.getModConfigurationDirectory(), "MixedCraft.cfg");
    		Configuration config = new Configuration(file);
    		
    		config.load();
    		
    		poisonOreID = config.getBlock("Poision Ore", id++).getInt();
    		
    		ExtractorID = config.getBlock("extractor", id++).getInt();
    		MixerID = config.getBlock("mixer", id++).getInt();
    		AssemblerID = config.getBlock("assembler", id++).getInt();
    		CopperOreID = config.getBlock("copperOre", id++).getInt();
    		CraftingID = config.getBlock("BigCrafting", id++).getInt();
    		TinOreID = config.getBlock("TinOre", id++).getInt();
    		TinBlockID = config.getBlock("TinBlock", id++).getInt();
    		CopperBlockID = config.getBlock("CopperBlock", id++).getInt();
    		SilverOreID = config.getBlock("SilverOre", id++).getInt();
    		SilverBlockID = config.getBlock("SilverBlock", id++).getInt();
    		SolarPanelID = config.getBlock("SolarPanel", id++).getInt();
    		CowSheepWoolID = config.getBlock("CowSheepWool", id++).getInt();
    		DisasemblerID = config.getBlock("Disasembler", id++).getInt();
    		IronFurnaceID = config.getBlock("IronFurnace", id++).getInt();
    		IronFurnaceOnID = config.getBlock("IronFurnaceOn", id++).getInt();
    		GoldDoorID = config.getBlock("GoldDoor", id++).getInt();
    		TableID = config.getBlock("Table", id++).getInt();
    		DiamondFurnaceOffID = config.getBlock("DiamondFurnace", id++).getInt();
    		DiamondFurnaceOnID = config.getBlock("DiamondFurnaceOn", id++).getInt();
    		BluestoneWireBlockID = config.getBlock("BluestoneWireBlock", id++).getInt();
    		BluestoneOreID = config.getBlock("BluestoneOre", id++).getInt();
    		BluestoneOreGlowingID = config.getBlock("BluestoneOreGlowing", id++).getInt();
    		BlueRepeaterID = config.getBlock("BlueRepeater", id++).getInt();
    		BlueRepeaterOnID = config.getBlock("BlueRepeaterOn", id++).getInt();
    		BlueComparatorID = config.getBlock("BlueComparator", id++).getInt();
    		BlueComparatorOnID = config.getBlock("BlueComparatorOn", id++).getInt();
    		BlueTorchID = config.getBlock("BlueTorch", id++).getInt();
    		BlueTorchOnID = config.getBlock("BlueTorchOn", id++).getInt();
    		BluestoneBlockID = config.getBlock("BluestoneBlock", id++).getInt();
    		House1ID = config.getBlock("House1", id++).getInt();
    		HugeChestID = config.getBlock("HugeChest", id++).getInt();
    		ChocolateCakeID = config.getBlock("ChocolateCake", id++).getInt();
    		ChocolateCakeBlockID = config.getBlock("ChocolateCakeBlock", id++).getInt();
    		ChocolateCropBlockID = config.getBlock("ChocolateCropBlock", id++).getInt();
    		GoldFurnaceID = config.getBlock("Gold Furnace", id++).getInt();
    		GoldFurnaceOnID = config.getBlock("Gold Furnace On", id++).getInt();
    		
    		
    		
            FlashDriveID = config.getItem("flashDrive", id++).getInt();
            FailDriveID = config.getItem("failDrive", id++).getInt();
            CowDNADriveID = config.getItem("CowDNADrive", id++).getInt();
            SheepDNADriveID = config.getItem("SheepDNADrive", id++).getInt();
            ChickenDNADriveID = config.getItem("ChickenDNADrive", id++).getInt();
            CreeperDNADriveID = config.getItem("CreeperDNADrive", id++).getInt();
            PigDNADriveID = config.getItem("PigDNADrive", id++).getInt();
            EndermanDNADriveID = config.getItem("EndermanDNADrive", id++).getInt();
            ZombieDNADriveID = config.getItem("ZombieDNADrive", id++).getInt();
            SkeletonDNADriveID = config.getItem("SkeletonDNADrive", id++).getInt();
            GhastDNADriveID = config.getItem("GhastDNADrive", id++).getInt();
            SpiderDNADriveID = config.getItem("SpiderDNADrive", id++).getInt();
            SlimeDNADriveID = config.getItem("SlimeDNADrive", id++).getInt();
            SquidDNADriveID = config.getItem("SquidDNADrive", id++).getInt();
            BlazeDNADriveID = config.getItem("BlazeDNADrive", id++).getInt();
            WitherSDNADriveID = config.getItem("WitherSDNADrive", id++).getInt();
            WitherDNADriveID = config.getItem("WitherDNADrive", id++).getInt();
            
            CowPigMixedDriveID = config.getItem("CowPigMixedDrive", id++).getInt();
            CowChickenMixedDriveID = config.getItem("CowChickenMixedDrive", id++).getInt();
            CowCreeperMixedDriveID = config.getItem("CowCreeperMixedDrive", id++).getInt();
            CowEndermanMixedDriveID = config.getItem("CowEndermanMixedDrive", id++).getInt();
            CowZombieMixedDriveID = config.getItem("CowZombieMixedDrive", id++).getInt();
            CowSlimeMixedDriveID = config.getItem("CowSlimeMixedDrive", id++).getInt();
            CowBlazeMixedDriveID = config.getItem("CowBlazeMixedDrive", id++).getInt();
        	CowSpiderMixedDriveID = config.getItem("CowSpiderMixedDrive", id++).getInt();
        	CowGhastMixedDriveID = config.getItem("CowGhastMixedDrive", id++).getInt();
        	CowMagmaCubeMixedDriveID = config.getItem("CowMagmaCubeMixedDrive", id++).getInt();
        	CowSkeletonMixedDriveID = config.getItem("CowSkeletonMixedDrive", id++).getInt();
        	CowSquidMixedDriveID = config.getItem("CowSquidMixedDrive", id++).getInt();
        	CowWitherMixedDriveID = config.getItem("CowSquidMixedDrive", id++).getInt();
        	CowWitherSMixedDriveID = config.getItem("CowWitherSMixedDrive", id++).getInt();

            PigChickenMixedDriveID = config.getItem("PigChickenMixedDrive", id++).getInt();
            PigCreeperMixedDriveID = config.getItem("CowCreeperMixedDrive", id++).getInt();
            PigEndermanMixedDriveID = config.getItem("PigEndermanMixedDrive", id++).getInt();
            PigZombieMixedDriveID = config.getItem("PigZombieMixedDrive", id++).getInt();
            PigSlimeMixedDriveID = config.getItem("PigSlimeMixedDrive", id++).getInt();
            PigBlazeMixedDriveID = config.getItem("PigBlazeMixedDrive", id++).getInt();
            PigSpiderMixedDriveID = config.getItem("PigSpiderMixedDrive", id++).getInt();
            PigGhastMixedDriveID = config.getItem("PigGhastMixedDrive", id++).getInt();
            PigMagmaCubeMixedDriveID = config.getItem("PigMagmaCubeMixedDrive", id++).getInt();
            PigSkeletonMixedDriveID = config.getItem("PigSkeletonMixedDrive", id++).getInt();
            PigSquidMixedDriveID = config.getItem("PigSquidMixedDrive", id++).getInt();
            PigWitherMixedDriveID = config.getItem("PigWitherMixedDrive", id++).getInt();
            PigWitherSMixedDriveID = config.getItem("PigWitherSMixedDrive", id++).getInt();
        	
            CowPigSpawnerID = config.getItem("CowPigSpawner", id++).getInt();
            CowSheepSpawnerID = config.getItem("CowSheepSpawner", id++).getInt();
            CowChickenSpawnerID = config.getItem("CowChickenSpawner", id++).getInt();
            CowCreeperSpawnerID = config.getItem("CowCreeperSpawner", id++).getInt();
            CowEndermanSpawnerID = config.getItem("CowEndermanSpawner", id++).getInt();
            CowZombieSpawnerID = config.getItem("CowZombieSpawner", id++).getInt();
            CowSlimeSpawnerID = config.getItem("CowSlimeSpawner", id++).getInt();
            CowBlazeSpawnerID = config.getItem("CowBlazeSpawner", id++).getInt();
            CowSpiderSpawnerID = config.getItem("CowSpiderSpawner", id++).getInt();
            CowGhastSpawnerID = config.getItem("CowGhastSpawner", id++).getInt();
            CowMagmaCubeSpawnerID = config.getItem("CowMagmaCubeSpawner", id++).getInt();
            CowSkeletonSpawnerID = config.getItem("CowSkeletonSpawner", id++).getInt();
            CowSquidSpawnerID = config.getItem("CowSquidSpawner", id++).getInt();
            CowWitherSpawnerID = config.getItem("CowWitherSpawner", id++).getInt();
            CowWitherSSpawnerID = config.getItem("CowWitherSSpawner", id++).getInt();

            CopperIngotID = config.getItem("CopperIngot", id++).getInt();
            TinIngotID = config.getItem("TinIngot", id++).getInt();
            SilverIngotID = config.getItem("SilverIngot", id++).getInt();
            GoldHandsawID = config.getItem("GoldHandsaw", id++).getInt();
            DiamondHandsawID = config.getItem("DiamondHandsaw", id++).getInt();
            GoldDoorItemID = config.getItem("GoldDoorItem", id++).getInt();
            StructureBuilderID = config.getItem("StructureBuilder", id++).getInt();
            LightningRodID = config.getItem("LightningRod", id++).getInt();

            SilverSwordID = config.getItem("SilverSword", id++).getInt();
            SilverHoeID = config.getItem("SilverHoe", id++).getInt();
            SilverShovelID = config.getItem("SilverShovel", id++).getInt();
            SilverPickaxeID = config.getItem("SilverPickaxe", id++).getInt();
            SilverAxeID = config.getItem("SilverAxe", id++).getInt();
            SilverShickaxeID = config.getItem("SilverShickaxe", id++).getInt();
            DiamondBigSwordID = config.getItem("DiamondBigSword", id++).getInt();
            IronBigSwordID = config.getItem("IronBigSword", id++).getInt();
            GoldBigSwordID = config.getItem("GoldBigSword", id++).getInt();
            WoodBigSwordID = config.getItem("WoodBigSword", id++).getInt();
            StoneBigSwordID = config.getItem("StoneBigSword", id++).getInt();

            FlameSwordID = config.getItem("FlameSwordID", id++).getInt();

            ItemBlueComparatorID = config.getItem("ItemBlueComparator", id++).getInt();
            ItemBluestoneID = config.getItem("ItemBluestone", id++).getInt();
            ItemBluestoneRepeaterID = config.getItem("ItemBluestoneRepeater", id++).getInt();
            ChocolateBeanID = config.getItem("ChocolateBeanID", id++).getInt();

            LightningBowID = config.getItem("LightningBow", id++).getInt();
            LightningArrowID = config.getItem("LightningArrow", id++).getInt();
            
            TNTBowID = config.getItem("TNTBow", id++).getInt();
            TNTArrowID = config.getItem("TNTArrow", id++).getInt();
            
            BombBlockID = config.getItem("Bomb", id++).getInt();
            MachineBlockID = config.getItem("Machine", id++).getInt();

            CardID = config.getItem("Card", id++).getInt();
            DroidID = config.getItem("Droid Item", id++).getInt();
            WandID = config.getItem("Wand", id++).getInt();

            //ID = config.getItem("", id++).getInt();
            
            config.save();

    }
}
