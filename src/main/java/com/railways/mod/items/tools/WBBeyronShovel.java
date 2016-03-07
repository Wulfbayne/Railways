package com.railways.mod.items.tools;

import net.minecraft.item.Item.ToolMaterial;

import com.railways.mod.RWGlobal;

import net.minecraft.item.ItemSpade;

public class WBBeyronShovel extends ItemSpade {

	public WBBeyronShovel (String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
	}

	
}
