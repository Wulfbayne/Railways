package com.railways.mod.items;

import com.railways.mod.RWGlobal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RWItem extends Item {

	public RWItem(String name){
		super();
		
		this.setUnlocalizedName(name);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
	}
	
}
