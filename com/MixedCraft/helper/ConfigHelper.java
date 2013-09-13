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

    public static void initConfig(FMLPreInitializationEvent event) {
    		File file = new File(event.getModConfigurationDirectory(), "MixedCraft.cfg");
    		Configuration config = new Configuration(file);
    		
    		config.load();
    		
    		ExtractorID = config.getBlock("extractor", 3000).getInt();
    		MixerID = config.getBlock("mixer", 3001).getInt();
    		AssemblerID = config.getBlock("assembler", 3002).getInt();
    		CopperOreID = config.getBlock("copperOre", 3003).getInt();
    		CraftingID = config.getBlock("BigCrafting", 3004).getInt();
    		TinOreID = config.getBlock("TinOre", 3005).getInt();
    		TinBlockID = config.getBlock("TinBlock", 3006).getInt();
    		CopperBlockID = config.getBlock("CopperBlock", 3007).getInt();
    		SilverOreID = config.getBlock("SilverOre", 3008).getInt();
    		SilverBlockID = config.getBlock("SilverBlock", 3009).getInt();
    		SolarPanelID = config.getBlock("SolarPanel", 3010).getInt();
    		CowSheepWoolID = config.getBlock("CowSheepWool", 3011).getInt();
    		DisasemblerID = config.getBlock("Disasembler", 3012).getInt();
    		IronFurnaceID = config.getBlock("IronFurnace", 3013).getInt();
    		IronFurnaceOnID = config.getBlock("IronFurnaceOn", 3014).getInt();
    		GoldDoorID = config.getBlock("GoldDoor", 3015).getInt();
    		TableID = config.getBlock("Table", 3016).getInt();
    		DiamondFurnaceOffID = config.getBlock("DiamondFurnace", 3017).getInt();
    		DiamondFurnaceOnID = config.getBlock("DiamondFurnaceOn", 3018).getInt();
    		BluestoneWireBlockID = config.getBlock("BluestoneWireBlock", 3019).getInt();
    		BluestoneOreID = config.getBlock("BluestoneOre", 3020).getInt();
    		BluestoneOreGlowingID = config.getBlock("BluestoneOreGlowing", 3021).getInt();
    		BlueRepeaterID = config.getBlock("BlueRepeater", 3022).getInt();
    		BlueRepeaterOnID = config.getBlock("BlueRepeaterOn", 3023).getInt();
    		BlueComparatorID = config.getBlock("BlueComparator", 3024).getInt();
    		BlueComparatorOnID = config.getBlock("BlueComparatorOn", 3025).getInt();
    		BlueTorchID = config.getBlock("BlueTorch", 3026).getInt();
    		BlueTorchOnID = config.getBlock("BlueTorchOn", 3027).getInt();
    		BluestoneBlockID = config.getBlock("BluestoneBlock", 3028).getInt();
    		House1ID = config.getBlock("House1", 3029).getInt();
    		HugeChestID = config.getBlock("HugeChestID", 3030).getInt();
    		ChocolateCakeID = config.getBlock("ChocolateCakeID", 3031).getInt();
    		ChocolateCakeBlockID = config.getBlock("ChocolateCakeBlockID", 3032).getInt();
    		ChocolateCropBlockID = config.getBlock("ChocolateCropBlockID", 3033).getInt();

            FlashDriveID = config.getItem("flashDrive", 4001).getInt();
            FailDriveID = config.getItem("failDrive", 4002).getInt();
            CowDNADriveID = config.getItem("CowDNADrive", 4003).getInt();
            SheepDNADriveID = config.getItem("SheepDNADrive", 4005).getInt();
            ChickenDNADriveID = config.getItem("ChickenDNADrive", 4007).getInt();
            CreeperDNADriveID = config.getItem("CreeperDNADrive", 4009).getInt();
            PigDNADriveID = config.getItem("PigDNADrive", 4011).getInt();
            EndermanDNADriveID = config.getItem("EndermanDNADrive", 4012).getInt();
            ZombieDNADriveID = config.getItem("ZombieDNADrive", 4014).getInt();
            SkeletonDNADriveID = config.getItem("SkeletonDNADrive", 4016).getInt();
            GhastDNADriveID = config.getItem("GhastDNADrive", 4017).getInt();
            SpiderDNADriveID = config.getItem("SpiderDNADrive", 4018).getInt();
            SlimeDNADriveID = config.getItem("SlimeDNADrive", 4019).getInt();
            SquidDNADriveID = config.getItem("SquidDNADrive", 4020).getInt();
            BlazeDNADriveID = config.getItem("BlazeDNADrive", 4021).getInt();
            WitherSDNADriveID = config.getItem("WitherSDNADrive", 4022).getInt();
            WitherDNADriveID = config.getItem("WitherDNADrive", 4023).getInt();
            
            CowPigMixedDriveID = config.getItem("CowPigMixedDrive", 4500).getInt();
            CowChickenMixedDriveID = config.getItem("CowChickenMixedDrive", 4501).getInt();
            CowCreeperMixedDriveID = config.getItem("CowCreeperMixedDrive", 4502).getInt();
            CowEndermanMixedDriveID = config.getItem("CowEndermanMixedDrive", 4503).getInt();
            CowZombieMixedDriveID = config.getItem("CowZombieMixedDrive", 4504).getInt();
            CowSlimeMixedDriveID = config.getItem("CowSlimeMixedDrive", 4505).getInt();
            CowBlazeMixedDriveID = config.getItem("CowBlazeMixedDrive", 4506).getInt();
        	CowSpiderMixedDriveID = config.getItem("CowSpiderMixedDrive", 4507).getInt();
        	CowGhastMixedDriveID = config.getItem("CowGhastMixedDrive", 4508).getInt();
        	CowMagmaCubeMixedDriveID = config.getItem("CowMagmaCubeMixedDrive", 4509).getInt();
        	CowSkeletonMixedDriveID = config.getItem("CowSkeletonMixedDrive", 4510).getInt();
        	CowSquidMixedDriveID = config.getItem("CowSquidMixedDrive", 4511).getInt();
        	CowWitherMixedDriveID = config.getItem("CowSquidMixedDrive", 4512).getInt();
        	CowWitherSMixedDriveID = config.getItem("CowWitherSMixedDrive", 4513).getInt();

            PigChickenMixedDriveID = config.getItem("PigChickenMixedDrive", 4514).getInt();
            PigCreeperMixedDriveID = config.getItem("CowCreeperMixedDrive", 4515).getInt();
            PigEndermanMixedDriveID = config.getItem("PigEndermanMixedDriveID", 4516).getInt();
            PigZombieMixedDriveID = config.getItem("PigZombieMixedDriveID", 4517).getInt();
            PigSlimeMixedDriveID = config.getItem("PigSlimeMixedDriveID", 4518).getInt();
            PigBlazeMixedDriveID = config.getItem("PigBlazeMixedDriveID", 4519).getInt();
            PigSpiderMixedDriveID = config.getItem("PigSpiderMixedDriveID", 4520).getInt();
            PigGhastMixedDriveID = config.getItem("PigGhastMixedDriveID", 4521).getInt();
            PigMagmaCubeMixedDriveID = config.getItem("PigMagmaCubeMixedDriveID", 4522).getInt();
            PigSkeletonMixedDriveID = config.getItem("PigSkeletonMixedDriveID", 4523).getInt();
            PigSquidMixedDriveID = config.getItem("PigSquidMixedDriveID", 4524).getInt();
            PigWitherMixedDriveID = config.getItem("PigWitherMixedDriveID", 4525).getInt();
            PigWitherSMixedDriveID = config.getItem("PigWitherSMixedDriveID", 4526).getInt();
        	
            CowPigSpawnerID = config.getItem("CowPigSpawner", 5000).getInt();
            CowSheepSpawnerID = config.getItem("CowSheepSpawner", 5001).getInt();
            CowChickenSpawnerID = config.getItem("CowChickenSpawner", 5002).getInt();
            CowCreeperSpawnerID = config.getItem("CowCreeperSpawner", 5003).getInt();
            CowEndermanSpawnerID = config.getItem("CowEndermanSpawner", 5004).getInt();
            CowZombieSpawnerID = config.getItem("CowZombieSpawner", 5005).getInt();
            CowSlimeSpawnerID = config.getItem("CowSlimeSpawner", 5006).getInt();
            CowBlazeSpawnerID = config.getItem("CowBlazeSpawner", 5007).getInt();
            CowSpiderSpawnerID = config.getItem("CowSpiderSpawner", 5008).getInt();
            CowGhastSpawnerID = config.getItem("CowGhastSpawner", 5009).getInt();
            CowMagmaCubeSpawnerID = config.getItem("CowMagmaCubeSpawner", 5010).getInt();
            CowSkeletonSpawnerID = config.getItem("CowSkeletonSpawner", 5011).getInt();
            CowSquidSpawnerID = config.getItem("CowSquidSpawner", 5012).getInt();
            CowWitherSpawnerID = config.getItem("CowWitherSpawner", 5013).getInt();
            CowWitherSSpawnerID = config.getItem("CowWitherSSpawner", 5014).getInt();

            CopperIngotID = config.getItem("CopperIngot", 4100).getInt();
            TinIngotID = config.getItem("TinIngot", 4101).getInt();
            SilverIngotID = config.getItem("SilverIngot", 4102).getInt();
            GoldHandsawID = config.getItem("GoldHandsaw", 4103).getInt();
            DiamondHandsawID = config.getItem("DiamondHandsaw", 4104).getInt();
            GoldDoorItemID = config.getItem("GoldDoorItem", 4105).getInt();
            StructureBuilderID = config.getItem("StructureBuilder", 4106).getInt();
            LightningRodID = config.getItem("LightningRodID", 4107).getInt();

            SilverSwordID = config.getItem("SilverSword", 4200).getInt();
            SilverHoeID = config.getItem("SilverHoe", 4201).getInt();
            SilverShovelID = config.getItem("SilverShovel", 4202).getInt();
            SilverPickaxeID = config.getItem("SilverPickaxe", 4203).getInt();
            SilverAxeID = config.getItem("SilverAxe", 4204).getInt();
            SilverShickaxeID = config.getItem("SilverShickaxe", 4205).getInt();
            DiamondBigSwordID = config.getItem("DiamondBigSword", 4206).getInt();
            IronBigSwordID = config.getItem("IronBigSword", 4207).getInt();
            GoldBigSwordID = config.getItem("GoldBigSwordID", 4208).getInt();
            WoodBigSwordID = config.getItem("WoodBigSwordID", 4209).getInt();
            StoneBigSwordID = config.getItem("StoneBigSwordID", 4210).getInt();

            FlameSwordID = config.getItem("FlameSwordID", 4211).getInt();

            ItemBlueComparatorID = config.getItem("ItemBlueComparator", 4230).getInt();
            ItemBluestoneID = config.getItem("ItemBluestone", 4231).getInt();
            ItemBluestoneRepeaterID = config.getItem("ItemBluestoneRepeater", 4232).getInt();
            ChocolateBeanID = config.getItem("ChocolateBeanID", 4233).getInt();

            LightningBowID = config.getItem("LightningBow", 4250).getInt();
            LightningArrowID = config.getItem("LightningArrow", 4251).getInt();
            
            TNTBowID = config.getItem("TNTBow", 4252).getInt();
            TNTArrowID = config.getItem("TNTArrow", 4253).getInt();
            
            config.save();

    }
}
