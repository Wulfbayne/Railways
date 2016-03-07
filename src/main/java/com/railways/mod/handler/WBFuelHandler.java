package com.railways.mod.handler;

import com.railways.mod.items.WBItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class WBFuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == WBItems.FuelCore)return 4000;
		if (fuel.getItem() == WBItems.IncendiusGel) return 2000;
		return 0;
	}
	
	

}
