package com.railways.mod.items.tools;

import com.railways.mod.RWGlobal;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class WBBeyronHoe extends ItemHoe {

	public WBBeyronHoe (String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(RWGlobal.wbCreativeTab);
	}

	
}
