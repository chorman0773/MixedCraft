package com.MixedCraft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityDroid extends Entity{

	private double StartY, TargetY;

	private float coreRotation, panelRotation, helmetPostionRotation;
	private float panelOuterRotation =  - (float)Math.PI / 2;
	private float r, g, b;

	public EntityDroid(World world) {
		super(world);

		r = world.rand.nextFloat();
		g = world.rand.nextFloat();
		b = world.rand.nextFloat();
	}

	public EntityDroid(World world, double x, double y, double z){
		this(world);

		posX = x;
		StartY = posY = y;
		posZ = z;
	}

	@Override
	protected void entityInit() {
		dataWatcher.addObject(20, (byte)0);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbt) {
		StartY = nbt.getShort("Start");
		TargetY = nbt.getShort("Target");
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbt) {
		nbt.setShort("Start", (short)StartY);
		nbt.setShort("Target", (short)TargetY);
	}

	@Override
	public void onUpdate() {		
		super.onUpdate();

		if(!worldObj.isRemote){
			if(TargetY == 0 || Math.abs(posY - TargetY) < 0.25){
				TargetY = StartY + worldObj.rand.nextDouble() * 5;
			}

			if(posY < TargetY){
				motionY = 0.05;
			}else{
				motionY = -0.05;
			}

			boolean light = worldObj.getBlockLightValue((int)posX, (int)posY, (int)posZ) == 15;
			dataWatcher.updateObject(20, light ? (byte)1 : (byte)0);
		}else{
			coreRotation += 0.08F;
			helmetPostionRotation += 0.04F;

			if(dataWatcher.getWatchableObjectByte(20) != 0){
				float openInnerRotation = (float)Math.PI / 2;
				panelRotation = Math.min(openInnerRotation, panelRotation + 0.02F);
				
				if(panelRotation == openInnerRotation){
					panelOuterRotation = Math.min(0, panelOuterRotation + 0.02F);
				}
				
			}else{
				float closedOuterRotation = -(float)Math.PI / 2;
				panelOuterRotation = Math.max(closedOuterRotation, panelOuterRotation - 0.02F);
				
				if(panelOuterRotation == closedOuterRotation){
					panelRotation = Math.max(0, panelRotation - 0.02F);
				}
			}
		}
		//setPosition(posX + motionX, posY + motionY, posZ + motionZ);
	}

	public float getCoreRotation() {
		return coreRotation;
	}

	public float getPanelRotation() {
		return panelRotation;
	}

	public float getOuterPanelRotation() {
		return panelOuterRotation;
	}

	public float getHelmetPosition() {
		return -6 - Math.abs((float)Math.sin(helmetPostionRotation)) * 5.5F;
	}

	public float getRedColour() {
		return r;
	}

	public float getGreenColour() {
		return g;
	}

	public float getBlueColour() {
		return b;
	}
}