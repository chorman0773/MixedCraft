package com.MixedCraft.items.tools;

import com.MixedCraft.MixedCraft;

public class ToolSword extends SwordBase {

	public ToolSword(ToolMaterial par3enum, String par2) {
		super(par3enum);
        registerTexture(par2);
        setUnlocalizedName(par2);
        setCreativeTab(MixedCraft.ToolTab);
	}
}
