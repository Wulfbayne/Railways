package com.railways.mod.handler;

import com.railways.mod.items.RWItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.oredict.OreDictionary;

public class RWFuelHandler implements IFuelHandler {
	
	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == RWItems.FuelCore)return 6000;
		if (fuel.getItem() == RWItems.IncendiusGel) return 3000;
		return 0;
	}
	
	

}
