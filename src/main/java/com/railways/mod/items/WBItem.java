package com.railways.mod.items;

import com.railways.mod.RWGlobal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WBItem extends Item {

	public WBItem(String name){
		super();
		
		this.setUnlocalizedName(name);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
	}
	
}
