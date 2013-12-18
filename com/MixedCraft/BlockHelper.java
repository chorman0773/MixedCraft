package com.MixedCraft;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.MinecraftForge;

import com.MixedCraft.blocks.*;
import com.MixedCraft.blocks.tileEntity.TileEntityDiamondFurnace;
import com.MixedCraft.handler.HelperHandler;
import com.MixedCraft.helper.BlocksBase;
import com.MixedCraft.helper.ConfigHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHelper extends HelperHandler{



	public static final Block Extractor = new BlockDNAExtractor(x.ExtractorID).setUnlocalizedName("Extractor").setHardness(2.0F);
	public static final Block Mixer = new BlockDNAMixer(x.MixerID).setUnlocalizedName("Mixer").setHardness(2.0F);
	public static final Block Assembler = new BlockMobAssembler(x.AssemblerID).setUnlocalizedName("Assembler").setHardness(2.0F);

	public static final Block CopperOre = new ModBlock(x.CopperOreID).registerTexture("CopperOre").setUnlocalizedName("CopperOre").setHardness(7.0F);
	public static final Block BigCrafting = new BiggerCraftingTable(x.CraftingID).setUnlocalizedName("Craft").setStepSound(Block.soundWoodFootstep);
	public static final Block TinOre = new ModBlock(x.TinOreID).registerTexture("TinOre").setUnlocalizedName("TinOre").setHardness(7.0F);
	public static final Block CopperBlock = new ModBlock(x.CopperBlockID).registerTexture("CopperBlock").setUnlocalizedName("CopperBlock").setHardness(7.0F).setStepSound(Block.soundMetalFootstep);
	public static final Block TinBlock = new ModBlock(x.TinBlockID).registerTexture("TinBlock").setUnlocalizedName("TinBlock").setHardness(7.0F).setHardness(7.0F).setStepSound(Block.soundMetalFootstep);	
	public static final Block SilverBlock = new ModBlock(x.SilverBlockID).registerTexture("SilverBlock").setUnlocalizedName("SilverBlock").setHardness(7.0F).setHardness(7.0F).setStepSound(Block.soundMetalFootstep);
	public static final Block SilverOre = new ModBlock(x.SilverOreID).registerTexture("SilverOre").setUnlocalizedName("SilverOre").setHardness(7.0F);	
	public static final BlockSolarPanel SolarPanel = (BlockSolarPanel) new BlockSolarPanel(x.SolarPanelID).setUnlocalizedName("SolarPanel").setHardness(2.0F).setHardness(7.0F).setStepSound(Block.soundMetalFootstep);
	public static final Block CowSheepWool = new ModBlock(x.CowSheepWoolID).registerTexture("CowSheepWool").setUnlocalizedName("CowSheepWool").setHardness(0.2F).setStepSound(Block.soundClothFootstep);
	//public static final Block Disasembler = new Disasembler(x.DisasemblerID).setUnlocalizedName("Disasembler").setCreativeTab(MixedCraft.BlockTab);	
	public static final Block IronFurnaceOff = (new BlockIronFurnace(x.IronFurnaceID, false)).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("IronFurnaceOff").setCreativeTab(MixedCraft.BlockTab);
	public static final Block IronFurnaceOn = (new BlockIronFurnace(x.IronFurnaceOnID, true)).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("IronFurnaceOn").setLightValue(0.875F);
	public static final Block GoldDoor = new BlockGoldDoor(x.GoldDoorID, Material.wood).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("GoldDoor").setCreativeTab(null);
	public static final Block Table = new BlockTable(x.TableID).setUnlocalizedName("Table").setStepSound(Block.soundWoodFootstep).setCreativeTab(MixedCraft.BlockTab);
	public static final Block DiamondFurnaceOff = (new BlockDiamondFurnace(x.DiamondFurnaceOffID, false)).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("DiamondFurnaceOff").setCreativeTab(MixedCraft.BlockTab);
	public static final Block DiamondFurnaceOn = (new BlockDiamondFurnace(x.DiamondFurnaceOnID, true)).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("DiamondFurnaceOn").setLightValue(0.875F);

    public static final BlockFlylightPortal FlyLightPortal = (BlockFlylightPortal) new BlockFlylightPortal(x.FlylightPortalID).registerTexture("FlyLightPortal").setUnlocalizedName("FlyLightPortal").setBlockUnbreakable();
    public static final Block FlyLightGrass = new BlockFlyLightGrass(177).setHardness(1.5F).setLightValue(0.7F).setUnlocalizedName("FlyLightGrass").setStepSound(Block.soundGrassFootstep);
    public static final Block FlyLightDirt = new ModDirt(178).registerTexture("FlyLightGrass_Bottom").setLightValue(0.8F).setHardness(1.0F).setUnlocalizedName("FlyLightDirt").setStepSound(Block.soundGravelFootstep);
    public static final Block FlyLightStone = new ModBlock(179).registerTexture("FlyLightStone").setHardness(3.0F).setLightValue(0.6F).setUnlocalizedName("FlyLightStone").setStepSound(Block.soundStoneFootstep);
    public static final Block FlyLightOre = new ModBlock(x.BlueRepeaterID).registerTexture("FlyLightOre").setLightValue(0.6F).setHardness(3.0F).setUnlocalizedName("FlyLightOre").setStepSound(Block.soundStoneFootstep);
    public static final Block ModFire = new ModFire(x.BlueRepeaterOnID).setHardness(6.0F).setUnlocalizedName("ModFire").setStepSound(Block.soundLadderFootstep).setCreativeTab(MixedCraft.BlockTab);
	
	public static final Block Test = new ModBlock(x.ColourID).registerTexture("Test").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("Flashing").setLightValue(0.875F);

	//public static final Block House1 = new BlockHouse1(x.House1ID).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("House1").setLightValue(0.875F);

    public static final Block SlowSand = new BlockSinkSand(x.SlowSandID).setHardness(1.0F).setStepSound(Block.soundSandFootstep).setUnlocalizedName("SlowSand").setTextureName("sand");

    public static final Block ChocolateCake = new BlockChocolateCake(x.ChocolateCakeBlockID).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("ChocolateCake").setTextureName("ChocolateCake");
    public static final Block ChocolateCrop = new BlockChocolateCrop(x.ChocolateCropBlockID).setUnlocalizedName("ChocolateCrop").setTextureName("ChocolateCrop");
    
    public static final Block GoldFurnaceOff = new GoldFurnace(x.GoldFurnaceID, false).setUnlocalizedName("GoldFurnace").setCreativeTab(MixedCraft.BlockTab);
    public static final Block GoldFurnaceOn = new GoldFurnace(x.GoldFurnaceOnID, true).setUnlocalizedName("GoldFurnace").setCreativeTab(null);
    
    public static final Block Flower1 = new ModFlower(x.Flower1, "FlyLightFlower_1").setUnlocalizedName("Flower1").setCreativeTab(MixedCraft.BlockTab);
    public static final Block Flower2 = new ModFlower(x.Flower2, "FlyLightFlower_2").setUnlocalizedName("Flower2").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightLog = new ModLog(x.FlylightLog, "FlyLight").setUnlocalizedName("Log").setHardness(1.5F).setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightLeaves = new ModLeaves(x.FlylightLeaves, "FlyLight").setHardness(0.4F).setUnlocalizedName("Leaves").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightFern = new ModTallGrass(x.Fern, "FlyLightFern").setUnlocalizedName("Fern").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightGrass = new ModTallGrass(x.Grass, "FlyLightGrass").setUnlocalizedName("Grass").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightCane = new FlylightSugarCane(x.SugarCane).registerTexture("FlyLightSugarCane").setUnlocalizedName("Cane").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightSapling = new FlylightSapling(x.Sapling, "FlylightSapling").setUnlocalizedName("Sapling").setCreativeTab(MixedCraft.BlockTab);
    public static final Block Water = new ModWater(x.ModWater).setUnlocalizedName("Water").setCreativeTab(MixedCraft.BlockTab);
    public static final Block Vine = new ModVine(x.Vine, "Flylight").setUnlocalizedName("Vine").setCreativeTab(MixedCraft.BlockTab);
    
    public static final Block Iron = new ModOre(x.Iron).registerTexture("Iron").setHardness(3.0F).setUnlocalizedName("Iron");
    public static final Block Gold = new ModOre(x.Gold).registerTexture("Gold").setHardness(3.0F).setUnlocalizedName("Gold");
    public static final Block Lapis = new ModOre(x.Lapis).registerTexture("Lapis").setHardness(3.0F).setUnlocalizedName("Lapis");
    public static final Block Redstone = new ModOre(x.Redstone).registerTexture("Redstone").setHardness(3.0F).setUnlocalizedName("Redstone");
    public static final Block Diamond = new ModOre(x.Diamond).registerTexture("Diamond").setHardness(3.0F).setUnlocalizedName("Diamond");
    public static final Block Coal = new ModOre(x.Coal).registerTexture("Coal").setHardness(3.0F).setUnlocalizedName("Coal");
    public static final Block Emerald = new ModOre(x.Emerald).registerTexture("Emerald").setHardness(3.0F).setUnlocalizedName("Emerald"); 
    
	public static void addNames(){
		addBlock(Iron, "Flylight Iron Ore");
		addBlock(Gold, "Flylight Gold Ore");
		addBlock(Lapis, "Flylight Lapis Ore");
		addBlock(Redstone, "Flylight Redstone Ore");
		addBlock(Diamond, "Flylight Diamond Ore");
		addBlock(Coal, "Flylight Coal Ore");
		addBlock(Emerald, "Flylight Emerald Ore");
		addBlock(Vine, "Vine");
		addBlock(Water, "Flylight Water");
		addBlock(Flower1, "Flylight Flower");
		addBlock(Flower2, "Flylight Flower 2");
		addBlock(FlylightLog, "Flylight Log");
		addBlock(FlylightLeaves, "Flylight Leaves");
		addBlock(FlylightFern, "Flylight Fern");
		addBlock(FlylightGrass, "Flylight Tall Grass");
		addBlock(FlylightCane, "Flylight SugarCane");
		addBlock(FlylightSapling, "Flylight Sapling");
		//addBlock(DoubleFurnace, "Double Furnace");
		//addBlock(DoubleFurnaceOn, "DoubleFurnace On");
		addBlock(GoldFurnaceOn, "Gold Furnace On");
		addBlock(GoldFurnaceOff, "Gold Furnace");
		//addBlock(House1, EnumChatFormatting.DARK_GREEN + "Auto House: 1");
		addBlock(DiamondFurnaceOn, "Diamond Furnace On");
		addBlock(DiamondFurnaceOff, "Diamond Furnace");
		addBlock(Table, "Table");
		addBlock(GoldDoor, "Gold Door");
		addBlock(IronFurnaceOn, "Iron Furnace On");
		addBlock(IronFurnaceOff, "Iron Furnace");
		//addBlock(Disasembler, "Dissasembler");
		addBlock(CowSheepWool, "COWSHEEP Wool");
		addBlock(SolarPanel, "Solar Panel");
		addBlock(Extractor, "DNA Extractor");
		addBlock(Mixer, "DNA Mixer");
		addBlock(Assembler, "Mob Assembler");
		addBlock(CopperOre, "Copper Ore");
		addBlock(BigCrafting, "Big Crafting Table");
		addBlock(TinOre, "Tin Ore");
		addBlock(CopperBlock, "Copper Block");
		addBlock(TinBlock, "Tin Block");
		addBlock(SilverOre, "Silver Ore");
		addBlock(SilverBlock, "Silver Block");	 
		addBlock(FlyLightGrass, "Flylight Grass");
		addBlock(FlyLightDirt, "Flylight Dirt");
		addBlock(Test, "Colourful Block");
		addBlock(FlyLightOre, "Flylight Ore");
		addBlock(FlyLightPortal, "Flylight Portal");
		addBlock(FlyLightStone, "Flylight Stone");
		addBlock(SlowSand, "Sink Sand");
	}

	public static void addName(String par1, String name)
	{
		LanguageRegistry.instance().addStringLocalization("tile." + par1 + ".name", name);
	}

}
