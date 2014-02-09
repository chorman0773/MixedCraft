package com.MixedCraft;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

import com.MixedCraft.blocks.*;
import com.MixedCraft.blocks.tileEntity.TileEntityDiamondFurnace;
import com.MixedCraft.handler.HelperHandler;
import com.MixedCraft.helper.BlocksBase;
import com.MixedCraft.helper.ConfigHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHelper extends HelperHandler{



	public static final Block Extractor = new BlockDNAExtractor().setBlockName("Extractor").setHardness(2.0F);
	public static final Block Mixer = new BlockDNAMixer().setBlockName("Mixer").setHardness(2.0F);
	public static final Block Assembler = new BlockMobAssembler().setBlockName("Assembler").setHardness(2.0F);

	public static final Block CopperOre = new ModBlock().registerTexture("CopperOre").setBlockName("CopperOre").setHardness(7.0F);
	public static final Block BigCrafting = new BiggerCraftingTable().setBlockName("Craft").setStepSound(Block.soundTypeWood);
	public static final Block TinOre = new ModBlock().registerTexture("TinOre").setBlockName("TinOre").setHardness(7.0F);
	public static final Block CopperBlock = new ModBlock().registerTexture("CopperBlock").setBlockName("CopperBlock").setHardness(7.0F).setStepSound(Block.soundTypeMetal);
	public static final Block TinBlock = new ModBlock().registerTexture("TinBlock").setBlockName("TinBlock").setHardness(7.0F).setHardness(7.0F).setStepSound(Block.soundTypeMetal);	
	public static final Block SilverBlock = new ModBlock().registerTexture("SilverBlock").setBlockName("SilverBlock").setHardness(7.0F).setHardness(7.0F).setStepSound(Block.soundTypeMetal);
	public static final Block SilverOre = new ModBlock().registerTexture("SilverOre").setBlockName("SilverOre").setHardness(7.0F);	
	public static final BlockSolarPanel SolarPanel = (BlockSolarPanel) new BlockSolarPanel().setBlockName("SolarPanel").setHardness(2.0F).setHardness(7.0F).setStepSound(Block.soundTypeMetal);
	public static final Block CowSheepWool = new ModBlock().registerTexture("CowSheepWool").setBlockName("CowSheepWool").setHardness(0.2F).setStepSound(Block.soundTypeCloth);
	//public static final Block Disassembler = new Disassembler().setBlockName("Disasembler").setCreativeTab(MixedCraft.BlockTab);	
	public static final Block IronFurnaceOff = (new BlockIronFurnace(false)).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockName("IronFurnaceOff").setCreativeTab(MixedCraft.BlockTab);
	public static final Block IronFurnaceOn = (new BlockIronFurnace(true)).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockName("IronFurnaceOn").setLightLevel(0.875F);
	public static final Block GoldDoor = new BlockGoldDoor(Material.wood).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockName("GoldDoor").setCreativeTab(null);
	public static final Block Table = new BlockTable().setBlockName("Table").setStepSound(Block.soundTypeWood).setCreativeTab(MixedCraft.BlockTab);
	public static final Block DiamondFurnaceOff = (new BlockDiamondFurnace(false)).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockName("DiamondFurnaceOff").setCreativeTab(MixedCraft.BlockTab);
	public static final Block DiamondFurnaceOn = (new BlockDiamondFurnace(true)).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockName("DiamondFurnaceOn").setLightLevel(0.875F);

    public static final BlockFlylightPortal FlyLightPortal = (BlockFlylightPortal) new BlockFlylightPortal().registerTexture("FlyLightPortal").setBlockName("FlyLightPortal").setBlockUnbreakable();
    public static final Block FlyLightGrass = new BlockFlyLightGrass().setHardness(1.5F).setLightLevel(0.7F).setBlockName("FlyLightGrass").setStepSound(Block.soundTypeGrass);
    public static final Block FlyLightDirt = new ModDirt().registerTexture("FlyLightGrass_Bottom").setLightLevel(0.8F).setHardness(1.0F).setBlockName("FlyLightDirt").setStepSound(Block.soundTypeGravel);
    public static final Block FlyLightStone = new ModBlock().registerTexture("FlyLightStone").setHardness(3.0F).setLightLevel(0.6F).setBlockName("FlyLightStone").setStepSound(Block.soundTypeStone);
    public static final Block FlyLightOre = new ModBlock().registerTexture("FlyLightOre").setLightLevel(0.6F).setHardness(3.0F).setBlockName("FlyLightOre").setStepSound(Block.soundTypeStone);
    public static final Block ModFire = new ModFire().setHardness(6.0F).setBlockName("ModFire").setStepSound(Block.soundTypeMetal).setCreativeTab(MixedCraft.BlockTab);
	
	public static final Block Test = new ModBlock().registerTexture("Test").setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockName("Flashing").setLightLevel(0.875F);

	//public static final Block House1 = new BlockHouse1().setHardness(3.5F).setStepSound(Block.soundTypeMetal).setBlockName("House1").setLightLevel(0.875F);

    public static final Block SlowSand = new BlockSinkSand().setHardness(1.0F).setStepSound(Block.soundTypeSand).setBlockName("SlowSand").setBlockTextureName("sand");

    public static final Block ChocolateCake = new BlockChocolateCake().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("ChocolateCake").setBlockTextureName("ChocolateCake");
    public static final Block ChocolateCrop = new BlockChocolateCrop().setBlockName("ChocolateCrop").setBlockTextureName("ChocolateCrop");
    
    public static final Block GoldFurnaceOff = new GoldFurnace(false).setBlockName("GoldFurnace").setCreativeTab(MixedCraft.BlockTab);
    public static final Block GoldFurnaceOn = new GoldFurnacex.GoldFurnaceOnID, true).setBlockName("GoldFurnace").setCreativeTab(null);
    
    public static final Block Flower1 = new ModFlower(0, "FlyLightFlower_1").setBlockName("Flower1").setCreativeTab(MixedCraft.BlockTab);
    public static final Block Flower2 = new ModFlower(0, "FlyLightFlower_2").setBlockName("Flower2").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightLog = new ModLog("FlyLight").setBlockName("Log").setHardness(1.5F).setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightLeaves = new ModLeaves("FlyLight").setHardness(0.4F).setBlockName("Leaves").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightFern = new ModTallGrass("FlyLightFern").setBlockName("Fern").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightGrass = new ModTallGrass("FlyLightGrass").setBlockName("Grass").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightCane = new FlylightSugarCane().registerTexture("FlyLightSugarCane").setBlockName("Cane").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightSapling = new FlylightSapling("FlylightSapling").setBlockName("Sapling").setCreativeTab(MixedCraft.BlockTab);
    public static final Block Water = new ModWater().setBlockName("Water").setCreativeTab(MixedCraft.BlockTab);
    public static final Block Vine = new ModVine("Flylight").setBlockName("Vine").setCreativeTab(MixedCraft.BlockTab);
    
    public static final Block Iron = new ModOre().registerTexture("Iron").setHardness(3.0F).setBlockName("Iron");
    public static final Block Gold = new ModOre().registerTexture("Gold").setHardness(3.0F).setBlockName("Gold");
    public static final Block Lapis = new ModOre().registerTexture("Lapis").setHardness(3.0F).setBlockName("Lapis");
    public static final Block Redstone = new ModOre().registerTexture("Redstone").setHardness(3.0F).setBlockName("Redstone");
    public static final Block Diamond = new ModOre().registerTexture("Diamond").setHardness(3.0F).setBlockName("Diamond");
    public static final Block Coal = new ModOre().registerTexture("Coal").setHardness(3.0F).setBlockName("Coal");
    public static final Block Emerald = new ModOre().registerTexture("Emerald").setHardness(3.0F).setBlockName("Emerald"); 
    
    public static final Block PoweredFurnace = new BlockPoweredFurnace(false);
    public static final Block PoweredFurnaceOn = new BlockPoweredFurnace(true);
    
	public static void addNames(){
		OreDictionary.registerOre("oreCopper", CopperOre);
		OreDictionary.registerOre("oreTin", TinOre);
		OreDictionary.registerOre("oreSilver", SilverOre);
		OreDictionary.registerOre("oreFlyIron", Iron);
		OreDictionary.registerOre("oreFlyGold", Gold);
		OreDictionary.registerOre("oreFlyLapis", Lapis);
		OreDictionary.registerOre("oreFlyRedstone", Redstone);
		OreDictionary.registerOre("oreFlyDiamond", Diamond);
		OreDictionary.registerOre("oreFlyCoal", Coal);
		OreDictionary.registerOre("oreFlyEmerald", Emerald);

		addBlock(PoweredFurnace, "Powered Furnace");
		addBlock(PoweredFurnaceOn, "Powered Furnace On");
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
		//addBlock(Disassembler, "Disassembler");
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
}