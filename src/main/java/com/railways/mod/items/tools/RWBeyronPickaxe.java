package com.railways.mod.items.tools;

import net.minecraft.item.Item.ToolMaterial;

import com.railways.mod.RWGlobal;

import net.minecraft.item.ItemPickaxe;

public class RWBeyronPickaxe extends ItemPickaxe {
	
	public RWBeyronPickaxe (String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
	}

}
