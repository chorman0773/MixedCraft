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



	public static final Block Extractor = new BlockDNAExtractor().setName("Extractor");
	public static final Block Mixer = new BlockDNAMixer().setName("Mixer");
	public static final Block Assembler = new BlockMobAssembler().setName("Assembler");

	public static final Block CopperOre = new ModBlock().setName("CopperOre").setHardness(7.0F);
	public static final Block BigCrafting = new BiggerCraftingTable().setName("BigCraftingTable");
	public static final Block TinOre = new ModBlock().setName("TinOre").setHardness(7.0F);
	public static final Block CopperBlock = new ModBlock().setName("CopperBlock").setHardness(7.0F).setStepSound(Block.soundTypeMetal);
	public static final Block TinBlock = new ModBlock().setName("TinBlock").setHardness(7.0F).setStepSound(Block.soundTypeMetal);	
	public static final Block SilverBlock = new ModBlock().setName("SilverBlock").setHardness(7.0F).setStepSound(Block.soundTypeMetal);
	public static final Block SilverOre = new ModBlock().setName("SilverOre").setHardness(7.0F);	
	public static final Block SolarPanel = new BlockSolarPanel().setName("SolarPanel").setHardness(2.0F);
	public static final Block CowSheepWool = new ModBlock().setName("CowSheepWool").setHardness(0.2F).setStepSound(Block.soundTypeCloth);
	//public static final Block Disassembler = new Disassembler().setName("Disasembler").setCreativeTab(MixedCraft.BlockTab);	
	public static final Block IronFurnaceOff = (new BlockIronFurnace(false)).setName("IronFurnaceOff").setCreativeTab(MixedCraft.BlockTab);
	public static final Block IronFurnaceOn = (new BlockIronFurnace(true)).setName("IronFurnaceOn").setLightLevel(0.875F);
	public static final Block GoldDoor = new BlockGoldDoor(Material.wood).setName("GoldDoor").setCreativeTab(null);
	public static final Block Table = new BlockTable().setName("Table");
	public static final Block DiamondFurnaceOff = (new BlockDiamondFurnace(false)).setName("DiamondFurnaceOff").setCreativeTab(MixedCraft.BlockTab);
	public static final Block DiamondFurnaceOn = (new BlockDiamondFurnace(true)).setName("DiamondFurnaceOn").setLightLevel(0.875F);

    public static final BlockFlylightPortal FlyLightPortal = (BlockFlylightPortal) new BlockFlylightPortal().setName("FlyLightPortal").setBlockUnbreakable();
    public static final Block FlyLightGrass = new BlockFlyLightGrass().setName("FlyLightGrass").setStepSound(Block.soundTypeGrass);
    public static final Block FlyLightDirt = new ModDirt().setName("FlyLightDirt").setLightLevel(0.8F).setHardness(1.0F).setStepSound(Block.soundTypeGravel);
    public static final Block FlyLightStone = new ModBlock().setName("FlyLightStone").setHardness(3.0F).setLightLevel(0.6F).setStepSound(Block.soundTypeStone);
    public static final Block FlyLightOre = new ModBlock().setName("FlyLightOre").setLightLevel(0.6F).setHardness(3.0F).setStepSound(Block.soundTypeStone);
    public static final Block ModFire = new ModFire().setName("ModFire").setHardness(6.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(MixedCraft.BlockTab);
	
	public static final Block Test = new ModBlock().setName("Flashing").setHardness(3.5F).setStepSound(Block.soundTypeMetal).setLightLevel(0.875F);
	//public static final Block House1 = new BlockHouse1().setHardness(3.5F).setStepSound(Block.soundTypeMetal).setName("House1").setLightLevel(0.875F);
    public static final Block SlowSand = new BlockSinkSand().setName("SlowSand");

    public static final Block ChocolateCake = new BlockChocolateCake().setName("chocolateCake").setHardness(0.5F).setStepSound(Block.soundTypeCloth);
    public static final Block ChocolateCrop = new BlockChocolateCrop().setName("ChocolateCrop").setBlockTextureName("ChocolateCrop");
    
    public static final Block GoldFurnaceOff = new GoldFurnace(false).setName("GoldFurnace").setCreativeTab(MixedCraft.BlockTab);
    public static final Block GoldFurnaceOn = new GoldFurnace(true).setName("GoldFurnace").setCreativeTab(null);
    
    public static final Block Flower1 = new ModFlower().setName("flylightFlower_1");
    public static final Block Flower2 = new ModFlower().setName("flylightFlower_2");
    public static final Block FlylightLog = new ModLog().setName("flylightLog").setHardness(1.5F).setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightLeaves = new ModLeaves().setName("flylightLeaves").setHardness(0.4F).setCreativeTab(MixedCraft.BlockTab);
    public static final Block FlylightFern = new ModTallGrass().setName("fern");
    public static final Block FlylightGrass = new ModTallGrass().setName("flylightGrass");
    public static final Block FlylightCane = new FlylightSugarCane().setName("flylightSugarCane");
    public static final Block FlylightSapling = new FlylightSapling().setName("flylightSapling");
    public static final Block Water = new ModWater().setName("flylightWater");
    public static final Block Vine = new ModVine().setName("flylightVine");
    
    public static final Block Iron = new ModOre().setName("ironOre");
    public static final Block Gold = new ModOre().setName("goldOre");
    public static final Block Lapis = new ModOre().setName("lapisOre");
    public static final Block Redstone = new ModOre().setName("redstoneOre");
    public static final Block Diamond = new ModOre().setName("diamondOre");
    public static final Block Coal = new ModOre().setName("coalOre");
    public static final Block Emerald = new ModOre().setName("emeraldOre"); 
    
    public static final Block PoweredFurnace = new BlockPoweredFurnace(false).setName("powerFurnace");
    public static final Block PoweredFurnaceOn = new BlockPoweredFurnace(true).setName("powerFurnaceOn");
    
    public static final Block windmill = new BlockWindmill().setName("windmillBlock");
    public static final Block windmillBase = new BlockMindmillBase().setName("windmillBase");
    
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