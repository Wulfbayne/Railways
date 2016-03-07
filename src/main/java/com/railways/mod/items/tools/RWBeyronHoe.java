package com.railways.mod.items.tools;

import com.railways.mod.RWGlobal;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class RWBeyronHoe extends ItemHoe {

	public RWBeyronHoe (String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
	}

	
}
