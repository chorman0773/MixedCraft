package com.MixedCraft.recipes;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.ItemHelper;
import com.MixedCraft.helper.RecipeRemover;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHelper {
	 
	public static void init(){
		Shaped();
		Shapeless();
		Smelting();
		BigShapedCrafting();
		BigShapelessCrafting();
	}
	
	static ItemStack s;
	static ItemStack b;
	
	public static void Shaped(){
				
		GameRegistry.addRecipe(new ItemStack(ItemHelper.FlashDrive, 1), new Object[] {" TT", "ICT", "II ", 'T', ItemHelper.TinIngot,'C', ItemHelper.CopperIngot, 'I', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(BlockHelper.SolarPanel, 1), new Object[] {"TCT", "IRI", "III", 'T', ItemHelper.TinIngot,'C', ItemHelper.CopperIngot, 'I', Block.blockIron, 'R', Item.redstone});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.GoldHandsaw, 1), new Object[] {"SSS", "GGS", "   ", 'S', Item.stick, 'G', Item.ingotGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.DiamondHandsaw, 1), new Object[] {"SSS", "GGS", "   ", 'S', Item.stick, 'G', Item.diamond});
		GameRegistry.addRecipe(new ItemStack(BlockHelper.Extractor, 1), new Object[] {"CGC", "TWT", "CTC", 'T', ItemHelper.TinIngot, 'C', ItemHelper.CopperIngot, 'W', Block.workbench, 'G', ItemHelper.GoldHandsaw});
		GameRegistry.addRecipe(new ItemStack(BlockHelper.Mixer, 1), new Object[] {"CEC", "TDT", "TET", 'T', Block.whiteStone, 'C', ItemHelper.CopperIngot, 'D', Item.diamond, 'E', Item.eyeOfEnder});
		GameRegistry.addRecipe(new ItemStack(BlockHelper.Assembler, 1), new Object[] {"GDG", "IEI", "GIG", 'D', ItemHelper.DiamondHandsaw, 'G', Item.ingotGold, 'E', Item.enderPearl, 'I', Item.ingotIron});

		GameRegistry.addRecipe(new ItemStack(ItemHelper.SilverAxe, 1), new Object[] {"II ", "IS ", " S ", 'I', ItemHelper.SilverIngot,'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.SilverHoe, 1), new Object[] {"II ", " S ", " S ", 'I', ItemHelper.SilverIngot,'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.SilverPickaxe, 1), new Object[] {"III", " S ", " S ", 'I', ItemHelper.SilverIngot,'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.SilverShovel, 1), new Object[] {" I ", " S ", " S ", 'I', ItemHelper.SilverIngot,'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.SilverSword, 1), new Object[] {" I ", " I ", " S ", 'I', ItemHelper.SilverIngot,'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.LightningArrow, 20), new Object[] {"D", "S", "F", 'D', Item.diamond,'S', Item.stick, 'F', Item.feather});

		GameRegistry.addRecipe(new ItemStack(ItemHelper.TNTArrow, 10), new Object[] {"D", "S", "F", 'D', Block.tnt,'S', Item.stick, 'F', Item.feather});
		
		GameRegistry.addRecipe(new ItemStack(BlockHelper.SilverBlock, 1), new Object[] {"III", "III", "III", 'I', ItemHelper.SilverIngot});
		GameRegistry.addRecipe(new ItemStack(BlockHelper.TinBlock, 1), new Object[] {"III", "III", "III", 'I', ItemHelper.TinIngot});
		GameRegistry.addRecipe(new ItemStack(BlockHelper.CopperBlock, 1), new Object[] {"III", "III", "III", 'I', ItemHelper.CopperIngot});
		GameRegistry.addRecipe(new ItemStack(BlockHelper.BigCrafting, 1), new Object[] {"III", "III", "III", 'I', Block.workbench});
		GameRegistry.addRecipe(new ItemStack(BlockHelper.IronFurnaceOff, 1), new Object[] {"III", "I I", "III", 'I', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(BlockHelper.DiamondFurnaceOff, 1), new Object[] {"III", "I I", "III", 'I', Item.diamond});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.GoldDoor, 1), new Object[] {"II", "II", "II", 'I', Item.ingotGold});

		GameRegistry.addRecipe(new ItemStack(ItemHelper.ChocalateCake, 1), new Object[] {"CCC", "ESE", "MMM", 'C', ItemHelper.ChocolateBean, 'E', Item.egg, 'M', Item.bucketMilk, 'S', Item.sugar});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.DiamondBigSword, 1), new Object[] {" DD", "DDD", "SD ", 'S', Item.stick, 'D', Item.diamond});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.IronBigSword, 1), new Object[] {" DD", "DDD", "SD ", 'S', Item.stick, 'D', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.GoldBigSword, 1), new Object[] {" DD", "DDD", "SD ", 'S', Item.stick, 'D', Item.ingotGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.StoneBigSword, 1), new Object[] {" DD", "DDD", "SD ", 'S', Item.stick, 'D', Block.cobblestone});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.WoodBigSword, 1), new Object[] {" DD", "DDD", "SD ", 'S', Item.stick, 'D', Block.planks});

		s = new ItemStack(Item.skull);
		s.setItemDamage(1);
		
		b = new ItemStack(Item.dyePowder);
		b.setItemDamage(15);
		
		GameRegistry.addRecipe(new ItemStack(ItemHelper.wandDeath, 1), new Object[] {"S", "I", "I", 'S', s, 'I', Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.wandFire, 1), new Object[] {"S", "I", "I", 'S', Item.blazeRod, 'I', Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.wandGrowth, 1), new Object[] {"S", "I", "I", 'S', b, 'I', Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.wandHarming, 1), new Object[] {"S", "I", "I", 'S', Item.redstone, 'I', Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.wandHarvest, 1), new Object[] {"S", "I", "I", 'S', Item.hoeDiamond, 'I', Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.wandHealing, 1), new Object[] {"S", "I", "I", 'S', Item.ghastTear, 'I', Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.wandIce, 1), new Object[] {"S", "I", "I", 'S', Block.ice, 'I', Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.wandMissile, 1), new Object[] {"S", "B", "I", 'S', Item.arrow, 'B', Item.bow, 'I', Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.wandMining, 1), new Object[] {"S", "I", "I", 'S', Item.pickaxeDiamond, 'I', Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.wandTeleport, 1), new Object[] {"S", "I", "I", 'S', Item.eyeOfEnder, 'I', Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(ItemHelper.Wand, 1), new Object[] {"S", "G", "I", 'S', Item.feather, 'I', Block.blockDiamond, 'G', Block.blockGold});
		GameRegistry.addRecipe(new ItemStack(Block.furnaceIdle, 1), new Object[] {"SSS", "S S", "SSS", 'S', BlockHelper.FlyLightStone});
		GameRegistry.addRecipe(new ItemStack(Item.stick, 16), new Object[] {"L", "L", 'L', BlockHelper.FlylightLog});
	}

	public static void BigShapedCrafting(){
		
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(Item.bow, 1), new Object[] {" II", "I S", "I S", "I S", " II", 'I', Item.stick, 'S', Item.silk});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.TNTBow, 1), new Object[] {" II", "I S", "I S", "I S", " II", 'I', Block.tnt, 'S', Item.silk});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.LightningBow, 1), new Object[] {" II", "I S", "I S", "I S", " II", 'I', Item.diamond, 'S', Item.silk});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.CopperBlock, 1), new Object[] {"III", "III", "III", 'I', ItemHelper.CopperIngot});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.SilverBlock, 1), new Object[] {"III", "III", "III", 'I', ItemHelper.SilverIngot});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.TinBlock, 1), new Object[] {"III", "III", "III", 'I', ItemHelper.TinIngot});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.Table, 1), new Object[] {"III", "III", "I I", "I I", "I I", 'I',  Block.planks});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.LightningRod, 1), new Object[] {"DBD", "DBD", "DBD", "DBD", "DBD", 'B',  Item.blazeRod, 'D', Item.diamond});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.FlameSword, 1), new Object[] {"PRP", "PRP", "PRP", "DBD", "PBP", 'B',  Item.blazeRod, 'D', Item.diamond, 'P', Item.blazePowder, 'R', Item.redstone});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(Item.saddle, 1), new Object[] {" S ", "LLL", "LLL", "LLL", " S ", 'L', Item.leather, 'S', Item.silk});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.ChocalateCake, 1), new Object[] {"CCC", "ESE", "MMM", 'C', ItemHelper.ChocolateBean, 'E', Item.egg, 'M', Item.bucketMilk, 'S', Item.sugar});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(Block.blockDiamond, 1), new Object[] {"III", "III", "III", 'I', Item.diamond});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(Block.blockIron, 1), new Object[] {"III", "III", "III", 'I', Item.ingotIron});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(Block.blockGold, 1), new Object[] {"III", "III", "III", 'I', Item.ingotGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(Block.blockEmerald, 1), new Object[] {"III", "III", "III", 'I', Item.emerald});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.DiamondBigSword, 1), new Object[] {" DD", "DDD", "SD ", 'S', Item.stick, 'D', Item.diamond});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.IronBigSword, 1), new Object[] {" DD", "DDD", "SD ", 'S', Item.stick, 'D', Item.ingotIron});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.GoldBigSword, 1), new Object[] {" DD", "DDD", "SD ", 'S', Item.stick, 'D', Item.ingotGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.StoneBigSword, 1), new Object[] {" DD", "DDD", "SD ", 'S', Item.stick, 'D', Block.cobblestone});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.WoodBigSword, 1), new Object[] {" DD", "DDD", "SD ", 'S', Item.stick, 'D', Block.planks});
	
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.FlashDrive, 1), new Object[] {" TT", "ICT", "II ", 'T', ItemHelper.TinIngot,'C', ItemHelper.CopperIngot, 'I', Item.ingotIron});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.SolarPanel, 1), new Object[] {"TCT", "IRI", "III", 'T', ItemHelper.TinIngot,'C', ItemHelper.CopperIngot, 'I', Block.blockIron, 'R', Item.redstone});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.GoldHandsaw, 1), new Object[] {"SSS", "GGS", 'S', Item.stick, 'G', Item.ingotGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.DiamondHandsaw, 1), new Object[] {"SSS", "GGS", 'S', Item.stick, 'G', Item.diamond});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.Extractor, 1), new Object[] {"CGC", "TWT", "CTC", 'T', ItemHelper.TinIngot, 'C', ItemHelper.CopperIngot, 'W', Block.workbench, 'G', ItemHelper.GoldHandsaw});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.Mixer, 1), new Object[] {"CEC", "TDT", "TET", 'T', Block.whiteStone, 'C', ItemHelper.CopperIngot, 'D', Item.diamond, 'E', Item.eyeOfEnder});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.Assembler, 1), new Object[] {"GDG", "IEI", "GIG", 'D', ItemHelper.DiamondHandsaw, 'G', Item.ingotGold, 'E', Item.enderPearl, 'I', Item.ingotIron});

		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.SilverAxe, 1), new Object[] {"II ", "IS ", " S ", 'I', ItemHelper.SilverIngot,'S', Item.stick});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.SilverHoe, 1), new Object[] {"II ", " S ", " S ", 'I', ItemHelper.SilverIngot,'S', Item.stick});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.SilverPickaxe, 1), new Object[] {"III", " S ", " S ", 'I', ItemHelper.SilverIngot,'S', Item.stick});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.SilverShovel, 1), new Object[] {" I ", " S ", " S ", 'I', ItemHelper.SilverIngot,'S', Item.stick});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.SilverSword, 1), new Object[] {" I ", " I ", " S ", 'I', ItemHelper.SilverIngot,'S', Item.stick});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.LightningArrow, 20), new Object[] {"D", "S", "F", 'D', Item.diamond,'S', Item.stick, 'F', Item.feather});
		
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.TNTArrow, 10), new Object[] {"D", "S", "F", 'D', Block.tnt,'S', Item.stick, 'F', Item.feather});
		
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.SilverBlock, 1), new Object[] {"III", "III", "III", 'I', ItemHelper.SilverIngot});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.TinBlock, 1), new Object[] {"III", "III", "III", 'I', ItemHelper.TinIngot});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.CopperBlock, 1), new Object[] {"III", "III", "III", 'I', ItemHelper.CopperIngot});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.BigCrafting, 1), new Object[] {"III", "III", "III", 'I', Block.workbench});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.IronFurnaceOff, 1), new Object[] {"III", "I I", "III", 'I', Item.ingotIron});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(BlockHelper.DiamondFurnaceOff, 1), new Object[] {"III", "I I", "III", 'I', Item.diamond});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.GoldDoor, 1), new Object[] {"II", "II", "II", 'I', Item.ingotGold});
	
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.wandDeath, 1), new Object[] {"S", "I", "I", 'S', new ItemStack(Item.skull.itemID, 1, 1), 'I', Block.blockGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.wandFire, 1), new Object[] {"S", "I", "I", 'S', Item.blazeRod, 'I', Block.blockGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.wandGrowth, 1), new Object[] {"S", "I", "I", 'S', new ItemStack(Item.dyePowder, 1, 15), 'I', Block.blockGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.wandHarming, 1), new Object[] {"S", "I", "I", 'S', Item.redstone, 'I', Block.blockGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.wandHarvest, 1), new Object[] {"S", "I", "I", 'S', Item.hoeDiamond, 'I', Block.blockGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.wandHealing, 1), new Object[] {"S", "I", "I", 'S', Item.ghastTear, 'I', Block.blockGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.wandIce, 1), new Object[] {"S", "I", "I", 'S', Block.ice, 'I', Block.blockGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.wandMissile, 1), new Object[] {"S", "B", "I", 'S', Item.arrow, 'B', Item.bow, 'I', Block.blockGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.wandMining, 1), new Object[] {"S", "I", "I", 'S', Item.pickaxeDiamond, 'I', Block.blockGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(ItemHelper.wandTeleport, 1), new Object[] {"S", "I", "I", 'S', Item.eyeOfEnder, 'I', Block.blockGold});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(Block.furnaceIdle, 1), new Object[] {"SSS", "S S", "SSS", 'S', BlockHelper.FlyLightStone});
		CraftingBigManager.getInstance().addShapedRecipe(new ItemStack(Item.stick, 16), new Object[] {"L", "L", 'L', BlockHelper.FlylightLog});
	}

	public static void BigShapelessCrafting(){
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(Block.ice, 1), new Object[] {Item.bucketWater, Item.bucketWater, Item.bucketWater, Item.bucketWater});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(ItemHelper.CopperIngot, 9), new Object[] {BlockHelper.CopperBlock});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(ItemHelper.SilverIngot, 9), new Object[] {BlockHelper.SilverBlock});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(ItemHelper.TinIngot, 9), new Object[] {BlockHelper.TinBlock});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(ItemHelper.SilverShickaxe, 1), new Object[] {ItemHelper.SilverAxe, ItemHelper.SilverHoe, ItemHelper.SilverPickaxe, ItemHelper.SilverShovel, ItemHelper.SilverSword, Block.blockDiamond});
	}

	public static void Shapeless(){
		GameRegistry.addShapelessRecipe(new ItemStack(Block.ice, 1), new Object[] {Item.bucketWater, Item.bucketWater, Item.bucketWater, Item.bucketWater});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHelper.CopperIngot, 9), new Object[] {BlockHelper.CopperBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHelper.TinIngot, 9), new Object[] {BlockHelper.TinBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHelper.SilverIngot, 9), new Object[] {BlockHelper.SilverBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHelper.SilverShickaxe, 1), new Object[] {ItemHelper.SilverAxe, ItemHelper.SilverHoe, ItemHelper.SilverPickaxe, ItemHelper.SilverShovel, ItemHelper.SilverSword ,Block.blockDiamond});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHelper.ChocolateBean, 1), new Object[] {new ItemStack(Item.seeds, 1), new ItemStack(Item.dyePowder, 1, 3)});

	}

	public static void Smelting(){
		
		GameRegistry.addSmelting(BlockHelper.SilverOre.blockID, new ItemStack(ItemHelper.SilverIngot, 1), 0);
		GameRegistry.addSmelting(BlockHelper.TinOre.blockID, new ItemStack(ItemHelper.TinIngot, 1), 0);
		GameRegistry.addSmelting(BlockHelper.CopperOre.blockID, new ItemStack(ItemHelper.CopperIngot, 1), 0);
		GameRegistry.addSmelting(Item.rottenFlesh.itemID, new ItemStack(Item.leather, 1), 0);
		GameRegistry.addSmelting(BlockHelper.Iron.blockID, new ItemStack(Item.ingotIron, 1), 0);
		GameRegistry.addSmelting(BlockHelper.FlylightLog.blockID, new ItemStack(Item.coal, 1), 0);
	}

}
