package com.MixedCraft.client.sound;

import java.util.logging.Level;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoundHandler{ //TODO Make pet

	@ForgeSubscribe
	@SideOnly(Side.CLIENT)
	public void addSounds(SoundLoadEvent event){
		for(String sound : Sound.files){
			event.manager.addSound(sound);
		}
	}
}
