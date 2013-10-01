package com.MixedCraft.recipes;

import net.minecraft.block.Block;
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

        RecipeRemover.removeRecipes(Item.bow);
	}

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
	}

	public static void BigShapelessCrafting(){
		
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(ItemHelper.CopperIngot, 9), new Object[] {BlockHelper.CopperBlock});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(ItemHelper.SilverIngot, 9), new Object[] {BlockHelper.SilverBlock});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(ItemHelper.TinIngot, 9), new Object[] {BlockHelper.TinBlock});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(ItemHelper.SilverShickaxe, 1), new Object[] {ItemHelper.SilverAxe, ItemHelper.SilverHoe, ItemHelper.SilverPickaxe, ItemHelper.SilverShovel, ItemHelper.SilverSword ,Block.blockDiamond});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(BlockHelper.Test, 32), new Object[] {Item.diamond});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(Item.diamond, 9), new Object[] {Block.blockDiamond});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(Item.ingotIron, 9), new Object[] {Block.blockIron});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(Item.ingotGold, 9), new Object[] {Block.blockGold});
		CraftingBigManager.getInstance().addShapelessRecipe(new ItemStack(Item.emerald, 9), new Object[] {Block.blockEmerald});

	}

	public static void Shapeless(){
		
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

	}

}
