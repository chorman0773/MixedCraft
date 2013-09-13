package com.MixedCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemReed;
import net.minecraftforge.common.EnumHelper;

import com.MixedCraft.armor.*;
import com.MixedCraft.helper.*;
import com.MixedCraft.items.*;
import com.MixedCraft.items.DNA.spawner.*;
import com.MixedCraft.items.tools.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHelper {

	public static ConfigHelper x; 
	
	static int HEAD = 0;
	static int BODY = 1;
	static int LEGS = 2;
	static int BOOTS = 3;
	
	public static EnumToolMaterial Silver = EnumHelper.addToolMaterial("Silver", 4, 1000, 11.0F, 7, 16);
    public static EnumToolMaterial SilverShick = EnumHelper.addToolMaterial("SilverShick", 5, -1, 150.0F, 22, 20);
	public static EnumToolMaterial Flame = EnumHelper.addToolMaterial("Flame", 4, -1, 0.0F, 6, 16);
	public static EnumToolMaterial Iron = EnumHelper.addToolMaterial("Iron", 4, -1, 0.2F, 4, 16);
	public static EnumToolMaterial Diamond = EnumHelper.addToolMaterial("Diamond", 4, -1, 0.2F, 7, 16);
	public static EnumToolMaterial Gold = EnumHelper.addToolMaterial("Gold", 4, -1, 0.2F, 4, 16);
	public static EnumToolMaterial Wood = EnumHelper.addToolMaterial("Wood", 0, -1, 0.1F, 0, 5);
	public static EnumToolMaterial Stone = EnumHelper.addToolMaterial("Stone", 4, -1, 0.2F, 2, 16);

	static EnumArmorMaterial SuperArmor = EnumHelper.addArmorMaterial("Super", -1, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial FlameArmor = EnumHelper.addArmorMaterial("Fire", -1, new int[]{3, 8, 6, 3}, 10);

	public static final Item FlashDrive = new ItemsBase(x.FlashDriveID).registerTextures("FlashDrive").setUnlocalizedName("FD").setCreativeTab(MixedCraft.MiscTab);
	public static final Item FailDrive = new ItemDNABase(x.FailDriveID, 0).setDescriptors(DNAKeys.Failed).registerTextures("FailDrive").setUnlocalizedName("FAD").setCreativeTab(MixedCraft.MiscTab);
	
	public static final Item CowDNADrive = new ItemDNABase(x.CowDNADriveID, 2).setDescriptors(DNAKeys.Cow).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item PigDNADrive = new ItemDNABase(x.PigDNADriveID, 3).setDescriptors(DNAKeys.Pig).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item SheepDNADrive = new ItemDNABase(x.SheepDNADriveID, 9).setDescriptors(DNAKeys.Sheep).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item ChickenDNADrive = new ItemDNABase(x.ChickenDNADriveID, 5).setDescriptors(DNAKeys.Chicken).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item CreeperDNADrive = new ItemDNABase(x.CreeperDNADriveID, 6).setDescriptors(DNAKeys.Creeper).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item EndermanDNADrive = new ItemDNABase(x.EndermanDNADriveID, 7).setDescriptors(DNAKeys.Enderman).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item ZombieDNADrive = new ItemDNABase(x.ZombieDNADriveID, 16).setDescriptors(DNAKeys.Zombie).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item SkeletonDNADrive = new ItemDNABase(x.SkeletonDNADriveID, 10).setDescriptors(DNAKeys.Skeleton).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item GhastDNADrive = new ItemDNABase(x.GhastDNADriveID, 8).setDescriptors(DNAKeys.Ghast).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item SpiderDNADrive = new ItemDNABase(x.SpiderDNADriveID, 12).setDescriptors(DNAKeys.Spider).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item SlimeDNADrive = new ItemDNABase(x.SlimeDNADriveID, 11).setDescriptors(DNAKeys.Slime).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item SquidDNADrive = new ItemDNABase(x.SquidDNADriveID, 13).setDescriptors(DNAKeys.Squid).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item BlazeDNADrive = new ItemDNABase(x.BlazeDNADriveID, 4).setDescriptors(DNAKeys.Blaze).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item WitherSDNADrive = new ItemDNABase(x.WitherSDNADriveID, 15).setDescriptors(DNAKeys.WitherS).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	public static final Item WitherDNADrive = new ItemDNABase(x.WitherDNADriveID, 14).setDescriptors(DNAKeys.Wither).registerTextures("DNAKey").setUnlocalizedName("DNA").setCreativeTab(MixedCraft.DNATab);
	
	public static final Item CowPigMixedDrive = new ItemMixedBase(x.CowPigMixedDriveID).setDescription(DNAKeys.CowPig).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSheepMixedDrive = new ItemMixedBase(x.CowSheepMixedDriveID).setDescription(DNAKeys.CowSheep).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowChickenMixedDrive = new ItemMixedBase(x.CowChickenMixedDriveID).setDescription(DNAKeys.CowChicken).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowCreeperMixedDrive = new ItemMixedBase(x.CowCreeperMixedDriveID).setDescription(DNAKeys.CowCreeper).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowEndermanMixedDrive = new ItemMixedBase(x.CowEndermanMixedDriveID).setDescription(DNAKeys.CowEnderman).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowZombieMixedDrive = new ItemMixedBase(x.CowZombieMixedDriveID).setDescription(DNAKeys.CowZombie).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSlimeMixedDrive = new ItemMixedBase(x.CowSlimeMixedDriveID).setDescription(DNAKeys.CowSlime).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowBlazeMixedDrive = new ItemMixedBase(x.CowBlazeMixedDriveID).setDescription(DNAKeys.CowBlaze).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSpiderMixedDrive = new ItemMixedBase(x.CowSpiderMixedDriveID).setDescription(DNAKeys.CowSpider).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowGhastMixedDrive = new ItemMixedBase(x.CowGhastMixedDriveID).setDescription(DNAKeys.CowGhast).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowMagmaCubeMixedDrive = new ItemMixedBase(x.CowMagmaCubeMixedDriveID).setDescription(DNAKeys.CowMagmaCube).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSkeletonMixedDrive = new ItemMixedBase(x.CowSkeletonMixedDriveID).setDescription(DNAKeys.CowSkeleton).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowSquidMixedDrive = new ItemMixedBase(x.CowSquidMixedDriveID).setDescription(DNAKeys.CowSquid).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowWitherMixedDrive = new ItemMixedBase(x.CowWitherMixedDriveID).setDescription(DNAKeys.CowWither).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item CowWitherSMixedDrive = new ItemMixedBase(x.CowWitherSMixedDriveID).setDescription(DNAKeys.CowWitherS).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);

	public static final Item PigSheepMixedDrive = new ItemMixedBase(x.PigSheepMixedDriveID).setDescription(DNAKeys.PigSheep).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigChickenMixedDrive = new ItemMixedBase(x.PigChickenMixedDriveID).setDescription(DNAKeys.PigChicken).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigCreeperMixedDrive = new ItemMixedBase(x.PigCreeperMixedDriveID).setDescription(DNAKeys.PigCreeper).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigEndermanMixedDrive = new ItemMixedBase(x.PigEndermanMixedDriveID).setDescription(DNAKeys.PigEnderman).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigZombieMixedDrive = new ItemMixedBase(x.PigZombieMixedDriveID).setDescription(DNAKeys.PigZombie).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSlimeMixedDrive = new ItemMixedBase(x.PigSlimeMixedDriveID).setDescription(DNAKeys.PigSlime).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigBlazeMixedDrive = new ItemMixedBase(x.PigBlazeMixedDriveID).setDescription(DNAKeys.PigBlaze).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSpiderMixedDrive = new ItemMixedBase(x.PigSpiderMixedDriveID).setDescription(DNAKeys.PigSpider).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigGhastMixedDrive = new ItemMixedBase(x.PigGhastMixedDriveID).setDescription(DNAKeys.PigGhast).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigMagmaCubeMixedDrive = new ItemMixedBase(x.PigMagmaCubeMixedDriveID).setDescription(DNAKeys.PigMagmaCube).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSkeletonMixedDrive = new ItemMixedBase(x.PigSkeletonMixedDriveID).setDescription(DNAKeys.PigSkeleton).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigSquidMixedDrive = new ItemMixedBase(x.PigSquidMixedDriveID).setDescription(DNAKeys.PigSquid).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigWitherMixedDrive = new ItemMixedBase(x.PigWitherMixedDriveID).setDescription(DNAKeys.PigWither).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);
	public static final Item PigWitherSMixedDrive = new ItemMixedBase(x.PigWitherSMixedDriveID).setDescription(DNAKeys.PigWitherS).registerTextures("MixedDNAKey").setUnlocalizedName("MixedDNA").setCreativeTab(MixedCraft.MixedDNATab);

	
	public static final Item CowPigSpawner = new ItemCowPigSpawner(x.CowPigSpawnerID).registerTextures("CowPigSpawner").setUnlocalizedName("CowPigSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowSheepSpawner = new ItemCowSheepPlacer(x.CowSheepSpawnerID).registerTextures("CowSheepSpawner").setUnlocalizedName("CowSheepSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowChickenSpawner = new ItemCowChickenSpawner(x.CowChickenSpawnerID).registerTextures("CowChickenSpawner").setUnlocalizedName("CowChickenSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowCreeperSpawner = new ItemCreeperPlacer(x.CowCreeperSpawnerID).registerTextures("CowCreeperSpawner").setUnlocalizedName("CowCreeperSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowEndermanSpawner = new ItemCowEndermanPlacer(x.CowEndermanSpawnerID).registerTextures("CowEndermanSpawner").setUnlocalizedName("CowEndermanSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	public static final Item CowZombieSpawner = new ItemCowZombiePlacer(x.CowZombieSpawnerID).registerTextures("CowZombieSpawner").setUnlocalizedName("CowZombieSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	
	//TODO: Put mobs in!
	//public static final Item CowSlimeSpawner = new ItemCowSlimePlacer(x.CowSlimeSpawnerID).registerTextures("CowSlimeSpawner").setUnlocalizedName("CowSlimeSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowBlazeSpawner = new ItemCowBlazePlacer(x.CowBlazeSpawnerID).registerTextures("CowBlazeSpawner").setUnlocalizedName("CowBlazeSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowSpiderSpawner = new ItemCowSpiderPlacer(x.CowSpiderSpawnerID).registerTextures("CowSpiderSpawner").setUnlocalizedName("CowSpiderSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowGhastSpawner = new ItemCowGhastPlacer(x.CowGhastSpawnerID).registerTextures("CowGhastSpawner").setUnlocalizedName("CowGhastSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowMagmaCubeSpawner = new ItemCowMagmaCubePlacer(x.CowMagmaCubeSpawnerID).registerTextures("CowMagmaCubeSpawner").setUnlocalizedName("CowMagmaCubeSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowSkeletonSpawner = new ItemCowSkeletonPlacer(x.CowSkeletonSpawnerID).registerTextures("CowSkeletonSpawner").setUnlocalizedName("CowSkeletonSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowSquidSpawner = new ItemCowSquidPlacer(x.CowSquidSpawnerID).registerTextures("CowSquidSpawner").setUnlocalizedName("CowSquidSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowWitherSpawner = new ItemCowWitherPlacer(x.CowWitherSpawnerID).registerTextures("CowWitherSpawner").setUnlocalizedName("CowWitherSpawn").setCreativeTab(MixedCraft.SpawnerTab);
	//public static final Item CowWitherSSpawner = new ItemCowWitherSPlacer(x.CowWitherSSpawnerID).registerTextures("CowWitherSSpawner").setUnlocalizedName("CowWitherSSpawn").setCreativeTab(MixedCraft.SpawnerTab);

	public static final Item CopperIngot = new ItemsBase(x.CopperIngotID).registerTextures("CopperIngot").setUnlocalizedName("CopperIngot").setCreativeTab(MixedCraft.MiscTab);
	public static final Item TinIngot = new ItemsBase(x.TinIngotID).registerTextures("TinIngot").setUnlocalizedName("TinIngot").setCreativeTab(MixedCraft.MiscTab);
	public static final Item SilverIngot = new ItemsBase(x.SilverIngotID).registerTextures("SilverIngot").setUnlocalizedName("SilverIngot").setCreativeTab(MixedCraft.MiscTab);
	public static final Item GoldHandsaw = new ItemsBase(x.GoldHandsawID).registerTextures("GoldHandsaw").setUnlocalizedName("GoldHandsaw").setCreativeTab(MixedCraft.MiscTab);
	public static final Item DiamondHandsaw = new ItemsBase(x.DiamondHandsawID).registerTextures("DiamondHandsaw").setUnlocalizedName("DiamondHandsaw").setCreativeTab(MixedCraft.MiscTab);

	public static final Item SilverSword = new ToolSword(x.SilverSwordID, Silver).registerTexture("SilverSword").setUnlocalizedName("SilverSword").setCreativeTab(MixedCraft.ToolTab);
	public static final Item SilverHoe = new ToolHoe(x.SilverHoeID, Silver).registerItemTexture("SilverHoe").setUnlocalizedName("SilverHoe").setCreativeTab(MixedCraft.ToolTab);
	public static final Item SilverShovel = new ToolShovel(x.SilverShovelID, Silver).registerItemTexture("SilverShovel").setUnlocalizedName("SilverShovel").setCreativeTab(MixedCraft.ToolTab);
	public static final Item SilverPickaxe = new ToolPickaxe(x.SilverPickaxeID, Silver).registerItemTexture("SilverPickaxe").setUnlocalizedName("SilverPickaxe").setCreativeTab(MixedCraft.ToolTab);
	public static final Item SilverAxe = new ToolAxe(x.SilverAxeID, Silver).registerItemTexture("SilverAxe").setUnlocalizedName("SilverAxe").setCreativeTab(MixedCraft.ToolTab);
	public static final Item SilverShickaxe = new ToolShickaxe(x.SilverShickaxeID, SilverShick).registerShickaxeTextures("SilverShickaxe").setUnlocalizedName("SilverShickaxe").setCreativeTab(MixedCraft.ToolTab);
	public static final Item DiamondBigSword = new ItemBigSword(x.DiamondBigSwordID, Diamond).registerTexture("DiamondBigSword").setUnlocalizedName("DiamondBigSword").setCreativeTab(MixedCraft.ToolTab);
	public static final Item IronBigSword = new ItemBigSword(x.IronBigSwordID, Iron).registerTexture("IronBigSword").setUnlocalizedName("IronBigSword").setCreativeTab(MixedCraft.ToolTab);
	public static final Item GoldBigSword = new ItemBigSword(x.GoldBigSwordID, Gold).registerTexture("GoldenBigSword").setUnlocalizedName("GoldBigSword").setCreativeTab(MixedCraft.ToolTab);
	public static final Item WoodBigSword = new ItemBigSword(x.WoodBigSwordID, Wood).registerTexture("WoodenBigSword").setUnlocalizedName("WoodBigSword").setCreativeTab(MixedCraft.ToolTab);
	public static final Item StoneBigSword = new ItemBigSword(x.StoneBigSwordID, Stone).registerTexture("StoneBigSword").setUnlocalizedName("StoneBigSword").setCreativeTab(MixedCraft.ToolTab);

	public static final Item LightningBow = new LightningBow(x.LightningBowID).setUnlocalizedName("LightningBow").setCreativeTab(MixedCraft.ToolTab);
	public static final Item LightningArrow = new ModItem(x.LightningArrowID).registerTextures("LightningArrow").setUnlocalizedName("LightningArrow").setCreativeTab(MixedCraft.MiscTab);
	public static final Item GoldDoor = new ItemGoldDoor(x.GoldDoorItemID, Material.wood).registerTextures("GoldDoor").setUnlocalizedName("GoldDoor").setCreativeTab(MixedCraft.BlockTab);

	public static final Item TNTBow = new ItemTNTBow(x.TNTBowID).setUnlocalizedName("TNTBow").setCreativeTab(MixedCraft.ToolTab);
	public static final Item TNTArrow = new ModItem(x.TNTArrowID).registerTextures("TNTArrow").setUnlocalizedName("TNTArrow").setCreativeTab(MixedCraft.MiscTab);

	public static final Item ChocalateCake = new ItemReed(x.ChocolateCakeID, BlockHelper.ChocolateCake).setUnlocalizedName("ChocolateCake").func_111206_d("MixedCraft:ChocolateCake").setCreativeTab(MixedCraft.BlockTab);
	public static final Item LightningRod = new ItemLightningRod(x.LightningRodID).registerTextures("LightningRod").setUnlocalizedName("LightningRod").setCreativeTab(MixedCraft.ToolTab);
	public static final Item FlameSword = new ItemFlameSword(x.FlameSwordID, Flame).registerTexture("FlameSword").setUnlocalizedName("FlameSword");

    public static final Item ChocolateBean = new ItemModSeeds(x.ChocolateBeanID, BlockHelper.ChocolateCrop.blockID, Block.tilledField.blockID).registerTextures("ChocolateBean").setUnlocalizedName("ChocolateBean");

    public static final Item SuperHelmet = new ItemSuperArmor(4235, SuperArmor, 0, HEAD).setCreativeTab(MixedCraft.MiscTab).setUnlocalizedName("SuperHelmet");
	public static final Item SuperBody = new ItemSuperArmor(4236, SuperArmor, 1, BODY).setCreativeTab(MixedCraft.MiscTab).setUnlocalizedName("SuperBody");
	public static final Item SuperLegs = new ItemSuperArmor(4237, SuperArmor, 2, LEGS).setCreativeTab(MixedCraft.MiscTab).setUnlocalizedName("SuperLegs");
	public static final Item SuperBoots = new ItemSuperArmor(4238, SuperArmor, 3, BOOTS).setCreativeTab(MixedCraft.MiscTab).setUnlocalizedName("SuperBoots");
    
    public static final Item FlameHelmet = new ItemFlameArmor(4239, FlameArmor, 0, HEAD).setCreativeTab(MixedCraft.MiscTab).setUnlocalizedName("FlameHelmet");
	public static final Item FlameBody = new ItemFlameArmor(4240, FlameArmor, 1, BODY).setCreativeTab(MixedCraft.MiscTab).setUnlocalizedName("FlameBody");
	public static final Item FlameLegs = new ItemFlameArmor(4241, FlameArmor, 2, LEGS).setCreativeTab(MixedCraft.MiscTab).setUnlocalizedName("FlameLegs");
	public static final Item FlameBoots = new ItemFlameArmor(4242, FlameArmor, 3, BOOTS).setCreativeTab(MixedCraft.MiscTab).setUnlocalizedName("FlameBoots");
    
	public static final Item Droid = new ItemDroid(4243);
	
	public static final Item mobShooter = new ItemMobShooter(4244);
	
	//TODO Every drive for every mob!
	
	//TODO Mobs: Blaze, Spider, Creeper, Enderman, Ghast, MagmaCube, Skeleton, Slime, Zombie, Chicken, Cow, Pig, Squid, Sheep, WitherSkeleton, Wither.
	
	//TODO DONE: 
	//Cow: DONE
	//Blaze: 
	//Spider: 
	//Creeper:
	//Enderman:
	//Ghast:
	//MagmaCube:
	//Skeleton:
	//Slime:
	//Zombie:
	//Chicken:
	//Pig:
	//Squid:
	//WitherSkeleton:
	//Wither:

	
	public static void addNames(){
		addName("ChocolateCake", "Chocolate Cake");
		
		addName("LightningRod", "Lightning Rod");
		addName("IronBigSword", "Iron Big Sword");
		addName("GoldBigSword", "Gold Big Sword");
		addName("StoneBigSword", "Stone Big Sword");
		addName("WoodBigSword", "Wood Big Sword");
		addName("FlameSword", "Flame Sword");
		addName("ChocolateBean", "Chocolate Bean");
		addName("DiamondBigSword", "Diamond Big Sword");
		GameRegistry.registerItem(ChocalateCake, "ChocolateCake");
		addName("SilverShickaxe", "Silver Shickaxe");
		addName("TNTBow", "TNT Bow");
		addName("TNTArrow", "TNT Arrow");
		addName("GoldDoor", "Gold Door");
		addName("LightningArrow", "Lightning Arrow");
		addName("LightningBow", "Lightning Bow");
		
		addName("FD", "DNA Key");
		addName("FAD", "Failed DNA Key");
		addName("TinIngot", "Tin Ingot");
		addName("CopperIngot", "Copper Ingot");
		addName("SilverIngot", "Silver Ingot");

		addName("DNA", "DNA Key");
		addName("MixedDNA", "Mixed DNA Key");

		addName("DiamondHandsaw", "Diamond Handsaw");
		addName("GoldHandsaw", "Gold Handsaw");
		
		addName("CowCreeperSpawn", "Spawn COWCREEPER");
		addName("CowPigSpawn", "Spawn COWPIG");
		addName("CowSheepSpawn", "Spawn COWSHEEP");
		addName("CowChickenSpawn", "Spawn COWCHICKEN");
		addName("CowEndermanSpawn", "Spawn COWENDERMAN");
		addName("CowZombieSpawn", "Spawn COWZOMBIE");

		addName("SilverSword", "Silver Sword");
		addName("SilverHoe", "Silver Hoe");
		addName("SilverShovel", "Silver Shovel");
		addName("SilverPickaxe", "Silver Pickaxe");
		addName("SilverAxe", "Silver Axe");

	}
	
	
	public static void addName(String par1, String name)
	{
		LanguageRegistry.instance().addStringLocalization("item." + par1 + ".name", name);
	}
	
}
