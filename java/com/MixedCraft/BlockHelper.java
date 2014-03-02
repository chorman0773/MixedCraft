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



	public static final Block Extractor = new BlockDNAExtractor().setName("Extractor").setHardness(2.0F);
	public static final Block Mixer = new BlockDNAMixer().setName("Mixer").setHardness(2.0F);
	public static final Block Assembler = new BlockMobAssembler().setName("Assembler").setHardness(2.0F);

	public static final Block CopperOre = new ModBlock().setName("CopperOre").setHardness(7.0F);
	public static final Block BigCrafting = new BiggerCraftingTable().setName("BigCraftingTable");
	public static final Block TinOre = new ModBlock().setName("TinOre").setHardness(7.0F);
	public static final Block CopperBlock = new ModBlock().setName("CopperBlock").setHardness(7.0F).setStepSound(Block.soundTypeMetal);
	public static final Block TinBlock = new ModBlock().setName("TinBlock").setHardness(7.0F).setStepSound(Block.soundTypeMetal);	
	public static final Block SilverBlock = new ModBlock().setName("SilverBlock").setHardness(7.0F).setStepSound(Block.soundTypeMetal);
	public static final Block SilverOre = new ModBlock().setName("SilverOre").setHardness(7.0F);	
	public static final BlockSolarPanel SolarPanel = (BlockSolarPanel) new BlockSolarPanel().setName("SolarPanel").setHardness(2.0F);
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
    public static final Block SlowSand = new BlockSinkSand().setName("SlowSand");

    public static final Block ChocolateCake = new BlockChocolateCake().setName("chocolateCake").setHardness(0.5F).setStepSound(Block.soundTypeCloth);
    public static final Block ChocolateCrop = new BlockChocolateCrop().setBlockName("ChocolateCrop").setBlockTextureName("ChocolateCrop");
    
    public static final Block GoldFurnaceOff = new GoldFurnace(false).setBlockName("GoldFurnace").setCreativeTab(MixedCraft.BlockTab);
    public static final Block GoldFurnaceOn = new GoldFurnace(true).setBlockName("GoldFurnace").setCreativeTab(null);
    
    public static final Block Flower1 = new ModFlower("FlyLightFlower_1").setBlockName("Flower1");
    public static final Block Flower2 = new ModFlower("FlyLightFlower_2").setBlockName("Flower2");
    public static final Block FlylightLog = new ModLog("FlyLight").setBlockName("Log").setHardness(1.5F).setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightLeaves = new ModLeaves("FlyLight").setHardness(0.4F).setBlockName("Leaves").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightFern = new ModTallGrass("FlyLightFern").setBlockName("Fern").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightGrass = new ModTallGrass("FlyLightGrass").setBlockName("Grass").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightCane = new FlylightSugarCane().registerTexture("FlyLightSugarCane").setBlockName("Cane").setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightSapling = new FlylightSapling("FlylightSapling").setBlockName("Sapling").setCreativeTab(MixedCraft.BlockTab);
    public static final Block Water = new ModWater().setBlockName("Water").setCreativeTab(MixedCraft.BlockTab);
    public static final Block Vine = new ModVine().setName("FlylightVine").setCreativeTab(MixedCraft.BlockTab);
    
    public static final Block Iron = new ModOre().setName("Iron");
    public static final Block Gold = new ModOre().setName("Gold");
    public static final Block Lapis = new ModOre().setName("Lapis");
    public static final Block Redstone = new ModOre().setName("Redstone");
    public static final Block Diamond = new ModOre().setName("Diamond");
    public static final Block Coal = new ModOre().setName("Coal");
    public static final Block Emerald = new ModOre().setName("Emerald"); 
    
    public static final Block PoweredFurnace = new BlockPoweredFurnace(false);
    public static final Block PoweredFurnaceOn = new BlockPoweredFurnace(true);
    
    public static final Block windmill = new BlockWindmill().setName("windmillBlock");
    
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
	}
}