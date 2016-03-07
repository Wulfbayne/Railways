package com.railways.mod.items.tools;

import com.railways.mod.RWGlobal;

import net.minecraft.item.ItemAxe;

public class WBBeyronAxe extends ItemAxe {

	public WBBeyronAxe (String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(RWGlobal.wbCreativeTab);
	}
	
}
