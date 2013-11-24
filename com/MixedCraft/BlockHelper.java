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
	public static final Block Disasembler = new Disasembler(x.DisasemblerID).setUnlocalizedName("Disasembler").setCreativeTab(MixedCraft.BlockTab);	
	public static final Block IronFurnaceOff = (new BlockIronFurnace(x.IronFurnaceID, false)).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("IronFurnaceOff").setCreativeTab(MixedCraft.BlockTab);
	public static final Block IronFurnaceOn = (new BlockIronFurnace(x.IronFurnaceOnID, true)).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("IronFurnaceOn").setLightValue(0.875F);
	public static final Block GoldDoor = new BlockGoldDoor(x.GoldDoorID, Material.wood).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("GoldDoor").setCreativeTab(null);
	public static final Block Table = new BlockTable(x.TableID).setUnlocalizedName("Table").setStepSound(Block.soundWoodFootstep).setCreativeTab(MixedCraft.BlockTab);
	public static final Block DiamondFurnaceOff = (new BlockDiamondFurnace(x.DiamondFurnaceOffID, false)).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("DiamondFurnaceOff").setCreativeTab(MixedCraft.BlockTab);
	public static final Block DiamondFurnaceOn = (new BlockDiamondFurnace(x.DiamondFurnaceOnID, true)).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("DiamondFurnaceOn").setLightValue(0.875F);

    public static final ModBlock FlyLightPortal = (ModBlock) new ModBlock(x.BlueComparatorID).registerTexture("FlyLightPortal").setUnlocalizedName("FlyLightPortal").setBlockUnbreakable();
    public static final Block FlyLightGrass = new BlockFlyLightGrass(177).setHardness(1.5F).setUnlocalizedName("FlyLightGrass").setStepSound(Block.soundGrassFootstep);
    public static final Block FlyLightDirt = new ModDirt(178).registerTexture("FlyLightGrass_Bottom").setHardness(1.0F).setUnlocalizedName("FlyLightDirt").setStepSound(Block.soundGravelFootstep);
    public static final Block FlyLightStone = new ModBlock(x.BlueComparatorOnID).registerTexture("FlyLightStone").setHardness(6.0F).setUnlocalizedName("FlyLightStone").setStepSound(Block.soundStoneFootstep);
    public static final Block FlyLightOre = new ModBlock(x.BlueRepeaterID).registerTexture("FlyLightOre").setHardness(6.0F).setUnlocalizedName("FlyLightOre").setStepSound(Block.soundStoneFootstep);
    public static final Block ModFire = new ModFire(x.BlueRepeaterOnID).setHardness(6.0F).setUnlocalizedName("ModFire").setStepSound(Block.soundLadderFootstep).setCreativeTab(null);

	public static final Block Test = new ModBlock(x.BluestoneWireBlockID).registerTexture("Test").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("Flashing").setLightValue(0.875F);

	public static final Block House1 = new BlockHouse1(x.House1ID).setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("House1").setLightValue(0.875F);

    public static final Block SlowSand = new BlockSinkSand(x.BlueTorchOnID).setHardness(1.0F).setStepSound(Block.soundSandFootstep).setUnlocalizedName("SlowSand").setTextureName("sand");

    public static final Block ChocolateCake = new BlockChocolateCake(x.ChocolateCakeBlockID).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("ChocolateCake").setTextureName("ChocolateCake");
    public static final Block ChocolateCrop = new BlockChocolateCrop(x.ChocolateCropBlockID).setUnlocalizedName("ChocolateCrop").setTextureName("ChocolateCrop");
    
    public static final Block GoldFurnaceOff = new GoldFurnace(x.GoldFurnaceID, false).setUnlocalizedName("GoldFurnace").setCreativeTab(MixedCraft.BlockTab);
    public static final Block GoldFurnaceOn = new GoldFurnace(x.GoldFurnaceOnID, true).setUnlocalizedName("GoldFurnace").setCreativeTab(null);

    public static final PoisionOre poisonOre = (PoisionOre)new PoisionOre(x.poisonOreID).setUnlocalizedName("PoisionOre").setTextureName("MixedCraft:PoisonOre");
    
    public static final Block DoubleFurnace = new BlockDoubleFurnace(x.DoubleFurnaceOffID, false).setUnlocalizedName("DoubleFurnace").setCreativeTab(MixedCraft.BlockTab);
    public static final Block DoubleFurnaceOn = new BlockDoubleFurnace(x.DoubleFurnaceOnID, true).setUnlocalizedName("DoubleFurnace");
    
    //public static final Block Flower1 = new BlockMixedFlower(x.Flower1ID, "Flower1");
    
	public static void addNames(){  
		addBlock(DoubleFurnace, "Double Furnace");
		addBlock(DoubleFurnaceOn, "DoubleFurnace On");
		addBlock(GoldFurnaceOn, "Gold Furnace On");
		addBlock(GoldFurnaceOff, "Gold Furnace");
		addBlock(House1, EnumChatFormatting.DARK_GREEN + "Auto House: 1");
		addBlock(DiamondFurnaceOn, "Diamond Furnace On");
		addBlock(DiamondFurnaceOff, "Diamond Furnace");
		addBlock(Table, "Table");
		addBlock(GoldDoor, "Gold Door");
		addBlock(IronFurnaceOn, "Iron Furnace On");
		addBlock(IronFurnaceOff, "Iron Furnace");
		addBlock(Disasembler, "Dissasembler");
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
