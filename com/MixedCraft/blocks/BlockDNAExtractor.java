package com.MixedCraft.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.MixedCraft.BlockHelper;
import com.MixedCraft.MixedCraft;
import com.MixedCraft.blocks.tileEntity.TileEntityDNAExtractor;
import com.MixedCraft.helper.ConfigHelper;
import com.MixedCraft.helper.ContainerBase;
import com.MixedCraft.helper.GuiHandler;

public class BlockDNAExtractor extends ContainerBase {

	private Random furnaceRand = new Random();
	
	private static int table = ConfigHelper.TableID;
	private static int extractor = ConfigHelper.ExtractorID;
	private static int copper = ConfigHelper.CopperBlockID;
	private static int tin = ConfigHelper.TinBlockID;
	private static int bench = ConfigHelper.CraftingID;
	
	private static boolean keepFurnaceInventory = false;

	public BlockDNAExtractor(int par1) {
		super(par1, Material.wood);
		registerTexture("DNAExtractor_Side", "DNAExtractor_Top" , "DNAExtractor_Bottom");
	}

	public TileEntity createNewTileEntity(World var1)
	{
		return new TileEntityDNAExtractor();
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{        
		if (world.isRemote && isMultiBlockStructure(world, x, y, z))
		{
			return true;
		}
		else
		{
			TileEntityDNAExtractor var10 = (TileEntityDNAExtractor)world.getBlockTileEntity(x, y, z);

			if (var10 != null)
			{
				par5EntityPlayer.openGui(MixedCraft.instance, GuiHandler.extractor, world, x, y, z);
			}

			return true;
		}
	}

	public static void updateFurnaceBlockState(boolean par0, World par1World, int par2, int par3, int par4)
	{
		int var5 = par1World.getBlockMetadata(par2, par3, par4);
		TileEntity var6 = par1World.getBlockTileEntity(par2, par3, par4);
		keepFurnaceInventory = true;

		if (par0)
		{
			par1World.setBlock(par2, par3, par4, BlockHelper.Extractor.blockID);
		}
		else
		{
			par1World.setBlock(par2, par3, par4, BlockHelper.Extractor.blockID);
		}

		keepFurnaceInventory = true;
		par1World.setBlockMetadataWithNotify(par2, par3, par4, var5, 2);

		if (var6 != null)
		{
			var6.validate();
			par1World.setBlockTileEntity(par2, par3, par4, var6);
		}
	}

	public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
	{
		if (!keepFurnaceInventory)
		{
			TileEntityDNAExtractor var7 = (TileEntityDNAExtractor)par1World.getBlockTileEntity(par2, par3, par4);

			if (var7 != null)
			{
				for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
				{
					ItemStack var9 = var7.getStackInSlot(var8);

					if (var9 != null)
					{
						float var10 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
						float var11 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
						float var12 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;

						while (var9.stackSize > 0)
						{
							int var13 = this.furnaceRand.nextInt(21) + 10;

							if (var13 > var9.stackSize)
							{
								var13 = var9.stackSize;
							}

							var9.stackSize -= var13;
							EntityItem var14 = new EntityItem(par1World, (double)((float)par2 + var10), (double)((float)par3 + var11), (double)((float)par4 + var12), new ItemStack(var9.itemID, var13, var9.getItemDamage()));

							if (var9.hasTagCompound())
							{
								var14.getEntityItem().setTagCompound((NBTTagCompound)var9.getTagCompound().copy());
							}

							float var15 = 0.05F;
							var14.motionX = (double)((float)this.furnaceRand.nextGaussian() * var15);
							var14.motionY = (double)((float)this.furnaceRand.nextGaussian() * var15 + 0.2F);
							var14.motionZ = (double)((float)this.furnaceRand.nextGaussian() * var15);
							par1World.spawnEntityInWorld(var14);
						}
					}
				}
			}
		}

		super.breakBlock(par1World, par2, par3, par4, par5, par6);
	}
	
	public boolean isMultiBlockStructure(World world, int x, int y, int z) {
		if (checkNorth(world, x, y, z))/* North */
			return true;
		if (checkEast(world, x, y, z))/* East */
			return true;
		if (checkSouth(world, x, y, z))/* South */
			return true;
		if (checkWest(world, x, y, z))/* West */
			return true;
		return false;
	}

	private static boolean checkNorth(World world, int x, int y, int z) {
		if (world.getBlockId(x + -1, y + -1, z + 1) == tin) {
			if (world.getBlockId(x + -1, y + -1, z + 0) == bench) {
				if (world.getBlockId(x + -1, y + -1, z + -1) == tin) {
					if (world.getBlockId(x + -1, y + 0, z + 1) == 1) {
						if (world.getBlockId(x + -1, y + 0, z + -1) == 1) {
							if (world.getBlockId(x + -1, y + 1, z + 1) == 1) {
								if (world.getBlockId(x + -1, y + 1, z + 0) == 1) {
									if (world.getBlockId(x + -1, y + 1, z + -1) == 1) {
										if (world.getBlockId(x + 0, y + -1,
												z + 1) == table) {
											if (world.getBlockId(x + 0, y + -1,
													z + 0) == 41) {
												if (world.getBlockId(x + 0, y
														+ -1, z + -1) == bench) {
													if (world.getBlockId(x + 0,
															y + 1, z + 1) == 1) {
														if (world.getBlockId(
																x + 0, y + 1,
																z + 0) == 89) {
															if (world
																	.getBlockId(
																			x + 0,
																			y + 1,
																			z
																					+ -1) == 1) {
																if (world
																		.getBlockId(
																				x + 1,
																				y
																						+ -1,
																				z + 1) == copper) {
																	if (world
																			.getBlockId(
																					x + 1,
																					y
																							+ -1,
																					z + 0) == bench) {
																		if (world
																				.getBlockId(
																						x + 1,
																						y
																								+ -1,
																						z
																								+ -1) == copper) {
																			if (world
																					.getBlockId(
																							x + 1,
																							y + 0,
																							z + 1) == 1) {
																				if (world
																						.getBlockId(
																								x + 1,
																								y + 0,
																								z
																										+ -1) == 1) {
																					if (world
																							.getBlockId(
																									x + 1,
																									y + 1,
																									z + 1) == 1) {
																						if (world
																								.getBlockId(
																										x + 1,
																										y + 1,
																										z + 0) == 1) {
																							if (world
																									.getBlockId(
																											x + 1,
																											y + 1,
																											z
																													+ -1) == 0) {
																								return true;
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkEast(World world, int x, int y, int z) {
		if (world.getBlockId(x + -1, y + -1, z + -1) == tin) {
			if (world.getBlockId(x + 0, y + -1, z + -1) == bench) {
				if (world.getBlockId(x + 1, y + -1, z + -1) == tin) {
					if (world.getBlockId(x + -1, y + 0, z + -1) == 1) {
						if (world.getBlockId(x + 1, y + 0, z + -1) == 1) {
							if (world.getBlockId(x + -1, y + 1, z + -1) == 1) {
								if (world.getBlockId(x + 0, y + 1, z + -1) == 1) {
									if (world.getBlockId(x + 1, y + 1, z + -1) == 1) {
										if (world.getBlockId(x + -1, y + -1,
												z + 0) == table) {
											if (world.getBlockId(x + 0, y + -1,
													z + 0) == 41) {
												if (world.getBlockId(x + 1, y
														+ -1, z + 0) == bench) {
													if (world.getBlockId(
															x + -1, y + 1,
															z + 0) == 1) {
														if (world.getBlockId(
																x + 0, y + 1,
																z + 0) == 89) {
															if (world
																	.getBlockId(
																			x + 1,
																			y + 1,
																			z + 0) == 1) {
																if (world
																		.getBlockId(
																				x
																						+ -1,
																				y
																						+ -1,
																				z + 1) == copper) {
																	if (world
																			.getBlockId(
																					x + 0,
																					y
																							+ -1,
																					z + 1) == bench) {
																		if (world
																				.getBlockId(
																						x + 1,
																						y
																								+ -1,
																						z + 1) == copper) {
																			if (world
																					.getBlockId(
																							x
																									+ -1,
																							y + 0,
																							z + 1) == 1) {
																				if (world
																						.getBlockId(
																								x + 1,
																								y + 0,
																								z + 1) == 1) {
																					if (world
																							.getBlockId(
																									x
																											+ -1,
																									y + 1,
																									z + 1) == 1) {
																						if (world
																								.getBlockId(
																										x + 0,
																										y + 1,
																										z + 1) == 1) {
																							if (world
																									.getBlockId(
																											x + 1,
																											y + 1,
																											z + 1) == 0) {
																								return true;
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkSouth(World world, int x, int y, int z) {
		if (world.getBlockId(x + 1, y + -1, z + -1) == tin) {
			if (world.getBlockId(x + 1, y + -1, z + 0) == bench) {
				if (world.getBlockId(x + 1, y + -1, z + 1) == tin) {
					if (world.getBlockId(x + 1, y + 0, z + -1) == 1) {
						if (world.getBlockId(x + 1, y + 0, z + 1) == 1) {
							if (world.getBlockId(x + 1, y + 1, z + -1) == 1) {
								if (world.getBlockId(x + 1, y + 1, z + 0) == 1) {
									if (world.getBlockId(x + 1, y + 1, z + 1) == 1) {
										if (world.getBlockId(x + 0, y + -1, z
												+ -1) == table) {
											if (world.getBlockId(x + 0, y + -1,
													z + 0) == 41) {
												if (world.getBlockId(x + 0, y
														+ -1, z + 1) == bench) {
													if (world.getBlockId(x + 0,
															y + 1, z + -1) == 1) {
														if (world.getBlockId(
																x + 0, y + 1,
																z + 0) == 89) {
															if (world
																	.getBlockId(
																			x + 0,
																			y + 1,
																			z + 1) == 1) {
																if (world
																		.getBlockId(
																				x
																						+ -1,
																				y
																						+ -1,
																				z
																						+ -1) == copper) {
																	if (world
																			.getBlockId(
																					x
																							+ -1,
																					y
																							+ -1,
																					z + 0) == bench) {
																		if (world
																				.getBlockId(
																						x
																								+ -1,
																						y
																								+ -1,
																						z + 1) == copper) {
																			if (world
																					.getBlockId(
																							x
																									+ -1,
																							y + 0,
																							z
																									+ -1) == 1) {
																				if (world
																						.getBlockId(
																								x
																										+ -1,
																								y + 0,
																								z + 1) == 1) {
																					if (world
																							.getBlockId(
																									x
																											+ -1,
																									y + 1,
																									z
																											+ -1) == 1) {
																						if (world
																								.getBlockId(
																										x
																												+ -1,
																										y + 1,
																										z + 0) == 1) {
																							if (world
																									.getBlockId(
																											x
																													+ -1,
																											y + 1,
																											z + 1) == 0) {
																								return true;
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkWest(World world, int x, int y, int z) {
		if (world.getBlockId(x + 1, y + -1, z + 1) == tin) {
			if (world.getBlockId(x + 0, y + -1, z + 1) == bench) {
				if (world.getBlockId(x + -1, y + -1, z + 1) == tin) {
					if (world.getBlockId(x + 1, y + 0, z + 1) == 1) {
						if (world.getBlockId(x + -1, y + 0, z + 1) == 1) {
							if (world.getBlockId(x + 1, y + 1, z + 1) == 1) {
								if (world.getBlockId(x + 0, y + 1, z + 1) == 1) {
									if (world.getBlockId(x + -1, y + 1, z + 1) == 1) {
										if (world.getBlockId(x + 1, y + -1,
												z + 0) == table) {
											if (world.getBlockId(x + 0, y + -1,
													z + 0) == 41) {
												if (world.getBlockId(x + -1, y
														+ -1, z + 0) == bench) {
													if (world.getBlockId(x + 1,
															y + 1, z + 0) == 1) {
														if (world.getBlockId(
																x + 0, y + 1,
																z + 0) == 89) {
															if (world
																	.getBlockId(
																			x
																					+ -1,
																			y + 1,
																			z + 0) == 1) {
																if (world
																		.getBlockId(
																				x + 1,
																				y
																						+ -1,
																				z
																						+ -1) == copper) {
																	if (world
																			.getBlockId(
																					x + 0,
																					y
																							+ -1,
																					z
																							+ -1) == bench) {
																		if (world
																				.getBlockId(
																						x
																								+ -1,
																						y
																								+ -1,
																						z
																								+ -1) == copper) {
																			if (world
																					.getBlockId(
																							x + 1,
																							y + 0,
																							z
																									+ -1) == 1) {
																				if (world
																						.getBlockId(
																								x
																										+ -1,
																								y + 0,
																								z
																										+ -1) == 1) {
																					if (world
																							.getBlockId(
																									x + 1,
																									y + 1,
																									z
																											+ -1) == 1) {
																						if (world
																								.getBlockId(
																										x + 0,
																										y + 1,
																										z
																												+ -1) == 1) {
																							if (world
																									.getBlockId(
																											x
																													+ -1,
																											y + 1,
																											z
																													+ -1) == 0) {
																								return true;
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
}