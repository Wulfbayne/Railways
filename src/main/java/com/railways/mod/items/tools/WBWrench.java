package com.railways.mod.items.tools;

import com.railways.mod.RWGlobal;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class WBWrench extends ItemPickaxe {

	public WBWrench(String unlocalizedname,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);

	}

}
