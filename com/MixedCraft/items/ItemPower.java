package com.MixedCraft.items;

import com.MixedCraft.MixedCraft;
import com.MixedCraft.helper.ItemsBase;

public class ItemPower extends ItemsBase{

	public ItemPower(String texture, int power) {
		super(texture);
		setCreativeTab(MixedCraft.MiscTab);
		setMaxDamage(power);
		maxStackSize = 1;
	}
}
