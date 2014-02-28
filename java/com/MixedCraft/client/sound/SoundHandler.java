package com.MixedCraft.client.sound;

import java.util.logging.Level;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoundHandler{ //TODO Make pet

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void addSounds(SoundLoadEvent event){
		for(String sound : Sound.files){
			//event.manager.addSound(sound);
		}
	}
}
