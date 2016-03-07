package com.railways.mod.items.tools;

import com.railways.mod.RWGlobal;

import net.minecraft.item.ItemAxe;

public class RWBeyronAxe extends ItemAxe {

	public RWBeyronAxe (String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
	}
	
}
