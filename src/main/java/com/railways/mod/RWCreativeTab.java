package com.railways.mod;

import com.railways.mod.blocks.WBBlocks;
import com.railways.mod.items.WBItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RWCreativeTab extends CreativeTabs {

	public RWCreativeTab(String string) {
		super(string);				
	}

	public Item getTabIconItem(){		
		return WBItems.FuelCore;
	}
	
}
