package com.railways.mod.handler;

import com.railways.mod.items.RWItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class RWFuelHandler implements IFuelHandler {

	
	
	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == RWItems.FuelCore)return 4000;
		if (fuel.getItem() == RWItems.IncendiusGel) return 2000;
		return 0;
	}
	
	

}
