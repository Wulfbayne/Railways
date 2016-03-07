package com.railways.mod.items.tools;

import com.railways.mod.RWGlobal;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class WBBeyronSword extends ItemSword {

	public WBBeyronSword (String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(RWGlobal.wbCreativeTab);
	}

	
}
