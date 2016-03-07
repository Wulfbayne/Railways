package com.railways.mod.items.tools;

import com.railways.mod.RWGlobal;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class RWBeyronSword extends ItemSword {

	public RWBeyronSword (String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
	}

	
}
